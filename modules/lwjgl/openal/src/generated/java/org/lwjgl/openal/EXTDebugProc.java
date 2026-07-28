/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ALDEBUGPROCEXT} */
public abstract class EXTDebugProc extends Callback implements EXTDebugProcI {

    /**
     * Creates a {@code EXTDebugProc} instance from the specified function pointer.
     *
     * @return the new {@code EXTDebugProc}
     */
    public static EXTDebugProc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable EXTDebugProc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code EXTDebugProc} instance that delegates to the specified {@code EXTDebugProcI} instance. */
    public static EXTDebugProc create(EXTDebugProcI instance) { return create(instance, instance.address()); }

    private static EXTDebugProc create(EXTDebugProcI instance, long functionPointer) {
        return instance instanceof EXTDebugProc
            ? (EXTDebugProc)instance
            : new EXTDebugProc(functionPointer) {
                @Override public void invoke(int source, int type, int id, int severity, int length, long message, long userParam) {
                    instance.invoke(source, type, id, severity, length, message, userParam);
                }
            };
    }

    protected EXTDebugProc() {
        super(DESCRIPTOR);
    }

    EXTDebugProc(long functionPointer) {
        super(functionPointer);
    }

}