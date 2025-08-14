package loan.randomstuff.playerwelcomerjava;

import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.minimessage.*;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
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
        event.joinMessage(null);
        Component playerWelcome = Component.text("You're connected to the ")
                .color(TextColor.color(63, 176, 120))
                .append(Component.text("manhunt ", NamedTextColor.AQUA))
                .append(Component.text("server."))
                .color(TextColor.color(63, 176, 120));
        event.getPlayer().sendMessage(playerWelcome);
        Component joinBroadcast = Component.text(event.getPlayer().getName() + " has connected to the server!")
                        .color(TextColor.color(118, 186, 0));
        Bukkit.broadcast(joinBroadcast);

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.quitMessage(null);
        Component playerDisconnect = Component.text(event.getPlayer().getName() + " has disconnected from the server.")
                .color(TextColor.color(255, 0, 0));
        Bukkit.broadcast(playerDisconnect);
    }
}
