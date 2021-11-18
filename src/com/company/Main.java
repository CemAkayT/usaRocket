package com.company;

public class Main {
    public static void main(String[] args) {
        drawCone();
        drawBox();
        System.out.println("|  USA  |");
        drawBox();
        drawCone();
    }
    private static void drawBox() {
        System.out.println("+-------+");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("+-------+");

    }
    private static void drawCone() {
        System.out.println("   / \\");
        System.out.println("  /   \\");
        System.out.println(" /     \\");
    }


}
