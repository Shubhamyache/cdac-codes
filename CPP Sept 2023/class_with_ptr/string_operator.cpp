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
    bool operator<(cString &obj);
    bool operator>(cString &obj);
    bool operator==(cString &obj);
    cString operator=(cString &obj);
    char& operator[](int pos); 
    ~cString(); 
};
cString :: cString(){}
char& cString::operator[](int pos)
{
    if(pos>=0 && pos<this->length){
        return str[pos];
    }


}
cString cString:: operator=(cString &obj){
    this->length = obj.length;
    this->str = new char[this->length + 1];
    strcpy(this->str, obj.str);
    return *this;

}

bool cString:: operator==(cString &obj){
    if(strlen(this->str)==strlen(obj.str)){
        return true;
    }
    else
    return false;
}

bool cString:: operator<(cString &obj){
    if(strlen(this->str)<strlen(obj.str)){
        return true;
    }
    else{
        return false;
    }
}

bool cString:: operator>(cString &obj){
    if(strlen(this->str)>strlen(obj.str)){
        return true;
    }
    else{
    return false;
    }
}
cString::~cString(){
    delete[] str;
}

cString:: cString(const char* str){
    this->length = strlen(str);
    this->str = new char[this->length + 1];
    strcpy(this->str, str);
}

void cString:: display(){
    cout<<"Length: "<<length<<" Name: "<<str<<endl;
}

int main()
{
    cString c1("shubham");
    cString c2("rohitjgfgfkgfkg");

    if(c1==c2){
        cout<<"String c1 and c2 are same.";
    }
    else{
        cout<<"Strings are of different lengths.";
    }

    if(c1<c2){
        cout<<"String c2 is greater than c1.";
    }
    else{
    cout<<"String c1 is greater than c2";
    }

    
}

