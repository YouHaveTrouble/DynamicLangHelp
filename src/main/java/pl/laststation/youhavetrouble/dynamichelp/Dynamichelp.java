package pl.laststation.youhavetrouble.dynamichelp;

import org.bukkit.plugin.java.JavaPlugin;
import pl.laststation.youhavetrouble.dynamichelp.commands.HelpCommand;

public class Dynamichelp extends JavaPlugin {

    public void onEnable() {

        plugin = this;

        saveDefaultConfig();
        getCommand("help").setExecutor(new HelpCommand(this));
        getCommand("?").setExecutor(new HelpCommand(this));
    }

    private static Dynamichelp plugin;

    public static Dynamichelp getPlugin(){ return plugin; }


    }
