#include<iostream>
#include<string.h>
using namespace std;
class Date
{
private:
    int day,month,year;
    
public:
    void display();
    Date();
    Date(int,int,int);
    
};
void Date:: display(){
    cout<<"Date: "<<day<<"/"<<month<<"/"<<year<<endl;
}

Date::Date()
{
}
Date::Date(int d, int m, int y)
{
    day = d; 
    month = m;
    year = y;
}
class cString
{
    int length;
    char *str;                                              
    public:
    void display();
    cString();
    cString(const char *);
    cString(cString &obj);
    cString operator=(cString &obj);
    ~cString();
};
cString cString::operator=(cString &obj){
    this->length = obj.length;
    this->str = new char[this->length =1];
    strcpy(this->str, obj.str);
    return *this;
}
cString::~cString(){
    delete[] str;
}
cString ::cString(cString &obj){
    this->length = obj.length;
    this->str = new char[this->length + 1];
    strcpy(this->str,obj.str);
}

void cString:: display(){
    cout<<"Length: "<<length<<" Name: "<<str<<endl;
}

cString::cString(){
    length = 1;
    strcpy(str, "NA");
}

cString::cString(const char* str){
    length = strlen(str);
    this->str = new char[this->length + 1];
    strcpy(this->str, str);
}
class Person{
    cString name;
    Date date;
    public:
    void display();
    Person();
    Person(const char*, int,int,int);
};
Person::Person(const char* nm, int d, int m, int y): name(nm), date(d,m,y){

}
void Person::display(){
    name.display();
    date.display();
}

Person::Person(): name("NA"){}

class Employee:public Person{
    int empid;
    int salary;
    public:
    void display();
    Employee();
    Employee(int,int,const char* nm, int d, int m, int y);
};

Employee::Employee(int id,int sal,const char* nm, int d, int m, int y):Person(nm,d,m,y){
    empid = id;
    salary = sal;
}

void Employee::display(){
    cout<<"Emp id: "<<empid<<" salary "<<salary<<endl; 
    Person::display();
}

Employee::Employee(){
    empid = 1;
    salary = 100;
}

int main(){

    Employee e1(1,200000,"Shubham",1,2,2000);
    e1.display();
}




    
