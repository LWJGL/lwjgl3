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
 * Used for simulated mouse events in overlay space.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VREvent_Mouse_t {
 *     float {@link #x};
 *     float y;
 *     uint32_t {@link #button};
 *     uint32_t {@link #cursorIndex};
 * }</code></pre>
 */
@NativeType("struct VREvent_Mouse_t")
public class VREventMouse extends Struct<VREventMouse> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        BUTTON,
        CURSORINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        BUTTON = layout.offsetof(2);
        CURSORINDEX = layout.offsetof(3);
    }

    protected VREventMouse(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventMouse create(long address, @Nullable ByteBuffer container) {
        return new VREventMouse(address, container);
    }

    /**
     * Creates a {@code VREventMouse} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventMouse(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** coords are in GL space, bottom left of the texture is 0,0 */
    public float x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** one of:<br><table><tr><td>{@link VR#EVRMouseButton_VRMouseButton_Left}</td><td>{@link VR#EVRMouseButton_VRMouseButton_Right}</td></tr><tr><td>{@link VR#EVRMouseButton_VRMouseButton_Middle}</td></tr></table> */
    @NativeType("uint32_t")
    public int button() { return nbutton(address()); }
    /** if from an event triggered by cursor input on an overlay that supports multiple cursors, this is the index of which tracked cursor the event is for */
    @NativeType("uint32_t")
    public int cursorIndex() { return ncursorIndex(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventMouse} instance for the specified memory address. */
    public static VREventMouse create(long address) {
        return new VREventMouse(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventMouse createSafe(long address) {
        return address == NULL ? null : new VREventMouse(address, null);
    }

    /**
     * Create a {@link VREventMouse.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventMouse.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventMouse.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + VREventMouse.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + VREventMouse.Y); }
    /** Unsafe version of {@link #button}. */
    public static int nbutton(long struct) { return memGetInt(struct + VREventMouse.BUTTON); }
    /** Unsafe version of {@link #cursorIndex}. */
    public static int ncursorIndex(long struct) { return memGetInt(struct + VREventMouse.CURSORINDEX); }

    // -----------------------------------

    /** An array of {@link VREventMouse} structs. */
    public static class Buffer extends StructBuffer<VREventMouse, Buffer> {

        private static final VREventMouse ELEMENT_FACTORY = VREventMouse.create(-1L);

        /**
         * Creates a new {@code VREventMouse.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventMouse#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventMouse getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VREventMouse#x} field. */
        public float x() { return VREventMouse.nx(address()); }
        /** @return the value of the {@code y} field. */
        public float y() { return VREventMouse.ny(address()); }
        /** @return the value of the {@link VREventMouse#button} field. */
        @NativeType("uint32_t")
        public int button() { return VREventMouse.nbutton(address()); }
        /** @return the value of the {@link VREventMouse#cursorIndex} field. */
        @NativeType("uint32_t")
        public int cursorIndex() { return VREventMouse.ncursorIndex(address()); }

    }

}