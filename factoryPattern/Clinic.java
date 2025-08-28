package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int pettype = 0;

        while (true) {
        System.out.println("[1] Dog");
        System.out.println("[2] Cat");
        System.out.println("[3] Exit");
        System.out.print("\nChoose a number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet = null;

        if (choice == 3) {
            System.out.println("Program terminated");
            break;
        }

        switch(choice){
            case 1: 
                pet = new Dog();
                petFile.setPetId("D01");
                petFile.setPetName("Bantay");
                petFile.setPet(pet);
                ((Dog) pet).setBreed("German Shepherd");
                pettype = 1;
                break;
            case 2: 
                pet = new Cat();
                petFile.setPetId("C01");
                petFile.setPetName("Muning");
                petFile.setPet(pet);
                ((Cat) pet).setNoOfLives(9);
                pettype = 2;
                break;
        }
        System.out.println("Pet ID: " + petFile.getPetId());
        System.out.println("Pet name: " + petFile.getPetName());

        if (pettype == 1) {
            System.out.println("Breed: " + ((Dog) pet).getBreed());
        }
        else {
            System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
        }
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());
        System.out.println("\n\n");
        }
        input.close();
    }
}
