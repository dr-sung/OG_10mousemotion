
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Mouse Motions events: MouseMotionListener
// (1) dragged, (2) moved
public class MouseMotionEventTester extends JFrame {

    private JPanel canvas;

    public void initialize() {

        canvas = new JPanel();
        canvas.setBackground(Color.blue);
        canvas.addMouseMotionListener(new MouseMotionEventSpy());
        Container cp = getContentPane();
        cp.add(canvas, "Center");
    }

    private class MouseMotionEventSpy implements MouseMotionListener {

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Mouse moved. x = " + e.getX() + " y = " + e.getY());
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Mouse dragged. x = " + e.getX() + " y = " + e.getY());
        }
    }
}
