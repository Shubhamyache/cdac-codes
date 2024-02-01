#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
    int arr[]={32,5,76,45,76,4,87,43};
    cout<<"\n\n\t *********Array Is *********\n\n";
  for(int i=0;i<8;i++)
  cout<<"  "<<arr[i];
    sort(arr,arr+8);
    cout<<"\n\n\t *********Array Is *********\n\n";
    
  for(int i=0;i<8;i++)
  cout<<"  "<<arr[i];
   bool res=binary_search(arr,arr+8,87);
   if(res==true)
   cout<<"\n\n Elelemt Is Available in Array ";
   else
   cout<<"\n\t Not Availe ";
   
return 0;


}