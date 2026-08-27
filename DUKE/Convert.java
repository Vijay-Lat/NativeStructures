import java.util.Scanner;

public class Convert {

    public static void main(String[] args) {
         final double CM_PER_FEET = 30.48;
   double getInch;
   double answer;
   try (Scanner in = new Scanner(System.in)) {
    System.out.println("Enter cm:");
       getInch=in.nextDouble();
}
   answer = getInch / CM_PER_FEET;
    System.out.println("Feet:"+answer); 
    }
 

}
