package HasTech;

public class Notification {

    boolean dataCheck;
    int foundDataSize;
    
    public void setDataCheck(boolean dataCheck){
        this.dataCheck = dataCheck;
    }
    
    public void setFoundDataSize(int foundDataSize){
        this.foundDataSize = foundDataSize;
    }

    public void getDataNotFound(String massage, int foundDataSize) {
        if (dataCheck == false) {
            System.out.println("\n--------------------------------");
            System.out.println("### Client " + massage + " Not Found...");
            System.out.println("--------------------------------\n");
        } else {
            System.out.println("--------------------------------");
            System.out.println("### " + foundDataSize + " Client " + massage + " Found...");
            System.out.println("--------------------------------\n");
            this.dataCheck = false;
        }
    }
}
