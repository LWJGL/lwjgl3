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
 * struct VREvent_Controller_t {
 *     uint32_t button;
 * }}</pre>
 */
@NativeType("struct VREvent_Controller_t")
public class VREventController extends Struct<VREventController> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUTTON;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUTTON = layout.offsetof(0);
    }

    protected VREventController(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventController create(long address, @Nullable ByteBuffer container) {
        return new VREventController(address, container);
    }

    /**
     * Creates a {@code VREventController} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventController(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code button} field. */
    @NativeType("uint32_t")
    public int button() { return nbutton(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventController} instance for the specified memory address. */
    public static VREventController create(long address) {
        return new VREventController(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventController createSafe(long address) {
        return address == NULL ? null : new VREventController(address, null);
    }

    /**
     * Create a {@link VREventController.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventController.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventController.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #button}. */
    public static int nbutton(long struct) { return memGetInt(struct + VREventController.BUTTON); }

    // -----------------------------------

    /** An array of {@link VREventController} structs. */
    public static class Buffer extends StructBuffer<VREventController, Buffer> {

        private static final VREventController ELEMENT_FACTORY = VREventController.create(-1L);

        /**
         * Creates a new {@code VREventController.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventController#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventController getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code button} field. */
        @NativeType("uint32_t")
        public int button() { return VREventController.nbutton(address()); }

    }

}