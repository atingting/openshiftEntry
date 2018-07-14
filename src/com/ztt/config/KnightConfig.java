package com.ztt.config;

import com.ztt.springLearning.DamselRescuingKnight;
import com.ztt.springLearning.Knight;
import com.ztt.springLearning.Quest;
import com.ztt.springLearning.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new DamselRescuingKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
