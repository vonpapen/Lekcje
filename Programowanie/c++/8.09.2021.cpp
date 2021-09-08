#include <iostream>


using namespace std;

class Samochod{
	public:
		string marka, model;
		int rocznik;
		float pojemnosc, przyspieszenie, spalanie;
		
		
		void dodaj_samochod(){
			cout<<"WPROWADZANIE SAMOCHODU"<<endl;
			cout<<"Podaj marke samochodu: ";
			cin>>marka;
			cout<<"Podaj model samochodu: ";
			cin>>model;
			cout<<"Podaj rocznik samochodu: ";
			cin>>rocznik;
			cout<<"Podaj pojemnosc silnika (cm3): ";
			cin>>pojemnosc;
			cout<<"Podaj przyspieszenie od 0 do 100km/h (s): ";
			cin>>przyspieszenie;
			cout<<"Podaj wartosc spalania w cyklu mieszanym: ";
			cin>>spalanie;
		}
		
		void pokaz_samochod(){
			cout<<"WYSWIETLANIE SAMOCHODU"<<endl;
			cout<<"Marka samochodu: ";
			cout<<marka;
			cout<<"Model samochodu: ";
			cout<<model;
			cout<<"Rocznik samochodu: ";
			cout<<rocznik;
			cout<<"Pojemnosc silnika (cm3): ";
			cout<<pojemnosc;
			cout<<"Przyspieszenie: ";
			cout<<przyspieszenie;
			cout<<"Spalanie: ";
			cout<<spalanie;
		}
	
	private:
	protected:
};
int main(){
	
	Samochod s1, s2, s3;
	
	s1.dodaj_samochod();
	s1.pokaz_samochod();
	
	s2.dodaj_samochod();
	s2.pokaz_samochod();
	
	s3.dodaj_samochod();
	s3.pokaz_samochod();
	
	if(s1.przyspieszenie<s2.przyspieszenie && s1.przyspieszenie<s3.przyspieszenie){
		cout<<"Najwolniejszy samochod to "<<s1.marka;
	}else if(s2.przyspieszenie<s1.przyspieszenie && s2.przyspieszenie<s3.przyspieszenie){
		cout<<"Najwolniejszy samochod to "<<s2.marka;
	}else if(s3.przyspieszenie<s1.przyspieszenie && s3.przyspieszenie<s2.przyspieszenie){
		cout<<"Najwolniejszy samochod to "<<s3.marka;
	}
	
	
	
	
	
	cout<<"Najwolnieszy samochod: "<<endl;
}
