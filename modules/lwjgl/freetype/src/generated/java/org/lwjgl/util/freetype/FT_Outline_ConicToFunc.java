/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke FT_Outline_ConicToFunc} */
public abstract class FT_Outline_ConicToFunc extends Callback implements FT_Outline_ConicToFuncI {

    /**
     * Creates a {@code FT_Outline_ConicToFunc} instance from the specified function pointer.
     *
     * @return the new {@code FT_Outline_ConicToFunc}
     */
    public static FT_Outline_ConicToFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable FT_Outline_ConicToFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code FT_Outline_ConicToFunc} instance that delegates to the specified {@code FT_Outline_ConicToFuncI} instance. */
    public static FT_Outline_ConicToFunc create(FT_Outline_ConicToFuncI instance) { return create(instance, instance.address()); }

    private static FT_Outline_ConicToFunc create(FT_Outline_ConicToFuncI instance, long functionPointer) {
        return instance instanceof FT_Outline_ConicToFunc
            ? (FT_Outline_ConicToFunc)instance
            : new FT_Outline_ConicToFunc(functionPointer) {
                @Override public int invoke(long control, long to, long user) {
                    return instance.invoke(control, to, user);
                }
            };
    }

    protected FT_Outline_ConicToFunc() {
        super(DESCRIPTOR);
    }

    FT_Outline_ConicToFunc(long functionPointer) {
        super(functionPointer);
    }

}