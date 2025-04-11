class Solution {
    int missingNumber(int arr[]) {
        Set<Integer> num = new HashSet<>();
        for(int a:arr){
            num.add(a);
        }
        int n = arr.length;
        for(int i=1;i<=n+1;i++){
            if(!num.contains(i)){
                return i;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 2, 4, 5, 6}; // missing number should be 3
        int missing = sol.missingNumber(arr);

        System.out.println("The missing number is: " + missing);
    }
}
