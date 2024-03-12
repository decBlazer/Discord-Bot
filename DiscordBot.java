package us.blaise.DiscordMusicBot;

import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.requests.*;
import net.dv8tion.jda.api.utils.cache.*;

import javax.security.auth.login.*;
import java.util.*;

public class DiscordBot {

    public static final GatewayIntent[] INTENTS = {GatewayIntent.DIRECT_MESSAGES,
            GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MESSAGE_REACTIONS,
            GatewayIntent.GUILD_VOICE_STATES, GatewayIntent.GUILD_MEMBERS,
            GatewayIntent.GUILD_PRESENCES};

    public static void main(String[] args) {


        PrivateDiscordToken privateToken = new PrivateDiscordToken();
        String token = privateToken.getDiscordToken();
        JDA jda = JDABuilder.create(token, Arrays.asList(INTENTS))
                .enableCache(CacheFlag.VOICE_STATE)
                .setActivity(Activity.playing("Bot"))
                .setStatus(OnlineStatus.ONLINE)
                .build();
    }
}
