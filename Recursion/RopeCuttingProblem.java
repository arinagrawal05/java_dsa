public class RopeCuttingProblem {
    public static void main(String[] args)  { 
 int res=   maxRopes(23,5,12,11);    
 System.out.println(res);
}

static public int maxRopes(int n,int a, int b, int c){
  if (n==0) {
    return 0;
  }
if (n<0) {
  return -1;
}

int max1=Math.max(maxRopes(n-a, a, b, c), maxRopes(n-b, a, b, c));
int max2=Math.max(max1, maxRopes(n-c, a, b, c));
if (max2==-1) {
  return -1;
}
// recursion(n-1);
return max2+1;
}
}