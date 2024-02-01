#include<iostream>
using namespace std;
template <class T>
bool search( T arr[],int size, T key){
    for(int i=0;i<size;i++){
        if(arr[i]==key){
            return true;
        }
        else
        return false;
    }
}
int main(){
    int arr[5]={1,2,3,4,7};
    int key = 38;
    bool isKey = search(arr,5,key);

    if(isKey){
        cout<<"Key is present in array.";
    }
    else{
        cout<<"Key is not present in array: ";
    }

}