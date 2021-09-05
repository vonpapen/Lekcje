#include <iostream>
#include <cstdlib>
#include <time.h>

using namespace std;

int main() {
	int liczba, strzal, proba=0;
	
	cout<<" Gra w zgadnij liczbe! Liczba od 1 do 100"<<endl;
	
	srand(time(NULL));
	liczba=rand()%100+1;
	
	while(strzal!=liczba)
	{
		proba++;
		
		cout<<"Zgadnij liczbe (to twoja "<<proba<<" proba): ";
		cin>>strzal;
		
		if(strzal==liczba)
		{
			cout<<"Udalo ci sie zgadnac liczbe! Wygrywasz w "<<proba<<" probie!"<<endl;
		}
		else if(strzal<liczba)
		{
			cout<<"To za mala liczba"<<endl;
		}
		else if(strzal>liczba)
		{
			cout<<"To za duza liczba"<<endl;
		}
	}
	
	system("pause");
	
	return 0;
}
