package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault(1234);
		
		/*
		String inputCode = JOptionPane.showInputDialog("What is the code to the vault?");
		int code = Integer.parseInt(inputCode);
		vault.tryCode(code);
		*/
		
		JamesBond bond = new JamesBond();
		bond.findCode(vault);
	}
}
