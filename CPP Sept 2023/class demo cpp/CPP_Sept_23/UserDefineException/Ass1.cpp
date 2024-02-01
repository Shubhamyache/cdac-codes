
#include<iostream>
#include<string.h>
using namespace std;
class FailStudent:public exception
{
    
    public:
    
    const char* what()
    {
        return "Student Fail ";
    }
};
class Student
{
    int rno;
    char name[20];
    double per;
    public:
    Student()
    {
        rno=1;
        strcpy(name,"NA");
        per=0;
    }
    Student(int r,const char *nm,double pr)
    {
        rno=r;
        strcpy(name,nm);
        per=pr;
    }
    void Display()
    {
        cout<<"\n\n\t Rno : "<<rno;
        cout<<"\n\t Name : "<<name;
        cout<<"\n\t Per  : "<<per;
        if(per<40)
        throw FailStudent();
        else
        cout<<"\n\n\t Student Is PASS ";
    }
};
int main()
{
    Student s11(3,"S",54);
    Student s1(101,"Seeta",60.7);
    Student s2(103,"geeta",20.5);
    Student s3(102,"neeta",67.4);
    Student s4(105,"meeta",40.3);
    Student s5(106,"Sangeeta",30.3);
    try
    {
       s1.Display();
       s5.Display();
       s2.Display();
       s3.Display();
       s4.Display();
    }
    catch(FailStudent e)
    {
        cout<<e.what();
    }
    /*try
    {
       s3.Display();
    }
    catch(FailStudent e)
    {
        cout<<e.what();
    }
    try
    {
       s4.Display();
    }
    catch(FailStudent e)
    {
        cout<<e.what();
    }
    try
    {
       s5.Display();
    }
    catch(FailStudent e)
    {
        cout<<e.what();
    }
try
    {
       s2.Display();
    }
    catch(FailStudent e)
    {
        cout<<e.what();
    }*/
    cout<<"\n\n\t End Of Main";
}