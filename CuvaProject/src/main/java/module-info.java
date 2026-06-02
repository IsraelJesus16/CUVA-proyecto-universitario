module com.mycompany.cuvaproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.pdfbox;
    requires javafx.base;

    opens com.mycompany.cuvaproject to javafx.fxml;
    exports com.mycompany.cuvaproject;
}