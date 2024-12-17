/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct VREvent_Scroll_t {
 *     float xdelta;
 *     float ydelta;
 *     uint32_t unused;
 *     float viewportscale;
 *     uint32_t cursorIndex;
 * }}</pre>
 */
@NativeType("struct VREvent_Scroll_t")
public class VREventScroll extends Struct<VREventScroll> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XDELTA,
        YDELTA,
        UNUSED,
        VIEWPORTSCALE,
        CURSORINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XDELTA = layout.offsetof(0);
        YDELTA = layout.offsetof(1);
        UNUSED = layout.offsetof(2);
        VIEWPORTSCALE = layout.offsetof(3);
        CURSORINDEX = layout.offsetof(4);
    }

    protected VREventScroll(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventScroll create(long address, @Nullable ByteBuffer container) {
        return new VREventScroll(address, container);
    }

    /**
     * Creates a {@code VREventScroll} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventScroll(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code xdelta} field. */
    public float xdelta() { return nxdelta(address()); }
    /** @return the value of the {@code ydelta} field. */
    public float ydelta() { return nydelta(address()); }
    /** @return the value of the {@code unused} field. */
    @NativeType("uint32_t")
    public int unused() { return nunused(address()); }
    /** @return the value of the {@code viewportscale} field. */
    public float viewportscale() { return nviewportscale(address()); }
    /** @return the value of the {@code cursorIndex} field. */
    @NativeType("uint32_t")
    public int cursorIndex() { return ncursorIndex(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventScroll} instance for the specified memory address. */
    public static VREventScroll create(long address) {
        return new VREventScroll(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventScroll createSafe(long address) {
        return address == NULL ? null : new VREventScroll(address, null);
    }

    /**
     * Create a {@link VREventScroll.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventScroll.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventScroll.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xdelta}. */
    public static float nxdelta(long struct) { return memGetFloat(struct + VREventScroll.XDELTA); }
    /** Unsafe version of {@link #ydelta}. */
    public static float nydelta(long struct) { return memGetFloat(struct + VREventScroll.YDELTA); }
    /** Unsafe version of {@link #unused}. */
    public static int nunused(long struct) { return memGetInt(struct + VREventScroll.UNUSED); }
    /** Unsafe version of {@link #viewportscale}. */
    public static float nviewportscale(long struct) { return memGetFloat(struct + VREventScroll.VIEWPORTSCALE); }
    /** Unsafe version of {@link #cursorIndex}. */
    public static int ncursorIndex(long struct) { return memGetInt(struct + VREventScroll.CURSORINDEX); }

    // -----------------------------------

    /** An array of {@link VREventScroll} structs. */
    public static class Buffer extends StructBuffer<VREventScroll, Buffer> {

        private static final VREventScroll ELEMENT_FACTORY = VREventScroll.create(-1L);

        /**
         * Creates a new {@code VREventScroll.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventScroll#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VREventScroll getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code xdelta} field. */
        public float xdelta() { return VREventScroll.nxdelta(address()); }
        /** @return the value of the {@code ydelta} field. */
        public float ydelta() { return VREventScroll.nydelta(address()); }
        /** @return the value of the {@code unused} field. */
        @NativeType("uint32_t")
        public int unused() { return VREventScroll.nunused(address()); }
        /** @return the value of the {@code viewportscale} field. */
        public float viewportscale() { return VREventScroll.nviewportscale(address()); }
        /** @return the value of the {@code cursorIndex} field. */
        @NativeType("uint32_t")
        public int cursorIndex() { return VREventScroll.ncursorIndex(address()); }

    }

}