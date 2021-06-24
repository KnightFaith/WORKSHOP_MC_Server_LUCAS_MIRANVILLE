package fr.luk.Plug;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable () {
		System.out.println("Plugin was successfully started\n");
	}
	@Override
	public void onDisable () { 
		System.out.println("Plugin shutdown successfull\n");
	}
}
