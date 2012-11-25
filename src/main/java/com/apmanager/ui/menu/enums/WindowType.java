/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apmanager.ui.menu.enums;

import com.apmanager.ui.menu.NewJPanel;
import com.apmanager.ui.panels.JPanelVenda;
import com.apmanager.ui.panels.productbrand.JPanelProductBrand;
import com.apmanager.ui.panels.shelf.JPanelShelf;
import com.apmanager.ui.panels.vehicle.JPanelVehicle;
import com.apmanager.ui.panels.vehiclebrand.JPanelVehicleBrand;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public enum WindowType {
    SALE(JPanelVenda.class),
    SALES_SEARCH(NewJPanel.class),
    PRODUCTREGISTER(NewJPanel.class),
    VEHICLE_BRAND_CRUD(JPanelVehicleBrand.class),
    SHELF_CRUD(JPanelShelf.class),
    VEHICLE_CRUD(JPanelVehicle.class),
    PRODUCT_BRAND_CRUD(JPanelProductBrand.class);
    Class<? extends JPanel> destined;

    private WindowType(Class<? extends JPanel> destined) {
        this.destined = destined;
    }

    public Class<? extends JPanel> getDestined() {
        return destined;
    }
}
