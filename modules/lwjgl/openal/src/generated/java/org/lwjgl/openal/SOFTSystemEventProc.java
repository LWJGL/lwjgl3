/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ALCEVENTPROCTYPESOFT} */
public abstract class SOFTSystemEventProc extends Callback implements SOFTSystemEventProcI {

    /**
     * Creates a {@code SOFTSystemEventProc} instance from the specified function pointer.
     *
     * @return the new {@code SOFTSystemEventProc}
     */
    public static SOFTSystemEventProc create(long functionPointer) {
        SOFTSystemEventProcI instance = Callback.get(functionPointer);
        return instance instanceof SOFTSystemEventProc
            ? (SOFTSystemEventProc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SOFTSystemEventProc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SOFTSystemEventProc} instance that delegates to the specified {@code SOFTSystemEventProcI} instance. */
    public static SOFTSystemEventProc create(SOFTSystemEventProcI instance) {
        return instance instanceof SOFTSystemEventProc
            ? (SOFTSystemEventProc)instance
            : new Container(instance.address(), instance);
    }

    protected SOFTSystemEventProc() {
        super(CIF);
    }

    SOFTSystemEventProc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SOFTSystemEventProc {

        private final SOFTSystemEventProcI delegate;

        Container(long functionPointer, SOFTSystemEventProcI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int eventType, int deviceType, long device, int length, long message, long userParam) {
            delegate.invoke(eventType, deviceType, device, length, message, userParam);
        }

    }

}