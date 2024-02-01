#include<iostream>
#include<string.h>
using namespace std;
class Date
{
    int day;
    int month;
    int year;
    public:
    void display();
    Date();
    Date(int,int,int);

};
void Date::display(){
    cout<<"Date: "<<day<<"/"<<month<<"/"<<year<<endl;
}
Date::Date(){
    day=month = 1;
    year = 2023;
}
Date::Date(int d,int m,int y){
    day = d;
    month = m;
    year = y;
}
class Student
{
    
    int rollNum;
    char name[20];
    Date Bdate;
    Date Adate;
    public:
    void setDob(int,int,int);
    void display();
    Student();
    Student(int, char[],int,int,int,int,int,int);
};
void Student::setDob(int d, int m, int y){
    Bdate = Date(d,m,y);
} 


// void Student::accept(){
//     cout<<"Enter Roll Number and name: "<<endl;
//     cin>>rollNum>>name;
//     //cout<<"Enter date of birth: "<<endl;

// }
Student::Student(int r, char sname[],int d1,int m1,int y1,int d2,int m2,int y2):Bdate(d1,m1,y1),Adate(d2,m2,y2)
{
    rollNum = r;
    strcpy(name, sname);
}
Student::Student(){
    rollNum = 0;
    strcpy(name, "NA");
}
void Student:: display()
{
    cout<<"Roll Number: "<<rollNum<<" Name: "<<name<<endl;
}

int main()
{
    int rnum;
    char name[20];
    int d1,m1,y1;
    int d2,m2,y2;
    Student s1;
    s1.setDob(1,2,2000);
    s1.display();




    // Student *array_student = new Student[5];
    // for(int i = 0;i<5;i++){
    //     cout<<"Enter roll, name,day1,month1,year1,day2,month2,year2 of student: "<<endl;
    //     cin>>rnum>>name>>d1>>m1>>y1>>d2>>m2>>y2;
    //     array_student[i] = Student(rnum,name,d1,m1,y1,d2,m2,y2);
        
    // }
    // for(int i = 0;i<5;i++){
    //     array_student[i].display();  
    // }



}