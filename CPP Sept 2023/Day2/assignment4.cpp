#include<stdio.h>
int average_of_array(int[], int size);
int main()
{
    int array[5];
    int result;
    printf("Enter 5 elements in array: ");
    for(int i=0; i<5;i++)
    {
        scanf("%d",&array[i]);
    }
    result = average_of_array(array, 5);
    printf("The average of array elements is %d: ", result);

}
int average_of_array(int array[], int size){
    int sum = 0;
    int average = 0;
    for(int i=0; i<=size;i++)
    {
        sum = sum + array[i];
    }
    average = sum/size;
    return average;

}