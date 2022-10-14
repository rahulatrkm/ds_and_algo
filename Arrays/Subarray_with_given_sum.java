public class SubarraySum {

    int subArraySum(int arr[], int n, int sum)
    {
        int currentSum = arr[0], start = 0, i;
 
        for (i = 1; i <= n; i++) {

            while (currentSum > sum && start < i - 1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == sum) {
                int p = i - 1;
                System.out.println(
                    "Sum found between indexes " + start
                    + " and " + p);
                return 1;
            }
 
            if (i < n)
                currentSum = currentSum + arr[i];
        }
 
        System.out.println("No subarray found");
        return 0;
    }
 
    public static void main(String[] args)
    {
        SubarraySum arraysum = new SubarraySum();
        int arr[] = { 20, 15, 2, 9, 8, 4, 7, 20 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }
}