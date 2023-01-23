package aoizora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest
{
	private Fibonacci fibonacci = new Fibonacci();

	@Test
	public void firstNumberIsOne()
	{
		assertEquals(1, fibonacci.calc(1));
	}

	@Test
	public void secondNumberIsOne()
	{
		assertEquals(1, fibonacci.calc(2));
	}

	@Test
	public void thirdNumberIsTwo()
	{
		assertEquals(2, fibonacci.calc(3));
	}

	@Test
	public void fourthNumberIsThree()
	{
		assertEquals(3, fibonacci.calc(4));
	}

	@Test
	public void fifthNumberIsFive()
	{
		assertEquals(5, fibonacci.calc(5));
	}

	@Test
	public void sixthNumberIsEight()
	{
		assertEquals(8, fibonacci.calc(6));
	}
}