package behavior.state;

public interface IMario {
    State getName();

    //以下是定义的事件
    // 吃蘑菇...
    void obtainMushRoom();

    // 获得斗篷
    void obtainCape();

    // 获得火焰
    void obtainFireFlower();

    // 遇见怪物
    void meetMonster();
}
