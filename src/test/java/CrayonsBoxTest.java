import org.junit.jupiter.api.Test;

import java.util.List;


public class CrayonsBoxTest {

    @Test
    public void shouldAllCrayonsBeTakenInRightOrder() {
        List<CrayonsType> crayonsTypes = prepareCrayonsType();
        CrayonsBox crayonsBox = new CrayonsBox(crayonsTypes);
        crayonsBox.printAllCrayons();
    }

    private List<CrayonsType> prepareCrayonsType() {
        List<Crayon> blueCrayons = getBlueCrayons();
        List<Crayon> greenCrayons = getGreenCrayons();
        List<Crayon> redCrayons = getRedCrayons();
        List<Crayon> yellowCrayons = getYellowCrayons();
        List<Crayon> greyCrayons = getGreyCrayons();
        List<Crayon> brownCrayons = getBrownCrayons();
        return List.of(new CrayonsType(blueCrayons), new CrayonsType(greenCrayons)
                , new CrayonsType(redCrayons), new CrayonsType(yellowCrayons),
                new CrayonsType(greyCrayons), new CrayonsType(brownCrayons));
    }

    private List<Crayon> getBlueCrayons() {
        return List.of(new Crayon("Blue1"), new Crayon("Blue2"),
                new Crayon("Blue3"), new Crayon("Blue4"));
    }

    private List<Crayon> getGreenCrayons() {
        return List.of(new Crayon("Green1"), new Crayon("Green2"),
                new Crayon("Green3"), new Crayon("Green4"));
    }

    private List<Crayon> getRedCrayons() {
        return List.of(new Crayon("Red1"), new Crayon("Red2"),
                new Crayon("Red3"), new Crayon("Red4"));
    }

    private List<Crayon> getYellowCrayons() {
        return List.of(new Crayon("Yellow1"), new Crayon("Yellow2"),
                new Crayon("Yellow3"), new Crayon("Yellow4"));
    }

    private List<Crayon> getGreyCrayons() {
        return List.of(new Crayon("Grey1"), new Crayon("Grey2"),
                new Crayon("Grey3"), new Crayon("Grey4"));
    }

    private List<Crayon> getBrownCrayons() {
        return List.of(new Crayon("Brown1"), new Crayon("Brown2"),
                new Crayon("Brown3"), new Crayon("Brown4"));
    }
}