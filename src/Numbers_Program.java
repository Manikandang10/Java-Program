public class Numbers_Program {

    public static void Amstrong()
    {
        int a=153;
        int c=a;
        int result=0;

        while(a>0){

            int r=a%10;
            int val=1;
            for (int i=0;i<3;i++){
                val*=r;
            }

            result+=val;
            a=a/10;
        }

        if(c==result)
        {
            System.out.println("Amstrong number...");
        }
        else{
            System.out.println("Not an Amstrong number..");
        }
    }

    public static void Niven()
    {
        int a=22;
        int dup=a;
        int sum=0;

        while(dup>0)
        {
            int r=dup%10;
            sum+=r;

            dup=dup/10;
        }

        if(a%sum!=0)
        {
            System.out.println("Not a Niven number...");
        }
        else{
            System.out.println("Niven number..");
        }
    }
}
