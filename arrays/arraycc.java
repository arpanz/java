import java.util.*;

public class arraycc {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]++;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[50];
        int marks[]={1,2,3};
        update(marks); //call by reference

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
