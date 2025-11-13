package excercise5;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapSimpsons {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, String> simpsons = new HashMap<String, String>();

        simpsons.put("Homer", "D'oh!");
        simpsons.put("Marge", "Mmm~mmmmm");
        simpsons.put("Bart", "¡Ay, caramba!");
        simpsons.put("Lisa", "If anyone wants me, I'll be in my room.");
        simpsons.put("Maggie", "(Pacifier Suck)");
        simpsons.put("Ned", "Hi-Diddily-Ho!");
        simpsons.put("Burns", "Excellent!");
        simpsons.put("Edna", "Ha!");
        simpsons.put("Chalmers", "SEEEEYYYMOOUURRR!");
        simpsons.put("Apu", "Thank You, Come Again!");
        simpsons.put("Stu", "Disco Stu likes disco music.");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of a simpsons character: ");
            String name = scan.nextLine();
            if (simpsons.get(name) == null) {
                System.out.println("Please enter the correct name of a character");
            } else {
                System.out.println(simpsons.get(name));
            }
        }
    }
}
