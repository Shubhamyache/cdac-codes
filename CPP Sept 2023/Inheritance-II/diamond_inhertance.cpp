#include<iostream>
#include<string.h>
using namespace std;
class Person{
    char name[20];
    int age;
    public:
    Person();
    Person(const char*, int);
    void display();

};
void Person::display(){
    cout<<"Person Details:"<<endl;
    cout<<"Name: "<<name<<endl;
    cout<<"Age: "<<age<<endl;
}
Person::Person(const char* nm, int a){
    strcpy(name, nm);
    age = a;
}
Person::Person(){
    strcpy(name,"NA");
    age = 0;
}

class Employee:public Person
{
    int eid;
    int salary;
    public:
    void display();
    Employee();
    Employee(int,int);
    Employee(int , int, const char*,int);
};
Employee::Employee(int ed,int sal,const char* ,int){
    eid = ed;
    salary = sal;
}
void Employee::display(){
    cout<<"Employee Details: "<<endl;
    Person::display();
    cout<<"Eid: "<<eid<<endl;
    cout<<"Salary: "<<salary<<endl;
}

Employee::Employee(){
    eid = 0;
    salary = 0;

}

Employee :: Employee(int id,int sal,const char* n,int a):Person(n,a){
    eid = id;
    salary = sal;
}

class Student:public Person{
   int rollNum;
    int age;
    public:
    Student();
    Student(const char*,int,int);
    Student(int,int,const char*,int);
    void display();
};
Student::Student(const char* nm,int rn, int ag):Person(nm,ag){
    
    rollNum = rn;
    age = ag;

}

Student:: Student(int rnum, int a,const char* nm, int sal):Person(nm,age){

    rollNum = rnum;
    age = a;

}

Student::Student(){
    rollNum = 0;
    age = 0;
}

void Student::display(){
   
    Person::display();
    cout<<"Student Details: "<<endl;
    cout<<"Student Roll number: "<<rollNum<<endl;
    cout<<"Student Age: "<<age<<endl;
}

class StudEmp:public Employee, public Student
{
    int adharNum;
    int studEmpId;
    public:
    //void display();
    StudEmp();
    StudEmp(int,int,int,int,int,int,const char*);
};
// void StudEmp::display(){
//     Student::display();
//     Employee::display();
//     cout<<"Adhar Number: "<<adharNum<<endl;
//     cout<<"Student Employee id: "<<studEmpId<<endl;
// }
StudEmp::StudEmp(){}
StudEmp::StudEmp(int adhar,int seId,int rNum,int a,int Empid,int sal,const char*nm):Student(nm,rNum,a), Employee(Empid,sal){
    adharNum = adhar;
    studEmpId = seId;

}


int main()
{
    StudEmp s1(12345,45,18,23,101,100000,"Shubham");
    s1.Employee::display();

}