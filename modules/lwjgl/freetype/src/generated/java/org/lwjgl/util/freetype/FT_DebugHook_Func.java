/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_DebugHook_Func} */
public abstract class FT_DebugHook_Func extends Callback implements FT_DebugHook_FuncI {

    /**
     * Creates a {@code FT_DebugHook_Func} instance from the specified function pointer.
     *
     * @return the new {@code FT_DebugHook_Func}
     */
    public static FT_DebugHook_Func create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_DebugHook_Func createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_DebugHook_Func} instance that delegates to the specified {@code FT_DebugHook_FuncI} instance. */
    public static FT_DebugHook_Func create(FT_DebugHook_FuncI instance) { return create(instance, instance.address()); }

    private static FT_DebugHook_Func create(FT_DebugHook_FuncI instance, long functionPointer) {
        return instance instanceof FT_DebugHook_Func
            ? (FT_DebugHook_Func)instance
            : new FT_DebugHook_Func(functionPointer) {
                @Override public int invoke(long arg) {
                    return instance.invoke(arg);
                }
            };
    }

    protected FT_DebugHook_Func() {
        super(DESCRIPTOR);
    }

    FT_DebugHook_Func(long functionPointer) {
        super(functionPointer);
    }

}