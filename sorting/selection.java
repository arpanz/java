public class selection {
    public static void main(String[] args) {
        int arr[]={5,4,2,1,3};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int minpos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];  //
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
