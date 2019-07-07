import java.lang.Math;
class Darts {
    double xcoord, ycoord,radius;
    Darts(double x, double y) {
        xcoord=x;
        ycoord=y;
    }

    int score() {
        int points=0;
        radius=Math.sqrt(Math.pow(xcoord,2)+Math.pow(ycoord,2));
        if(radius<=1)
            points=10;
        else if(radius<=5)
            points=5;
        else if(radius<=10)
            points=1;
        return points;
    }

}

