/*Fibbonachi Series //faculty02@datascience.manipal.edu    //kumaresh.gupta@u-next.com*/


public class six {	
	//a. First ten terms*/
	
		public static void main(String[] args) {	
			System.out.println("a.");
			int n1=0,n2=1,n3,i;    
			System.out.print(n1+" "+n2);   		   
			for(i=2;i<10;++i) 
			{    
			 n3=n1+n2;    
			 System.out.print(" "+n3);    
			 n1=n2;    
			 n2=n3;    
			}	
			System.out.println();
			System.out.println("b.");
//b. Odd numbers less than 100
			int a1=0,a2=1,a3,j;  		   
			for(j=2;j<13;++j) 
			{   			
			 a3=a1+a2; 
			 if(a3>1 && a3<100)
			 if(a3%2!=0)
			 System.out.print(a3+" ");    
			 a1=a2;    
			 a2=a3;    
			}	
			
			System.out.println();
			System.out.println("c.");
//c. Even numbers between 100 and 1000
			
			int b1=0,b2=1,b3,k;    		   
			for(k=2;k<30;++k) 
			{   			
			 b3=b1+b2; 
			 if(b3>100 && b3<1000)
				 if(b3%2==0)
				 System.out.print(b3+" ");    
				 b1=b2;    
				 b2=b3;    
			}
			
			System.out.println();
			System.out.println("d.");
//d. Sum of numbers less than 100*
			
			int c1=0,c2=1,c3,l,sum = 0;  		   
			for(l=2;l<13;++l) 
			{   			
			 c3=c1+c2; 
			 if(c3>1 && c3<100)
			 if(c3%2!=0)
			 sum = sum+c3;    
			 c1=c2;    
			 c2=c3;    
			}	    
			System.out.print(sum);			
		}}
