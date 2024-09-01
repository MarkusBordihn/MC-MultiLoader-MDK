package org.example.examplemod.gametest;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import org.example.examplemod.Constants;

@SuppressWarnings("unused")
public class SmokeTest {

  @GameTest(template = "example_mod:gametest.3x3x3")
  public void testModRegistered(GameTestHelper helper) {
    GameTestHelpers.assertTrue(
        helper,
        "Mod " + Constants.MOD_ID + " is not available!",
        FabricLoader.getInstance().isModLoaded(Constants.MOD_ID));
    helper.succeed();
  }
}
