package Dominoes;

import java.util.Arrays;

public class Dominoes {

    private final int left;
    private final int right;

    public Dominoes(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }
}
