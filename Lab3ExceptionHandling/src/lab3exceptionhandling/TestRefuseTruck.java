package lab3exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestRefuseTruck {

    public static void main(String[] args) throws nonNumericException, BinOverWeightException{
        Scanner in = new Scanner(System.in);
        RefuseTruck rt = new RefuseTruck();
        
        int noOfBins = 0;
        int loop = 0;
        int costperkilo;
        int weight;
       
      while(loop < 1){  
        try{
          System.out.println("Enter the number of bins the truck can collect: ");
          noOfBins = in.nextInt();
          System.out.println("Enter the cost per kilo: ");
          costperkilo = in.nextInt();
          loop++;
          rt = new RefuseTruck(noOfBins,costperkilo);
         
        }catch (InputMismatchException e){
            
            System.out.println("Error with input");
            in.nextLine();
        }
        
      
      }
          
          
        for(int i =0; i <noOfBins; i++) {
           int is = 0;
            while( is < noOfBins){
                try{
               System.out.println("Enter the weight for bin " + (i+1) + ": ");
               weight = in.nextInt();
               rt.collectBin(weight);
               is++;
            }catch (InputMismatchException e){
                System.out.println("Error with input");
                in.nextLine();
            } catch (BinOverWeightException e){
                    System.out.println(e.getMessage());
            }
           }
            
        }
         rt.printStats();
      
        
    
    }
    
}
