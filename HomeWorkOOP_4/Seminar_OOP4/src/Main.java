import gb.GBList;
import gb.list.gbArrayList;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> gblist = new gbArrayList<>();
        System.out.println(gblist.size());
        gblist.add(1);
        gblist.add(2);
        gblist.add(3);
        gblist.add(15);
        gblist.add(15);
        gblist.add(15);
        gblist.add(16);
        System.out.println(gblist.size());
        System.out.println(gblist.get(1));

        gblist.remove(2);
        System.out.println(gblist.size());
        for (int i = 0; i < gblist.size(); i++) {
            System.out.print(gblist.get(i) + " ");
        }


    }
}