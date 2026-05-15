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
    public static SOFTSystemEventProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SOFTSystemEventProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SOFTSystemEventProc} instance that delegates to the specified {@code SOFTSystemEventProcI} instance. */
    public static SOFTSystemEventProc create(SOFTSystemEventProcI instance) { return create(instance, instance.address()); }

    private static SOFTSystemEventProc create(SOFTSystemEventProcI instance, long functionPointer) {
        return instance instanceof SOFTSystemEventProc
            ? (SOFTSystemEventProc)instance
            : new SOFTSystemEventProc(functionPointer) {
                @Override public void invoke(int eventType, int deviceType, long device, int length, long message, long userParam) {
                    instance.invoke(eventType, deviceType, device, length, message, userParam);
                }
            };
    }

    protected SOFTSystemEventProc() {
        super(DESCRIPTOR);
    }

    SOFTSystemEventProc(long functionPointer) {
        super(functionPointer);
    }

}