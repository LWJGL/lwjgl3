/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Free_Func} */
public abstract class FT_Free_Func extends Callback implements FT_Free_FuncI {

    /**
     * Creates a {@code FT_Free_Func} instance from the specified function pointer.
     *
     * @return the new {@code FT_Free_Func}
     */
    public static FT_Free_Func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Free_Func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Free_Func} instance that delegates to the specified {@code FT_Free_FuncI} instance. */
    public static FT_Free_Func create(FT_Free_FuncI instance) { return create(instance, instance.address()); }

    private static FT_Free_Func create(FT_Free_FuncI instance, long functionPointer) {
        return instance instanceof FT_Free_Func
            ? (FT_Free_Func)instance
            : new FT_Free_Func(functionPointer) {
                @Override public void invoke(long memory, long block) {
                    instance.invoke(memory, block);
                }
            };
    }

    protected FT_Free_Func() {
        super(DESCRIPTOR);
    }

    FT_Free_Func(long functionPointer) {
        super(functionPointer);
    }

}