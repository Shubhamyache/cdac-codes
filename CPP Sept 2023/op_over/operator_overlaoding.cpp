#include"operator_overloading.h"

Complex :: Complex()
{
    real = imag = 0;
}

Complex :: Complex(int a, int b)
{
    real = a;
    imag = b;
}

void Complex::display()
{
    if(imag<0){
    cout<<"["<<real<<imag<<"i]"<<endl;
    }
    else
    cout<<"["<<real<<"+"<<imag<<"i]"<<endl;
}

Complex Complex :: operator+(Complex &o)
    {
        Complex temp;
        temp.real = this->real + o.real;
        temp.imag = this->imag + o.imag;
        return temp;
    }

Complex Complex::operator-(Complex &o)
{
    Complex temp;
    temp.real = this->real - o.real;
    temp.imag = this->imag - o.imag;
    return temp;
}
Complex Complex::operator*(Complex &o)
{
    Complex temp;
    temp.real = this->real * o.real;
    temp.imag = this->imag * o.imag;
    return temp;
}

Complex Complex::operator++(int a)
{
    Complex temp;

    temp.real = this->real ++;
    temp.imag = this->imag ++;
    return temp;
}

Complex Complex::operator++()
{
    Complex temp;
    temp.real = ++this->real ;
    temp.imag = ++this->imag ;
   return temp;
}
