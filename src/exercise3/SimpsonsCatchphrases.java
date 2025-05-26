package exercise3;

public class SimpsonsCatchphrases {

    public void getCatchphrase(String name) {
        switch(name) {
            case "Homer":
                System.out.println("Homer:       D'oh!");
                break;
            case "Marge":
                System.out.println("Marge:       Mmm~mmmmm");
                break;
            case "Bart":
                System.out.println("Bart:        ¡Ay, caramba!");
                break;
            case "Lisa":
                System.out.println("Lisa:        If anyone wants me, I'll be in my room.");
                break;
            case "Maggie":
                System.out.println("Maggie:      (Pacifier Suck)");
                break;
            case "Ned":
                System.out.println("Ned:         Hi-Diddily-Ho!");
                break;
            case "Burns":
                System.out.println("Burns:       Excellent!");
                break;
            case "Edna":
                System.out.println("Edna:        Ha!");
                break;
            case "Chalmers":
                System.out.println("Chalmers:    SEEEEYYYMOOUURRR!");
                break;
            case "Apu":
                System.out.println("Apu:         Thank You, Come Again!");
                break;
            case "Stu":
                System.out.println("Stu:         Disco Stu likes disco music.");
                break;
            default:
                System.out.println("Please enter the correct name of a character");
        }
    }
}
