#include <iostream>

using namespace std;
bool primeCheck(long long int x);

int main()
{
    int counter = 1;
    int number = 3;

    while(counter <= 10001)
    {

        if(primeCheck(number))
        {

            counter++;
            if(counter == 10001)
            {
                std::cout<< number<< std::endl;
            }

        }

        number++;
    }
    return 0;
}

bool primeCheck(long long int x)
{
    for(long long int i = 2; i < x; i++)
    {
        if (x % i == 0)
        {
            return false;
        }
    }
    return true;
}
