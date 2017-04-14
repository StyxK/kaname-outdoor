package GUI;

import java.awt.*;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import Model.ModelProblemList;
import defult.ConnectDB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.border.TitledBorder;

public class ProblemList extends JFrame {
    private static int programWidth;
    private static int programHeight;
    private static int count=0;
    private String filterPrompt;
    
    //========================== to set window in center of screen =================//
    
    private void setLocationOnScreen(){
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize=getSize();
        programWidth = ((screenSize.width-frameSize.width)+100)/4;
        programHeight = (screenSize.height-frameSize.height)/40;
        System.out.println(programHeight);
        System.out.println(programWidth);
    }
    
    //=====================================================================//
    
    public static void setListText(ModelProblemList ml,JPanel boxHead){
        
        //============================ no data in database =================//
        if(ml.getName()==null){
            JPanel noListPane = new JPanel(null);
            noListPane.setBackground(null);
            noListPane.setPreferredSize(new Dimension(500,500));
            JLabel noList = new JLabel();
            noList.setForeground(Color.YELLOW);
            noList.setFont(new Font("Tahoma",0,30));
            noList.setBounds(25,200,460,50);
            noList.setText("ยังไม่มีปัญหาที่ได้รับการแจ้งในตอนนี้");
            noListPane.add(noList);
            boxHead.add(noListPane);
        }
        //==================================================================//
        
        //============================ to set data to this page ==============================//
        if(ml.getName()!=null){
            for(int i=0;i<ml.getName().size();i++){
                JPanel j = new JPanel(new FlowLayout());
                JPanel form = new JPanel(new BorderLayout());
                j.setBackground(Color.orange);
                form.setPreferredSize(new Dimension(500,250));
                form.setBackground(Color.GRAY);
                form.setVisible(true);
                form.setLayout(new BorderLayout());
                //=================//
                JPanel top = new JPanel(new BorderLayout());
                top.setBackground(Color.orange);
                //=================//
                JLabel pic = new JLabel();
                pic.setIcon(new ImageIcon(new ImageIcon("D:/kaname-outdoor/pic/accNullPro.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT)));
                top.add(pic,BorderLayout.LINE_START);
                JLabel name = new JLabel(ml.getMember().get(i));
                top.add(name);
                //=================//
                
                //=================//
                JLabel time = new JLabel();
                time.setText(ml.getTime().get(i));
                top.add(time,BorderLayout.EAST);
                form.add(top,BorderLayout.NORTH);
                //=================//
                JPanel content = new JPanel(new GridLayout(0,2));
                content.setBackground(Color.yellow);
                //=================//
                JLabel picContent = new JLabel();
                picContent.setIcon(new ImageIcon(new ImageIcon(ml.getPicture().get(i)).getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT)));
                content.add(picContent);
                //=================//
                JPanel contentText = new JPanel();
                contentText.setBackground(Color.white);
                contentText.setForeground(Color.BLACK);
                JLabel detail = new JLabel();
                detail.setText(ml.getDetail().get(i));
                contentText.add(detail);
                content.add(contentText);
                //=================//
                form.add(content);
                j.add(form);
                boxHead.add(j);
                (ProblemList.count)++;
            }
        }
    }
    //=========================================================================================//
    
    public ProblemList(){
        ImageIcon i= new ImageIcon("D:\\kaname-outdoor\\pic\\iconImage.png");
        setIconImage(i.getImage());
        setUndecorated(true);
        setLocationOnScreen();
        setLocation(programWidth,programHeight);
        ModelProblemList ml = new ModelProblemList(filterPrompt);
        setSize(600,700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel header = new JPanel(null);
        
        //-----------------filter----------------//
        JComboBox filter = new JComboBox();
        filter.addItem("choose filter");
        filter.addItem("new-old");
        filter.addItem("old-new");
        filter.setBounds(25,33,100,25);
        
        //=======================================//
        
        //================= header ================//
        header.add(filter);
        JLabel logo = new JLabel();
        logo.setIcon(new ImageIcon((new ImageIcon("D:/kaname-outdoor/pic/logo.png").getImage().getScaledInstance(300,100,Image.SCALE_DEFAULT))));
        logo.setBounds(160,8,300,100);
        JLabel close = new JLabel();
        close.setIcon(new ImageIcon(new ImageIcon("D:/kaname-outdoor/pic/close.png").getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT)));
        close.setBounds(568,2,30,30);
        JPanel boxHead = new JPanel();
        header.add(logo);
        header.add(close);
        header.setBackground(Color.yellow);
        header.setPreferredSize(new Dimension(200,100));
        add(header,BorderLayout.NORTH);
        boxHead.setBackground(Color.black);
        setListText(ml, boxHead);
        add(boxHead);
        boxHead.setPreferredSize(new Dimension(WIDTH,(count*265)+10));
        Dimension oldSize = boxHead.getPreferredSize();
        JScrollPane scroll = new JScrollPane(boxHead);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        getContentPane().add(scroll);
        
        //======================== choose from filter =============================//
        
        filter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(filter.getSelectedItem()!=null){
                    if(filter.getSelectedItem().toString().equals("old-new")){
                        boxHead.removeAll();
                        boxHead.setLocation(getLocation());
                        boxHead.setPreferredSize(new Dimension(0,0));
                        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                        getContentPane().add(scroll);
                        ModelProblemList mlOldToNew = new ModelProblemList("old-new");
                        setListText(mlOldToNew, boxHead);
                        boxHead.setPreferredSize(oldSize);
                        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                        getContentPane().add(scroll);
                    }
                    if(filter.getSelectedItem().toString().equals("new-old")){
                        boxHead.removeAll();
                        boxHead.setLocation(getLocation());
                        boxHead.setPreferredSize(new Dimension(0,0));
                        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                        getContentPane().add(scroll);
                        ModelProblemList mlOldToNew = new ModelProblemList("new-old");
                        setListText(mlOldToNew, boxHead);
                        boxHead.setPreferredSize(oldSize);
                        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                        getContentPane().add(scroll);
                    }
                }
            }
        });
        //========================================================//
        JLabel map = new JLabel();
        JLabel confirm = new JLabel();
        //=================== close this window =================//
        close.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent et){
                dispose();
            }
        });
        //========================================================//
        
        //======================== go back to map ================//
        map.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                ModelProblemList.setLocationId(0);
                ModelProblemList.setProblemId(0);
                new map().setVisible(true);
                dispose();
                count=0;
            }
        });
        //========================================================//
        
        //======================== footer ========================//
        JPanel footer = new JPanel();
        JLabel importPic = new JLabel();
        footer.setLayout(null);
        map.setIcon(new ImageIcon((new ImageIcon("D:\\kaname-outdoor\\pic\\mapPng.png").getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT))));
        map.setBounds(30,5,35,35);
        importPic.setBounds(278,5,35,35);
        footer.add(map);
        importPic.setIcon(new ImageIcon((new ImageIcon("D:\\kaname-outdoor\\pic\\importPic.png").getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT))));
        confirm.setIcon(new ImageIcon((new ImageIcon("D:\\kaname-outdoor\\pic\\gallery.png").getImage().getScaledInstance(35,35,Image.SCALE_DEFAULT))));
        footer.add(confirm);
        confirm.setVisible(false);
        confirm.setBounds(540,5,35,35);
        footer.add(importPic);
        footer.setBackground(Color.yellow);
        footer.setPreferredSize(new Dimension(WIDTH,50));
        add(footer,BorderLayout.SOUTH);
        //==================== go to import page ======================================//
        importPic.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                boxHead.removeAll();
                boxHead.setLocation(getLocation());
                boxHead.setPreferredSize(new Dimension(WIDTH,550));
                scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
                getContentPane().add(scroll);
                Report report = new Report();
                boxHead.add(report);
                count=0;
                map.setVisible(false);
                confirm.setVisible(true);
                importPic.setVisible(false);
                filter.setVisible(false);
                confirm.addMouseListener(new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        Report.setConfirm(true);
                        System.out.println(Report.getConfirm());
                        dispose();
                        new ProblemList().setVisible(true);
                    }
                });
            }
        });
    //==========================================================================//
    }
    public static void main(String[] args) {
//        ConnectDB.ConnectDaB();
        new ProblemList().setVisible(true);
    }
}
