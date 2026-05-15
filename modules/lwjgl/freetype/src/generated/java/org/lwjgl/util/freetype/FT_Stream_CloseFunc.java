/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Stream_CloseFunc} */
public abstract class FT_Stream_CloseFunc extends Callback implements FT_Stream_CloseFuncI {

    /**
     * Creates a {@code FT_Stream_CloseFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Stream_CloseFunc}
     */
    public static FT_Stream_CloseFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Stream_CloseFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Stream_CloseFunc} instance that delegates to the specified {@code FT_Stream_CloseFuncI} instance. */
    public static FT_Stream_CloseFunc create(FT_Stream_CloseFuncI instance) { return create(instance, instance.address()); }

    private static FT_Stream_CloseFunc create(FT_Stream_CloseFuncI instance, long functionPointer) {
        return instance instanceof FT_Stream_CloseFunc
            ? (FT_Stream_CloseFunc)instance
            : new FT_Stream_CloseFunc(functionPointer) {
                @Override public void invoke(long stream) {
                    instance.invoke(stream);
                }
            };
    }

    protected FT_Stream_CloseFunc() {
        super(DESCRIPTOR);
    }

    FT_Stream_CloseFunc(long functionPointer) {
        super(functionPointer);
    }

}