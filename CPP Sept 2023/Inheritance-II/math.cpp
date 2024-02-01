#include<iostream>
using namespace std;
class Math1
{
    public:
    void addition(int a, int b){
        cout<<"Addition: "<<a<<" + "<<b<<" = "<<a+b<<endl;
    }

    void substraction(int a, int b){
        cout<<"Substraction: "<<a<<" - "<<b<<" = "<<a-b<<endl;
    }

    void Area(int r){
        cout<<"Area: "<<3.14*r*r<<endl;
    }
};

class Math2
{
    public:
    void multiplication(int a, int b){
        cout<<"multiplication: "<<a<<" * "<<b<<" = "<<a*b<<endl;
    }
    void division(int a, int b){
        cout<<"division: "<<a<<" / "<<b<<" = "<<a/b<<endl;
    }
    void Area(int s){
        cout<<"Area: "<<s*s<<endl;
    }
};

class Calculate: public Math1, public Math2{


};
int main(){
    Calculate c1;
    c1.addition(10,5);
    c1.substraction(20,5);
    //c1.Area(7); it will create ambiguity
    c1.Math1::Area(7);
    cout<<endl;
    Calculate c2;
    c2.multiplication(20,30);
    c2.division(40,8);
    c2.Math2::Area(9);



}
