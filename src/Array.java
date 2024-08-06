package SectionAA;

public class array {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		int [] other =a;
		other[3]=-9;
		System.out.println(a[3]);
	}
}
