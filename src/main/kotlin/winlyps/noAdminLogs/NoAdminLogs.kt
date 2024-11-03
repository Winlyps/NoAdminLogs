package winlyps.noAdminLogs

import org.bukkit.plugin.java.JavaPlugin

class NoAdminLogs : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("logAdminCommands", "false")
        }
        logger.info("NoAdminLogs plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("logAdminCommands", "true")
            logger.info("NoAdminLogs plugin has been disabled.")
        }
    }
}