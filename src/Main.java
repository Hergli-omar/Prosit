public class Main {
    public static void main(String[] args) {
        //        Animal lion = new Animal();
        //        Zoo myZoo = new Zoo();
        //        lion.family="Felidae";
        //        lion.name="Lion";
        //        lion.age=8;
        //        myZoo.name="MyZoo";
        //        myZoo.city="Paris";
        //        myZoo.nbrCages=10;
        Animal lion = new Animal("Felidae", "Lion", 8, true);
        Zoo myZoo = new Zoo("MyZoo", "Paris", 10);
        Animal a1 = new Animal("Elephantidae", "Elephant", 15, true);
        Animal a2 = new Animal("Crocodylidae", "Crocodile", 20, false);
        Animal a3 = new Animal("Ursidae", "Panda", 5, true);
        Zoo z1 = new Zoo("New York Zoo", "New York", 30);
        Zoo z2 = new Zoo("Tokyo Zoo", "Tokyo", 15);
        Zoo z3 = new Zoo("London Zoo", "London", 25);
        //z1.displayZoo();
        System.out.println(z1);
        System.out.println(z1.toString()) ;
        System.out.println(lion);

    }
}
