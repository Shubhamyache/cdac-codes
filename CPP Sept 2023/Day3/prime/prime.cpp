#include<iostream>
using namespace std;
int main(){
    int number;
    int i;
    cout<<"Enter a positive number: ";
    cin>>number;

    if(number==1){
        cout<<"one is neither prime nor composite.";
    }
    else{
        for(i = 2; i<number;i++){
            if(number%i==0){
                cout<<"The number is not prime";
                break;
            }
        }
        if(number == i){
            printf("The number is prime number.");
        }
    }

}