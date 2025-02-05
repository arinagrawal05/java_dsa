public class slidingWindow {
    public static void main(String[] args)  { 
System.out.println(findGreatest(new int[]{-8,-4,13,-5,4},3));
    }

    static public int findGreatest(int[] n,int k){ {
      int max=0;
      int curr = 0;   
for (int i = 0; i < k; i++) {
  curr += n[i];
}
max=curr;
 for (int i = k; i< n.length; i++) {
  curr += n[i] - n[i - k];
  max=Math.max(max,curr);
 }     
  return max;  }
}
}