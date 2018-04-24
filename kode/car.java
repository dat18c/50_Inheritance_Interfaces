public class Car{

   private String license;
   private int hk;
   
   //constructor
   public Car(String lic, int hk){
      this.license = lic;
      this.hk = hk;
   }
   
   //getters & setters
   public void setHk(int hk){
      this.hk = hk;
   }
   
   public int getHk(){
      return hk;
   }
   
   //check nummerplade
   public void checkLicense(){
      System.out.println("Nummer: " + license);
   }
   
}