package org.example.examplemod.gametest;

import net.minecraft.gametest.framework.GameTestHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.examplemod.Constants;

public class GameTestHelpers {

  private static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  private GameTestHelpers() {}

  public static void assertTrue(GameTestHelper helper, String message, boolean condition) {
    if (condition) {
      helper.succeed();
    } else {
      helper.fail(message);
    }
  }

  public static void assertNotNull(GameTestHelper helper, String message, Object object) {
    assertTrue(helper, message, object != null);
  }
}
