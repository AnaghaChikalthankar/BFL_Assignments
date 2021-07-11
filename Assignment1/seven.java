/*Print the series
a. 1,4,7,10,13*/
public class seven {
	public static void main(String[] args) {
		System.out.println("a. ");
		int n1 = 1,n2,i;
		System.out.print(n1);
		for(i = 0;i<4;i++)
		{
			n2 = n1+3;
			System.out.print(" "+n2); 
			n1 = n2;
		}
		System.out.println();
		System.out.println("b. ");
//b.-20, -15, -10, -5, 0, 5……
		int m1 = -20,m2,j;
		System.out.print(m1);
		for(j = 0;j<50;j++)
		{
			m2 = m1+5;
			System.out.print(" "+m2); 
			m1 = m2;
		}
		
		System.out.println();
		System.out.println("c. ");
//c. 1,-2,3,-4,5,-6……….	
		int l1 = 1,l2,b1 =-2,b2,a;
		System.out.print(l1);
		System.out.print(b1);
		for(a = 1;a<50;a++)
		{
			if(a%2!=0)
			{
			l2 = l1+2;
			System.out.print(" "+l2); 
			l1 = l2;
			}
			else
			{
				b2 = b1-2;
				System.out.print(" "+b2); 
				b1 = b2;	
			}
		}
	}	
}