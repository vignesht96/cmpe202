Lab #4 - Din Tai Fung Design Patterns
Krishnamurthy Thyagarajan (009584861)
CMPE 202

List of CRC Cards/Classes:

Customer
- Responsibilities: Provide necessary information to restaurant via text message (name, phone number, number of people in party), receive notifications about table availability, check notifications about table availability, respond to the notifications either by confirming table or leaving restaurant
- Collaborators: Restaurant


Restaurant
- Responsibilities: Provide tables for customers to sit and eat at if customers confirm, notify customers if they have a table ready for them
- Collaborators: Customer, Table, WaitList


WaitList
- Responsibilities: Add customer to reservation list, remove customer from reservation list, assign table for customer
- Collaborators: Customer, Restaurant, Table


Table
- Responsibilities: Keep track of whether the table is occupied or unoccupied, make sure maximum number of seats at table is not exceeded
- Collaborators: WaitList, OpenTable, ClosedTable


OpenTable
- Responsibilities: Change state to open if table is free, notify table that it is free
- Collaborators: Table


ClosedTable
- Responsibilities: Change state to closed if table is not free, notify table that it is not free
- Collaborators: Table


Explanation of Chosen Design Patterns:

The main design patterns chosen for this assignment were Observer and State.

These two design patterns seemed to fit the most as classes like Restaurant and Customer were observing the changes taking place within the entire system, and working based off of the information received from other classes like WaitList and Table. For example, Customer observes the messages from Restaurant saying that there is/is not a table available and has to respond. Similarly, Restaurant observes the states of the tables and any table assignments from WaitList. The classes used to track the state of the tables, OpenTable and ClosedTable, simply kept the state of the table based on whether it was available or not, and returned that information to Table.