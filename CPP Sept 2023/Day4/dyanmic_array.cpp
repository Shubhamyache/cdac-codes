#include<iostream>
using namespace std;
int maxElement(int array[], int );
int minElement(int array[], int );

int main()
{
    int input;
    int arraySize;
    int *new_array;
    cout<<"enter array size: ";
    cin>>arraySize;
    new_array = new int[arraySize];
    cout<<"Enter "<<arraySize<<" Elements: "<<endl;
    for(int i=0;i<arraySize;i++){
        cin>>input;
        new_array[i] = input;
    }
    cout<<"New Array is: ";
    for(int i=0;i<arraySize;i++){
        
        cout<<new_array[i]<<" ";

    }
    cout<<"\n";
    cout<<"Max Element: "<<maxElement(new_array,arraySize)<<endl;
    cout<<"Min Element: "<<minElement(new_array, arraySize);

}
int maxElement(int array[], int size){
    int max = array[0];
    for(int i =1;i<size;i++ ){
        if(array[i]>max){
            max = array[i];
        }
    }
    return max;

}
int minElement(int array[], int size){
    int min = array[0];
    for(int i =1;i<size;i++ ){
        if(array[i]<min){
            min = array[i];
        }
    }
    return min;

}