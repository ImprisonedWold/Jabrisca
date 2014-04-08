package edu.uprm.ece.icom4015.jabrisca.client.views;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import edu.uprm.ece.icom4015.jabrisca.client.JabriscaController;

/**
 * 
 * @author EltonJohn
 */
public class GameBoard extends JabriscaJPanel implements
		AnimatedJabriscaJPanel {

	private MyAnimator myAnimator;

	/**
	 * Creates new form GameBoard
	 */
	public GameBoard() {
		super();
	}

	/**
	 * Creates new form GameBoard
	 */
	public GameBoard(JabriscaController listener) {
		super(listener);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	void initComponents() {
		myAnimator = new MyAnimator();
		jPanel1 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jProgressBar1 = new javax.swing.JProgressBar();
		jPanel2 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel4 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jButton1 = new javax.swing.JButton();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextArea4 = new javax.swing.JTextArea();
		jPanel6 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jMenuBar3 = new javax.swing.JMenuBar();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem1 = new javax.swing.JMenuItem();
		jTextArea1.setEditable(false);
		jTextArea1.setEnabled(false);
		jTextArea1.setText("Player1:0");
		jTextArea4.setEditable(false);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new java.awt.Dimension(876, 640));

		jPanel1.setPreferredSize(new java.awt.Dimension(876, 30));
		jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1,
				javax.swing.BoxLayout.LINE_AXIS));

		jLabel2.setText("Status");
		jLabel2.setName("statusBar_status"); // NOI18N
		jPanel1.add(jLabel2);

		jProgressBar1.setName("statusBar_progressBar"); // NOI18N
		jPanel1.add(jProgressBar1);

		getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

		jPanel2.setPreferredSize(new java.awt.Dimension(876, 610));
		jPanel2.setLayout(new java.awt.BorderLayout());

		jPanel5.setPreferredSize(new java.awt.Dimension(200, 100));
		jPanel5.setLayout(null);

		jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel3.setText("Chat");
		jPanel5.add(jLabel3);
		jLabel3.setBounds(70, 220, 48, 29);

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setName("boardScore_display"); // NOI18N
		jScrollPane1.setViewportView(jTextArea1);

		jPanel5.add(jScrollPane1);
		jScrollPane1.setBounds(0, 40, 200, 160);
		jPanel5.add(jSeparator1);
		jSeparator1.setBounds(0, 210, 200, 10);

		jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
		jLabel4.setText("Score");
		jPanel5.add(jLabel4);
		jLabel4.setBounds(70, 5, 59, 29);

		jPanel3.setLayout(new java.awt.BorderLayout());

		jPanel4.setLayout(new java.awt.BorderLayout());

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jTextArea2.setName("boardChat_message"); // NOI18N
		jScrollPane2.setViewportView(jTextArea2);

		jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

		jButton1.setText("Send");
		jButton1.setName("boardChat_sendButton"); // NOI18N
		jPanel4.add(jButton1, java.awt.BorderLayout.LINE_END);

		jPanel3.add(jPanel4, java.awt.BorderLayout.PAGE_END);

		jTextArea4.setColumns(20);
		jTextArea4.setRows(5);
		jTextArea4.setName("boardChat_display"); // NOI18N
		jScrollPane4.setViewportView(jTextArea4);

		jPanel3.add(jScrollPane4, java.awt.BorderLayout.CENTER);

		jPanel5.add(jPanel3);
		jPanel3.setBounds(0, 250, 200, 300);

		jPanel2.add(jPanel5, java.awt.BorderLayout.LINE_END);

		jPanel6.setBackground(new java.awt.Color(0, 153, 153));
		jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(
				javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0,
						102, 102), new java.awt.Color(102, 255, 102),
				new java.awt.Color(255, 204, 51), new java.awt.Color(204, 204,
						255)));
		jPanel6.setLayout(null);

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jLabel5.setName("boardGame_myCard2"); // NOI18N
		jPanel6.add(jLabel5);
		jLabel5.setBounds(70, 410, 130, 240);

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jLabel6.setName("boardGame_myCard3"); // NOI18N
		jPanel6.add(jLabel6);
		jLabel6.setBounds(170, 430, 130, 240);

		jLabel9.setBackground(new java.awt.Color(0, 0, 0));
		jLabel9.setForeground(new java.awt.Color(0, 153, 153));
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("40");
		jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
		jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Deck", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255,
						255, 255))); // NOI18N
		jLabel9.setName("boardGame_deck"); // NOI18N
		jPanel6.add(jLabel9);
		jLabel9.setBounds(10, 30, 150, 280);

		jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/bastion_2.png"))); // NOI18N
		jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Life", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255,
						255, 255))); // NOI18N
		jLabel11.setName("boardGame_life"); // NOI18N
		jPanel6.add(jLabel11);
		jLabel11.setBounds(160, 30, 160, 280);

		jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jPanel6.add(jLabel13);
		jLabel13.setBounds(20, 50, 130, 240);

		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jLabel10.setName("boardGame_myCard1"); // NOI18N
		jPanel6.add(jLabel10);
		jLabel10.setBounds(20, 440, 130, 240);

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Player04",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255,
						255, 255))); // NOI18N
		jLabel12.setName("boardGame_player4Card"); // NOI18N

		jPanel6.add(jLabel12);
		jLabel12.setBounds(490, 280, 150, 260);

		jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jLabel16.setBorder(javax.swing.BorderFactory.createTitledBorder(
				javax.swing.BorderFactory.createLineBorder(new java.awt.Color(
						0, 204, 51)), "Player01",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255,
						255, 255))); // NOI18N
		jLabel16.setName("boardGame_player1Card"); // NOI18N
		jPanel6.add(jLabel16);
		jLabel16.setBounds(330, 10, 150, 260);

		jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Player02",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255,
						255, 255))); // NOI18N
		jLabel17.setName("boardGame_player2Card"); // NOI18N
		jPanel6.add(jLabel17);
		jLabel17.setBounds(490, 10, 150, 260);

		jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/Deck/back.jpg"))); // NOI18N
		jLabel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
				"Player03",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255,
						255, 255))); // NOI18N
		jLabel18.setName("boardGame_player3Card"); // NOI18N
		jPanel6.add(jLabel18);
		jLabel18.setBounds(330, 280, 150, 260);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/Images/cezanne_joueurs-cartes_2.png"))); // NOI18N
		jPanel6.add(jLabel1);
		jLabel1.setBounds(-10, 0, 690, 630);

		jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

		getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

		jMenu4.setText("Options");

		jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_Q,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setText("Surrender");
		jMenuItem2.setName("options_surrender"); // NOI18N
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem2);

		jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_T,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem4.setText("Trade Card");
		jMenuItem4.setName("options_tradeCard"); // NOI18N
		jMenu4.add(jMenuItem4);

		jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_W,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem3.setText("Black Hand");
		jMenuItem3.setName("options_blackHand"); // NOI18N
		jMenu4.add(jMenuItem3);

		jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_H,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem1.setText("How to Play Brisca");
		jMenuItem1.setName("howToPlay"); // NOI18N
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem1);

		jMenuBar3.add(jMenu4);

		setJMenuBar(jMenuBar3);

		pack();
		setResizable(false);
	}// </editor-fold>//GEN-END:initComponents

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem1ActionPerformed

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jMenuItem2ActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Lobby.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Lobby.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Lobby.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Lobby.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		final AnimatedJabriscaJPanel board = new GameBoard();
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				((JabriscaJPanel)board).setVisible(true);
			}
		});
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//"MoveCardAnimation","boardGame_myCard1","boardGame_player1Card"
		board.animate("MoveCardAnimation","boardGame_myCard1","boardGame_player1Card");
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar3;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JProgressBar jProgressBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextArea jTextArea4;

	// End of variables declaration//GEN-END:variables

	/**
     * 
     */
	public boolean animate(String animation, String target, String destination) {
		return myAnimator.animate(animation, target, destination);
	}
	
	/**
	 * Asynchronous animation
	 * @param animation
	 * @param target
	 * @param destination
	 * @return
	 */
	public boolean animateAsync(String animation, String target, String destination) {
		return myAnimator.animateAsync(animation, target, destination);
	}
	
	
	public boolean hasAnimation(String animation) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasTarget(String target) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean targetHasAnimation(String target, String Animation) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasDestination(String target) {
		// TODO Auto-generated method stub
		return false;
	}

	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= Animator Class Definition: Animations
	// details -=-=-=-=-=-=-=-=-=-=-
	class MyAnimator {
		public boolean animate(String animation, String target,
				String destination) {
			AnimationType anim = generateAnimation(animation);
			return anim.setTarget(target) && anim.setDestination(destination)
					&& anim.animate();
		}

		public boolean animateAsync(String animation, String target,
				String destination) {
			AnimationType anim = generateAnimation(animation);
			if (anim.setTarget(target) && anim.setDestination(destination)) {
				anim.animateAsync();
				return true;
			}
			return false;
		}

		/**
		 * constructs an animation type
		 * 
		 * @param animation
		 *            you can pass parameters in the animationstring as follos
		 *            animationName:parameter1=value,...
		 * @return
		 */
		private AnimationType generateAnimation(String animation) {
			if (animation.contains("MoveCardAnimation")) {
				if (animation.contains(":")) {
					// has parameters pass them to the constructor
					return new MoveCardAnimation(animation.split(":")[1]);
				} else {
					return new MoveCardAnimation();
				}
			}
			return null;
		}
	}

	interface AnimationType {
		/**
		 * play animation
		 * 
		 * @return when finished playing animation
		 */
		boolean animate();

		/**
		 * play animation
		 * 
		 * @param callback
		 */
		void animateAsync();

		/**
		 * the name of the component to animate
		 * 
		 * @param target
		 * @return true if target could be set
		 */
		boolean setTarget(String target);

		/**
		 * a tring containing information of the destiantion
		 * 
		 * @param destination
		 * @return true if destination could be set
		 */
		boolean setDestination(String destination);
	}

	class MoveCardAnimation implements AnimationType {
		String[] posibleTargets = { "boardGame_myCard1", "boardGame_myCard2",
				"boardGame_myCard3" }; 

		DestinationObject[] posibleDestinationNames = {
				new DestinationObject("boardGame_player1Card", new Point(333,
						58)),
				new DestinationObject("boardGame_player2Card", new Point(493,
						58)),
				new DestinationObject("boardGame_player3Card", new Point(333,
						328)),
				new DestinationObject("boardGame_player4Card", new Point(493,
						328)) };
		String target;
		Point destination;
		int xStep = 5, yStep = 5, tStep = 750;
		Timer timmer;
		Component target_component;
		int destinationXOffset; // X Offset of pixels used to determine if card
								// is near the desired point
		int destinationYOffset; // Y Offset of pixels used to determine if card
								// is near the desired point
		boolean animating = false; // variable that checks if an animation is ocuring
		public MoveCardAnimation() {
		}

		public MoveCardAnimation(String parameters) {
			if (parameters.contains("destinationYOffset=")) {
				String temp = parameters.substring(
						parameters.indexOf("destinationYOffset=")).split(",")[0];
				destinationYOffset = Integer.parseInt(temp);
			}
			if (parameters.contains("destinationXOffset=")) {
				String temp = parameters.substring(
						parameters.indexOf("destinationXOffset=")).split(",")[0];
				destinationXOffset = Integer.parseInt(temp);
			}
			if (parameters.contains("xStep=")) {
				String temp = parameters
						.substring(parameters.indexOf("xStep=")).split(",")[0];
				xStep = Integer.parseInt(temp);
			}
			if (parameters.contains("yStep=")) {
				String temp = parameters
						.substring(parameters.indexOf("yStep=")).split(",")[0];
				yStep = Integer.parseInt(temp);
			}
			if (parameters.contains("tStep=")) {
				String temp = parameters
						.substring(parameters.indexOf("tStep=")).split(",")[0];
				tStep = Integer.parseInt(temp);
			}
		}

		public boolean animate() {
			animateAsync();
			while(animating);
			return true;
		}

		public void animateAsync() {
			animating = true;
			final int dirrectionX = (destination.x
					- target_component.getLocationOnScreen().x)
					/ Math.abs(destination.x
							- target_component.getLocationOnScreen().x), dirrectionY = (destination.y
					- target_component.getLocationOnScreen().y)
					/ Math.abs(destination.y
							- target_component.getLocationOnScreen().y);
			timmer = new Timer(tStep, new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					if (Math.abs(destination.x
							- target_component.getLocationOnScreen().x) > destinationXOffset
							&& Math.abs(destination.y
									- target_component.getLocationOnScreen().y) > destinationYOffset) {
						// TODO move card
						target_component.move(dirrectionX * xStep, dirrectionY
								* yStep);
						getContentPane().repaint();
					} else {
						timmer.stop();
						animating = false;
					}
				}
			});
			timmer.start();
		}

		public boolean setTarget(String target) {
			for (String component : posibleTargets) {
				if (component.equals(target)) {
					this.target = target;
					target_component = fetchComponent(null, target);
					if (target_component == null)
						throw new IllegalAccessError("Can't Find component "
								+ target + ".");
					return true;
				}
			}
			return false;
		}

		/**
		 * Accepted destination formats componentName or
		 * coordinates:x=##,y=##
		 */
		public boolean setDestination(String destination) {
			if (destination.contains("coordinates:")) {
				destination = destination.replace("coordinates:", "");
				int x = Integer.parseInt(destination.split(",")[0].replace(
						"x=", ""));
				int y = Integer.parseInt(destination.split(",")[1].replace(
						"y=", ""));
				this.destination = new Point(x, y);
			} else{
				// see if destination is saved
				for (DestinationObject component : posibleDestinationNames) {
					if (component.name.equals(destination)) {
						this.destination = component.pointMarker;
						return true;
					}
				}
			}
			return false;
		}

	}

	class DestinationObject {
		public String name;
		public Point pointMarker;

		public DestinationObject(String name, Point pointMarker) {
			super();
			this.name = name;
			this.pointMarker = pointMarker;
		}

	}
}
