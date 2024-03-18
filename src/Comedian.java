import java.util.ArrayList;

public class Comedian extends Performer {
    private ArrayList<String> jokes;

    public Comedian(String name, int age, Agent agent) {
        super(name, age, agent);
        jokes = new ArrayList<String>();
    }

    public void writeJoke(String joke) {
        jokes.add(joke);
    }

    @Override
    public void perform() {
        super.perform();
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

    @Override
    public void callAgent() {
        System.out.println("Run joke past agent, dial " + getAgent().getCellPhoneNum());
    }

    public void callAgent(String joke) {
        System.out.println(joke);
        callAgent();
        super.callAgent();
    }

    public void randomMethod() {
        super.callAgent();
        this.callAgent();
        callAgent();

        super.rehearse();
        this.rehearse();
        rehearse();
    }
    public void rehearse(boolean performAfter) {
        if (performAfter = false) {
            super.rehearse();
        } else {
            super.rehearse();
            perform();
        }
    }
}
