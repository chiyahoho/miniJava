package cpl;

import java.util.*;

public class Type{
    public static final Map<String,Type> types=new HashMap<>();
    private final String name;

    public Type(String name) {
        this.name = name;
    }
}