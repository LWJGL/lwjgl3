/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_device_query_name.txt">EXT_device_query_name</a> extension.
 * 
 * <p>The {@code EGL_EXT_device_enumeration} and {@code EGL_EXT_device_query} extensions provide a list of devices and a list of extensions, but lacks a way
 * to find a name for a device that an application can present to a user.</p>
 * 
 * <p>This extension adds two new strings that an application can query to find human-readable names.</p>
 * 
 * <p>Requires {@link EXTDeviceQuery EXT_device_query}.</p>
 */
public final class EXTDeviceQueryName {

    /** Accepted by the {@code name} parameter of {@link EXTDeviceQuery#eglQueryDeviceStringEXT QueryDeviceStringEXT}. */
    public static final int EGL_RENDERER_EXT = 0x335F;

    private EXTDeviceQueryName() {}

}