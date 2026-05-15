/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Stream_IoFunc} */
public abstract class FT_Stream_IoFunc extends Callback implements FT_Stream_IoFuncI {

    /**
     * Creates a {@code FT_Stream_IoFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Stream_IoFunc}
     */
    public static FT_Stream_IoFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Stream_IoFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Stream_IoFunc} instance that delegates to the specified {@code FT_Stream_IoFuncI} instance. */
    public static FT_Stream_IoFunc create(FT_Stream_IoFuncI instance) { return create(instance, instance.address()); }

    private static FT_Stream_IoFunc create(FT_Stream_IoFuncI instance, long functionPointer) {
        return instance instanceof FT_Stream_IoFunc
            ? (FT_Stream_IoFunc)instance
            : new FT_Stream_IoFunc(functionPointer) {
                @Override public long invoke(long stream, long offset, long buffer, long count) {
                    return instance.invoke(stream, offset, buffer, count);
                }
            };
    }

    protected FT_Stream_IoFunc() {
        super(DESCRIPTOR);
    }

    FT_Stream_IoFunc(long functionPointer) {
        super(functionPointer);
    }

}