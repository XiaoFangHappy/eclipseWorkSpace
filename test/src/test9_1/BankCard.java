package test9_1;

public class BankCard {
	private String cardId;
	
	public void test() {
		System.out.println("外部");
	}
	
	public class Bank{
		 String name;
		
		public void test() {
			System.out.println("内部");
		}

		public void a(){
			this.test();
		}
		public void b() {
			BankCard.this.test();
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		
	}



	public String getCardId() {
		return cardId;
	}



	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	
	
}
