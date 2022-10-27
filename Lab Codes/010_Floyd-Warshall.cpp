// Wap to implement All Pair shortest Path Problem 
#include<iostream>
using namespace std; 
#define V 4 // Number of vertices 
/* Define Infinite as a large enough value. This value will be used 
for vertices not connected to each other */ 
#define INF 999 
void printSolution(int dist[][V]); 
void floydWarshall (int graph[][V]) 
{ 
int dist[V][V], i, j, k; 
for (i = 0; i < V; i++) 
for (j = 0; j < V; j++) 
dist[i][j] = graph[i][j]; 
for (k = 0; k < V; k++) 
{ 
for (i = 0; i < V; i++) 
{ 
for (j = 0; j < V; j++) 
{ 
if (dist[i][k] + dist[k][j] < dist[i][j]) 
dist[i][j] = dist[i][k] + dist[k][j]; 
} }} 
printSolution(dist); 
} 
void printSolution(int dist[][V]) 
{ 
cout <<"The following matrix shows shortest distances between every pair of vertices "<<endl; 
for (int i = 0; i < V; i++) 
{ 
for (int j = 0; j < V; j++) 
{ 
if (dist[i][j] == INF) 
cout <<"INF"; 
else 
cout <<dist[i][j]; 
} 
cout<<endl; 
} 
} 
int main(){ 
int graph[V][V] = { {0, 5, INF, 10}, 
{INF, 0, 3, INF}, 
{INF, INF, 0, 1}, 
{INF, INF, INF, 0} };
floydWarshall(graph); 
return 0; 
}