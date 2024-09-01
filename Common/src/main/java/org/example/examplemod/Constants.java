package org.example.examplemod;

import java.nio.file.Path;
import java.nio.file.Paths;

public final class Constants {

  public static final String MOD_ID = "example_mod";
  public static final String MOD_NAME = "__MOD_NAME__";
  public static final String MOD_COMMAND = MOD_ID;
  public static final String LOG_NAME = MOD_NAME;
  public static final String LOG_REGISTER_PREFIX = "Register " + MOD_NAME;

  public static Path GAME_DIR = Paths.get("").toAbsolutePath();
  public static Path CONFIG_DIR = GAME_DIR.resolve("config");

  private Constants() {}
}
