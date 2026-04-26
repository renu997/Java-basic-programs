package basics_java_package;

public class Fibonacci_series {

		// print febonacci series with just 10 items.
		public static void main(String[] args) {
			int a = 0;
			int b= 1; 
			int count=2;
			System.out.print(a+" "+b+" ");
			
			for(int i=2; i>0; i++) 
			{ 
			int c =a+b; 
			System.out.print(c+" "); 
			count++;
			if(count==10)
			{
				System.out.println();
				System.out.println("count of total iteams :"+ count);
				break;
			}
			 a=b; 
			 b=c;
			}

			/*n = 2;
			 * while(n>=0) 
			 * {
			 * int d = a+b;
			 * System.out.print(d+" "); 
			 * count++; 
			 * a=b;
			 * b=d;
			 * n++;
			 * if(n>=200) // print total 200 iteams inside febonacci series.
			 * {break;}
			 * } System.out.println();
			 * System.out.println("count " + count);
			 */
			}	
	          
		}

