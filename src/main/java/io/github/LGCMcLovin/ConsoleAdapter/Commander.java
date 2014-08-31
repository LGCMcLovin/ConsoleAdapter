package io.github.LGCMcLovin.ConsoleAdapter;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * Created by Allen on 8/23/2014.
 */
    public class Commander implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        String parsed = "";
        for(String part:strings) {
            parsed = parsed + part + " ";
        }
// Sends Command as Console if parsed length is not = to 0
        if (parsed.length()!=0){
            ConsoleAdapter.getPlugin().getServer().dispatchCommand(Bukkit.getConsoleSender(),parsed);
            return true;
        } else {
            return false;
    }
}}
