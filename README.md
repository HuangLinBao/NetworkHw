# NetworkHw

a Homework that was required during the first weeks of the semester in our networks 101 course.
the idea is just a console application that represents either a [TCP](https://github.com/HuangLinBao/NetworkHw) or a [UDP](https://github.com/HuangLinBao/NetworkHwUdp) client that sends a course number to a [TCP Server](https://github.com/HuangLinBao/NetworkServerHw) or a [UDP Server](https://github.com/HuangLinBao/NetworkHwUDPserver) respectively.

the server code reads a text file then identifies if the course with the given number exisits or not and responds back to the client.


## Explaination

### Client side

it just gets the course number as an input from user and sends it in a packet wheather was [TCP](https://github.com/HuangLinBao/NetworkHw) or  [UDP](https://github.com/HuangLinBao/NetworkHwUdp).

### Server side

reads the text file and tokenize the contents into a HashMap with the course number being the key and the course name being the value. Tokenization happen according to a ("->") substring.

when the course is found the name gets sent back to the client but all CAPS "all letters are upper case".
