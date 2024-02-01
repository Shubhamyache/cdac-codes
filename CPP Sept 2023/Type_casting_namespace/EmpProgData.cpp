#include<iostream>
#include<typeinfo>
using namespace std;

class Employee{
    char name[20];
    public:
    virtual void display(){cout<<"employee display function"<<endl;}
    virtual void test(){cout<<"emplpoyee test function"<<endl;}
    

};
class Programmer:public Employee{
    public:
    void display(){cout<<"programmer display function"<<endl;}
    void test(){cout<<"programmer test function"<<endl;}
    void codding(){cout<<"I'm an coder.!"<<endl;}
};
class DataBaseAdmin:public Employee{
    public:
    void display(){cout<<"Databaseadmin display function"<<endl;}
    void test(){cout<<"Databaseadmin test function"<<endl;}
    void createDatabase(){cout<<"Creating admin.!"<<endl;}

};
class SystemAdmin:public Employee{
    public:
     void display(){cout<<"SystemAdmin display function"<<endl;}
      void test(){cout<<"SystemAdmin test function"<<endl;}
      void sysupdate(){cout<<"Updating system.!"<<endl;}
};
void Check(Employee**);
int main()
{
    Employee *e[5];
    e[0]=new Programmer();
    e[1]=new DataBaseAdmin();
    e[2]=new SystemAdmin();
    for(int i=0;i<3;i++)
    {
        e[i]->display();
        e[i]->test();
    }
    //make employee into programmer
    Programmer *p=dynamic_cast<Programmer*>(e[0]);
    p->codding();
    
    DataBaseAdmin *d=dynamic_cast<DataBaseAdmin*>(e[1]);
    d->createDatabase();
    
    SystemAdmin *s=dynamic_cast<SystemAdmin*>(e[2]);
    s->sysupdate();
    Check(e);
return 0;    
}
void Check(Employee **es)
{
    for(int i=0;i<3;i++)
    cout<<typeid(es[i]).name()<<endl;

}