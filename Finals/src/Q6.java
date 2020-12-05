
public class Q6 {
  public static void main(String[] args) {
    double[] inArray = {7.01, 19.24, 93.28, -3.4, 100.59, 8.67, 0.9};
    printArray(inArray);
    System.out.println(binarySearchDecimalSorted(93.28, inArray, 0, 6));
  }
  
  public static void printArray(double[] inArray) {
    System.out.print("{");
    for(int i=0; i<inArray.length; i++) {
      if(i!=0) System.out.print(", ");
      System.out.print(inArray[i]);
    }
    System.out.print("}\n");
  }
  
  public static boolean binarySearchDecimalSorted(double search, double[] inArray, int start, int end) {
    System.out.println("binarySearchDecimalSorted(" + search + ", inArray, " + start + ", " + end+ ")");
    if(end<start) return false;
    if(end==start) return inArray[start] == search;
    
    int mid = start + (end - start)/2;
    int midIntPart = (int)Math.abs(Math.floor(inArray[mid]));
    if(inArray[mid]<0) {
      midIntPart = (int)Math.abs(Math.ceil(inArray[mid]));
    }
    double midDecimalPart = Math.abs(inArray[mid]) - midIntPart;
    
    int searchIntPart = (int)Math.abs(Math.floor(search));
    if(search<0) {
      searchIntPart = (int)Math.abs(Math.ceil(search));
    }
    double searchDecimalPart = Math.abs(search) - searchIntPart;
    
    if(midDecimalPart<searchDecimalPart) {
      return binarySearchDecimalSorted(search, inArray, mid+1, end);
    }else {
      return binarySearchDecimalSorted(search, inArray, start, mid-1);
    }
  }
  
}
