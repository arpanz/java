public class largest {
    public static void main(String[] args) {
        int num[]={1,56,23,3,87,456,3332,34,23};
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
        }
        System.out.println(largest);
    }
}
