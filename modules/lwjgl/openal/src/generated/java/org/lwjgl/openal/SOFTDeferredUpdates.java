/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Native bindings to the <a href="https://openal-soft.org/openal-extensions/SOFT_deferred_updates.txt">SOFT_deferred_updates</a> extension.
 * 
 * <p>This extension allows applications to defer playback state updates. With unextended OpenAL, the playback state would respond to changes as soon as it
 * could handle them, which makes it effectively impossible to ensure multiple changes occur at the same time without the potential of a "partial" update
 * (where one change is heard without the other). This extension provides a way to prevent state updates from occuring until they've all been done, where
 * they will all apply at once.</p>
 */
public class SOFTDeferredUpdates {

    /** Accepted by the {@code paramName} parameter of {@link AL10#alGetBoolean GetBoolean}, {@link AL10#alGetBooleanv GetBooleanv} (as well as the Integer, Float, and Double variants). */
    public static final int AL_DEFERRED_UPDATES_SOFT = 0xC002;

    protected SOFTDeferredUpdates() {
        throw new UnsupportedOperationException();
    }

    // --- [ alDeferUpdatesSOFT ] ---

    /**
     * Sometimes it is desirable to ensure multiple state changes take effect at the same time. Normally this isn't possible due to the AL processing updates
     * asychronously, so the playback state can be updated with only part of the changes having been specified. An application can prevent these updates by
     * calling this function.
     * 
     * <p>When called, samples will continue to render and be sent to the output device, but the effects of changing playback properties, such as the source or
     * listener gain, or auxiliary slot gain or effect if EFX is supported, among others, will be deferred. Multiple changes can be batched so that they all
     * apply at once at a later time.</p>
     */
    @NativeType("ALvoid")
    public static void alDeferUpdatesSOFT() {
        long __functionAddress = AL.getICD().alDeferUpdatesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

    // --- [ alProcessUpdatesSOFT ] ---

    /**
     * Resumes updates.
     * 
     * <p>Once called, all pending deferred updates will be processed. Any following state changes will also apply as normal.</p>
     */
    @NativeType("ALvoid")
    public static void alProcessUpdatesSOFT() {
        long __functionAddress = AL.getICD().alProcessUpdatesSOFT;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokeV(__functionAddress);
    }

}