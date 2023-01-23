package aoizora;

public class Fibonacci
{
	public long calc(long n)
	{
		Matrix2D result = Matrix2D.IDENTITY;
		Matrix2D base = new Matrix2D(1, 1, 1, 0);

		while (n > 1)
		{
			if ((n & 1) == 1)
			{
				result = result.multiply(base);
			}

			base = base.multiply(base);
			n >>= 1;
		}
		return result.multiply(base).c();
	}
}
