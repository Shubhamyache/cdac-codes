#include<iostream>
using namespace std;
void change(int n1,int n2=01,int n3=10){
    cout<<n1+n2+n3;
}
void change(int n1,int n2){
    cout<<n1+n2;
}
int main(){
    int a = 10;
    int &ref1 = a;
    //int &ref2 = &ref1; // this is not allowed
    cout<<ref2;
  
  
}