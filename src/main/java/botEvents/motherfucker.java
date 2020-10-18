package botEvents;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class motherfucker extends ListenerAdapter{
		@Override
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			// TODO Auto-generated method stub
			super.onGuildMessageReceived(event);
			TextChannel channelEvent = event.getChannel();
			channelEvent.sendMessage("3").complete();
		
		
		
		}
}
