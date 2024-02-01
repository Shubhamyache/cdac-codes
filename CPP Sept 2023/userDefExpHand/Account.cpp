#include<iostream>
#include<string.h>
using namespace std;
class AmountExceedException: public exception{
    public:
    void displayExceed(){
        cout<<"Can't withdraw the amount exceeding current balance.";
    }
};
class MinimumBalanceException: public exception{
    public:
    void displaymin(){
        cout<<"minimum balance has to be preserved in account.";
    }
};
class Amount{
    char name[20];
    double accNo;
    double balance;
    public:
    Amount();
    Amount(const char* nm, double, double);
    void accept();
    void withdraw();
    void display();
    void deposit();

};
void Amount::deposit(){
    int depo;
    cout<<"Enter Amount to deposit: "<<endl;
    cin>>depo;
    if(depo>50000){
        int pan;
        cout<<"enter pan card details: ";
        
        cin>>pan;
        if(pan<100000){
            cout<<"Invalid pan.";       
        }
    }   
    else{
        balance = balance + depo;
        cout<<"The current balance: "<<balance<<endl;    
    }
         
}

void Amount::display(){
    cout<<"Name: "<<name<<endl;
    cout<<"Account Number: "<<accNo<<endl;
    cout<<"Balance: "<<balance<<endl;
}

void Amount::withdraw(){
    int minBal = 10000;
    int withdraw;
    cout<<"Enter amount to withdraw:";
    cin>>withdraw;
    if(balance<withdraw){
        throw AmountExceedException();
    }
    else{
        
        if(minBal>balance){
            throw MinimumBalanceException();
        }
        else{
            balance = balance - withdraw;
            cout<<"Money withdrawn successfuly "<<endl;
            cout<<"Current balance is : "<<balance<<endl;
        }
        
    }
    
}

void Amount::accept(){
    cout<<"Enter name, Account number and balance: ";
    cin>>name>>accNo>>balance;
    
}
Amount::Amount(const char* nm, double an, double bal){
    strcpy(name, nm);
    accNo = an;
    balance = bal;

}
Amount::Amount(){
    strcpy(name,"NA");
    accNo = 0;
    balance = 0;
}

int main(){
    Amount a1("shubham",1234,50000);
    try{
        a1.deposit();
        a1.withdraw();
        
    }
    catch(AmountExceedException e){
       e.displayExceed();
    }
    catch(MinimumBalanceException m){
        m.displaymin();
    }
}