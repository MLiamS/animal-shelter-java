import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal dog = new Animal(3, "Canis lupus familiaris", "Labrador retriever",  "Tripod", 2, 35, 17, 50, false);
    Animal cat = new Animal(4, "Felis catus", "Domestic shorthair",  "Moe", 4, 15, 1, 2, false);
    Animal snake = new Animal(0, "Pantherophis guttatus", "Anery amely",  "Concetta",  6, 2, 1, 5, false);

    Animal[] allAnimals = {dog, cat, snake};

    dog.setAdopted();

    System.out.println("How high are your ceilings?");
    String stringMaxHeight = myConsole.readLine();
    int maxHeight = Integer.parseInt(stringMaxHeight);

    System.out.println("Alright, these pets will fit in your matchbox apartment:");

      for ( Animal individualAnimal : allAnimals ) {
        if (individualAnimal.insidePet(maxHeight)){
        System.out.println( "----------------------" );
        System.out.println( individualAnimal.mLegCount );
        System.out.println( individualAnimal.mSpecies );
        System.out.println( individualAnimal.mBreed );
        System.out.println( individualAnimal.mName );
        System.out.println( individualAnimal.mAge );
        System.out.println( individualAnimal.mWeight );
        System.out.println( individualAnimal.mHeight );
        System.out.println( individualAnimal.mLength );
        System.out.println( individualAnimal.mAdopted );
      }
    }
  }
}
