public class PrintForward {
    public static void main(String[] args)  { 
    recursion(1,5);    
}

static public void recursion(int n,int target){
if (n>target) {
  return;
  
}
  System.out.println(n);
recursion(n+1,target);
}
}