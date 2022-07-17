package onetooneuni_test;

import oneTooneuni.dao.AadharDao;
import oneTooneuni.dao.PersonDao;
import onetooneuni_dto.AadharCard;
import onetooneuni_dto.Person;

public class OneToOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PersonDao dao = new PersonDao(); Person
		 * person=dao.findPersonByName("Sachin"); System.out.println(person.getPid());;
		 * System.out.println(person.getName()); System.out.println(person.getCity());
		 * 
		 * AadharCard aadharCard = person.getAadhar();
		 * 
		 * System.out.println(aadharCard.getAid());
		 * System.out.println(aadharCard.getDob());
		 * System.out.println(aadharCard.getAddress());
		 */
		
		AadharDao dao = new AadharDao();
		AadharCard aadharCard = dao.findAadharCard(123);
		 System.out.println(aadharCard.getAid());
		 System.out.println(aadharCard.getDob());
		 System.out.println(aadharCard.getAddress());
		
		// owning side  - Person Class because using id of person we can get Aadharcard
		 
		 //non owning side - AadharCard Class because we using aid we can not get Person 
		
	}

}
