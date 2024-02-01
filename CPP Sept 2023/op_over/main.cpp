#include"operator_overlaoding.cpp"
int main()
{
    Complex c1(1,2);
    Complex c2(1,2);
    Complex c3;
    {
    c3 = c1 + c2;
    cout<<"Addition: "<<endl;
    c3.display();
    }

    {   Complex c4;
        c4 = c1 - c2;
        cout<<"Substraction: "<<endl;
        c4.display();
    }

    {
        Complex c5;
        c5 = c1*c2;
        cout<<"Multiplication: "<<endl;
        c5.display();
    }

    {
        Complex c6;
        c6 =c1++;
        cout<<"post Increment: "<<endl;
        c6.display();
    }

    {
        Complex c7;
        c7 = ++c2;
        cout<<"Pre Increment: "<<endl;
        c7.display();
    }

}