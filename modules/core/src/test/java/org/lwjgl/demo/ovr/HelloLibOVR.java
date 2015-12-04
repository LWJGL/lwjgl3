/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.ovr;

import org.lwjgl.PointerBuffer;
import org.lwjgl.ovr.*;

import static org.lwjgl.ovr.OVR.*;
import static org.lwjgl.ovr.OVRUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class HelloLibOVR {

	private HelloLibOVR() {
	}

	public static void main(String[] args) {
		OVRDetectResult detect = OVRDetectResult.calloc();
		ovr_Detect(0, detect);

		System.out.println("OVRDetectResult.IsOculusHMDConnected = " + detect.IsOculusHMDConnected());
		System.out.println("OVRDetectResult.IsOculusServiceRunning = " + detect.IsOculusServiceRunning());

		OVRLogCallback callback = new OVRLogCallback() {
			@Override
			public void invoke(long userData, int level, long message) {
				System.out.println("LibOVR [" + level + "] " + memDecodeASCII(message));
			}
		};

		OVRInitParams initParams = OVRInitParams.calloc();
		initParams.LogCallback(callback);
		initParams.Flags(ovrInit_Debug);

		System.out.println("ovr_Initialize = " + ovr_Initialize(initParams));
		initParams.free();

		System.out.println("ovr_GetVersionString = " + ovr_GetVersionString());

		PointerBuffer hmd_p = memAllocPointer(1);
		OVRGraphicsLuid luid = OVRGraphicsLuid.calloc();
		System.out.println("ovr_Create = " + ovr_Create(hmd_p, luid));

		long hmd = hmd_p.get(0);

		OVRHmdDesc desc = OVRHmdDesc.malloc();
		ovr_GetHmdDesc(hmd, desc);

		System.out.println("ovr_GetHmdDesc = " + desc.ManufacturerString() + " " + desc.ProductNameString() + " " + desc.SerialNumberString());

		desc.free();
		luid.free();
		memFree(hmd_p);

		ovr_Shutdown();
	}

}