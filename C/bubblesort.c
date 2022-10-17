#include<stdio.h>
#include<conio.h>
void input(int a[5],int n)
{
	int i;
	for(i=0; i<n; i++)
	{
		scanf("%d",&a[i]);
	}
}

void output(int a[5],int n)
{
	int i;
	for(i=0; i<n; i++)
	{
		printf("the element %d is = %d\n",i,a[i]);
	}
}
void bubble_sort(int a[5],int n)
{
    int i,j,temp=0;
    for(i=0;i<n-1;i++) //for passes
    {
        for(j=0;j<n-1-i;j++)
        {
			if(a[j]>a[j+1])// for swap
			{
            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
			}
        }
    }
}
int main()
{
	int a[5],n;
	printf("size of array element\n");
	scanf("%d",&n);
	printf("enter array's element\n");
	input(a,n);
	bubble_sort(a,n);
	output(a,n);
	return 0;
}
