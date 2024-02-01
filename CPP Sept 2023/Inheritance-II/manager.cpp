#include<iostream>
#include"wageEmp.cpp"
using namespace std;

class Manager: public Employee
{
    int Ta;
    int Hra;
    public:
    void display();
    Manager();
    Manager(int,int,int,const char *,double);
    int calculateSalary();
};
void Manager::display(){
    Employee::display();
    cout<<"Travel Allounce: "<<Ta<<endl;
    cout<<"Home rent Allounce: "<<Hra<<endl;
    cout<<"Total Salary of manager with All Allounces: "<<calculateSalary();
}
Manager::Manager(int t,int h,int id,const char* nm, double sal):Employee(id,nm,sal){
    Ta = t;
    Hra = h;

}
Manager::Manager(){
    Ta = 0;
    Hra =0;
}
int Manager::calculateSalary(){
    int sal;
    sal = salary + Ta + Hra;
    return sal;
}

int main(){
    Manager m1(1000,5000,121,"SHubham",100000);
    m1.display();

}