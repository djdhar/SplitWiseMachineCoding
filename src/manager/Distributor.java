package manager;

import group.Group;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Distributor {

    public void distributeByPercentage(List<Double> percentage, int payer, double amount, Group group) {
        for(int i=0;i<percentage.size();i++) percentage.set(i, (percentage.get(i)*amount)/100.0);
        for(int i=0;i<group.getPersonList().size();i++) {
            if(group.getPersonList().get(i).getId()==payer) {
                group.getPersonList().get(i).setCredit(amount-percentage.get(i));
            } else {
                group.getPersonList().get(i).setCredit(-percentage.get(i));
            }
        }
    }

    public void distributeEqually(int payer, double amount, Group group) {
        List<Double> percentage = new ArrayList<>();
        for(int i=0;i<group.getPersonList().size();i++) {
            percentage.add(100.0/group.getPersonList().size());
        }
        distributeByPercentage(percentage, payer, amount, group);
    }
}
