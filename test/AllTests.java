import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.cubic.ArrayList.PrimeGeneratorTest;
import com.cubic.multithreading.StudTest;
import com.cubic.training.heirrachy.CashRewardsCardTest;

@RunWith(Suite.class)
@SuiteClasses({StudTest.class, PrimeGeneratorTest.class,CashRewardsCardTest.class})
public class AllTests {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result=JUnitCore.runClasses(StudTest.class, PrimeGeneratorTest.class,CashRewardsCardTest.class);
		for(Failure r:result.getFailures()){
			System.out.println(r.getMessage());
		}
		System.out.println(result.wasSuccessful());
	}
	
}
