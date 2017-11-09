class Chick implements Animal 
{     
     //your code here
  private int numLegs;
  private String myType; 
  private String mySound;
  public Chick(String type, String sound) {
    myType = type;
    mySound = sound;
  }
  public Chick(){
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
