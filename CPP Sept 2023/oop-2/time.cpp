#include<iostream>
using namespace std;
class Time
{
    int hour, minute, second;
    public:
    Time();
    Time(int,int,int);
    Time(int, int = 10);
    void display();

};
Time::Time(int h,int m ){
    hour = h;
    minute = m;
}

Time::Time(){ 
        hour = minute=second = 10;
    }

Time::Time(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }

void Time::display(){
        cout<<"Time: "<<hour<<":"<<minute<<":"<<second<<endl;
    }

int main(){
    Time t1;
    t1.display();

    Time t2(10,10,01);
    t2.display();

    Time t3(20);
    t3.display();
   
}
