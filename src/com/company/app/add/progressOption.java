package com.company.app.add;

public enum progressOption {
    Completed, Watching, Dropped;

    progressOption() {}

    public String value() {
        return name();
    }

    public static progressOption fromValue(String v) {
        return valueOf(v);
    }
}
