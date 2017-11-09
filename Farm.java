class Farm 
{     
   //your code here
  private Animal[] fam = new Animal[4];
  public Farm() {

  fam[0] = new Cow("cow", "moo");
  if (Math.random() > 0.5) {
    fam[1] = new Chick("chick", "peep");
  }
  else {
    fam[1] = new Chick("chick", "cluck");
  }
  
  fam[2] = new Pig("pig", "oink");
  fam[3] = new NamedCow("cow", "Darla", "moo");

  }
   public void animalSounds()    {       
     for (int nI=0; nI < fam.length; nI++)       {          
       System.out.println( fam[nI].getType() + " goes " + fam[nI].getSound());   
       if (nI == 3) {
         System.out.println( "The cow is known as " + ((NamedCow)fam[3]).getName() );  

       }
       
      }    
}
}

