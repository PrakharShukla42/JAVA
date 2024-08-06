package SectionAA;

public class Pattern10 {
	public static void main(String[] args) {
		int n = 7;
		int nst1 = 1;
		//int nst2 = 3;
		int nsp = 4;
		int row = 1;
		while(row<=n) {
		int val = 1;
		for(int i=1;i<=nsp;i++) {
			System.out.print("  ");
		}
		for(int i=1;i<=nst1;i++) {
			System.out.print(val+" ");
			if(i<row)
				val++;
			else
				val--;
		}
		}
	}
}