#include<iostream>
using namespace std;

class date{
    int day;
    int month;
    int year;
    public: 
    void  accept(){
        cout<<"enter day, month, year: ";
        cin>>day>>month>>year;

    }
    public:
    void display(){
        cout<<"Day: "<<day<<" Month: "<<month<<" Year: "<<year<<endl;
    }
    public:
    void setDate(int a, int b, int c){
        day = a;
        month = b;
        year = c;
    }
    public:
    void getDate(){
        cout<<"getData date is : ";
        cout<<day<<"/"<<month<<"/"<<year;
    }


};
int main(){
    date d;
    d.accept();
    d.display();
    d.setDate(1,2,3000);
    d.getDate();
}
