/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ope_packet_func} */
public abstract class OPEPacketFunc extends Callback implements OPEPacketFuncI {

    /**
     * Creates a {@code OPEPacketFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPEPacketFunc}
     */
    public static OPEPacketFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable OPEPacketFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code OPEPacketFunc} instance that delegates to the specified {@code OPEPacketFuncI} instance. */
    public static OPEPacketFunc create(OPEPacketFuncI instance) { return create(instance, instance.address()); }

    private static OPEPacketFunc create(OPEPacketFuncI instance, long functionPointer) {
        return instance instanceof OPEPacketFunc
            ? (OPEPacketFunc)instance
            : new OPEPacketFunc(functionPointer) {
                @Override public void invoke(long user_data, long packet_ptr, int packet_len, int flags) {
                    instance.invoke(user_data, packet_ptr, packet_len, flags);
                }
            };
    }

    protected OPEPacketFunc() {
        super(DESCRIPTOR);
    }

    OPEPacketFunc(long functionPointer) {
        super(functionPointer);
    }

}