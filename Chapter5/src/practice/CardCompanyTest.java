package practice;

public class CardCompanyTest {

	public static void main(String[] args) {

			CardCompany company = CardCompany.getInstance();  //�̱��� ����
			
			Card myCard = company.createCard();   //�޼��忡�� Car ����
			Card yourCard = company.createCard();
			
			System.out.println(myCard.getCardNumber());    //10001  ����
			System.out.println(yourCard.getCardNumber());  //10002  ����
			
	}
}
