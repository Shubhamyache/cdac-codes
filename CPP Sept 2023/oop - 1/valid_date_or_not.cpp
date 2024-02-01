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
        cout<<"Day: "<<day<<" Month: "<<month<<" Year: "<<year;
    }
    int getDay();
    int getMonth();
    void setDate(int a, int b, int c);
    void getDate();

};
void date:: setDate(int a, int b, int c){
        day = a;
        month = b;
        year = c;
    }
    
void date:: getDate(){
        cout<<day<<"/"<<month<<"/"<<year;
    }

int date:: getDay(){
    return day;
}
int date:: getMonth(){
    return month;
}

int main(){
    
    date d;
    d.accept();
    int day = d.getDay();
    int month = d.getMonth();

    if((day>=1 && day <= 31)&&(month>=1 && month<=12)){
        cout<<"This is an valid date..";
    }
    else{
        cout<<"This is invalid date.";
    }

}
