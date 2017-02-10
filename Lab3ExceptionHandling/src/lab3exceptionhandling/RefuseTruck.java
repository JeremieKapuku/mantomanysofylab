package lab3exceptionhandling;

public class RefuseTruck {
    
    private int maxBins;
    private int noOfBinsDeclined;
    private int noOfBinsCollected;
    private double ratePerKg;
    private double totalWeight;
    
    public RefuseTruck(){
        
    }

    public RefuseTruck(int maxBins, int ratePerKg) {
        this.maxBins = maxBins;
        this.ratePerKg = ratePerKg;
        noOfBinsDeclined = 0;
        noOfBinsCollected = 0;
    }
   
   public int getNoOfBinsCollected(){
       return noOfBinsCollected;
   }
   
   public int getMaxBins(){
       return maxBins;
   }
   
  public void collectBin(int weight) throws BinOverWeightException{
       if(weight < 100 && noOfBinsCollected <= maxBins){
           noOfBinsCollected++;
           totalWeight = weight;
       } else if( weight > 100){
           throw new BinOverWeightException("Bin is over the 100Kg weight - Collection declined");
       }
   }
  
  public void printStats(){
      System.out.println("No. of bins collected: " + noOfBinsCollected);
      System.out.println("No. of bins not collected: " + noOfBinsDeclined);
      System.out.println("Average weight of bins collected is: " + totalWeight + " kg");
      System.out.println("Average cost per collected bin: €" + ((totalWeight*ratePerKg ))/ noOfBinsCollected);
  } 
   
   public double getCurrentTruckWeight(){
       return totalWeight;
   } 
    
}
