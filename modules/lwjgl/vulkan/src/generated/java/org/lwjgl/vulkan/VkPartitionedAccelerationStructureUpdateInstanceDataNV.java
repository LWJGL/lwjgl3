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
 * struct VkPartitionedAccelerationStructureUpdateInstanceDataNV {
 *     uint32_t instanceIndex;
 *     uint32_t instanceContributionToHitGroupIndex;
 *     VkDeviceAddress accelerationStructure;
 * }}</pre>
 */
public class VkPartitionedAccelerationStructureUpdateInstanceDataNV extends Struct<VkPartitionedAccelerationStructureUpdateInstanceDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INSTANCEINDEX,
        INSTANCECONTRIBUTIONTOHITGROUPINDEX,
        ACCELERATIONSTRUCTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INSTANCEINDEX = layout.offsetof(0);
        INSTANCECONTRIBUTIONTOHITGROUPINDEX = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
    }

    protected VkPartitionedAccelerationStructureUpdateInstanceDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPartitionedAccelerationStructureUpdateInstanceDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(address, container);
    }

    /**
     * Creates a {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code instanceIndex} field. */
    @NativeType("uint32_t")
    public int instanceIndex() { return ninstanceIndex(address()); }
    /** @return the value of the {@code instanceContributionToHitGroupIndex} field. */
    @NativeType("uint32_t")
    public int instanceContributionToHitGroupIndex() { return ninstanceContributionToHitGroupIndex(address()); }
    /** @return the value of the {@code accelerationStructure} field. */
    @NativeType("VkDeviceAddress")
    public long accelerationStructure() { return naccelerationStructure(address()); }

    /** Sets the specified value to the {@code instanceIndex} field. */
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceIndex(@NativeType("uint32_t") int value) { ninstanceIndex(address(), value); return this; }
    /** Sets the specified value to the {@code instanceContributionToHitGroupIndex} field. */
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) { ninstanceContributionToHitGroupIndex(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV accelerationStructure(@NativeType("VkDeviceAddress") long value) { naccelerationStructure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV set(
        int instanceIndex,
        int instanceContributionToHitGroupIndex,
        long accelerationStructure
    ) {
        instanceIndex(instanceIndex);
        instanceContributionToHitGroupIndex(instanceContributionToHitGroupIndex);
        accelerationStructure(accelerationStructure);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPartitionedAccelerationStructureUpdateInstanceDataNV set(VkPartitionedAccelerationStructureUpdateInstanceDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV malloc() {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV calloc() {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV} instance allocated with {@link BufferUtils}. */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV} instance for the specified memory address. */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV create(long address) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPartitionedAccelerationStructureUpdateInstanceDataNV createSafe(long address) {
        return address == NULL ? null : new VkPartitionedAccelerationStructureUpdateInstanceDataNV(address, null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureUpdateInstanceDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #instanceIndex}. */
    public static int ninstanceIndex(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureUpdateInstanceDataNV.INSTANCEINDEX); }
    /** Unsafe version of {@link #instanceContributionToHitGroupIndex}. */
    public static int ninstanceContributionToHitGroupIndex(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureUpdateInstanceDataNV.INSTANCECONTRIBUTIONTOHITGROUPINDEX); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return memGetLong(struct + VkPartitionedAccelerationStructureUpdateInstanceDataNV.ACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #instanceIndex(int) instanceIndex}. */
    public static void ninstanceIndex(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureUpdateInstanceDataNV.INSTANCEINDEX, value); }
    /** Unsafe version of {@link #instanceContributionToHitGroupIndex(int) instanceContributionToHitGroupIndex}. */
    public static void ninstanceContributionToHitGroupIndex(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureUpdateInstanceDataNV.INSTANCECONTRIBUTIONTOHITGROUPINDEX, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { memPutLong(struct + VkPartitionedAccelerationStructureUpdateInstanceDataNV.ACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV} structs. */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureUpdateInstanceDataNV, Buffer> implements NativeResource {

        private static final VkPartitionedAccelerationStructureUpdateInstanceDataNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureUpdateInstanceDataNV.create(-1L);

        /**
         * Creates a new {@code VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPartitionedAccelerationStructureUpdateInstanceDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPartitionedAccelerationStructureUpdateInstanceDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code instanceIndex} field. */
        @NativeType("uint32_t")
        public int instanceIndex() { return VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceIndex(address()); }
        /** @return the value of the {@code instanceContributionToHitGroupIndex} field. */
        @NativeType("uint32_t")
        public int instanceContributionToHitGroupIndex() { return VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceContributionToHitGroupIndex(address()); }
        /** @return the value of the {@code accelerationStructure} field. */
        @NativeType("VkDeviceAddress")
        public long accelerationStructure() { return VkPartitionedAccelerationStructureUpdateInstanceDataNV.naccelerationStructure(address()); }

        /** Sets the specified value to the {@code instanceIndex} field. */
        public VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer instanceIndex(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceIndex(address(), value); return this; }
        /** Sets the specified value to the {@code instanceContributionToHitGroupIndex} field. */
        public VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureUpdateInstanceDataNV.ninstanceContributionToHitGroupIndex(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkPartitionedAccelerationStructureUpdateInstanceDataNV.Buffer accelerationStructure(@NativeType("VkDeviceAddress") long value) { VkPartitionedAccelerationStructureUpdateInstanceDataNV.naccelerationStructure(address(), value); return this; }

    }

}