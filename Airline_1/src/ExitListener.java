/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UJJWAL YADAV
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author UJJWAL YADAV
 */
package ExitListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;

import javax.swing.*;

import java.io.*;



public class ExitListener extends WindowAdapter 
{
	public void windowClosing(WindowEvent event) 
	{
		System.exit(0);
	}
}
