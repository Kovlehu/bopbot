package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import util.CommandUtil;
import util.EmbedFactory;

public class EconomyCommands extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        if (!CommandUtil.command(event)) {
            return;
        }

        String content = event.getMessage().getContentRaw();
        String command = content.substring(1);

        if (command.equalsIgnoreCase("economyhelp")) {
            event.getChannel().sendMessage(EmbedFactory.economyHelpEmbed()).queue();
        } else if (command.equalsIgnoreCase("shop")) {
            event.getChannel().sendMessage(EmbedFactory.shopEmbed()).queue();
        }

    }
}
