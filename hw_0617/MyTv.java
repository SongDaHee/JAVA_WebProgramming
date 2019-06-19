package hw_0617;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	int prevchannel;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	int getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
	
	void setChannel(int channel) {
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL) {
			return;
		}
		else {
			prevchannel = this.channel;
			this.channel = channel;
		}
	}
	
	void setVolume(int volume) {
		if(volume < MIN_VOLUME || volume > MAX_VOLUME) {
			return;
		}
		else {
			this.volume = volume;
		}
	}
	
	void gotoPrevChannel() {
			int tmp = prevchannel;
			prevchannel = this.channel;
			this.channel = tmp;
		}
	}

