module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens org.diegofg11 to javafx.fxml;
    exports org.diegofg11;
}