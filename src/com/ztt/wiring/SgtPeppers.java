package com.ztt.wiring;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    private String title="stupid henry";
    private String description = "it,s none of your business";
    public void play() {
        System.out.println(title + "get out@! thanks" + description);
    }
}
