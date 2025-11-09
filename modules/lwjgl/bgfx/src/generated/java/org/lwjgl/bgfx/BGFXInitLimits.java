/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct bgfx_init_limits_t {
 *     uint16_t maxEncoders;
 *     uint32_t minResourceCbSize;
 *     uint32_t maxTransientVbSize;
 *     uint32_t maxTransientIbSize;
 *     uint32_t minUniformBufferSize;
 * }}</pre>
 */
@NativeType("struct bgfx_init_limits_t")
public class BGFXInitLimits extends Struct<BGFXInitLimits> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MAXENCODERS,
        MINRESOURCECBSIZE,
        MAXTRANSIENTVBSIZE,
        MAXTRANSIENTIBSIZE,
        MINUNIFORMBUFFERSIZE;

    static {
        Layout layout = __struct(
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MAXENCODERS = layout.offsetof(0);
        MINRESOURCECBSIZE = layout.offsetof(1);
        MAXTRANSIENTVBSIZE = layout.offsetof(2);
        MAXTRANSIENTIBSIZE = layout.offsetof(3);
        MINUNIFORMBUFFERSIZE = layout.offsetof(4);
    }

    protected BGFXInitLimits(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BGFXInitLimits create(long address, @Nullable ByteBuffer container) {
        return new BGFXInitLimits(address, container);
    }

    /**
     * Creates a {@code BGFXInitLimits} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXInitLimits(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code maxEncoders} field. */
    @NativeType("uint16_t")
    public short maxEncoders() { return nmaxEncoders(address()); }
    /** @return the value of the {@code minResourceCbSize} field. */
    @NativeType("uint32_t")
    public int minResourceCbSize() { return nminResourceCbSize(address()); }
    /** @return the value of the {@code maxTransientVbSize} field. */
    @NativeType("uint32_t")
    public int maxTransientVbSize() { return nmaxTransientVbSize(address()); }
    /** @return the value of the {@code maxTransientIbSize} field. */
    @NativeType("uint32_t")
    public int maxTransientIbSize() { return nmaxTransientIbSize(address()); }
    /** @return the value of the {@code minUniformBufferSize} field. */
    @NativeType("uint32_t")
    public int minUniformBufferSize() { return nminUniformBufferSize(address()); }

    /** Sets the specified value to the {@code maxEncoders} field. */
    public BGFXInitLimits maxEncoders(@NativeType("uint16_t") short value) { nmaxEncoders(address(), value); return this; }
    /** Sets the specified value to the {@code minResourceCbSize} field. */
    public BGFXInitLimits minResourceCbSize(@NativeType("uint32_t") int value) { nminResourceCbSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxTransientVbSize} field. */
    public BGFXInitLimits maxTransientVbSize(@NativeType("uint32_t") int value) { nmaxTransientVbSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxTransientIbSize} field. */
    public BGFXInitLimits maxTransientIbSize(@NativeType("uint32_t") int value) { nmaxTransientIbSize(address(), value); return this; }
    /** Sets the specified value to the {@code minUniformBufferSize} field. */
    public BGFXInitLimits minUniformBufferSize(@NativeType("uint32_t") int value) { nminUniformBufferSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXInitLimits set(
        short maxEncoders,
        int minResourceCbSize,
        int maxTransientVbSize,
        int maxTransientIbSize,
        int minUniformBufferSize
    ) {
        maxEncoders(maxEncoders);
        minResourceCbSize(minResourceCbSize);
        maxTransientVbSize(maxTransientVbSize);
        maxTransientIbSize(maxTransientIbSize);
        minUniformBufferSize(minUniformBufferSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXInitLimits set(BGFXInitLimits src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXInitLimits} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXInitLimits malloc() {
        return new BGFXInitLimits(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code BGFXInitLimits} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXInitLimits calloc() {
        return new BGFXInitLimits(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code BGFXInitLimits} instance allocated with {@link BufferUtils}. */
    public static BGFXInitLimits create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BGFXInitLimits(memAddress(container), container);
    }

    /** Returns a new {@code BGFXInitLimits} instance for the specified memory address. */
    public static BGFXInitLimits create(long address) {
        return new BGFXInitLimits(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BGFXInitLimits createSafe(long address) {
        return address == NULL ? null : new BGFXInitLimits(address, null);
    }

    /**
     * Returns a new {@code BGFXInitLimits} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInitLimits malloc(MemoryStack stack) {
        return new BGFXInitLimits(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code BGFXInitLimits} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInitLimits calloc(MemoryStack stack) {
        return new BGFXInitLimits(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    // -----------------------------------

    /** Unsafe version of {@link #maxEncoders}. */
    public static short nmaxEncoders(long struct) { return memGetShort(struct + BGFXInitLimits.MAXENCODERS); }
    /** Unsafe version of {@link #minResourceCbSize}. */
    public static int nminResourceCbSize(long struct) { return memGetInt(struct + BGFXInitLimits.MINRESOURCECBSIZE); }
    /** Unsafe version of {@link #maxTransientVbSize}. */
    public static int nmaxTransientVbSize(long struct) { return memGetInt(struct + BGFXInitLimits.MAXTRANSIENTVBSIZE); }
    /** Unsafe version of {@link #maxTransientIbSize}. */
    public static int nmaxTransientIbSize(long struct) { return memGetInt(struct + BGFXInitLimits.MAXTRANSIENTIBSIZE); }
    /** Unsafe version of {@link #minUniformBufferSize}. */
    public static int nminUniformBufferSize(long struct) { return memGetInt(struct + BGFXInitLimits.MINUNIFORMBUFFERSIZE); }

    /** Unsafe version of {@link #maxEncoders(short) maxEncoders}. */
    public static void nmaxEncoders(long struct, short value) { memPutShort(struct + BGFXInitLimits.MAXENCODERS, value); }
    /** Unsafe version of {@link #minResourceCbSize(int) minResourceCbSize}. */
    public static void nminResourceCbSize(long struct, int value) { memPutInt(struct + BGFXInitLimits.MINRESOURCECBSIZE, value); }
    /** Unsafe version of {@link #maxTransientVbSize(int) maxTransientVbSize}. */
    public static void nmaxTransientVbSize(long struct, int value) { memPutInt(struct + BGFXInitLimits.MAXTRANSIENTVBSIZE, value); }
    /** Unsafe version of {@link #maxTransientIbSize(int) maxTransientIbSize}. */
    public static void nmaxTransientIbSize(long struct, int value) { memPutInt(struct + BGFXInitLimits.MAXTRANSIENTIBSIZE, value); }
    /** Unsafe version of {@link #minUniformBufferSize(int) minUniformBufferSize}. */
    public static void nminUniformBufferSize(long struct, int value) { memPutInt(struct + BGFXInitLimits.MINUNIFORMBUFFERSIZE, value); }

}