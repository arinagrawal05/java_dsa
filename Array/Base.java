public class Base {
    public static void main(String[] args)  { 
System.out.println(findGreatest(new int[]{1,1,0,0,1,1,1}));
    }

static public int findGreatest(int[] n){
  int current=0;
  int maxi=0;

  for (int i = 0; i < n.length; i++) {
    if (n[i]==1) {
      maxi++;
      current=Math.max(maxi, current);

    } else{
      maxi=0;
    }
   }
  return current;
   }
}