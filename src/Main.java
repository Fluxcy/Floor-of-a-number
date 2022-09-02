public class Main {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        System.out.println(nums[floorIndex(nums, 10)]);
    }

    static int floorIndex(int[] arr, int target)
    {
        int start = 0, end = arr.length-1, mid=0;

        while(start<=end)
        {
            mid = start + (end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return mid;
    }
}