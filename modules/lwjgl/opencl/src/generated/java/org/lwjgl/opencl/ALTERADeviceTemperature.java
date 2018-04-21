/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>altera_device_temperature</strong> extension.
 * 
 * <p>This extension specifies an API for querying the current temperature of a given device. The device temperature may be used to diagnose problems with a
 * deplyed system, or to enhance its reliability or useful lifetime.</p>
 */
public final class ALTERADeviceTemperature {

    /** Accepted by the {@code param_name} argument of {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int CL_DEVICE_CORE_TEMPERATURE_ALTERA = 0x40F3;

    private ALTERADeviceTemperature() {}

}