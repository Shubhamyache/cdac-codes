#include<iostream>
#include<string.h>
using namespace std;
class Player
{
    int playerId;
    char playerName[20];
    public:
    void display();
    Player();
    Player(int,const char*);
};
Player::Player(int id, const char* nm){
    playerId = id;
   strcpy(playerName, nm);
}

Player::Player(){
    playerId = 1;
    strcpy(playerName,"NA");
}

void Player::display(){
    cout<<"Player Id: "<<playerId<<" Player Name: "<<playerName<<endl;
}

class Batsman:public Player
{
    int innings, notOut, runs;

    public:
    Batsman();
    Batsman(int,const char*,int,int,int);

    int calAgv();
    void readdata();
    void display();
};
Batsman::Batsman(){}

Batsman::Batsman(int id, const char * nm, int i,int n,int r):Player(id,nm){
    innings = i;
    notOut = n;
    runs = r;
}

void Batsman::display(){

    Player::display();
    cout<<"Innings Played: "<<innings<<" not Outs: "<<notOut<<" Runs Scored "<<runs<<endl;
    cout<<"Average of batsman is: "<<calAgv();

}

int Batsman::calAgv(){
    int avg = 0;
    avg = (runs)/(innings - notOut);
    return avg;
}


int main(){
    Batsman b1(1,"Shubham",10,5,200);
    b1.display();
    
}

