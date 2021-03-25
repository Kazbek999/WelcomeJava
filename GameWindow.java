package Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private JButton btnStartGame;
    private JButton btnExitGame;
    private JPanel panelForButtons;

    private Settings settings;
    private GameMap gameMap;


    private final int WIN_WIDTH = 600;
    private final int WIN_HEIGHT = 600;
    private int winPosX;
    private int winPosY;

    GameWindow() {
        setupWindow();
        prepareButton();
        settings = new Settings(this);
        gameMap = new GameMap();
        add(panelForButtons, BorderLayout.NORTH);
        add(gameMap);
        setVisible(true);
    }


    private void setupWindow() {

        winPosX = 400;
        winPosY = 250;
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(winPosX, winPosY);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setResizable(true);
    }

    private void prepareButton() {
        btnStartGame = new JButton("Start game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });
        btnExitGame = new JButton("Exit game");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(1, 2));
        panelForButtons.add(btnStartGame);
        panelForButtons.add(btnExitGame);
            }
    void startGameWithUserSetting(int gameMod, int fieldSizeX, int fieldSizeY, int winLength) {
        gameMap.start(gameMod, fieldSizeX, fieldSizeY, winLength);
    }
    }
