public class SnakePattern {
  public static void main(String[] var0) {
    snake(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}); 
   }

 public static void snake(int[][] num) {

  for (int i = 0; i < num.length; i++) {
if (i%2==0) {
  for (int j = 0; j <= num.length; j++) {
    System.out.println(num[i][j]);
  }
}else{
    for (int j = num[i].length-1; j >= 0; j--) {
      System.out.println(num[i][j]);
    }
  }
  }
  

 }

 
}