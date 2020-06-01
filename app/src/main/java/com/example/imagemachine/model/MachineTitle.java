package com.example.imagemachine.model;

import java.util.ArrayList;

public class MachineTitle {
    private String mTitle;
    private String mType;

    public MachineTitle(String title, String type) {
        this.mTitle = title;
        this.mType = type;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getType() {
        return mType;
    }

    public static ArrayList<MachineTitle> createMachineTitle(String title, String type) {
        ArrayList<MachineTitle> machineTitles = new ArrayList<MachineTitle>();

        for (int i = 0; i <= machineTitles.size(); i++) {
            machineTitles.add(new MachineTitle("Title: "+i, "Type: "+i));
        }
        return machineTitles;
    }

}
