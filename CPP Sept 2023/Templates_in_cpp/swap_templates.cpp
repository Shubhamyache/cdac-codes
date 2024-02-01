#include<iostream>
using namespace std;
template <class T>
void Swap(T &a, T &b)
{
    T temp;
    temp = a;
    a = b;
    b = temp;
}
int main(){
    int no1 = 10;
    int no2 = 20;
    cout<<no1<< " "<< no2<<endl;
    Swap(no1,no2);
    cout<<no1<<" "<<no2<<endl;
}