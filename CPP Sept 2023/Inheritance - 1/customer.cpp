#include<iostream>
#include<string.h>
using namespace std;
class Customer{
    int shoppingPrice;
    char email[25];
    char address[25];
    public:
    int giveDiscount();
    void display();
    Customer();
    Customer(int,const char*, const char*);
};

void Customer::display(){
    cout<<"Email: "<<email<<endl;
    cout<<"Address: "<<address<<endl;
    cout<<"Original Shopping Price: "<<shoppingPrice<<endl;
}

Customer::Customer(){}

Customer::Customer(int sp,const char* e, const char* a){
    shoppingPrice = sp;
    strcpy(email, e);
    strcpy(address, a);  
}

int Customer::giveDiscount(){
    cout<<"No Discount for Ordinary customer."<<endl;
}

class RegCustomer:public Customer{
    int regNO;
    int DshoppingPrice;
    public:
    RegCustomer();
    RegCustomer(int,int,int,const char*,const char*);
    void display();
    int giveDiscount();
    
};
RegCustomer::RegCustomer(){}

RegCustomer::RegCustomer(int reg,int sp,int nsp,const char* e,const char* a):Customer(nsp,e,a){
    regNO = reg;
    DshoppingPrice = sp;

}

int RegCustomer::giveDiscount(){
    int newPrice;
    newPrice = DshoppingPrice - (DshoppingPrice*5)/100;
    return newPrice;
}
void RegCustomer::display(){
    Customer::display();
    cout<<"Reg No: "<<regNO<<endl;
    cout<<"Discounted Shopping Price: "<<giveDiscount()<<endl;
    
}

int main(){
    cout<<" Ordinary Customer: "<<endl;
    Customer c1(100,"yacheshubham100","Chilwantwadi");
    c1.display();
    cout<<endl<<endl;
    
    cout<<" Registered Customer: "<<endl;
    RegCustomer c2(11,100,100,"shubhamyache","Pune");
    c2.display();

}