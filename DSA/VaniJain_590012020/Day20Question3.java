import java.util.*;
public class KthLargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();
        if (k <= 0 || k > n) 
        {
          System.out.println("Invalid value of K. It should be between 1 and " + n);
        } else 
        {
            int kthLargest = findKthLargest(nums, k);
            System.out.println("The " + k + "th largest element is: " + kthLargest);
        }
    }
    public static int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums)   
        {
            minHeap.offer(num); 
            if (minHeap.size() > k) 
            {
                minHeap.poll(); 
            }
        }
          return minHeap.peek();
    }
}
