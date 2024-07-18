public abstract class hogwarts {
    protected final String name;
    protected final int transgression;
    protected final int magicPower;

    public hogwarts(String name, int transgression, int magicPower) {
        this.name = name;
        this.transgression = transgression;
        this.magicPower = magicPower;
    }

    public static void compareHogwartsStudents(hogwarts students, hogwarts student2) {
        if (students.getPower() > student2.getPower()) {
            System.out.println(String.format("%s обладает большей мощностью магии, чем %s ", students, student2));
        } else if (students.getPower() < student2.getPower()) {
            System.out.println(String.format("%s обладает большей мощностью магии, чем  %s", student2, students));
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int getPower() {
        return transgression + magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }
}
