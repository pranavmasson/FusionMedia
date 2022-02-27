import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UIManager.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public class FinanceApp implements MouseListener, ActionListener {

	public JPanel loginPanel;
	public JFrame loginFrame;	
	public JLabel loginTitle;
	public JTextField usernameLogin;
	public JPasswordField passwordLogin;
	public JLabel usernameLabel;
	public JLabel passwordLabel;
	public JLabel welcomeLabel;
	public JButton logInButton;
	public JButton createButton;

	public JPanel createPanel;
	public JFrame createFrame;	
	public JLabel createLabel;
	public JLabel createUsername;
	public JLabel createPassword;
	public JTextField createUsernameField;
	public JPasswordField createPasswordField;
	public JButton createAccount;
	public JButton createBack;
	public JLabel createMessage;

	public JPanel welcomePanel;
	public JFrame welcomeFrame;
	public JLabel welcomeScreenLabel;
	public JButton welcomeChecking;
	public JButton welcomeSavings;
	public JButton welcomeCredit;
	public JLabel welcomeTutorialLabel;
	public JButton welcomeToAccount;

	public JPanel homePanel;
	public JFrame homeFrame;
	public JLabel homeTitle;
	public boolean isSavingsValid = false;
	public boolean isCheckingValid = false;
	public boolean isCreditValid = false;
	public JButton homeBack;
	public JButton checkingHome;
	public JButton savingsHome;
	public JButton creditHome;
	public JButton accountInfoHome;
	public JButton homeHome;
	public JLabel homeMessage;
	public JButton homeCheckingOverview;
	public JButton homeSavingsOverview;
	public JButton homeCreditOverview;
	public JButton deposit;
	public JButton transfer;

	public JButton savingsHeader;
	public JButton checkingHeader;
	public JButton creditHeader;

	public JLabel[] savingsTransactions;
	public JLabel[] checkingTransactions;
	public JLabel[] creditTransactions;	
	public JLabel savingsPanelHeader;
	public JLabel checkingPanelHeader;
	public JLabel creditPanelHeader;

	public JPanel checkingPanel;
	public JFrame checkingFrame;
	public JButton cpc;
	public JButton cps;
	public JButton cpcr;
	public JButton cph;
	public JLabel checkingLabel;
	public JButton savingsOnChecking;
	public JScrollPane checkingScroll;
	public JLabel ctl;

	public JPanel savingsPanel;
	public JFrame savingsFrame;
	public JButton spc;
	public JButton sps;
	public JButton spcr;
	public JButton sph;
	public JLabel savingsLabel;
	public JButton savingsOnSavings;
	public JScrollPane savingsScroll;
	public JLabel stl;

	public JPanel creditPanel;
	public JFrame creditFrame;
	public JButton crpc;
	public JButton crps;
	public JButton crpcr;
	public JButton crph;	
	public JLabel creditLabel;
	public JScrollPane creditScroll;
	public JLabel crtl;

	public JFrame depositFrame;
	public JPanel depositPanel;

	public JFrame depositFrame2;
	public static JPanel depositPanel2;
	public JButton depositSubmit;
	public JLabel depositLabel;
	public JComboBox<String> depositSelector;
	public String[] depositChoices;
	public JLabel depositToMessage;
	public JLabel depositAmountMessage;
	public static JSpinner depositAmount;
	public JButton depositBack;

	public JFrame transferFrame;
	public JPanel transferPanel;

	public JFrame transferFrame2;
	public static JPanel transferPanel2;
	public JButton transferSubmit;
	public JLabel transferLabel;
	public JComboBox<String> transferSelector;
	public JComboBox<String> transferSelector2;
	public String[] transferChoices;
	public JLabel transferFromMessage;
	public JLabel transferToMessage;
	public static JSpinner transferAmount;
	public JLabel transferAmountMessage;
	public JButton transferBack;

	public String depositTo;
	public String transferFrom;
	public String transferTo;


	public int userIndex = 0;

	public DecimalFormat df = new DecimalFormat("#####.##");

	public static SpinnerNumberModel model;


	public static ArrayList<String> accountUsername = new ArrayList<String>();
	public static ArrayList<String> accountPassword = new ArrayList<String>();
	public static ArrayList<Integer> accountStatus = new ArrayList<Integer>();

	public static ArrayList<Double> checkingBalance = new ArrayList<Double>();
	public static ArrayList<Double> savingsBalance = new ArrayList<Double>();
	public static ArrayList<Double> creditBalance = new ArrayList<Double>();

	public static ArrayList<Double> checkingAmounts = new ArrayList<Double>();
	public static ArrayList<String> checkingNames = new ArrayList<String>();

	public static ArrayList<Double> savingsAmounts = new ArrayList<Double>();
	public static ArrayList<String> savingsNames = new ArrayList<String>();

	public static ArrayList<Double> creditAmounts = new ArrayList<Double>();
	public static ArrayList<String> creditNames = new ArrayList<String>();

	public static ArrayList<JLabel> checkingStuff = new ArrayList<JLabel>();
	public static ArrayList<JLabel> savingsStuff = new ArrayList<JLabel>();
	public static ArrayList<JLabel> creditStuff = new ArrayList<JLabel>();
	int incrementer = 150;





	public static TableModel userCheckingTransactionsAmount = new DefaultTableModel();
	//public static TableModel userCheckingTransactions = new DefaultTableModel();

	public static TableModel userSavingsTransactionsAmount = new DefaultTableModel();
	//public static DefaultListModel<String> userSavingsTransactions = new DefaultListModel<String>();

	public static TableModel userCreditTransactionsAmount = new DefaultTableModel();
	//public static DefaultListModel<String> userCreditTransactions = new DefaultListModel<String>();

	public JTable checkingTransactionList;
	public JTable savingsTransactionList;
	public JTable creditTransactionList;

	public JList checkingTransactionListName;
	public JList savingsTransactionListName;
	public JList creditTransactionListName;




	public static void main(String args[]) {

		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception e) {
			// from JDK documentation
		}
		new FinanceApp();

		transferAmount = new JSpinner(model);
		transferAmount.setBounds(8, 515, 150, 30);
		transferPanel2.add(transferAmount);

		depositAmount = new JSpinner(model);
		depositAmount.setBounds(8, 355, 150, 30);
		depositPanel2.add(depositAmount);
	}

	public FinanceApp() {

		checkingTransactionList = new JTable(userCheckingTransactionsAmount);
		savingsTransactionList = new JTable(userSavingsTransactionsAmount);
		creditTransactionList = new JTable(userCreditTransactionsAmount);

		//		checkingTransactionListName = new JList<>(userCheckingTransactions);
		//		savingsTransactionListName = new JList<>(userSavingsTransactions);
		//		creditTransactionListName = new JList<>(userCreditTransactions);


		model = new SpinnerNumberModel(0.0,-1000.0 ,1000.0,0.1);

		//login screen
		loginPanel = new JPanel();
		loginPanel.setBackground(new Color(190, 231, 232));
		loginFrame = new JFrame();
		loginFrame.setSize(500, 800);
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.add(loginPanel);
		loginPanel.setLayout(null);		

		loginTitle = new JLabel("ACL Bank");
		loginTitle.setForeground(Color.BLACK);
		loginTitle.setFont(new Font("Helvetica", Font.BOLD, 50));
		loginTitle.setSize(500, 100);
		loginTitle.setLocation(8, 8);
		loginPanel.add(loginTitle);

		usernameLogin = new JTextField("");
		usernameLogin.setSize(150, 30);
		usernameLogin.setLocation(100, 200);
		loginPanel.add(usernameLogin);

		passwordLogin = new JPasswordField("");
		passwordLogin.setSize(150, 30);
		passwordLogin.setLocation(100, 300);
		loginPanel.add(passwordLogin);

		usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(Color.BLACK);
		usernameLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
		usernameLabel.setSize(100, 30);
		usernameLabel.setLocation(8, 200);
		loginPanel.add(usernameLabel);


		passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(Color.BLACK);
		passwordLabel.setFont(new Font("Helvetica", Font.BOLD, 15));
		passwordLabel.setSize(100, 30);
		passwordLabel.setLocation(8, 300);
		loginPanel.add(passwordLabel);

		welcomeLabel = new JLabel("Welcome, Please log in!");
		welcomeLabel.setForeground(Color.BLACK);
		welcomeLabel.setFont(new Font("Helvetica", Font.BOLD, 30));
		welcomeLabel.setSize(500, 50);
		welcomeLabel.setLocation(8, 400);
		loginPanel.add(welcomeLabel);

		logInButton = new JButton("Log In");
		logInButton.setFont(new Font("Arial", Font.PLAIN, 20));
		logInButton.setSize(150, 50);
		logInButton.setLocation(300, 200);
		logInButton.addMouseListener(this);
		logInButton.setBorderPainted(false);
		loginPanel.add(logInButton);

		createButton = new JButton("Create Acc");
		createButton.setFont(new Font("Arial", Font.PLAIN, 20));
		createButton.setSize(150, 50);
		createButton.setLocation(300, 280);
		createButton.addMouseListener(this);
		createButton.setBorderPainted(false);
		loginPanel.add(createButton);

		//home screen
		homePanel = new JPanel();
		homePanel.setBackground(new Color(190, 232, 201));
		homeFrame = new JFrame();
		homeFrame.setSize(500, 800);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.add(homePanel);
		homePanel.setLayout(null);

		homeTitle = new JLabel("Home");
		homeTitle.setForeground(Color.BLACK);
		homeTitle.setFont(new Font("Helvetica", Font.BOLD, 25));
		homeTitle.setSize(200, 100);
		homeTitle.setLocation(8, 8);
		homePanel.add(homeTitle);



		homePanel = new JPanel();
		homePanel.setBackground(new Color(190, 232, 201));
		homeFrame = new JFrame();
		homeFrame.setSize(500, 800);
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.add(homePanel);
		homePanel.setLayout(null);

		homeBack = new JButton("Log Out");
		homeBack.setFont(new Font("Arial", Font.PLAIN, 20));
		homeBack.setSize(150, 50);
		homeBack.setLocation(322, 25);
		homeBack.addMouseListener(this);
		homeBack.setBorderPainted(false);
		homePanel.add(homeBack);

		homeMessage = new JLabel("Home");
		homeMessage.setForeground(Color.BLACK);
		homeMessage.setFont(new Font("Helvetica", Font.BOLD, 50));
		homeMessage.setSize(500, 100);
		homeMessage.setLocation(8, 8);
		homePanel.add(homeMessage);

		checkingHome = new JButton("Checking");
		checkingHome.setFont(new Font("Helvetica", Font.PLAIN, 15));
		checkingHome.setSize(90, 75);
		checkingHome.setLocation(28, 675);
		checkingHome.addMouseListener(this);
		checkingHome.setBorderPainted(false);
		homePanel.add(checkingHome);

		savingsHome = new JButton("Savings");
		savingsHome.setFont(new Font("Helvetica", Font.PLAIN, 15));
		savingsHome.setSize(90, 75);
		savingsHome.setLocation(146, 675);
		savingsHome.addMouseListener(this);
		savingsHome.setBorderPainted(false);
		homePanel.add(savingsHome);

		creditHome = new JButton("Credit");
		creditHome.setFont(new Font("Helvetica", Font.PLAIN, 15));
		creditHome.setSize(90, 75);
		creditHome.setLocation(264, 675);
		creditHome.addMouseListener(this);
		creditHome.setBorderPainted(false);
		homePanel.add(creditHome);

		homeHome = new JButton("⌂");
		homeHome.setFont(new Font("Helvetica", Font.PLAIN, 50));
		homeHome.setSize(90, 75);
		homeHome.setLocation(382, 675);
		homeHome.addMouseListener(this);
		homeHome.setBorderPainted(false);
		homePanel.add(homeHome);

		homeCheckingOverview = new JButton("");
		homeCheckingOverview.setFont(new Font("Arial", Font.PLAIN, 20));
		homeCheckingOverview.setSize(300, 60);
		homeCheckingOverview.setLocation(100, 200);
		homeCheckingOverview.addMouseListener(this);
		homeCheckingOverview.setBorderPainted(false);
		homePanel.add(homeCheckingOverview);

		homeSavingsOverview = new JButton("");
		homeSavingsOverview.setFont(new Font("Arial", Font.PLAIN, 20));
		homeSavingsOverview.setSize(300, 60);
		homeSavingsOverview.setLocation(100, 280);
		homeSavingsOverview.addMouseListener(this);
		homeSavingsOverview.setBorderPainted(false);
		homePanel.add(homeSavingsOverview);

		homeCreditOverview = new JButton("");
		homeCreditOverview.setFont(new Font("Arial", Font.PLAIN, 20));
		homeCreditOverview.setSize(300, 60);
		homeCreditOverview.setLocation(100, 360);
		homeCreditOverview.addMouseListener(this);
		homeCreditOverview.setBorderPainted(false);
		homePanel.add(homeCreditOverview);

		deposit = new JButton("Deposit");
		deposit.setFont(new Font("Helvetica", Font.PLAIN, 15));
		deposit.setSize(90, 75);
		deposit.setLocation(264, 572);
		deposit.addMouseListener(this);
		deposit.setBorderPainted(false);
		homePanel.add(deposit);

		transfer = new JButton("Transfer");
		transfer.setFont(new Font("Helvetica", Font.PLAIN, 15));
		transfer.setSize(90, 75);
		transfer.setLocation(146, 572);
		transfer.addMouseListener(this);
		transfer.setBorderPainted(false);
		homePanel.add(transfer);

		//create account screen
		createPanel = new JPanel();
		createPanel.setBackground(new Color(190, 231, 232));
		createFrame = new JFrame();
		createFrame.setSize(500, 800);
		createFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createFrame.add(createPanel);
		createPanel.setLayout(null);

		createLabel = new JLabel("Create Acc");
		createLabel.setForeground(Color.BLACK);
		createLabel.setFont(new Font("Helvetica", Font.BOLD, 50));
		createLabel.setSize(500, 100);
		createLabel.setLocation(8, 8);
		createPanel.add(createLabel);

		createUsername = new JLabel("Username");
		createUsername.setForeground(Color.BLACK);
		createUsername.setFont(new Font("Helvetica", Font.BOLD, 15));
		createUsername.setSize(100, 30);
		createUsername.setLocation(8, 200);
		createPanel.add(createUsername);

		createPassword = new JLabel("Password");
		createPassword.setForeground(Color.BLACK);
		createPassword.setFont(new Font("Helvetica", Font.BOLD, 15));
		createPassword.setSize(100, 30);
		createPassword.setLocation(8, 300);
		createPanel.add(createPassword);

		createUsernameField = new JTextField("");
		createUsernameField.setSize(150, 30);
		createUsernameField.setLocation(100, 200);
		createPanel.add(createUsernameField);

		createPasswordField = new JPasswordField("");
		createPasswordField.setSize(150, 30);
		createPasswordField.setLocation(100, 300);
		createPanel.add(createPasswordField);

		createAccount = new JButton("Create Account");
		createAccount.setFont(new Font("Arial", Font.PLAIN, 20));
		createAccount.setSize(150, 50);
		createAccount.setLocation(300, 200);
		createAccount.addMouseListener(this);
		createAccount.setBorderPainted(false);
		createPanel.add(createAccount);

		createBack = new JButton("Back");
		createBack.setFont(new Font("Arial", Font.PLAIN, 20));
		createBack.setSize(150, 50);
		createBack.setLocation(300, 280);
		createBack.addMouseListener(this);
		createBack.setBorderPainted(false);
		createPanel.add(createBack);

		createMessage = new JLabel("Please type desired credentials!");
		createMessage.setForeground(Color.BLACK);
		createMessage.setFont(new Font("Helvetica", Font.BOLD, 30));
		createMessage.setSize(500, 50);
		createMessage.setLocation(8, 400);
		createPanel.add(createMessage);

		//welcome screen
		welcomePanel = new JPanel();
		welcomePanel.setBackground(new Color(190, 231, 232));
		welcomeFrame = new JFrame();
		welcomeFrame.setSize(500, 800);
		welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomeFrame.add(welcomePanel);
		welcomePanel.setLayout(null);

		welcomeScreenLabel = new JLabel("Welcome to ACL Bank!");
		welcomeScreenLabel.setForeground(Color.BLACK);
		welcomeScreenLabel.setFont(new Font("Helvetica", Font.BOLD, 40));
		welcomeScreenLabel.setSize(500, 100);
		welcomeScreenLabel.setLocation(8, 8);
		welcomePanel.add(welcomeScreenLabel);

		welcomeChecking = new JButton("<html>ACL Checking <br /> Account Balance: $10,000<br /> Account Holder: Sai Rodda</html>");
		welcomeChecking.setFont(new Font("Arial", Font.PLAIN, 20));
		welcomeChecking.setSize(400, 100);
		welcomeChecking.setLocation(50, 200);
		welcomeChecking.addMouseListener(this);
		welcomeChecking.setBorderPainted(false);
		welcomePanel.add(welcomeChecking);
		//welcomeChecking = new JButton("<html>Checking Account Balance: $10,000<br /> Account Holder: Sai Rodda</html>");

		welcomeSavings = new JButton("<html>ACL Savings <br /> Account Balance: $250,000<br /> Account Holder: Sai Rodda</html>");
		welcomeSavings.setFont(new Font("Arial", Font.PLAIN, 20));
		welcomeSavings.setSize(400, 100);
		welcomeSavings.setLocation(50, 350);
		welcomeSavings.addMouseListener(this);
		welcomeSavings.setBorderPainted(false);
		welcomePanel.add(welcomeSavings);

		welcomeCredit = new JButton("<html>ACL Credit <br /> Account Due: $950<br /> Account Holder: Sai Rodda</html>");
		welcomeCredit.setFont(new Font("Arial", Font.PLAIN, 20));
		welcomeCredit.setSize(400, 100);
		welcomeCredit.setLocation(50, 500);
		welcomeCredit.addMouseListener(this);
		welcomeCredit.setBorderPainted(false);
		welcomePanel.add(welcomeCredit);

		welcomeTutorialLabel = new JLabel("<html>Welcome to ACL Bank! <br /> This is where you can<br /> view your account details.</html>");
		welcomeTutorialLabel.setForeground(Color.BLACK);
		welcomeTutorialLabel.setFont(new Font("Helvetica", Font.BOLD, 25));
		welcomeTutorialLabel.setSize(400, 100);
		welcomeTutorialLabel.setLocation(50, 90);
		welcomePanel.add(welcomeTutorialLabel);

		welcomeToAccount = new JButton("Go To My Account");
		welcomeToAccount.setFont(new Font("Arial", Font.PLAIN, 20));
		welcomeToAccount.setSize(200, 100);
		welcomeToAccount.setLocation(150, 650);
		welcomeToAccount.addMouseListener(this);
		welcomeToAccount.setBorderPainted(false);
		welcomePanel.add(welcomeToAccount);


		// deposit

		transferChoices = new String[4];
		transferChoices[0] = "Select Account"; transferChoices[1] = "Checking"; transferChoices[2] = "Savings"; transferChoices[3] = "Credit";

		depositPanel = new JPanel();
		depositPanel.setBackground(new Color(190, 231, 232));
		depositFrame = new JFrame();
		depositFrame.setSize(500, 800);
		depositFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		depositFrame.add(depositPanel);
		depositFrame.setLayout(null);

		depositPanel2 = new JPanel();
		depositPanel2.setBackground(new Color(190, 231, 232));
		depositFrame2 = new JFrame();
		depositFrame2.setSize(500, 800);
		depositFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		depositFrame2.add(depositPanel2);
		depositPanel2.setLayout(null);

		depositLabel = new JLabel("Deposit");
		depositLabel.setForeground(Color.BLACK);
		depositLabel.setFont(new Font("Helvetica", Font.BOLD, 50));
		depositLabel.setSize(500, 100);
		depositLabel.setLocation(8, 8);
		depositPanel2.add(depositLabel);

		depositToMessage = new JLabel("Select Account to Deposit To");
		depositToMessage.setForeground(Color.BLACK);
		depositToMessage.setFont(new Font("Helvetica", Font.BOLD, 25));
		depositToMessage.setSize(500, 100);
		depositToMessage.setLocation(8, 110);
		depositPanel2.add(depositToMessage);

		depositSelector = new JComboBox<String>(transferChoices);
		depositSelector.setLocation(8, 190);
		depositSelector.setSize(150, 50);
		depositSelector.addActionListener(this);
		depositPanel2.add(depositSelector);

		depositAmountMessage = new JLabel("Enter Amount");
		depositAmountMessage.setForeground(Color.BLACK);
		depositAmountMessage.setFont(new Font("Helvetica", Font.BOLD, 25));
		depositAmountMessage.setSize(500, 100);
		depositAmountMessage.setLocation(8, 275);
		depositPanel2.add(depositAmountMessage);

		depositSubmit = new JButton("Enter");
		depositSubmit.setFont(new Font("Helvetica", Font.PLAIN, 25));
		depositSubmit.setSize(150, 75);
		depositSubmit.setLocation(8, 435);
		depositSubmit.addMouseListener(this);
		depositSubmit.setBorderPainted(false);
		depositPanel2.add(depositSubmit);

		depositBack = new JButton("Back");
		depositBack.setFont(new Font("Arial", Font.PLAIN, 20));
		depositBack.setSize(150, 50);
		depositBack.setLocation(322, 25);
		depositBack.addMouseListener(this);
		depositBack.setBorderPainted(false);
		depositPanel2.add(depositBack);

		// transfer
		//new CardLayout()
		transferPanel2 = new JPanel();
		transferPanel2.setBackground(new Color(190, 231, 232));
		transferFrame2 = new JFrame();
		transferFrame2.setSize(500, 800);
		transferFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		transferFrame2.add(transferPanel2);
		transferPanel2.setLayout(null);

		transferLabel = new JLabel("Transfer");
		transferLabel.setForeground(Color.BLACK);
		transferLabel.setFont(new Font("Helvetica", Font.BOLD, 50));
		transferLabel.setSize(500, 100);
		transferLabel.setLocation(8, 8);
		transferPanel2.add(transferLabel);

		transferFromMessage = new JLabel("Select Account to Transfer From");
		transferFromMessage.setForeground(Color.BLACK);
		transferFromMessage.setFont(new Font("Helvetica", Font.BOLD, 25));
		transferFromMessage.setSize(500, 100);
		transferFromMessage.setLocation(8, 110);
		transferPanel2.add(transferFromMessage);

		transferToMessage = new JLabel("Select Account to Transfer To");
		transferToMessage.setForeground(Color.BLACK);
		transferToMessage.setFont(new Font("Helvetica", Font.BOLD, 25));
		transferToMessage.setSize(500, 100);
		transferToMessage.setLocation(8, 275);
		transferPanel2.add(transferToMessage);



		transferSelector = new JComboBox<String>(transferChoices);
		transferSelector.setLocation(8, 190);
		transferSelector.setSize(150, 50);
		transferSelector.addActionListener(this);
		transferPanel2.add(transferSelector);

		transferSelector2 = new JComboBox<String>(transferChoices);
		transferSelector2.setLocation(8, 355);
		transferSelector2.setSize(150, 50);
		transferSelector2.addActionListener(this);
		transferPanel2.add(transferSelector2);

		transferAmountMessage = new JLabel("Enter Amount");
		transferAmountMessage.setForeground(Color.BLACK);
		transferAmountMessage.setFont(new Font("Helvetica", Font.BOLD, 25));
		transferAmountMessage.setSize(500, 100);
		transferAmountMessage.setLocation(8, 435);
		transferPanel2.add(transferAmountMessage);

		transferSubmit = new JButton("Enter");
		transferSubmit.setFont(new Font("Helvetica", Font.PLAIN, 25));
		transferSubmit.setSize(150, 75);
		transferSubmit.setLocation(8, 595);
		transferSubmit.addMouseListener(this);
		transferSubmit.setBorderPainted(false);
		transferPanel2.add(transferSubmit);

		transferBack = new JButton("Back");
		transferBack.setFont(new Font("Arial", Font.PLAIN, 20));
		transferBack.setSize(150, 50);
		transferBack.setLocation(322, 25);
		transferBack.addMouseListener(this);
		transferBack.setBorderPainted(false);
		transferPanel2.add(transferBack);

		// checking
		checkingPanel = new JPanel();
		checkingPanel.setBackground(new Color(190, 231, 232));
		checkingFrame = new JFrame();
		checkingFrame.setSize(500, 800);
		checkingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		checkingFrame.add(checkingPanel);
		checkingPanel.setLayout(null);

		//		JLabel test = new JLabel();
		//		checkingStuff.add(test);

		for(JLabel j:checkingStuff) {
			int incrementer = 150;
			j.setForeground(Color.BLACK);
			j.setFont(new Font("Helvetica", Font.BOLD, 25));
			j.setSize(500, 100);
			j.setLocation(8, incrementer);
			//j.setText("text");
			incrementer = incrementer + 125;
			checkingPanel.add(j);
		}
		
		ctl = new JLabel("Transactions");
		ctl.setForeground(Color.BLACK);
		ctl.setFont(new Font("Helvetica", Font.BOLD, 30));
		ctl.setSize(500, 100);
		ctl.setLocation(8, 100);
		checkingPanel.add(ctl);

		checkingLabel = new JLabel("Checking");
		checkingLabel.setForeground(Color.BLACK);
		checkingLabel.setFont(new Font("Helvetica", Font.BOLD, 50));
		checkingLabel.setSize(500, 100);
		checkingLabel.setLocation(8, 8);
		checkingPanel.add(checkingLabel);

		cpc = new JButton("Checking");
		cpc.setFont(new Font("Helvetica", Font.PLAIN, 15));
		cpc.setSize(90, 75);
		cpc.setLocation(28, 675);
		cpc.addMouseListener(this);
		cpc.setBorderPainted(false);
		checkingPanel.add(cpc);

		//		cps = new JButton("Checking");
		//		cps.setFont(new Font("Helvetica", Font.PLAIN, 15));
		//		cps.setSize(90, 75);
		//		cps.setLocation(146, 675);
		//		cps.addMouseListener(this);
		//		cps.setBorderPainted(false);
		//		checkingPanel.add(cps);		

		savingsOnChecking = new JButton("Savings");
		savingsOnChecking.setFont(new Font("Helvetica", Font.PLAIN, 15));
		savingsOnChecking.setSize(90, 75);
		savingsOnChecking.setLocation(146, 675);
		savingsOnChecking.addMouseListener(this);
		savingsOnChecking.setBorderPainted(false);
		checkingPanel.add(savingsOnChecking);


		cpcr = new JButton("Credit");
		cpcr.setFont(new Font("Helvetica", Font.PLAIN, 15));
		cpcr.setSize(90, 75);
		cpcr.setLocation(264, 675);
		cpcr.addMouseListener(this);
		cpcr.setBorderPainted(false);
		checkingPanel.add(cpcr);

		cph = new JButton("⌂");
		cph.setFont(new Font("Helvetica", Font.PLAIN, 50));
		cph.setSize(90, 75);
		cph.setLocation(382, 675);
		cph.addMouseListener(this);
		cph.setBorderPainted(false);
		checkingPanel.add(cph);

		//		checkingScroll = new JScrollPane(checkingTransactionList);
		//		checkingScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//		checkingScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//		checkingScroll.setSize(258, 500);
		//		checkingScroll.setLocation(118, 120);
		//		//checkingScroll.setBackground(Color.BLUE);
		//		//checkingScroll.setForeground(Color.YELLOW);
		//		checkingPanel.add(checkingScroll);

		// savings
		savingsPanel = new JPanel();
		savingsPanel.setBackground(new Color(190, 231, 232));
		savingsFrame = new JFrame();
		savingsFrame.setSize(500, 800);
		savingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		savingsFrame.add(savingsPanel);
		savingsPanel.setLayout(null);

		savingsLabel = new JLabel("Savings");
		savingsLabel.setForeground(Color.BLACK);
		savingsLabel.setFont(new Font("Helvetica", Font.BOLD, 50));
		savingsLabel.setSize(500, 100);
		savingsLabel.setLocation(8, 8);
		savingsPanel.add(savingsLabel);
		
		stl = new JLabel("Transactions");
		stl.setForeground(Color.BLACK);
		stl.setFont(new Font("Helvetica", Font.BOLD, 30));
		stl.setSize(500, 100);
		stl.setLocation(8, 100);
		savingsPanel.add(stl);

		incrementer = 150;

		for(JLabel j:savingsStuff) {
			//incrementer = 150;
			j.setForeground(Color.BLACK);
			j.setFont(new Font("Helvetica", Font.BOLD, 25));
			j.setSize(500, 100);
			j.setLocation(8, incrementer);
			//j.setText("text");
			incrementer = incrementer + 35;
			savingsStuff.add(j);
		}

		spc = new JButton("Checking");
		spc.setFont(new Font("Helvetica", Font.PLAIN, 15));
		spc.setSize(90, 75);
		spc.setLocation(28, 675);
		spc.addMouseListener(this);
		spc.setBorderPainted(false);
		savingsPanel.add(spc);

		sps = new JButton("Savings");
		sps.setFont(new Font("Helvetica", Font.PLAIN, 15));
		sps.setSize(90, 75);
		sps.setLocation(146, 675);
		sps.addMouseListener(this);
		sps.setBorderPainted(false);
		savingsPanel.add(sps);

		spcr = new JButton("Credit");
		spcr.setFont(new Font("Helvetica", Font.PLAIN, 15));
		spcr.setSize(90, 75);
		spcr.setLocation(264, 675);
		spcr.addMouseListener(this);
		spcr.setBorderPainted(false);
		savingsPanel.add(spcr);

		sph = new JButton("⌂");
		sph.setFont(new Font("Helvetica", Font.PLAIN, 50));
		sph.setSize(90, 75);
		sph.setLocation(382, 675);
		sph.addMouseListener(this);
		sph.setBorderPainted(false);
		savingsPanel.add(sph);


		// credit
		creditPanel = new JPanel();
		creditPanel.setBackground(new Color(190, 231, 232));
		creditFrame = new JFrame();
		creditFrame.setSize(500, 800);
		creditFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		creditFrame.add(creditPanel);
		creditPanel.setLayout(null);

		creditLabel = new JLabel("Credit");
		creditLabel.setForeground(Color.BLACK);
		creditLabel.setFont(new Font("Helvetica", Font.BOLD, 50));
		creditLabel.setSize(500, 100);
		creditLabel.setLocation(8, 8);
		creditPanel.add(creditLabel);
		
		crtl = new JLabel("Transactions");
		crtl.setForeground(Color.BLACK);
		crtl.setFont(new Font("Helvetica", Font.BOLD, 30));
		crtl.setSize(500, 100);
		crtl.setLocation(8, 100);
		creditPanel.add(crtl);

		incrementer = 150;

		for(JLabel j:creditStuff) {
			//incrementer = 150;
			j.setForeground(Color.BLACK);
			j.setFont(new Font("Helvetica", Font.BOLD, 25));
			j.setSize(500, 100);
			j.setLocation(8, incrementer);
			//j.setText("text");
			incrementer = incrementer + 35;
			creditStuff.add(j);
		}

		incrementer = 150;

		crpc = new JButton("Checking");
		crpc.setFont(new Font("Helvetica", Font.PLAIN, 15));
		crpc.setSize(90, 75);
		crpc.setLocation(28, 675);
		crpc.addMouseListener(this);
		crpc.setBorderPainted(false);
		creditPanel.add(crpc);

		crps = new JButton("Savings");
		crps.setFont(new Font("Helvetica", Font.PLAIN, 15));
		crps.setSize(90, 75);
		crps.setLocation(146, 675);
		crps.addMouseListener(this);
		crps.setBorderPainted(false);
		creditPanel.add(crps);

		crpcr = new JButton("Credit");
		crpcr.setFont(new Font("Helvetica", Font.PLAIN, 15));
		crpcr.setSize(90, 75);
		crpcr.setLocation(264, 675);
		crpcr.addMouseListener(this);
		crpcr.setBorderPainted(false);
		creditPanel.add(crpcr);

		crph = new JButton("⌂");
		crph.setFont(new Font("Helvetica", Font.PLAIN, 50));
		crph.setSize(90, 75);
		crph.setLocation(382, 675);
		crph.addMouseListener(this);
		crph.setBorderPainted(false);
		creditPanel.add(crph);















		loginFrame.setVisible(true);
		homeFrame.setVisible(false);
		createFrame.setVisible(false);
		welcomeFrame.setVisible(false);
		creditFrame.setVisible(false);
		savingsFrame.setVisible(false);
		checkingFrame.setVisible(false);
		depositFrame2.setVisible(false);
		transferFrame2.setVisible(false);
		transferPanel2.revalidate();
		depositPanel2.revalidate();


	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	//@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	//@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == logInButton) {
			String myPass = String.valueOf(passwordLogin.getPassword());
			System.out.println(myPass + " " + usernameLogin.getText());
			for (int i = 0; i < accountUsername.size(); i++) {
				if (usernameLogin.getText().equals(accountUsername.get(i))) {
					if (accountPassword.get(i).equals(myPass)) {
						loginFrame.setVisible(false);
						homeFrame.setVisible(true);
						userIndex = i;
						homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
						homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
						homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
					}
				}
			}
			if (usernameLogin.getText().equals("ACL") && myPass.equals("Password")) {
				loginFrame.setVisible(false);
				homeFrame.setVisible(true);
			}
			else {
				welcomeLabel.setText("Incorrect credentials!");
				welcomeLabel.setForeground(Color.RED);
			}
		}

		if (e.getSource() == createButton) {
			welcomeLabel.setForeground(Color.BLACK);
			welcomeLabel.setText("Welcome, Please log in!");
			usernameLogin.setText("");
			passwordLogin.setText("");
			createUsernameField.setText("");
			createPasswordField.setText("");
			createFrame.setVisible(true);
			loginFrame.setVisible(false);
		}

		if (e.getSource() == createAccount) {
			String newPass = String.valueOf(createPasswordField.getPassword());
			int usernameValidity = 0;
			for (int i = 0; i < accountUsername.size(); i++) {
				if (createUsernameField.getText().equals(accountUsername.get(i))) {
					createMessage.setForeground(Color.RED);
					createMessage.setText("Username Unavailable!");
					usernameValidity++;
					System.out.println(usernameValidity);
				}
			}
			if (createUsernameField.getText().equals("") && newPass.equals("")) {
				createMessage.setForeground(Color.RED);
				createMessage.setText("Invalid Username & Password!");
			}
			else if (createUsernameField.getText().equals("") && !newPass.equals("")) {
				createMessage.setForeground(Color.RED);
				createMessage.setText("Invalid Username!");
			}
			else if (!createUsernameField.getText().equals("") && newPass.equals("")) {
				createMessage.setForeground(Color.RED);
				createMessage.setText("Invalid Password!");
			}
			else if (usernameValidity == 0) {			
				accountUsername.add(createUsernameField.getText());
				accountPassword.add(newPass);
				accountStatus.add(0);
				checkingBalance.add(0.00);
				savingsBalance.add(0.00);
				creditBalance.add(0.00);
				welcomeLabel.setForeground(Color.BLACK);
				welcomeLabel.setText("Welcome, Please log in!");
				usernameLogin.setText("");
				passwordLogin.setText("");
				userIndex = accountUsername.size() - 1;
				homeCheckingOverview.setText("Checking Balance: $" + df.format(checkingBalance.get(userIndex)));
				homeSavingsOverview.setText("Savings Balance: $" + df.format(savingsBalance.get(userIndex)));
				homeCreditOverview.setText("Credit Due: $" + df.format(creditBalance.get(userIndex)));
				createUsernameField.setText("");
				createPasswordField.setText("");
				//userIndex = accountUsername.size() - 1;
				createFrame.setVisible(false);
				welcomeFrame.setVisible(true);
				createMessage.setForeground(Color.BLACK);
				createMessage.setText("Please type desired credentials!");
			}
		}

		if (e.getSource() == homeBack) {
			welcomeLabel.setForeground(Color.BLACK);
			welcomeLabel.setText("Welcome, Please log in!");
			usernameLogin.setText("");
			passwordLogin.setText("");
			createUsernameField.setText("");
			createPasswordField.setText("");
			homeFrame.setVisible(false);
			loginFrame.setVisible(true);
			for(JLabel j:checkingStuff) {
				//incrementer = 150;
				j.setForeground(Color.BLACK);
				j.setText("");
				j.setFont(new Font("Helvetica", Font.BOLD, 25));
				j.setSize(500, 100);
				//j.setLocation(8, incrementer);
				//j.setText("text");
				//incrementer = incrementer + 35;
				checkingPanel.add(j);
			}
			for(JLabel j:savingsStuff) {
				//incrementer = 150;
				j.setForeground(Color.BLACK);
				j.setText("");
				j.setFont(new Font("Helvetica", Font.BOLD, 25));
				j.setSize(500, 100);
				//j.setLocation(8, incrementer);
				//j.setText("text");
				//incrementer = incrementer + 35;
				savingsPanel.add(j);
			}
			for(JLabel j:creditStuff) {
				//incrementer = 150;
				j.setForeground(Color.BLACK);
				j.setText("");
				j.setFont(new Font("Helvetica", Font.BOLD, 25));
				j.setSize(500, 100);
				//j.setLocation(8, incrementer);
				//j.setText("text");
				//incrementer = incrementer + 35;
				creditPanel.add(j);
			}
			homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
			homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
			homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
		}
		if (e.getSource() == createBack) {
			welcomeLabel.setForeground(Color.BLACK);
			welcomeLabel.setText("Welcome, Please log in!");
			usernameLogin.setText("");
			passwordLogin.setText("");
			createUsernameField.setText("");
			createPasswordField.setText("");
			createFrame.setVisible(false);
			loginFrame.setVisible(true);
		}

		if (e.getSource() == welcomeToAccount) {
			welcomeFrame.setVisible(false);
			homeFrame.setVisible(true);
		}

		//home buttons

		if (e.getSource() == checkingHome) {
			homeFrame.setVisible(false);
			checkingFrame.setVisible(true);
		}

		if (e.getSource() == savingsHome) {
			homeFrame.setVisible(false);
			savingsFrame.setVisible(true);
		}

		if (e.getSource() == creditHome) {
			homeFrame.setVisible(false);
			creditFrame.setVisible(true);
		}

		// checking buttons

		if (e.getSource() == savingsOnChecking) {
			checkingFrame.setVisible(false);
			savingsFrame.setVisible(true);
		}

		if (e.getSource() == cpcr) {
			checkingFrame.setVisible(false);
			creditFrame.setVisible(true);
		}

		if (e.getSource() == cph) {
			checkingFrame.setVisible(false);
			homeFrame.setVisible(true);
		}

		// savings buttons

		if (e.getSource() == spc) {
			savingsFrame.setVisible(false);
			checkingFrame.setVisible(true);
		}

		if (e.getSource() == spcr) {
			savingsFrame.setVisible(false);
			creditFrame.setVisible(true);
		}

		if (e.getSource() == sph) {
			savingsFrame.setVisible(false);
			homeFrame.setVisible(true);
		}

		// credit buttons

		if (e.getSource() == crpc) {
			creditFrame.setVisible(false);
			checkingFrame.setVisible(true);
		}

		if (e.getSource() == crps) {
			creditFrame.setVisible(false);
			savingsFrame.setVisible(true);
		}

		if (e.getSource() == crph) {
			creditFrame.setVisible(false);
			homeFrame.setVisible(true);
		}

		if (e.getSource() == transfer) {
			homeFrame.setVisible(false);
			transferFrame2.setVisible(true);
		}

		if (e.getSource() == deposit) {
			homeFrame.setVisible(false);
			depositFrame2.setVisible(true);
		}
		if (e.getSource() == depositBack) {
			depositFrame2.setVisible(false);
			homeFrame.setVisible(true);
		}
		if (e.getSource() == transferBack) {
			depositFrame2.setVisible(false);
			homeFrame.setVisible(true);
		}
		if (e.getSource() == depositSubmit) {
			double valueDeposit = (double)depositAmount.getValue();
			if (depositTo.equals("Checking")) {
				double oldCheckingBalance = checkingBalance.get(userIndex);
				checkingBalance.set(userIndex, oldCheckingBalance + valueDeposit);
				checkingAmounts.add(valueDeposit);
				checkingNames.add("Deposit: $");
				System.out.println(checkingAmounts);
				JLabel transaction = new JLabel("Deposit: $" + valueDeposit);
				transaction.setText("Deposit: $" + df.format(valueDeposit));
				checkingStuff.add(transaction);

				for(JLabel j:checkingStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					checkingPanel.add(j);
				}
				
				depositFrame2.setVisible(false);
				homeFrame.setVisible(true);

				depositAmount.setValue(0);
				depositSelector.setSelectedItem("Select Account");


				//				Object[] obj = {"Deposit: $", valueDeposit};
				//				((DefaultTableModel) userCheckingTransactionsAmount).addRow(obj);
				//				checkingTransactionList = new JTable(userCheckingTransactionsAmount);
				//				checkingPanel.add(checkingScroll);
			}
			else if (depositTo.equals("Savings")) {
				double oldSavingsBalance = savingsBalance.get(userIndex);
				savingsBalance.set(userIndex, oldSavingsBalance + valueDeposit);
				savingsAmounts.add(valueDeposit);
				savingsNames.add("Deposit: $");

				JLabel transaction2 = new JLabel("Deposit: $" + valueDeposit);
				transaction2.setText("Deposit: $" + df.format(valueDeposit));
				savingsStuff.add(transaction2);

				incrementer = 150;

				for(JLabel j:savingsStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					savingsPanel.add(j);
				}

				depositFrame2.setVisible(false);
				homeFrame.setVisible(true);
				depositAmount.setValue(0);
				depositSelector.setSelectedItem("Select Account");
				

			}
			else if (depositTo.equals("Credit")) {
				depositToMessage.setForeground(Color.RED);
				depositToMessage.setText("Action Unavailable");
			}
			else if (depositTo.equals("Select Account")){
				depositToMessage.setForeground(Color.RED);
				depositToMessage.setText("Please Select an Account");
			}

			homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
			homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
			homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
			
		}
		if (e.getSource() == transferSubmit) {
			double transferFromAmount = (double)(transferAmount.getValue());
			if (transferFrom.equals("Checking") && transferTo.equals("Savings")) {
				double olderCheckingBalance = checkingBalance.get(userIndex);
				checkingBalance.set(userIndex, olderCheckingBalance - transferFromAmount);
				double olderSavingsBalance = savingsBalance.get(userIndex);
				savingsBalance.set(userIndex, olderSavingsBalance + transferFromAmount);
				JLabel transaction3 = new JLabel("Transfer to " + transferTo + ": $" + transferFromAmount);
				transaction3.setText("Transfer to " + transferTo + ": $" + df.format(transferFromAmount));
				checkingStuff.add(transaction3);
				JLabel transaction31 = new JLabel();
				transaction31.setText("Transfer from " + transferFrom + ": $" + df.format(transferFromAmount));
				savingsStuff.add(transaction31);
				incrementer = 150;
				
				for(JLabel j:checkingStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					checkingPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:savingsStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					savingsPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:creditStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					creditStuff.add(j);
				}
				
				incrementer = 150;
				transferAmount.setValue(0);
				transferSelector.setSelectedItem("Select Account");
				transferSelector2.setSelectedItem("Select Account");
				
				System.out.println("p");		
				homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
				homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
				homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
				transferFrame2.setVisible(false);
				homeFrame.setVisible(true);

			}
			else if (transferFrom.equals("Checking") && transferTo.equals("Credit")) {
				double olderCheckingBalance = checkingBalance.get(userIndex);
				checkingBalance.set(userIndex, olderCheckingBalance - transferFromAmount);
				double olderCreditBalance = creditBalance.get(userIndex);
				creditBalance.set(userIndex, olderCreditBalance - transferFromAmount);
				JLabel transaction4 = new JLabel("Transfer to " + transferTo + ": $" + transferFromAmount);
				transaction4.setText("Transfer to " + transferTo + ": $" + df.format(transferFromAmount));
				checkingStuff.add(transaction4);
				JLabel transaction41 = new JLabel(); 
				transaction41.setText("Transfer from " + transferFrom + ": $" + df.format(transferFromAmount));
				creditStuff.add(transaction41);
				incrementer = 150;
				
				for(JLabel j:checkingStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					checkingPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:savingsStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					savingsPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:creditStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					creditStuff.add(j);
				}
				
				incrementer = 150;
				transferAmount.setValue(0);
				transferSelector.setSelectedItem("Select Account");
				transferSelector2.setSelectedItem("Select Account");
				
				System.out.println("p");		
				homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
				homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
				homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
				transferFrame2.setVisible(false);
				homeFrame.setVisible(true);

			}
			else if (transferFrom.equals("Savings") && transferTo.equals("Checking")) {
				double olderSavingsBalance = savingsBalance.get(userIndex);
				double olderCheckingBalance = checkingBalance.get(userIndex);
				if (olderSavingsBalance < transferFromAmount) {
//					transferToMessage.setForeground(Color.RED);
//					transferToMessage.setText("Insufficient Balance");
					transferFromMessage.setForeground(Color.RED);
					transferFromMessage.setText("Insufficient Balance");
				}
				else {
					savingsBalance.set(userIndex, olderSavingsBalance - transferFromAmount);
					checkingBalance.set(userIndex, olderCheckingBalance + transferFromAmount);
					JLabel transaction5 = new JLabel("Transfer to " + transferTo + ": $" + transferFromAmount);
					transaction5.setText("Transfer to " + transferTo + ": $" + df.format(transferFromAmount));
					savingsStuff.add(transaction5);
					JLabel transaction51 = new JLabel();
					transaction51.setText("Transfer from " + transferFrom + ": $" + df.format(transferFromAmount));
					checkingStuff.add(transaction51);
					incrementer = 150;
					
					for(JLabel j:checkingStuff) {
						//incrementer = 150;
						j.setForeground(Color.BLACK);
						j.setFont(new Font("Helvetica", Font.BOLD, 25));
						j.setSize(500, 100);
						j.setLocation(8, incrementer);
						//j.setText("text");
						incrementer = incrementer + 35;
						checkingPanel.add(j);
					}
					
					incrementer = 150;

					
					for(JLabel j:savingsStuff) {
						//incrementer = 150;
						j.setForeground(Color.BLACK);
						j.setFont(new Font("Helvetica", Font.BOLD, 25));
						j.setSize(500, 100);
						j.setLocation(8, incrementer);
						//j.setText("text");
						incrementer = incrementer + 35;
						savingsPanel.add(j);
					}
					
					incrementer = 150;

					
					for(JLabel j:creditStuff) {
						//incrementer = 150;
						j.setForeground(Color.BLACK);
						j.setFont(new Font("Helvetica", Font.BOLD, 25));
						j.setSize(500, 100);
						j.setLocation(8, incrementer);
						//j.setText("text");
						incrementer = incrementer + 35;
						creditStuff.add(j);
					}
					
					incrementer = 150;
					transferAmount.setValue(0);
					transferSelector.setSelectedItem("Select Account");
					transferSelector2.setSelectedItem("Select Account");
					
					System.out.println("p");		
					homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
					homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
					homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
					transferFrame2.setVisible(false);
					homeFrame.setVisible(true);
				}

			}
			else if (transferFrom.equals("Savings") && transferTo.equals("Credit")) {
				double olderSavingsBalance = savingsBalance.get(userIndex);
				double olderCreditBalance = creditBalance.get(userIndex);
				if (olderSavingsBalance < transferFromAmount) {
//					transferToMessage.setForeground(Color.RED);
//					transferToMessage.setText("Insufficient Balance");
					transferFromMessage.setForeground(Color.RED);
					transferFromMessage.setText("Insufficient Balance");
				}
				else {
					savingsBalance.set(userIndex, olderSavingsBalance - transferFromAmount);
					creditBalance.set(userIndex, olderCreditBalance - transferFromAmount);
					JLabel transaction6 = new JLabel("Transfer to " + transferTo + ": $" + transferFromAmount);
					transaction6.setText("Transfer to " + transferTo + ": $" + df.format(transferFromAmount));
					savingsStuff.add(transaction6);
					JLabel transaction61 = new JLabel();
					transaction61.setText("Transfer from " + transferFrom + ": $" + df.format(transferFromAmount));
					creditStuff.add(transaction6);
					incrementer = 150;
					
					for(JLabel j:checkingStuff) {
						//incrementer = 150;
						j.setForeground(Color.BLACK);
						j.setFont(new Font("Helvetica", Font.BOLD, 25));
						j.setSize(500, 100);
						j.setLocation(8, incrementer);
						//j.setText("text");
						incrementer = incrementer + 35;
						checkingPanel.add(j);
					}
					
					incrementer = 150;

					
					for(JLabel j:savingsStuff) {
						//incrementer = 150;
						j.setForeground(Color.BLACK);
						j.setFont(new Font("Helvetica", Font.BOLD, 25));
						j.setSize(500, 100);
						j.setLocation(8, incrementer);
						//j.setText("text");
						incrementer = incrementer + 35;
						savingsPanel.add(j);
					}
					
					incrementer = 150;

					
					for(JLabel j:creditStuff) {
						//incrementer = 150;
						j.setForeground(Color.BLACK);
						j.setFont(new Font("Helvetica", Font.BOLD, 25));
						j.setSize(500, 100);
						j.setLocation(8, incrementer);
						//j.setText("text");
						incrementer = incrementer + 35;
						creditStuff.add(j);
					}
					
					incrementer = 150;
					transferAmount.setValue(0);
					transferSelector.setSelectedItem("Select Account");
					transferSelector2.setSelectedItem("Select Account");
					
					System.out.println("p");		
					homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
					homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
					homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
					transferFrame2.setVisible(false);
					homeFrame.setVisible(true);
				}
			}
			else if (transferFrom.equals("Credit") && transferTo.equals("Checking")) {
				double olderCreditBalance = creditBalance.get(userIndex);
				creditBalance.set(userIndex, olderCreditBalance + transferFromAmount);
				double olderCheckingBalance = checkingBalance.get(userIndex);
				checkingBalance.set(userIndex, olderCheckingBalance - transferFromAmount);
				JLabel transaction7 = new JLabel("Transfer to " + transferTo + ": $" + transferFromAmount);
				transaction7.setText("Transfer to " + transferTo + ": $" + df.format(transferFromAmount));
				creditStuff.add(transaction7);
				JLabel transaction71 = new JLabel();
				transaction71.setText("Transfer from " + transferFrom + ": $" + df.format(transferFromAmount));
				checkingStuff.add(transaction7);
				incrementer = 150;
				
				for(JLabel j:checkingStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					checkingPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:savingsStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					savingsPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:creditStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					creditStuff.add(j);
				}
				
				incrementer = 150;
				transferAmount.setValue(0);
				transferSelector.setSelectedItem("Select Account");
				transferSelector2.setSelectedItem("Select Account");
				
				System.out.println("p");		
				homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
				homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
				homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
				transferFrame2.setVisible(false);
				homeFrame.setVisible(true);

			}
			else if (transferFrom.equals("Credit") && transferTo.equals("Savings")) {
				double olderCreditBalance = creditBalance.get(userIndex);
				creditBalance.set(userIndex, olderCreditBalance + transferFromAmount);
				double olderSavingsBalance = savingsBalance.get(userIndex);
				savingsBalance.set(userIndex, olderSavingsBalance - transferFromAmount);
				JLabel transaction8 = new JLabel("Transfer to " + transferTo + ": $" + transferFromAmount);
				transaction8.setText("Transfer to " + transferTo + ": $" + df.format(transferFromAmount));
				creditStuff.add(transaction8);
				JLabel transaction81 = new JLabel();
				transaction81.setText("Transfer from " + transferFrom + ": $" + df.format(transferFromAmount));
				savingsStuff.add(transaction8);
				incrementer = 150;
				
				for(JLabel j:checkingStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					checkingPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:savingsStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					savingsPanel.add(j);
				}
				
				incrementer = 150;

				
				for(JLabel j:creditStuff) {
					//incrementer = 150;
					j.setForeground(Color.BLACK);
					j.setFont(new Font("Helvetica", Font.BOLD, 25));
					j.setSize(500, 100);
					j.setLocation(8, incrementer);
					//j.setText("text");
					incrementer = incrementer + 35;
					creditStuff.add(j);
				}
				
				incrementer = 150;
				transferAmount.setValue(0);
				transferSelector.setSelectedItem("Select Account");
				transferSelector2.setSelectedItem("Select Account");
				
				System.out.println("p");		
				homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
				homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
				homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
				transferFrame2.setVisible(false);
				homeFrame.setVisible(true);

			}
			else if (transferFrom.equals("Select an Account") || transferTo.equals("Select an Account")){
				transferToMessage.setForeground(Color.RED);
				transferToMessage.setText("Please Select an Account");
				transferFromMessage.setForeground(Color.RED);
				transferFromMessage.setText("Please Select an Account");
			}
			else {
				transferToMessage.setForeground(Color.RED);
				transferToMessage.setText("Invalid Request");
				transferFromMessage.setForeground(Color.RED);
				transferFromMessage.setText("Invalid Request");
			}
			
//			incrementer = 150;
//			
//			for(JLabel j:checkingStuff) {
//				//incrementer = 150;
//				j.setForeground(Color.BLACK);
//				j.setFont(new Font("Helvetica", Font.BOLD, 25));
//				j.setSize(500, 100);
//				j.setLocation(8, incrementer);
//				//j.setText("text");
//				incrementer = incrementer + 35;
//				checkingPanel.add(j);
//			}
//			
//			incrementer = 150;
//
//			
//			for(JLabel j:savingsStuff) {
//				//incrementer = 150;
//				j.setForeground(Color.BLACK);
//				j.setFont(new Font("Helvetica", Font.BOLD, 25));
//				j.setSize(500, 100);
//				j.setLocation(8, incrementer);
//				//j.setText("text");
//				incrementer = incrementer + 35;
//				savingsPanel.add(j);
//			}
//			
//			incrementer = 150;
//
//			
//			for(JLabel j:creditStuff) {
//				//incrementer = 150;
//				j.setForeground(Color.BLACK);
//				j.setFont(new Font("Helvetica", Font.BOLD, 25));
//				j.setSize(500, 100);
//				j.setLocation(8, incrementer);
//				//j.setText("text");
//				incrementer = incrementer + 35;
//				creditStuff.add(j);
//			}
//			
//			incrementer = 150;
//			transferAmount.setValue(0);
//			transferSelector.setSelectedItem("Select Account");
//			transferSelector2.setSelectedItem("Select Account");
//			
//			System.out.println("p");		
//			homeCheckingOverview.setText("Checking Balance: $" + checkingBalance.get(userIndex));
//			homeSavingsOverview.setText("Savings Balance: $" + savingsBalance.get(userIndex));
//			homeCreditOverview.setText("Credit Due: $" + creditBalance.get(userIndex));
//			transferFrame2.setVisible(false);
//			homeFrame.setVisible(true);

			

		}




	}

	//@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	//@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == depositSelector) {
			depositTo = (String)(depositSelector.getSelectedItem());
			System.out.println(depositTo);
		}
		if (e.getSource() == transferSelector) {
			transferFrom = (String)(transferSelector.getSelectedItem());
			System.out.println(transferFrom);
		}
		if (e.getSource() == transferSelector2) {
			transferTo = (String)(transferSelector2.getSelectedItem());
			System.out.println(transferTo);
		}
	}



}
