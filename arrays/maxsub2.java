public class maxsub2 {
    public static void main(String[] args) {
        int num[]={2,4,-6,8,-10};
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        prefix[0]=num[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];  //this num plus prev sum
        }

        for(int i=0;i<num.length;i++){ 
            int start=i;    
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum = start==0     //for no in first index
                ? prefix[end] 
                : prefix[end]-prefix[start-1]; 

                if(maxSum<currSum){
                    maxSum=currSum; 
                }
            }
        }
        System.out.println(maxSum);
    }
}

