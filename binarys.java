import java.util.*;
class binarys
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num,j,k;
        int pos = 0,found = 0,start = 0,last = 9,middle = 0; 
        int x[] = {3,17,35,38,43,57,63,82,90,96};
        System.out.println("Enter the number to be searched : ");
        num = sc.nextInt();
        while(start <= last)
        {
            middle = (start+last)/2;
            if(num == x[middle])
            {
                found = 1;
                pos = middle;
                break;
            }
            else if(num > x[middle])
                start = middle + 1;
            else if(num < x[middle])
                last = middle - 1;
        }
        System.out.println("The array is : ");
       for(int i = 0; i < 10; i++)
        {
            
              System.out.print(x[i] + " ");
        }
        System.out.println();
        if(found == 1)
            System.out.println(num + " is found at index number " + pos);
        else
            System.out.println(num + " is not found in the array");
            
        }
    }
            