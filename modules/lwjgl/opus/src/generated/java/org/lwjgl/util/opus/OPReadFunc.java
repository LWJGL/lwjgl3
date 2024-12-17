/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke op_read_func} */
public abstract class OPReadFunc extends Callback implements OPReadFuncI {

    /**
     * Creates a {@code OPReadFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPReadFunc}
     */
    public static OPReadFunc create(long functionPointer) {
        OPReadFuncI instance = Callback.get(functionPointer);
        return instance instanceof OPReadFunc
            ? (OPReadFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable OPReadFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OPReadFunc} instance that delegates to the specified {@code OPReadFuncI} instance. */
    public static OPReadFunc create(OPReadFuncI instance) {
        return instance instanceof OPReadFunc
            ? (OPReadFunc)instance
            : new Container(instance.address(), instance);
    }

    protected OPReadFunc() {
        super(CIF);
    }

    OPReadFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends OPReadFunc {

        private final OPReadFuncI delegate;

        Container(long functionPointer, OPReadFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long _stream, long _ptr, int _nbytes) {
            return delegate.invoke(_stream, _ptr, _nbytes);
        }

    }

}