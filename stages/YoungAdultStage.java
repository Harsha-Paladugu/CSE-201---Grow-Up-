
public class YoungAdultStage {

	public static void playYoungAdultStage(Player player) {

		boolean dropped = false;
		boolean kickedOut = false;
		boolean applied = false;
		boolean inCollege = false;
		boolean highGrad = false;
		boolean collegeGrad = false;
		boolean house = false;
		boolean wFriend = false;
		int limit = 1000;

		// Start getting into college event
		Main.positiveStats = Control.setStatArray(limit, 0, 20, 10, -50);
		Main.negativeStats = Control.setStatArray(1, 0, -10, -5, 0); // amount to change age, athletics, education, karma, money.

		if (player.education.getStatValue() > 50) { // if smart enough run event
			Control.choiceEventHandler("You are smart enough to apply for colleges!", // Initial message
					"Would you like to apply for college?", // Prompt yes or no
					"Congratualtion! You got into your dream college!", // Message if yes
					Main.positiveStats, // stat changes if yes
					"You did not apply for colleges...", // Message if no
					Main.negativeStats, // Stat changes if no
					player); 
		}

		if (player.age.getStatValue() > limit) {
			applied = true; // If they put yes then applied is true
			player.age.changeStat(-999); // Change age stat back to normal
		} // end getting into college event

		// Starting drop out event
		Main.positiveStats = Control.setStatArray(limit, 0, -50, -10, 0);  //decrease karma and education
		Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 0); // increase education and karma

		Control.choiceEventHandler("School seems to be getting to you...", // Initial message
				"Would you like to drop out of high school?", // Prompt yes or no
				"You are now a high school drop out", // Message if Yes
				Main.positiveStats, // stat changes if yes
				"You continue to push through to graduation!", // Message if no
				Main.negativeStats, // Stat changes if no
				player);

		if (player.age.getStatValue() >= limit) {
			dropped = true;
			player.age.changeStat(-999);
		} // end high school drop out event

		// starting graduation test event
		Main.positiveStats = Control.setStatArray(1, 0, limit, 0, 0); // increase education for counting
		Main.negativeStats = Control.setStatArray(1, 0, -5, 0, 0); // decrease education

		if (!dropped) { // if the player did not drop out of highschool
			int tests = 0; // test counter to determine if graduating
			int smarts = player.education.getStatValue(); // variable for players education

			Control.customEventHandler("It's finals week!! The subject is math!", // Initial message
					"What is the result of (5/6) × (3/4) ÷ (2/3) simplified?'", // Prompt for answer
					"15/16", // The answer
					"Yes! You passed!", // Message if correct
					Main.positiveStats, // stat changes if correct
					"No! You failed!", // Message if incorrect
					Main.negativeStats, // stat changes if incorrect
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			}

			Control.customEventHandler("After a riveting math final, you walk into science to take your final", // Initial message
					"What is the chemical formula for water?", // Prompt for answer
					"H2O", // The answer
					"Yes! You passed", // Message if correct
					Main.positiveStats, // stat changes if correct
					"No! You failed", // Message if incorrect
					Main.negativeStats, // stat changes if incorrect
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			}

			Control.customEventHandler(
					"Now that the two harder subjects are finished, you walk into history one last time", // Initial message
					"What year was the Declaration of Independence signed?'", // Prompt for answer
					"1776", // The answer
					"Yes! You passed", // Message if correct
					Main.positiveStats, // stat changes if correct
					"No! You failed!", // Message if incorrect
					Main.negativeStats, // stat changes if incorrect
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			}

			Control.customEventHandler("It's the home stretch! ONE MORE FINAL!!!! Which happens to be English", // Initial message
					"What is the verb in this sentence? 'The dog is running.'",  // Prompt for answer
					"running", // The answer
					"Yes! You passed", // Message if correct
					Main.positiveStats, // stat changes if correct
					"No! You failed!", // Message if incorrect
					Main.negativeStats, // stat changes if incorrect
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			} // end graduation text event

			if (tests == 0) { // if none passed then player is not a high school grad
				System.out.println("You didn't pass any of your finals... so uh.. you did not graduate");
				dropped = true;
			} else if (tests >= 2) { // give diploma if enough tests passed
				Control.Print("Congratulations!! Here is your diploma");
				System.out.println("  /-------------------------------------------------\\");
				System.out.println(" /                     DIPLOMA                       \\");
				System.out.println("/-----------------------------------------------------\\");
				System.out.println("|                                                     |");
				System.out.println("|                       YOU                           |");
				System.out.println("|                                                     |");
				System.out.println("|       have successfully completed the program       |");
				System.out.println("|               Grow Up! High School                  |");
				System.out.println("|                                                     |");
				System.out.println("|                 CONGRATULATIONS!                    |");
				System.out.println("\\----------------------------------------------------/");
				System.out.println(" ");
				highGrad = true;
			} else if (tests == 1) {
				Control.Print("Well... you only passed one of your finals... so I guess you can graduate");
				System.out.println("  /-------------------------------------------------\\");
				System.out.println(" /                     DIPLOMA                       \\");
				System.out.println("/-----------------------------------------------------\\");
				System.out.println("|                                                     |");
				System.out.println("|                       YOU                           |");
				System.out.println("|                                                     |");
				System.out.println("|       have successfully completed the program       |");
				System.out.println("|               Grow Up! High School                  |");
				System.out.println("|                                                     |");
				System.out.println("|                 CONGRATULATIONS!                    |");
				System.out.println("\\----------------------------------------------------/");
				System.out.println(" ");
				highGrad = true;
			}
		}
		
