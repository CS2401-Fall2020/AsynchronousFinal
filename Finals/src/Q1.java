
public class Q1 {

  public static void main(String[] args) {
    System.out.println(crazyMethod(22));

  }
  
  public static double crazyMethod(int inNum){
    System.out.println("crazyMethod("+inNum+")");
    if(inNum > 10 && inNum%2 != 0){
        return (double)inNum/4.0 + crazyMethod(inNum - inNum % 4);
    }
    else if(inNum > 10){
        return (double)inNum + crazyMethod(inNum/2);
    }else if(inNum > 0){
        return (double)inNum * 0.01 + crazyMethod(inNum - 3);
    }
    return 0.0;
}

}
