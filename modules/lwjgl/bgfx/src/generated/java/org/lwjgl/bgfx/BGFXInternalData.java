/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Internal data.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_internal_data_t {
 *     {@link BGFXCaps bgfx_caps_t} * {@link #caps};
 *     void * {@link #context};
 * }</code></pre>
 */
@NativeType("struct bgfx_internal_data_t")
public class BGFXInternalData extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CAPS,
        CONTEXT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CAPS = layout.offsetof(0);
        CONTEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code BGFXInternalData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXInternalData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** renderer capabilities */
    @NativeType("bgfx_caps_t *")
    public BGFXCaps caps() { return ncaps(address()); }
    /** GL context, or D3D device */
    @NativeType("void *")
    public long context() { return ncontext(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXInternalData} instance for the specified memory address. */
    public static BGFXInternalData create(long address) {
        return wrap(BGFXInternalData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXInternalData createSafe(long address) {
        return address == NULL ? null : wrap(BGFXInternalData.class, address);
    }

    // -----------------------------------

    /** Unsafe version of {@link #caps}. */
    public static BGFXCaps ncaps(long struct) { return BGFXCaps.create(memGetAddress(struct + BGFXInternalData.CAPS)); }
    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + BGFXInternalData.CONTEXT); }

}