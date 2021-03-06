package com.github.mori01231.theslowlifecore.Commands;

import com.github.mori01231.theslowlifecore.TheSlowLifeCore;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getServer;

public class TutorialCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            String tutorial = TheSlowLifeCore.getInstance().getConfig().getString("tutorial-teleport");
            getServer().dispatchCommand(getServer().getConsoleSender(), "mvtp " + player.getName() + " " + tutorial);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&3チュートリアルにテレポートしました。" ));
        }
        else{
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',"&3このコマンドはコンソールから使用できません。" ));
        }


        return true;
    }
}
