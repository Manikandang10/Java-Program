public class Contains_Value {
    public static void contain()
    {
        int []a={1,2,3,4,5,6,7,8,9};
        int cont=14,in=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==cont)
            {
                in++;
                break;
            }
        }
        if(in==0)
        {
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}
