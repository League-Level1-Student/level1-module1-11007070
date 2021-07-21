package _05_vault;

public class Vault {
	public int SecretCode;
	public boolean crackedVault = false;
	
	Vault(int Secret_Code){
		System.out.println("Vault says: a Vault has been made.");
		SecretCode = Secret_Code;
	}
	
	void tryCode(int code) {
		if (code == SecretCode) {
			System.out.println("Vault says: correct code has been inputed.");
			crackedVault = true;
		}
		else {
			System.out.println("Vault says: incorrect code inputed. Alerting security systems now.");
			crackedVault = false;
		}
	}
}

class JamesBond {
	private boolean foundCode = false;
	
	void findCode(Vault vault) {
		for (int code = 0; code < 1000001; code++) {
			if (code == vault.SecretCode) {
				System.out.println(code + " is the code to the vault.");
				foundCode = true;
			}
		}
		if (foundCode == false) {
			System.out.println("No code was found for the vault.");
		}
		
	}
}
