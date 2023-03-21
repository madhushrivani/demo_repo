#include <stdio.h>

int main()
{
    int marks[4]={23,55,67,45};

   // for (int i = 0; i < 4; i++)
    //{//
      //  printf("Enter the value of %d element of array\n", i);
      //  scanf("%d", &marks[i]);
    //}
    for (int i = 0; i < 4; i++)
    {
       printf("the value of %d element of array is %d\n", i, marks[i]);
    }
    
    //marks[0]=89;
    //printf("Marks of 1 studet is %d\n", marks[0]);
    //marks[0]=838;
    //marks[1]=544;
    //marks[2]=356;
    //marks[3]=646;
    //printf("Marks of 1 student is %d\n", marks[0]);
    return 0;
}