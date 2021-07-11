/*
 * Print a triangular multiplication table.
 0
 0 2
 0 3 6
 0 4 8 12
 0 5 10 15 20
 0 6 12 18 24 30
 0 7 14 21 28 35 42*/
public class eight {
	public static void main(String[] args) {
		
		for(int k=1;k<=7;k++) {
			System.out.print("0 ");
			for(int l = 2;l<=k;l++)
			{
				System.out.print(k*(l-1) +" " );
			}
			System.out.println();
			}	
	}
	

}
