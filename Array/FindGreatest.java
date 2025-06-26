
public class FindGreatest {
    public static void main(String[] args)  { 
   System.out.println(findGreatest(new int[]{3,5,7,80,12}));    
}

static public int findGreatest(int[] n){
int max=0;

for (int i = 0; i < n.length; i++) {
    if (n[i]>max) {
        max=n[i];
  }
}
  return max;
}
}