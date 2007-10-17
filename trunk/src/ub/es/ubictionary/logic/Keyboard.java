/*
 * Copyright (C) 2007 Aram Julhakyan
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You can find the completa text of the license in LICENSE.TXT distributed with Omnidic's source files.
 */

package ub.es.ubictionary.logic;

import javax.microedition.lcdui.Canvas;

/**
 *
 * @author aram
 */
public class Keyboard {
    
    /** Creates a new instance of Keyboard */
    public Keyboard() {
    }
    
    public static int getValidKeyCode(int gameCode, int rawCode){
        if (rawCode == Canvas.KEY_NUM0 || rawCode == Canvas.KEY_NUM1 || rawCode == Canvas.KEY_NUM2 || rawCode == Canvas.KEY_NUM3 
                || rawCode == Canvas.KEY_NUM4 || rawCode == Canvas.KEY_NUM5 || rawCode == Canvas.KEY_NUM6 || rawCode == Canvas.KEY_NUM7 
                || rawCode == Canvas.KEY_NUM8 || rawCode == Canvas.KEY_NUM9 || rawCode == Canvas.KEY_POUND || rawCode == Canvas.KEY_STAR){
            
            return rawCode;
        }else{
            if (gameCode !=0)
                return gameCode;
            else
                return rawCode;
        }
        
    }
}
