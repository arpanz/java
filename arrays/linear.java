

public class linear {
    public static int linear(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }  
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int num[]={1,4,54,10,34,67};
        int key=54;
        int n = linear(num, key);
        System.out.println(n);
    }
}
