import java.util.*;

public class CarDemo{

   public static void main(String[] args){
      ArrayList<Car> carlist = new ArrayList<Car>();
      Car bil = new Car("alm bil", 120);
      SportsCar sport = new SportsCar("my sportscar", 255);
      Lorry lkw = new Lorry("tung dyt", 142);
      carlist.add(bil);
      carlist.add(sport);
      carlist.add(lkw);
      
      System.out.println(carlist);
   }


}