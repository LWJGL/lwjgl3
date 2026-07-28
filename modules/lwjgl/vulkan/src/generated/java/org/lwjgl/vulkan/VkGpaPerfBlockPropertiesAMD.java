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
 * struct VkGpaPerfBlockPropertiesAMD {
 *     VkGpaPerfBlockAMD blockType;
 *     VkGpaPerfBlockPropertiesFlagsAMD flags;
 *     uint32_t instanceCount;
 *     uint32_t maxEventID;
 *     uint32_t maxGlobalOnlyCounters;
 *     uint32_t maxGlobalSharedCounters;
 *     uint32_t maxStreamingCounters;
 * }}</pre>
 */
public class VkGpaPerfBlockPropertiesAMD extends Struct<VkGpaPerfBlockPropertiesAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLOCKTYPE,
        FLAGS,
        INSTANCECOUNT,
        MAXEVENTID,
        MAXGLOBALONLYCOUNTERS,
        MAXGLOBALSHAREDCOUNTERS,
        MAXSTREAMINGCOUNTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLOCKTYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        INSTANCECOUNT = layout.offsetof(2);
        MAXEVENTID = layout.offsetof(3);
        MAXGLOBALONLYCOUNTERS = layout.offsetof(4);
        MAXGLOBALSHAREDCOUNTERS = layout.offsetof(5);
        MAXSTREAMINGCOUNTERS = layout.offsetof(6);
    }

    protected VkGpaPerfBlockPropertiesAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGpaPerfBlockPropertiesAMD create(long address, @Nullable ByteBuffer container) {
        return new VkGpaPerfBlockPropertiesAMD(address, container);
    }

    /**
     * Creates a {@code VkGpaPerfBlockPropertiesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGpaPerfBlockPropertiesAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code blockType} field. */
    @NativeType("VkGpaPerfBlockAMD")
    public int blockType() { return nblockType(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkGpaPerfBlockPropertiesFlagsAMD")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code instanceCount} field. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** @return the value of the {@code maxEventID} field. */
    @NativeType("uint32_t")
    public int maxEventID() { return nmaxEventID(address()); }
    /** @return the value of the {@code maxGlobalOnlyCounters} field. */
    @NativeType("uint32_t")
    public int maxGlobalOnlyCounters() { return nmaxGlobalOnlyCounters(address()); }
    /** @return the value of the {@code maxGlobalSharedCounters} field. */
    @NativeType("uint32_t")
    public int maxGlobalSharedCounters() { return nmaxGlobalSharedCounters(address()); }
    /** @return the value of the {@code maxStreamingCounters} field. */
    @NativeType("uint32_t")
    public int maxStreamingCounters() { return nmaxStreamingCounters(address()); }

    /** Sets the specified value to the {@code blockType} field. */
    public VkGpaPerfBlockPropertiesAMD blockType(@NativeType("VkGpaPerfBlockAMD") int value) { nblockType(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkGpaPerfBlockPropertiesAMD flags(@NativeType("VkGpaPerfBlockPropertiesFlagsAMD") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code instanceCount} field. */
    public VkGpaPerfBlockPropertiesAMD instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxEventID} field. */
    public VkGpaPerfBlockPropertiesAMD maxEventID(@NativeType("uint32_t") int value) { nmaxEventID(address(), value); return this; }
    /** Sets the specified value to the {@code maxGlobalOnlyCounters} field. */
    public VkGpaPerfBlockPropertiesAMD maxGlobalOnlyCounters(@NativeType("uint32_t") int value) { nmaxGlobalOnlyCounters(address(), value); return this; }
    /** Sets the specified value to the {@code maxGlobalSharedCounters} field. */
    public VkGpaPerfBlockPropertiesAMD maxGlobalSharedCounters(@NativeType("uint32_t") int value) { nmaxGlobalSharedCounters(address(), value); return this; }
    /** Sets the specified value to the {@code maxStreamingCounters} field. */
    public VkGpaPerfBlockPropertiesAMD maxStreamingCounters(@NativeType("uint32_t") int value) { nmaxStreamingCounters(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGpaPerfBlockPropertiesAMD set(
        int blockType,
        int flags,
        int instanceCount,
        int maxEventID,
        int maxGlobalOnlyCounters,
        int maxGlobalSharedCounters,
        int maxStreamingCounters
    ) {
        blockType(blockType);
        flags(flags);
        instanceCount(instanceCount);
        maxEventID(maxEventID);
        maxGlobalOnlyCounters(maxGlobalOnlyCounters);
        maxGlobalSharedCounters(maxGlobalSharedCounters);
        maxStreamingCounters(maxStreamingCounters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGpaPerfBlockPropertiesAMD set(VkGpaPerfBlockPropertiesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGpaPerfBlockPropertiesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGpaPerfBlockPropertiesAMD malloc() {
        return new VkGpaPerfBlockPropertiesAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGpaPerfBlockPropertiesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGpaPerfBlockPropertiesAMD calloc() {
        return new VkGpaPerfBlockPropertiesAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGpaPerfBlockPropertiesAMD} instance allocated with {@link BufferUtils}. */
    public static VkGpaPerfBlockPropertiesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGpaPerfBlockPropertiesAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkGpaPerfBlockPropertiesAMD} instance for the specified memory address. */
    public static VkGpaPerfBlockPropertiesAMD create(long address) {
        return new VkGpaPerfBlockPropertiesAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGpaPerfBlockPropertiesAMD createSafe(long address) {
        return address == NULL ? null : new VkGpaPerfBlockPropertiesAMD(address, null);
    }

    /**
     * Returns a new {@link VkGpaPerfBlockPropertiesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfBlockPropertiesAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGpaPerfBlockPropertiesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfBlockPropertiesAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaPerfBlockPropertiesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfBlockPropertiesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGpaPerfBlockPropertiesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfBlockPropertiesAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGpaPerfBlockPropertiesAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGpaPerfBlockPropertiesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaPerfBlockPropertiesAMD malloc(MemoryStack stack) {
        return new VkGpaPerfBlockPropertiesAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGpaPerfBlockPropertiesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGpaPerfBlockPropertiesAMD calloc(MemoryStack stack) {
        return new VkGpaPerfBlockPropertiesAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGpaPerfBlockPropertiesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfBlockPropertiesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGpaPerfBlockPropertiesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGpaPerfBlockPropertiesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blockType}. */
    public static int nblockType(long struct) { return memGetInt(struct + VkGpaPerfBlockPropertiesAMD.BLOCKTYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkGpaPerfBlockPropertiesAMD.FLAGS); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return memGetInt(struct + VkGpaPerfBlockPropertiesAMD.INSTANCECOUNT); }
    /** Unsafe version of {@link #maxEventID}. */
    public static int nmaxEventID(long struct) { return memGetInt(struct + VkGpaPerfBlockPropertiesAMD.MAXEVENTID); }
    /** Unsafe version of {@link #maxGlobalOnlyCounters}. */
    public static int nmaxGlobalOnlyCounters(long struct) { return memGetInt(struct + VkGpaPerfBlockPropertiesAMD.MAXGLOBALONLYCOUNTERS); }
    /** Unsafe version of {@link #maxGlobalSharedCounters}. */
    public static int nmaxGlobalSharedCounters(long struct) { return memGetInt(struct + VkGpaPerfBlockPropertiesAMD.MAXGLOBALSHAREDCOUNTERS); }
    /** Unsafe version of {@link #maxStreamingCounters}. */
    public static int nmaxStreamingCounters(long struct) { return memGetInt(struct + VkGpaPerfBlockPropertiesAMD.MAXSTREAMINGCOUNTERS); }

    /** Unsafe version of {@link #blockType(int) blockType}. */
    public static void nblockType(long struct, int value) { memPutInt(struct + VkGpaPerfBlockPropertiesAMD.BLOCKTYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkGpaPerfBlockPropertiesAMD.FLAGS, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { memPutInt(struct + VkGpaPerfBlockPropertiesAMD.INSTANCECOUNT, value); }
    /** Unsafe version of {@link #maxEventID(int) maxEventID}. */
    public static void nmaxEventID(long struct, int value) { memPutInt(struct + VkGpaPerfBlockPropertiesAMD.MAXEVENTID, value); }
    /** Unsafe version of {@link #maxGlobalOnlyCounters(int) maxGlobalOnlyCounters}. */
    public static void nmaxGlobalOnlyCounters(long struct, int value) { memPutInt(struct + VkGpaPerfBlockPropertiesAMD.MAXGLOBALONLYCOUNTERS, value); }
    /** Unsafe version of {@link #maxGlobalSharedCounters(int) maxGlobalSharedCounters}. */
    public static void nmaxGlobalSharedCounters(long struct, int value) { memPutInt(struct + VkGpaPerfBlockPropertiesAMD.MAXGLOBALSHAREDCOUNTERS, value); }
    /** Unsafe version of {@link #maxStreamingCounters(int) maxStreamingCounters}. */
    public static void nmaxStreamingCounters(long struct, int value) { memPutInt(struct + VkGpaPerfBlockPropertiesAMD.MAXSTREAMINGCOUNTERS, value); }

    // -----------------------------------

    /** An array of {@link VkGpaPerfBlockPropertiesAMD} structs. */
    public static class Buffer extends StructBuffer<VkGpaPerfBlockPropertiesAMD, Buffer> implements NativeResource {

        private static final VkGpaPerfBlockPropertiesAMD ELEMENT_FACTORY = VkGpaPerfBlockPropertiesAMD.create(-1L);

        /**
         * Creates a new {@code VkGpaPerfBlockPropertiesAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGpaPerfBlockPropertiesAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGpaPerfBlockPropertiesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code blockType} field. */
        @NativeType("VkGpaPerfBlockAMD")
        public int blockType() { return VkGpaPerfBlockPropertiesAMD.nblockType(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkGpaPerfBlockPropertiesFlagsAMD")
        public int flags() { return VkGpaPerfBlockPropertiesAMD.nflags(address()); }
        /** @return the value of the {@code instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkGpaPerfBlockPropertiesAMD.ninstanceCount(address()); }
        /** @return the value of the {@code maxEventID} field. */
        @NativeType("uint32_t")
        public int maxEventID() { return VkGpaPerfBlockPropertiesAMD.nmaxEventID(address()); }
        /** @return the value of the {@code maxGlobalOnlyCounters} field. */
        @NativeType("uint32_t")
        public int maxGlobalOnlyCounters() { return VkGpaPerfBlockPropertiesAMD.nmaxGlobalOnlyCounters(address()); }
        /** @return the value of the {@code maxGlobalSharedCounters} field. */
        @NativeType("uint32_t")
        public int maxGlobalSharedCounters() { return VkGpaPerfBlockPropertiesAMD.nmaxGlobalSharedCounters(address()); }
        /** @return the value of the {@code maxStreamingCounters} field. */
        @NativeType("uint32_t")
        public int maxStreamingCounters() { return VkGpaPerfBlockPropertiesAMD.nmaxStreamingCounters(address()); }

        /** Sets the specified value to the {@code blockType} field. */
        public VkGpaPerfBlockPropertiesAMD.Buffer blockType(@NativeType("VkGpaPerfBlockAMD") int value) { VkGpaPerfBlockPropertiesAMD.nblockType(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkGpaPerfBlockPropertiesAMD.Buffer flags(@NativeType("VkGpaPerfBlockPropertiesFlagsAMD") int value) { VkGpaPerfBlockPropertiesAMD.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code instanceCount} field. */
        public VkGpaPerfBlockPropertiesAMD.Buffer instanceCount(@NativeType("uint32_t") int value) { VkGpaPerfBlockPropertiesAMD.ninstanceCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxEventID} field. */
        public VkGpaPerfBlockPropertiesAMD.Buffer maxEventID(@NativeType("uint32_t") int value) { VkGpaPerfBlockPropertiesAMD.nmaxEventID(address(), value); return this; }
        /** Sets the specified value to the {@code maxGlobalOnlyCounters} field. */
        public VkGpaPerfBlockPropertiesAMD.Buffer maxGlobalOnlyCounters(@NativeType("uint32_t") int value) { VkGpaPerfBlockPropertiesAMD.nmaxGlobalOnlyCounters(address(), value); return this; }
        /** Sets the specified value to the {@code maxGlobalSharedCounters} field. */
        public VkGpaPerfBlockPropertiesAMD.Buffer maxGlobalSharedCounters(@NativeType("uint32_t") int value) { VkGpaPerfBlockPropertiesAMD.nmaxGlobalSharedCounters(address(), value); return this; }
        /** Sets the specified value to the {@code maxStreamingCounters} field. */
        public VkGpaPerfBlockPropertiesAMD.Buffer maxStreamingCounters(@NativeType("uint32_t") int value) { VkGpaPerfBlockPropertiesAMD.nmaxStreamingCounters(address(), value); return this; }

    }

}