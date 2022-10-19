#include<iostream>

using namespace std;

//function to reverse the alternate element in the array
void reverseAlternate(int arr[],int n){
    int start;
    for(int i=0;i<n;i+=2){
        if(i+1<n)
        swap(arr[i],arr[i+1]);
         
    }
}
//function to print the elements of array
void PrintArray(int arr[],int n){
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";

    }
    cout<<endl;
}

//drivers code
int main(){
    int arr[6]={1,2,3,4,5,6};
    reverseAlternate(arr,6);
    PrintArray(arr,6);
    return 0;
}