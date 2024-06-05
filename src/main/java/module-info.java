module telas.exerciciolp1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens telas.exerciciolp1 to javafx.fxml;
    exports telas.exerciciolp1;
}