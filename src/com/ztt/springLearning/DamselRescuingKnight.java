package com.ztt.springLearning;

public class DamselRescuingKnight implements Knight {
    private Quest quest;
    public DamselRescuingKnight(Quest quest){
        this.quest = quest;
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
