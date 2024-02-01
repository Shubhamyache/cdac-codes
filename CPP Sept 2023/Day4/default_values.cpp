#include<iostream>
using namespace std;
int addition(int , int , int =55);
int multiplication(int , int , int );
int main(){
    int num1 = 10;
    int num2 = 20;
    int num3= 30;
    cout<<"Addition is :"<<addition(num1, num2)<<endl;
    cout<<"Multiplication is: "<<multiplication(num1, num2, num3);
    return 0;
}
int addition(int a, int b, int c){
    return a+b+c;
}
int multiplication(int a, int b, int c){
    return a*b*c;
}