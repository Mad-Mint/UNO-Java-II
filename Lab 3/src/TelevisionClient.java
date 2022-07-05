/**
 * Client class.
 *
 * @author Agatha Owora
 * @see Television
 */
public class TelevisionClient {
    /**
     * Main method.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.setOn(true);
        tv1.setChannel(9);
        tv1.channelUp();
        tv1.channelUp();
        tv1.setVolume(2);
        tv1.volumeDown();
        tv1.volumeDown();
        tv1.volumeDown();
        tv1.volumeUp();
        tv1.volumeUp();
        System.out.println(tv1.details()); // TV details: Channel = 10, Volume = 3

        Television tv2 = new Television();
        for (int i = 0; i < 3; i++) {
            tv2.volumeUp();
        }
        for (int i = 0; i < 3; i++) {
            tv2.channelDown();
        }
        System.out.println(tv2.details()); // TV details: TV is off, Channel = 1, Volume = 1
    }
}