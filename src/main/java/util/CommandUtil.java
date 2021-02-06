package util;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommandUtil {
    public static boolean command(GuildMessageReceivedEvent event){

        String content = event.getMessage().getContentRaw();
        return content.startsWith("-");

    }
}
