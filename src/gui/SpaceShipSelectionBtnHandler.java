package gui;

import spaceships.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpaceShipSelectionBtnHandler implements ActionListener {
    String name;

    public SpaceShipSelectionBtnHandler (String x) {
        name = x;
    }

    public void actionPerformed (ActionEvent ev) {

        SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
        SpaceFrame.gamePlayScreen.setFocusable(true);
        SpaceFrame.gamePlayScreen.requestFocus();

        if (name.equalsIgnoreCase("SZERO")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipZERO());
        if (name.equalsIgnoreCase("SALPHA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipALPHA());
        if (name.equalsIgnoreCase("SBETA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipBETA());
        if (name.equalsIgnoreCase("SGAMA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipGAMA());
        if (name.equalsIgnoreCase("SDELTA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipDELTA());
    }
}
