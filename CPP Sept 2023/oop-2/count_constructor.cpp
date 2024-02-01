#include<iostream>
using namespace std;
class Complex{
    int real;
    int imag;

    static int count;

    public:
    Complex();
    Complex(int, int);
    void display();
    void displayCount();

};
void Complex::displayCount(){
    cout<<"The count is: "<<count<<endl;
}
void Complex:: display()
{
    if(imag<0)
    cout<<"The complex number is: "<<real<<imag<<"i"<<endl;
    else
    cout<<"The complex number is: "<<real<<"+"<<real<<endl;
}

int Complex :: count=0;
Complex::Complex(){
    real = imag = 1;
    count = count +1;
}
Complex::Complex(int a, int b){
    real = a;
    imag = b;
    count++;
}

int main(){
    Complex c1;
    c1.display();
    c1.displayCount();
    
    Complex c2(10,20);
    c2.display();
    c2.displayCount();

}
