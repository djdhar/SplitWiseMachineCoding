package manager;

import group.Group;

public class Calculator {
    public Double getGroupCredit(Group g) {
        return g.getPersonList().stream().map(p -> p.getCredit()).reduce(0.0, (x,y)-> x+y);
    }
}
