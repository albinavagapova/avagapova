package attestation;

import java.util.Random;

public class Indicator {
    public int humidity(){
        Random random = new Random();
        return random.nextInt(100);//рандомный процент влажности
    }
}
