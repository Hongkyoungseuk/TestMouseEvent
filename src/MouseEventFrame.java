import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseEventFrame extends Frame implements MouseListener {

        public MouseEventFrame() {
            // 테스트 프레임 크기는 200 x 100
            this.setSize(200, 100);

            // ActionEvent 리스너를 등록
            this.addMouseListener(this);

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Clinked : " + e.getPoint()) ;
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Pressed : " + e.getPoint()) ;

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Release : " + e.getPoint()) ;

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Entered : " + e.getPoint()) ;

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            System.out.println("Exited : " + e.getPoint()) ;

        }

}
    