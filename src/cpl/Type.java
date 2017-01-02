package cpl;

import java.util.*;

public class Type{
    public static final Map<String,Type> types = new HashMap<>();
    private final String name;
    private final Map<String, List<Type>> methods = new HashMap<>();

    public Type(String name) {
        this.name = name;
    }

    public boolean addMethod(String name, List<Type> args) {
        return methods.put(name, args) != null;
    }
}