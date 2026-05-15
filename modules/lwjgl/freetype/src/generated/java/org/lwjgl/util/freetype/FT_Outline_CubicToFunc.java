/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Outline_CubicToFunc} */
public abstract class FT_Outline_CubicToFunc extends Callback implements FT_Outline_CubicToFuncI {

    /**
     * Creates a {@code FT_Outline_CubicToFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Outline_CubicToFunc}
     */
    public static FT_Outline_CubicToFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Outline_CubicToFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Outline_CubicToFunc} instance that delegates to the specified {@code FT_Outline_CubicToFuncI} instance. */
    public static FT_Outline_CubicToFunc create(FT_Outline_CubicToFuncI instance) { return create(instance, instance.address()); }

    private static FT_Outline_CubicToFunc create(FT_Outline_CubicToFuncI instance, long functionPointer) {
        return instance instanceof FT_Outline_CubicToFunc
            ? (FT_Outline_CubicToFunc)instance
            : new FT_Outline_CubicToFunc(functionPointer) {
                @Override public int invoke(long control1, long control2, long to, long user) {
                    return instance.invoke(control1, control2, to, user);
                }
            };
    }

    protected FT_Outline_CubicToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_CubicToFunc(long functionPointer) {
        super(functionPointer);
    }

}