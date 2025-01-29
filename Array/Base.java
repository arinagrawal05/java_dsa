public class Base {
    public static void main(String[] args)  { 
System.out.println(findGreatest(new int[]{8,-4,3,-5,4}));
    }

    static public int findGreatest(int[] n) {
      int currentMax = n[0]; 
      int globalMax = n[0];   
      for (int i = 1; i < n.length; i++) {
          currentMax = Math.max(n[i], currentMax + n[i]);
          globalMax = Math.max(globalMax, currentMax);    
      }
      for (int i = 0; i < n.length; i++) {
        currentMax = Math.max(n[i], currentMax + n[i]);
        globalMax = Math.max(globalMax, currentMax);    
    }
  return globalMax;  }
}