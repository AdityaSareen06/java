import java.util.*;
class selection
{
    public static void main()
    {
        int ar[] = {22,8,4,11,5,78,2,7,15,44};
        int i,j,temp,small,ind;
        System.out.println("Unsorted array : ");
        for(i = 0; i < 10; i++)
        {
            System.out.print(ar[i] + "\t");
        }
        for(i = 0; i < 10; i++)
        {
            small = ar[i];
            ind = i;
            for(j = i+1; j < 10; j++)
            {
                if(ar[j] < small)
                {
                    small = ar[j];
                    ind = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[ind];
            ar[ind] = temp;
        }
        System.out.println("\nSorted array : ");
        for(i = 0; i < 10; i++)
        {
            System.out.print(ar[i] + "\t");
        }
    }
}
