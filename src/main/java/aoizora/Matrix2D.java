package aoizora;

import java.math.BigInteger;
import java.util.Objects;

public class Matrix2D
{
	private BigInteger a;
	private BigInteger b;
	private BigInteger c;
	private BigInteger d;

	public static final Matrix2D IDENTITY = new Matrix2D(1, 0, 0, 1);

	public Matrix2D(long a, long b, long c, long d)
	{
		this.a = BigInteger.valueOf(a);
		this.b = BigInteger.valueOf(b);
		this.c = BigInteger.valueOf(c);
		this.d = BigInteger.valueOf(d);
	}

	public Matrix2D(BigInteger a, BigInteger b, BigInteger c, BigInteger d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Matrix2D multiply(Matrix2D rhs)
	{
		BigInteger a01 = a().multiply(rhs.a());
		BigInteger a02 = b().multiply(rhs.c());
		BigInteger a03 = a().multiply(rhs.b());
		BigInteger a04 = b().multiply(rhs.d());
		BigInteger a11 = c().multiply(rhs.a());
		BigInteger a12 = d().multiply(rhs.c());
		BigInteger a13 = c().multiply(rhs.b());
		BigInteger a14 = d().multiply(rhs.d());

		return new Matrix2D(a01.add(a02), a03.add(a04), a11.add(a12), a13.add(a14));
	}

	public BigInteger a()
	{
		return a;
	}

	public BigInteger b()
	{
		return b;
	}

	public BigInteger c()
	{
		return c;
	}

	public BigInteger d()
	{
		return d;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Matrix2D matrix2D = (Matrix2D) o;
		return a.equals(matrix2D.a) && b.equals(matrix2D.b) && c.equals(matrix2D.c) && d.equals(matrix2D.d);
	}
}
