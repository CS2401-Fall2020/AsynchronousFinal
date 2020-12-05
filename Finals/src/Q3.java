
public class Q3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    myNumber int1 = new myIntA(4);
    System.out.println(int1);
  }

}

abstract class myNumber{
  double value;
  public String toString(){
      return "Double: " + value;
  }
}
class myIntA extends myNumber{
  myIntA(int inVal){
      value = (double) inVal;
  }
  public String toString(){
      return "Int: " + (int)value;
  }
}
class myIntB extends myNumber{
  myIntB(int inVal){
     value = (double) inVal;
  }
}
