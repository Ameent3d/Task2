import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ameen on 05/02/2021.
 */
public class ArrayMethods {
   static int [] arr={15,16,17,18,19,20};
   static int [] array=arr;
    public void reversArray()
    {    int n=array.length-1;
        int t;
        for (int i = 0; i < array.length/2; i++) {
          t=array[i];
            array[i]=array[n];
            array[n]=t;
            n--;
        }
    }
    public static void main(String[]args){
        ArrayMethods d=new ArrayMethods();
        d.reversArray();
        System.out.println(Arrays.toString(array));
    }
}
