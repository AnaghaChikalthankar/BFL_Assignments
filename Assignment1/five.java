/*Print
 
# # #
# #
#

*/
public class five {
	public static void main(String[] args) {
		System.out.println("A");
		for(int i =3;i>0;i--) {
			for(int j = 0;j<i;j++)
			{
				System.out.print(" # ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("B");
		
		/*
		  Print
		 *
		 * *
		 * * *
		 * * * *
		 
		 */			
				for(int k=0;k<4;k++) {
					for(int l = 0;l<=k;l++)
					{
						System.out.print(" * ");
					}
					System.out.println();
					}		
	}

}
