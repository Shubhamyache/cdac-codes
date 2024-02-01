#include<iostream>
#include<string.h>
using namespace std;
template <class T>
class cStack{
    int size;
    int top;
    T *arr;
    public:
    
    cStack(){
        size = 3;
        top = -1;
        arr = new T[3];
    }
    cStack(int s){
        size = s;
        top = -1;
        arr = new T[size];
    }
    void push(int no){
        if(top<size){
            top++;
            arr[top]=no;
        }
        else{
            cout<<"Stack is overflow.";
        }
    }
    T pop(){
        if(top>=0){
            T no = arr[top];
            top--;
            return no;

        }
    }
    void display(){
        for(int i = top;i>=0;i--){
            cout<<arr[i]<<endl;
        }
    }
};

int main()
{
    int value;
    cStack <int> s1;
    
    int ch;
    

    do{
        cout<<"Enter the choice: 1. push()\
                          \n 2. pop(\
                          \n 3. display()\
                          \n 4. 0 to exit"<<endl;
        cin>>ch;
        switch (ch)
        {
        case 1:
        cout<<"Enter value: ";
        cin>>value;
        s1.push(value);
        
            break;
        
        case 2:
        s1.pop();
        break;

        case 3:
        cout<<"The stack is: "<<endl;
        s1.display();
        break;
        }
    }while(ch!=0);
    return 0;
  

}
