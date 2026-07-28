/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CLReportLiveObjectsAlteraCallback extends Callback implements CLReportLiveObjectsAlteraCallbackI {

    /**
     * Creates a {@code CLReportLiveObjectsAlteraCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLReportLiveObjectsAlteraCallback}
     */
    public static CLReportLiveObjectsAlteraCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLReportLiveObjectsAlteraCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLReportLiveObjectsAlteraCallback} instance that delegates to the specified {@code CLReportLiveObjectsAlteraCallbackI} instance. */
    public static CLReportLiveObjectsAlteraCallback create(CLReportLiveObjectsAlteraCallbackI instance) { return create(instance, instance.address()); }

    private static CLReportLiveObjectsAlteraCallback create(CLReportLiveObjectsAlteraCallbackI instance, long functionPointer) {
        return instance instanceof CLReportLiveObjectsAlteraCallback
            ? (CLReportLiveObjectsAlteraCallback)instance
            : new CLReportLiveObjectsAlteraCallback(functionPointer) {
                @Override public void invoke(long user_data, long obj_ptr, long type_name, int refcount) {
                    instance.invoke(user_data, obj_ptr, type_name, refcount);
                }
            };
    }

    protected CLReportLiveObjectsAlteraCallback() {
        super(DESCRIPTOR);
    }

    CLReportLiveObjectsAlteraCallback(long functionPointer) {
        super(functionPointer);
    }

}