public class SportsCar extends Car{

   public SportsCar(String license, int power){
      super(license, power);
   }
   
   public void race(){
      System.out.println("Kør ræs!");
   }
   
   public void checkLicense(){
      System.out.println("Sportsvogn med " + getHk() + " hk");
      super.checkLicense();
   }

}