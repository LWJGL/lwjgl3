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
 * Encoder stats.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_encoder_stats_t {
 *     int64_t {@link #cpuTimeBegin};
 *     int64_t {@link #cpuTimeEnd};
 * }</code></pre>
 */
@NativeType("struct bgfx_encoder_stats_t")
public class BGFXEncoderStats extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CPUTIMEBEGIN,
        CPUTIMEEND;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CPUTIMEBEGIN = layout.offsetof(0);
        CPUTIMEEND = layout.offsetof(1);
    }

    /**
     * Creates a {@code BGFXEncoderStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXEncoderStats(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** encoder thread CPU submit begin time */
    @NativeType("int64_t")
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** encoder thread CPU submit end time */
    @NativeType("int64_t")
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXEncoderStats} instance for the specified memory address. */
    public static BGFXEncoderStats create(long address) {
        return wrap(BGFXEncoderStats.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXEncoderStats createSafe(long address) {
        return address == NULL ? null : wrap(BGFXEncoderStats.class, address);
    }

    /**
     * Create a {@link BGFXEncoderStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXEncoderStats.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXEncoderStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cpuTimeBegin}. */
    public static long ncpuTimeBegin(long struct) { return UNSAFE.getLong(null, struct + BGFXEncoderStats.CPUTIMEBEGIN); }
    /** Unsafe version of {@link #cpuTimeEnd}. */
    public static long ncpuTimeEnd(long struct) { return UNSAFE.getLong(null, struct + BGFXEncoderStats.CPUTIMEEND); }

    // -----------------------------------

    /** An array of {@link BGFXEncoderStats} structs. */
    public static class Buffer extends StructBuffer<BGFXEncoderStats, Buffer> {

        private static final BGFXEncoderStats ELEMENT_FACTORY = BGFXEncoderStats.create(-1L);

        /**
         * Creates a new {@code BGFXEncoderStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXEncoderStats#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected BGFXEncoderStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link BGFXEncoderStats#cpuTimeBegin} field. */
        @NativeType("int64_t")
        public long cpuTimeBegin() { return BGFXEncoderStats.ncpuTimeBegin(address()); }
        /** @return the value of the {@link BGFXEncoderStats#cpuTimeEnd} field. */
        @NativeType("int64_t")
        public long cpuTimeEnd() { return BGFXEncoderStats.ncpuTimeEnd(address()); }

    }

}