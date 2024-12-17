/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct bgfx_internal_data_t {
 *     {@link BGFXCaps bgfx_caps_t} * caps;
 *     void * context;
 * }}</pre>
 */
@NativeType("struct bgfx_internal_data_t")
public class BGFXInternalData extends Struct<BGFXInternalData> {

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

    protected BGFXInternalData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXInternalData create(long address, @Nullable ByteBuffer container) {
        return new BGFXInternalData(address, container);
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

    /** @return a {@link BGFXCaps} view of the struct pointed to by the {@code caps} field. */
    @NativeType("bgfx_caps_t *")
    public BGFXCaps caps() { return ncaps(address()); }
    /** @return the value of the {@code context} field. */
    @NativeType("void *")
    public long context() { return ncontext(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXInternalData} instance for the specified memory address. */
    public static BGFXInternalData create(long address) {
        return new BGFXInternalData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXInternalData createSafe(long address) {
        return address == NULL ? null : new BGFXInternalData(address, null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #caps}. */
    public static BGFXCaps ncaps(long struct) { return BGFXCaps.create(memGetAddress(struct + BGFXInternalData.CAPS)); }
    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + BGFXInternalData.CONTEXT); }

}