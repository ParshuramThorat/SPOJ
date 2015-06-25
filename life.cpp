#include <iostream>
using namespace std ;
int main(int argc, char const *argv[])
{
	int num ;
	do{

		cin >> num ;
		if (num == 42)
		{
			return 0;
		}
		cout << num << endl ;

	}while(1) ;

	return 0;
}