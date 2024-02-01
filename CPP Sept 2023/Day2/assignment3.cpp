#include<stdio.h>
int maxElement(int arr[], int size);
int main(){
    int arr[10];
    printf("Enter 10 numbers: ");
    for(int i = 0; i<10; i++){
        scanf("%d", &arr[i]);
    }
    int result;
    result = maxElement(arr, 10);
    printf("The maximum element in array is %d", result);
}
int maxElement(int arr[], int size){
    int i = 0;
    int max = arr[0];
    for(i = 1; i<size; i++)
    if(arr[i]>max)
    {
        max = arr[i];
    }
    return max;
}