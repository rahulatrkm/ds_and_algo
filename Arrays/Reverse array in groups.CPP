reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i=0;i<n;i+=k)
        {
            int s = i;
            int e = Math.min(i+k-1,n-1);
            while(s<e)
            {
               Collections.swap(arr,e,s);
               e--;
               s++;
            }
        }
    }
}
