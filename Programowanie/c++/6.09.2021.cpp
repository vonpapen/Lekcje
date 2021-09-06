#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;

class Programowanie{
	public:
		void wyswietl(int n){
			cout<<n+1<<" Dzien dobry!"<<endl;
		}
};
int main(){
	Programowanie ob;
	
	int n;
	
	cout<<"Ile razy chcesz wyswietlic: ";
	cin>>n;
	
	for(int i=0;i<n;i++){
		ob.	wyswietl(i);
	}
}
