#include<stdio.h>
void printTable(int num);
int main(){
    int number;
    int result;
    printf("Enter any number: ");
    scanf("%d", &number);
    printTable(number);
    return 0;
    
}
void printTable(int num){
    for(int i=1; i<=10;i++){
        printf("\n %d * %d = %d",num,i,num*i);
    }
}