#include"bank.h"

int Bank::count = 0;
float Bank::interestRate = 8.97;
float Bank::setInterest(float num){
    interestRate = num;
}
Bank::Bank(){
    count++;
    accNo = count;
    strcpy(name, "NA");
    balance = 0;
}
Bank::Bank(const char *n, int b){
    count++;
    accNo = count;
    strcpy(name, n);
    balance = b;

}
void Bank::display(){
    cout<<"The details are: "<<endl;
    cout<<"Account No: "<<accNo<<" "<<" Name: "<<name<<" Balance: "<<balance<<endl;


}
