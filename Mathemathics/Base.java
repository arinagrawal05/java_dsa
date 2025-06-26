public class Base {
    public static void main(String[] args)  { 
      System.out.println("HEllO");

    // recursion(5);    
}

static public void recursion(int n){
if (n<0) {
  return;
  
}
  System.out.println("HEllO");
recursion(n-1);
}
}