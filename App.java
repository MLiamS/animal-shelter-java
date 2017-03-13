public class App {
  public static void main(String[] args) {

    Animal dog = new Animal();
    dog.mLegCount = 3;
    dog.mSpecies = "Canis lupus familiaris";
    dog.mBreed = "Labrador retriever";
    dog.mName = "Tripod";
    dog.mAge = 2;
    dog.mWeight = 35;
    dog.mHeight = 17;
    dog.mLength = 50;

    Animal cat = new Animal();
    cat.mLegCount = 4;
    cat.mSpecies = "Felis catus";
    cat.mBreed = "Domestic shorthair";
    cat.mName = "Moe";
    cat.mAge = 4;
    cat.mWeight = 15;
    cat.mHeight = 1;
    cat.mLength = 2;

    Animal snake = new Animal();
    snake.mLegCount = 0;
    snake.mSpecies = "Pantherophis guttatus";
    snake.mBreed = "Anery amely";
    snake.mName = "Concetta";
    snake.mAge = 6;
    snake.mWeight = 2;
    snake.mHeight = 1;
    snake.mLength = 5;

    Animal[] allAnimals = {dog, cat, snake};

    System.out.println("All animals");

    for ( Animal individualAnimal : allAnimals ) {
      System.out.println( "----------------------" );
      System.out.println( individualAnimal.mLegCount );
      System.out.println( individualAnimal.mSpecies );
      System.out.println( individualAnimal.mBreed );
      System.out.println( individualAnimal.mName );
      System.out.println( individualAnimal.mAge );
      System.out.println( individualAnimal.mWeight );
      System.out.println( individualAnimal.mHeight );
      System.out.println( individualAnimal.mLength );
    }
  }
}
