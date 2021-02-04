package main;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

public class EmbedFactory {

    public static MessageEmbed HelpEmbed()
    {
        return new EmbedBuilder()
                .setTitle("Commands for BopBot")
                .setDescription("`bop: Will send a gif of bopcat` \n \n `vibe: Will send a random gif of bopcat vibing` \n \n `ping: Will send you the current ping of the bot`")
                .build();
    }
}
