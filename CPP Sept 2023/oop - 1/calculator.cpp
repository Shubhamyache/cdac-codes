#include<iostream>
using namespace std;
class Calculator{
    int no1;
    int no2;
    public:
    void accept();
    void display();
    int addition();
    int substraction();
    int multiplication();
    int division();

};
void Calculator:: accept(){
    cout<<"Enter two numbers: ";
    cin>>no1>>no2;
}
void Calculator::display(){
    cout<<"No1: "<<no1<<" "<<"No2: "<<no2<<endl;

}
int Calculator::addition(){
    cout<<"Addition: "<< no1+no2<<endl;
}
int Calculator::substraction(){
    cout<<"Substraction: "<< no1-no2<<endl;

}
int Calculator::multiplication(){
    cout<<"Multiplication: "<< no1*no2<<endl;

}
int Calculator::division(){
    cout<<"Division: "<< no1/no2<<endl;
}
int main(){
    Calculator c1;
    c1.accept();
    c1.display();
    c1.addition();
    c1.substraction();
    c1.multiplication();
    c1.division();
    return 0;
}