/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke glsl_include_system_func} */
public abstract class GLSLIncludeSystemFunc extends Callback implements GLSLIncludeSystemFuncI {

    /**
     * Creates a {@code GLSLIncludeSystemFunc} instance from the specified function pointer.
     *
     * @return the new {@code GLSLIncludeSystemFunc}
     */
    public static GLSLIncludeSystemFunc create(long functionPointer) {
        GLSLIncludeSystemFuncI instance = Callback.get(functionPointer);
        return instance instanceof GLSLIncludeSystemFunc
            ? (GLSLIncludeSystemFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable GLSLIncludeSystemFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code GLSLIncludeSystemFunc} instance that delegates to the specified {@code GLSLIncludeSystemFuncI} instance. */
    public static GLSLIncludeSystemFunc create(GLSLIncludeSystemFuncI instance) {
        return instance instanceof GLSLIncludeSystemFunc
            ? (GLSLIncludeSystemFunc)instance
            : new Container(instance.address(), instance);
    }

    protected GLSLIncludeSystemFunc() {
        super(DESCRIPTOR);
    }

    GLSLIncludeSystemFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends GLSLIncludeSystemFunc {

        private final GLSLIncludeSystemFuncI delegate;

        Container(long functionPointer, GLSLIncludeSystemFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long ctx, long header_name, long includer_name, long include_depth) {
            return delegate.invoke(ctx, header_name, includer_name, include_depth);
        }

    }

}