package SectionAA;
import java.util.*;
public class Prime{    
 public static void main(String args[]){   
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number :");
  int n=sc.nextInt();   
  int i,m=0,term=0;      
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     term=1;      
     break;      
    }      
   }      
   if(term==0)
  {
	   System.out.println(n+" is prime number"); }  
  } 
}    
}