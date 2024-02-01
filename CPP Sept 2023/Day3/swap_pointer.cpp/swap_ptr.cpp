#include<iostream>
using namespace std;
void swap_ptr(int *p, int *q);
int main()
{
 int num1 = 10;
 int num2 = 20;
 cout<<num1 <<" "<<num2<<endl;
 swap_ptr(&num1, &num2);
 cout<<num1<<" "<<num2<<endl;
 return 0;

}
void swap_ptr(int *p, int *q){
    int temp;
    temp = *p;
    *p = *q;
    *q = temp;
}