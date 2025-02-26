module com.example.contactinfodisplay {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contactinfodisplay to javafx.fxml;
    exports com.example.contactinfodisplay;
}