#include<iostream>
using namespace std;
class Complex
{
    int real,img;
    public:
    Complex();
    Complex(int,int);
    void Display()const;
    Complex Add(Complex&);
    // overload + operator
    Complex operator+(Complex&);
    Complex operator-(Complex&);

};