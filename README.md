# BUILDER-PATTERN

Definition(s)
Builder Pattern is a design pattern dedicated in the Object-Oriented Programming Methodology. It is a simple of creation of objects through step-by-step series. The construction of it's object is flexible, think of it as unveiling the finished product but enveloping its internal classes and representation.

# Problem-Statement

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
Optional fields: Not all customers provide complete information, but the constructor forces them to.
Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.
Implement solution using the Builder Pattern to address the issue.

# UML-DIAGRAM
<img width="1395" alt="WK1-2_UML_BUILDER_PATTERN_CHUA_VINCE" src="https://github.com/VinceTedChua/builderPattern/assets/142372312/ab3f9796-6c61-41bb-a7d9-d293999420b7">


# JAVA-Solution 

1) (Error-Free Registration Forms)- Three Images conveys the output indicating the successful print of each information.
<img width="1008" alt="builderPattern_Sol1" src="https://github.com/VinceTedChua/builderPattern/assets/142372312/58e29392-0f5b-4bac-8405-07a46150c6f5">

   
2) (Optional-Fields)- Second Image portrays the consistency of the user forcing them to complete the information, ensuring no data is left behind.
<img width="1656" alt="builderPattern_Sol2" src="https://github.com/VinceTedChua/builderPattern/assets/142372312/3f73ccd6-2e67-4521-82d5-41f5eb4ddbcc">


3) (Data Consistuency) Terminating the Code and checking if the Scanner scans the exit of the code.
<img width="784" alt="builderPattern_Sol3" src="https://github.com/VinceTedChua/builderPattern/assets/142372312/a21b08a7-e9dd-4073-949d-594b8926cada">

