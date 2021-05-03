package com.company;

public class GameManager extends  Game implements ıGameManager{

    @Override
    public void addGame(Game game) {
        System.out.println(game.getName()+" isimli oyun sisteme eklendi.");
    }

    @Override
    public void removeGame(Game game) {
        System.out.println(game.getName()+" isimli oyun sistemden silindi.");
    }

    @Override
    public void updateGame(Game game) {
        System.out.println(game.getName()+" isimli oyun sistemde güncellendi.");
    }
}
