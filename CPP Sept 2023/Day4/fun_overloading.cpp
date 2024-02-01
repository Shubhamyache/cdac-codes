#include<iostream>
using namespace std;
int mul(int, int);
int mul(int, int, int);
float mul(int, float);
int main(){
    int a=10;
    int b=20;
    int c=30;
    float d = 50.87;
    
   
    int result = mul(a,b);
    int result2 = mul(a,b,c);
    float result3 = mul(a,d);
    cout<<a<< "*"<<b<<"="<<result<<endl;
    cout<<a<<"*"<<b<<"*"<<c<<"="<<result2<<endl;
    cout<<a<<"*"<<b<<"="<<result3<<endl;

}
int mul(int a, int b){
    return a*b;
}
int mul(int a, int b, int c){
    return a*b*c;
}
float mul(int a, float b){
    return a*b;
}