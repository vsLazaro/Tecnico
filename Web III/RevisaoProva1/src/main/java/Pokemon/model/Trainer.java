package Pokemon.model;

import Pokemon.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int level;
    private String team;
    protected List<Pokemon> squad;

    public Trainer(String name, int level, String team) {
        this.name = name;
        this.level = level;
        this.team = team;
        this.squad = new ArrayList<Pokemon>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
