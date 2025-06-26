public class Demo {
    public static void main(String[] args)  { 
    recursion(5);    
}

static public void recursion(int n){
if (n<0) {
  return;
  
}
  System.out.println("HEllO");
recursion(n-1);
}
}