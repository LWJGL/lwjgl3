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
 * View stats.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_view_stats_t {
 *     char {@link #name}[256];
 *     bgfx_view_id_t {@link #view};
 *     int64_t {@link #cpuTimeBegin};
 *     int64_t {@link #cpuTimeEnd};
 *     int64_t {@link #gpuTimeBegin};
 *     int64_t {@link #gpuTimeEnd};
 * }</code></pre>
 */
@NativeType("struct bgfx_view_stats_t")
public class BGFXViewStats extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        VIEW,
        CPUTIMEBEGIN,
        CPUTIMEEND,
        GPUTIMEBEGIN,
        GPUTIMEEND;

    static {
        Layout layout = __struct(
            __array(1, 256),
            __member(2),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        VIEW = layout.offsetof(1);
        CPUTIMEBEGIN = layout.offsetof(2);
        CPUTIMEEND = layout.offsetof(3);
        GPUTIMEBEGIN = layout.offsetof(4);
        GPUTIMEEND = layout.offsetof(5);
    }

    /**
     * Creates a {@code BGFXViewStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXViewStats(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** view name */
    @NativeType("char[256]")
    public ByteBuffer name() { return nname(address()); }
    /** view name */
    @NativeType("char[256]")
    public String nameString() { return nnameString(address()); }
    /** view id */
    @NativeType("bgfx_view_id_t")
    public short view() { return nview(address()); }
    /** CPU (submit) begin time */
    @NativeType("int64_t")
    public long cpuTimeBegin() { return ncpuTimeBegin(address()); }
    /** CPU (submit) end time */
    @NativeType("int64_t")
    public long cpuTimeEnd() { return ncpuTimeEnd(address()); }
    /** GPU begin time */
    @NativeType("int64_t")
    public long gpuTimeBegin() { return ngpuTimeBegin(address()); }
    /** GPU end time */
    @NativeType("int64_t")
    public long gpuTimeEnd() { return ngpuTimeEnd(address()); }

    // -----------------------------------

    /** Returns a new {@code BGFXViewStats} instance for the specified memory address. */
    public static BGFXViewStats create(long address) {
        return wrap(BGFXViewStats.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXViewStats createSafe(long address) {
        return address == NULL ? null : wrap(BGFXViewStats.class, address);
    }

    /**
     * Create a {@link BGFXViewStats.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXViewStats.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXViewStats.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + BGFXViewStats.NAME, 256); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + BGFXViewStats.NAME); }
    /** Unsafe version of {@link #view}. */
    public static short nview(long struct) { return UNSAFE.getShort(null, struct + BGFXViewStats.VIEW); }
    /** Unsafe version of {@link #cpuTimeBegin}. */
    public static long ncpuTimeBegin(long struct) { return UNSAFE.getLong(null, struct + BGFXViewStats.CPUTIMEBEGIN); }
    /** Unsafe version of {@link #cpuTimeEnd}. */
    public static long ncpuTimeEnd(long struct) { return UNSAFE.getLong(null, struct + BGFXViewStats.CPUTIMEEND); }
    /** Unsafe version of {@link #gpuTimeBegin}. */
    public static long ngpuTimeBegin(long struct) { return UNSAFE.getLong(null, struct + BGFXViewStats.GPUTIMEBEGIN); }
    /** Unsafe version of {@link #gpuTimeEnd}. */
    public static long ngpuTimeEnd(long struct) { return UNSAFE.getLong(null, struct + BGFXViewStats.GPUTIMEEND); }

    // -----------------------------------

    /** An array of {@link BGFXViewStats} structs. */
    public static class Buffer extends StructBuffer<BGFXViewStats, Buffer> {

        private static final BGFXViewStats ELEMENT_FACTORY = BGFXViewStats.create(-1L);

        /**
         * Creates a new {@code BGFXViewStats.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXViewStats#SIZEOF}, and its mark will be undefined.
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
        protected BGFXViewStats getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the {@link BGFXViewStats#name} field. */
        @NativeType("char[256]")
        public ByteBuffer name() { return BGFXViewStats.nname(address()); }
        /** @return the null-terminated string stored in the {@link BGFXViewStats#name} field. */
        @NativeType("char[256]")
        public String nameString() { return BGFXViewStats.nnameString(address()); }
        /** @return the value of the {@link BGFXViewStats#view} field. */
        @NativeType("bgfx_view_id_t")
        public short view() { return BGFXViewStats.nview(address()); }
        /** @return the value of the {@link BGFXViewStats#cpuTimeBegin} field. */
        @NativeType("int64_t")
        public long cpuTimeBegin() { return BGFXViewStats.ncpuTimeBegin(address()); }
        /** @return the value of the {@link BGFXViewStats#cpuTimeEnd} field. */
        @NativeType("int64_t")
        public long cpuTimeEnd() { return BGFXViewStats.ncpuTimeEnd(address()); }
        /** @return the value of the {@link BGFXViewStats#gpuTimeBegin} field. */
        @NativeType("int64_t")
        public long gpuTimeBegin() { return BGFXViewStats.ngpuTimeBegin(address()); }
        /** @return the value of the {@link BGFXViewStats#gpuTimeEnd} field. */
        @NativeType("int64_t")
        public long gpuTimeEnd() { return BGFXViewStats.ngpuTimeEnd(address()); }

    }

}