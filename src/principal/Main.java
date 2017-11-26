package principal;

import java.awt.Color;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
        janelaPrincipal.getContentPane().setBackground(Color.white);
        janelaPrincipal.setVisible(true);
    }
    
}
