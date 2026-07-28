/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke glsl_free_include_result_func} */
public abstract class GLSLFreeIncludeResultFunc extends Callback implements GLSLFreeIncludeResultFuncI {

    /**
     * Creates a {@code GLSLFreeIncludeResultFunc} instance from the specified function pointer.
     *
     * @return the new {@code GLSLFreeIncludeResultFunc}
     */
    public static GLSLFreeIncludeResultFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLSLFreeIncludeResultFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code GLSLFreeIncludeResultFunc} instance that delegates to the specified {@code GLSLFreeIncludeResultFuncI} instance. */
    public static GLSLFreeIncludeResultFunc create(GLSLFreeIncludeResultFuncI instance) { return create(instance, instance.address()); }

    private static GLSLFreeIncludeResultFunc create(GLSLFreeIncludeResultFuncI instance, long functionPointer) {
        return instance instanceof GLSLFreeIncludeResultFunc
            ? (GLSLFreeIncludeResultFunc)instance
            : new GLSLFreeIncludeResultFunc(functionPointer) {
                @Override public int invoke(long ctx, long result) {
                    return instance.invoke(ctx, result);
                }
            };
    }

    protected GLSLFreeIncludeResultFunc() {
        super(DESCRIPTOR);
    }

    GLSLFreeIncludeResultFunc(long functionPointer) {
        super(functionPointer);
    }

}