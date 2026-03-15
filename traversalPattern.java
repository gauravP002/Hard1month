public class traversalPattern {

    public static int findMax(int arr[]) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void reverseArr(int arr[]) {

        // 1, 2 ,3,4 ,5

        for (int i = 0; i <= arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }

    public static boolean checkArraySortedOrNot(int arr[]) {

        int i = 0;
        int j = 1;

        while (j < arr.length - 1) {
            if (arr[i] > arr[j]) {
                System.out.println("false");
                return false;
            }
            i++;
            j++;

        }
        System.out.println("true");
        return true;
    }

    public static int findMin(int arr[]) {

        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    public void moveZeroes(int[] nums) {
        int first =0  ;
       

        for(int i =0 ; i< nums.length; i++) {
            if(nums[i] == 0 ) {
                first = i;
                break;

            }
        }
        int second = first+1;

        while(second < nums.length) {
            if(nums[first] == 0 && nums[second] !=0) {
                int temp = nums[first];
                nums[first] = nums[second];
                nums[second] = temp;
               first ++;
               second ++;
            
            }
            else{
                second++;
            }
        }
        
    }

    public static void main(String[] args) {

        int arr[] = { 2, 6, 8, 10, 11, 23 };
        int max = findMax(arr);
        int min = findMin(arr);
        boolean isArraySorted = checkArraySortedOrNot(arr);
        System.out.println(isArraySorted);

    }
}