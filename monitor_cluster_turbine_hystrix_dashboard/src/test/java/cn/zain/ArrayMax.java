package cn.zain;

import org.junit.Test;

import java.util.Arrays;

public class ArrayMax {

    @Test
    public void arrayMaxTest() throws Exception {
        char[] arr = {'a', 'c', 'b', 'c', 'a', 'c', 'd', 'd', 'd', 'd', 'd'};
        System.out.println(arrayMax(arr));
    }

    private char arrayMax(char[] arr) {
        if (null == arr || arr.length == 0) {
            return ' ';
        }
        Arrays.sort(arr);
        System.out.println(arr);
        int maxNum = 0;
        int tempNum = 0;
        char c =arr[0];
        char last = 0;
        for (int i = 0; i < arr.length; i++) {
            if(c == arr[i]){
                maxNum++;
            }else{
                if(last != arr[i]){
                    tempNum = 0;
                }
                tempNum++;
            }
            if(tempNum >maxNum){
                c = arr[i];
                maxNum = tempNum;
            }
            last = arr[i];
        }
        return c;
    }
}
