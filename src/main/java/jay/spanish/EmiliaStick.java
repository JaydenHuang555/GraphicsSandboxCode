package jay.spanish;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class EmiliaStick extends Stick{


    public EmiliaStick(int x, int y, String mood) {
        super(x, y, mood);
    }

    public EmiliaStick(int x, int y, String mood, boolean moving) {
        super(x, y, mood, moving);
    }

    public EmiliaStick(int x, int y, String mood, boolean moving, int speed) {
        super(x, y, mood, moving, speed);
    }

//    @Override
//    public void draw(Graphics2D g2) {
//        // Draw the stick body
//        g2.setColor(new Color(210, 180, 140)); // Tan color
//        g2.fillRoundRect(x, y, 40, 150, 20, 20);
//
//        // Draw the face background (white)
//        g2.setColor(Color.WHITE);
//        g2.fillOval(x - 10, y - 60, 60, 60);
//        g2.setColor(Color.BLACK);
//        g2.drawOval(x - 10, y - 60, 60, 60);
//
//        // Draw hair (half-circle over the top of the face)
//        g2.setColor(new Color(102, 51, 0)); // Dark brown hair
//        g2.fillArc(x - 10, y - 60, 60, 60, 0, 180); // Half circle (top half of oval)
//
//        // Redraw the face over the hair
//        g2.setColor(Color.WHITE);
//        g2.fillOval(x - 10, y - 60, 60, 60);
//        g2.setColor(Color.BLACK);
//        g2.drawOval(x - 10, y - 60, 60, 60);
//
//        // Eyes
//        g2.fillOval(x + 5, y - 45, 8, 8);
//        g2.fillOval(x + 25, y - 45, 8, 8);
//
//        // Mouth
//        if ("happy".equals(mood)) {
//            g2.drawArc(x + 5, y - 35, 30, 15, 0, -180);
//        } else {
//            g2.drawArc(x + 5, y - 20, 30, 15, 0, 180);
//        }
//    }

    public void draw(Graphics2D g2) {
        g2.setColor(new Color(102, 51, 0)); // Dark brown

        // Draw a stylized ponytail based on your sketch
//        GeneralPath rightHair = new GeneralPath();
//        rightHair.moveTo(x + 40, y - 60);     // Start from right top of face
//        rightHair.curveTo(x + 60, y - 70,     // curve out from the head
//                x + 60, y - 10,
//                x + 30, y2 + 30);    // curve down to the side
//        rightHair.curveTo(x + 20, y + 60,
//                x + 10, y + 30,
//                x + 20, y);         // curve back to body
//        rightHair.closePath();
//
//        g2.fill(rightHair);
//
//        GeneralPath leftHair = new GeneralPath();
//        leftHair.moveTo(x, y - 60);            // Top-left of face
//        leftHair.curveTo(x - 20, y - 70,
//                x - 20, y - 10,
//                x + 10, y + 30);
//        leftHair.curveTo(x + 20, y + 60,
//                x + 30, y + 30,
//                x + 20, y);           // Back to shoulder (centerish)
//        leftHair.closePath();
//        g2.fill(leftHair);
//
//        // RIGHT side hair flowing outward
//        GeneralPath rightHair = new GeneralPath();
//        rightHair.moveTo(x + 40, y - 50); // Near top-right of head
//        rightHair.curveTo(x + 70, y - 40,  // Curve out horizontally
//                x + 70, y + 20,
//                x + 40, y + 40); // Curve back in toward shoulder
//        rightHair.curveTo(x + 30, y + 45,
//                x + 25, y + 20,
//                x + 35, y - 5);  // Loop back up near head
//        rightHair.closePath();
//        g2.fill(rightHair);

        // RIGHT side hair flowing outward
        GeneralPath rightHair = new GeneralPath();
        rightHair.moveTo(x + 40, y - 50); // Near top-right of head
        rightHair.curveTo(x + 70, y - 40,  // Curve out horizontally
                x + 70, y + 20,
                x + 40, y + 40); // Curve back in toward shoulder
        rightHair.curveTo(x + 30, y + 45,
                x + 25, y + 20,
                x + 35, y - 5);  // Loop back up near head
        rightHair.closePath();
        g2.fill(rightHair);

        // LEFT side hair flowing outward
        GeneralPath leftHair = new GeneralPath();
        leftHair.moveTo(x, y - 50); // Near top-left of head
        leftHair.curveTo(x - 30, y - 40,  // Curve out horizontally
                x - 30, y + 20,
                x, y + 40);      // Curve back in toward shoulder
        leftHair.curveTo(x + 10, y + 45,
                x + 15, y + 20,
                x + 5, y - 5);   // Loop back up near head
        leftHair.closePath();
        g2.fill(leftHair);

        super.draw(g2);
    }



}
