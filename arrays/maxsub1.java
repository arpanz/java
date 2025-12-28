public class maxsub1 {
    public static void main(String[] args) {
        int num[]={2,4,-6,8,-10};
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++){     
            for(int j=i;j<num.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){   //maps each i to all of j
                    currSum += num[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum; 
                }
            }
        }
        System.out.println(maxSum);
    }
}

