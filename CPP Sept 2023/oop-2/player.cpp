#include<iostream>
using namespace std;
int mr,mw;
class player{
int pid,runs,wt,ip;
char pname[20];
public:
void accept();
void display();
int getrun();
int getwi();
};
void player::accept(){
    cout<<"\n player id  "<<endl;
    cin>>pid;
     cout<<"player name  "<<endl;
    cin>>pname;
    cout<<"runs  "<<endl;
    cin>>runs;
    cout<<"wickets taken  "<<endl;
    cin>>wt;
    cout<<"innings played  "<<endl;
    cin>>ip;
}
int player::getrun(){
return runs;
}
int player::getwi(){
return wt;
}
player maxrun(player p[]){
    int mrr=p[0].getrun(),pid;
    for (int i = 1; i < 3; i++)
    {
        if(p[i].getrun()>mrr){
        mrr=p[i].getrun();
        pid=i;}
    }
    return p[pid];
}
player maxwi(player p[]){
    int mrr=p[0].getwi(),pid;
    for (int i = 1; i < 3; i++)
    {
        if(p[i].getwi()>mrr){
        mrr=p[i].getwi();
        pid=i;}
    }
    return p[pid];
}
void player::display(){
     cout<<"player id   "<<pid<<endl;
     cout<<"player name   "<<pname<<endl;
     cout<<"runs  "<<runs<<endl;
      cout<<"wickets taken  "<<wt<<endl;
      cout<<"innings played  "<<ip<<endl<<endl<<endl;
}
int main()
{
 player p[3];
    for (int i = 0; i < 3; i++)
    {
        p[i].accept();
    }
     for (int i = 0; i < 3; i++)
    {
        p[i].display();
    }
    cout<<"\n max runs player"<<endl;
    player p1=maxrun(p);
    p1.display();
    cout<<"\n max wickets player"<<endl;
    p1=maxwi(p);
    p1.display();
    return 0;
}

