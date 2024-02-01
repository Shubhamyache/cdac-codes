#include<iostream>
using namespace std;
typedef struct employee
{
    int eid;
    char ename[20];
    int salary;
    void accept(){
        cout<<"Enter Employee id, name and salary: ";
        cin>>eid>>ename>>salary;
    }
    void display(){
        cout<<"Eid: "<<eid<<"  Ename: "<<ename<<"  Salary: "<<salary<<endl;
    }
}emp;
int main(){
    emp e[5];
    for(int i = 0;i<5;i++){
        e[i].accept();

    }
    for (int  i = 0; i < 5; i++)
    {
        e[i].display();
    }
    

}
