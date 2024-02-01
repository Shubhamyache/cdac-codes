#include<iostream>
using namespace std;
class box{
    private:
    int height;
    int width;
    int depth;
    public:
    void setDate(int h, int w, int d);
    void getDate();
    int volumeBox();
};

void box::setDate(int h, int w, int d){
    cout<<"Enter Height, width, depth: ";
   cin>>height>>width>>depth;
}
void box::getDate(){
    cout<<"height: "<<height<<" width: "<<width<<" depth: "<<depth;
   
}
int box::volumeBox(){
    return height*width*depth;

}
int main(){
    box b;
    int volume;
    b.setDate(10,20,30);
    b.getDate();
    volume = b.volumeBox();
    cout<<"The volume of box is: "<<volume;

}