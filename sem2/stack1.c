#include<stdio.h>
int stack[10];
int top=0;
int push(int value,int size){
    if(top==size-1){
        return 0;
    }
    else{
        stack[top]=value;
        top++;
        return 1;
    }
}
void display(){
    int temp=top;
    while(temp!=-1){
        printf("%d",stack[top]);
        temp--;
    }
}
int main(){
    printf("Stack Operations \n");
    printf("1) Insert Value : \n 2)Delete value :\n 3)View Stack ");
    printf("Enter the choice as 1/2/3");
    int ch;
    scanf("%d",&ch);
    switch (ch)
    {
    case 1:
        int val;
        printf("enter the element to be added");
        scanf("%d",&val);
        int a=push(val,10);
        if(a==0){
            printf("Overflow");
        }
        else{
            display();
        }
        break;  
    
    default:
        break;
    }
}