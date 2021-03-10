package models;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Students {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> interests;
    private Image stImage1;
    private Image stImage2;

    /**
     * Creating a constructor
     */
    public Students(String firstName, String lastName, int studentNumber, ArrayList<String> interests) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);
        setInterests(interests);
        setStImage();
        setStImage1();
    }

    /**
     * This method will add student images.
     */
    private void setStImage(){
        String imageName = "images/Minions1.jpg";
        stImage1 = new Image(imageName);
    }

    public Image getStImage() {
        return stImage1;
    }

    public Image getStImage1() {
        return stImage2;
    }

    public void setStImage1() {
        String imageName2 = "images/minions.jpg";
        stImage2 = new Image(imageName2);
    }

    /**
     * Creating setter and getters for each field.
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * Adding Interests getter and Setter..
     * @return
     */
    public ArrayList<String> getInterests() {
        return interests;
    }

    /**
     * Validating all the interests.
     * @param interests
     */
    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;

    }

    /**
     * Declaring all valid interests.
     * @return
     */
    public static List<String> getInterest() {
        return Arrays.asList("coding", "gaming", "hiking", "skiing", "reading", "playing", "writing", "singing");
    }

    /**
     * To string method.
     * @return
     */
    public String toString()
    {
        return "Your name is : " + firstName + " " + lastName + "\n" + "Your Student Number is : " + studentNumber + "\n" + "Your interest is : " + interests;
    }

}
