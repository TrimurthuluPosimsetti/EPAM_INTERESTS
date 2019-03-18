import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Principal Amount:");
    int p=sc.nextInt();
    System.out.println("Enter the Time Period:");
    int t=sc.nextInt();
    System.out.println("Enter the Rate of Interest:");
    int r=sc.nextInt();    
    System.out.println("Choose one options from below options:");
    System.out.println("1:Simple Interest");
    System.out.println("2:Compound Interest");
    int funcvalue=sc.nextInt();
    double output=0;
    if(funcvalue==1){
	    output=(p*t*r)/100;
      System.out.println("Simple Interest is :"+output);
    }
    else if(funcvalue==2){
      	output=p*Math.pow(1.0+r/100.0,t);
        System.out.println("Compound Interest :"+output);
    }
    }
}
