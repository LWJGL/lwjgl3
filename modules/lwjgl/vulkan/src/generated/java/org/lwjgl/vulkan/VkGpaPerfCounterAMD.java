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
 * struct VkGpaPerfCounterAMD {
 *     VkGpaPerfBlockAMD blockType;
 *     uint32_t blockInstance;
 *     uint32_t eventID;
 * }}</pre>
 */
public class VkGpaPerfCounterAMD extends Struct<VkGpaPerfCounterAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKTYPE,
        BLOCKINSTANCE,
        EVENTID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLOCKTYPE = layout.offsetof(0);
        BLOCKINSTANCE = layout.offsetof(1);
        EVENTID = layout.offsetof(2);
    }

    protected VkGpaPerfCounterAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGpaPerfCounterAMD create(long address, @Nullable ByteBuffer container) {
        return new VkGpaPerfCounterAMD(address, container);
    }

    /**
     * Creates a {@code VkGpaPerfCounterAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGpaPerfCounterAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code blockType} field. */
    @NativeType("VkGpaPerfBlockAMD")
    public int blockType() { return nblockType(address()); }
    /** @return the value of the {@code blockInstance} field. */
    @NativeType("uint32_t")
    public int blockInstance() { return nblockInstance(address()); }
    /** @return the value of the {@code eventID} field. */
    @NativeType("uint32_t")
    public int eventID() { return neventID(address()); }

    /** Sets the specified value to the {@code blockType} field. */
    public VkGpaPerfCounterAMD blockType(@NativeType("VkGpaPerfBlockAMD") int value) { nblockType(address(), value); return this; }
    /** Sets the specified value to the {@code blockInstance} field. */
    public VkGpaPerfCounterAMD blockInstance(@NativeType("uint32_t") int value) { nblockInstance(address(), value); return this; }
    /** Sets the specified value to the {@code eventID} field. */
    public VkGpaPerfCounterAMD eventID(@NativeType("uint32_t") int value) { neventID(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGpaPerfCounterAMD set(
        int blockType,
        int blockInstance,
        int eventID
    ) {
        blockType(blockType);
        blockInstance(blockInstance);
        eventID(eventID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGpaPerfCounterAMD set(VkGpaPerfCounterAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGpaPerfCounterAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGpaPerfCounterAMD malloc() {
        return new VkGpaPerfCounterAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGpaPerfCounterAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGpaPerfCounterAMD calloc() {
        return new VkGpaPerfCounterAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGpaPerfCounterAMD} instance allocated with {@link BufferUtils}. */
    public static VkGpaPerfCounterAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGpaPerfCounterAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkGpaPerfCounterAMD} instance for the specified memory address. */
    public static VkGpaPerfCounterAMD create(long address) {
        return new VkGpaPerfCounterAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGpaPerfCounterAMD createSafe(long address) {
        return address == NULL ? null : new VkGpaPerfCounterAMD(address, null);
    }

    /**
     * Returns a new {@link VkGpaPerfCounterAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfCounterAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGpaPerfCounterAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfCounterAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaPerfCounterAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfCounterAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGpaPerfCounterAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfCounterAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGpaPerfCounterAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGpaPerfCounterAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaPerfCounterAMD malloc(MemoryStack stack) {
        return new VkGpaPerfCounterAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGpaPerfCounterAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaPerfCounterAMD calloc(MemoryStack stack) {
        return new VkGpaPerfCounterAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGpaPerfCounterAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfCounterAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaPerfCounterAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfCounterAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blockType}. */
    public static int nblockType(long struct) { return memGetInt(struct + VkGpaPerfCounterAMD.BLOCKTYPE); }
    /** Unsafe version of {@link #blockInstance}. */
    public static int nblockInstance(long struct) { return memGetInt(struct + VkGpaPerfCounterAMD.BLOCKINSTANCE); }
    /** Unsafe version of {@link #eventID}. */
    public static int neventID(long struct) { return memGetInt(struct + VkGpaPerfCounterAMD.EVENTID); }

    /** Unsafe version of {@link #blockType(int) blockType}. */
    public static void nblockType(long struct, int value) { memPutInt(struct + VkGpaPerfCounterAMD.BLOCKTYPE, value); }
    /** Unsafe version of {@link #blockInstance(int) blockInstance}. */
    public static void nblockInstance(long struct, int value) { memPutInt(struct + VkGpaPerfCounterAMD.BLOCKINSTANCE, value); }
    /** Unsafe version of {@link #eventID(int) eventID}. */
    public static void neventID(long struct, int value) { memPutInt(struct + VkGpaPerfCounterAMD.EVENTID, value); }

    // -----------------------------------

    /** An array of {@link VkGpaPerfCounterAMD} structs. */
    public static class Buffer extends StructBuffer<VkGpaPerfCounterAMD, Buffer> implements NativeResource {

        private static final VkGpaPerfCounterAMD ELEMENT_FACTORY = VkGpaPerfCounterAMD.create(-1L);

        /**
         * Creates a new {@code VkGpaPerfCounterAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGpaPerfCounterAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGpaPerfCounterAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code blockType} field. */
        @NativeType("VkGpaPerfBlockAMD")
        public int blockType() { return VkGpaPerfCounterAMD.nblockType(address()); }
        /** @return the value of the {@code blockInstance} field. */
        @NativeType("uint32_t")
        public int blockInstance() { return VkGpaPerfCounterAMD.nblockInstance(address()); }
        /** @return the value of the {@code eventID} field. */
        @NativeType("uint32_t")
        public int eventID() { return VkGpaPerfCounterAMD.neventID(address()); }

        /** Sets the specified value to the {@code blockType} field. */
        public VkGpaPerfCounterAMD.Buffer blockType(@NativeType("VkGpaPerfBlockAMD") int value) { VkGpaPerfCounterAMD.nblockType(address(), value); return this; }
        /** Sets the specified value to the {@code blockInstance} field. */
        public VkGpaPerfCounterAMD.Buffer blockInstance(@NativeType("uint32_t") int value) { VkGpaPerfCounterAMD.nblockInstance(address(), value); return this; }
        /** Sets the specified value to the {@code eventID} field. */
        public VkGpaPerfCounterAMD.Buffer eventID(@NativeType("uint32_t") int value) { VkGpaPerfCounterAMD.neventID(address(), value); return this; }

    }

}