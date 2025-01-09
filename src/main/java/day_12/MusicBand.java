package day_12;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setMembers(List<String> membersNames) {
        members.addAll(membersNames);
    }

    public void removeMembers(String member) {
        members.remove(member);
    }

    public static void transferMembers(MusicBand band1, MusicBand band2){
        band2.setMembers(band1.members);
    }

    public void printMembers() {
        members.forEach(value -> System.out.print(value + ", "));
        System.out.println();
    }
}
