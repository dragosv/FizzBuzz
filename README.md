**FizzBuzz++**
- Write a program that prints the integers from 0 to n (default 1000) 
- Print 'Fizz' for fibonacci numbers and 'Buzz' for prime numbers

**To run this**

Install [Docker Community Edition](https://www.docker.com/community-edition)

If on Linux follow the [Post-installation steps](https://docs.docker.com/engine/installation/linux/linux-postinstall/)

From inside the main folder run this two commands
- docker build . -t dragosv/fizzbuzz
- docker run -e MAX_NUMBER='1000' dragosv/fizzbuzz 

Change the MAX_NUMBER='1000' to something else if you want to see a different Max number