package info.nightscout.androidaps.plugins.treatments;

public class TreatmentUpdateReturn {

    public TreatmentUpdateReturn(boolean success, boolean newRecord) {
        this.success = success;
        this.newRecord = newRecord;
    }

    boolean newRecord;
    boolean success;

    @Override
    public String toString() {
        return "UpdateReturn [" +
                "newRecord=" + newRecord +
                ", success=" + success +
                ']';
    }

}




