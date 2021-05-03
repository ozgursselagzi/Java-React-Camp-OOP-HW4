package com.company;

public class CampaignManager implements ıCampaignManager{
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getName()+" kampanyası "+campaign.getTime()+" süre ile başladı!");
    }

    @Override
    public void removeCampaign(Campaign campaign) {
        System.out.println(campaign.getName()+" kampanyası sona erdi!");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getName()+" kampanyası güncellendi!");
    }

    @Override
    public void calculateCampaign(Campaign campaign, Game game) {
        float newPrice = game.getPrice() - ((game.getPrice() * campaign.getDiscountAmount()) / 100);
        System.out.println(game.getName()+" isimli oyunun kampanya ile birlikte yeni fiyatı: "+newPrice+"TL");
    }
}
