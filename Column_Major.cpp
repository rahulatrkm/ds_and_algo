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
    int k=0;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cout<<arr[j][i]<<" ";
        }
    }

    return 0;
}
/*
INPUT:

3 3
1 2 3
4 5 6 
7 8 9

OUTPUT:
1 4 7 2 5 8 3 6 9
*/


