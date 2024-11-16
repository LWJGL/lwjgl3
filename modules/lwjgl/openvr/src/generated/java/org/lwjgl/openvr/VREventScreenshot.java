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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Screenshot_t {
 *     uint32_t handle;
 *     uint32_t type;
 * }</code></pre>
 */
@NativeType("struct VREvent_Screenshot_t")
public class VREventScreenshot extends Struct<VREventScreenshot> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        TYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        TYPE = layout.offsetof(1);
    }

    protected VREventScreenshot(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventScreenshot create(long address, @Nullable ByteBuffer container) {
        return new VREventScreenshot(address, container);
    }

    /**
     * Creates a {@code VREventScreenshot} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventScreenshot(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("uint32_t")
    public int handle() { return nhandle(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("uint32_t")
    public int type() { return ntype(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventScreenshot} instance for the specified memory address. */
    public static VREventScreenshot create(long address) {
        return new VREventScreenshot(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventScreenshot createSafe(long address) {
        return address == NULL ? null : new VREventScreenshot(address, null);
    }

    /**
     * Create a {@link VREventScreenshot.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventScreenshot.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventScreenshot.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static int nhandle(long struct) { return memGetInt(struct + VREventScreenshot.HANDLE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VREventScreenshot.TYPE); }

    // -----------------------------------

    /** An array of {@link VREventScreenshot} structs. */
    public static class Buffer extends StructBuffer<VREventScreenshot, Buffer> {

        private static final VREventScreenshot ELEMENT_FACTORY = VREventScreenshot.create(-1L);

        /**
         * Creates a new {@code VREventScreenshot.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventScreenshot#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventScreenshot getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("uint32_t")
        public int handle() { return VREventScreenshot.nhandle(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("uint32_t")
        public int type() { return VREventScreenshot.ntype(address()); }

    }

}