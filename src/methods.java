import java.util.Arrays;
public class Changevalues{
    public static void main(String[] args){
        int[] arr={4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=66;
    }
}
