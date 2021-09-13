#include <iostream>

using namespace std;

class Bateria{
	public:
		string rodzajOgniw;
		float napiecie;
		int pojemnosc;
		int pradRozladowania;
		int iloscCykli;
		
//		void wprowadzanie(){
//			cout<<endl<<"Wprowadzanie bateri"<<endl;
//			cout<<"Podaj rodzaj ogniw: ";
//			cin>>rodzajOgniw;
//			cout<<"Podaj napiecie (V): ";
//			cin>>napiecie;
//			cout<<"Podaj pojemnosc (Ah): ";
//			cin>>pojemnosc;
//			cout<<"Podaj prad rozladowania (A): ";
//			cin>>pradRozladowania;
//			cout<<"Podaj ilosc cykli: ";
//			cin>>iloscCykli;
//		}
		
//		void wyswietlanie(){
//			cout<<endl<<"Wyswietlanie Bateri"<<endl;
//			cout<<"Rodzaj ogniw: "<<rodzajOgniw<<endl;
//		
//			cout<<"Napiecie (V): "<<napiecie<<endl;
//			
//			cout<<"Pojemnosc (Ah): "<<pojemnosc<<endl;
//		
//			cout<<"Prad rozladowania (A): "<<pradRozladowania<<endl;
//			
//			cout<<"Ilosc cykli: "<<iloscCykli<<endl;
//		}

	Bateria(string rodzajOgniw, float napiecie, int pojemnosc){
		this->rodzajOgniw=rodzajOgniw;
		this->napiecie=napiecie;
		this->pojemnosc=pojemnosc;
	}
	
	void toString(){
		cout<<endl<<rodzajOgniw<<endl<<napiecie<<endl<<pojemnosc<<endl;
	}
	private:
	protected:
	
};

int main(){
	

	Bateria * Laptop = new Bateria("Litowa", 15, 12);
	Bateria Desktop("Brak",10,5);
	
	Laptop->toString();
	Desktop.toString();
	
	
}
