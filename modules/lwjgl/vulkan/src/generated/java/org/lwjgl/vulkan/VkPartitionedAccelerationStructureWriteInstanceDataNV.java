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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPartitionedAccelerationStructureWriteInstanceDataNV {
 *     {@link VkTransformMatrixKHR VkTransformMatrixKHR} transform;
 *     float explicitAABB[6];
 *     uint32_t instanceID;
 *     uint32_t instanceMask;
 *     uint32_t instanceContributionToHitGroupIndex;
 *     VkPartitionedAccelerationStructureInstanceFlagsNV instanceFlags;
 *     uint32_t instanceIndex;
 *     uint32_t partitionIndex;
 *     VkDeviceAddress accelerationStructure;
 * }}</pre>
 */
public class VkPartitionedAccelerationStructureWriteInstanceDataNV extends Struct<VkPartitionedAccelerationStructureWriteInstanceDataNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TRANSFORM,
        EXPLICITAABB,
        INSTANCEID,
        INSTANCEMASK,
        INSTANCECONTRIBUTIONTOHITGROUPINDEX,
        INSTANCEFLAGS,
        INSTANCEINDEX,
        PARTITIONINDEX,
        ACCELERATIONSTRUCTURE;

    static {
        Layout layout = __struct(
            __member(VkTransformMatrixKHR.SIZEOF, VkTransformMatrixKHR.ALIGNOF),
            __array(4, 6),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TRANSFORM = layout.offsetof(0);
        EXPLICITAABB = layout.offsetof(1);
        INSTANCEID = layout.offsetof(2);
        INSTANCEMASK = layout.offsetof(3);
        INSTANCECONTRIBUTIONTOHITGROUPINDEX = layout.offsetof(4);
        INSTANCEFLAGS = layout.offsetof(5);
        INSTANCEINDEX = layout.offsetof(6);
        PARTITIONINDEX = layout.offsetof(7);
        ACCELERATIONSTRUCTURE = layout.offsetof(8);
    }

    protected VkPartitionedAccelerationStructureWriteInstanceDataNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPartitionedAccelerationStructureWriteInstanceDataNV create(long address, @Nullable ByteBuffer container) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(address, container);
    }

    /**
     * Creates a {@code VkPartitionedAccelerationStructureWriteInstanceDataNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkTransformMatrixKHR} view of the {@code transform} field. */
    public VkTransformMatrixKHR transform() { return ntransform(address()); }
    /** @return a {@link FloatBuffer} view of the {@code explicitAABB} field. */
    @NativeType("float[6]")
    public FloatBuffer explicitAABB() { return nexplicitAABB(address()); }
    /** @return the value at the specified index of the {@code explicitAABB} field. */
    public float explicitAABB(int index) { return nexplicitAABB(address(), index); }
    /** @return the value of the {@code instanceID} field. */
    @NativeType("uint32_t")
    public int instanceID() { return ninstanceID(address()); }
    /** @return the value of the {@code instanceMask} field. */
    @NativeType("uint32_t")
    public int instanceMask() { return ninstanceMask(address()); }
    /** @return the value of the {@code instanceContributionToHitGroupIndex} field. */
    @NativeType("uint32_t")
    public int instanceContributionToHitGroupIndex() { return ninstanceContributionToHitGroupIndex(address()); }
    /** @return the value of the {@code instanceFlags} field. */
    @NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV")
    public int instanceFlags() { return ninstanceFlags(address()); }
    /** @return the value of the {@code instanceIndex} field. */
    @NativeType("uint32_t")
    public int instanceIndex() { return ninstanceIndex(address()); }
    /** @return the value of the {@code partitionIndex} field. */
    @NativeType("uint32_t")
    public int partitionIndex() { return npartitionIndex(address()); }
    /** @return the value of the {@code accelerationStructure} field. */
    @NativeType("VkDeviceAddress")
    public long accelerationStructure() { return naccelerationStructure(address()); }

    /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transform} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(VkTransformMatrixKHR value) { ntransform(address(), value); return this; }
    /** Passes the {@code transform} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV transform(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transform()); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code explicitAABB} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(@NativeType("float[6]") FloatBuffer value) { nexplicitAABB(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code explicitAABB} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV explicitAABB(int index, float value) { nexplicitAABB(address(), index, value); return this; }
    /** Sets the specified value to the {@code instanceID} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceID(@NativeType("uint32_t") int value) { ninstanceID(address(), value); return this; }
    /** Sets the specified value to the {@code instanceMask} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceMask(@NativeType("uint32_t") int value) { ninstanceMask(address(), value); return this; }
    /** Sets the specified value to the {@code instanceContributionToHitGroupIndex} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) { ninstanceContributionToHitGroupIndex(address(), value); return this; }
    /** Sets the specified value to the {@code instanceFlags} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceFlags(@NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV") int value) { ninstanceFlags(address(), value); return this; }
    /** Sets the specified value to the {@code instanceIndex} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV instanceIndex(@NativeType("uint32_t") int value) { ninstanceIndex(address(), value); return this; }
    /** Sets the specified value to the {@code partitionIndex} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV partitionIndex(@NativeType("uint32_t") int value) { npartitionIndex(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV accelerationStructure(@NativeType("VkDeviceAddress") long value) { naccelerationStructure(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPartitionedAccelerationStructureWriteInstanceDataNV set(
        VkTransformMatrixKHR transform,
        FloatBuffer explicitAABB,
        int instanceID,
        int instanceMask,
        int instanceContributionToHitGroupIndex,
        int instanceFlags,
        int instanceIndex,
        int partitionIndex,
        long accelerationStructure
    ) {
        transform(transform);
        explicitAABB(explicitAABB);
        instanceID(instanceID);
        instanceMask(instanceMask);
        instanceContributionToHitGroupIndex(instanceContributionToHitGroupIndex);
        instanceFlags(instanceFlags);
        instanceIndex(instanceIndex);
        partitionIndex(partitionIndex);
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
    public VkPartitionedAccelerationStructureWriteInstanceDataNV set(VkPartitionedAccelerationStructureWriteInstanceDataNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPartitionedAccelerationStructureWriteInstanceDataNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV malloc() {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureWriteInstanceDataNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV calloc() {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureWriteInstanceDataNV} instance allocated with {@link BufferUtils}. */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureWriteInstanceDataNV} instance for the specified memory address. */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV create(long address) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPartitionedAccelerationStructureWriteInstanceDataNV createSafe(long address) {
        return address == NULL ? null : new VkPartitionedAccelerationStructureWriteInstanceDataNV(address, null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureWriteInstanceDataNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureWriteInstanceDataNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureWriteInstanceDataNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #transform}. */
    public static VkTransformMatrixKHR ntransform(long struct) { return VkTransformMatrixKHR.create(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.TRANSFORM); }
    /** Unsafe version of {@link #explicitAABB}. */
    public static FloatBuffer nexplicitAABB(long struct) { return memFloatBuffer(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.EXPLICITAABB, 6); }
    /** Unsafe version of {@link #explicitAABB(int) explicitAABB}. */
    public static float nexplicitAABB(long struct, int index) {
        return memGetFloat(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.EXPLICITAABB + check(index, 6) * 4);
    }
    /** Unsafe version of {@link #instanceID}. */
    public static int ninstanceID(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEID); }
    /** Unsafe version of {@link #instanceMask}. */
    public static int ninstanceMask(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEMASK); }
    /** Unsafe version of {@link #instanceContributionToHitGroupIndex}. */
    public static int ninstanceContributionToHitGroupIndex(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCECONTRIBUTIONTOHITGROUPINDEX); }
    /** Unsafe version of {@link #instanceFlags}. */
    public static int ninstanceFlags(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEFLAGS); }
    /** Unsafe version of {@link #instanceIndex}. */
    public static int ninstanceIndex(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEINDEX); }
    /** Unsafe version of {@link #partitionIndex}. */
    public static int npartitionIndex(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.PARTITIONINDEX); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return memGetLong(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.ACCELERATIONSTRUCTURE); }

    /** Unsafe version of {@link #transform(VkTransformMatrixKHR) transform}. */
    public static void ntransform(long struct, VkTransformMatrixKHR value) { memCopy(value.address(), struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.TRANSFORM, VkTransformMatrixKHR.SIZEOF); }
    /** Unsafe version of {@link #explicitAABB(FloatBuffer) explicitAABB}. */
    public static void nexplicitAABB(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.EXPLICITAABB, value.remaining() * 4);
    }
    /** Unsafe version of {@link #explicitAABB(int, float) explicitAABB}. */
    public static void nexplicitAABB(long struct, int index, float value) {
        memPutFloat(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.EXPLICITAABB + check(index, 6) * 4, value);
    }
    /** Unsafe version of {@link #instanceID(int) instanceID}. */
    public static void ninstanceID(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEID, value); }
    /** Unsafe version of {@link #instanceMask(int) instanceMask}. */
    public static void ninstanceMask(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEMASK, value); }
    /** Unsafe version of {@link #instanceContributionToHitGroupIndex(int) instanceContributionToHitGroupIndex}. */
    public static void ninstanceContributionToHitGroupIndex(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCECONTRIBUTIONTOHITGROUPINDEX, value); }
    /** Unsafe version of {@link #instanceFlags(int) instanceFlags}. */
    public static void ninstanceFlags(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEFLAGS, value); }
    /** Unsafe version of {@link #instanceIndex(int) instanceIndex}. */
    public static void ninstanceIndex(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.INSTANCEINDEX, value); }
    /** Unsafe version of {@link #partitionIndex(int) partitionIndex}. */
    public static void npartitionIndex(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.PARTITIONINDEX, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { memPutLong(struct + VkPartitionedAccelerationStructureWriteInstanceDataNV.ACCELERATIONSTRUCTURE, value); }

    // -----------------------------------

    /** An array of {@link VkPartitionedAccelerationStructureWriteInstanceDataNV} structs. */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureWriteInstanceDataNV, Buffer> implements NativeResource {

        private static final VkPartitionedAccelerationStructureWriteInstanceDataNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureWriteInstanceDataNV.create(-1L);

        /**
         * Creates a new {@code VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPartitionedAccelerationStructureWriteInstanceDataNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPartitionedAccelerationStructureWriteInstanceDataNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkTransformMatrixKHR} view of the {@code transform} field. */
        public VkTransformMatrixKHR transform() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.ntransform(address()); }
        /** @return a {@link FloatBuffer} view of the {@code explicitAABB} field. */
        @NativeType("float[6]")
        public FloatBuffer explicitAABB() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address()); }
        /** @return the value at the specified index of the {@code explicitAABB} field. */
        public float explicitAABB(int index) { return VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address(), index); }
        /** @return the value of the {@code instanceID} field. */
        @NativeType("uint32_t")
        public int instanceID() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceID(address()); }
        /** @return the value of the {@code instanceMask} field. */
        @NativeType("uint32_t")
        public int instanceMask() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceMask(address()); }
        /** @return the value of the {@code instanceContributionToHitGroupIndex} field. */
        @NativeType("uint32_t")
        public int instanceContributionToHitGroupIndex() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceContributionToHitGroupIndex(address()); }
        /** @return the value of the {@code instanceFlags} field. */
        @NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV")
        public int instanceFlags() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceFlags(address()); }
        /** @return the value of the {@code instanceIndex} field. */
        @NativeType("uint32_t")
        public int instanceIndex() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceIndex(address()); }
        /** @return the value of the {@code partitionIndex} field. */
        @NativeType("uint32_t")
        public int partitionIndex() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.npartitionIndex(address()); }
        /** @return the value of the {@code accelerationStructure} field. */
        @NativeType("VkDeviceAddress")
        public long accelerationStructure() { return VkPartitionedAccelerationStructureWriteInstanceDataNV.naccelerationStructure(address()); }

        /** Copies the specified {@link VkTransformMatrixKHR} to the {@code transform} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer transform(VkTransformMatrixKHR value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.ntransform(address(), value); return this; }
        /** Passes the {@code transform} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer transform(java.util.function.Consumer<VkTransformMatrixKHR> consumer) { consumer.accept(transform()); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code explicitAABB} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer explicitAABB(@NativeType("float[6]") FloatBuffer value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code explicitAABB} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer explicitAABB(int index, float value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.nexplicitAABB(address(), index, value); return this; }
        /** Sets the specified value to the {@code instanceID} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer instanceID(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceID(address(), value); return this; }
        /** Sets the specified value to the {@code instanceMask} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer instanceMask(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceMask(address(), value); return this; }
        /** Sets the specified value to the {@code instanceContributionToHitGroupIndex} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer instanceContributionToHitGroupIndex(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceContributionToHitGroupIndex(address(), value); return this; }
        /** Sets the specified value to the {@code instanceFlags} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer instanceFlags(@NativeType("VkPartitionedAccelerationStructureInstanceFlagsNV") int value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceFlags(address(), value); return this; }
        /** Sets the specified value to the {@code instanceIndex} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer instanceIndex(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.ninstanceIndex(address(), value); return this; }
        /** Sets the specified value to the {@code partitionIndex} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer partitionIndex(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.npartitionIndex(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkPartitionedAccelerationStructureWriteInstanceDataNV.Buffer accelerationStructure(@NativeType("VkDeviceAddress") long value) { VkPartitionedAccelerationStructureWriteInstanceDataNV.naccelerationStructure(address(), value); return this; }

    }

}