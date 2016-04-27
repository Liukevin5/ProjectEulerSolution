#include <iostream>
#include <vector>


bool primeCheck(long long int x);
int main()
{
    std::vector <long long int> factors;
    long long int x = 600851475143;

    for(long long int i = 2; i < 600851475143; i++)
    {
        if (x % i == 0)
        {
            if(primeCheck(i))
            {
                std::cout << i << std::endl;
            }
        }
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
