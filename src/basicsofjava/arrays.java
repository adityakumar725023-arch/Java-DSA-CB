package basicsofjava;

public class arrays {
    static void main() {
        int [] array ={2,3,5,10,1};
        int max=array[0];
        for ( int i=1;i < array.length;i++)
        {
            if (array[i]>max)
            {
    max=array[i];
        }
    }
        System.out.println("the max value of array is:"+max);
    }
}

