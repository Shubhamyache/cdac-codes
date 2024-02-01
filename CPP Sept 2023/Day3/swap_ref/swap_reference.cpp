#include<iostream>
void swap(int &a, int &b);
using namespace std;
int main(){
    
    int num1=10;
    int num2=20;
    cout<<num1<<" "<<num2<<endl;
    swap(num1, num2);
    cout<<num1 <<" "<<num2<<endl;

}
void swap(int &a, int &b){
    int temp;
    temp = a;
    a = b;
    b = temp;
}

