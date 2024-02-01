#include<iostream>
#include<string.h>
using namespace std;
class Person{
    char name[20];
    int age;
    public:

    virtual void display(); //the reason to create this function as virtual because if we create an 
                            //pointer array of type base in this case Person, and store derived classes
                            // in it like employee, salesperson.. but when we call display function 
                            //then only Person class display function get called which will display only 
                            //name and age to avoid that we declare it as virtual function. now this solves
                            // the problem and calles the respective objects display function to display data.
    Person();
    Person(const char*,int);
};
Person::Person(){
    strcpy(name,"NA");
    age = 0;
}
Person::Person(const char* nm, int a){
    strcpy(name, nm);
    age = a;
}
void Person::display(){
    cout<<"Name: "<<name<<endl;
    cout<<"Age: "<<age<<endl;
}

class Employee:public Person{
    
    char department[10];
    int Eid;
    int salary;

    public:
    void CalSalary();
    void display();
    Employee();
    Employee(const char *, int,int,const char* , int );
};
void Employee::CalSalary(){
    cout<<"The total Employee salary: "<<salary<<endl;
}

Employee::Employee(const char* dpart,int id,int sal,const char* nm, int a):Person(nm,a){
    strcpy(department,dpart);
    salary = sal;
    Eid = id;
}
Employee::Employee(){
    strcpy(department,"NA");
    Eid = 0;
}
void Employee::display(){
    Person::display();
    cout<<"Department: "<<department<<endl;
    cout<<"Employee ID: "<<Eid<<endl;
   CalSalary();
}

class SalesPerson:public Person{
    
    int NumOfSales;
    int commission;
    int salary;

    public:
    void CalSalary();
    void display();
    SalesPerson();
    SalesPerson(int,int, int,const char* , int );
};
void SalesPerson::CalSalary(){
    cout<<"The Sales Person Salary is: "<<(salary + NumOfSales*commission) <<endl;
}

SalesPerson::SalesPerson(int num, int comm,int sal,const char* nm, int a):Person(nm,a){
    NumOfSales = num;
    commission = comm;
    salary =sal;
}
SalesPerson::SalesPerson(){
    NumOfSales = 0;
    commission = 0;
}
void SalesPerson::display(){
    Person::display();
    cout<<"Number of sales: "<<NumOfSales<<endl;
    cout<<"Commision: "<<commission<<endl;
    CalSalary();
}

int main(){
    Person *p[3];
    p[0]=new Person("shubham",23);
    p[1] = new Employee("CSE",121,100000,"Rohit",22);
    p[2]= new SalesPerson(200,50,50000,"Ajay",24);

    p[0]->display();
    p[1]->display();
    p[2]->display();
}
