package cod_10_factory;
//@author fsancheztemprano

import javax.swing.JOptionPane;

public class WinDialog extends Dialogo {

    @Override
    public void mostrar(String str) {
        JOptionPane.showMessageDialog(null, str);
    }

}
