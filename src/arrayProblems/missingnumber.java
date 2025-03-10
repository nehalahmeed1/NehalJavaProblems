package arrayProblems;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class missingnumber {




    public static void main(String[] args) {
      int []a={5,6,8,13,12,10};
  
  int n = a.length;
  for(int i = 0; i<n-1;i++){
      for(int j =i+1;j<n;j++){
          if(a[i]>a[j]){
            int temp = a[i];
            a[i]= a[j];
            a[j]= temp;
          }
      }
  }
  for(int i =0;i<n-1;i++){     /// 5,6,8,10,12,13
      for(int j = a[i]+1;j<a[i+1];j++){
       System.out.println(j);
      }
 
      
  }
  
  
    }
}
