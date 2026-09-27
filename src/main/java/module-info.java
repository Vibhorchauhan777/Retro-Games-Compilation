module game_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    exports game_project.gamebox;
    opens game_project.gamebox to javafx.graphics, javafx.fxml;
    
    exports game_project.tetris;
    opens game_project.tetris to javafx.graphics, javafx.fxml;
}
