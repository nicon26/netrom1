package org.example;

public class App 
{
    public static void main( String[] args ) {
           ReportManager crewMember1 = new ReportManager();
           ReportManager crewMember2 = new ReportManager();
           ReportManager crewMember3 = new ReportManager();

           crewMember1.addPeople("John Brown", "13.04.2000", "485294569", "Cook", "ASD3590453", "0");
           crewMember2.addPeople("Megan Sullivan", "23.05.1990", "485445629", "Chief engineer", "ASD3956104", "0");
           crewMember3.addPeople("Logan Styles", "19.09.1980", "4428590039", "Captain", "ASD3960123", "0");

           crewMember1.print();
           crewMember2.print();
           crewMember3.print();

           ReportManager passenger1 = new ReportManager();
           ReportManager passenger2 = new ReportManager();
           ReportManager passenger3 = new ReportManager();

           passenger1.addPeople("Kristine Horan", "13.09.2000", "449567093", "Passenger", "-", "347683950123");
           passenger2.addPeople("Liam Knox", "23.03.1999", "475893340", "Passenger", "-", "956476930211");
           passenger3.addPeople("Miley Chris", "19.03.1991", "421365793", "Passenger", "-", "768593067444");

           passenger1.print();
           passenger2.print();
           passenger3.print();
    }
}
