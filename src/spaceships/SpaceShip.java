package spaceships;

import spaceships_laserguns.Laser;
import spaceships_laserguns.Lasergun;

import javax.swing.*;

import java.util.LinkedList;

import static main.MainClass.*;

public class SpaceShip implements Navigation {

    public LinkedList<Laser> laserShootersLinkedList = new LinkedList<Laser>();

    public Lasergun gun;

    protected ImageIcon SpaceShipImageIcon;
    protected String SpaceShipName;
    protected int horPace;
    protected int verPace;
    protected int xCoord;
    protected int yCoord;
    public int spaceShipWidth;
    protected int spaceShipHeight;

    @Override
    public int moveUP() {
        yCoord -= verPace;
        if (yCoord < 0)
            yCoord = 0;
        return yCoord;
    }

    @Override
    public int moveDOWN() {
        yCoord += verPace;
        if (yCoord + verPace + spaceShipHeight + yOffSet > cosmosHeight)
            yCoord = cosmosHeight - spaceShipHeight - yOffSet;
        return yCoord;
    }

    @Override
    public int moveLEFT() {
        xCoord -= horPace;
        if (xCoord < 0)
            xCoord = 0;
        return xCoord;
    }

    @Override
    public int moveRIGHT() {
        xCoord += horPace;
        if (xCoord + spaceShipWidth > cosmosWidth)
            xCoord = cosmosWidth - spaceShipWidth;
        return xCoord;
    }

    public ImageIcon getIcon() {
        return SpaceShipImageIcon;
    }

    public int getX() {
        return xCoord;
    }

    public int getY() {
        return yCoord;
    }


    public void fire (int x, int y) {
        laserShootersLinkedList.add(laserShootersLinkedList.size(), new Laser(x, y, this));
    }
}
