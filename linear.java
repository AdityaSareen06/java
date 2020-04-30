import java.util.*;
class linear
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int pos = 0;
        int found = 0;
        int x[] = {63,17,96,38,3,43,35,82,57,90};
        
        System.out.println("Enter the number to be searched : ");
        num = sc.nextInt();
        for(int i = 0; i < 10; i++)
        {
            if(x[i] == num)
                {
                    found = 1;
                    pos = i;
                    break;
                }
            
        }
       System.out.println("The array is : ");
       for(int i = 0; i < 10; i++)
        {
            
              System.out.print(x[i] + " ");
        }
       System.out.println();
        if(found ==1)
            System.out.println("The number " + num + " was found at index number " + pos );
       else
            System.out.println("Not found in the array :( ");
 }
}