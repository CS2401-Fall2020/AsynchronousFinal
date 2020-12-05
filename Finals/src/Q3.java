
public class Q3 {

  public static void main(String[] args) {
    myIntA num1 = new myIntA(4);
    System.out.println(num1);
    
    myIntB num2 = new myIntB(4);
    System.out.println(num2);
    
    myNumber num3 = new myIntA(4);
    System.out.println(num3);

    myNumber num4 = new myIntB(4);
    System.out.println(num4);

    /*
     * Causes a compile error
     * myNumber num5 = new myNumber(4);
    System.out.println(num5);*/
  }

}



