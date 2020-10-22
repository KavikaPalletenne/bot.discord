package botCommands.main;

import java.util.ArrayList;
import java.util.Collection;

import javax.security.auth.login.LoginException;

import botCommands.BotInfoCommand;
import botCommands.HiddenCommands.HiddenCommands;
import botCommands.botMemberJoin.MemberJoin;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class MainMethod {

	public static void main(String[] args) throws LoginException {
		Collection<GatewayIntent> intents = new ArrayList<GatewayIntent>();
			intents.add(GatewayIntent.GUILD_MEMBERS);
			intents.add(GatewayIntent.GUILD_MESSAGE_TYPING);
			intents.add(GatewayIntent.GUILD_MESSAGES);
		JDA jda = JDABuilder.createDefault("NzU3NTE3MzcwNjE2MTg0ODgz.X2hjBw.kVxpB1YsXEv_5iaxV9zzGMApu9c", intents).setStatus(OnlineStatus.DO_NOT_DISTURB).build();
		
		jda.addEventListener(new MemberJoin());
		jda.addEventListener(new BotInfoCommand());
		jda.addEventListener(new HiddenCommands());
	}

}
