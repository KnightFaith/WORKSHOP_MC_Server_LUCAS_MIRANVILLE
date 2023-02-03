package re.KnightFaith.plugin.workshop;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements  {

    @EventHandler
    public void onPLayerJoin(PlayerJoinEvent evt)
    {
        Player p = evt.getPlayer();
        org.bukkit.Server.broadcastMessage("New player has joined !");
    }

    @EventHandler
    public void OnPlayerQuitEvent(PlayerQuitEvent evt)
    {
        Player p = evt.getPlayer();
        org.bukkit.Server.broadcastMessage("Player ", p.getName(), " has left !");
    }
}
