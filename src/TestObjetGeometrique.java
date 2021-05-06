import interfaces.ObjetGeometrique;
import models.Cercle;
import models.Rectangle;

public class TestObjetGeometrique {

    public static void main(String[] args) {

        ObjetGeometrique[] objetGeometriques = new ObjetGeometrique[2];
        objetGeometriques[0] = new Cercle(4);
        objetGeometriques[1] = new Rectangle(2, 3);

        for (ObjetGeometrique oGeometrique : objetGeometriques) {
            System.out.println(oGeometrique.getClass().getName());
            System.out.println("perimetre = " + oGeometrique.perimetre());
            System.out.println("surface = " + oGeometrique.surface());
        }

    }

}
