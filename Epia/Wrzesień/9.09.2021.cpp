#include <iostream>


using namespace std;

class Ksiazka{
	public:
		string autor, tytul, wydawnictwo;
		int rok_wydania;
		
		
		void dodaj(){
			cout<<"WPROWADZANIE Ksiazki"<<endl;
			cout<<"Podaj autora: ";
			cin>>autor;
			cout<<"Podaj tytul: ";
			cin>>tytul;
			cout<<"Podaj wydawnictwo: ";
			cin>>wydawnictwo;
			cout<<"Podaj rok wydania: ";
			cin>>rok_wydania;
		}
		
		void pokaz(){
			cout<<"WYSWIETLANIE Ksiazki"<<endl;
			cout<<"Autor : ";
			cout<<autor<<endl;
			cout<<"Tytul: ";
			cout<<tytul<<endl;
			cout<<"Wydawnictwo: ";
			cout<<wydawnictwo<<endl;
			cout<<"Rok wydania: ";
			cout<<rok_wydania<<endl;
		}
	
	private:
	protected:
};
int main(){
	
	Ksiazka s1;
	
	s1.dodaj();
	s1.pokaz();
	
}
