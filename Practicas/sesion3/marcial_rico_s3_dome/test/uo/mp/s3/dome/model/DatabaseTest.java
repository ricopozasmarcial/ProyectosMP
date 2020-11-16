package uo.mp.s3.dome.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DatabaseTest {
	private Database db;
	private Cd cd;
	private Dvd dvd;
	
	@Before
	public void setUp() {
		db = new Database();
		cd = new Cd("YELLOW SUBMARINE", "BEATLES",70,4);
		dvd = new Dvd("Star Wars", "George Lucas", 210);
	}
	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumberOfItemsOwned() {
		fail("Not yet implemented");
	}

	@Test
	public void testList() {
		db.add(cd);
		db.add(dvd);
		dvd.setOwn(true);
		db.list(System.out);
	}

}
