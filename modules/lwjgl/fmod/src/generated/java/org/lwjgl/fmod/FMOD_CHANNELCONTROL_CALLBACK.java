/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     FMOD_CHANNELCONTROL *channelcontrol,
 *     FMOD_CHANNELCONTROL_TYPE controltype,
 *     FMOD_CHANNELCONTROL_CALLBACK_TYPE callbacktype,
 *     void *commanddata1,
 *     void *commanddata2
 * )</code></pre>
 */
public abstract class FMOD_CHANNELCONTROL_CALLBACK extends Callback implements FMOD_CHANNELCONTROL_CALLBACKI {

    /**
     * Creates a {@code FMOD_CHANNELCONTROL_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_CHANNELCONTROL_CALLBACK}
     */
    public static FMOD_CHANNELCONTROL_CALLBACK create(long functionPointer) {
        FMOD_CHANNELCONTROL_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_CHANNELCONTROL_CALLBACK
            ? (FMOD_CHANNELCONTROL_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static FMOD_CHANNELCONTROL_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_CHANNELCONTROL_CALLBACK} instance that delegates to the specified {@code FMOD_CHANNELCONTROL_CALLBACKI} instance. */
    public static FMOD_CHANNELCONTROL_CALLBACK create(FMOD_CHANNELCONTROL_CALLBACKI instance) {
        return instance instanceof FMOD_CHANNELCONTROL_CALLBACK
            ? (FMOD_CHANNELCONTROL_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_CHANNELCONTROL_CALLBACK() {
        super(CIF);
    }

    FMOD_CHANNELCONTROL_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_CHANNELCONTROL_CALLBACK {

        private final FMOD_CHANNELCONTROL_CALLBACKI delegate;

        Container(long functionPointer, FMOD_CHANNELCONTROL_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long channelcontrol, int controltype, int callbacktype, long commanddata1, long commanddata2) {
            return delegate.invoke(channelcontrol, controltype, callbacktype, commanddata1, commanddata2);
        }

    }

}