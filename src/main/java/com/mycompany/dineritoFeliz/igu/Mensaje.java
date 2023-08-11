
package com.mycompany.dineritoFeliz.igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Mensaje {

    public Mensaje() {
        
    }
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if (tipo.equalsIgnoreCase("informacion")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equalsIgnoreCase("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        } else if (tipo.equalsIgnoreCase("advertencia")){
            optionPane.setMessageType(JOptionPane.WARNING_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
}
