package SectionAA;

public class Pattern8 {
	public static void main(String[]  args) {
		int n = 7;
		int nst1 = 4;
		int nst2 = 3;
		int nsp = -1;
		int row = 1;
		while(row<=n) {
			//star
			for(int i = 1;i <= nst1; i++) {
				System.out.print("*");
			}
			//space
			for(int i = 1;i<=nsp; i++)
			{
				System.out.print(" ");
				
			}
			//star
			for(int i=1;i<=nst2;i++) {
				System.out.print("*");
			}
			if(row<=n/2) {
			nst1--;
			nsp+=2;
			if(row!=1)
			nst2--;
			row++;
			}
			else {
				nst1++;
				nsp-=2;
				if(row!=n-1)
				nst2++;
			}
			row++;
			System.out.println();
		
		}

	}
}
