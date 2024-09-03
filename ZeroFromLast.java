
public class Zero {

	public static void main(String[] args) {
		int [] a = {1,0,20,0,4,0,5,0}; //length=8;
		int c=0; // it will change to c=4;
		System.out.println("Zero to be Last :");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) {
				a[c]=a[i];//1,20,4,5
				c++;
			}
		}
		while(c<a.length) //c=4 4<8  final condition is 7<8 it's a final condition
		{
			a[c]=0;
			c++; //increase value +1 each looping
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
  