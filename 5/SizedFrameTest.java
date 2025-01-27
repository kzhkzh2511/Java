/*
 * @Descripttion: 
 * @version: 
 * @Author: Kzh
 * @Date: 2025-01-27 13:52:19
 * @LastEditors: 2ofus
 * @LastEditTime: 2025-01-27 14:29:32
 */
import javax.swing.*;
import java.awt.*;

public class SizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                SizedFrame frame=new SizedFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
            
        });
    }
}
class SizedFrame extends JFrame{
    public SizedFrame(){
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int screenWidth=screenSize.width;
        int screenHeight=screenSize.height;
        setSize(screenWidth/2,screenHeight/2);
        setLocationByPlatform(true);
        Image img=kit.getImage("icon.jpg");
        setIconImage(img);
        setTitle("SizedFrame");
    }
}