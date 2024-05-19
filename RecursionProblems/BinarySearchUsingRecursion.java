public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,8,4};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length-1));
        
    }

    static int search(int[] arr, int target, int start, int end){
        if(end < start){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == arr[mid]){
            return mid;
        }
        if(arr[mid] > target){
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}