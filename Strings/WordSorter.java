package Strings;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class WordSorter extends JPanel {
    private final String CHARS =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789アイウエオカキクケコサシスセソ";
    private String targetWord = "HELLO";//displayed word
    private char[] display;
    private int index = 0;
    private Random rand = new Random();
    public WordSorter() {
        JFrame frame = new JFrame("Word Sort Animation");
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        setBackground(Color.BLACK);
        setFont(new Font("Monospaced", Font.BOLD, 44));
        display = new char[targetWord.length()];
        Timer timer = new Timer(88, e -> update());
        timer.start();
    }
    private void update() {
        if (index < targetWord.length()) {
            char target = targetWord.charAt(index);
            //randomly cycle characters
            char current = CHARS.charAt(rand.nextInt(CHARS.length()));
            display[index] = current;
            //Random chance to lock correct character
            if (rand.nextFloat() > 0.95f) {
                display[index] = target;
                index++; //move to next letter
            }
        }
        repaint();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        String text = new String(display);
        g.drawString(text, 100, 100);
    }
}
