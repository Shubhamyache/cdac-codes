#include<stdio.h>
int diff_max_min(int arr[], int size);
int main(){
    int arr[5];
    int result;
    printf("enter 5 elements in array: ");
    for(int i =0; i<5; i++){
        scanf("%d", &arr[i]);
    }
    result = diff_max_min(arr, 5);
    printf("The difference between max and min is %d",  result);

}
int diff_max_min(int arr[], int size){
    int max = arr[0];
    int min = arr[0];
    int diff;
        
    for(int i = 1; i<size; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        else{
            if(arr[i]<min){
            min = arr[i];
        }}
        diff = max - min;
        return diff;
    }
}