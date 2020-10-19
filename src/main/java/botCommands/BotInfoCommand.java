package botCommands;

import java.awt.Color;
import java.util.concurrent.RejectedExecutionException;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotInfoCommand extends ListenerAdapter {
		static EmbedBuilder embedBuilder;
		
			public void onMessageReceived(MessageReceivedEvent event) {
			super.onMessageReceived(event);
			String message = event.getMessage().getContentRaw();
			if(message.equalsIgnoreCase("!info")){
				try {
					embedBuilder.setAuthor("dsadsa");
					embedBuilder.setColor(Color.black);
					
					event.getChannel().sendMessage(embedBuilder.build()).queue();

				} catch (RejectedExecutionException e) {
					e.printStackTrace();
				}
							}
			
			System.out.println("wow working");
				
				
			
			
			
			
			
			}
					
	
			
				
					
					
				
				
		
		
		
		}

	






