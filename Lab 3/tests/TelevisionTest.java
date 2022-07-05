import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class containing unit tests for Television.java.
 *
 * @author Agatha Owora
 * @see Television
 */
class TelevisionTest {

    /**
     * Test the constructor.
     */
    @Test
    void testConstructor() {
        Television t = new Television();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());
    }

    /**
     * Test the setChannel method when the TV is off.
     * Test the setChannel method when the TV is off with a valid channel.
     * Test the setChannel method when the TV is off with an invalid channel.
     */
    @Test
    void testSetChannelOff() {
        Television t = new Television();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setChannel(5);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setChannel(0);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setChannel(11);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());
    }

    /**
     * Test the setChannel method when the TV is on.
     * Test the setChannel method when the TV is on with a valid channel.
     * Test the setChannel method when the TV is on with an invalid channel.
     */
    @Test
    void testSetChannelOn() {
        Television t = new Television();
        t.setOn(true);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setChannel(5);
        assertEquals(5, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setChannel(0);
        assertEquals(5, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setChannel(11);
        assertEquals(5, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());
    }

    /**
     * Test the setVolume method when the TV is off.
     * Test the setVolume method when the TV is off with a valid volume.
     * Test the setVolume method when the TV is off with an invalid volume.
     */
    @Test
    void testSetVolumeOff() {
        Television t = new Television();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setVolume(3);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setVolume(6);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setVolume(0);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

    }

    /**
     * Test the setVolume method when the TV is on.
     * Test the setVolume method when the TV is on with a valid volume.
     * Test the setVolume method when the TV is on with an invalid volume.
     */
    @Test
    void testSetVolumeOn() {
        Television t = new Television();
        t.setOn(true);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setVolume(3);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(3, t.getVolume());
        assertTrue(t.isOn());

        t.setVolume(6);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(3, t.getVolume());
        assertTrue(t.isOn());

        t.setVolume(0);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(3, t.getVolume());
        assertTrue(t.isOn());

    }


    /**
     * Test the channelUp method when the TV is off.
     */
    @Test
    void testChannelUpOff() {
        Television t = new Television();
        t.setChannel(2);
        t.channelUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setChannel(11);
        t.channelUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setChannel(0);
        t.channelUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

    }

    /**
     * Test the channelUp method when the TV is on.
     * Test the channelUp method when the TV is on and you have reached the max channel.
     */
    @Test
    void testChannelUpOn() {
        Television t = new Television();
        t.setOn(true);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.channelUp();
        assertEquals(2, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setChannel(Television.MAX_CHANNEL);
        t.channelUp();
        assertEquals(Television.MAX_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

    }

    /**
     * Test the channelDown method when the TV is off.
     */
    @Test
    void testChannelDownOff() {
        Television t = new Television();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.channelDown();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());
    }

    /**
     * Test the channelDown method when the TV is on.
     * Test the channelDown method when the TV is on and you have reached the min channel.
     */
    @Test
    void testChannelDownOn() {
        Television t = new Television();
        t.setOn(true);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setChannel(3);
        t.channelDown();
        assertEquals(2, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setChannel(Television.MIN_CHANNEL);
        t.channelDown();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

    }

    /**
     * Test the volumeUp method when the TV is off.
     */
    @Test
    void testVolumeUpOff() {
        Television t = new Television();
        t.setVolume(2);
        t.volumeUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setVolume(6);
        t.volumeUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setVolume(0);
        t.volumeUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

    }

    /**
     * Test the volumeUp method when the TV is on.
     * Test the volumeUp method when the TV is on and you have reached the max volume.
     */
    @Test
    void testVolumeUpOn() {
        Television t = new Television();
        t.setOn(true);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.volumeUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(2, t.getVolume());
        assertTrue(t.isOn());

        t.setVolume(Television.MAX_VOLUME);
        t.volumeUp();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MAX_VOLUME, t.getVolume());
        assertTrue(t.isOn());

    }


    /**
     * Test the volumeDown method when the TV is off.
     */
    @Test
    void testVolumeDownOff() {
        Television t = new Television();
        t.setVolume(2);
        t.volumeDown();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setVolume(6);
        t.volumeDown();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

        t.setVolume(0);
        t.volumeDown();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertFalse(t.isOn());

    }

    /**
     * Test the volumeDown method when the TV is on.
     * Test the volumeDown method when the TV is on and you have reached the min volume.
     */
    @Test
    void testVolumeDownOn() {
        Television t = new Television();
        t.setOn(true);
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

        t.setVolume(3);
        t.volumeDown();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(2, t.getVolume());
        assertTrue(t.isOn());

        t.setVolume(Television.MIN_VOLUME);
        t.volumeDown();
        assertEquals(Television.MIN_CHANNEL, t.getChannel());
        assertEquals(Television.MIN_VOLUME, t.getVolume());
        assertTrue(t.isOn());

    }

    /**
     * Test the details method when the TV is off and its channel and volume has been set to valid values.
     * Test the details method when the TV is on and its channel and volume has been set to valid values.
     * Test the details method when the TV is on and its channel and volume has been set to invalid values.
     */
    @Test
    void testDetails() {
        Television t = new Television();
        t.setChannel(2);
        t.setVolume(3);
        assertEquals("TV details: TV is off, Channel = 1, Volume = 1", t.details());

        t.setOn(true);
        t.setChannel(2);
        t.setVolume(3);
        assertEquals("TV details: Channel = 2, Volume = 3", t.details());

        t.setChannel(11);
        t.setVolume(6);
        assertEquals("TV details: Channel = 2, Volume = 3", t.details());
    }
}