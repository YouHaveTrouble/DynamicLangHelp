package pl.laststation.youhavetrouble.dynamichelp.langmodule;

import org.bukkit.entity.Player;
import pl.laststation.youhavetrouble.dynamichelp.dynamichelp;

public class lang {

    /**
     *
     * @param p Player of whom locale we're getting
     * @param msg Message string
     * @return Message translated to language based on player's locale
     */
    public static String getTranslatedString(Player p, String msg) {

        String plocale = p.getLocale();
        String tmessage = dynamichelp.getPlugin().getConfig().getString("lang." + plocale + "." + msg);
        String dmessage = dynamichelp.getPlugin().getConfig().getString("lang.en_us." + msg);
        if (tmessage == null) {
            if (dmessage == null) {
                return " ";
            }
            return dmessage;
        } else {
            return tmessage;
        }
    }

    public static class translate {
        public static translate translate;
        public translate() {
            this.translate = this;
        }
    }

}
