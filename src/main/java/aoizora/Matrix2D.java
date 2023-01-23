package aoizora;

import java.util.Objects;

public class Matrix2D
{
	private long a;
	private long b;
	private long c;
	private long d;

	public static final Matrix2D IDENTITY = new Matrix2D(1, 0, 0, 1);

	public Matrix2D(long a, long b, long c, long d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Matrix2D multiply(Matrix2D rhs)
	{
		return new Matrix2D(a()*rhs.a() + b()*rhs.c(), a()*rhs.b() + b()*rhs.d(),
							c()*rhs.a() + d()*rhs.c(), c()*rhs.b() + d()*rhs.d());
	}

	public long a()
	{
		return a;
	}

	public long b()
	{
		return b;
	}

	public long c()
	{
		return c;
	}

	public long d()
	{
		return d;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Matrix2D matrix2D = (Matrix2D) o;
		return a == matrix2D.a && b == matrix2D.b && c == matrix2D.c && d == matrix2D.d;
	}
}
