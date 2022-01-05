package spaceships;

import main.MainClass;
import spaceships_laserguns.Lasergun;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SpaceShipDELTA extends SpaceShip {
    public static Image img;

    static {
        try {
            SpaceShipDELTA.img = ImageIO.read(new File("images/DELTA.png"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public SpaceShipDELTA() {
        spaceShipWidth = 122;
        spaceShipHeight = 112;
        SpaceShipName = "DELTA";
        horPace = 40;
        verPace = 40;
        xCoord = 0;
        yCoord = MainClass.cosmosHeight - spaceShipHeight - MainClass.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipDELTA.img);

        gun = new Lasergun(Color.BLUE);
    }
}