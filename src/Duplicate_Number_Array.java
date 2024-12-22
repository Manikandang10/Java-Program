import java.util.HashSet;

public class Duplicate_Number_Array {
     public static void Check (){
         HashSet<Integer> set=new HashSet<>();

         int []a={1,2,3,2,4,5,6,5,4,3};

         for(int i:a)
         {
             if(set.contains(i))
             {
                 System.out.println(i);
             }
             else {
                 set.add(i);
             }
         }
     }
}