		Control.Print(("Starting Young Adulthood"));

		// starting college admissions event
		Main.positiveStats = Control.setStatArray(limit, 0, 0, 100, -100); // increase karma and decrease money
		Main.negativeStats = Control.setStatArray(1, 0, 0, -5, 100); // increase money and decrease karma

		if (dropped) {
			Control.Print("Since you did not graduate highschool, you are now a janitor");
			player.money.changeStat(100); // paycheck for janitor
		} else if (highGrad && !applied) {
			Control.Print(("So you graduated highschool, but you aren't going to college... so you are now a janitor"));
		} else if (applied) {
			// start college admissions event
			Control.choiceEventHandler("Earlier you got into your dream college", // Initial message
					"Do you accept the admissions offer?", // Prompt yes or no
					"You will be attending college!", // Message if Yes
					Main.positiveStats, // Stat changes if yes
					"That is ok!, college is not for everyone, but you are now a janitor", // Message if no
					Main.negativeStats, // Stat changes if no
					player);
		}

		if (player.age.getStatValue() > limit) {
			inCollege = true;
			player.age.changeStat(-limit + 1);
		} // end college admissions event

		/*
		 * 
		 * SCENARIO IF DROPPED OUT OF HIGH SCHOOL
		 * 
		 */
	
		if (dropped) {

			// kicked out event
			Main.positiveStats = Control.setStatArray(1, 0, 0, 10, -25);
			Main.negativeStats = Control.setStatArray(limit, 0, 0, -10, 0);

			Control.Print("You're parents are extremely disappointed in you...");
			Control.choiceEventHandler("They confront you about dropping out of highschool and being a janitor", // Initial message
					"They ask you if you will shapen up and get a new job?", // Prompt yes or no
					"They hug you then tell you they love you and only want what is best for you",  // Message if Yes
					Main.positiveStats, // stat changes if yes
					"They scowl at your defiance and tell you to pack your stuff and get out of their house!", // Message if no
					Main.negativeStats, // Stat changes if no
					player);

			if (player.age.getStatValue() > limit) {
				kickedOut = true;
				player.age.changeStat(-limit + 1);
			} // end kicked out event

			/*
			 * IF NOT KICKED OUT SCENARIO
			 */
			
			if (!kickedOut) {
				Control.Print("You walk to your room and sigh a breath of relief");
				Control.Print("You decide to go on a walk to try to figure something out");

				Main.positiveStats = Control.setStatArray(limit, 0, -25, -20, -100);
				Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 0);

				// start drug event
				Control.choiceEventHandler(
						"You stumble upon an alleyway where you see 4 people.\n They stop you by yelling 'HEY YOU'", // Initial message
						"They ask if you want to try something (yes/no)", // Prompt yes or no 
						"They smile and you follow them to a house", // Message if Yes
						Main.positiveStats, // stat changes if yes
						"They scoff at you and you walk away", // Message if no
						Main.negativeStats, // Stat changes if no
						player);
				if (player.age.getStatValue() > 1000) {
					Main.positiveStats = Control.setStatArray(-999, 0, 0, -20, -limit);
					Main.negativeStats = Control.setStatArray(-999, 0, 0, 5, 0);
					Control.choiceEventHandler("You follow them in and they pull out a bag of pills", // Initial message
							"Will you take their offer?", // Prompt yes or no
							"You took the pill and you hallucinated, threw up, broke your wrist, passed out, and somehow lost your wallet", // Message if Yes
							Main.positiveStats, // stat changes if yes
							"You run out of the house and did not lose anything", // Message if no
							Main.negativeStats, // Stat changes if no
							player);
					// start another kick out event
					if (player.money.getStatValue() < 0) {
						Control.Print("You run back into your house and your parents look at you in distraught");
						Control.choiceEventHandler("They ask you what happened?", // Initial message
								"Do you tell them the truth?", // Prompt yes or no
								"You can practically see the steam coming out of their ears", // Message if Yes
								Main.positiveStats, // stat changes if yes
								"They don't believe you and pressure you until you tell them the truth", // Message if no
								Main.negativeStats, // Stat changes if no
								player);
						Control.Print(
								"Your parents tell you to pack all of your stuff and leave the house immediately");
						kickedOut = true;
					}
				}
			} // end kicked out and drug event

