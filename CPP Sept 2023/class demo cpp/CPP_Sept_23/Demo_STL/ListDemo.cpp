#include<iostream>
#include<list>
#include<stack>
using namespace std;

int main()
{
    string name;
    cout<<"\n\n\t Enter Name ";
    cin>>name;
    cout<<"\n\t Wel come "<<name;
    // create list for storing 5 city names
    list<string> cities;
    cities.push_back("Pune");
    cities.push_back("Mumbai");
    cities.push_back("Nagpur");
    cities.push_back("Nashik");
    cities.push_back("Nanded");
       
    list<string>::iterator start,end;
    start=cities.begin();
    end=cities.end();
    while(start!=end)
    {
        cout<<"\n\t "<<*start;
        start++;
    }


    
}