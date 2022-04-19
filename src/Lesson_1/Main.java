package Lesson_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//Наследуемся от класса Application
public class Main extends Application {
//Реализуем метод start - метод в котором пишем приложение
    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage - контейнер самого высокого уровня, окно
        primaryStage.setTitle("My window");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);

//создание коренвого узла
        Pane root = new Pane();

//создаем сцену и указываем корневой узел - элемент где будут распологаться все поля, кнопки, итд
        Scene scene = new Scene(root);

//задаем сцену  для нашего окна

        primaryStage.setScene(scene);

//        отобразим наше окно
        primaryStage.show();
    }
    //Реализуем метод main - запускаем наше приложение
    public static void main(String[] args) {
        launch(args);
    }
}
