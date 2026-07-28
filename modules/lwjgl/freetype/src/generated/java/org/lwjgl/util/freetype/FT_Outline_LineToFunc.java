/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Outline_LineToFunc} */
public abstract class FT_Outline_LineToFunc extends Callback implements FT_Outline_LineToFuncI {

    /**
     * Creates a {@code FT_Outline_LineToFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Outline_LineToFunc}
     */
    public static FT_Outline_LineToFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Outline_LineToFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Outline_LineToFunc} instance that delegates to the specified {@code FT_Outline_LineToFuncI} instance. */
    public static FT_Outline_LineToFunc create(FT_Outline_LineToFuncI instance) { return create(instance, instance.address()); }

    private static FT_Outline_LineToFunc create(FT_Outline_LineToFuncI instance, long functionPointer) {
        return instance instanceof FT_Outline_LineToFunc
            ? (FT_Outline_LineToFunc)instance
            : new FT_Outline_LineToFunc(functionPointer) {
                @Override public int invoke(long to, long user) {
                    return instance.invoke(to, user);
                }
            };
    }

    protected FT_Outline_LineToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_LineToFunc(long functionPointer) {
        super(functionPointer);
    }

}