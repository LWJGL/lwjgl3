/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     ALenum eventType,
 *     ALuint object,
 *     ALuint param,
 *     ALsizei length,
 *     ALchar const *message,
 *     ALvoid *userParam
 * )</code></pre>
 */
public abstract class SOFTEventProc extends Callback implements SOFTEventProcI {

    /**
     * Creates a {@code SOFTEventProc} instance from the specified function pointer.
     *
     * @return the new {@code SOFTEventProc}
     */
    public static SOFTEventProc create(long functionPointer) {
        SOFTEventProcI instance = Callback.get(functionPointer);
        return instance instanceof SOFTEventProc
            ? (SOFTEventProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static SOFTEventProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SOFTEventProc} instance that delegates to the specified {@code SOFTEventProcI} instance. */
    public static SOFTEventProc create(SOFTEventProcI instance) {
        return instance instanceof SOFTEventProc
            ? (SOFTEventProc)instance
            : new Container(instance.address(), instance);
    }

    protected SOFTEventProc() {
        super(CIF);
    }

    SOFTEventProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SOFTEventProc {

        private final SOFTEventProcI delegate;

        Container(long functionPointer, SOFTEventProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int eventType, int object, int param, int length, long message, long userParam) {
            delegate.invoke(eventType, object, param, length, message, userParam);
        }

    }

}