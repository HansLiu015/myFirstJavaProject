package student;

public class Student {

    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void promote() {
        grade++;
    }

    public void printGradeLevel() {
        if (grade < 4) {
            System.out.println("elementary school");
        } else if (grade >= 4 && grade < 7) {
            System.out.println("middle school");
        } else if (grade >= 7 && grade < 16) {
            System.out.println("high school");
        } else {
            System.out.println("college");
        }
    }
}
