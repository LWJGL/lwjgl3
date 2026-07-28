/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Realloc_Func} */
public abstract class FT_Realloc_Func extends Callback implements FT_Realloc_FuncI {

    /**
     * Creates a {@code FT_Realloc_Func} instance from the specified function pointer.
     *
     * @return the new {@code FT_Realloc_Func}
     */
    public static FT_Realloc_Func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Realloc_Func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Realloc_Func} instance that delegates to the specified {@code FT_Realloc_FuncI} instance. */
    public static FT_Realloc_Func create(FT_Realloc_FuncI instance) { return create(instance, instance.address()); }

    private static FT_Realloc_Func create(FT_Realloc_FuncI instance, long functionPointer) {
        return instance instanceof FT_Realloc_Func
            ? (FT_Realloc_Func)instance
            : new FT_Realloc_Func(functionPointer) {
                @Override public long invoke(long memory, long cur_size, long new_size, long block) {
                    return instance.invoke(memory, cur_size, new_size, block);
                }
            };
    }

    protected FT_Realloc_Func() {
        super(DESCRIPTOR);
    }

    FT_Realloc_Func(long functionPointer) {
        super(functionPointer);
    }

}