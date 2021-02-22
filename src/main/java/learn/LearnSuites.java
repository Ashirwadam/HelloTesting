package learn;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import param.ParamsTest;
import teach.LearnTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ParamsTest.class, LearnTest.class})
public class LearnSuites {
}
