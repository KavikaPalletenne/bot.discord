package botCommands;

import java.awt.Color;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotInfoCommand extends ListenerAdapter {
			EmbedCommands embeds = new EmbedCommands();
			 

	
			@Override
			public void onMessageReceived(MessageReceivedEvent event) throws NullPointerException {
			super.onMessageReceived(event);
			MessageChannel channel = event.getChannel();
			String message = event.getMessage().getContentRaw();
			if(message.equalsIgnoreCase("!markdown")){
				channel.sendMessage(botCommands.EmbedCommands.texts(Color.BLACK, "Markdown Commands",
						"> Type the Following Command to know more", "```yml\n!bold\n!italic\n!underline```",
						true).build()).queue();
			}
				else if (message.equalsIgnoreCase("!bold")) {
					channel.sendMessage(botCommands.EmbedCommands.textsEmbedMessage(Color.PINK, "BOLD COMMAND", 
							"``` put '**' before and after your text```")
							.build()).queue();
				}
				else if (message.equalsIgnoreCase("!italic")) {
					channel.sendMessage(botCommands.EmbedCommands.textsEmbedMessage(Color.CYAN, "> ITALIC COMMAND", 
							"```put '* or _' before and after your text```")
							.build()).queue();
				}
			
				else if (message.equalsIgnoreCase("!underline")) {
					channel.sendMessage(botCommands.EmbedCommands.textsEmbedMessage(Color.DARK_GRAY, "> UNDERLINE COMMAND", 
							"```put  '__' before and after your text```")
							.build()).queue();
				}
			
			
}	
}
	
		

	






