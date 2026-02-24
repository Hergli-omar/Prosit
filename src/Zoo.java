package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private final int  NBR_CAGES=25;
    private int compteur;
    public Zoo() {
        animals = new Animal[NBR_CAGES];
    }
    public Zoo(String name, String city) {
        animals = new Animal[NBR_CAGES];
        Scanner sc = new Scanner(System.in);
        while(name.equals("")) {
            System.out.println("Please enter a valid name");
            name = sc.nextLine();
        }
        if (!name.equals("")) {
            this.name = name;
        }
        this.name = name;
        this.city = city;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNBR_CAGES() {
        return NBR_CAGES;
    }

    public int getCompteur() {
        return compteur;
    }

    public void displayZoo(){
        System.out.println("tn.esprit.gestionzoo.entities.Zoo name: "+name);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo city: "+city);
        System.out.println("tn.esprit.gestionzoo.entities.Zoo nbr cages: "+NBR_CAGES);
    }
    public String toString(){
        return "tn.esprit.gestionzoo.entities.Zoo name: "+name +"tn.esprit.gestionzoo.entities.Zoo city: "+city +"tn.esprit.gestionzoo.entities.Zoo nbr cages: "+NBR_CAGES;
    }

    public boolean addAnimal(Animal animal){
        if (this.searchAnimal(animal)!=-1) {
            System.out.println(animal+" existe de la liste de animals");
            return false;
        }
        else {
            if(!isZooFull()){
//            if (compteur < animals.length) {
                animals[compteur] = animal;
                compteur++;
                System.out.println(animal+" ajouté avec succées");
                return true;
            } else {
                System.out.println("la liste des animals  est complet");
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
//        int i=0;
//        while(i<compteur){
//            if(animals[i].name==animal.name){
//                return i;
//            }
//            i++;
//        }
//        return -1;
        for(int i=0; i<compteur; i++){
            if(animals[i].equals(animal)){
                System.out.println(animal+"est trouvé !");
                return i;
            }
        }
        System.out.println(animal +"n'est pas trouvé");
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        int i=searchAnimal(animal);
        if (i==-1) {return false;}
        for (int j=i; j<compteur; j++){
            animals[j]=animals[j+1];
        }
        animals[compteur-1]=null;
        compteur--;
        System.out.println(animal+"est supprimé avec succé");
        return true;

    }
    public boolean isZooFull(){
//        if(compteur<animals.length){
//            return false;
//        }
//        return true;
        return compteur>=NBR_CAGES;
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if (z1.compteur >z2.compteur){
            System.out.println(z1+"comporte plus d'animaux que"+ z2);
            return z1;
        }
        System.out.println(z2+"comporte plus d'animaux que "+ z1);
        return z2;
    }


}
