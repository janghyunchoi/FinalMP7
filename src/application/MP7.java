package application;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MP7 {

	private JFrame frame;
	private static JTextField txtLevel;
	private static JTextField txtTime;
	private static JTextField txtYouLose;
	private static JTextField txtYouWin;
	static boolean canGameRun = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MP7 window = new MP7();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		runGame();
	}

	/**
	 * Create the application.
	 */
	public MP7() {
		initialize();
	}
	
	static int clicked = 100;
	static JButton[] butarr = new JButton[26];
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 848, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_1 = new JButton("1");
		button_1.setBackground(new Color(240, 240, 240));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 0;
			}
		});
		button_1.setBounds(40, 48, 127, 100);
		frame.getContentPane().add(button_1);
		butarr[0] = button_1;
		
		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 1;
			}
		});
		button_2.setBounds(164, 48, 127, 100);
		frame.getContentPane().add(button_2);
		butarr[1] = button_2;
		
		
		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 2;
			}
		});
		button_3.setBounds(288, 48, 127, 100);
		frame.getContentPane().add(button_3);
		butarr[2] = button_3;
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 3;
			}
		});
		button_4.setBounds(412, 48, 127, 100);
		frame.getContentPane().add(button_4);
		butarr[3] = button_4;
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 4;
			}
		});
		button_5.setBounds(536, 48, 127, 100);
		frame.getContentPane().add(button_5);
		butarr[4] = button_5;
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 5;
			}
		});
		button_6.setBounds(40, 144, 127, 100);
		frame.getContentPane().add(button_6);
		butarr[5] = button_6;

		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 6;
			}
		});
		button_7.setBounds(164, 144, 127, 100);
		frame.getContentPane().add(button_7);
		butarr[6] = button_7;
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 7;
			}
		});
		button_8.setBounds(288, 144, 127, 100);
		frame.getContentPane().add(button_8);
		butarr[7] = button_8;
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 8;
			}
		});
		button_9.setBounds(412, 144, 127, 100);
		frame.getContentPane().add(button_9);
		butarr[8] = button_9;
		
		JButton button_10 = new JButton("10");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 9;
			}
		});
		button_10.setBounds(536, 144, 127, 100);
		frame.getContentPane().add(button_10);
		butarr[9] = button_10;
		
		JButton button_11 = new JButton("11");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 10;
			}
		});
		button_11.setBounds(40, 240, 127, 100);
		frame.getContentPane().add(button_11);
		butarr[10] = button_11;
		
		JButton button_12 = new JButton("12");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 11;
			}
		});
		button_12.setBounds(164, 240, 127, 100);
		frame.getContentPane().add(button_12);
		butarr[11] = button_12;
		
		JButton button_13 = new JButton("13");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 12;
			}
		});
		button_13.setBounds(288, 240, 127, 100);
		frame.getContentPane().add(button_13);
		butarr[12] = button_13;
		
		JButton button_14 = new JButton("14");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 13;
			}
		});
		button_14.setBounds(412, 240, 127, 100);
		frame.getContentPane().add(button_14);
		butarr[13] = button_14;
		
		JButton button_15 = new JButton("15");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 14;
			}
		});
		button_15.setBounds(536, 240, 127, 100);
		frame.getContentPane().add(button_15);
		butarr[14] = button_15;

		JButton button_16 = new JButton("16");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 15;
			}
		});
		button_16.setBounds(40, 336, 127, 100);
		frame.getContentPane().add(button_16);
		butarr[15] = button_16;

		JButton button_17 = new JButton("17");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 16;
			}
		});
		button_17.setBounds(164, 336, 127, 100);
		frame.getContentPane().add(button_17);
		butarr[16] = button_17;
		
		JButton button_18 = new JButton("18");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 17;
			}
		});
		button_18.setBounds(288, 336, 127, 100);
		frame.getContentPane().add(button_18);
		butarr[17] = button_18;
		
		JButton button_19 = new JButton("19");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 18;
			}
		});
		button_19.setBounds(412, 336, 127, 100);
		frame.getContentPane().add(button_19);
		butarr[18] = button_19;
		
		
		JButton button_20 = new JButton("20");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 19;
			}
		});
		button_20.setBounds(536, 336, 127, 100);
		frame.getContentPane().add(button_20);
		butarr[19] = button_20;
		
		JButton button_21 = new JButton("21");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 20;
			}
		});
		button_21.setBounds(40, 432, 127, 100);
		frame.getContentPane().add(button_21);
		butarr[20] = button_21;
		
		JButton button_22 = new JButton("22");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 21;
			}
		});
		button_22.setBounds(164, 432, 127, 100);
		frame.getContentPane().add(button_22);
		butarr[21] = button_22;
		
		JButton button_23 = new JButton("23");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 22;
			}
		});
		button_23.setBounds(288, 432, 127, 100);
		frame.getContentPane().add(button_23);
		butarr[22] = button_23;
		
		JButton button_24 = new JButton("24");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 23;
			}
		});
		button_24.setBounds(412, 432, 127, 100);
		frame.getContentPane().add(button_24);
		butarr[23] = button_24;
		
		JButton button_25 = new JButton("25");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicked = 24;
			}
		});
		button_25.setBounds(536, 432, 127, 100);
		frame.getContentPane().add(button_25);
		butarr[24] = button_25;

		JButton pickedImage = new JButton("pickedImage");
		pickedImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pickedImage.setBounds(684, 240, 127, 100);
		frame.getContentPane().add(pickedImage);
		butarr[25] = pickedImage;
		
		txtLevel = new JTextField();
		txtLevel.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLevel.setHorizontalAlignment(SwingConstants.CENTER);
		txtLevel.setBounds(103, 6, 675, 35);
		frame.getContentPane().add(txtLevel);
		txtLevel.setColumns(10);

		
		txtTime = new JTextField();
		txtTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtTime.setHorizontalAlignment(SwingConstants.CENTER);
		txtTime.setBounds(684, 118, 127, 86);
		frame.getContentPane().add(txtTime);
		txtTime.setColumns(10);
		
		txtYouLose = new JTextField();
		txtYouLose.setEnabled(false);
		txtYouLose.setBackground(Color.WHITE);
		txtYouLose.setForeground(Color.BLACK);
		txtYouLose.setEditable(false);
		txtYouLose.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtYouLose.setHorizontalAlignment(SwingConstants.CENTER);
		txtYouLose.setText("GAME OVER");
		txtYouLose.setBounds(684, 373, 138, 63);
		frame.getContentPane().add(txtYouLose);
		txtYouLose.setColumns(10);
		
		txtYouWin = new JTextField();
		txtYouWin.setBackground(Color.WHITE);
		txtYouWin.setForeground(Color.BLACK);
		txtYouWin.setEditable(false);
		txtYouWin.setEnabled(false);
		txtYouWin.setText(" You WIN!!!");
		txtYouWin.setHorizontalAlignment(SwingConstants.CENTER);
		txtYouWin.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtYouWin.setColumns(10);
		txtYouWin.setBounds(684, 448, 138, 63);
		frame.getContentPane().add(txtYouWin);
		
		JButton btnNewButton = new JButton("Restart");
		btnNewButton.setBounds(277, 539, 311, 35);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canGameRun = true;
			}
		});
		frame.getContentPane().add(btnNewButton);
	}
	
	private static void runGame() {
		while (true) {
			while (!canGameRun) {
				System.out.println(" ");
			}
			while (canGameRun) {
				txtYouWin.setBackground(Color.WHITE);
				txtYouLose.setBackground(Color.WHITE);
				for(int q = 0; q < 10; q++) {
					txtLevel.setText("Level:  " + (q + 1));
					txtTime.setText("Time\rLeft: \n" + (10 - q) + " sec");
					int[] images = new int[25];
			        int picked = (int)(Math.random() * 25);
			        int count = 0;
		
			        while (count < images.length) {
			            int number = (int)(1 + Math.random() * 25);
			            
			            // found same number, repeat the loop again
				        boolean exists = false;
				        for (int i = 0; i < count; i++) {
				            if (images[i] == number) {
				                exists = true;
				                break;
				            }
				        }
			
				        // We didn't find it, so we're good to add it to the array
				        if (!exists) {
				            images[count++] = number;
				        }
			        }
			        String imagePath = "src/images/";
			        butarr[0].setIcon(new ImageIcon(imagePath + images[0] + ".png"));
			        butarr[1].setIcon(new ImageIcon(imagePath + images[1] + ".png"));
			        butarr[2].setIcon(new ImageIcon(imagePath + images[2] + ".png"));
			        butarr[3].setIcon(new ImageIcon(imagePath + images[3] + ".png"));
			        butarr[4].setIcon(new ImageIcon(imagePath + images[4] + ".png"));
			        butarr[5].setIcon(new ImageIcon(imagePath + images[5] + ".png"));
			        butarr[6].setIcon(new ImageIcon(imagePath + images[6] + ".png"));
			        butarr[7].setIcon(new ImageIcon(imagePath + images[7] + ".png"));
			        butarr[8].setIcon(new ImageIcon(imagePath + images[8] + ".png"));
			        butarr[9].setIcon(new ImageIcon(imagePath + images[9] + ".png"));
			        butarr[10].setIcon(new ImageIcon(imagePath + images[10] + ".png"));
			        butarr[11].setIcon(new ImageIcon(imagePath + images[11] + ".png"));
			        butarr[12].setIcon(new ImageIcon(imagePath + images[12] + ".png"));
			        butarr[13].setIcon(new ImageIcon(imagePath + images[13] + ".png"));
			        butarr[14].setIcon(new ImageIcon(imagePath + images[14] + ".png"));
			        butarr[15].setIcon(new ImageIcon(imagePath + images[15] + ".png"));
			        butarr[16].setIcon(new ImageIcon(imagePath + images[16] + ".png"));
			        butarr[17].setIcon(new ImageIcon(imagePath + images[17] + ".png"));
			        butarr[18].setIcon(new ImageIcon(imagePath + images[18] + ".png"));
			        butarr[19].setIcon(new ImageIcon(imagePath + images[19] + ".png"));
			        butarr[20].setIcon(new ImageIcon(imagePath + images[20] + ".png"));
			        butarr[21].setIcon(new ImageIcon(imagePath + images[21] + ".png"));
			        butarr[22].setIcon(new ImageIcon(imagePath + images[22] + ".png"));
			        butarr[23].setIcon(new ImageIcon(imagePath + images[23] + ".png"));
			        butarr[24].setIcon(new ImageIcon(imagePath + images[24] + ".png"));
			        butarr[25].setIcon(new ImageIcon(imagePath + images[picked] + ".png"));
					
					int k;
					for(k = (10 - q); k > 0 && clicked == 100; k--) {
						txtTime.setText("Time\rLeft: \n" + k + " sec");
						long prevtime = System.currentTimeMillis();
				        long curtime = prevtime;
				        while(curtime < prevtime + 1000) {
				        		curtime = System.currentTimeMillis();
				        }
					}
					if(picked == clicked) {
						if(q == 9) {
							txtYouWin.setBackground(Color.GREEN);
							canGameRun = false;
						}
						clicked = 100;
						continue;
					} else if(picked != clicked || k == 0) {
						txtYouLose.setBackground(Color.RED);
						canGameRun = false;
						clicked = 100;
						break;
					}
				}
			}
		}
	}
}