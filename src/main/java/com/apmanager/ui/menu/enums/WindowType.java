/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apmanager.ui.menu.enums;

import com.apmanager.ui.menu.NewJPanel;
import com.apmanager.ui.panels.JPanelVenda;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public enum WindowType {
    VENDA(JPanelVenda.class),
    PESQUISA(NewJPanel.class),
    CADASTROPRODUTO(NewJPanel.class);
    Class<? extends JPanel> destined;

    private WindowType(Class<? extends JPanel> destined) {
        this.destined = destined;
    }

    public Class<? extends JPanel> getDestined() {
        return destined;
    }
}
