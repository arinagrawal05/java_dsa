// used sliding window technique to find the sum of subarray
public class SumSubArray {
    public static void main(String[] args)  { 
        System.out.println(checkSumSub(new int[]{1,2,3,5,2,3,2,3,2,3},12) );
    }  

static  public String checkSumSub(int[] n,int sum){
    int present=0;
    int k=0;
     boolean isPossible =false;
    for(int i=0;i<n.length;i++){
        // int temp;
        if(present==sum){
            isPossible=true;
            break;
        }else if(sum>present){
            k++;
            present+=n[i];
        }else{
            present-=n[i-k];
        }
            
       
    }   
    
    return isPossible?"Yes":"No"; 
    }
}

// 14
// 9


