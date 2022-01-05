package bridgetest;

import bridge.AdvancedRemoteControl;
import bridge.RemoteControl;
import bridge.SamsungTv;
import bridge.SonyTv;

public class Main {

	public static void main(String[] args) {
		var remoteControl = new AdvancedRemoteControl(new SamsungTv());
		remoteControl.turnOn();
	}

}
