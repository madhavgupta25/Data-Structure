class maxSubArrayUsingPrefixSubArray {
//     static void maxSubArray(int maxSubArray()) {
        
//     }
    static void maxSubArraySum(int abc[]) {
        int prefixArraySum[] = new int[abc.length];
        int start = 0 , end = 0, sum = 0, maxSum=Integer.MIN_VALUE;
        prefixArraySum[0]=abc[0];
        //calculate prefix sum
        for (int i = 1; i<prefixArraySum.length; i++) {
            prefixArraySum[i]=prefixArraySum[i-1]+abc[i];
            // System.out.print(prefixArraySum[i]+" ");
        }
        for (int i = 0; i<abc.length; i++) {
            start = i;
            for (int j =i; j<abc.length; j++) {
                end = j;
                    sum=start == 0 ? prefixArraySum[end] : prefixArraySum[end]-prefixArraySum[start-1];
                if(maxSum < sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }

    public static void main(String args[]) {
        int abc[]={1,-2,6,-1,3};
        maxSubArraySum(abc);
    }
}