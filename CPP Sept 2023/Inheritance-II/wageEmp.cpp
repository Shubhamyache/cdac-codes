#include<iostream>
#include<string.h>
using namespace std;
class Employee{
    int eid;
    char name[20];
    protected:
    double salary;
    public:
    Employee();
    Employee(int,const char *, double);
    void display();
};
void Employee::display(){
    cout<<"Eid: "<<eid<<endl;
    cout<<"Name: "<<name<<endl;

}
Employee::Employee(){
    eid=0;
    strcpy(name,"NA");
    salary = 0;
}

Employee::Employee(int e,const char * nm,double sal){
    eid = e;
    strcpy(name,nm);
    salary = sal;
}
class WageEmployee:public Employee
{
    double hours;
    double rate;
    public:
    int calculateSalary();
    void display();
    WageEmployee();
    WageEmployee(double, double,int, const char*,double);
};
int WageEmployee::calculateSalary(){
    int final_salary;
    final_salary = salary + hours*rate;
    return final_salary;
}

void WageEmployee::display(){
    Employee::display();
    cout<<"Hours: "<<hours<<endl;
    cout<<"Rate: "<<rate<<endl;
    cout<<"Wage employee salary: "<<calculateSalary();
}

WageEmployee::WageEmployee(){
        hours = 0;
        rate = 0;
    }

WageEmployee::WageEmployee(double h,double r,int e,const char* sname,double sal):Employee(e,sname,sal){
    hours = h;
    rate = r;
}

int main(){
    WageEmployee e1(10,200,1,"shubham",100000);
    e1.display();

}