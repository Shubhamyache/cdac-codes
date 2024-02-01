#include<iostream>
using namespace std;
class Complex
{
    int real;
    int imag;
    public:
    friend Complex operator+(int,Complex&);
    Complex();
    Complex(int , int);
    void accept();
    void display() const; 
};
Complex operator+(int num, Complex &obj);


Complex operator+(int num, Complex &obj){
    Complex temp;
    temp.real = num + obj.real;
    temp.imag = obj.imag;
    return temp;

}
Complex::Complex(){
    real = 1;
    imag = 1;

}
Complex::Complex(int a,int b){
    real = a;
    imag = b;
    
}

void  Complex ::display() const 
{
    cout<<"Real: "<<real<<" "<<"Imaginary: "<<imag<<endl;
}

int main()
{
    Complex c1(10,20);
    Complex c2;
    c2 = 5+c1;
    c2.display();
   
}