class myIntA extends myNumber{
  myIntA(int inVal){
      value = (double) inVal;
  }
  public String toString(){
      return "Int: " + (int)value;
  }
}