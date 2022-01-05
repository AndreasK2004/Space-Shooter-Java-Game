package spaceships;

import main.MainClass;
import spaceships_laserguns.Lasergun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SpaceShipBETA extends SpaceShip {
    public static Image img;

    static {
        try {
            SpaceShipBETA.img = ImageIO.read(new File("images/BETA.png"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public SpaceShipBETA() {
        spaceShipWidth = 117;
        spaceShipHeight = 103;
        SpaceShipName = "BETA";
        horPace = 20;
        verPace = 20;
        xCoord = 0;
        yCoord = MainClass.cosmosHeight - spaceShipHeight - MainClass.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipBETA.img);

        gun = new Lasergun(Color.BLUE);
    }
}
