package audio;

public class AudioManager {
    private final RINGER_MODE mode = RINGER_MODE.RINGER_MODE_SILENT;
    private int volume = 50;

    public RINGER_MODE getRingerMode() {
        return mode;
    }

    public int getStreamMaxVolume() {
        return volume;
    }

    public void setStreamVolume(int max) {
        volume = max;
    }

    public void makeReallyLoad() {
        if (mode.equals(RINGER_MODE.RINGER_MODE_NORMAL)) {
            setStreamVolume(100);
        }
    }

}
