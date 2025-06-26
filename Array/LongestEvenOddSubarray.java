public class LongestEvenOddSubarray {
    public static void main(String[] args)  { 
        System.out.println(longestSub(new int[]{2,3,5,6,3,2,3,2,3}) );
    }  
//   static  public int longestSub(int[] n){
// int count=0;
// boolean even=true;
// int temp=0;
//  for(int i=1;i<n.length;i++){
    
//     if(even==true){
//         if(n[i]%2==0){
//             temp++;
//             even=false;
//             count=Math.max(count,temp);
//         }else{
//             temp=0;
//         }
//     }else{
//         if(n[i]%2==1){
//             temp++;
//             even=true;
//             count=Math.max(count,temp);

//         }else{
//             temp=0;
//         }  
//     }
    
//     }
//     return count+1;

// }
static  public int longestSub(int[] n){
    int count=0;
     int temp=0;
     for(int i=1;i<n.length;i++){
        if(n[i]%2==0 && n[i-1]%2!=0 || n[i]%2!=0 && n[i-1]%2==0){
            temp++;
            count=Math.max(count,temp); 
        }
        else{
            temp=0;
        }    
    }
    return count+1; 
    }
}

// 14
// 9


