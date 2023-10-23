public class PetAppl {
    public static void main(String[] args) {

        Pet pet1 = new Pet(1,"reptile",298,"Nimble");
        Pet pet2 = new Pet(2,"Felidae",5,"Myrzik");

        pet1.display();
        pet1.crawl();
        pet1.swimm();
        System.out.println("___________");

        pet2.display();
        pet2.reaction();
        pet2.hunter();



    }
}
