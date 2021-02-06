import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ameen on 06/02/2021.
 */
public class remove {
  //  public static  void main(String[]args) {

        Scanner s = new Scanner(System.in);
      static   int[] arr = {1, 2, 3, 4, 5, 6, 47};

        public void delete(){
            int n = s.nextInt();
        for (int i = 0; i < arr.length;i++)
        {
          if(arr[i]==n)
          {
              for (int j = i; j <arr.length-1 ; j++) {
                  arr[j]=arr[j+1];
              }
              break;
          }

        }}


     public void remo()
    {
        System.out.println("enter the elements");
        int c=s.nextInt();
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]==c)
           {
           }
        }
    }

    public static  void main(String[]args){
        remove r=new remove();
        r.delete();
        System.out.println(Arrays.toString(arr));
    }
}
