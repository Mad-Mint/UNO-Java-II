/**
 * Class containing the logic to make a TV work.
 *
 * @author Agatha Owora
 */
public class Television {
    /**
     * The current TV channel.
     */
    private int channel;
    /**
     * The current TV volume level.
     */
    private int volume;
    /**
     * Indicates whether TV is on/off.
     */
    private boolean on;
    /**
     * Minimum channel number.
     */
    public static final int MIN_CHANNEL = 1;
    /**
     * Maximum channel number.
     */
    public static final int MAX_CHANNEL = 10;
    /**
     * Minimum volume level.
     */
    public static final int MIN_VOLUME = 1;
    /**
     * Maximum volume level.
     */
    public static final int MAX_VOLUME = 5;

    /**
     * Constructs a default TV object.
     * Default values: channel = minimum value, volume = minimum value, TV is off.
     */
    public Television() {
        channel = MIN_CHANNEL;
        volume = MIN_VOLUME;
        on = false;
    }

    /**
     * Method to get the current TV channel.
     *
     * @return current TV channel.
     */
    public int getChannel() {
        return channel;
    }

    /**
     * Sets a new channel for the TV.
     * The channel can only be adjusted when the TV is on and the range is valid.
     *
     * @param channel new TV channel.
     */
    public void setChannel(int channel) {
        if (on && (channel >= MIN_CHANNEL && channel <= MAX_CHANNEL))
            this.channel = channel;
    }

    /**
     * Method to get the current TV volume.
     *
     * @return current TV volume.
     */
    public int getVolume() {
        return volume;
    }

    /**
     * Sets a new volume level for this TV.
     * The volume can only be adjusted when the TV is on and the range is valid.
     *
     * @param volume new TV volume.
     */
    public void setVolume(int volume) {
        if (on && (volume >= MIN_VOLUME && volume <= MAX_VOLUME))
            this.volume = volume;
    }

    /**
     * Checks the TV status.
     *
     * @return false if the TV is off and true if the TV is on.
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Turns the TV on or off.
     *
     * @param on value to turn the TV on/off.
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Increases the TV channel number by 1.
     * Nothing happens when one goes beyond the maximum channel.
     */
    public void channelUp() {
        if (on && (channel < MAX_CHANNEL)) {
            channel++;
        }
    }


    /**
     * Decreases the TV channel number by 1.
     * Nothing happens when one goes below the minimum channel.
     */
    public void channelDown() {
        if (on && (channel > MIN_CHANNEL)) {
            channel--;
        }
    }

    /**
     * Increases the TV volume level by 1.
     * Nothing happens when one goes beyond the maximum volume.
     */
    public void volumeUp() {
        if (on && (volume < MAX_VOLUME)) {
            volume++;
        }
    }

    /**
     * Decreases the TV volume level by 1.
     * Nothing happens when one goes below the minimum volume.
     */
    public void volumeDown() {
        if (on && (volume > MIN_VOLUME)) {
            volume--;
        }
    }

    /**
     * Displays the state of the TV.
     * If the TV is on display output in the format <i>TV details: Channel = 5, Volume = 2</i>.
     * If the TV is off display output in the format <i>TV details: TV is off, Channel = 1, Volume = 1</i>.
     *
     * @return the channel and volume details of the TV.
     */
    public String details() {
        if (on)
            return "TV details: " + "Channel = " + this.getChannel() + ", Volume = " + this.getVolume();
        else
            return "TV details: TV is off, Channel = " + this.getChannel() + ", Volume = " + this.getVolume();
    }
}