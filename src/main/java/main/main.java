package main;

import javax.security.auth.login.LoginException;

import botCommands.BotInfoCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class main {

	public static void main(String[] args) throws LoginException, InterruptedException   {
		JDA jda = JDABuilder.createLight("NzU3NTE3MzcwNjE2MTg0ODgz.X2hjBw.8LiNEOIal9L3cihSBB-BrCLD_z0", GatewayIntent.GUILD_MESSAGES,
				GatewayIntent.GUILD_MESSAGE_TYPING).setStatus(OnlineStatus.DO_NOT_DISTURB).build();

		
		
		jda.addEventListener(BotInfoCommand.class);	
	}

}
