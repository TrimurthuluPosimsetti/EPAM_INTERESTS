import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Principal Amount:");
    //reading the integer value
    int p=sc.nextInt();
    System.out.println("Enter the Time Period:");
    //reading the integer value
    int t=sc.nextInt();
    System.out.println("Enter the Rate of Interest:");
    //reading the integer value
    int r=sc.nextInt();    
    System.out.println("Choose one options from below options:");
    System.out.println("1:Simple Interest");
    System.out.println("2:Compound Interest");
    //reading the integer value which represents simple or compound interest
    int funcvalue=sc.nextInt();
    if(funcvalue==1){
      //calling the simpleInterest function
      simpleInterest(p,t,r);
    }
    else if(funcvalue==2){
      //calling the compoundInterest function
      compoundInterest(p,t,r);
    }
    }
    /*
      This function is used to calculates the simpleInterest
    */
    public static void simpleInterest(int p,int t,int r){
      double output=0;
      //checking wheather given inputs are correct or not
      if(p<0||t<0||r<0){
        System.out.println("Input Should not be negative values..");
      }
      else{
      //calculating the simple interest using formula
	    output=(p*t*r)/100;
      System.out.println("Simple Interest is :"+output);}      
    }
    /*
      This function is used to calculates the compoundInterest
    */
    public static void compoundInterest(int p,int t,int r){
      double output=0;
      //checking wheather given inputs are correct or not
      if(p<0||t<-1||r<-1){
        System.out.println("Input Should be negative values:");
      }      
      else{
      //calculating compoundInterest using Math.pow() function
      output=p*Math.pow(1.0+r/100.0,t);
      System.out.println("Compound Interest :"+output);}
    }
}
