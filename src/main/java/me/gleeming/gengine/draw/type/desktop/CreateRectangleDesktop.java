package me.gleeming.gengine.draw.type.desktop;

import me.gleeming.gengine.color.GengineColor;
import me.gleeming.gengine.loop.types.DesktopGameLoop;

import java.awt.*;

public class CreateRectangleDesktop {
    public CreateRectangleDesktop(int x, int y, int width, int height, GengineColor color, boolean filled) {
        Graphics2D graphics2D = DesktopGameLoop.getDrawTo();

        if(color != null) graphics2D.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue()));

        if(filled) graphics2D.fillRect(x, y, width, height);
        else graphics2D.drawRect(x, y, width, height);
    }
}
