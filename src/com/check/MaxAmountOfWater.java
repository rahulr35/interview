package check;

public class MaxAmountOfWater {

    public static void main(String[] args) {
        int[] h = {0,2};
        System.out.println(maxArea(h));
    }

    public static int maxArea(int[] height) {
        // breath --> min(1,8) --> 1
        // length --> index
        // Area = l*b
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if ( height[i] != 0 || height[j] != 0) {
                    maxArea = Math.max(maxArea, Math.min(height[i], height[j])*Math.abs(j-i));
                }
            }
        }
        return maxArea;
    }
}
