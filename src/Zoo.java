import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public Zoo() {
        animals = new Animal[25];
    }
    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println("Zoo name: "+name);
        System.out.println("Zoo city: "+city);
        System.out.println("Zoo nbr cages: "+nbrCages);
    }
    public String toString(){
        return "Zoo name: "+name +"Zoo city: "+city +"Zoo nbr cages: "+nbrCages;
    }

}
