package arrayProblems;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class leftRotation {
    
    public static void rotateArray(int [] a, int k){
       
       int n = a.length;
       k = k%n;
       
       for( int i =0; i<k ; i++){
           int frist = a[0];
           for(int j=0;j<n-1;j++){
           a[j]=a[j+1];
           }
        a[n-1]=frist;
       }
       
        
    }

    public static void main(String[] args) {
      int []a={30,30,15,15,25,25,33,33,65,8,8};
   int k = 4;
       rotateArray(a,k);
       System.out.println(Arrays.toString(a));
    }
}


