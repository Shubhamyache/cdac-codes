#include<iostream>
using namespace std;
typedef struct student
{
    char name[20];
    int roll;
    int marks;
    void accept(){
        cout<<"Enter name , roll number and marks: ";
        cin>>name>>roll>>marks;
    }
    void display(){
        cout<<"Name: "<<name<<"Roll no: "<<roll<<"Marks: "<<marks<<endl;
    }
    
}st;

st getMaxMarks(st[], int);

int main()
{
    st *s;
    s = new st[5];
    for(int i =0;i<5;i++){
        s[i].accept();
    }
    for(int i = 0;i<5;i++){
        s[i].display();
    }
    st temp = getMaxMarks(s,5);

    temp.display();
    delete[] s;

}
st getMaxMarks(st s[], int size){
    int i;
    int max_temp = 0;
    st temp;
    for( i = 0; i<size; i++){
        if(s[i].marks()>max_temp){
            max_temp=s[i].marks;
            temp = s[i];
        }
    }
    return temp;

}