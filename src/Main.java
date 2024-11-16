import java.awt.*;

public class Main {

    public static void main(String[] args) {

       Tree myFavoriteOKATree = new Tree(125,15,TreeType.OKA);
        myFavoriteOKATree.annunceTallTree();

        System.out.println(myFavoriteOKATree.getTreeType());
        System.out.println(myFavoriteOKATree.getHeightFt());
        System.out.println(myFavoriteOKATree.getTrunkDiameterInches());

        myFavoriteOKATree.grow();
/*
        Tree myFavoriteMapleTree = new Tree(90, 30,TreeType.MAPLE);

        myFavoriteMapleTree.annunceTallTree();

        System.out.println(Tree.TRUNK_COLOR);

        Tree.announceTree();

*/

        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color MyDefaultColor = Color.WHITE;
        Color MyDefaultBlue = Color.blue;


        Color brigtherBlue =MyDefaultBlue.brighter();

    }

}
