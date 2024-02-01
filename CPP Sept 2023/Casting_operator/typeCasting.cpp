#include<iostream>
#include<stdio.h>
using namespace std;
class Base
{
    public:
    virtual void Accept()
    {
        cout<<"\n\n\t Accept In Base Class";
    }
    virtual void Display()
    {
        cout<<"\n\n\t Display In Base Class";
    }
};
class Derive1:public Base{

     void Accept()
    {
        cout<<"\n\n\t Accept In Derive1 Class";
    }
     void Display()
    {
        cout<<"\n\n\t Display In Derive1 Class";
    }
};
class Derive2:public Base{

public:
     void Accept()
    {
        cout<<"\n\n\t Accept In Derive2 Class";
    }
     void Display()
    {
        cout<<"\n\n\t Display In Derive2 Class";
    }
    void Test()
    {
        cout<<"\n\n\t Only In Derive 2";
    }
};
class Derive3:public Base{
public:
     void Accept()
    {
        cout<<"\n\n\t Accept In Derive3 Class";
    }
     void Display()
    {
        cout<<"\n\n\t Display In Derive3 Class";
    }
};
int main()
{
     int a=10;
     int const*p=&a;
     int *ptr;
     //ptr=p;
     ptr=const_cast<int*>(p);
     *ptr=30;
     cout<<"\n\n\t A: "<<a;


   
}