interface MyCamera {
    void takeSnap();

    void recordVideo();

    private void grete() {                            // <-- direct access na thay etle tene empliment katva mate default no use thay
        System.out.println("Good morning!");
    }

    default void voiceRecording() {
        grete();// <-- "default" ના કારણે fuction ને અહી defain કારીસકે છે .
        System.out.println("Recording a Voice");
    }
}

interface MyWifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickcall() {
        System.out.println("connecting ...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi {
    public void takeSnap() {
        System.out.println("Tacking snap");
    }

    public void recordVideo() {
        System.out.println("Recording a video");
    }

    //    public void voiceRecording(){                   // <-- "default"  વાળા function ને override કરી શકાયી છે .
//        System.out.println("Recording a Voice with Overriding...");
//    }
    public String[] getNetwork() {
        System.out.println("Getting List of network");
        String[] networkList = {"Rohit", "Anshu", "Prashant"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to" + network);
    }
}

public class V57_default_method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.voiceRecording();
        String[] ar = ms.getNetwork();
        for (String element : ar) {
            System.out.println(element);
        }
    }
}