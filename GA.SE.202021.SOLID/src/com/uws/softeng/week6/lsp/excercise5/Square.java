package com.uws.softeng.week6.lsp.excercise5;

public class Square extends Rectangle
{
    @Override
    public void setWidth(int width)
    {
        _width = width;
        _height = width;
    }

    @Override
    public void setHeight(int height)
    {
        _height = height;
        _width = height;
    }
}
