public class PrintBackward {
    public static void main(String[] args)  { 
    recursion(5);    
}

static public void recursion(int n){
if (n==0) {
  return;
  
}
  System.out.println(n);
recursion(n-1);
}}