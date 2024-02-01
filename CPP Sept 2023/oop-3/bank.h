#include<iostream>
#include<string.h>
using namespace std;
class Bank
{
    static int count;
    int accNo;
    char name[20];
    int balance;
    public:
    void display();
    Bank();
    Bank(const char* , int);
    static float interestRate;
    static float setInterest(float );
};

