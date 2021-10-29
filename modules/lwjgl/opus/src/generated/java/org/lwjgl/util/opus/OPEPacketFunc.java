/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set with {@link OpusEnc#OPE_SET_PACKET_CALLBACK_REQUEST SET_PACKET_CALLBACK_REQUEST}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *user_data,
 *     unsigned char const *packet_ptr,
 *     opus_int32 packet_len,
 *     opus_uint32 flags
 * )</code></pre>
 */
public abstract class OPEPacketFunc extends Callback implements OPEPacketFuncI {

    /**
     * Creates a {@code OPEPacketFunc} instance from the specified function pointer.
     *
     * @return the new {@code OPEPacketFunc}
     */
    public static OPEPacketFunc create(long functionPointer) {
        OPEPacketFuncI instance = Callback.get(functionPointer);
        return instance instanceof OPEPacketFunc
            ? (OPEPacketFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static OPEPacketFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code OPEPacketFunc} instance that delegates to the specified {@code OPEPacketFuncI} instance. */
    public static OPEPacketFunc create(OPEPacketFuncI instance) {
        return instance instanceof OPEPacketFunc
            ? (OPEPacketFunc)instance
            : new Container(instance.address(), instance);
    }

    protected OPEPacketFunc() {
        super(CIF);
    }

    OPEPacketFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends OPEPacketFunc {

        private final OPEPacketFuncI delegate;

        Container(long functionPointer, OPEPacketFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long user_data, long packet_ptr, int packet_len, int flags) {
            delegate.invoke(user_data, packet_ptr, packet_len, flags);
        }

    }

}