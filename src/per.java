package SectionAA;

import java.util.*;
public class per {
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int e = sc.nextInt();
		    int total = a+b+c+d+e;
		    System.out.println(total);
		    int avg = total/5;
		    float Percentage = (total / 500) * 100;
		    System.out.println(avg);
		    System.out.println(Percentage);
		}
}
