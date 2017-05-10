
package view;

import java.awt.Graphics;
import model.TortueBalle;

/**
 *
 * @author Mélanie DUBREUIL
 * @author Ophélie EOUZAN
 */
public class TortueBalleView extends TortueView {
    
    public TortueBalleView(TortueBalle tortue) {
        super(tortue);
    }

    @Override
    public void drawTurtle(Graphics graphics) {
        if (graphics == null) return;

        int radius = 5;
        TortueBalle t = (TortueBalle) tortue;
        graphics.drawOval(t.getFollow().getX() - radius, t.getFollow().getY() - radius, 2 * radius, 2 * radius);
    }
}