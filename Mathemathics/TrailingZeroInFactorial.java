 
public class TrailingZeroInFactorial{
    public static void main(String[] args)  { 
    int result= getTrailingInFact(251);
    
    System.out.println("answer is " + result);
}

// static private int getTrailingInFact(int n){
//   int  temp=1;
//   int res=0;
// for (int i = 1; i <= n; i++) {
//   temp=temp*i;
// }
// // return temp;
// while (temp%10==0) {
//   res++;
//   temp=temp/10;
// }
//   return res;
// }
// Naive approrach which can lead overflow in case of bigger numbers e.g. 251
static public int  getTrailingInFact(int n){
    int res=0;

  for (int i = 5; i < n;i= i*5) {
    res=res+n/i;
  }
  return res;
}
// efficient approach
}