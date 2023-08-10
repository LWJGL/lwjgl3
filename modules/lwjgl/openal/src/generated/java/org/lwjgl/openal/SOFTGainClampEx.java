/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_gain_clamp_ex.txt">SOFT_gain_clamp_ex</a> extension.
 * 
 * <p>This extension extends the gain clamping mechanism in standard AL. By default, OpenAL allows the source's and listener's {@link AL10#AL_GAIN GAIN} property to be set to
 * any value that's greater-than or equal-to 0. The calculated source gain is clamped between its {@link AL10#AL_MIN_GAIN MIN_GAIN} and {@link AL10#AL_MAX_GAIN MAX_GAIN} properties after distance
 * attenuation and the directional cone is applied, and before the listener gain is applied, however these two clamping properties are themselves
 * restricted to being between 0 and 1 (inclusive).</p>
 * 
 * <p>That behavior effectively nullifies any purpose of setting a source's gain being above 1, as the source's distance- and cone-related properties can be
 * modified for the same effect. Oddly, the listener gain is applied to the source gain *after* the clamping, so it is still possible for the final
 * calculated gain to exceed 1. On top of this, the spec allows an implementation the option to implicitly clamp the final calculated gain for the source
 * as needed, but provides no means for applications to detect such behavior.</p>
 * 
 * <p>This extension aims to fix those problems by removing the maximum limit for {@link AL10#AL_MIN_GAIN MIN_GAIN} and {@link AL10#AL_MAX_GAIN MAX_GAIN}, allowing applications to increase the effective
 * source gain above 1. Additionally, it provides a query for the application to retrieve the implicit clamp level an implementation may put on the final
 * calculated gain.</p>
 */
public final class SOFTGainClampEx {

    /** An implementation-defined maximum per-source gain limit (guaranteed to be at least 1). */
    public static final int AL_GAIN_LIMIT_SOFT = 0x200E;

    private SOFTGainClampEx() {}

}