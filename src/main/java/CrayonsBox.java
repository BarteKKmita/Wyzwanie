import java.util.List;

public class CrayonsBox {

    private final List<CrayonsType> crayonsTypes;

    public CrayonsBox(List<CrayonsType> crayonsTypes) {
        this.crayonsTypes = crayonsTypes;
    }

    void printAllCrayons(){
     crayonsTypes
     .forEach(crayonsType-> crayonsType.getCrayon()
             .forEach(crayon -> System.out.println(crayon.getColour())));
    }

}
