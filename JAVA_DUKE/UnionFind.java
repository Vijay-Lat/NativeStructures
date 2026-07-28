package JAVA_DUKE;

public class UnionFind {
    private int[] intAtt;

    public UnionFind(int n) {
        intAtt = new int[n];
    }

    public boolean isConnected(int fId, int sId) {
        // for (int i = 0; i < intAtt.length; i++) {
        var a = intAtt[fId];
        var b = intAtt[sId];
        System.out.println(a + "a");
        System.out.println(b + "b");

        return a == b;
        // }
    }

    public void union(int firstIndex, int secondIndex) {
        for (int i = 0; i < intAtt.length; i++) {
            var firstIndexValue = intAtt[firstIndex];
            var isConnected = isConnected(firstIndex,secondIndex);
            if(isConnected){
System.out.println(intAtt);
            }
           else if (i == secondIndex) {
                intAtt[i] = firstIndexValue;
            }

        }
    }

}
