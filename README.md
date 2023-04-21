# netrom ship problem

A software application keeps the track of people on board of a ship.
The people that are on board are either crew members or passengers.

Crew members have a specific rank on a vessel (Chief engineer, Cook, Captain etc.) and they also have a working contract number. 
Passengers are only traveling, and they have a ticket number associated to them. 

For all the people on board (crew members and passengers) the application stores FullName, BirthDate, ID Card number.

When a trip is started, a report is generated with all onboarded persons.
The report contains the FullName, BirthDate, ID Card Number, Rank (the rank name in case of crew members and the text “Passenger” if the person is a passenger),
Onboard document number (contract number for crew members and ticket number for passengers). 

Using OOP principles, create the class model for Crew Members and Passengers and a ReportManager class that has the necessary methods for adding new passengers
and crew members on board and also prints the report with all onboarded people. Write also the implementation for the ReportManager methods.
