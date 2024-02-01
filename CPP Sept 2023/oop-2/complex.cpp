#include<iostream>
using namespace std;
class Complex
{
    int real;
    int imag;
    public:
    Complex();
    Complex(int , int);
    void accept();
    void display() const;
    int getReal() const;
    int getImag() const;
};
Complex::Complex(){
    real = 1;
    imag = 1;

}
Complex::Complex(int a,int b){
    real = a;
    imag = b;
    
}
void Complex:: accept()
{
        cout<<"Enter two values real and imaginary: ";
        cin>>real>>imag;
}

void  Complex ::display() const 
{
    cout<<"Real: "<<real<<" "<<"Imaginary: "<<imag<<endl;
}

int Complex::getReal() const
{
    return real;
}
int Complex::getImag() const
{
    return imag;
}
int main(){
    Complex c1;
    c1.accept();
    cout<<"\n";
    cout<<c1.getReal()<<endl;
    cout<<c1.getImag();

    return 0;
}