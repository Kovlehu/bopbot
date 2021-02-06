package main;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

public class EmbedFactory {

    public static MessageEmbed HelpEmbed()
    {
        return new EmbedBuilder()
                .setTitle("Commands for BopBot")
                .setDescription("`bop: Will send a gif of bopcat` \n \n `vibe: Will send a random gif of bopcat vibing` \n \n `ping: Will send you the current ping of the bot` \n \n `economyhelp: Will give you the economy help commands`")
                .build();

    }
    public static MessageEmbed EconomyHelpEmbed()
    {
        return new EmbedBuilder()
                .setTitle("Economy Commands")
                .setDescription("These are the commands you'll need for the economy part of the bot \n \n `balance: Will send you how many BopCoins you have` \n \n `daily: Will give you your daily amount of 200 BopCoins` \n \n `shop: Will show you the shop`")
                .build();
    }
    public  static MessageEmbed ShopEmbed()
    {
        return new EmbedBuilder()
                .setTitle("Shop")
                .setDescription("Welcome to the shop! \n I mean... pop!")
                .build();

    }
}
