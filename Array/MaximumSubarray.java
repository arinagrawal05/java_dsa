public class MaximumSubarray {
    public static void main(String[] args)  { 
System.out.println(findGreatest(new int[]{2,3,-8,7,-1,2,3}));
    }

// static public int findGreatest(int[] n){
// int currentmax=n[0];
//   for (int i = 0; i < n.length; i++) {
//     int thisMax=0;
//     for (int j = i; j < n.length; j++) {
//        thisMax += +n[j];
//      currentmax=Math.max(currentmax, thisMax);
//     }
//   }
// return currentmax;
//    }
   static public int findGreatest(int[] n) {
    int currentMax = n[0]; 
    int globalMax = n[0];   
    for (int i = 1; i < n.length; i++) {
        currentMax = Math.max(n[i], currentMax + n[i]);
        globalMax = Math.max(globalMax, currentMax);    
    }

return globalMax;  }


}