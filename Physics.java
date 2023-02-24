
package physics;

import java.awt.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.Observer;
import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;


public class Physics extends Application {
    double result;
    
    @Override
    public void start(Stage primaryStage) {
      
       Label lbl1 = new Label("Input forse(only fractional number):");//надпись
       Label lbl2 = new Label("Input area(only fractional number):");
       Button btn1 = new Button("Count pressure");
       TextField txt = new TextField();//редактор
       TextField txt2 = new TextField();//редактор
       TextField txt3= new TextField("Result: ");
               
       btn1.setOnAction((event) -> {
           {
               try{
                String text1=txt.getText();
           String text2= txt2.getText();
           double f= Double.parseDouble(text1);
           double f2= Double.parseDouble(text2);
           Double result=f/f2;
           txt3.setText(result.toString());
               }catch(Exception ex){txt3.setText("Write fractional number!");}
           }
    });
       
     
       
       Label lbl3 = new Label("Input voltage(only fractional number):");//надпись
       Label lbl4 = new Label("Input resistance(only fractional number):");
       Button btn2 = new Button("Count intensity");
       TextField txt4 = new TextField();//редактор
       TextField txt5 = new TextField();//редактор
       TextField txt6= new TextField("Result: ");
               
       btn2.setOnAction((event) -> {
           {
               try{
                String text1=txt4.getText();
           String text2= txt5.getText();
           double f= Double.parseDouble(text1);
           double f2= Double.parseDouble(text2);
           Double result=f/f2;
           txt6.setText(result.toString());
               }catch(Exception ex){txt6.setText("Write fractional number!");}
           }
    });
       
       
       Label lbl5 = new Label("Input current flowing(only fractional number):");//надпись
       Label lbl6 = new Label("Input resistance (only fractional number):");
       Button btn3 = new Button("Count voltage");
       TextField txt7 = new TextField();//редактор
       TextField txt8 = new TextField();//редактор
       TextField txt9= new TextField("Result: ");
               
       btn3.setOnAction((event) -> {
           {
               try{
           String text1=txt7.getText();
           String text2= txt8.getText();
           double f= Double.parseDouble(text1);
           double f2= Double.parseDouble(text2);
           Double result=f*f2;
           txt9.setText(result.toString());
               }catch(Exception ex){txt9.setText("Write fractional number!");}
           }
    });

       GridPane root= new GridPane();//сетка размещение элементов
       
        root.setVgap(20);
       root.setHgap(5);
       root.add(lbl1, 0, 0);//первая метка столбец-0 строка-0/ formula 1
       root.add(txt,1,0); //столбец1- строка 0
       root.add(lbl2,0,1);
       root.add(txt2,1,1);
       root.add(btn1,2,0);
       root.add(txt3,2,1);
      
       
       root.add(lbl3, 0, 4);//первая метка столбец-0 строка-0 //formula 2
       root.add(txt4,1,4); //столбец1- строка 0
       root.add(lbl4,0,5);
       root.add(txt5,1 ,5);
       root.add(btn2,2,4);
       root.add(txt6,2,5);

       
       root.add(lbl5, 0, 8);//первая метка столбец-0 строка-0 //formula 3
       root.add(txt7,1,8); //столбец1- строка 0
       root.add(lbl6,0,9);
       root.add(txt8,1 ,9);
       root.add(btn3,2,8);
       root.add(txt9,2,9);
      
     Button btn4 = new Button("   Exit   ");
       btn4.setOnAction((event) -> {
           {
               primaryStage.close();
           }
    });
     
       root.add(btn4, 1, 11);
       root.setStyle("-fx-background-color: #E6E6FA;");

        Scene scene = new Scene(root, 600, 450);//размер окна
      
        primaryStage.setTitle("                                                  MAIN FORMULA");//главная сцена
       //  scene.setFill(Color.web("E6E6FA"));
        
        primaryStage.setScene(scene);
        primaryStage.show();
       
       
        
      
     
    }

  
    public static void main(String[] args) {
        launch(args);//запуск
      
        
    }
    
}
