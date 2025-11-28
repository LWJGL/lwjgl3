/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke glsl_include_local_func} */
public abstract class GLSLIncludeLocalFunc extends Callback implements GLSLIncludeLocalFuncI {

    /**
     * Creates a {@code GLSLIncludeLocalFunc} instance from the specified function pointer.
     *
     * @return the new {@code GLSLIncludeLocalFunc}
     */
    public static GLSLIncludeLocalFunc create(long functionPointer) {
        GLSLIncludeLocalFuncI instance = Callback.get(functionPointer);
        return instance instanceof GLSLIncludeLocalFunc
            ? (GLSLIncludeLocalFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLSLIncludeLocalFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLSLIncludeLocalFunc} instance that delegates to the specified {@code GLSLIncludeLocalFuncI} instance. */
    public static GLSLIncludeLocalFunc create(GLSLIncludeLocalFuncI instance) {
        return instance instanceof GLSLIncludeLocalFunc
            ? (GLSLIncludeLocalFunc)instance
            : new Container(instance.address(), instance);
    }

    protected GLSLIncludeLocalFunc() {
        super(DESCRIPTOR);
    }

    GLSLIncludeLocalFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends GLSLIncludeLocalFunc {

        private final GLSLIncludeLocalFuncI delegate;

        Container(long functionPointer, GLSLIncludeLocalFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long ctx, long header_name, long includer_name, long include_depth) {
            return delegate.invoke(ctx, header_name, includer_name, include_depth);
        }

    }

}