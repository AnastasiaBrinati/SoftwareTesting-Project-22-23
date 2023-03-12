package calculator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestSubtraction.class, TestAddition.class, TestMultiplication.class, TestDivision.class, TestExpression.class})

// Giulio suggerisce di aggiungere come integration test una sorta di espressione
// quindi fare tipo il test di " 3+4*12-9 ", per provare che tutte le 'feature'
// not only work per se, but also as a whole

// would be nice if we had also something for the eyeautomate part, but i am
// clueless on how to use that together with java, we should rewatch the lesson
// because he did

public class LogicTestSuite {
}

/*

- 1: screen recording of the enviroment executing (from push to log-file)
            one with the test failing, and then the next one woth them passing (-> tdd)
     model of CI system (fatto sta nel report pdf)
     (use TTD)
     screenshot of the repo showing everybody worked on it
     report
     link to the repo
     time logs on how much each member spent on it
     make sure to record somehow that each group member uses the environment, e.g. one video per person.

 */