import java.util.*;
//Reges p. 738 ex. 8
public class RemoveZeros
{
   public static void main(String[] args)
   {
      //Arrays.asList() er en genvej til at lave initialisering af ArrayList
      ArrayList<Integer> list = 
         new ArrayList<Integer>(Arrays.asList(0,7,2,0,0,4,0));
      /*ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(0);
      list.add(7);
      list.add(2);
      list.add(0);
      list.add(0);
      list.add(4);
      list.add(0);
      */
      System.out.println(list);
      int i=0;
      while (i<list.size())
      {
         if (list.get(i)==0)
         {
            list.remove(i);
         }
         else
         {
            i++;
         }
      }
      System.out.println(list);
   }
}