import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {
	Implementation obj;

	@Before
	public void setUp() throws Exception {
		obj = new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testMonthlyPremium() {
		int basic = 400;
		int rate = 25;
		double ServiceTax = (.15 * basic);
		double ans = basic * rate + ServiceTax;
		assertEquals(ans, obj.MonthlyPremium(rate, basic, ServiceTax), 0.001);

	}

	public void testQuartlyPremium() {
		int basic = 400;
		int rate = 75;
		double ServiceTax = (.15 * basic);
		double ans = basic * rate + ServiceTax;
		assertEquals(ans, obj.MonthlyPremium(rate, basic, ServiceTax), 0.001);

	}
	public void testYearlyPremium() {
		int basic = 400;
		int rate = 300;
		double ServiceTax = (.15 * basic);
		double ans = basic * rate + ServiceTax;
		assertEquals(ans, obj.MonthlyPremium(rate, basic, ServiceTax), 0.001);

	}

}