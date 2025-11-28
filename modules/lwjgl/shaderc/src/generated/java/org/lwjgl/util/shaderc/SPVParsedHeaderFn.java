/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spv_parsed_header_fn_t} */
public abstract class SPVParsedHeaderFn extends Callback implements SPVParsedHeaderFnI {

    /**
     * Creates a {@code SPVParsedHeaderFn} instance from the specified function pointer.
     *
     * @return the new {@code SPVParsedHeaderFn}
     */
    public static SPVParsedHeaderFn create(long functionPointer) {
        SPVParsedHeaderFnI instance = Callback.get(functionPointer);
        return instance instanceof SPVParsedHeaderFn
            ? (SPVParsedHeaderFn)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SPVParsedHeaderFn createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code SPVParsedHeaderFn} instance that delegates to the specified {@code SPVParsedHeaderFnI} instance. */
    public static SPVParsedHeaderFn create(SPVParsedHeaderFnI instance) {
        return instance instanceof SPVParsedHeaderFn
            ? (SPVParsedHeaderFn)instance
            : new Container(instance.address(), instance);
    }

    protected SPVParsedHeaderFn() {
        super(DESCRIPTOR);
    }

    SPVParsedHeaderFn(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends SPVParsedHeaderFn {

        private final SPVParsedHeaderFnI delegate;

        Container(long functionPointer, SPVParsedHeaderFnI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long user_data, int endian, int magic, int version, int generator, int id_bound, int reserved) {
            return delegate.invoke(user_data, endian, magic, version, generator, id_bound, reserved);
        }

    }

}