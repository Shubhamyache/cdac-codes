#include<iostream>
using namespace std;
class Date
{
    int day, month, year;
    public:
    Date();
    Date(int d,int y);
    Date(int d, int m, int y);
    void display();


};
void Date:: display(){
        cout<<"Date: "<<day<<"/"<<month<<"/"<<year<<endl;
    }
Date::Date(){
        day=month=1;
        year = 2023;
    }
Date::Date(int d, int y){
        day=month=d;
        year = y;
    }
Date::Date(int d, int m, int y){
        day=d;
        month=m;
        year=y;
    }

int main(){
    Date d1;
    d1.display();

    Date d2(1,2023);
    d2.display();

    Date d3(1,2,2023);
    d3.display();

    
}