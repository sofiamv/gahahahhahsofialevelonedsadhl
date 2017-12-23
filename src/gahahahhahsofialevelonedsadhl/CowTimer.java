package gahahahhahsofialevelonedsadhl;

	import java.applet.AudioClip;
	import java.io.IOException;
	import javax.swing.JApplet;

	public class CowTimer {
		/*
		 * This is an advanced recipe. There may be more than one line of code for
		 * each instruction.
		 * Work in seconds when testing, then change to minutes
		 */

		public static void main(String[] args) throws InterruptedException {
			/* 1. Make a CowTimer, set the time and start it. */
			CowTimer awesome = new CowTimer();
			awesome.setTime(10);
			awesome.start();

		}

		private int minutes;

		public void setTime(int minutes) {
			this.minutes = minutes;
			System.out.println("Cow set to " + minutes + " minutes.");
		}

		public void start() throws InterruptedException {
			
			// * 2. Count down the minutes, print the current minute then sleep for 60
			// * seconds using Thread.sleep(int milliseconds).
			int i;
			for(i = minutes; i > 0; i--) {
			 System.out.println(i);
			 Thread.sleep(1000);
			}
			if(i==0) {
				playSound("53255__stomachache__cow.wav");
				Thread.sleep(5000);
				speak("It's time for a walk... mooo?!");
			}
			/*
			 * 3. When the timer is finished, use the playSound method to play a moo
			 * sound. You can download one from freesound.org, then drag it into
			 * your default package. Tell the students (by speaking) it's time to walk.
			 */

		}

		private void playSound(String fileName) {
			AudioClip sound = JApplet
					.newAudioClip(getClass().getResource(fileName));
			sound.play();
		}

	private void speak(String stuffToSay) {
			try {
				Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}


