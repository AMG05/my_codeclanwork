import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Bob", "Purser");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", cabinCrewMember.getName());
    }

    @Test
    public void hasRankType(){
        assertEquals("Purser", cabinCrewMember.getRankType());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Brace Brace", cabinCrewMember.canRelayMessage());
    }
}
