package Lab3;
class OvchiList{
    int[] arr;
    OvchiList(int length){
        arr=new int[length];
    }
    public void getMin(){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            min=Math.min(min,arr[i]);
        }
        System.out.println("The minimum of array is: "+min);
    }
    public void getMax(){
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println("The maximum of array is: "+max);
    }
    public void getSum(){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The sum of array is: "+sum);
    }
    public void getAverage(){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("The sum of array is: "+sum/arr.length);
    }
    public void getOdd(){
        System.out.println("The odd elements of array:");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void getEven(){
        System.out.println("The even elements of array:");
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0) System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}