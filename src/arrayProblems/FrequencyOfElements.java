package arrayProblems;

import java.util.Arrays;

public class FrequencyOfElements {
public static void countFrequency(int [] arr){
        
        Arrays.sort(arr);
        int count=1;
        
        for( int i = 1 ; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                System.out.println(arr[i-1]+"->" + count);
                count=1;
            }
        }
   System.out.println(arr[arr.length-1]+"->" + count);
     
        
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int [] arr = {1,2,3,4,5,6,71,1,3,5};
        
        countFrequency(arr);

    }
}
