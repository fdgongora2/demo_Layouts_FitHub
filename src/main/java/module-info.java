module com.example.demo_layouts_fithub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_layouts_fithub to javafx.fxml;
    exports com.example.demo_layouts_fithub;
}