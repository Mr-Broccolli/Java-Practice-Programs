package Matrix;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MatrixFX extends JPanel {

    private final int FONT_SIZE = 16;
    private final int WIDTH = 800;
    private final int HEIGHT = 500;

    private final String CHARS =
        "アイウエオカキクケコサシスセソ0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private int cols;
    private int rows;

    private char[][] matrix;
    private int[][] alpha;
    private int[] drops;
    private int[] speed;

    private Random rand = new Random();

    public MatrixFX() {
        JFrame frame = new JFrame("Matrix FX (BlueJ)");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);

        setBackground(Color.BLACK);
        setFont(new Font("Monospaced", Font.BOLD, FONT_SIZE));

        cols = WIDTH / FONT_SIZE;
        rows = HEIGHT / FONT_SIZE;

        matrix = new char[rows][cols];
        alpha = new int[rows][cols];
        drops = new int[cols];
        speed = new int[cols];

        for (int i = 0; i < cols; i++) {
            drops[i] = rand.nextInt(rows);
            speed[i] = 1 + rand.nextInt(3);
        }

        Timer timer = new Timer(50, e -> updateMatrix());
        timer.start();
    }

    private void updateMatrix() {
        // Fade existing characters
        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                if (alpha[y][x] > 0) {
                    alpha[y][x] -= 20;   // fade speed
                    if (alpha[y][x] <= 0) {
                        alpha[y][x] = 0;
                        matrix[y][x] = 0;
                    }
                }
            }
        }

        // Add new characters
        for (int x = 0; x < cols; x++) {
            int y = drops[x] % rows;

            matrix[y][x] = randomChar();
            alpha[y][x] = 255;

            drops[x] += speed[x];

            if (drops[x] > rows || rand.nextFloat() > 0.98f) {
                drops[x] = 0;
                speed[x] = 1 + rand.nextInt(3);
            }
        }

        repaint();
    }

    private char randomChar() {
        return CHARS.charAt(rand.nextInt(CHARS.length()));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {

                if (matrix[y][x] == 0) continue;

                int a = alpha[y][x];
                if (a < 0) a = 0;

                Color c = new Color(0, 255, 70, a);

                // bright head
                if (y == drops[x] % rows) {
                    c = Color.WHITE;
                }

                g2.setColor(c);
                g2.drawString(
                    String.valueOf(matrix[y][x]),
                    x * FONT_SIZE,
                    y * FONT_SIZE
                );
            }
        }
    }
}
