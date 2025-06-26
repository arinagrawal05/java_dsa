public class SecondLargest {
    public static void main(String[] args)  { 
System.out.println(secondLargest(new int[]{3,5,9,8,12}));    
}
static public int secondLargest(int[] n){
int max=0;
  int secondMax=0;
  for (int i = 0; i < n.length; i++) {
    if (n[i]>max) {
        secondMax=max;
        max=n[i];
   }
   if (n[i]>secondMax && n[i]<max) {
       secondMax=n[i];
   }

  }
  return secondMax;

}
}