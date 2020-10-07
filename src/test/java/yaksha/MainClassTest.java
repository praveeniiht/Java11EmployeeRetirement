package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.*;
import org.junit.jupiter.api.Test;

class MainClassTest {
	
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}
	
	@Test
	void testRetirementEmployeeList() throws Exception {
		LinkedHashMap<String, String> a1 = new LinkedHashMap<String, String>();
		a1.put("C1010", "02/11/1987");
		a1.put("C2020", "15/02/1980");
		a1.put("C3030", "14/12/1952");
		a1.put("T4040", "20/02/1950");
		String expectedResult[] = { "C3030", "T4040" };// C3030, T4040
		List<String> service1 = Arrays.asList(expectedResult);
		ArrayList<String> result = EmployeeRetirement.retirementEmployeeList(a1);
		yakshaAssert(currentTest(), (result.containsAll(service1) ? "true" : "false"), businessTestFile);
	}
}
