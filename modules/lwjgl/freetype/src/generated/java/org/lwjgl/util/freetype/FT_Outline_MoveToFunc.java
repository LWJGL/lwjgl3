/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Outline_MoveToFunc} */
public abstract class FT_Outline_MoveToFunc extends Callback implements FT_Outline_MoveToFuncI {

    /**
     * Creates a {@code FT_Outline_MoveToFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Outline_MoveToFunc}
     */
    public static FT_Outline_MoveToFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Outline_MoveToFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Outline_MoveToFunc} instance that delegates to the specified {@code FT_Outline_MoveToFuncI} instance. */
    public static FT_Outline_MoveToFunc create(FT_Outline_MoveToFuncI instance) { return create(instance, instance.address()); }

    private static FT_Outline_MoveToFunc create(FT_Outline_MoveToFuncI instance, long functionPointer) {
        return instance instanceof FT_Outline_MoveToFunc
            ? (FT_Outline_MoveToFunc)instance
            : new FT_Outline_MoveToFunc(functionPointer) {
                @Override public int invoke(long to, long user) {
                    return instance.invoke(to, user);
                }
            };
    }

    protected FT_Outline_MoveToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_MoveToFunc(long functionPointer) {
        super(functionPointer);
    }

}