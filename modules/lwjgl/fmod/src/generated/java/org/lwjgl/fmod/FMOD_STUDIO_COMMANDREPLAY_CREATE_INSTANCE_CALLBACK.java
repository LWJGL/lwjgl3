/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * FMOD_RESULT (*{@link #invoke}) (
 *     FMOD_STUDIO_COMMANDREPLAY *replay,
 *     int commandindex,
 *     FMOD_STUDIO_EVENTDESCRIPTION *eventdescription,
 *     FMOD_STUDIO_EVENTINSTANCE **instance,
 *     void *userdata
 * )</code></pre>
 */
public abstract class FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK extends Callback implements FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI {

    /**
     * Creates a {@code FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK} instance from the specified function pointer.
     *
     * @return the new {@code FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK}
     */
    public static FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK create(long functionPointer) {
        FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI instance = Callback.get(functionPointer);
        return instance instanceof FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK
            ? (FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK} instance that delegates to the specified {@code FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI} instance. */
    public static FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK create(FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI instance) {
        return instance instanceof FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK
            ? (FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK)instance
            : new Container(instance.address(), instance);
    }

    protected FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK() {
        super(CIF);
    }

    FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACK {

        private final FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI delegate;

        Container(long functionPointer, FMOD_STUDIO_COMMANDREPLAY_CREATE_INSTANCE_CALLBACKI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long replay, int commandindex, long eventdescription, long instance, long userdata) {
            return delegate.invoke(replay, commandindex, eventdescription, instance, userdata);
        }

    }

}