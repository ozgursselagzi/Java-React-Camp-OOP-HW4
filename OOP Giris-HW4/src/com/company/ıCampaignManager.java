package com.company;

public interface ıCampaignManager {
    void addCampaign(Campaign campaign);
    void removeCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
    void calculateCampaign(Campaign campaign, Game game);
}
