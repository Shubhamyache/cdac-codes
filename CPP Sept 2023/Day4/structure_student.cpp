#include<iostream>
using namespace std;

typedef struct student
{
    char sname[20];
    int sroll;
    int marks;

    void accept(){
        cout<<"Enter name, roll number, marks: ";
        cin>>sname>>sroll>>marks;
        
    }
    void display(){
        cout<<"Name: "<<sname<<"Roll no: "<<sroll<<"Marks: "<<marks<<endl;
    }

}stud;
int getMaxMarks(stud s[],int size);

int main(){
    int i;
    stud s[5];
    int result;
    for(int i = 0; i<5; i++){
        s[i].accept();
        
    }
    for(int i = 0; i<5; i++){
        s[i].display();      
    }
    
    for(int i = 0; i<5;i++){
        if(s[i].marks == result){
            cout<<"Name: "<<s[i].sname<<endl;
            cout<<"roll : "<<s[i].sroll<<endl;
            cout<<"Marks: "<<s[i].marks<<endl;
            break;
        }
    }

    cout<<"maximum marks obtained by student is: "<<result;
    
    return 0;
}
int getMaxMarks(stud s[],int size){
    int max = s[0].marks;
    stud temp;
    for(int i=0;i<size;i++){
        if(s[i].marks>max){
            max = s[i].marks;
            temp = s[i];

        }
    }
    return max;
}
