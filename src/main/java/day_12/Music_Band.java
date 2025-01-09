package day_12;

import java.util.ArrayList;
import java.util.List;

public class Music_Band {
    private String band_name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();

    public Music_Band(String band_name, int year) {
        this.band_name = band_name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMembers(MusicArtist member) {
        members.add(member);
    }

    public void removeMembers(MusicArtist member) {
        members.remove(member);
    }

    public static void transferMembers(Music_Band band1, Music_Band band2) {
        for (MusicArtist artist : band1.members) {
            band2.setMembers(artist);
        }
    }

    public void printMembers() {
        System.out.print(this.band_name + ": ");
        members.forEach(value -> System.out.print("{" + value + "}, "));
        System.out.println();
    }
}
