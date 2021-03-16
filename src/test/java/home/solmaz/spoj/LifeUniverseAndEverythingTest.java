package home.solmaz.spoj;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LifeUniverseAndEverythingTest {
  private     LifeUniverseAndEverything lifeUniverseAndEverything;

    @Before
    public void setUp() throws Exception {

    lifeUniverseAndEverything=new LifeUniverseAndEverything();
    }
/*
on Intellij go to Help menu then  select "edit Custom vm options" and add this :
-Deditable.java.test.console=true

so that you can enter your inputs in junit console.
 */

    @Test
    public void imitate() {
        lifeUniverseAndEverything.imitate();
    }
}