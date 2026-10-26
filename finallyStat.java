public class finallyStat {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        try{
            System.out.println("Grabbing an element from arr"+ arr[4]);
        }catch(ArrayIndexOutOfBoundsException error){
            System.out.println("The Value is not present in arr");
        }finally{
            System.out.println("Please put a value betten 0-3 to get result ");
        }
    }
}
