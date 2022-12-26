package hw2;
/**
 * this class is the tester class
 * @author Sharon Le
 * @since 10/3/2022
 * @version 1.0
 */
public class BusinessTest {
	
	public static void main (String[] args) {
		Address ad1 = new Address (123, "oak", "San Jose", 95123, "California");
		Address ad2 = new Address (178, "red river", "San Jose", 95136, "California");
		Address ad3 = new Address (177, "mary", "morgan hill", 94789, "California");
		Address ad4 = new Address (123, "eleven", "Santa Cruz", 92798, "California");
		Address ad5 = new Address (999, "senter", "San Jose", 96722, "California");
		Address ad6 = new Address (121, "fishnet", "morgan hill", 94555, "California");
		Address ad7 = new Address (666, "seawater", "san francisco", 93444, "California");
		Address ad8 = new Address (666, "wood", "San Jose", 92791, "California");
		Address ad9 = new Address (611, "oddnballs", "San Jose", 96124, "California");
		Address ad10 = new Address (611, "underthebus", "border line sf", 96156, "California");
		Address ad11 = new Address (996, "In Your Walls", "BarckYard", 96199, "California");
		Address ad12 = new Address (611, "Wall Street", "Buffalo Hay", 96156, "New York");
		
		Executive exe1 = new Executive("Sheng Sheng", "Huo", ad1, 012345, 20.0, 22, "100-456-9999");
		Executive exe2 = new Executive("Sharon", "Le", ad2, 123999, 19.0, 25.0, "999-999-9999");
		exe1.introduce(false);
		System.out.println(exe1.computePay() + "\n");
		exe2.introduce(true);
		System.out.println(exe2.computePay() + "\n");
		
		FullTimeSalaried fts1 = new FullTimeSalaried("Rafa padilla", "perez", ad3, 99999, 29.0, "666-666-6666");
		FullTimeSalaried fts2 = new FullTimeSalaried("Caleb", "Siow", ad4, 333333, 99.9, "111-111-1111");
		fts1.introduce(true);
		System.out.println(fts1.computePay(3) + "\n");//weeks
		fts2.introduce(false);
		System.out.println(fts2.computePay(9) + "\n");
		
		FullTimeHourly fth1 =  new FullTimeHourly("Johnson", "Bao", ad5, 767676, 50.0, 70.0, "000-000-0000");
		FullTimeHourly fth2 = new FullTimeHourly("Simone", "lofaso", ad6, 989898, 88.0, 90.0, "222-222-2222");
		fth1.introduce(false);
		System.out.println(fth1.computePay(37) + "\n"); //hours
		fth2.introduce(true);
		System.out.println(fth2.computePay(50) + "\n");
		
		PartTimeHourly pth1 = new PartTimeHourly("Jack", "chak", ad7, 1515281, 45.0, "213-213-4123");
		PartTimeHourly pth2 = new PartTimeHourly("Nathan", "Duong", ad8, 213201, 99.0, "762-131-2451" );
		pth1.introduce(true);
		System.out.println(pth1.computePay(50) + "\n");
		pth2.introduce(false);
		System.out.println(pth2.computePay(15) + "\n");
		
		Contractor c1 = new Contractor("Micaheal", "HisLastName", ad8, 12380121, 76.0, "213-909-0000");
		Contractor c2 = new Contractor("Chinamay", "guess", ad10, 39201371, 199.0, "232-532-7652");
		c1.introduce(true);
		System.out.println(c1.computePay(34) + "\n");
		c2.introduce(false);
		System.out.println(c2.computePay(28) + "\n");
		
		Customer cust1 = new Customer("Joe", "Mama", ad11, 231981, "999-111-2222", "Cash");
		Customer cust2 = new Customer("Jone", "Papa", ad12, 231000, "111-000-9999", "Card");
		cust1.introduce();
		cust1.makePayment();
		cust2.introduce();
		cust2.makePayment();
		
	}
}
