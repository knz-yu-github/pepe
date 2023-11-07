module com.rabbit.usagi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rabbit.usagi to javafx.fxml;
    exports com.rabbit.usagi;
}