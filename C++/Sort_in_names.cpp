#include<stdio.h>
int main(){
    int n;
    printf("enter the value of n:");
    scanf("%d",&n);
    int arr[n];
    printf("enter the no:");
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("the sorted array is :-");
    for (int i = 1; i < n; i++)
    {
       for (int j = 0; j < i; j++)
       {
        if (arr[j]>arr[i])
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        
        
       }
       
       
    }
    for (int i = 0; i < n; i++)
    {
       printf("%d ",arr[i]);
    }
    

    return 0;
}
