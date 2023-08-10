/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_output_base.txt">EXT_output_base</a> extension.
 * 
 * <p>Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
 * windowing systems. This creates demand for a method to initialize EGL displays and surfaces directly on top of native GPU or device objects rather than
 * native window system objects. The mechanics of enumerating the underlying native devices and constructing EGL displays and surfaces from them have been
 * solved in various platform and implementation- specific ways. The EGL device family of extensions offers a standardized framework for bootstrapping EGL
 * without the use of any underlying "native" APIs or functionality.</p>
 * 
 * <p>This extension defines new EGL resource types for referencing display control hardware associated with an EGL device. Its purpose is to allow rendering
 * to be directed to a screen in the absence of (or bypassing) a window system. Because the use models for these resources are potentially diverse, only
 * the objects themselves and basic functions to acquire and query them are defined here. More detailed functions and enumerants required to operate on
 * outputs are provided by separate extensions.</p>
 * 
 * <p>Requires {@link EXTDeviceBase EXT_device_base}.</p>
 */
public class EXTOutputBase {

    public static final int
        EGL_BAD_OUTPUT_LAYER_EXT = 0x322D,
        EGL_BAD_OUTPUT_PORT_EXT  = 0x322E,
        EGL_SWAP_INTERVAL_EXT    = 0x322F;

    public static final long
        EGL_NO_OUTPUT_LAYER_EXT = 0x0L,
        EGL_NO_OUTPUT_PORT_EXT  = 0x0L;

    protected EXTOutputBase() {
        throw new UnsupportedOperationException();
    }

    // --- [ eglGetOutputLayersEXT ] ---

    public static int neglGetOutputLayersEXT(long dpy, long attrib_list, long layers, int max_layers, long num_layers) {
        long __functionAddress = EGL.getCapabilities().eglGetOutputLayersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(dpy, attrib_list, layers, max_layers, num_layers, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglGetOutputLayersEXT(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list, @Nullable @NativeType("EGLOutputLayerEXT *") PointerBuffer layers, @NativeType("EGLint *") IntBuffer num_layers) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_layers, 1);
        }
        return neglGetOutputLayersEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(layers), remainingSafe(layers), memAddress(num_layers)) != 0;
    }

    // --- [ eglGetOutputPortsEXT ] ---

    public static int neglGetOutputPortsEXT(long dpy, long attrib_list, long ports, int max_ports, long num_ports) {
        long __functionAddress = EGL.getCapabilities().eglGetOutputPortsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(dpy, attrib_list, ports, max_ports, num_ports, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglGetOutputPortsEXT(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list, @Nullable @NativeType("EGLOutputPortEXT *") PointerBuffer ports, @NativeType("EGLint *") IntBuffer num_ports) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_ports, 1);
        }
        return neglGetOutputPortsEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(ports), remainingSafe(ports), memAddress(num_ports)) != 0;
    }

    // --- [ eglOutputLayerAttribEXT ] ---

    @NativeType("EGLBoolean")
    public static boolean eglOutputLayerAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputLayerEXT") long layer, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib") long value) {
        long __functionAddress = EGL.getCapabilities().eglOutputLayerAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(layer);
        }
        return callPPPI(dpy, layer, attribute, value, __functionAddress) != 0;
    }

    // --- [ eglQueryOutputLayerAttribEXT ] ---

    public static int neglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputLayerAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(layer);
        }
        return callPPPI(dpy, layer, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryOutputLayerAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputLayerEXT") long layer, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryOutputLayerAttribEXT(dpy, layer, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryOutputLayerStringEXT ] ---

    public static long neglQueryOutputLayerStringEXT(long dpy, long layer, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputLayerStringEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(layer);
        }
        return callPPP(dpy, layer, name, __functionAddress);
    }

    @Nullable
    @NativeType("char *")
    public static String eglQueryOutputLayerStringEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputLayerEXT") long layer, @NativeType("EGLint") int name) {
        long __result = neglQueryOutputLayerStringEXT(dpy, layer, name);
        return memASCIISafe(__result);
    }

    // --- [ eglOutputPortAttribEXT ] ---

    @NativeType("EGLBoolean")
    public static boolean eglOutputPortAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputPortEXT") long port, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib") long value) {
        long __functionAddress = EGL.getCapabilities().eglOutputPortAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(port);
        }
        return callPPPI(dpy, port, attribute, value, __functionAddress) != 0;
    }

    // --- [ eglQueryOutputPortAttribEXT ] ---

    public static int neglQueryOutputPortAttribEXT(long dpy, long port, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputPortAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(port);
        }
        return callPPPI(dpy, port, attribute, value, __functionAddress);
    }

    @NativeType("EGLBoolean")
    public static boolean eglQueryOutputPortAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputPortEXT") long port, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryOutputPortAttribEXT(dpy, port, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryOutputPortStringEXT ] ---

    public static long neglQueryOutputPortStringEXT(long dpy, long port, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputPortStringEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(port);
        }
        return callPPP(dpy, port, name, __functionAddress);
    }

    @Nullable
    @NativeType("char *")
    public static String eglQueryOutputPortStringEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputPortEXT") long port, @NativeType("EGLint") int name) {
        long __result = neglQueryOutputPortStringEXT(dpy, port, name);
        return memASCIISafe(__result);
    }

    /** Array version of: {@link #eglGetOutputLayersEXT GetOutputLayersEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglGetOutputLayersEXT(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list, @Nullable @NativeType("EGLOutputLayerEXT *") PointerBuffer layers, @NativeType("EGLint *") int[] num_layers) {
        long __functionAddress = EGL.getCapabilities().eglGetOutputLayersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_layers, 1);
        }
        return callPPPPI(dpy, memAddressSafe(attrib_list), memAddressSafe(layers), remainingSafe(layers), num_layers, __functionAddress) != 0;
    }

    /** Array version of: {@link #eglGetOutputPortsEXT GetOutputPortsEXT} */
    @NativeType("EGLBoolean")
    public static boolean eglGetOutputPortsEXT(@NativeType("EGLDisplay") long dpy, @Nullable @NativeType("EGLAttrib const *") PointerBuffer attrib_list, @Nullable @NativeType("EGLOutputPortEXT *") PointerBuffer ports, @NativeType("EGLint *") int[] num_ports) {
        long __functionAddress = EGL.getCapabilities().eglGetOutputPortsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_ports, 1);
        }
        return callPPPPI(dpy, memAddressSafe(attrib_list), memAddressSafe(ports), remainingSafe(ports), num_ports, __functionAddress) != 0;
    }

}