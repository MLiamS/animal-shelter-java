class Animal {
  public int mLegCount;
  public String mSpecies;
  public String mBreed;
  public String mName;
  public int mAge;
  public int mWeight;
  public int mHeight;
  public int mLength;

  public boolean insidePet(int maxHeight) {
    return (mHeight < maxHeight);
  }
}
