package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddEmployeeController {
    @FXML
    private Button addEmployeeBtn;
    @FXML
    private Button resetBtn;
    @FXML
    private TextField empIdTf;
    @FXML
    private TextField empNameTf;
    @FXML
    private TextField empDeptTf;
    @FXML
    private TextArea dataArea;

    @FXML
    private Label totalEmpLb;

    private List<Employee> employeeList;

    public AddEmployeeController(){
        System.out.println("Button Reference inside constructor: " + addEmployeeBtn);
        employeeList = new ArrayList<Employee>();
    }

    public void initialize(){
        addEmployeeBtn.setOnAction(new AddButtonHandler());
        resetBtn.setOnAction(new AddButtonHandler());

    }

    private class AddButtonHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
            Button sourceBtn = (Button) e.getSource();
            if(sourceBtn == addEmployeeBtn){
                int id = Integer.parseInt(empIdTf.getText());
                String name = empNameTf.getText();
                String dept = empDeptTf.getText();
                Employee emp = new Employee(id,name,dept);
                employeeList.add(emp);
                dataArea.appendText(emp.toString() + "\n");
                totalEmpLb.setText("Total Employees: " +  employeeList.size());
                empIdTf.clear();
                empNameTf.clear();
                empDeptTf.clear();
            }
            else if(sourceBtn == resetBtn){
                empIdTf.clear();
                empNameTf.clear();
                empDeptTf.clear();
            }
        }
    }
}
