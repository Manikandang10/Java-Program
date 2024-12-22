import java.util.*;

public class Small_InterView {

    public static void Fizz_Program()
    {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz "+i );
            }
            else if(i%3==0){
                System.out.println("Fizz "+i);
            }
            else if(i%5==0){
                System.out.println("Buzz "+i);
            }
        }
    }

    public static void Reverse_String()
    {
        String s="Capital";
        StringBuffer re=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            re.append(s.charAt(i));
        }
        System.out.print(re);
    }

    public static boolean Palindrome(String s,int start,int end)
    {

        if(start>=end)return true;

        if(s.charAt(start)!=s.charAt(end))return false;

        return Palindrome(s,start+1,end-1);
    }

    public static void Number_Palindrome()
    {
        int a=121;
        int original=a;
        int result=0;

        while(a>0)
        {
            int r=a%10;
            result=result*10 + r;

            a/=10;
        }

        if(original==result){
            System.out.println("Palindrome");
        }
        else {
            System.out.print("Not");
        }
    }

    public static void Second_Large()
    {
        int[] a={12,3,4,5,6,7,8,6,867,97,978};

        Arrays.sort(a);

        System.out.println(a[a.length-2]);
    }

    public static void Count_Vowels()
    {
        String s="Hello World";
        s.replace(" ","");
        int vowel=0,cont=0;
        for(char c:s.toLowerCase().toCharArray())
        {
            if(c=='a' || c=='e' ||c=='i' || c=='o' ||c=='u')
            {
                vowel++;
            }
            else{
                cont++;
            }
        }
        System.out.println(vowel);
        System.out.println(cont);
    }

    public static int Factorial_Recursion(int a)
    {
        if(a==1)
            return 1;

        return a*Factorial_Recursion(a-1);
    }

    public static void Fibonacci(int n)
    {
        int a=0,b=1,c=1;

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");

            a=b;
            b=c;
            c=a+b;
        }
    }

    public static void Remove_Dup_Array()
    {
        int[] a={1,2,2,2,3,3,4,5,4,5,6,6,7,8,9,8};

        LinkedHashSet<Integer> find=new LinkedHashSet<>();

        for(int i:a){
            find.add(i);
        }

        System.out.println(find);
    }

    public static String Angram(String s1,String s2)
    {

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    return "Not a Anagram";
                }
            }
        }
        else{
            return "Not a Anagram";
        }
        return "Anagram";
    }

    public static void Missing_Number()
    {
        int[]a={2,3,5,6};
        Arrays.sort(a);

        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]+1!=a[i+1] )
            {
                System.out.println(a[i]+1);
            }
        }
    }

    public static void PrimeNumber(int a)
    {
        for(int i=1;i<=a;i++){
            int c=0;

            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c++;
            }
            if(c==2)
                System.out.println(i);
        }
    }

    public static void FindLargestString(String s)
    {
        String[]s1=s.split(" ");

        String re="";

        for(int i=0;i<s1.length;i++){
            if(re.length()<s1[i].length())
            {
                re=s1[i];
            }
        }
        System.out.println(re);

    }

    public static void CheckAllElementSameinTwoArray()
    {
        int[] a={1,2,3,4};
        int[] b={2,1,2,4};
        HashSet<Integer> find=new HashSet<>();

//        if(a.length==b.length){
//            for(int i=0;i<a.length;i++){
//                find.add(a[i]);
//                find.add(b[i]);
//            }
//        }
//
//        System.out.println(find.size()==a.length?"Same":"Not Same");

        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length==b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    System.out.println("Not All number in both Array");
                    return;
                }
            }
        }
        else {
            System.out.println("Not All number in both Array");
            return;
        }

        System.out.println("Same");
    }

    public static void FirstNon_Rep()
    {
        String s="swwiss";
        LinkedHashMap<Character,Integer> find=new LinkedHashMap<>();

        for(char i:s.toCharArray()){
            find.put(i,find.getOrDefault(i,0)+1);
        }

       for(Map.Entry<Character,Integer> d:find.entrySet()){
           if(d.getValue()==1){
               System.out.println(d.getKey());
               return;
           }
       }
    }

    public static void frequence_Character()
    {
        String s="abcdefgg";

        HashMap<Character,Integer> find=new HashMap<>();
//
//        for(char i:s.toCharArray()){
//            find.put(i,find.getOrDefault(i,0)+1);
//        }
//        System.out.println(find);

        for(char d:find.keySet())
        {
            System.out.println(d+ "=" +find.get(d));
        }

    }

    public static void SortArray_Without_inbuilt()
    {
        int[] a={1,2,2,4,6,4,2,6,7,9,0};

        for(int i=1;i<a.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void Sum_of_Digits()
    {
        int a=1234453872;
        int sum=0;

        while(a>0){
            int r=a%10;
            sum+=r;
            a/=10;
        }

        System.out.println(sum);
    }

    public static void Pattern1(int n)
    {

        for(int i=0;i<n;i++)
        {
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Number_Reverse()
    {
        int a=123;
        int result=0;

        while(a>0){
            int r=a%10;

            result=result*10 +r;
            a/=10;
        }
        System.out.println(result);
    }

    public static void without_arith()
    {
        int a=11;

        if((a&1)==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static void Diamond_Pattern(int a)
    {
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<a;i++)
        {
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=a-i;j>0;j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void Square_Pattern(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(i==1 || i==a || j==1 ||j==a)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void Shift_Element_right(int key)
    {
        int[]a={1,2,3,4,5};

        for(int i=0;i<key;i++)
        {
            int right=a[a.length-1];
            for(int j=a.length-1;j>0;j--)
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
            a[0]=right;
        }

        for(int i:a)
        {
            System.out.println(i);
        }
    }
}
