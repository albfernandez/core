/**
 * License Agreement.
 *
 *  JBoss RichFaces - Ajax4jsf Component Library
 *
 * Copyright (C) 2007  Exadel, Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.richfaces.renderkit.html.images;

import java.awt.Dimension;
import java.awt.Graphics2D;

public class InputErrorIcon extends OneColorBasedResource {

    private static final Dimension DIMENSION = new Dimension(6, 11);
    
    public InputErrorIcon() {
        super("warningColor");
    }

    @Override
    public Dimension getDimension() {
        return DIMENSION;
    }

    @Override
    public void paint(Graphics2D g2d, Dimension dimension) {
        g2d.setColor(getBasicColor());
        g2d.fillRect(3, 2, 2, 6);
        g2d.fillRect(3, 9, 2, 2);
    }

}
