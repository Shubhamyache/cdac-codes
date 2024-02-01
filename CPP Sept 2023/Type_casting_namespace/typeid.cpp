#include<iostream>
#include<typeinfo>
using namespace std;
class test{
    void display(){
        cout<<"This is an test class.";
    }
};
int main(){
    int a;
    char name[20]="rohit";
    int arr[5] = {1,2,3,4,5};
    cout<<"a: "<<typeid(a).name()<<endl;
    cout<<"name: "<<typeid(name).name()<<endl;
    cout<<"arr: "<<typeid(arr).name()<<endl;

}