			if (kickedOut) {
				// Messages to friend after kicked out
				Control.Print("With just two trash bags of stuff you leave your house");
				Control.Print("You call your old bestfriend and ask to crash on their couch for a while");
				if (player.karma.getStatValue() > 50) { // if karma is good enough then you will stay at your friends
					Control.Print("They answer and say 'Yes, we need to catch up anyway'");
					wFriend = true;
				} else // if karma is low then you will not stay at your friends
					Control.Print("The call immediately goes to voice mail");
			}

			if (wFriend) {
				Control.Print("You have been staying with your friend for a while.");
				Control.Print("You seem to be getting back on your feet!");
			} else {
				Control.Print(
						"You are walking down the streets until you find a nice comfy park bench to take a break on");
				Control.Print("You suddenly see a flyer for house-sitting.");
				Control.Print("You immediatly call the number and they offer you the spot for 6 months");
				Control.Print("You jump for joy!");
				house = true;
			}

			if (house) {
				Main.positiveStats = Control.setStatArray(1, 0, 0, -15, 0);
				Main.negativeStats = Control.setStatArray(1, 0, 0, 25, 0);

				Control.Print("You walk to the house to see a wooden shack.");
				Control.Print("You think to yourself 'I guess it is better than sleeping without a roof'");
				Control.Print("As you walk in a mouse runs around the home");
				Control.choiceEventHandler("You hate mice, but this mouse is different", // Initial message
						"Would you like to set a mouse trap?", // Prompt yes or no
						"You set a mouse trap and by next morning you find it stuck and all alone.... dying", // Message if Yes
						Main.positiveStats,  // stat changes if yes
						"You set the mouse outside and watch it run off to its family!", // Message if no
						Main.negativeStats, // Stat changes if no
						player);

				Main.positiveStats = Control.setStatArray(limit, 0, -25, -20, -20);
				Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 0);

				Control.choiceEventHandler(
						"You stumble upon an alleyway where you see 4 people."
						+ "\n They stop you by yelling 'HEY YOU'", // Initial message
						"They ask if you want to try something (yes/no)", // Prompt yes or no
						"They smile and you follow them to a house", // Message if Yes
						Main.positiveStats,  // stat changes if yes
						"They scoff at you and you walk away", // Message if no
						Main.negativeStats, // Stat changes if no
						player);
				
