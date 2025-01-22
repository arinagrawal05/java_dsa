// Source code is decompiled from a .class file using FernFlower decompiler.
public class CheckSorted {
    public static void main(String[] args)  { 

System.out.println(checkSorted(new int[]{5,8,3,24}));    }

static public boolean checkSorted(int[] n){
boolean flag=false;
for (int i = 0; i < n.length-1; i++) {
  if (n[i]<n[i+1]) {
    flag=true;
   }else{
    flag=false;
    break;}
      }   
  return flag;

}

}