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
        // 제자리에서 클릭했을때 발생 (단,누른후 다른곳으로 이동하게 되면 발생하지 않음.)
        System.out.println("Clinked : " + e.getPoint()) ;  
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // 클릭하는 순간 발생하는 이밴트
        System.out.println("Pressed : " + e.getPoint()) ;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // 클릭후 클릭을 때는 순간 발생하는 이벤트
        System.out.println("Release : " + e.getPoint()) ;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // 프레임에 마우스가 들어가는 순간 발생하는 이밴트
        System.out.println("Entered : " + e.getPoint()) ;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // 프래임에 마우스가 밖으로 나가는 순간 발생하는 이벤트
        System.out.println("Exited : " + e.getPoint()) ;
    }

}
    