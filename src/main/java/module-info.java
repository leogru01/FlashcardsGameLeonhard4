module com.example.flashcardsgameleonhard {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flashcardsgameleonhard to javafx.fxml;
    exports com.example.flashcardsgameleonhard;
}