import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class ArrayListTest {
	public static void main(String[] args) {
		
		
		BankAccountFrame frame = new BankAccountFrame();
		frame.setVisible(true);
		

		
	}
}

class BankAccountFrame extends JFrame implements ActionListener
{
	
	ArrayList<BankAccount> list = new ArrayList<BankAccount>();

	
	JLabel label1 = new JLabel("Enter account Number ");
	JLabel label2 = new JLabel("Enter account Holder ");
	JLabel label3 = new JLabel("Enter account Balance ");
	JLabel label4 = new JLabel("Enter account Type ");
		
	JTextField data1 = new JTextField(20); //ctrl + shift+ M
	JTextField data2 = new JTextField(20);
	JTextField data3 = new JTextField(20);
	JTextField data4 = new JTextField(20);
	
	JButton save = new JButton("SAVE");
	JButton clear = new JButton("CLEAR");
	JButton show = new JButton("SHOW ACCOUNTS");

	JTable table = new JTable();;
	
	
	BankAccountFrame() {
		
		setLayout(new FlowLayout());
		add(label1); add(data1);
		add(label2); add(data2);
		add(label3); add(data3);
		add(label4); add(data4);
		add(save);
		add(clear);
		add(show);
		add(table);
		table.setBounds(30,40,200,300);          
	    JScrollPane sp=new JScrollPane(table);
	    add(sp);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		save.addActionListener(this);
		clear.addActionListener(this);
		show.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==save) {
			System.out.println("SAVE button is clicked....");
			
			int accNum = Integer.parseInt(data1.getText());
			String accHolderName = data2.getText();
			double accBal = Double.parseDouble(data3.getText());
			String accType = data4.getText();
			
			BankAccount bankAccount = new BankAccount(accNum,accHolderName,accBal,accType);
			
			list.add(bankAccount);
			System.out.println("BankAccount added to the List...");
			
			

			
		}
		else 	if(ae.getSource()==clear) {
			System.out.println("CLEAR button is clicked....");
			
		}
		else 	if(ae.getSource()==show) {
			System.out.println("SHOW button is clicked....");
			
			TableModel model = new BankAccountTableModel(list);
			table.setModel(model);
			
			for (BankAccount x : list) {
				System.out.println("=> Bank account : "+x);
				//table.add
			}
			
		}
		
	
		
		
	}
	
}

class BankAccountTableModel extends AbstractTableModel {
	  private List<BankAccount> accounts ;
	  private String[] columns ; 

	  public BankAccountTableModel(List<BankAccount> accs){
	    super();
	    accounts = accs ;
	    columns = new String[]{"AccountNumber","Account Holder","Account Balance", "Account Type"};
	  }

	  // Number of column of your table
	  public int getColumnCount() {
	    return columns.length ;
	  }

	  // Number of row of your table
	  public int getRowCount() {
	    return accounts.size();
	  }

	  // The object to render in a cell
	  public Object getValueAt(int row, int col) {
		  System.out.println("getValueAt called...row:"+row+ " col:"+col);
	    BankAccount  accs = accounts.get(row);
	    switch(col) {
	      case 0: return accs.getPosition();
	      // to complete here...
	      default: return null;
	    }
	  }

	  // Optional, the name of your column
	  public String getColumnName(int col) {
	    return columns[col] ;
	  }

	

	}