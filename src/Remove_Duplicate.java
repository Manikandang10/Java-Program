import java.util.HashSet;

public class Remove_Duplicate {

    public static void Find_dup()
    {
        int[] a={1,2,2,3,4,4,5,7,8};

        HashSet<Integer> find=new HashSet<>();

        for(int d:a){
            if(find.contains(d)){
                find.remove(d);
            }
            else{
                find.add(d);
            }
        }

        System.out.println(find);
    }
}
