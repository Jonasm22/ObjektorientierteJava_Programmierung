import java.awt.*;

public class Tree {

    private double heightFt;
    private double trunkDiameterInches;
    TreeType treeType;

    static Color TRUNK_COLOR = new Color(102,51, 0);

    public Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    public  double getHeightFt(){
        return heightFt;
    }

    public  double getTrunkDiameterInches(){
        return trunkDiameterInches;
    }

    public void setTrunkDiameterInches(double trunkDiameterInches) {
        this.trunkDiameterInches = trunkDiameterInches;
    }

    public TreeType getTreeType(){
        return treeType;
    }

    public void grow(){
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches +1;
    }

   public static void announceTree(){
        System.out.println("Look out for that  "
        + TRUNK_COLOR + " Tree");
    }



    public void annunceTallTree(){
        if(this.heightFt > 100){
            System.out.println("That's a tall tree! " + this.treeType + " tree" );
        }

    }
}
