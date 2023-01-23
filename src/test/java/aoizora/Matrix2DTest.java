package aoizora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Matrix2DTest
{
	@Test
	public void identity()
	{
		Matrix2D identity = new Matrix2D(1, 0, 0, 1);
		assertEquals(identity, Matrix2D.IDENTITY);
	}

	@Test
	public void square()
	{
		Matrix2D base = new Matrix2D(1, 1, 1, 0);
		Matrix2D squared = new Matrix2D(2, 1, 1, 1);
		assertEquals(squared, base.multiply(base));
	}
}