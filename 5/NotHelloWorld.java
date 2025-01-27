/*
 * @Descripttion: 
 * @version: 
 * @Author: Kzh
 * @Date: 2025-01-27 14:29:27
 * @LastEditors: 2ofus
 * @LastEditTime: 2025-01-27 15:41:51
 */
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class NotHelloWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                NotHelloWorldFrame notHelloWorldFrame = new NotHelloWorldFrame();
                notHelloWorldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                notHelloWorldFrame.setVisible(true);
            }
            
        });
    }
}
class NotHelloWorldFrame extends JFrame{
    public NotHelloWorldFrame(){
        setTitle("NotHelloWorld");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        NotHelloWorldPanel panel=new NotHelloWorldPanel();
        add(panel);
    }
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;
    
}

class NotHelloWorldPanel extends JPanel{
    public void paintComponent(Graphics g){
        g.drawString("我好喜欢碱水粽_啊", MESSAGE_X, MESSAGE_Y);
        
    }
    public static final int MESSAGE_X=75;
    public static final int MESSAGE_Y=100;
}