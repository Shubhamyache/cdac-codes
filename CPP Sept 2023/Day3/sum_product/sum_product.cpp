#include<iostream>
using namespace std;
int sum(int , int );
int product(int, int);
int main(){
    int num1;
    int num2;
    cout<<"enter two numbers"<<endl;
    cin>>num1>>num2;
    cout<<"The sum of these numbers is: "<<sum(num1, num2)<<endl;
    cout<<"The product of these numbers is: "<<product(num1, num2)<<endl;

}
int sum(int a , int b){
    return a + b;
}
int product(int a, int b){
    return a*b;
}