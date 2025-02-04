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
 * struct VkBuildPartitionedAccelerationStructureInfoNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkPartitionedAccelerationStructureInstancesInputNV VkPartitionedAccelerationStructureInstancesInputNV} input;
 *     VkDeviceAddress srcAccelerationStructureData;
 *     VkDeviceAddress dstAccelerationStructureData;
 *     VkDeviceAddress scratchData;
 *     VkDeviceAddress srcInfos;
 *     VkDeviceAddress srcInfosCount;
 * }}</pre>
 */
public class VkBuildPartitionedAccelerationStructureInfoNV extends Struct<VkBuildPartitionedAccelerationStructureInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INPUT,
        SRCACCELERATIONSTRUCTUREDATA,
        DSTACCELERATIONSTRUCTUREDATA,
        SCRATCHDATA,
        SRCINFOS,
        SRCINFOSCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF, VkPartitionedAccelerationStructureInstancesInputNV.ALIGNOF),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INPUT = layout.offsetof(2);
        SRCACCELERATIONSTRUCTUREDATA = layout.offsetof(3);
        DSTACCELERATIONSTRUCTUREDATA = layout.offsetof(4);
        SCRATCHDATA = layout.offsetof(5);
        SRCINFOS = layout.offsetof(6);
        SRCINFOSCOUNT = layout.offsetof(7);
    }

    protected VkBuildPartitionedAccelerationStructureInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBuildPartitionedAccelerationStructureInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(address, container);
    }

    /**
     * Creates a {@code VkBuildPartitionedAccelerationStructureInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBuildPartitionedAccelerationStructureInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkPartitionedAccelerationStructureInstancesInputNV} view of the {@code input} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV input() { return ninput(address()); }
    /** @return the value of the {@code srcAccelerationStructureData} field. */
    @NativeType("VkDeviceAddress")
    public long srcAccelerationStructureData() { return nsrcAccelerationStructureData(address()); }
    /** @return the value of the {@code dstAccelerationStructureData} field. */
    @NativeType("VkDeviceAddress")
    public long dstAccelerationStructureData() { return ndstAccelerationStructureData(address()); }
    /** @return the value of the {@code scratchData} field. */
    @NativeType("VkDeviceAddress")
    public long scratchData() { return nscratchData(address()); }
    /** @return the value of the {@code srcInfos} field. */
    @NativeType("VkDeviceAddress")
    public long srcInfos() { return nsrcInfos(address()); }
    /** @return the value of the {@code srcInfosCount} field. */
    @NativeType("VkDeviceAddress")
    public long srcInfosCount() { return nsrcInfosCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV} value to the {@code sType} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkPartitionedAccelerationStructureInstancesInputNV} to the {@code input} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV input(VkPartitionedAccelerationStructureInstancesInputNV value) { ninput(address(), value); return this; }
    /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBuildPartitionedAccelerationStructureInfoNV input(java.util.function.Consumer<VkPartitionedAccelerationStructureInstancesInputNV> consumer) { consumer.accept(input()); return this; }
    /** Sets the specified value to the {@code srcAccelerationStructureData} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV srcAccelerationStructureData(@NativeType("VkDeviceAddress") long value) { nsrcAccelerationStructureData(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccelerationStructureData} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV dstAccelerationStructureData(@NativeType("VkDeviceAddress") long value) { ndstAccelerationStructureData(address(), value); return this; }
    /** Sets the specified value to the {@code scratchData} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV scratchData(@NativeType("VkDeviceAddress") long value) { nscratchData(address(), value); return this; }
    /** Sets the specified value to the {@code srcInfos} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfos(@NativeType("VkDeviceAddress") long value) { nsrcInfos(address(), value); return this; }
    /** Sets the specified value to the {@code srcInfosCount} field. */
    public VkBuildPartitionedAccelerationStructureInfoNV srcInfosCount(@NativeType("VkDeviceAddress") long value) { nsrcInfosCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBuildPartitionedAccelerationStructureInfoNV set(
        int sType,
        long pNext,
        VkPartitionedAccelerationStructureInstancesInputNV input,
        long srcAccelerationStructureData,
        long dstAccelerationStructureData,
        long scratchData,
        long srcInfos,
        long srcInfosCount
    ) {
        sType(sType);
        pNext(pNext);
        input(input);
        srcAccelerationStructureData(srcAccelerationStructureData);
        dstAccelerationStructureData(dstAccelerationStructureData);
        scratchData(scratchData);
        srcInfos(srcInfos);
        srcInfosCount(srcInfosCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBuildPartitionedAccelerationStructureInfoNV set(VkBuildPartitionedAccelerationStructureInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBuildPartitionedAccelerationStructureInfoNV malloc() {
        return new VkBuildPartitionedAccelerationStructureInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBuildPartitionedAccelerationStructureInfoNV calloc() {
        return new VkBuildPartitionedAccelerationStructureInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkBuildPartitionedAccelerationStructureInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBuildPartitionedAccelerationStructureInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkBuildPartitionedAccelerationStructureInfoNV} instance for the specified memory address. */
    public static VkBuildPartitionedAccelerationStructureInfoNV create(long address) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBuildPartitionedAccelerationStructureInfoNV createSafe(long address) {
        return address == NULL ? null : new VkBuildPartitionedAccelerationStructureInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBuildPartitionedAccelerationStructureInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBuildPartitionedAccelerationStructureInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBuildPartitionedAccelerationStructureInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV malloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBuildPartitionedAccelerationStructureInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV calloc(MemoryStack stack) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBuildPartitionedAccelerationStructureInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBuildPartitionedAccelerationStructureInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBuildPartitionedAccelerationStructureInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBuildPartitionedAccelerationStructureInfoNV.PNEXT); }
    /** Unsafe version of {@link #input}. */
    public static VkPartitionedAccelerationStructureInstancesInputNV ninput(long struct) { return VkPartitionedAccelerationStructureInstancesInputNV.create(struct + VkBuildPartitionedAccelerationStructureInfoNV.INPUT); }
    /** Unsafe version of {@link #srcAccelerationStructureData}. */
    public static long nsrcAccelerationStructureData(long struct) { return memGetLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SRCACCELERATIONSTRUCTUREDATA); }
    /** Unsafe version of {@link #dstAccelerationStructureData}. */
    public static long ndstAccelerationStructureData(long struct) { return memGetLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.DSTACCELERATIONSTRUCTUREDATA); }
    /** Unsafe version of {@link #scratchData}. */
    public static long nscratchData(long struct) { return memGetLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SCRATCHDATA); }
    /** Unsafe version of {@link #srcInfos}. */
    public static long nsrcInfos(long struct) { return memGetLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SRCINFOS); }
    /** Unsafe version of {@link #srcInfosCount}. */
    public static long nsrcInfosCount(long struct) { return memGetLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SRCINFOSCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBuildPartitionedAccelerationStructureInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBuildPartitionedAccelerationStructureInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #input(VkPartitionedAccelerationStructureInstancesInputNV) input}. */
    public static void ninput(long struct, VkPartitionedAccelerationStructureInstancesInputNV value) { memCopy(value.address(), struct + VkBuildPartitionedAccelerationStructureInfoNV.INPUT, VkPartitionedAccelerationStructureInstancesInputNV.SIZEOF); }
    /** Unsafe version of {@link #srcAccelerationStructureData(long) srcAccelerationStructureData}. */
    public static void nsrcAccelerationStructureData(long struct, long value) { memPutLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SRCACCELERATIONSTRUCTUREDATA, value); }
    /** Unsafe version of {@link #dstAccelerationStructureData(long) dstAccelerationStructureData}. */
    public static void ndstAccelerationStructureData(long struct, long value) { memPutLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.DSTACCELERATIONSTRUCTUREDATA, value); }
    /** Unsafe version of {@link #scratchData(long) scratchData}. */
    public static void nscratchData(long struct, long value) { memPutLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SCRATCHDATA, value); }
    /** Unsafe version of {@link #srcInfos(long) srcInfos}. */
    public static void nsrcInfos(long struct, long value) { memPutLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SRCINFOS, value); }
    /** Unsafe version of {@link #srcInfosCount(long) srcInfosCount}. */
    public static void nsrcInfosCount(long struct, long value) { memPutLong(struct + VkBuildPartitionedAccelerationStructureInfoNV.SRCINFOSCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkBuildPartitionedAccelerationStructureInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkBuildPartitionedAccelerationStructureInfoNV, Buffer> implements NativeResource {

        private static final VkBuildPartitionedAccelerationStructureInfoNV ELEMENT_FACTORY = VkBuildPartitionedAccelerationStructureInfoNV.create(-1L);

        /**
         * Creates a new {@code VkBuildPartitionedAccelerationStructureInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBuildPartitionedAccelerationStructureInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBuildPartitionedAccelerationStructureInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBuildPartitionedAccelerationStructureInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkBuildPartitionedAccelerationStructureInfoNV.npNext(address()); }
        /** @return a {@link VkPartitionedAccelerationStructureInstancesInputNV} view of the {@code input} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV input() { return VkBuildPartitionedAccelerationStructureInfoNV.ninput(address()); }
        /** @return the value of the {@code srcAccelerationStructureData} field. */
        @NativeType("VkDeviceAddress")
        public long srcAccelerationStructureData() { return VkBuildPartitionedAccelerationStructureInfoNV.nsrcAccelerationStructureData(address()); }
        /** @return the value of the {@code dstAccelerationStructureData} field. */
        @NativeType("VkDeviceAddress")
        public long dstAccelerationStructureData() { return VkBuildPartitionedAccelerationStructureInfoNV.ndstAccelerationStructureData(address()); }
        /** @return the value of the {@code scratchData} field. */
        @NativeType("VkDeviceAddress")
        public long scratchData() { return VkBuildPartitionedAccelerationStructureInfoNV.nscratchData(address()); }
        /** @return the value of the {@code srcInfos} field. */
        @NativeType("VkDeviceAddress")
        public long srcInfos() { return VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfos(address()); }
        /** @return the value of the {@code srcInfosCount} field. */
        @NativeType("VkDeviceAddress")
        public long srcInfosCount() { return VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfosCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkBuildPartitionedAccelerationStructureInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV} value to the {@code sType} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_BUILD_PARTITIONED_ACCELERATION_STRUCTURE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer pNext(@NativeType("void *") long value) { VkBuildPartitionedAccelerationStructureInfoNV.npNext(address(), value); return this; }
        /** Copies the specified {@link VkPartitionedAccelerationStructureInstancesInputNV} to the {@code input} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer input(VkPartitionedAccelerationStructureInstancesInputNV value) { VkBuildPartitionedAccelerationStructureInfoNV.ninput(address(), value); return this; }
        /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer input(java.util.function.Consumer<VkPartitionedAccelerationStructureInstancesInputNV> consumer) { consumer.accept(input()); return this; }
        /** Sets the specified value to the {@code srcAccelerationStructureData} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer srcAccelerationStructureData(@NativeType("VkDeviceAddress") long value) { VkBuildPartitionedAccelerationStructureInfoNV.nsrcAccelerationStructureData(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccelerationStructureData} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer dstAccelerationStructureData(@NativeType("VkDeviceAddress") long value) { VkBuildPartitionedAccelerationStructureInfoNV.ndstAccelerationStructureData(address(), value); return this; }
        /** Sets the specified value to the {@code scratchData} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer scratchData(@NativeType("VkDeviceAddress") long value) { VkBuildPartitionedAccelerationStructureInfoNV.nscratchData(address(), value); return this; }
        /** Sets the specified value to the {@code srcInfos} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer srcInfos(@NativeType("VkDeviceAddress") long value) { VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfos(address(), value); return this; }
        /** Sets the specified value to the {@code srcInfosCount} field. */
        public VkBuildPartitionedAccelerationStructureInfoNV.Buffer srcInfosCount(@NativeType("VkDeviceAddress") long value) { VkBuildPartitionedAccelerationStructureInfoNV.nsrcInfosCount(address(), value); return this; }

    }

}