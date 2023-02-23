package View;

import Controller.Controller;
import Dialog.*;
import Exception.IncorrectRadiusException;
import Exception.IncorrectSideException;
import Repository.DialogsRepository;
import java.util.Scanner;

public class View {

    DialogsRepository dialogRep;
    Controller controller;


    public View(DialogsRepository dialogRep, Controller controller){
        this.dialogRep = dialogRep;
        this.controller = controller;
    }

    

        
    public void fullDialogRep(){
        dialogRep.add(new TriangleDialog());
        dialogRep.add(new RectangleDialog());
        dialogRep.add(new SquareDialog());
        dialogRep.add(new CircleDialog());
    }
         

    public void printMenu(){
        System.out.println("1 - Добавить фигуру\n2 - Просмотр всех периметров\n3 - Просмотр всех площадей\n4 - Просмотр всех длин окружности\n5 - Выход");
    }

    private void showPerimeters(){
        for (int i = 0; i < controller.getPerimeters().length; i++) {
            System.out.println(controller.getPerimeters()[i]);
        }
    }

    private void showAreas(){
        for (int i = 0; i < controller.getAreas().length; i++) {
            System.out.println(controller.getAreas()[i]);
        }
    }

    private void showLengths(){
        for (int i = 0; i < controller.getLengths().length; i++) {
            System.out.println(controller.getLengths()[i]);
        }
    }

    private void showDialog(int index) throws IncorrectRadiusException, IncorrectSideException{
        switch (index){
            case 1 -> controller.addFigure(1, dialogRep.getFigure(0).showDialog());
            case 2 -> controller.addFigure(2, dialogRep.getFigure(1).showDialog());
            case 3 -> controller.addFigure(3, dialogRep.getFigure(2).showDialog());
            case 4 -> controller.addFigure(4, dialogRep.getFigure(3).showDialog());
        }
    }

    private void showDialogList(){
        
        System.out.println("Cоздать:\n 1 - Треугольник\n2 - Прямоугольник\n3 - Квадрат\n4 - Круг");
    }

    private int chooseValue(){
        try (Scanner scan = new Scanner(System.in)) {
            int choice = scan.nextInt();
            return choice;
        }
    }

    public void start() throws IncorrectRadiusException, IncorrectSideException{
        fullDialogRep();
        boolean flag = true;
        while (flag) {
            printMenu();
            int choice = chooseValue();
            switch (choice) {

                case 1: 
                    showDialogList();
                    int choice1 = chooseValue();
                    showDialog(choice1);
                    System.out.println("Добавлено");
                    break;

                case 2: 
                    showPerimeters();
                    break;

                case 3:
                    showAreas();
                    break;

                case 4: 
                    showLengths();
                    break;

                case 5: flag = false;

            }
        }
    }
}

   


