package re.KnightFaith.plugin.workshop;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.Server;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements  org.bukkit.event.Listener {

    @EventHandler
    public void onPLayerJoin(PlayerJoinEvent evt)
    {
        Player p = evt.getPlayer();
        org.bukkit.Bukkit.broadcastMessage("PLayer "+p.getName()+"Has joined\n")
    }

    @EventHandler
    public void OnPlayerQuitEvent(PlayerQuitEvent evt)
    {
        Player p = evt.getPlayer();
        org.bukkit.Bukkit.broadcastMessage("Player "+p.getName()+" has left !");
    }
}
