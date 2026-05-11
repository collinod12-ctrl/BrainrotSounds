package com.brainrotsounds;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("fahhh")
public interface BrainrotSoundsConfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greeting",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}

	@ConfigSection(
			name = "General Announcement Settings",
			description = "Settings for other details when various brainrot sounds play.",
			position = 40
	)

	String SECTION_GENERAL_ANNOUNCEMENT_SETTINGS = "General Announcement Settings";

	@ConfigItem(
			keyName = "announcementVolume",
			name = "Announcement volume",
			description = "Adjust how loud the audio announcements are played!",
			section = SECTION_GENERAL_ANNOUNCEMENT_SETTINGS,
			position = 42
	)
	default int announcementVolume() {
		return 100;
	}
}
