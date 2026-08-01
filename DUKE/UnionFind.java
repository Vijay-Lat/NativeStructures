
public class UnionFind {

    private int[] intAtt;

    public UnionFind(int n) {
        intAtt = new int[n];
        for (int i = 0; i < intAtt.length; i++) {
            intAtt[i] = i;
        }
    }

    public boolean isConnected(int fId, int sId) {
        // for (int i = 0; i < intAtt.length; i++) {
        var a = intAtt[fId];
        var b = intAtt[sId];
        return a == b;
        // }
    }

    public void union(int firstIndex, int secondIndex) {
        for (int i = 0; i < intAtt.length; i++) {
            var firstIndexValue = intAtt[firstIndex];
            var secondIndexValue = intAtt[secondIndex];
            var isConnected = isConnected(firstIndex, secondIndex);
            if (isConnected) {
                // System.out.println(Arrays.toString(intAtt));
            } else if (intAtt[i] == firstIndexValue) {
                intAtt[i] = secondIndexValue;
            }

        }
    }

}
