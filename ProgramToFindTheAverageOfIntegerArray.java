//ProgramToFindTheAverageOfIntegerArray//

import java.util.*;
public class ProgramToFindTheAverageOfIntegerArray
{
    public static void main(String[] args) 
    {
    float sum=0;
    int i=0;
    int[] arr = {1, 2, 3, 4, 5};

    while(i<arr.length) 
    {
        sum=sum+arr[i];
       i++;
    }
    float average = sum/arr.length;
    System.out.println("Average of Array Integer is : "+average);
    }
}