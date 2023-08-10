/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_source_start_delay.txt">SOFT_source_start_delay</a> extension.
 * 
 * <p>This extension allows applications to play a source at a particular future time.</p>
 * 
 * <p>With standard OpenAL, an application can play a source with the {@link AL10#alSourcePlay SourcePlay} or {@link AL10#alSourcePlayv SourcePlayv} functions which causes sources to start playing as soon
 * as possible, but the actual start time is left to the implementation to deal with (which could be on the next 10ms or 20ms boundary, or whenever the
 * mixer can start processing the source).</p>
 * 
 * <p>Aside from {@code alSourcePlayv} starting all given sources in sync, there is no way to start playing sources at particular times relative to each
 * other, or synchronized to some specific time point.</p>
 * 
 * <p>This extension adds functionality to start source playback at an absolute device clock time, as well as to start with a relative delay.</p>
 * 
 * <p>Requires {@link SOFTDeviceClock SOFT_device_clock}.</p>
 */
public class SOFTSourceStartDelay {

    protected SOFTSourceStartDelay() {
        throw new UnsupportedOperationException();
    }

    // --- [ alSourcePlayAtTimeSOFT ] ---

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimeSOFT(@NativeType("ALuint") int source, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimeSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeJV(source, start_time, __functionAddress);
    }

    // --- [ alSourcePlayAtTimevSOFT ] ---

    public static void nalSourcePlayAtTimevSOFT(int n, long sources, long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePJV(n, sources, start_time, __functionAddress);
    }

    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType("ALuint const *") IntBuffer sources, @NativeType("ALint64SOFT") long start_time) {
        nalSourcePlayAtTimevSOFT(sources.remaining(), memAddress(sources), start_time);
    }

    /** Array version of: {@link #alSourcePlayAtTimevSOFT SourcePlayAtTimevSOFT} */
    @NativeType("ALvoid")
    public static void alSourcePlayAtTimevSOFT(@NativeType("ALuint const *") int[] sources, @NativeType("ALint64SOFT") long start_time) {
        long __functionAddress = AL.getICD().alSourcePlayAtTimevSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePJV(sources.length, sources, start_time, __functionAddress);
    }

}