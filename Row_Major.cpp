#include <iostream>
using namespace std;

int main()
{
    int n,m;
    cin>>n>>m;
    
    int arr[n][m];
    for(int i=0;i<n;i++){
        for(int j=0; j<m; j++){
            cin>>arr[i][j];
        }
        cout<<endl;
    }
    
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<arr[i][j]<<" ";
        }
    }

    return 0;
}

/*
Input:

3 3
1 2 3
7 8 9
4 5 6

Output:

1 2 3 7 8 9 4 5 6
*/

