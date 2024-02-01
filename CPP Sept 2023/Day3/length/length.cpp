#include<stdio.h>
int findLength(char*);
int main(){
    char string[40];
    int length;
    printf("Enter any string ");
    scanf("%s", string);
    length = findLength(string);
    printf("\n\nThe length of the string is: %d", length);

}
int findLength(char *string){
    int count = 0;
    while (*string != '\0')
    {
       count ++;
       string++;
    }
    return count;
    
}