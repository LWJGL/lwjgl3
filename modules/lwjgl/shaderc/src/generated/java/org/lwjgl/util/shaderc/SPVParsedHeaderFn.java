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
    public static SPVParsedHeaderFn create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SPVParsedHeaderFn createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SPVParsedHeaderFn} instance that delegates to the specified {@code SPVParsedHeaderFnI} instance. */
    public static SPVParsedHeaderFn create(SPVParsedHeaderFnI instance) { return create(instance, instance.address()); }

    private static SPVParsedHeaderFn create(SPVParsedHeaderFnI instance, long functionPointer) {
        return instance instanceof SPVParsedHeaderFn
            ? (SPVParsedHeaderFn)instance
            : new SPVParsedHeaderFn(functionPointer) {
                @Override public int invoke(long user_data, int endian, int magic, int version, int generator, int id_bound, int reserved) {
                    return instance.invoke(user_data, endian, magic, version, generator, id_bound, reserved);
                }
            };
    }

    protected SPVParsedHeaderFn() {
        super(DESCRIPTOR);
    }

    SPVParsedHeaderFn(long functionPointer) {
        super(functionPointer);
    }

}