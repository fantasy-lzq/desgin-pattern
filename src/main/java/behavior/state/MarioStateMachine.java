package behavior.state;

/**
 * 以游戏超级马里奥为例阐述状态模式
 * 马里奥可以变身为多种形态，比如小马
 * 里奥（Small Mario）、超级马里奥（Super Mario）、火焰马里奥（Fire Mario）、斗篷
 * 马里奥（Cape Mario）等等。在不同的游戏情节下，各个形态会互相转化，并相应的增减
 * 积分。比如，初始形态是小马里奥，吃了蘑菇之后就会变成超级马里奥，并且增加 100 积
 * 分。
 * 实际上，马里奥形态的转变就是一个状态机。其中，马里奥的不同形态就是状态机中的“状
 * 态”，游戏情节（比如吃了蘑菇）就是状态机中的“事件”，加减积分就是状态机中的“动
 * 作”。比如，吃蘑菇这个事件，会触发状态的转移：从小马里奥转移到超级马里奥，以及触
 * 发动作的执行（增加 100 积分）。
 */
public class MarioStateMachine {
    private int score;
    private IMario currentState; // 不再使用枚举来表示状态

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = SmallMario.getInstance();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void obtainMushRoom() {
        this.currentState.obtainMushRoom(this);
    }

    public void obtainCape() {
        this.currentState.obtainCape(this);
    }

    public void obtainFireFlower() {
        this.currentState.obtainFireFlower(this);
    }

    public void meetMonster() {
        this.currentState.meetMonster(this);
    }

    public State getCurrentState() {
        return this.currentState.getName();
    }

    public void setCurrentState(IMario currentState) {
        this.currentState = currentState;
    }

}
