"# SpringBootRestwithH2" 

This application have 3 endpoints as below:
GET --> /student
POST --> /addStudent
POST --> /addDummyStudent

Application start on port number 8080.
It works on JAVA 11

Endpoints will work as below.
Note: You can import curl commands in POSTMAN to check application running.

To fetch Student use GET endpoint like below example :
curl --location --request GET 'localhost:8080/addStudent'
<img width="989" height="390" alt="image" src="https://github.com/user-attachments/assets/9f1ddf74-4f65-4bad-b67a-a92d21290965" />


To add Student use POST endpoint like below example :
curl --location --request POST 'localhost:8080/addStudent' \
--header 'Content-Type: application/json' \
--data-raw '{
"stdId": 123,
"stdName": "Dhananjay",
"stdAge": 567
}'
<img width="987" height="391" alt="image" src="https://github.com/user-attachments/assets/f5871605-34d0-4c55-9aa3-8146ed243137" />


To test POST endpoints use POST /addDummyStudent endpoint :
curl --location --request POST 'localhost:8080/addDdummyStudent' \
--header 'Content-Type: application/json' \
--data-raw '{
"stdId": 123,
"stdName": "Dhananjay",
"stdAge": 567
}'
<img width="991" height="681" alt="image" src="https://github.com/user-attachments/assets/fd16a021-d897-440e-9c78-47175b3a9488" />


