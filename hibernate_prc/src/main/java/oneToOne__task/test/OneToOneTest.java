package oneToOne__task.test;

import oneToone.task.dao.PersonDao;
import onetoOne_task.dto.PanCard;
import onetoOne_task.dto.Persons;


public class OneToOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			
			  PersonDao dao = new PersonDao(); 
			  Persons person=dao.findPersonByName("Nilesh");
			  System.out.println(person.getPid());;
			  System.out.println(person.getName());
			  
			  System.out.println(person.getCity());
			  
			  PanCard panCard = person.getPan();
			  
			  System.out.println(panCard.getPid());
			  System.out.println(panCard.getDob());
			  System.out.println(panCard.getAddress());
			 
			
//			PancardDao dao = new PancardDao();
//			PanCard panCard = dao.findAadharCard(123);
//			 System.out.println(panCard.getAid());
//			 System.out.println(panCard.getDob());
//			 System.out.println(panCard.getAddress());
			
		}

}
