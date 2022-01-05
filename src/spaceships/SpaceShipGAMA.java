package spaceships;

import main.MainClass;
import spaceships_laserguns.Lasergun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SpaceShipGAMA extends SpaceShip {
    public static Image img;

    static {
        try {
            SpaceShipGAMA.img = ImageIO.read(new File("images/GAMA.png"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public SpaceShipGAMA() {
        spaceShipWidth = 110;
        spaceShipHeight = 100;
        SpaceShipName = "GAMA";
        horPace = 30;
        verPace = 30;
        xCoord = 0;
        yCoord = MainClass.cosmosHeight - spaceShipHeight - MainClass.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipGAMA.img);

        gun = new Lasergun(Color.BLUE);
    }
}

