#include<stdio.h>
int charStr(char *);
int spaceStr(char *);
int countVowel(char *);
int main(){
    
    int choice;
    char str[50]="My name is yache shubham";
    printf("Enter your choice: 1. string length\
                                2. spaces in string\
                                3. vowels in string :: ");

    scanf("%d", &choice);
    
    switch (choice)
    {
    case 1:
       printf("The length of string is %d", charStr(str));
        break;
    case 2:
        printf("The number of spaces in string is %d", spaceStr(str));
        break;
    case 3: 
        printf("The number of vowels in string is %d", countVowel(str)); //count Vowel
        break;
    
    
    default:
        break;
    }
    
}
int charStr(char *string){
    int count = 0;
    while(*string != '\0'){
        count++;
        string++;     
    }
    return count;
}

int spaceStr(char *string){
    int space_cnt = 0;
    while(*string != '\0'){
        if(*string==' ')
            space_cnt++;
        string++;

    }
    return space_cnt;
}


int countVowel(char *string){
    int vowel_count = 0;

    while(*string!='\0'){
        switch (*string){
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            vowel_count++;
           
        }
         string++;
        }
        return vowel_count;
}
    
    

