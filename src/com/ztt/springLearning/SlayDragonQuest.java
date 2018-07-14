package com.ztt.springLearning;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }
    @Override
    public void embark() {
        stream.print("Embarking on quest to slay the dragon");
    }
}
