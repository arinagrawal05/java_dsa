 
public class GCD{
    public static void main(String[] args)  { 
    int result= getGCD(21,12);
    
    System.out.println("answer is " + result);
}


static public int  getGCD(int a,int b){
    int great=0;
    int smaller=a<b?a:b;
for (int i = 1; i < smaller; i++)  {
  
  if ((a % i == 0) && ( b % i ==0)) {
  great=i;
  }
}
    return great;
}
// efficient approach
}