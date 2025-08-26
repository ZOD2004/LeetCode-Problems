class Solution {

    public int areaOfMaxDiagonal(int[][] dim) {
        PriorityQueue<Obj> pq = new PriorityQueue<>((x, y) -> {
            if (x.dia == y.dia) {
                return y.area - x.area;
            }
            return Double.compare(y.dia, x.dia);
        });

        for (int[] a : dim) {
            Obj o = new Obj(a[0], a[1], Math.sqrt((a[0] * a[0]) + (a[1] * a[1])), a[0] * a[1]);
            pq.add(o);
        }
        return pq.poll().area;
    }
}

class Obj {
    public int len;
    public int wid;
    public double dia;
    public int area;

    public Obj(int len, int wid, double dia, int area) {
        this.len = len;
        this.wid = wid;
        this.dia = dia;
        this.area = area;
    }
}