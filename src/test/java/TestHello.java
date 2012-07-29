import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestHello {
	private HelloWorld hello;
	
	@Test
	public void testSayHelloToKanan(){
		String message=hello.helloFromKanan();
		assertEquals(message,"Hello From Kanan");
	}

}
