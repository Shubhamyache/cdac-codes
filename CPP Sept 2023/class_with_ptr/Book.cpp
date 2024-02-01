#include<iostream>
#include<string.h>
using namespace std;
class Book
{
    static int Bookid;
    char *bookname;
    float price;
    public:
    Book();
    Book(const char *,float );
    void display();
    Book(Book &obj);
    ~Book();
};
Book::~Book(){
    delete[] bookname;
}
Book ::Book(Book &obj){
    this->Bookid = obj.Bookid;
    this->bookname = new char[strlen(obj.bookname)+1];
    strcpy(this->bookname, obj.bookname);
    this->price = obj.price;
}
void Book::display(){
    cout<<"Bookid: "<<Bookid<<", Book name: "<<bookname<<", book price: "<<price<<endl;
}
int Book::Bookid = 0;
Book::Book(){
    Bookid++;
    strcpy(bookname,"NA");
    price = 0;
}
Book::Book(const char * bookname, float price){
    Bookid++;
    this->bookname = new char[strlen(bookname)+1];
    strcpy(this->bookname, bookname);
    this->price = price;
}

int main(){
    Book b1;
    b1.display();

    Book b2("harry poter", 130);
    b2.display();   

    Book b3("bhagavat gita", 255);
    b3.display();

    Book b4 = b3;
    b4.display();

    Book b5("atomic habits", 200);
    b5.display();
}