package aoizora;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest
{
	private Fibonacci fibonacci = new Fibonacci();

	@Test
	public void firstNumberIsOne()
	{
		assertEquals(BigInteger.ONE, fibonacci.calc(1));
	}

	@Test
	public void secondNumberIsOne()
	{
		assertEquals(BigInteger.ONE, fibonacci.calc(2));
	}

	@Test
	public void thirdNumberIsTwo()
	{
		assertEquals(BigInteger.TWO, fibonacci.calc(3));
	}

	@Test
	public void fourthNumberIsThree()
	{
		assertEquals(BigInteger.valueOf(3), fibonacci.calc(4));
	}

	@Test
	public void fifthNumberIsFive()
	{
		assertEquals(BigInteger.valueOf(5), fibonacci.calc(5));
	}

	@Test
	public void sixthNumberIsEight()
	{
		assertEquals(BigInteger.valueOf(8), fibonacci.calc(6));
	}
}