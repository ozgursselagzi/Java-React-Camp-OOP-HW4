package com.company;

public class GameSellManager implements ıGameSellManager{
    @Override
    public void buyGame(Customer customer, Game game) {
        System.out.println(game.getName()+" isimli oyun "+customer.getNickName()+" isimli oyuncu tarafından satın alındı.");
    }

    @Override
    public void sellGame(Customer customer, Game game) {
        System.out.println(game.getName()+" isimli oyun "+customer.getNickName()+" isimli oyuncu tarafından satıldı.");
    }
}
