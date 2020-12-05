
public class Q5 {

  public static void main(String[] args) {
    int[] inArray1 = {7, 24, 93, -3, 100, 8, 0};
    printArray(inArray1);
    sortUsingBST(inArray1);
    printArray(inArray1);
    
    int[] inArray2 = {-9, -1, 0, 17, 27, 91982};
    printArray(inArray2);
    sortUsingBST(inArray2);
    printArray(inArray2);
    
    
    int[] inArray3 = {91982, 27, 17, 0, -1, -9};
    printArray(inArray3);
    sortUsingBST(inArray3);
    printArray(inArray3);

  }

  public static void sortUsingBST(int[] inArray) {
    BinarySearchTreeNode root = new BinarySearchTreeNode(inArray[0]);
    for(int i=1; i<inArray.length; i++) {
      root.insert(inArray[i]);
    }
    
    for(int i=0; i<inArray.length; i++) {
      BinarySearchTreeNode current = root;
      while(current.left != null) {
        current = current.left;
      }
      inArray[i] = current.value;
      root.remove(current.value);
    }
  }
  
  public static void printArray(int[] inArray) {
    System.out.print("{");
    for(int i=0; i<inArray.length; i++) {
      if(i!=0) System.out.print(", ");
      System.out.print(inArray[i]);
    }
    System.out.print("}\n");
  }
  

}

class BinarySearchTreeNode{
  public int value;
  public BinarySearchTreeNode left;
  public BinarySearchTreeNode right;

  BinarySearchTreeNode(int inVal){
    value = inVal;
  }

  public void insert(int inVal){
    if(inVal < value) {
      if(left == null) left = new BinarySearchTreeNode(inVal);
      else left.insert(inVal);
    }else {
      if(right == null) right = new BinarySearchTreeNode(inVal);
      else right.insert(inVal);
    }
  }
  public String toString() {
    String rtn = "" + value; 
    if(left != null || right != null) {
      rtn += "(";
      if(left != null ) rtn += left.toString();
      rtn += ","; 
      if(right != null ) rtn += right.toString();
      rtn += ")";
    }
    return rtn;
  }
  
  public void remove(int inVal){
    if(inVal!=value) {
      if(inVal < value) {
        if(left != null) {
          if(left.value == inVal) {
            if(left.left == null && left.right==null) {
              left = null;
            }else if(left.left == null) {
              left = left.right;
            }else if(left.right == null) {
              left = left.left;
            }else {
              left.remove(inVal);
            }
          }else {
            left.remove(inVal);
          }
        }
      }
      else if(right != null) {
        if(right.value == inVal) {
          if(right.left == null && right.right==null) {
            right = null;
          }else if(right.left == null) {

            right = right.right;
          }else if(right.right == null) {
            right = right.left;
          }else {
            right.remove(inVal);
          }
        }else {
          right.remove(inVal);
        }
      }
    }else if(inVal == value){
      // its me, need to swap with left most child on right subtree
      BinarySearchTreeNode current = right; 
      if(current == null) return;
      while(current.left != null) {
        current = current.left;
      }
      remove(current.value);
      value = current.value;
    }
  }
}