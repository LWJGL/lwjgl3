/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke EGLSetBlobFuncANDROID} */
public abstract class EGLSetBlobFuncANDROID extends Callback implements EGLSetBlobFuncANDROIDI {

    /**
     * Creates a {@code EGLSetBlobFuncANDROID} instance from the specified function pointer.
     *
     * @return the new {@code EGLSetBlobFuncANDROID}
     */
    public static EGLSetBlobFuncANDROID create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable EGLSetBlobFuncANDROID createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code EGLSetBlobFuncANDROID} instance that delegates to the specified {@code EGLSetBlobFuncANDROIDI} instance. */
    public static EGLSetBlobFuncANDROID create(EGLSetBlobFuncANDROIDI instance) { return create(instance, instance.address()); }

    private static EGLSetBlobFuncANDROID create(EGLSetBlobFuncANDROIDI instance, long functionPointer) {
        return instance instanceof EGLSetBlobFuncANDROID
            ? (EGLSetBlobFuncANDROID)instance
            : new EGLSetBlobFuncANDROID(functionPointer) {
                @Override public void invoke(long key, long keySize, long value, long valueSize) {
                    instance.invoke(key, keySize, value, valueSize);
                }
            };
    }

    protected EGLSetBlobFuncANDROID() {
        super(DESCRIPTOR);
    }

    EGLSetBlobFuncANDROID(long functionPointer) {
        super(functionPointer);
    }

}