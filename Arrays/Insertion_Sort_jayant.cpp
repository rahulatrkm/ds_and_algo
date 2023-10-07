//inserting a element into a sorted array 

#include<bits/stdc++.h>
using namespace std;

void InsertionSorting(int arr[], int size){
    for(int i = 0; i < size; i++){
        int j = i;
        while(j > 0 && arr[j] < arr[j-1]){
            swap(arr[j], arr[j-1]);
            j--;
        }
    }
    for(int i = 0; i < size; i++){
        cout<<arr[i]<<" ";
    }
}

int main(){
    int size;
    cin>>size;

    int arr[size];

    for(int i=0; i<size; i++){
        cin>>arr[i];
    }
    InsertionSorting(arr,size);
    return 0;
}

//It is efficient when number of element are small 
//Stable sorting algorithm 
