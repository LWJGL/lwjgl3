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
 * struct VREvent_Property_t {
 *     PropertyContainerHandle_t container;
 *     ETrackedDeviceProperty prop;
 * }}</pre>
 */
@NativeType("struct VREvent_Property_t")
public class VREventProperty extends Struct<VREventProperty> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTAINER,
        PROP;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTAINER = layout.offsetof(0);
        PROP = layout.offsetof(1);
    }

    protected VREventProperty(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VREventProperty create(long address, @Nullable ByteBuffer container) {
        return new VREventProperty(address, container);
    }

    /**
     * Creates a {@code VREventProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventProperty(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code container} field. */
    @NativeType("PropertyContainerHandle_t")
    public long container() { return ncontainer(address()); }
    /** @return the value of the {@code prop} field. */
    @NativeType("ETrackedDeviceProperty")
    public int prop() { return nprop(address()); }

    // -----------------------------------

    /** Returns a new {@code VREventProperty} instance for the specified memory address. */
    public static VREventProperty create(long address) {
        return new VREventProperty(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VREventProperty createSafe(long address) {
        return address == NULL ? null : new VREventProperty(address, null);
    }

    /**
     * Create a {@link VREventProperty.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventProperty.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VREventProperty.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #container}. */
    public static long ncontainer(long struct) { return memGetLong(struct + VREventProperty.CONTAINER); }
    /** Unsafe version of {@link #prop}. */
    public static int nprop(long struct) { return memGetInt(struct + VREventProperty.PROP); }

    // -----------------------------------

    /** An array of {@link VREventProperty} structs. */
    public static class Buffer extends StructBuffer<VREventProperty, Buffer> {

        private static final VREventProperty ELEMENT_FACTORY = VREventProperty.create(-1L);

        /**
         * Creates a new {@code VREventProperty.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventProperty#SIZEOF}, and its mark will be undefined.</p>
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
        protected VREventProperty getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code container} field. */
        @NativeType("PropertyContainerHandle_t")
        public long container() { return VREventProperty.ncontainer(address()); }
        /** @return the value of the {@code prop} field. */
        @NativeType("ETrackedDeviceProperty")
        public int prop() { return VREventProperty.nprop(address()); }

    }

}