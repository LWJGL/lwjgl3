/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to {@link STBImageWrite#stbi_zlib_compress}.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * unsigned char * (*) (
 *     unsigned char *data,
 *     int data_len,
 *     int *out_len,
 *     int quality
 * )</code></pre>
 */
public abstract class STBIZlibCompress extends Callback implements STBIZlibCompressI {

    /**
     * Creates a {@code STBIZlibCompress} instance from the specified function pointer.
     *
     * @return the new {@code STBIZlibCompress}
     */
    public static STBIZlibCompress create(long functionPointer) {
        STBIZlibCompressI instance = Callback.get(functionPointer);
        return instance instanceof STBIZlibCompress
            ? (STBIZlibCompress)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static STBIZlibCompress createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code STBIZlibCompress} instance that delegates to the specified {@code STBIZlibCompressI} instance. */
    public static STBIZlibCompress create(STBIZlibCompressI instance) {
        return instance instanceof STBIZlibCompress
            ? (STBIZlibCompress)instance
            : new Container(instance.address(), instance);
    }

    protected STBIZlibCompress() {
        super(CIF);
    }

    STBIZlibCompress(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends STBIZlibCompress {

        private final STBIZlibCompressI delegate;

        Container(long functionPointer, STBIZlibCompressI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long data, int data_len, long out_len, int quality) {
            return delegate.invoke(data, data_len, out_len, quality);
        }

    }

}