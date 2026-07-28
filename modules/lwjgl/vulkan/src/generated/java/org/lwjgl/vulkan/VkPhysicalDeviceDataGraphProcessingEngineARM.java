/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceDataGraphProcessingEngineARM {
 *     VkPhysicalDeviceDataGraphProcessingEngineTypeARM type;
 *     VkBool32 isForeign;
 * }}</pre>
 */
public class VkPhysicalDeviceDataGraphProcessingEngineARM extends Struct<VkPhysicalDeviceDataGraphProcessingEngineARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        ISFOREIGN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        ISFOREIGN = layout.offsetof(1);
    }

    protected VkPhysicalDeviceDataGraphProcessingEngineARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDataGraphProcessingEngineARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDataGraphProcessingEngineARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDataGraphProcessingEngineARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code isForeign} field. */
    @NativeType("VkBool32")
    public boolean isForeign() { return nisForeign(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public VkPhysicalDeviceDataGraphProcessingEngineARM type(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code isForeign} field. */
    public VkPhysicalDeviceDataGraphProcessingEngineARM isForeign(@NativeType("VkBool32") boolean value) { nisForeign(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDataGraphProcessingEngineARM set(
        int type,
        boolean isForeign
    ) {
        type(type);
        isForeign(isForeign);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDataGraphProcessingEngineARM set(VkPhysicalDeviceDataGraphProcessingEngineARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDataGraphProcessingEngineARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM malloc() {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphProcessingEngineARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM calloc() {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphProcessingEngineARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphProcessingEngineARM} instance for the specified memory address. */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM create(long address) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDataGraphProcessingEngineARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDataGraphProcessingEngineARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphProcessingEngineARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphProcessingEngineARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphProcessingEngineARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphProcessingEngineARM.TYPE); }
    /** Unsafe version of {@link #isForeign}. */
    public static int nisForeign(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphProcessingEngineARM.ISFOREIGN); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphProcessingEngineARM.TYPE, value); }
    /** Unsafe version of {@link #isForeign(boolean) isForeign}. */
    public static void nisForeign(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphProcessingEngineARM.ISFOREIGN, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDataGraphProcessingEngineARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphProcessingEngineARM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDataGraphProcessingEngineARM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphProcessingEngineARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDataGraphProcessingEngineARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDataGraphProcessingEngineARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM")
        public int type() { return VkPhysicalDeviceDataGraphProcessingEngineARM.ntype(address()); }
        /** @return the value of the {@code isForeign} field. */
        @NativeType("VkBool32")
        public boolean isForeign() { return VkPhysicalDeviceDataGraphProcessingEngineARM.nisForeign(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer type(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineTypeARM") int value) { VkPhysicalDeviceDataGraphProcessingEngineARM.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code isForeign} field. */
        public VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer isForeign(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphProcessingEngineARM.nisForeign(address(), value ? 1 : 0); return this; }

    }

}