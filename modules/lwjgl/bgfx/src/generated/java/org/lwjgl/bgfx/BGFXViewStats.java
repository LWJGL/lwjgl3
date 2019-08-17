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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code name[256]} &ndash; view name</li>
 * <li>{@code view} &ndash; view id</li>
 * <li>{@code cpuTimeElapsed} &ndash; CPU (submit) time elapsed</li>
 * <li>{@code gpuTimeElapsed} &ndash; GPU time elapsed</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_view_stats_t {
 *     char name[256];
 *     bgfx_view_id_t view;
 *     int64_t cpuTimeElapsed;
 *     int64_t gpuTimeElapsed;
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
        CPUTIMEELAPSED,
        GPUTIMEELAPSED;

    static {
        Layout layout = __struct(
            __array(1, 256),
            __member(2),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        VIEW = layout.offsetof(1);
        CPUTIMEELAPSED = layout.offsetof(2);
        GPUTIMEELAPSED = layout.offsetof(3);
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

    /** Returns a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[256]")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string stored in the {@code name} field. */
    @NativeType("char[256]")
    public String nameString() { return nnameString(address()); }
    /** Returns the value of the {@code view} field. */
    @NativeType("bgfx_view_id_t")
    public short view() { return nview(address()); }
    /** Returns the value of the {@code cpuTimeElapsed} field. */
    @NativeType("int64_t")
    public long cpuTimeElapsed() { return ncpuTimeElapsed(address()); }
    /** Returns the value of the {@code gpuTimeElapsed} field. */
    @NativeType("int64_t")
    public long gpuTimeElapsed() { return ngpuTimeElapsed(address()); }

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
    /** Unsafe version of {@link #cpuTimeElapsed}. */
    public static long ncpuTimeElapsed(long struct) { return UNSAFE.getLong(null, struct + BGFXViewStats.CPUTIMEELAPSED); }
    /** Unsafe version of {@link #gpuTimeElapsed}. */
    public static long ngpuTimeElapsed(long struct) { return UNSAFE.getLong(null, struct + BGFXViewStats.GPUTIMEELAPSED); }

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

        /** Returns a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[256]")
        public ByteBuffer name() { return BGFXViewStats.nname(address()); }
        /** Decodes the null-terminated string stored in the {@code name} field. */
        @NativeType("char[256]")
        public String nameString() { return BGFXViewStats.nnameString(address()); }
        /** Returns the value of the {@code view} field. */
        @NativeType("bgfx_view_id_t")
        public short view() { return BGFXViewStats.nview(address()); }
        /** Returns the value of the {@code cpuTimeElapsed} field. */
        @NativeType("int64_t")
        public long cpuTimeElapsed() { return BGFXViewStats.ncpuTimeElapsed(address()); }
        /** Returns the value of the {@code gpuTimeElapsed} field. */
        @NativeType("int64_t")
        public long gpuTimeElapsed() { return BGFXViewStats.ngpuTimeElapsed(address()); }

    }

}