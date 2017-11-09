class Cow implements Animal 
{     
     //your code here
  protected int numLegs;
  protected String myType; 
  protected String mySound;
  public Cow(String type, String sound) {
    myType = type;
    mySound = sound;
  }
  public Cow(){
    myType = "";
    mySound = "";
  }
  public String getType() {
    return myType;
  }
  public String getSound() {
    return mySound;
  }
}
