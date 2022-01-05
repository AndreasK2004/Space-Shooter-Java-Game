package gui;

import spaceships.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SelectSpaceShipScreen extends JPanel {
    private static final long serialVersionUID = 1L;

    SelectSpaceShipScreen(){
        this.setLayout( new BorderLayout(30, 30) );
        this.setBackground(Color.BLACK);
        this.add(createNorthPanel(), BorderLayout.NORTH);
        this.add(createCenterPanel(), BorderLayout.CENTER);
        this.add(createSouthPanel(), BorderLayout.SOUTH);
    }

    private JPanel createNorthPanel()
    {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        JLabel label = new JLabel("Please choose your Spaceship ");
        label.setFont(new Font("Arcade Classic", Font.PLAIN, 25));
        label.setForeground(Color.WHITE);
        panel.setBackground(Color.BLACK);
        panel.add(label);
        return panel;
    }

    private JPanel createCenterPanel() {
        JButton btnspaceShipZero = new JButton();
        JButton btnspaceShipAlpha = new JButton();
        JButton btnspaceShipBeta = new JButton();
        JButton btnspaceShipGama = new JButton();
        JButton btnspaceShipDelta = new JButton();

        btnspaceShipZero.addActionListener(new SpaceShipSelectionBtnHandler("SZERO"));
        btnspaceShipAlpha.addActionListener(new SpaceShipSelectionBtnHandler("SALPHA"));
        btnspaceShipBeta.addActionListener(new SpaceShipSelectionBtnHandler("SBETA"));
        btnspaceShipGama.addActionListener(new SpaceShipSelectionBtnHandler("SGAMA"));
        btnspaceShipDelta.addActionListener(new SpaceShipSelectionBtnHandler("SDELTA"));

        btnspaceShipZero.setIcon(new ImageIcon(SpaceShipZERO.img));
        btnspaceShipAlpha.setIcon(new ImageIcon(SpaceShipALPHA.img));
        btnspaceShipBeta.setIcon(new ImageIcon(SpaceShipBETA.img));
        btnspaceShipGama.setIcon(new ImageIcon(SpaceShipGAMA.img));
        btnspaceShipDelta.setIcon(new ImageIcon(SpaceShipDELTA.img));

        makeBtnsTransparent(btnspaceShipZero);
        makeBtnsTransparent(btnspaceShipAlpha);
        makeBtnsTransparent(btnspaceShipBeta);
        makeBtnsTransparent(btnspaceShipGama);
        makeBtnsTransparent(btnspaceShipDelta);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.setBackground(Color.BLACK);
        panel.add(btnspaceShipZero);
        panel.add(btnspaceShipAlpha);
        panel.add(btnspaceShipBeta);
        panel.add(btnspaceShipGama);
        panel.add(btnspaceShipDelta);
        return panel;

    }

    private JPanel createSouthPanel() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        return  panel;
    }

    private void makeBtnsTransparent(JButton btn) {
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
    }


}
