 
public class Factorial{
    public static void main(String[] args)  { 
    int result= getFactorial(4);
    
    System.out.println("answer is " + result);
}

static private int getFactorial(int n){
  int  temp=1;
for (int i = 1; i <= n; i++) {
  temp=temp*i;
}
  return temp;
}
}