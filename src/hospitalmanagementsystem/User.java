/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospitalmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author lamashuhail
 */
public class User {
    private String firstName;
    private String lastName;
    private String ID;
    private int age;
    private char gender;
    private String phoneNumber;
    private String password;
    private String type;
    private boolean isLoggedIn;
    public User(){
        
    }
    public User(String firstName, String lastName, String ID, int age, char gender, String phoneNumber, String password, String type){
        this.firstName=firstName;
        this.lastName=lastName;
        this.ID=ID;
        this.age=age;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
    if (verifyPassword()) {
        this.password = password;
    } else {
        throw new IllegalArgumentException("Invalid password.");
    }
        this.type=type;
    }
//*********Accessor/getters********
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    } 
    
    public String getID(){
        return ID;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }
    public String getType(){
        return type;
    }
//*********Mutator/setters********
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setType(String tyoe){
        this.type=type;
    }

    public void setPassword(String password) {
//        if (verifyPassword()) {
//            this.password = password;
//        } else {
//            throw new IllegalArgumentException("Invalid password.");
//        }
Scanner scanner = new Scanner(System.in);

    while (true) {
        if (verifyPassword()) {
            this.password = password;
            break;
        } else {
            System.out.println("Invalid password. Please re-enter:");
            password = scanner.nextLine();
        }
    }

    scanner.close();
        }
    
    
    
        public void showInfo() {
        System.out.println("*******************************************************\n");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("*******************************************************\n");

    }
        
    public boolean verifyPassword(){
        boolean hasLowerCase, hasUpperCase, hasDigit;
        int length=password.length();
        hasLowerCase=false;
        hasUpperCase=false;
        hasDigit=false;
        
        for (int i=0; i<length; i++){
            char c= password.charAt(i);
            if(Character.isLowerCase(c))
                hasLowerCase=true;
            else if (Character.isUpperCase(c))
                hasUpperCase=true;
            else if (Character.isDigit(c))
                hasDigit=true;
            
            if (hasLowerCase && hasUpperCase && hasDigit)
                break;
        }
        return hasLowerCase && hasUpperCase && hasDigit && length >8;
        
    }
    

    
    
    
    
}
