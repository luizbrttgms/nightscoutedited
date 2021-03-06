package info.nightscout.androidaps.danar.comm

import dagger.android.HasAndroidInjector
import info.nightscout.shared.logging.LTag

class MsgHistoryGlucose(
    injector: HasAndroidInjector
) : MsgHistoryAll(injector) {

    init {
        SetCommand(0x3104)
        aapsLogger.debug(LTag.PUMPCOMM, "New message")
    }
    // Handle message taken from MsgHistoryAll
}