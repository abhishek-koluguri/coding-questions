
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuplicateCheckerTest {


    @Before
    public void setup() {
    }

    @Test
    public void canary() {
        Assert.assertTrue(true);
    }

    @Test
    public void containsDuplicate_GivenArrayWithDuplicate_ReturnsTrue() {
        final int[] nums = {1, 2, 3, 4, 1};

        Assert.assertTrue(DuplicateChecker.containsDuplicate(nums));
    }
}