package me.drison64.errorsearching1;

import me.drison64.errorsearching1.Commands.cmdpico;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("pico").setExecutor(new cmdpico());
    }

}
