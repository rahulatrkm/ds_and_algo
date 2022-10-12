
//User function Template for Java

class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
      ArrayList<Integer>  l1 = new ArrayList<>(arr);
       arr.clear();
       Stack<Integer> s1 = new Stack<>();
       
       for(int i = 0 ; i < n ; i++){
           s1.push(l1.get(i));
           
           if( (i+1)%k==0 || (i+1)==n) {
               while(!s1.empty()){
                   arr.add(s1.pop());
               }
           }
       }
    }   
}
