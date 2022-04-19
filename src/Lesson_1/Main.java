package Lesson_1;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;
import java.util.Collection;

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

//        Создадим кнопку
        Button btn = new Button();
        btn.setText("Click me");

//        задаем позицию кнопки
        btn.setTranslateX(140);
        btn.setTranslateY(140);

//      задаем размер кнопки
        btn.setPrefSize(70,20);

// создаем обработчик событий
        CmdDebug cmdDebug = new CmdDebug();
        btn.setOnAction(event ->{
            cmdDebug.cmdPrint("Hello");
                });

//создаем сцену и ук
// азываем корневой узел - элемент где будут распологаться все поля, кнопки, итд
        Scene scene = new Scene(root);

//добавим кнопку на окно
        root.getChildren().addAll(btn);

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
