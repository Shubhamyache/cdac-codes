#include<iostream>
using namespace std;
typedef struct department
{
    int did;
    char dname[20];

    void accept(){
        cout<<"enter department id and department name: "<<endl;
        cin>>did>>dname;
    }
    void display(){
        cout<<"Did : "<<did<<"  Dname: "<<dname<<endl;

    }
};

int main(){
    department *departments;
    int choice=0;
    cout<<"How many departments you want: ";
    cin>>choice;
    departments = new department[choice];
    for(int i = 0;i<choice;i++){
          departments[i].accept();
    }
    cout<<"\n\n";
    for(int i = 0;i<choice;i++){
          departments[i].display();
    }

    delete []departments;
    delete departments;

}