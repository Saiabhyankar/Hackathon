#include <stdio.h>
int main(){
    int arr[10];
    printf("enter the elements of the array");
    for (int i=0;i<10;i+=1){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<10;i+=1){
        int cnt=0;
        for(int j=i+1;j>=0;j-=1){
            if(arr[i]<=arr[j]){
                cnt+=1;
            }
        }
        printf("No of stcks less than or equal to that time %d is %d",arr[i],cnt);
    }
}