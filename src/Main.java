import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

import static java.util.Collections.swap;

public class Main {
    public static boolean isRepeated(int arr[]){
        boolean c = false;
        for(int i = 0; i < arr.length;i++){
            if(c == true){
                break;
            }
            for(int j = i+1; j < arr.length;j++){
                if( arr[i] == arr[j]){
                    c = true;
                    break;
                }
                else{
                    c= false;
                }
            }
        }
        return c;
    }
    public static int searchInsert(int[] nums, int target) { // закончить сегодня
        int index = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            if (target == nums[i]) {
                index = i;
                break;
            }
            else if(target == nums[i+1]){
                index = i+1;
            }
            else if(target > nums[i] && target < nums[i+1]) {
                    index = i+1;
                }
        }
        return index;
    }
    public static boolean isRepeated1(int arr[]){
        boolean c = false;
        /*for(int i = 0; i < arr.length - 1;i++) {
            for (int j = 0; j < arr.length; j++ ) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }*/
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                c = true;
            }
        }
        return c;
    }
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        int reversed = 0;
        int demo = x;
        while(demo > 0){
            reversed = reversed * 10 + demo%10;
            demo= demo/10;
        }
        if(reversed == x)
        return true;
        else
            return false;
    }


    public static void main(String[] args) {

//        Person p1 = new Person("Ant", 30, 170, false);
//
//                try{
//        FileOutputStream fos = new FileOutputStream("person.bin");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(p1);
//
//        oos.close();
//    } catch(Exception ex){
//        System.out.println(ex.getMessage());
//    }
//
//         try{
//    FileInputStream fis = new FileInputStream("person.bin");
//    ObjectInputStream ois = new ObjectInputStream(fis);
//    Person p =(Person)ois.readObject();
//            System.out.print(p);
//
//            ois.close();
//}
//        catch(Exception ex){
//                System.out.println(ex.getMessage());
//                }
        int [] arr = {1,2,4,7};
        int target = 8;
        System.out.println(searchInsert(arr,target));
                }
}
