# ip1

**B.S. ABDUR RAHMAN UNIVERSITY**
  **DEPARTEMENT OF COMPUTER SCIENCE AND ENGINEERING***
  Hostel Management System

[Disclaimer
this project is developed as a part of curriculum for course internet programming lab(CS405).]


Submitted by,
 PADMA PRIYA (120071601070)
 SHAHIDA BANU S.(120071601087)

GUIDED BY
 Dr.N.SABIYATH FATHIMA.


README TO RUN THE PROJECT

REQUIREMENTS

1. windows 7 or later
2. 2GB RAM
3. no additional memory required
4. Netbeans IDE 8.0.2
5. glassfish server 4.0 and above
6. jar files are included inside the folder. 

HOW TO INSTALL

1. unzip the folder.
2. Open the netbeans 8.0.2 and open the project javaexam
3. Create derby database. Then create tables listed below.
    a. AVAILABLE
	 | Room1 | Number1 | Amount |
	-----------------------------
	 | One   | 20      | 9000   |
	-----------------------------
	 | Two   | 20      | 7000   |
	-----------------------------
	 | Four  | 20      | 5000   |
	-----------------------------
	 | Oneac | 20      | 17000  |
	-----------------------------
	 | Twoac | 20      | 19000  |


    b. BOOK
	 | Name1 | Mobile1 | Days | Room1 | Amount1 |


    c. REGISTRATION
	 | Name1 | Password1 | Sex1 | Address1 | State1 | Mobile1 | Year1 | Email1 | Course1 |
 
4. Start NetBeans 8.0.2 Open the project from the folder.
5. Run this project - you must see home.jsp page.

HOSTEL MANAGEMENT SYSTEM 
1. Open Netbeans Project and Run the project
2. The home page has the link to all other functions of the system.
3. When the user want to Login, the system prompts the username and password for account verification. The system checks for the presence of the user account and navigages to the corresponding page.
4. When the user want to register himself, the system asks for the user information and saves it in the database.
5. If the user of the application chooses to book a room, it directs him to the booking page. The user has to be logged in inorder to book room. If not, he will be asked to login to continue. The user then has to enter the necessary data (like room type) to book room.
6. The user can visit About Us, Contact Us and Gallary even without logging in.

