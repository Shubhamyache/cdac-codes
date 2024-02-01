#include<iostream>
#include<string.h>
using namespace std;

class cString
{
    int length;
    char *name;                                              
    public:
    void display();
    cString();
    cString(const char *);
    cString(cString &obj);
    ~cString();
};
cString::~cString(){
    delete[] name;
}
cString ::cString(cString &obj){
    this->length = obj.length;
    this->name = new char[this->length + 1];
    strcpy(this->name,obj.name);

}

void cString:: display(){
    cout<<"Length: "<<length<<" Name: "<<name<<endl;
}

cString::cString(){
    length = 1;
    strcpy(name, "NA");
}

cString::cString(const char* str){
    length = strlen(str);
    this->name = new char[this->length + 1];
    strcpy(this->name, str);
}

class Date
{
    int day;
    int month;
    int year;
    
    public:
    void display();
    Date();
    Date(int d,int m, int y);
};
void Date::display(){
    cout<<"Date: "<<day<<"/"<<month<<"/"<<year<<endl;
}
Date::Date(){
    day = month =1;
    year = 2023;
}
Date::Date(int d, int m, int y){
    day = d;
    month = m;
    year =y;
}

class Person
{
    cString name;
    Date bdate;
    public:
    void display();
    Person();
    Person(const char*, int,int,int);
    Person(const char*, Date d);

};
Person::Person(const char * str, Date d):name(str),bdate(d)
{
    
}
void Person::display(){
    name.display();
    bdate.display();
}

Person::Person(){

}
Person::Person(const char* str, int d, int m, int y):name(str),bdate(d,m,y)
{

}

int main(){

    cString c1("shubham");
    Date b1(1,2,2000);

    Person p1("shubham", 1,2,2000);
    p1.display();

    Person p2("Rohit", b1);
    p2.display();

}