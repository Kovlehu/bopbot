package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import util.CommandUtil;
import util.EmbedFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MiscCommands extends ListenerAdapter {

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        if (!CommandUtil.command(event)){
            return;
        }
        List<String> vibes = new ArrayList<>(List.of("https://media.discordapp.net/attachments/762037332139966484/805456927940542494/tenor_4.gif","https://media.discordapp.net/attachments/762037332139966484/805456524515606558/tenor_2.gif"));
        Random random = new Random();

        String content = event.getMessage().getContentRaw();
        String command = content.substring(1);

        if (command.equalsIgnoreCase("ping")){
            event.getJDA().getRestPing().queue(time ->
            {
                event.getChannel().sendMessage("Pong! \n \n"+time+"ms").queue();
            });

        }
        else if (command.equalsIgnoreCase("bop")) {
            event.getChannel().sendMessage("https://tenor.com/view/big-mouth-cat-gif-18848042").queue();
        }
        else if (command.equalsIgnoreCase("vibe")){
            event.getChannel().sendMessage("Feeling the vibe").queue(message -> event
                    .getChannel().sendMessage(vibes.get(random.nextInt(vibes.size()))).queue());
        }
        else if (command.equalsIgnoreCase("help")){
            event.getChannel().sendMessage(EmbedFactory.helpEmbed()).queue();
        }
    }
}
