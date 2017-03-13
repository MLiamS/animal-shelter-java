class Animal {
  public int mLegCount;
  public String mSpecies;
  public String mBreed;
  public String mName;
  public int mAge;
  public int mWeight;
  public int mHeight;
  public int mLength;

  public Animal(int legCount, String species, String breed, String name, int age, int weight, int height, int length) {
    mLegCount = legCount;
    mSpecies = species;
    mBreed = breed;
    mName = name;
    mAge = age;
    mWeight = weight;
    mHeight = height;
    mLength = length;
  }

  public boolean insidePet(int maxHeight) {
    return (mHeight < maxHeight);
  }
}
