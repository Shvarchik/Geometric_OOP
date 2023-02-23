import Exception.FigureException;
import Exception.IncorrectRadiusException;
import Exception.IncorrectSideException;
import Figures.FigureFactory;
import Figures.IFigure;
import Repository.DialogsRepository;
import Repository.FigureRepository;
import Controller.Controller;
import Dialog.IDialog;
import View.View;
import java.util.ArrayList;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) throws FigureException, IncorrectRadiusException, IncorrectSideException {
        View view = new View(new DialogsRepository(new ArrayList<IDialog>()), new Controller(new FigureRepository(new ArrayList<IFigure>()), new FigureFactory()));
        view.start();

    }
}