#include<iostream>
#include<string.h>
using namespace std;

class Complex{
    int real;
    int imag;
    public:
    void display();
    Complex();
    Complex(int,int);
    Complex operator+(Complex &);
    Complex operator-(Complex &);
    Complex operator*(Complex &);
    Complex operator++(int);
    Complex operator++();
    Complex operator<(Complex &);
    Complex operator>(Complex &);
   
};