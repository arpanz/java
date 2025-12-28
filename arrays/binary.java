public class binary {
    public static int bin(int num[],int key){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid]>key){
                end=mid;
            }
            else if(num[mid]<key){
                start = mid+1;
            }
            else{
               return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,23,45,67,78,121,169};
        int key=78;
        int result=bin(num,key);
        
        System.out.println(result);
    }
}
