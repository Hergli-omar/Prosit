package tn.esprit.gestionzoo.entities;

import java.util.Scanner;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;
    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        Scanner sc = new Scanner(System.in);
        while(age<0){
            System.out.println("Please enter a valid age");
            age = sc.nextInt();
        }
        if (age>0){
            this.age = age;
        }
//        this.age = age;

        this.isMammal = isMammal;

    }

    public String getFamily() {
        return family;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "tn.esprit.gestionzoo.entities.Animal name: "+name + " tn.esprit.gestionzoo.entities.Animal family: "+family+" tn.esprit.gestionzoo.entities.Animal age: "+age+" isMammal: "+isMammal;
    }

}
