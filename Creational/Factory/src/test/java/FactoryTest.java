import org.designpattern.subscription.Plan;
import org.designpattern.subscription.PlanFactory;
import org.designpattern.subscription.Plans;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {
    private PlanFactory planFactory = new PlanFactory();
    @Test
    public void returning_plans_price_basic(){
        Plan p = planFactory.getPlan(Plans.PREMIUM);
        assertEquals(250,p.getPrice());
    }
}
