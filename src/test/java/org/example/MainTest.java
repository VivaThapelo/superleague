package org.example;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Optional;

import static org.junit.Assert.*;

public class MainTest
{
    @Test
    public void isResultCorrect() throws IOException {
        final InputStream original = System.in;
        final FileInputStream fileInputStream = new FileInputStream("src/test/java/org/example/TestData.txt");
        System.setIn(fileInputStream);
        Main.main(null);
        // Assertion of the correct response
        String expected = "1. Tarantulas, 6 pts\n" +
                "2. Lions, 5 pts\n" +
                "3. Snakes, 1 pts\n" +
                "3. FC Awesome, 1 pts\n" +
                "5. Grouches, 0 pts";
        assertEquals("Solution is Correct", expected,Main.returnSolution());
        System.setIn(original);
    }

    @Test
    public void teamExistOrCreateTeam(){
        // Tigers exists
        Main.leagueTable.put("Tigers",2);
        Main.addTeamToTable(new String[]{"Tigers","0"}, new String[]{"Cows","0"});
        // Is Table empty or Null
        assertNotNull("League table is not null",Main.leagueTable);
        assertFalse("League table is not Empty",Main.leagueTable.isEmpty());
        // Tigers must have existing value of 2, not changed to 0
        assertEquals("Correct value exists in the table",(Integer) 2, Main.leagueTable.get("Tigers"));
        // Cows must be Added and have value 0
        assertEquals("New entry exists in the table",(Integer) 2, Main.leagueTable.get("Tigers"));
    }

    @Test
    public void teamsInLeagueUpdated(){
        // create Teams
        Main.addTeamToTable(new String[]{"Pirates","0"},new String[]{"Chiefs","0"});
        Main.addTeamToTable(new String[]{"Sundowns","0"},new String[]{"Swallows","0"});
        // Update table with points
        Main.updateLeagueTable(new String[]{"Pirates","5"},new String[]{"Chiefs","0"});
        // Win/Lose test
        assertEquals("Winning team has 3 points",(Integer) 3, Main.leagueTable.get("Pirates"));
        assertEquals("Losing team has 0 points",(Integer) 0, Main.leagueTable.get("Chiefs"));
        // Draw test
        Main.updateLeagueTable(new String[]{"Sundowns","2"},new String[]{"Swallows","2"});
        // They have equal points for draw and That is 1 points
        assertTrue("Entry recorded as a 1 point draw for both teams",Objects.equals(Main.leagueTable.get("Sundowns"), Main.leagueTable.get("Swallows")) && Main.leagueTable.get("Sundowns")==1 && Main.leagueTable.get("Swallows")==1);
        assertEquals("Winning team has 3 points",(Integer) 3, Main.leagueTable.get("Pirates"));
    }
}
