interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void grete() {                            // <-- direct access na thay etle tene empliment katva mate default no use thay
        System.out.println("Good morning!");
    }

    default void voiceRecording() {
        grete();                                    // <-- "default" ના કારણે fuction ને અહી defain કારીસકે છે .
        System.out.println("Recording a Voice");
    }
}

interface MyWifi2 {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickcall() {
        System.out.println("connecting ...");
    }
}

class MySmartPhone2 extends MyCellPhone implements MyCamera2, MyWifi2 {
    public void takeSnap() {
        System.out.println("Tacking snap");
    }

    public void recordVideo() {
        System.out.println("Recording a video");
    }
    public String[] getNetwork() {
        System.out.println("Getting List of network");
        String[] networkList = {"Rohit", "Anshu", "Prashant"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to" + network);
    }
}

public class V59_Polymorphism {
    public static void main (String[] args) {
        MyCamera2 mc = new MySmartPhone2();

        mc.recordVideo();
        //mc.getNetwork()       <-- can't access

    }
}
