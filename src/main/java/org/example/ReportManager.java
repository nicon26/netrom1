package org.example;

public class ReportManager extends People  {

    void addPeople(String fullName, String birthDay, String IDcardNumber, String rank, String documentNumber, String ticketNumber) {
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.IDcardNumber = IDcardNumber;
        this.rank = rank;
        this.documentNumber = documentNumber;
        this.ticketNumber = ticketNumber;
   }

    void print(){
        System.out.println("Full name: " + fullName);
        System.out.println("Birthday: " + birthDay);
        System.out.println("ID card number: " + IDcardNumber);
        System.out.println("Rank: " + rank);
        System.out.println("Document number: " + documentNumber);
        System.out.println("Ticket number: " + ticketNumber);
        System.out.println();
    }
}
