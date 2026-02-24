import java.util.Arrays;
//
public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final int  nbrCages=25;
    static int compteur;
    public Zoo() {
        animals = new Animal[nbrCages];
    }
    public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
    }
    public void displayZoo(){
        System.out.println("Zoo name: "+name);
        System.out.println("Zoo city: "+city);
        System.out.println("Zoo nbr cages: "+nbrCages);
    }
    public String toString(){
        return "Zoo name: "+name +"Zoo city: "+city +"Zoo nbr cages: "+nbrCages;
    }

    public boolean addAnimal(Animal animal){
        if (this.searchAnimal(animal)!=-1) return false;
        else {
            if (compteur < animals.length) {
                animals[compteur] = animal;
                compteur++;
                return true;
            } else {
                return false;
            }
        }
    }
    public void afficheAnimals(){
        for(int i=0; i<compteur; i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animal animal){
        int i=0;
        while(i<compteur){
            if(animals[i].name==animal.name){
                return i;
            }
            i++;
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        int i=0;
        if (this.searchAnimal(animal)==-1) return false;
        else {
            i=this.searchAnimal(animal);
            for (int j=i; j<compteur; j++){
                animals[j]=animals[j+1];
            }
            compteur--;
            return true;
        }

    }
    public boolean isZooFull(){
        if(compteur<animals.length){
            return false;
        }
        return true;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.compteur >z2.compteur){
            return z1;
        }
        else{
            return z2;
        }
    }


}
