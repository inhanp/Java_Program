import java.util.Stack;

public class IceCreamCone {

    private Stack<String> flavors;
    private int numScoops;

    public IceCreamCone() {
        flavors = new Stack<String>();
        numScoops = 0;
    }

    /**
     * Add icecream scoop to cone (push to stack)
     * @param flavor    Flavor to add (String to push)
     */
    public void addScoop(String flavor) {
        if (flavor != null) {
            this.flavors.push(flavor);
            this.numScoops++;
        }
    }

    /**
     * Eat icecream scoop from top (pop from stack)
     * @return  Flavor eaten (String popped)
     */
    public String eatScopp() {
        String eaten = null;
        if (!this.flavors.empty()) {
            eaten = this.flavors.pop();
            this.numScoops--;
        }
        return eaten;
    }

    /**
     * See what flavor at top (peek from stack)
     * @return  Flavors at top of ice cream (String peek)
     */
    public String currentScoop() {
        String top = null;
        if (!this.flavors.empty()) {
            top = this.flavors.peek();
        }
        return top;
    }

    /**
     * Return number of scoops on cone (number of elements of stack)
     * @return  Number of scoops
     */
    public int numScoops() {
        return this.numScoops;
    }

    /**
     * Compare Stack
     * @return  Whether they are same objects.
     */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other == null || other.getClass() != IceCreamCone.class) {
            return false;
        }
        return flavors.equals(((IceCreamCone) other).flavors);
    }

    public static void main(String[] args) throws Exception {
        IceCreamCone cone1 = new IceCreamCone();
        IceCreamCone cone2 = new IceCreamCone();
        cone1.addScoop("apple");
        cone1.addScoop("banana");
        cone1.addScoop("cherry");
        System.out.println(cone1.currentScoop());
        System.out.println(cone1.eatScopp());

        
        cone2.addScoop("apple");
        cone2.addScoop("banana");
        cone2.addScoop("cherry");
        System.out.println(cone1.equals(cone2));

        cone1.addScoop("cherry");
        System.out.println(cone1.equals(cone2));
    }
}
