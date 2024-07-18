public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", 51, 99, 74, 35, 95);
        Griffindor roneWeasley = new Griffindor("Rone Weasley", 66, 67, 36, 63, 54);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 88, 88, 96, 77, 99);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 55, 99, 57, 54, 74, 47, 74);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 88, 54, 39, 85, 73, 49, 71);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 61, 17, 87, 86, 72, 65, 77);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 68, 22, 87, 78, 54);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 45, 44, 14, 96, 55);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 87, 55, 32, 42, 99);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 21, 55, 44, 98, 99);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 53, 57, 88, 65, 99);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 87, 65, 52, 74, 99);

        harryPotter.compareGriffindorsStudents(roneWeasley);
        dracoMalfoy.compareSlytherinStudents(gregoryGoyle);
        zachariasSmith.compareHufflepuffStudents(cedricDiggory);
        padmaPatil.compareRavenclawStudents(marcusBelby);
        hogwarts.compareHogwartsStudents(roneWeasley,dracoMalfoy);
    }
}