/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

/**
 * Native bindings to the <strong>APPLE_biased_fixed_point_image_formats</strong> extension.
 * 
 * <p>This selector may be passed to {@link CL10#clCreateImage2D CreateImage2D} in the cl_image_format.image_channel_data_type field. It defines a biased signed 1.14 fixed point
 * storage format, with range [-1, 3). The conversion from float to this fixed point format is defined as follows:</p>
 * 
 * <pre><code>
 * ushort float_to_sfixed14( float x ){
 *     int i = convert_int_sat_rte( x * 0x1.0p14f );         // scale [-1, 3.0) to [-16384, 3*16384), round to nearest integer
 *     i = add_sat( i, 0x4000 );                             // apply bias, to convert to [0, 65535) range
 *     return convert_ushort_sat(i);                         // clamp to destination size
 * }</code></pre>
 * 
 * <p>The inverse conversion is the reverse process. The formats are currently only available on the CPU with the {@link CL10#CL_RGBA RGBA} channel layout.</p>
 */
public final class APPLEBiasedFixedPointImageFormats {

    public static final int
        CL_SFIXED14_APPLE    = 0x10000008,
        CL_BIASED_HALF_APPLE = 0x10000009;

    private APPLEBiasedFixedPointImageFormats() {}

}