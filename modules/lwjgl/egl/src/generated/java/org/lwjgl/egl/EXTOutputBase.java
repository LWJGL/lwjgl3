/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

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

    /** {@code EGLBoolean eglGetOutputLayersEXT(EGLDisplay dpy, EGLAttrib const * attrib_list, EGLOutputLayerEXT * layers, EGLint max_layers, EGLint * num_layers)} */
    public static int neglGetOutputLayersEXT(long dpy, long attrib_list, long layers, int max_layers, long num_layers) {
        long __functionAddress = EGL.getCapabilities().eglGetOutputLayersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(dpy, attrib_list, layers, max_layers, num_layers, __functionAddress);
    }

    /** {@code EGLBoolean eglGetOutputLayersEXT(EGLDisplay dpy, EGLAttrib const * attrib_list, EGLOutputLayerEXT * layers, EGLint max_layers, EGLint * num_layers)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetOutputLayersEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list, @NativeType("EGLOutputLayerEXT *") @Nullable PointerBuffer layers, @NativeType("EGLint *") IntBuffer num_layers) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_layers, 1);
        }
        return neglGetOutputLayersEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(layers), remainingSafe(layers), memAddress(num_layers)) != 0;
    }

    // --- [ eglGetOutputPortsEXT ] ---

    /** {@code EGLBoolean eglGetOutputPortsEXT(EGLDisplay dpy, EGLAttrib const * attrib_list, EGLOutputPortEXT * ports, EGLint max_ports, EGLint * num_ports)} */
    public static int neglGetOutputPortsEXT(long dpy, long attrib_list, long ports, int max_ports, long num_ports) {
        long __functionAddress = EGL.getCapabilities().eglGetOutputPortsEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
        }
        return callPPPPI(dpy, attrib_list, ports, max_ports, num_ports, __functionAddress);
    }

    /** {@code EGLBoolean eglGetOutputPortsEXT(EGLDisplay dpy, EGLAttrib const * attrib_list, EGLOutputPortEXT * ports, EGLint max_ports, EGLint * num_ports)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetOutputPortsEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list, @NativeType("EGLOutputPortEXT *") @Nullable PointerBuffer ports, @NativeType("EGLint *") IntBuffer num_ports) {
        if (CHECKS) {
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_ports, 1);
        }
        return neglGetOutputPortsEXT(dpy, memAddressSafe(attrib_list), memAddressSafe(ports), remainingSafe(ports), memAddress(num_ports)) != 0;
    }

    // --- [ eglOutputLayerAttribEXT ] ---

    /** {@code EGLBoolean eglOutputLayerAttribEXT(EGLDisplay dpy, EGLOutputLayerEXT layer, EGLint attribute, EGLAttrib value)} */
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

    /** {@code EGLBoolean eglQueryOutputLayerAttribEXT(EGLDisplay dpy, EGLOutputLayerEXT layer, EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryOutputLayerAttribEXT(long dpy, long layer, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputLayerAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(layer);
        }
        return callPPPI(dpy, layer, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryOutputLayerAttribEXT(EGLDisplay dpy, EGLOutputLayerEXT layer, EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryOutputLayerAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputLayerEXT") long layer, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryOutputLayerAttribEXT(dpy, layer, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryOutputLayerStringEXT ] ---

    /** {@code char * eglQueryOutputLayerStringEXT(EGLDisplay dpy, EGLOutputLayerEXT layer, EGLint name)} */
    public static long neglQueryOutputLayerStringEXT(long dpy, long layer, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputLayerStringEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(layer);
        }
        return callPPP(dpy, layer, name, __functionAddress);
    }

    /** {@code char * eglQueryOutputLayerStringEXT(EGLDisplay dpy, EGLOutputLayerEXT layer, EGLint name)} */
    @NativeType("char *")
    public static @Nullable String eglQueryOutputLayerStringEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputLayerEXT") long layer, @NativeType("EGLint") int name) {
        long __result = neglQueryOutputLayerStringEXT(dpy, layer, name);
        return memASCIISafe(__result);
    }

    // --- [ eglOutputPortAttribEXT ] ---

    /** {@code EGLBoolean eglOutputPortAttribEXT(EGLDisplay dpy, EGLOutputPortEXT port, EGLint attribute, EGLAttrib value)} */
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

    /** {@code EGLBoolean eglQueryOutputPortAttribEXT(EGLDisplay dpy, EGLOutputPortEXT port, EGLint attribute, EGLAttrib * value)} */
    public static int neglQueryOutputPortAttribEXT(long dpy, long port, int attribute, long value) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputPortAttribEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(port);
        }
        return callPPPI(dpy, port, attribute, value, __functionAddress);
    }

    /** {@code EGLBoolean eglQueryOutputPortAttribEXT(EGLDisplay dpy, EGLOutputPortEXT port, EGLint attribute, EGLAttrib * value)} */
    @NativeType("EGLBoolean")
    public static boolean eglQueryOutputPortAttribEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputPortEXT") long port, @NativeType("EGLint") int attribute, @NativeType("EGLAttrib *") PointerBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return neglQueryOutputPortAttribEXT(dpy, port, attribute, memAddress(value)) != 0;
    }

    // --- [ eglQueryOutputPortStringEXT ] ---

    /** {@code char * eglQueryOutputPortStringEXT(EGLDisplay dpy, EGLOutputPortEXT port, EGLint name)} */
    public static long neglQueryOutputPortStringEXT(long dpy, long port, int name) {
        long __functionAddress = EGL.getCapabilities().eglQueryOutputPortStringEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            check(port);
        }
        return callPPP(dpy, port, name, __functionAddress);
    }

    /** {@code char * eglQueryOutputPortStringEXT(EGLDisplay dpy, EGLOutputPortEXT port, EGLint name)} */
    @NativeType("char *")
    public static @Nullable String eglQueryOutputPortStringEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLOutputPortEXT") long port, @NativeType("EGLint") int name) {
        long __result = neglQueryOutputPortStringEXT(dpy, port, name);
        return memASCIISafe(__result);
    }

    /** {@code EGLBoolean eglGetOutputLayersEXT(EGLDisplay dpy, EGLAttrib const * attrib_list, EGLOutputLayerEXT * layers, EGLint max_layers, EGLint * num_layers)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetOutputLayersEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list, @NativeType("EGLOutputLayerEXT *") @Nullable PointerBuffer layers, @NativeType("EGLint *") int[] num_layers) {
        long __functionAddress = EGL.getCapabilities().eglGetOutputLayersEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(dpy);
            checkNTSafe(attrib_list, EGL10.EGL_NONE);
            check(num_layers, 1);
        }
        return callPPPPI(dpy, memAddressSafe(attrib_list), memAddressSafe(layers), remainingSafe(layers), num_layers, __functionAddress) != 0;
    }

    /** {@code EGLBoolean eglGetOutputPortsEXT(EGLDisplay dpy, EGLAttrib const * attrib_list, EGLOutputPortEXT * ports, EGLint max_ports, EGLint * num_ports)} */
    @NativeType("EGLBoolean")
    public static boolean eglGetOutputPortsEXT(@NativeType("EGLDisplay") long dpy, @NativeType("EGLAttrib const *") @Nullable PointerBuffer attrib_list, @NativeType("EGLOutputPortEXT *") @Nullable PointerBuffer ports, @NativeType("EGLint *") int[] num_ports) {
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