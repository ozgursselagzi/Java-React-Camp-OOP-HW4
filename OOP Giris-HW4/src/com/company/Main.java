package com.company;

public class Main {

    public static void main(String[] args) {
	// Java & React Kampı 4. Gün Ödev Kodları

        Customer customer = new Customer();
        CustomerManager customerManager = new CustomerManager();
        Game game = new Game();
        GameManager gameManager = new GameManager();
        GameSellManager gameSellManager = new GameSellManager();
        Campaign campaign = new Campaign();
        CampaignManager campaignManager = new CampaignManager();
        VerifyManager verifyManager = new VerifyManager();

        customer.setNationalId("12345678987");
        customer.setFirstName("Özgür");
        customer.setLastName("SELAĞZI");
        customer.setNickName("OzguRS");
        customer.setBirthDate("2001");

        verifyManager.verify(customer);

        System.out.println("---------------------------------------------------------------");

        System.out.println("Oyuncu TC No: "+customer.getNationalId());
        System.out.println("Oyuncu adı: "+customer.getFirstName());
        System.out.println("Oyuncu soyadı: "+customer.getLastName());
        System.out.println("Oyuncu oyuniçi adı: "+customer.getNickName());
        System.out.println("Oyuncu doğum yılı: "+customer.getBirthDate());

        customerManager.addCustomer(customer);
        customerManager.removeCustomer(customer);
        customerManager.updateCustomer(customer);

        System.out.println("---------------------------------------------------------------");

        game.setName("CSGO");
        game.setType("Tactical");
        game.setPrice(150);

        System.out.println("Oyun adı: "+game.getName());
        System.out.println("Oyun türü: "+game.getType());
        System.out.println("Oyun fiyatı: "+game.getPrice());

        gameManager.addGame(game);
        gameManager.removeGame(game);
        gameManager.updateGame(game);


        System.out.println("---------------------------------------------------------------");

        gameSellManager.buyGame(customer,game);
        gameSellManager.sellGame(customer,game);

        System.out.println("---------------------------------------------------------------");

        campaign.setName("Ramazan Ayı Özel");
        campaign.setTime("15 gün");
        campaign.setDiscountAmount(20);

        campaignManager.addCampaign(campaign);
        campaignManager.removeCampaign(campaign);
        campaignManager.updateCampaign(campaign);
        campaignManager.calculateCampaign(campaign,game);


    }
}
