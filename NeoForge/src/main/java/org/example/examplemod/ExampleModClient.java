package org.example.examplemod;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
@Mod(value = Constants.MOD_ID, dist = Dist.CLIENT)
public class ExampleModClient {

  private static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  @SuppressWarnings("java:S1118")
  public ExampleModClient(IEventBus modEventBus) {
    log.info("Initializing {} (NeoForge-Client) ...", Constants.MOD_NAME);
  }
}
