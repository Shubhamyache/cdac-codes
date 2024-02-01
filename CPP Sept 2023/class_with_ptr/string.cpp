#include<iostream>
#include<string.h>
using namespace std;
class cString
{
    int length;
    char *str;                                              
    public:
    void display();
    cString();
    cString(const char *);
    cString(cString &obj);
    ~cString();
};
cString::~cString(){
    delete[] str;
}
cString ::cString(cString &obj){
    this->length = obj.length;
    this->str = new char[this->length + 1];
    strcpy(this->str,obj.str);

}

void cString:: display(){
    cout<<"Length: "<<length<<" Name: "<<str<<endl;
}

cString::cString(){
    length = 1;
    strcpy(str, "NA");
}

cString::cString(const char* str){
    length = strlen(str);
    this->str = new char[this->length + 1];
    strcpy(this->str, str);
}

int main()
{
    
    cString s2("shubham");
    s2.display();

    cString s3 = s2;
    s3.display();

}

