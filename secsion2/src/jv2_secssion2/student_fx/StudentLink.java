package jv2_secssion2.student_fx;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentLink implements Initializable {
    public TextArea txtLink;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String str ="";
        for (String s : StudentFx.studentList){
            str+=(s+"\n");
        }
        txtLink.setText(str);
    }
    public void toAss()throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("student.fxml"));
        StudentFx.mainStage.getScene().setRoot(root);
    }
}
