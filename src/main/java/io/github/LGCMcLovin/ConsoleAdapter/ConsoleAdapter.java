package io.github.LGCMcLovin.ConsoleAdapter;

import java.util.logging.Logger;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Allen on 8/23/2014.
 */
public class ConsoleAdapter extends JavaPlugin {
    public static final Logger log = Logger.getLogger("Minecraft");
    private static Plugin plugin;
    public static Plugin getPlugin(){
        return plugin;
    }
    @Override
    public void onLoad(){
        plugin = this;
        this.getCommand("cadapt").setExecutor(new Commander());
        getLogger().info("ConsoleAdapter has been enabled!");
    }
}

