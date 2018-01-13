package de.gost0r.pickupbot.pickup;

public class Config {

	public static final String CMD_QUIT					= "!quit" ;

	public static final String CMD_ADD					= "!add";
	public static final String CMD_REMOVE				= "!remove";
	public static final String CMD_MAPS					= "!maps";
	public static final String CMD_MAP					= "!map";
	public static final String CMD_PW					= "!lostpass";
	//public static final String CMD_GAMEOVER			= "!gameover";
	public static final String CMD_STATUS				= "!status";
	public static final String CMD_HELP					= "!help";
	//public static final String CMD_RING				= "!ring";
	
	public static final String CMD_LOCK					= "!lock";
	public static final String CMD_UNLOCK				= "!unlock";
	public static final String CMD_RESET				= "!reset";
	public static final String CMD_GETDATA				= "!getdata";
	public static final String CMD_ENABLEMAP			= "!enablemap";
	public static final String CMD_DISABLEMAP			= "!disablemap";
	public static final String CMD_SETSERVER			= "!setserver";
	public static final String CMD_SETRCON				= "!setrcon";
	public static final String CMD_RCON					= "!rcon";
	
	public static final String CMD_REGISTER				= "!register";
	public static final String CMD_GETELO				= "!elo";
	public static final String CMD_TOP5					= "!top5";
	
	//public static final String CMD_REPORT				= "!report";
	//public static final String CMD_EXCUSE				= "!excuse";
	//public static final String CMD_REPORTLIST			= "!reportlist";
	
	//public static final String CMD_ADDBAN				= "!addban";
	//public static final String CMD_REMOVEBAN			= "!removeban";

	public static final String CMD_SHOWSERVERS			= "!showservers";
	public static final String CMD_ADDSERVER			= "!addserver";
	public static final String CMD_REMOVESERVER			= "!removeserver";
	
	public static final String CMD_ENABLEDEBUG			= "!enabledebug";
	public static final String CMD_DISABLEDEBUG			= "!disabledebug";

	public static final String PUB_LIST = "" + CMD_ADD + " " + CMD_REMOVE + " " + CMD_MAPS + " "
	+ CMD_MAP + " " + CMD_PW + " " + CMD_STATUS + " " + CMD_HELP /*+ " " + CMD_RING */
	+ " " + CMD_REGISTER + " " + CMD_GETELO + " " + CMD_TOP5;
	
	public static final String PRV_LIST = "" + CMD_LOCK + " " + CMD_UNLOCK + " " + CMD_RESET + " " + CMD_GETDATA + " "
	+ CMD_ENABLEMAP + " " + CMD_DISABLEMAP + " " + CMD_SETSERVER + " " + CMD_SETRCON + " " + CMD_SHOWSERVERS
	+ " " + CMD_ADDSERVER + " " + CMD_REMOVESERVER;
		
//------------------------------------------------------------------------------------//
	
	public static final String USE_CMD_QUIT				= "!quit" ;

	public static final String USE_CMD_ADD				= "!add <gametype>";
	public static final String USE_CMD_REMOVE			= "!remove";
	public static final String USE_CMD_MAPS				= "!maps";
	public static final String USE_CMD_MAP				= "!map <mapname>";
	public static final String USE_CMD_PW				= "!lostpass";
	public static final String USE_CMD_STATUS			= "!status";
	public static final String USE_CMD_HELP				= "!help <command>";
	
	public static final String USE_CMD_LOCK				= "!lock";
	public static final String USE_CMD_UNLOCK			= "!unlock";
	public static final String USE_CMD_RESET			= "!reset <all/cur/id>";
	public static final String USE_CMD_GETDATA			= "!getdata <id>";
	public static final String USE_CMD_ENABLEMAP		= "!enablemap <ut4_map>";
	public static final String USE_CMD_DISABLEMAP		= "!disablemap <ut4_map>";
	public static final String USE_CMD_SETSERVER		= "!setserver <id> <ip:port>";
	public static final String USE_CMD_SETRCON			= "!setrcon <id> <rcon>";
	public static final String USE_CMD_RCON				= "!rcon <rconstring>";
	
	public static final String USE_CMD_REGISTER			= "!register <urtauth>";
	public static final String USE_CMD_GETELO			= "!elo </urtauth/>";
	public static final String USE_CMD_TOP5				= "!top5";
	
	//public static final String USE_CMD_REPORT			= "!report <qauth> <reason>";
	//public static final String USE_CMD_EXCUSE			= "!excuse <excuse>";
	//public static final String USE_CMD_REPORTLIST		= "!reportlist";
	
