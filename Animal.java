class Animal {
  public int mLegCount;
  public String mSpecies;
  public String mBreed;
  public String mName;
  public int mAge;
  public int mWeight;
  public int mHeight;
  public int mLength;
  public boolean mAdopted;

  public Animal(int legCount, String species, String breed, String name, int age, int weight, int height, int length, boolean adopted) {
    mLegCount = legCount;
    mSpecies = species;
    mBreed = breed;
    mName = name;
    mAge = age;
    mWeight = weight;
    mHeight = height;
    mLength = length;
    mAdopted = adopted;
  }

  public boolean insidePet(int maxHeight) {
    return (mHeight < maxHeight);
  }

  public void setAdopted() {
    mAdopted = true;
  }
}
