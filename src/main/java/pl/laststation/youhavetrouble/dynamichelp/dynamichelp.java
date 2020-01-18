package pl.laststation.youhavetrouble.dynamichelp;

import org.bukkit.plugin.java.JavaPlugin;
import pl.laststation.youhavetrouble.dynamichelp.commands.helpCommand;

public class dynamichelp extends JavaPlugin {

    public void onEnable() {

        plugin = this;

        saveDefaultConfig();
        getCommand("help").setExecutor(new helpCommand(this));
    }

    private static dynamichelp plugin;

    public static dynamichelp getPlugin(){ return plugin; }


    }
