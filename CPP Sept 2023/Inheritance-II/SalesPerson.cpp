#include"wageEmp.cpp"
#include<iostream>
#include<string.h>
using namespace std;
class SalesPerson: public Employee
{

    int sales;
    double commision;
    public:
    void display();
    SalesPerson();
    SalesPerson(int,double,int,const char*,double);
    int calculateSalary();

};

int SalesPerson::calculateSalary(){

    int newSalary;
    newSalary = salary + sales*commision;
    return newSalary;

}
SalesPerson::SalesPerson(int sls,double comm,int id,const char* nm,double sal):Employee(id,nm,sal){

    sales = sls;
    commision = comm;

}
SalesPerson::SalesPerson(){

    sales = 0;
    commision = 0;

}
void SalesPerson::display(){

    Employee::display();
    cout<<"Number of sales: "<<sales<<endl;
    cout<<"Commission : "<<commision<<endl;
    cout<<"SalesPerson Salary: "<<calculateSalary()<<endl;

}

// int main(){
//     SalesPerson s1(100, 10,11,"ajay",20000);
//     s1.display();

// }
