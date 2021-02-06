package main;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

import javax.security.auth.login.LoginException;
import java.util.List;
import java.util.Random;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder
                .createDefault("NzYxOTk5ODMyOTk4NzM5OTg4.X3ixpQ.tCb-z459FaEzhdv5Yhmk7lw5Q3A")
                .addEventListeners(new Main())
                .setActivity(Activity.listening("bop bop bop | -help"))
                .build().awaitReady();

    }

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }
    String content = event.getMessage().getContentRaw();
        List<String> vibes = new ArrayList<>(List.of("https://media.discordapp.net/attachments/762037332139966484/805456927940542494/tenor_4.gif","https://media.discordapp.net/attachments/762037332139966484/805456524515606558/tenor_2.gif"));
        Random random = new Random();
        if (content.startsWith("-")){
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
           else if (command.equalsIgnoreCase("economyhelp")){
               event.getChannel().sendMessage(EmbedFactory.economyHelpEmbed()).queue();
            }
           else if (command.equalsIgnoreCase("shop")){
               event.getChannel().sendMessage(EmbedFactory.shopEmbed()).queue();
            }

            }
        }
    }