	//public static final String USE_CMD_ADDBAN			= "!addban <urtauth>";
	//public static final String USE_CMD_REMOVEBAN		= "!removeban <urtauth>";

	public static final String USE_CMD_SHOWSERVERS		= "!showservers";
	public static final String USE_CMD_ADDSERVER		= "!addserver <ip:port> <rcon>";
	public static final String USE_CMD_REMOVESERVER		= "!removeserver <id>";
	
	public static final String USE_CMD_ENABLEDEBUG		= "!enabledebug";
	public static final String USE_CMD_DISABLEDEBUG		= "!disabledebug";

	public static final String pkup_help				= "CMDs are !add !remove !status !map !maps !lostpass !gameover !ring";
	public static final String pkup_lock				= "This game is currently locked";
	public static final String pkup_map					= "Map was successfully voted.";
	public static final String pkup_signup				= "You can sign up again!";
	public static final String pkup_pw					= "[ /connect .server. ; password .password. ]";
	public static final String pkup_status0				= "Nobody has signed up. Type !add to play.";
	public static final String pkup_status1				= "Sign up: [.playernumber./10] Type !status to see who's signed up.";
	public static final String pkup_status2				= "Players [.playernumber./10]: .playerlist.";
	public static final String pkup_started				= "Game has already started. .status. - .time. minutes in.";
	public static final String pkup_go_admin			= "[ Pickup-pro Game #.gamenumber. ][ Password: .password. ][ Map: .map. ][ ELO red: .elored. ELO blue: .eloblue. ]";
	public static final String pkup_go_player			= "Pickup-pro starts now! Connect to the server and join Team .team. in order to play. Make up positions and ready up! [ /connect .server. ; password .password. ]";
	public static final String pkup_go_pub_head			= "Pickup-pro #.gamenumber. (ELO: .elo.) is about to start!";
	public static final String pkup_go_pub_red			= "Red team: .playerlist.";
	public static final String pkup_go_pub_blue			= "Blue team: .playerlist.";
	public static final String pkup_go_pub_map			= "Map: .map.";
	public static final String pkup_go_pub_calm			= "Be patient when receiving the server address and password. It may take several seconds.";
	public static final String pkup_go_pub_lostpw		= "The messages have been sent. You didn't receive it? Type !lostpass";
	public static final String pkup_sign				= "You can sign up again.";
	public static final String pkup_ring_added			= "You have been added to the ringerlist.";
	public static final String pkup_ring_removed		= "You have been removed from the ringerlist.";
	
	public static final String pkup_aftermath			= ".team. team .result. (.score.) - .player1. .elochange1., .player2. .elochange2., .player3. .elochange3., .player4. .elochange4., .player5. .elochange5.,";
	
	public static final String pkup_getelo				= "ELO .urtauth.: .elo. (.elochange.)";
	public static final String pkup_top5				= "#.rank. - .urtauth.: ELO: .elo. (.elochange.)";
			 
	public static final String is_banned				= "You are banned from using this function.";
	public static final String map_not_found			= "Map not found.";
	public static final String map_not_unique			= "Mapstring not unique.";
	public static final String map_already_voted		= "You have already voted.";
	public static final String not_registered			= "You have to register your account before. !register <urtauth>";
	public static final String ring_signup_going		= "Currently no ringer is needed, but you can add for a match.";

	public static final String player_not_found			= "Player not found.";
	public static final String user_not_authed			= "You're not authed with QuakeNet.";
	public static final String user_not_registered		= "You're not registered. Please use " + USE_CMD_REGISTER;

	public static final String auth_taken				= "Your auth has been already registered with another account.";
	public static final String auth_invalid				= "Your urtauth seems to be invalid.";
	public static final String auth_success				= "Your auth has been successfully registered with your account.";

	public static final String report_wrong_arg			= "Your report reason is invalid, check !reportlist to check the list.";
	public static final String report_invalid_urtauth	= "No player could be found to the specific urtauth.";
	public static final String report_not_played		= "The reported player hasn't played the past match.";
	public static final String report_didnt_play		= "You haven't played the last match, you aren't able to report someone.";
	public static final String report_already_reported	= "This player has already been reported by you.";
	public static final String report_successful		= "Your report was successfully stored.";
	public static final String report_raise_issue		= ".urtauth. has been auto-banned. [strength: .strength.] Type !review .urtauth. to review the ban.";

	public static final String wrong_argument_amount	= "Wrong amount of arguments: ";
	public static final String help_prefix				= "How to use the command: ";
	public static final String help_cmd_avi				= "These commands are available (use !help <!command> for more info): ";

	public static final String lock_enable				= "Game is now locked";
	public static final String lock_disable				= "Game is now unlocked";
}