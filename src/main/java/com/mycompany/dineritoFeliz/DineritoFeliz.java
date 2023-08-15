package com.mycompany.dineritoFeliz;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

import com.mycompany.dineritoFeliz.igu.Menu;
import javax.swing.UIManager;

/**
 *
 * @author malaf
 */
public class DineritoFeliz {

    public static void main(String[] args) {
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.focusWidth", 0);
        UIManager.put("Component.innerFocusWidth", 0);
        UIManager.put("Button.innerFocusWidth", 0);
        FlatMaterialLighterIJTheme.setup();

        //Creando uns instancia del Menu 
        Menu pantalla = new Menu();
        //Mostrando el programa 

        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

    }
}
