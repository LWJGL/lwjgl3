/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ALEVENTPROCSOFT} */
public abstract class SOFTEventProc extends Callback implements SOFTEventProcI {

    /**
     * Creates a {@code SOFTEventProc} instance from the specified function pointer.
     *
     * @return the new {@code SOFTEventProc}
     */
    public static SOFTEventProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SOFTEventProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SOFTEventProc} instance that delegates to the specified {@code SOFTEventProcI} instance. */
    public static SOFTEventProc create(SOFTEventProcI instance) { return create(instance, instance.address()); }

    private static SOFTEventProc create(SOFTEventProcI instance, long functionPointer) {
        return instance instanceof SOFTEventProc
            ? (SOFTEventProc)instance
            : new SOFTEventProc(functionPointer) {
                @Override public void invoke(int eventType, int object, int param, int length, long message, long userParam) {
                    instance.invoke(eventType, object, param, length, message, userParam);
                }
            };
    }

    protected SOFTEventProc() {
        super(DESCRIPTOR);
    }

    SOFTEventProc(long functionPointer) {
        super(functionPointer);
    }

}