package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import models.Students;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {

    /**
     * Adding instances of variable in javafx.
     */

    @FXML
    private Label firstNameStudent;

    @FXML
    private Label lastNameStudent;

    @FXML
    private Label numberStudent;

    @FXML
    private ListView stActivities;

    @FXML
    private ImageView studentImage;

    @FXML
    private RadioButton student1;

    @FXML
    private RadioButton student2;

    /**
     * Adding 2 student objects
     */
    private Students student1o;
    private Students student2o;

    /**
     * Added the values of student objects
     * and adding their interests/activities.
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("coding");
        arrayList1.add("hiking");
        arrayList1.add("playing");
        arrayList1.add("writing");
        arrayList1.add("skiing");
        arrayList1.add("adventures");
        arrayList1.add("photography");
        arrayList1.add("movies");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("reading");
        arrayList2.add("playing");
        arrayList2.add("hiking");
        arrayList2.add("gaming");
        arrayList2.add("travelling");
        arrayList2.add("hunt");
        arrayList2.add("crafting");

        student1o = new Students("Tony", "White", 123456, arrayList2);
        student2o = new Students("John", "Watson", 234567, arrayList1);
    }

    /**
     * Adding toggle group for radio buttons.
     */
    ToggleGroup radioGroup = new ToggleGroup();

    /**
     * This is the Student one method.
     */
    @FXML
    public void getStudent1() {


        student1.setToggleGroup(radioGroup);

        firstNameStudent.setText(student1o.getFirstName());
        lastNameStudent.setText(student1o.getLastName());
        numberStudent.setText(Integer.toString(student1o.getStudentNumber()));
        studentImage.setImage(student1o.getStImage());


        ObservableList<String> observableArrayList =
                FXCollections.observableArrayList(student1o.getInterests());
        stActivities.setItems((ObservableList) observableArrayList);

    }

    /**
     * This is student two method.
     */
    @FXML
    public void getStudent2() {


        student2.setToggleGroup(radioGroup);

        firstNameStudent.setText(student2o.getFirstName());
        lastNameStudent.setText(student2o.getLastName());
        numberStudent.setText(Integer.toString(student2o.getStudentNumber()));
        studentImage.setImage(student1o.getStImage1());

        ObservableList<String> observableArrayList =
                FXCollections.observableArrayList(student2o.getInterests());
        stActivities.setItems((ObservableList) observableArrayList);

    }

}
