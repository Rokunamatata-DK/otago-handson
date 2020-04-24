/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  vincenttoailoa
 * Created: 24/04/2020
 */

create table Student (
    Username varchar(50) not null,
    FirstName varchar(50) not null,
    LastName varchar(50) not null,
    Password varchar(50) not null,
    Email varchar(150) not null,
    CellNumber varchar(50) not null,
    StudentID integer not null,

    constraint Student_PK primary key (studentID)

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String cellNumber;
    private String studentID;
    private List<Application> applications;
);

    
