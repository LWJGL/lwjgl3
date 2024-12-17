/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FMOD_SOUND_PCMSETPOS_CALLBACK} */
public abstract class FMOD_SOUND_PCMSETPOS_CALLBACK extends Callback implements FMOD_SOUND_PCMSETPOS_CALLBACKI {

    /**
     * Creates a {@code FMOD_SOUND_PCMSETPOS_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_SOUND_PCMSETPOS_CALLBACK}
     */
    public static FMOD_SOUND_PCMSETPOS_CALLBACK create(long functionPointer) {
        FMOD_SOUND_PCMSETPOS_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_SOUND_PCMSETPOS_CALLBACK
            ? (FMOD_SOUND_PCMSETPOS_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_SOUND_PCMSETPOS_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_SOUND_PCMSETPOS_CALLBACK} instance that delegates to the specified {@code FMOD_SOUND_PCMSETPOS_CALLBACKI} instance. */
    public static FMOD_SOUND_PCMSETPOS_CALLBACK create(FMOD_SOUND_PCMSETPOS_CALLBACKI instance) {
        return instance instanceof FMOD_SOUND_PCMSETPOS_CALLBACK
            ? (FMOD_SOUND_PCMSETPOS_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_SOUND_PCMSETPOS_CALLBACK() {
        super(CIF);
    }

    FMOD_SOUND_PCMSETPOS_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_SOUND_PCMSETPOS_CALLBACK {

        private final FMOD_SOUND_PCMSETPOS_CALLBACKI delegate;

        Container(long functionPointer, FMOD_SOUND_PCMSETPOS_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long sound, int subsound, int position, int postype) {
            return delegate.invoke(sound, subsound, position, postype);
        }

    }

}