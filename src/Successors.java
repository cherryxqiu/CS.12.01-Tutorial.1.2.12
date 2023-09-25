public class Successors {

    public static Position findPosition (int a, int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                if (arr2D[i][j] == a) {
                    Position found = new Position(i, j);
                    return found;
                }
            }
        }

        return null;

    }


    public static Position[][] getSuccessorArray (int[][] arr2D) {
        Position[][] successorArray = new Position[arr2D.length][arr2D[0].length];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[0].length; j++) {
                int thisInt = arr2D[i][j];
                int successor = thisInt+1;
                for (int a = 0; a < arr2D.length; a++) {
                    for (int b = 0; b < arr2D[0].length; b++) {
                        if (arr2D[a][b] == successor) {
                            Position successorPosition = new Position(a,b);
                            successorArray[i][j]=successorPosition;
                        }

                    }
                }


            }
        }

        return successorArray;

    }



}