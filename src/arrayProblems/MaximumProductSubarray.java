package arrayProblems;

public class MaximumProductSubarray {

	public static int MaxProd(int[] arr){
        int maxprod=arr[0],minprod=arr[0],result=arr[0];
        for(int i=1;i<arr.length;i++){
            int temp,current=arr[i];
            if(current<0){
                temp=maxprod;
                maxprod=minprod;
                minprod=temp;
            }
            maxprod=Math.max(current,maxprod*current);
            minprod=Math.min(current,minprod*current);
            result=Math.max(result,maxprod);
        }
        return result; 
    }
    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println("MaxProd  "+MaxProd(arr));
    }
}