/*write a program to get the following output:
 
 ***
 ###
 ***
 ###
 ***
 
 */
public class fifteen {
	public static void main(String[] args) {
		for (int i = 0;i<=4;i++) {
			for (int j = 0;j<3;j++)
			{
				if(i%2==0)
				{
				System.out.print("* ");}
				else
				System.out.print("# ");				
			}
			System.out.println();
			}
	}
	

}