				if (player.age.getStatValue() > 1000) {
					Main.positiveStats = Control.setStatArray(-999, 0, 0, -20, -limit);
					Main.negativeStats = Control.setStatArray(-999, 0, 0, 15, 0);
					Control.choiceEventHandler("You follow them in and they pull out a bag of pills", // Initial message
							"Will you take their offer?", // Prompt yes or no
							"You took the pill and you hallucinated, threw up, broke your wrist, passed out, and somehow lost your wallet", // Message if Yes
							Main.positiveStats, // stat changes if yes 
							"You run out of the house and did not lose anything", // Message if no
							Main.negativeStats, // Stat changes if no
							player);
				}
			}
		}

		Main.positiveStats = Control.setStatArray(limit, 0, -25, -20, 200);
		Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 0);

		if (highGrad && !inCollege || kickedOut) {
			Control.Print("Well here you are... back in highschool");
			Control.Print("But this time as the school janitor");
			Control.Print(
					"As you start to empty the trash, you find a scratch off ticket that has not been scratched yet");
			Control.choiceEventHandler(
					"Although the principal told you to turn anything that could have value into him", // Initial message
					"Will you take it?",  // Prompt yes or no
					"You start to scratch it off...",  // Message if Yes
					Main.positiveStats, // stat changes if yes
					"You decide to return it to the principal and they give you a proud smile.", // Message if no
					Main.negativeStats, // Stat changes if no
					player);
		
		if (player.age.getStatValue() > limit) {
			player.age.changeStat(-limit + 1);
			Control.Print("You see one disco ball...then another...and finally......the principal watching you with a frown on their face");
			Control.Print("They make you hand it over");
			Control.Print("and now you will never know");
		}
		
		Control.Print("The next day");
		
		Main.positiveStats = Control.setStatArray(limit, 0, -25, -20, -10);
		Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 0);

		Control.choiceEventHandler(
				"You stumble upon an alleyway where you see 4 people." // Initial message
				+ "\n They stop you by yelling 'HEY YOU'",
				"They ask if you want to try something (yes/no)",  // Prompt yes or no
				"They smile and you follow them to a house", // Message if Yes
				Main.positiveStats, // stat changes if yes
				"They scoff at you and you walk away", // Message if no
				Main.negativeStats, // Stat changes if no
				player);
		
		if (player.age.getStatValue() > 1000) {
			Main.positiveStats = Control.setStatArray(-999, 0, 0, -20, -limit);
			Main.negativeStats = Control.setStatArray(-999, 0, 0, 5, 0);
			Control.choiceEventHandler("You follow them in and they pull out a bag of pills", // Initial message
					"Will you take their offer?", // Prompt yes or no
					"You took he pill and you hallucinated, threw up, broke your wrist, passed out, and somehow lost your wallet", // Message if Yes
					Main.positiveStats,  // stat changes if yes
					"You run out of the house and did not lose anything", // Message if no
					Main.negativeStats, // Stat changes if no
					player);
		}
		
		}
		
		/*
		 * ALL THINGS IN COLLEGE
		 */

		if (inCollege) {
			// start college sports event
			if (player.athletics.getStatValue() > 50 && inCollege) {

				Main.positiveStats = Control.setStatArray(1, 25, 0, 0, 50);
				Main.negativeStats = Control.setStatArray(1, -15, 0, 0, 0);

				Control.Print(
						"You have played sports all of your life!\n Coaches have been scouting you all throughout highschool.");
				Control.choiceEventHandler(
						"The coach at your college recognizes you and offers you a spot on the college team.", // Initial message
						"Will you accept?", // Prompt yes or no
						"You are now playing on the college sports team! They also are giving you a scholarship!", // Message if Yes
						Main.positiveStats, // stat changes if yes
						"You turn down his offer and the coach walks away with a sad face :(", // Message if no
						Main.negativeStats, // Stat changes if no
						player);
			}

			// starting cheating event
			Main.positiveStats = Control.setStatArray(1, 0, -25, -20, 0);
			Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 0);

			if (Event.eventOccuring(player, 100)) {

				Control.choiceEventHandler(
						"Your professor forgot to activate proctorio for your exam and you are struggling", // Initial message
						"Will you cheat?", // Prompt yes or no
						"You passed your test, but your professor asks to see you in office hours.... he caught you", // Message if Yes
						Main.positiveStats, // stat changes if yes
						"You passed!", // Message if no
						Main.negativeStats, // Stat changes if no
						player);
			}
			
			// start college party event
			Main.positiveStats = Control.setStatArray(limit, 0, -10, -10, 0);
			Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 50);
			
			Control.Print("You have a big exam tomorrow afternoon but you are not in the mood to study");
			Control.choiceEventHandler("You're scrolling on snapchat when you get a message from your friend", 
					"It reads 'do you want to go to a party tonight?'", 
					"Well... what the heck you have all morning tomorrow!",
					Main.positiveStats, 
					"You spend the night in your dorm studying for your exam the next day", 
					Main.negativeStats, 
					player);
			
			if (player.age.getStatValue() > limit) {
				player.age.changeStat(-limit + 1);
				
				Main.positiveStats = Control.setStatArray(limit, 0, -10, -10, 0);
				Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 50);
				
				Control.Print("You walk to the party, meeting up with your friend half way there");
				Control.choiceEventHandler("You guys get to the party and are immediately greeted with canned drink", 
						"Will you drink it?", 
						"You drink it and everyone starts yelling 'CHUG CHUG CHUG'"
						+ "\nThey also keep handing drinks to you"
						+ "\nAt some point you start to feel very dizzy and your feet take you to the dance floor", 
						Main.positiveStats, 
						"They call you lame and kick you out of the party", 
						Main.negativeStats, 
						player);
			}
		
			if (player.age.getStatValue() > limit) {
				player.age.changeStat(-limit + 1);
				
				Control.Print("You wake up the next morning on the roof of a house");
				Control.Print("You missed you exam...");
			}

			// starting college dropping event
			Main.positiveStats = Control.setStatArray(1, 0, -limit, -10, 0);
			Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 50);

			Control.choiceEventHandler("Your grades are dropping and someone ate your food out of the fridge!", // Initial message
					"Since you are at your breaking point would you like to drop out of college?", // Prompt yes or no
					"You are now a college drop out",  // Message if Yes
					Main.positiveStats, // stat changes if yes
					"Your grades get up! The person who ate your food got food poisoning", // Message if no
					Main.negativeStats, // Stat changes if no
					player);

			if (player.education.getStatValue() < 0)
				inCollege = false;

			// starting random drug event
			if (!Event.eventOccuring(player, 50)) {
				Main.positiveStats = Control.setStatArray(limit, 0, -25, -20, -10);
				Main.negativeStats = Control.setStatArray(1, 0, 10, 5, 0);

				Control.choiceEventHandler(
						"You stumble upon an alleyway where you see 4 people." // Initial message
						+ "\n They stop you by yelling 'HEY YOU'",
						"They ask if you want to try something, (yes or no)", // Prompt yes or no
						"They smile and you follow them to a house", // Message if Yes
						Main.positiveStats, // stat changes if yes
						"They scoff at you and you walk away", // Message if no
						Main.negativeStats, // Stat changes if no
						player);
				
				if (player.age.getStatValue() > 1000) {
					Main.positiveStats = Control.setStatArray(-999, 0, 0, -20, -limit);
					Main.negativeStats = Control.setStatArray(-999, 0, 0, 5, 0);
					Control.choiceEventHandler("You follow them in and they pull out a bag of pills", // Initial message
							"Will you take their offer?", // Prompt yes or no
							"You took he pill and you hallucinated, threw up, broke your wrist, passed out, and somehow lost your wallet", // Message if Yes
							Main.positiveStats, // stat changes if yes
							"You run out of the house and did not lose anything", // Message if no
							Main.negativeStats, // Stat changes if no
							player);
				}
			}
		}

		// starting college exams event
		Main.positiveStats = Control.setStatArray(1, 0, 10, 0, 0);
		Main.negativeStats = Control.setStatArray(1, 0, -30, 0, 0);

		if (inCollege) {
			int tests = 0;
			int smarts = player.education.getStatValue();

			Control.customEventHandler("It's your final finals week!! The subject is math!", // Initial message
					"What is sin^2(x) + cos^2(x)?'", // Prompt for answer
					"1", // The answer
					"You get your math test back and ....... you passed!", // Message if correct
					Main.positiveStats,  // stat changes if correct
					"You get your test math back and ....... you passed", // Message if incorrect
					Main.negativeStats, // stat changes if incorrect
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			}

			Control.customEventHandler("It's your final finals week!! The subject is science!", // Initial message
					"What is the formula for momentum? (no spaces)", // Prompt for answer
					"p=mv",// The answer
					"You get your science test back and ....... you passed!", // Message if correct
					Main.positiveStats, // stat changes if correct
					"You get your science test back and ....... you failed!", // Message if incorrect
					Main.negativeStats, 
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			}

			Control.customEventHandler("It's your final finals week!! The subject is history!", // Initial message
					"Who was the first president to be asassinated? (full name)'", // Prompt for answer
					"Abraham Lincoln", // The answer
					"You get your history test back and ....... you passed!", // Message if correct
					Main.positiveStats, // stat changes if correct
					"You get your history test back and ....... you failed!", // Message if incorrect
					Main.negativeStats, // stat changes if incorrect
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			}

			Control.customEventHandler("It's your final finals week!! The subject is english!", // Initial message
					"Who wrote 'Romeo and Juliet'?", // Prompt for answer
					"Shakespeare", // The answer
					"You get your english test back and ....... you passed!", // Message if correct 
					Main.positiveStats, // stat changes if correct
					"You get your english test back and ....... you failed!", // Message if incorrect
					Main.negativeStats, // stat changes if incorrect
					player);

			smarts = player.education.getStatValue(); // update variable

			if (smarts > limit) { // if smarts goes up then they passed
				tests++; // add 1
				player.education.changeStat(-limit + 1); // change education to regular
			}

			if (tests == 0) {
				System.out.println("You didn't pass any of your finals... so uh.. you did not graduate");
				inCollege = false;
			} else if (tests == 1) {
				Control.Print(
						"You only passed one of your finals... but luckily one of your professors curved the test!");
				Control.Print("This means you passed!");
				Control.Print("You walk awkwardly to grab your degree and trip down the stairs");
				System.out.println("******************************************");
				System.out.println("*                                        *");
				System.out.println("*            COLLEGE DEGREE              *");
				System.out.println("*                                        *");
				System.out.println("*          This certifies that           *");
				System.out.println("*                                        *");
				System.out.println("*                  YOU                   *");
				System.out.println("*                                        *");
				System.out.println("*   Have successfully completed the      *");
				System.out.println("*   requirements for the degree of:      *");
				System.out.println("*                                        *");
				System.out.println("*         	  SOMETHING!!	             *");
				System.out.println("*                                        *");
				System.out.println("*                                        *");
				System.out.println("*        Authorized Signature:           *");
				System.out.println("*          		TEAM B!      			 *");
				System.out.println("*                                        *");
				System.out.println("******************************************");
			} else if (tests >= 2) {
				Control.Print("Congratulations!! You can graduate from college");
				Control.Print("You walk confidently to get your degree");
				System.out.println("******************************************");
				System.out.println("*                                        *");
				System.out.println("*            COLLEGE DEGREE              *");
				System.out.println("*                                        *");
				System.out.println("*          This certifies that           *");
				System.out.println("*                                        *");
				System.out.println("*                  YOU                   *");
				System.out.println("*                                        *");
				System.out.println("*   Have successfully completed the      *");
				System.out.println("*   requirements for the degree of:      *");
				System.out.println("*                                        *");
				System.out.println("*         	  SOMETHING!!	             *");
				System.out.println("*                                        *");
				System.out.println("*                                        *");
				System.out.println("*        Authorized Signature:           *");
				System.out.println("*          		TEAM B!      			 *");
				System.out.println("*                                        *");
				System.out.println("******************************************");
			}

			System.out.println(" ");
			collegeGrad = true;
			inCollege = false;
		} // end college exams event

		/*
		 * END OF YOUNG ADULT MESSAGES
		 */
	
		if (collegeGrad) {
			Control.Print("You pack all of your things out of your college house... reminiscing on all the memories");
			Control.Print("As you drive away you wonder where you will go and what you will do");
		} else if (house) {
			Control.Print("You sit on the couch and a cloud of dust puffs up");
			Control.Print("As you swing your hand around to get it out of your face, you think to yourself...");
			Control.Print("How did I end up here? Now what...?");
		} else if (kickedOut && !wFriend) {
			Control.Print("Thank goodness your parents gave you another chance");
			Control.Print("You think to yourself 'I better not screw up this time...");
		} else if (wFriend) {
			Control.Print("Thank goodness your friend is letting you crash at their place");
			Control.Print("But they already seem to be getting tired of you");
			Control.Print("Hopefully you can turn things around soon");
		}
	}
}
