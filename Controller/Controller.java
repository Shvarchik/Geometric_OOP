package Controller;

import Figures.FigureFactory;
import Repository.FigureRepository;
import Exception.*;

public class Controller {
    FigureRepository figureRepository;
    FigureFactory figureCreater;
    
    public Controller(FigureRepository figureRepository, FigureFactory figureCreater){
        this.figureRepository = figureRepository;
        this.figureCreater = figureCreater;
    }

    public void addFigure(int figureType, double[] parameters) throws IncorrectRadiusException, IncorrectSideException {
        figureRepository.add(figureCreater.createFigure(figureType, parameters));
    }

    public double[] getPerimeters(){
        return  figureRepository.getPerimeters();
    }

    public double[] getAreas(){
        return  figureRepository.getAreas();
    }

    public double[] getLengths(){
        return figureRepository.getLengths();
    }


}
