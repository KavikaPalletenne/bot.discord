package botCommands;

import java.awt.Color;
import net.dv8tion.jda.api.EmbedBuilder;

public class EmbedCommands {

		static EmbedBuilder embed = new EmbedBuilder();
	
		public static EmbedBuilder texts(Color color, String description, String name, String value, boolean inline) {
		embed.clearFields();
		return new EmbedBuilder(embed).setColor(color).setDescription(description).addField(name, value, inline);
		}
		
		public static EmbedBuilder textsEmbedMessage(Color color, String title, String description ) {
			embed.clearFields();
			return new EmbedBuilder(embed).setColor(color).setTitle(title).setDescription(description);
		
		}
		
		
		
		
 
}
