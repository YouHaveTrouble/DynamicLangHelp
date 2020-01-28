package pl.laststation.youhavetrouble.dynamichelp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.laststation.youhavetrouble.dynamichelp.Dynamichelp;
import pl.laststation.youhavetrouble.dynamichelp.langmodule.lang;


public class HelpCommand implements CommandExecutor {

    public HelpCommand(Dynamichelp plugin) {
    }


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        new lang.translate();
        Player p = (Player) commandSender;
            if (args.length > 1) {
                commandSender.sendMessage(lang.getTranslatedString(p, "too-many-arguments"));
                return true;
            } else if (args.length == 1) {
                if (Dynamichelp.getPlugin().getConfig().getString("lang.en_us."+args[0]) == null) {
                    commandSender.sendMessage(lang.getTranslatedString(p, "invalid-page"));
                    return true;
                }
                commandSender.sendMessage(lang.getTranslatedString(p, args[0]));
                return true;
            }
        commandSender.sendMessage(lang.getTranslatedString(p, "1"));
            return true;


    }
}