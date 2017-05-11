/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.ovr;

import org.lwjgl.*;
import org.lwjgl.ovr.*;

import static org.lwjgl.ovr.OVR.*;
import static org.lwjgl.ovr.OVRUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class HelloLibOVR {

    private HelloLibOVR() {
    }

    public static void main(String[] args) {
        try (OVRDetectResult detect = OVRDetectResult.calloc()) {
            ovr_Detect(0, detect);

            System.out.println("OVRDetectResult.IsOculusHMDConnected = " + detect.IsOculusHMDConnected());
            System.out.println("OVRDetectResult.IsOculusServiceRunning = " + detect.IsOculusServiceRunning());
        }

        OVRLogCallback callback;
        try (
            OVRInitParams initParams = OVRInitParams.calloc()
                .LogCallback((userData, level, message) -> System.out.println("LibOVR [" + level + "] " + memASCII(message)))
                .Flags(ovrInit_Debug)
        ) {
            callback = initParams.LogCallback();
            System.out.println("ovr_Initialize = " + ovr_Initialize(initParams));
        }

        System.out.println("ovr_GetVersionString = " + ovr_GetVersionString());

        try (
            OVRGraphicsLuid luid = OVRGraphicsLuid.calloc();
            OVRHmdDesc desc = OVRHmdDesc.malloc();
        ) {
            PointerBuffer pSession = memAllocPointer(1);
            System.out.println("ovr_Create = " + ovr_Create(pSession, luid));

            long session = pSession.get(0);
            memFree(pSession);

            ovr_GetHmdDesc(session, desc);
            System.out.println("ovr_GetHmdDesc = " + desc.ManufacturerString() + " " + desc.ProductNameString() + " " + desc.SerialNumberString());

            if (session != NULL) {
                ovr_Destroy(session);
            }
        }

        ovr_Shutdown();

        callback.free();
    }

}