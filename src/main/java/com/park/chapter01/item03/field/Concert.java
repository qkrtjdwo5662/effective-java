package com.park.chapter01.item03.field;

public class Concert {
    // elvis의 client 코드
    private boolean lightsOn;
    private boolean mainStateOpen;

    private IElvis elvis;

    public Concert(IElvis elvis){
        this.elvis = elvis;
    }

    public void perform(){
        mainStateOpen = true;
        lightsOn = true;
        elvis.sing();
    }

    public boolean isLightsOn(){
        return lightsOn;
    }

    public boolean isMainStateOpen(){
        return mainStateOpen;
    }
}
