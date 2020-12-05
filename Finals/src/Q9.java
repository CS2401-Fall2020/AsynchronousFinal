
public class Q9 {

  public static void main(String[] args) {
    int[][] in = {
      {  2,  4,   2,   8,  22},
      { 32,  8,  16,   1,   6},
      {  2,  9,   2,   8,  22},
      { 32,  8,  16,   4,   6}};
    int[] out = findTopLeftOdd(in);
    printArray(in);
    printArray(out);
  }
  
  public static int[] findTopLeftOdd(int[][] inArray) {
    int[] rtn = {inArray.length, inArray[0].length};
    for(int i=0; i<inArray.length; i++) {
      for(int j=0; j<inArray[0].length; j++) {
        if(inArray[i][j]%2 == 1) {
          if((i+j) < (rtn[0]+rtn[1])) {
            rtn[0] = i; 
            rtn[1] = j;
          }
        }
      }
    }
    return rtn;
  }

  public static void printArray(int[] inArray) {
    System.out.print("{");
    for(int i=0; i<inArray.length; i++) {
      if(i!=0) System.out.print(", ");
      System.out.print(inArray[i]);
    }
    System.out.print("}\n");
  }
  
  public static void printArray(int[][] inArray) {
    System.out.print("{\n");
    for(int i=0; i<inArray.length; i++) {
      printArray(inArray[i]);
    }
    System.out.print("}\n");
  }
}
