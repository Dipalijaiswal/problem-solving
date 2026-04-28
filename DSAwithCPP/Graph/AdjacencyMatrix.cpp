#include<iostream>
using namespace std;
int main()
{
    int V;
    cout<<"Enter the number of vertices: ";
    cin>>V;
    int adj[V][V];
    for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
            adj[i][j]=0;
        }
    }
    int E;
    cout<<"Enter the number of edges: ";
    cin>>E;
    for(int i=0;i<E;i++){
        int u,v;
        cout<<"Enter the edge (u v): ";
        cin>>u>>v;
        adj[u][v]=1;
        adj[v][u]=1;
    };
    cout<<"Adjacency Matrix: "<<endl;
    for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
            cout<<adj[i][j]<<"";
        }
        cout<<endl;
    }
    return 0;
}