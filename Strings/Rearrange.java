package Strings;

import java.util.Scanner;

class Rearrange {
    String wrd;      // original word
    String newwrd;   // rearranged word

    // Constructor (no need for "this" since names are different)
    Rearrange(String original) {
        wrd = original;
        newwrd = "";
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word in UPPER CASE:");
        wrd = sc.nextLine();
    }

    void freq_vow_con() {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if ("AEIOU".indexOf(ch) != -1)
                vowels++;
            else
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    void arrange() {
        String v = "", c = "";
        for (int i = 0; i < wrd.length(); i++) {
            char ch = wrd.charAt(i);
            if ("AEIOU".indexOf(ch) != -1)
                v += ch;
            else
                c += ch;
        }
        newwrd = v + c;
    }

    void display() {
        System.out.println("Original Word : " + wrd);
        System.out.println("Rearranged Word: " + newwrd);
    }

    public static void main() {
        Rearrange obj = new Rearrange(""); // create object
        obj.readword();
        obj.freq_vow_con();
        obj.arrange();
        obj.display();
    }
}
