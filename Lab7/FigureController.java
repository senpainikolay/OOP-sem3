public class FigureController {

     Figure  maxArea(Figure[] figureArray)
    {
        double maxAreaFound = 0;
        int indexOfMaxAreaFigure = 0;
        for(int i = 0; i < figureArray.length; i++)
        {
            if(figureArray[i].getArea() > maxAreaFound)
            {
                maxAreaFound = figureArray[i].getArea();
                indexOfMaxAreaFigure= i;
            }
        }

        return figureArray[indexOfMaxAreaFigure];
    }




    Figure maxPerimeter(Figure[] figureArray)
    {
        double maxPerFound = 0;
        int indexOfMaxPerFigure = 0;

        for(int i = 0; i < figureArray.length; i++)
        {
            if(figureArray[i].getPerimeter() > maxPerFound)
            {
                maxPerFound = figureArray[i].getPerimeter();
                indexOfMaxPerFigure = i;
            }
        }

        return figureArray[indexOfMaxPerFigure];
    }
}