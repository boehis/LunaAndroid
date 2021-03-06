package com.stan.app.lunaandroid.util;

import android.view.View;

public class TriangleDetail {

    private double fullWidth;
    private double fullHeight;
    private double triangleWidth;
    private double triangleHeight;
    private double heightDiff;
    private double widthDiff;
    private View view;

    public TriangleDetail(View view) {
        this.view = view;
        fullWidth = view.getWidth();
        fullHeight = view.getHeight();
        triangleWidth = fullWidth;
        triangleHeight = fullHeight;
        heightDiff = 0;
        widthDiff = 0;
        if (fullHeight < (Math.sqrt(3) / 2 * fullWidth)) {
            //space on sides
            triangleWidth = fullHeight * 2 / Math.sqrt(3);
            widthDiff = (fullWidth - triangleWidth) / 2;
        } else {
            //space top / bottom
            triangleHeight = Math.sqrt(3) / 2 * fullWidth;
            heightDiff = (fullHeight - triangleHeight) / 2;
        }
    }

    public View getView() {
        return view;
    }

    public double getFullWidth() {
        return fullWidth;
    }

    public double getFullHeight() {
        return fullHeight;
    }

    public double getTriangleWidth() {
        return triangleWidth;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    public double getHeightDiff() {
        return heightDiff;
    }

    public double getWidthDiff() {
        return widthDiff;
    }
}
