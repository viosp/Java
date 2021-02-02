public class Main {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(goal > ((bigCount * 5) + smallCount)) {
            return false;
        }
        if((goal % 5) > smallCount) {
            return false;
        }
        return true;
    }
        //
        //bigCount represents the count of big flour bags (5kg each)
        //smallCount represents the count of small flour bags (1kg each)
        //goal represents the goal amount of kg of flour needed to assemble a package
        //
        // the sun of the kg of bigCount + smallCount must be at least equal to the value of goal
        // method should return true if it possible to make package with goal kg of flour
        //

}
