/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.ovr;

import org.lwjgl.ovr.OVRInitParams;
import org.lwjgl.ovr.OVRLogCallback;

import static org.lwjgl.ovr.OVR.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class HelloLibOVR {

	private HelloLibOVR() {
	}

	public static void main(String[] args) {
		OVRLogCallback callback = new OVRLogCallback() {
			@Override
			public void invoke(int level, long message) {
				System.out.println("LibOVR [" + level + "] " + memDecodeASCII(message));
			}
		};

		OVRInitParams initParams = new OVRInitParams();
		initParams.setLogCallback(callback.getPointer());
		initParams.setFlags(ovrInit_Debug);

		System.out.println("ovr_Initialize = " + ovr_Initialize(initParams.buffer()));
		System.out.println("ovr_GetVersionString = " + ovr_GetVersionString());
		System.out.println("ovrHmd_Detect = " + ovrHmd_Detect());

		ovr_Shutdown();
	}

}