module org.diegofg11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens org.diegofg11 to javafx.fxml;
    exports org.diegofg11;
}
