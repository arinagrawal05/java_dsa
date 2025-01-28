// doubtful

public class TappingWater {
    public static void main(String[] var0) {
System.out.println(tapped(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
  
     public static int tapped(int[] heights) { 
    int left = 0, right = heights.length - 1, water = 0;
 
    int maxLeft = heights[left];
    int maxRight = heights[right];
 
    while (left < right)
    {
        if (heights[left] <= heights[right])
        {
            left++;
            maxLeft = Math.max(maxLeft, heights[left]);
            water += (maxLeft - heights[left]);
        }
        else {
            right--;
            maxRight = Math.max(maxRight, heights[right]);
            water += (maxRight - heights[right]);
        }
    }
 
    return water;
     }
}