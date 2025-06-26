public class SortedFrequencies {
    public static void main(String[] args)  { 
sortedFreq(new int[]{10,10,10,25,30,30});    
}
static public void sortedFreq(int[] n){

  int freq=0;
  int current=0;
  while(current<n.length){
    freq=1;
    while(current<n.length-1 && n[current]==n[current+1]){
      freq++;
      current++;
    }
    System.out.println(n[current]+" "+freq);
    current++;
  }
}
}