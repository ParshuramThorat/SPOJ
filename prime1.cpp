#include <iostream>
#include <unordered_map>
using namespace std ;

//memory
unordered_map<long long int, bool> hashMap;
unordered_map<long long int, bool>::const_iterator got ; //For LookUp
pair<long long int, bool> myPair (2, true); //For Insert

//function prototypes
void printPrimesBetween(int , int) ;
bool isPrime(long long int num) ;

//main
int main(int argc, char const *argv[])
{
	int numTestCases ;
	long long int m , n ;
	cin >> numTestCases ;

	for (int i = 0; i < numTestCases; ++i)
	{	
		cin >> m ;
		cin >> n ;		
		printPrimesBetween(m, n) ;
		cout << "\n" ;

	}
	return 0;
}

void printPrimesBetween(int m, int n) {
	int unitPlace = num%10 ;
	if (unitPlace == 3)
	{
		num += 4 ;
	}
	else num += 2 ;

}

bool isPrime(long long int num){
	got = hashMap.find(num);
	if (got != NULL)
	{
		
	}
	return got ;
}