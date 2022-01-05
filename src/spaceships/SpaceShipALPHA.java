package spaceships;

import main.MainClass;
import spaceships_laserguns.Lasergun;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.io.File;

public class SpaceShipALPHA extends SpaceShip {
    public static Image img;

    static {
        try {
            SpaceShipALPHA.img = ImageIO.read(new File("images/ALPHA.png"));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public SpaceShipALPHA() {
        spaceShipWidth = 94;
        spaceShipHeight = 110;
        SpaceShipName = "ALPHA";
        horPace = 10;
        verPace = 10;
        xCoord = 0;
        yCoord = MainClass.cosmosHeight - spaceShipHeight - MainClass.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipALPHA.img);

        gun = new Lasergun(Color.BLUE);
    }
}

