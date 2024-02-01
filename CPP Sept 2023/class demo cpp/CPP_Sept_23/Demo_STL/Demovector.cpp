#include<iostream>
#include<vector>
using namespace std;
class Employee
{
    int id;
    char name[20];
    public:
  friend istream& operator>>(istream &in,Employee e)
  {
    in>>e.id>>e.name;
    return in;
 }
 friend ostream& operator<<(ostream &in,Employee e)
  {
    in<<e.id<<"\t"<<e.name;
    return in;
  }

};
int main()
{
   /*vector <Employee> emp;
   Employee e1;
   cout<<"\n\n\t Enter Emp Values ";
   cin>>e1;
   emp.push_back(e1);
  */


+
    vector<int> v1;
    for(int i=0;i<10;i++)
    {
        if(i%2==0)
          v1.push_back(i);
    }
    v1[0]=10;
    v1[1]=50;
    cout<<"\n\n\t Vector Is \n\n";
    for(int i=0;i<v1.size();i++)
      cout<<"   "<<v1[i];

    cout<<"\n\n\t First element "<<v1[0];
     // iterator 

     vector<int>::iterator start,end;
     start=v1.begin();
     end=v1.end();
     while(start!=end)
     {
        cout<<"    "<<*start;
        start++;
     }




    cout<<"\n\n\n";
    return 0;
}