#include<iostream>
using namespace std;
class Date{
    int day;
    int month;
    int year;
    public:
    Date();
    Date(int,int,int);
    void display();
};
void Date:: display(){
        cout<<day<<"/"<<month<<"/"<<year<<endl;
    }

Date::Date(){
    day = month = 1;
    year=2023;    
}

Date::Date(int d,int m,int y){
    day = d;
    month = m;
    year = y;
}

int main()
{
    Date d1;
    d1.display();

    Date d2(1,2,2000);
    d2.display();   
}
