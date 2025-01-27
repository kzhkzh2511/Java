/*
 * @Descripttion: 
 * @version: 
 * @Author: Kzh
 * @Date: 2025-01-27 13:17:35
 * @LastEditors: 2ofus
 * @LastEditTime: 2025-01-27 13:32:50
 */

import javax.swing.JFrame;

public class SimpleFrameTest {
    public static void main(String[] args) {
        SimpleFrame frame=new SimpleFrame();
        frame.setLocation(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class SimpleFrame extends JFrame{
    public SimpleFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;
    
}