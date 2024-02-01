#include<iostream>
using namespace std;

namespace shape{
    namespace circle{
        int rad;
        double circumferenceCircle(){
            return 2*3.14*rad;
        }
        double areaCircle(){
            return 3.14*rad*rad;
        }
    }
    namespace rectangle{
        int len; 
        int width;
        int periRect(){
            return 2*(len+width);
        }
        int areaRect(){
            return width*len;
        }
    }
    namespace square{
        int side;
        int periSquare(){
            return 4*side;

        }
        int areaSquare(){
            return side*side;
        }
    }
}
int main(){
    using namespace shape;
    circle::rad = 10;
    cout<<"Area of cicle: "<< circle::areaCircle()<<endl;
    cout<<"Circumference of circle: "<<circle::circumferenceCircle()<<endl;

    rectangle::len = 10;
    rectangle::width = 20;
    cout<<"Area of rectangle: "<<rectangle::areaRect()<<endl;
    cout<<"Perimeter of rectangle: "<<rectangle::periRect()<<endl;

    square::side = 7;
    cout<<"Area of square: "<<square::areaSquare()<<endl;
    cout<<"Perimeter of square: "<<square::periSquare()<<endl;


}