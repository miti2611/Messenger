package org.mj.messenger.database;
//import java.util.*;

import java.util.*;//HashMap;
import org.mj.messenger.model.Message;
import org.mj.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profile = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return  messages;
	}
	public static Map<Long, Profile> getProfiles() {
		return  profile;
	}
}
