import commands.EconomyCommands;
import commands.MiscCommands;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import util.EmbedFactory;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;
import java.util.List;
import java.util.Random;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException, InterruptedException {
        JDA jda = JDABuilder
                .createDefault("NzYxOTk5ODMyOTk4NzM5OTg4.X3ixpQ.tCb-z459FaEzhdv5Yhmk7lw5Q3A")
                .addEventListeners(new EconomyCommands(),new MiscCommands())
                .setActivity(Activity.listening("bop bop bop | -help"))
                .build().awaitReady();

        }
    }
