import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by ameen on 05/02/2021.
 */
public class ArrayMethods {
    Scanner input=new Scanner(System.in);

   static int [] arr={15,16,17,18,19,20};
   static int [] array=arr;
    public void reversArray()

    {
        System.out.println("the revers of array elements ");
        int n=array.length-1;
        int t;
        for (int i = 0; i < array.length/2; i++) {
          t=array[i];
            array[i]=array[n];
            array[n]=t;
            n--;
        }
    }
    public void CloneArray()
    {

        int [] b=arr.clone();
        System.out.println("clone of array b "+Arrays.toString(b));
    }

    public void RemoveElements()
    {
        System.out.println("Enter the element you want to remove");


        int j;
        int  index=input.nextInt();
        for (int i = 0; i <array.length ; i++) {

            if(array[i]==index)
            {
                for( j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                    index++;
                }
                array[j]=0;
            }else System.out.println("Element is not found");break;



        }}
        public void ArrayElements()
    {
        System.out.println("the Elements of array after deletion");
        System.out.println(Arrays.toString(arr));
    }




    public static void main(String[]args){
        ArrayMethods d=new ArrayMethods();
        d.reversArray();
        System.out.println(Arrays.toString(array));
        d.CloneArray();

    d.RemoveElements();
        d.ArrayElements();
    }
}
