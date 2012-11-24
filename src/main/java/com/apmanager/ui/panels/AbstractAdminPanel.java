/*
 * AbstractAdminPanel
*/

package com.apmanager.ui.panels;

import com.apmanager.ui.menu.Application;
import javax.swing.JPanel;

/**
 *
 * @author luis
 */
public class AbstractAdminPanel extends JPanel{
    public void setTitle(String title){
        Application application = Application.getInstance();
        application.setTitle("APManager - "+title);
    }
}
