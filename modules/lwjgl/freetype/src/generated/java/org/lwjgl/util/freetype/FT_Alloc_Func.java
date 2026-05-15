/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Alloc_Func} */
public abstract class FT_Alloc_Func extends Callback implements FT_Alloc_FuncI {

    /**
     * Creates a {@code FT_Alloc_Func} instance from the specified function pointer.
     *
     * @return the new {@code FT_Alloc_Func}
     */
    public static FT_Alloc_Func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Alloc_Func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Alloc_Func} instance that delegates to the specified {@code FT_Alloc_FuncI} instance. */
    public static FT_Alloc_Func create(FT_Alloc_FuncI instance) { return create(instance, instance.address()); }

    private static FT_Alloc_Func create(FT_Alloc_FuncI instance, long functionPointer) {
        return instance instanceof FT_Alloc_Func
            ? (FT_Alloc_Func)instance
            : new FT_Alloc_Func(functionPointer) {
                @Override public long invoke(long memory, long size) {
                    return instance.invoke(memory, size);
                }
            };
    }

    protected FT_Alloc_Func() {
        super(DESCRIPTOR);
    }

    FT_Alloc_Func(long functionPointer) {
        super(functionPointer);
    }

}