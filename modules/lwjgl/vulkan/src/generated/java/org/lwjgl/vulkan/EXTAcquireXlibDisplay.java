/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.linux.*;

public class EXTAcquireXlibDisplay {

    public static final int VK_EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION = 1;

    public static final String VK_EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME = "VK_EXT_acquire_xlib_display";

    protected EXTAcquireXlibDisplay() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkAcquireXlibDisplayEXT ] ---

    /** {@code VkResult vkAcquireXlibDisplayEXT(VkPhysicalDevice physicalDevice, Display * dpy, VkDisplayKHR display)} */
    @NativeType("VkResult")
    public static int vkAcquireXlibDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("Display *") long dpy, @NativeType("VkDisplayKHR") long display) {
        long __functionAddress = physicalDevice.getCapabilities().vkAcquireXlibDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPJI(physicalDevice.address(), dpy, display, __functionAddress);
    }

    // --- [ vkGetRandROutputDisplayEXT ] ---

    /** {@code VkResult vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, Display * dpy, RROutput rrOutput, VkDisplayKHR * pDisplay)} */
    public static int nvkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, long dpy, long rrOutput, long pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetRandROutputDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPNPI(physicalDevice.address(), dpy, rrOutput, pDisplay, __functionAddress);
    }

    /** {@code VkResult vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, Display * dpy, RROutput rrOutput, VkDisplayKHR * pDisplay)} */
    @NativeType("VkResult")
    public static int vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("Display *") long dpy, @NativeType("RROutput") long rrOutput, @NativeType("VkDisplayKHR *") LongBuffer pDisplay) {
        if (CHECKS) {
            check(pDisplay, 1);
        }
        return nvkGetRandROutputDisplayEXT(physicalDevice, dpy, rrOutput, memAddress(pDisplay));
    }

    /** {@code VkResult vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, Display * dpy, RROutput rrOutput, VkDisplayKHR * pDisplay)} */
    @NativeType("VkResult")
    public static int vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, @NativeType("Display *") long dpy, @NativeType("RROutput") long rrOutput, @NativeType("VkDisplayKHR *") long[] pDisplay) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetRandROutputDisplayEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(pDisplay, 1);
        }
        return callPPNPI(physicalDevice.address(), dpy, rrOutput, pDisplay, __functionAddress);
    }

}