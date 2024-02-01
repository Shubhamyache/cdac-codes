#include<iostream>
using namespace std;
class Box
{
    int length;
    int width;
    int depth;

    public:

    void display();
    int volume();
    Box();
    Box(int,int,int);
    bool operator<(Box &obj);
    bool operator>(Box &obj);
    bool operator==(Box &obj);
    
};
bool Box::operator==(Box &obj){
    if(this->volume()==obj.volume()){
        return true;
    }
    else
    return false;

}

Box::Box(){
    length = width = depth=1;
}
Box::Box(int l,int w, int d){
    length = l;
    width = w;
    depth = d;
}
bool Box::operator<(Box &obj){
    if(this->volume()<obj.volume()){
        return true;
    }
    else
    return false;
}

bool Box::operator>(Box &obj){
    if(this->volume()>obj.volume()){
        return true;
    }
    else
    return false;
}
int Box::volume(){
    return length*width*depth;
}
void Box::display(){
    cout<<"The volume of box is: "<<volume();

}

int main(){
    Box b1(10,20,30);
    Box b2(30,40,50);
    if(b1==b2){
        cout<<"Box b1 and Box b2 is have same volume."<<endl;
    }
    else{
        cout<<"Boxes have different volume."<<endl;
    }
    if(b2>b1){
        cout<<"Box b2 is greater than b1."<<endl;
    }
    else{
        cout<<"Box b1 is greater than b2. "<<endl;
    }
    if(b1>b2){
        cout<<"Box b1 is greater than b2. "<<endl;
    }
    else{
        cout<<"Box b2 is greater than b1"<<endl;
    }

}