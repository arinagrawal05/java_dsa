public class CheckEquilibrium {
  public static void main(String[] var0) {
    System.out.println(checkeqblm(new int[]{4,2,-2}
      // new int[]{3,4,8,-9,20,6}
    ));
 }

 public static boolean checkeqblm(int[] var0) {
int lsum=0;
int rsum=0;
for(int i=0;i<var0.length;i++){
  rsum+=var0[i];
 }
 rsum=rsum-var0[0];
 for (int i = 1; i < var0.length; i++) {
  if(i==0){
continue;  }
  if(lsum==rsum){
    return true;
  }else{
    lsum+=var0[i-1];
    rsum-=var0[i];
  }
 }
 return false;

}
}