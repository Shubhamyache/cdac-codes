#include<stdio.h>
int count_digit(int num);
int main(){
    int number;
    int result;
    printf("Enter any number: ");
    scanf("%d", &number);
    result = count_digit(number);
    printf("the number of digits in %d is %d", number,result);

  
}
int count_digit(int num){
    int count = 0;
    while(num != 0){
        num = num/10;
        count ++;

    }
    return count;
}