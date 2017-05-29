package or.kr.connect;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class CountTest {
	private int count = 0;

	@Before
	public void setUP(){
		System.out.print(count++);
	}
	
	
	@Test
	public void testPlus() {
		System.out.print(count++);
	}
	
	@Test
	public void increase(){
		System.out.print(count++);
	}

}
