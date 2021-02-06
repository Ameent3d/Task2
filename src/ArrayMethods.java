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
        int n=input.nextInt();
        int j;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==n)
            {
                for ( j = i; j <array.length-1 ; j++) {
                    array[j]=array[j+1];
                } array[j]=0;
                break;
            }}}
    public void ArrayElements()
    {System.out.println("the Elements of array after deletion");
        System.out.println(Arrays.toString(arr));}

    public static void main(String[]args) {
        ArrayMethods d = new ArrayMethods();
        d.reversArray();
        System.out.println(Arrays.toString(array));
        d.CloneArray();

        d.RemoveElements();
        d.ArrayElements();

        System.out.println("remove the elements from array ");
        for(int i=0;i<array.length;i++){

            d.RemoveElements();
            d.ArrayElements();
        }

    }
    }

