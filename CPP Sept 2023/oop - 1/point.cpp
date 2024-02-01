#include<iostream>
using namespace std;
class Point{
    int x;
    int y;
    public:
    void accept();
    void display();
};
void Point:: accept(){
        int a,b;
        cout<<"Enter x and y cordinates: ";
        cin>>a>>b;
        x = a;
        y = b;

    }
void Point:: display(){
        cout<<"["<<x<<","<<y<<"]"<<endl;
    }
int main()
{
    Point p1;
    p1.accept();
    p1.display();


}