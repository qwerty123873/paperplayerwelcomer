package loan.randomstuff.playerwelcomerjava;

import net.kyori.adventure.text.minimessage.*;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.Listener;

public final class Playerwelcomerjava extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Plugin Loaded!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(Component.text(event.getPlayer().getName() + " has joined."));

    }


    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.getPlayer().sendMessage(Component.text(event.getPlayer().getName() + " has left."));
    }
}
