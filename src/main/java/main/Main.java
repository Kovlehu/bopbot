package main;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder
                .createDefault("NzYxOTk5ODMyOTk4NzM5OTg4.X3ixpQ.tCb-z459FaEzhdv5Yhmk7lw5Q3A")
                .addEventListeners(new Main())
                .setActivity(Activity.watching("bop bop bop"))
                .build().awaitReady();


    }

    @Override
    public void onGuildMessageReceived(@NotNull GuildMessageReceivedEvent event) {
        if (event.getAuthor().isBot()) {
            return;
        }
    String content = event.getMessage().getContentRaw();
        if (content.startsWith("-")){
            String command = content.substring(1);
            if (command.equalsIgnoreCase("ping")){
                event.getJDA().getRestPing().queue(time ->
                {
                    event.getChannel().sendMessage("Pong! \n \n"+time+"ms").queue();
                });

            }
            else if (command.equalsIgnoreCase("bop")){
                event.getChannel().sendMessage("https://tenor.com/view/big-mouth-cat-gif-18848042").queue();
            }
        }
    }
}
