/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openvr;

import org.lwjgl.openvr.OpenVR;
import org.lwjgl.system.MemoryStack;

import java.nio.IntBuffer;

import static org.lwjgl.openvr.VR.*;
import static org.lwjgl.openvr.VRSystem.*;
import static org.lwjgl.system.MemoryStack.*;

public class HelloOpenVR {

	private HelloOpenVR() {
	}

	public static void main(String[] args) {
		System.err.println("VR_IsRuntimeInstalled() = " + VR_IsRuntimeInstalled());
		System.err.println("VR_RuntimePath() = " + VR_RuntimePath());
		System.err.println("VR_IsHmdPresent() = " + VR_IsHmdPresent());

		try ( MemoryStack stack = stackPush() ) {
			IntBuffer peError = stack.mallocInt(1);

			int token = VR_InitInternal(peError, 0);
			if ( peError.get(0) == 0 ) {
				try {
					OpenVR.create(token);

					System.err.println("Model Number : " + VRSystem_GetStringTrackedDeviceProperty(
						k_unTrackedDeviceIndex_Hmd,
						ETrackedDeviceProperty_Prop_ModelNumber_String,
						peError
					));
					System.err.println("Serial Number: " + VRSystem_GetStringTrackedDeviceProperty(
						k_unTrackedDeviceIndex_Hmd,
						ETrackedDeviceProperty_Prop_SerialNumber_String,
						peError
					));

					IntBuffer w = stack.mallocInt(1);
					IntBuffer h = stack.mallocInt(1);
					VRSystem_GetRecommendedRenderTargetSize(w, h);
					System.err.println("Recommended width : " + w.get(0));
					System.err.println("Recommended height: " + h.get(0));
				} finally {
					VR_ShutdownInternal();
				}
			} else {
				System.out.println("INIT ERROR SYMBOL: " + VR_GetVRInitErrorAsSymbol(peError.get(0)));
				System.out.println("INIT ERROR  DESCR: " + VR_GetVRInitErrorAsEnglishDescription(peError.get(0)));
			}
		}
	}

}