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
 * struct VkPartitionedAccelerationStructureInstancesInputNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBuildAccelerationStructureFlagsKHR flags;
 *     uint32_t instanceCount;
 *     uint32_t maxInstancePerPartitionCount;
 *     uint32_t partitionCount;
 *     uint32_t maxInstanceInGlobalPartitionCount;
 * }}</pre>
 */
public class VkPartitionedAccelerationStructureInstancesInputNV extends Struct<VkPartitionedAccelerationStructureInstancesInputNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        INSTANCECOUNT,
        MAXINSTANCEPERPARTITIONCOUNT,
        PARTITIONCOUNT,
        MAXINSTANCEINGLOBALPARTITIONCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        INSTANCECOUNT = layout.offsetof(3);
        MAXINSTANCEPERPARTITIONCOUNT = layout.offsetof(4);
        PARTITIONCOUNT = layout.offsetof(5);
        MAXINSTANCEINGLOBALPARTITIONCOUNT = layout.offsetof(6);
    }

    protected VkPartitionedAccelerationStructureInstancesInputNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPartitionedAccelerationStructureInstancesInputNV create(long address, @Nullable ByteBuffer container) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(address, container);
    }

    /**
     * Creates a {@code VkPartitionedAccelerationStructureInstancesInputNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPartitionedAccelerationStructureInstancesInputNV(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkBuildAccelerationStructureFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code instanceCount} field. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** @return the value of the {@code maxInstancePerPartitionCount} field. */
    @NativeType("uint32_t")
    public int maxInstancePerPartitionCount() { return nmaxInstancePerPartitionCount(address()); }
    /** @return the value of the {@code partitionCount} field. */
    @NativeType("uint32_t")
    public int partitionCount() { return npartitionCount(address()); }
    /** @return the value of the {@code maxInstanceInGlobalPartitionCount} field. */
    @NativeType("uint32_t")
    public int maxInstanceInGlobalPartitionCount() { return nmaxInstanceInGlobalPartitionCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV} value to the {@code sType} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPartitionedAccelerationStructureFlagsNV} value to the {@code pNext} chain. */
    public VkPartitionedAccelerationStructureInstancesInputNV pNext(VkPartitionedAccelerationStructureFlagsNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code instanceCount} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxInstancePerPartitionCount} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstancePerPartitionCount(@NativeType("uint32_t") int value) { nmaxInstancePerPartitionCount(address(), value); return this; }
    /** Sets the specified value to the {@code partitionCount} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV partitionCount(@NativeType("uint32_t") int value) { npartitionCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxInstanceInGlobalPartitionCount} field. */
    public VkPartitionedAccelerationStructureInstancesInputNV maxInstanceInGlobalPartitionCount(@NativeType("uint32_t") int value) { nmaxInstanceInGlobalPartitionCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPartitionedAccelerationStructureInstancesInputNV set(
        int sType,
        long pNext,
        int flags,
        int instanceCount,
        int maxInstancePerPartitionCount,
        int partitionCount,
        int maxInstanceInGlobalPartitionCount
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        instanceCount(instanceCount);
        maxInstancePerPartitionCount(maxInstancePerPartitionCount);
        partitionCount(partitionCount);
        maxInstanceInGlobalPartitionCount(maxInstanceInGlobalPartitionCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPartitionedAccelerationStructureInstancesInputNV set(VkPartitionedAccelerationStructureInstancesInputNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPartitionedAccelerationStructureInstancesInputNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureInstancesInputNV malloc() {
        return new VkPartitionedAccelerationStructureInstancesInputNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureInstancesInputNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPartitionedAccelerationStructureInstancesInputNV calloc() {
        return new VkPartitionedAccelerationStructureInstancesInputNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureInstancesInputNV} instance allocated with {@link BufferUtils}. */
    public static VkPartitionedAccelerationStructureInstancesInputNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPartitionedAccelerationStructureInstancesInputNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPartitionedAccelerationStructureInstancesInputNV} instance for the specified memory address. */
    public static VkPartitionedAccelerationStructureInstancesInputNV create(long address) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPartitionedAccelerationStructureInstancesInputNV createSafe(long address) {
        return address == NULL ? null : new VkPartitionedAccelerationStructureInstancesInputNV(address, null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureInstancesInputNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureInstancesInputNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureInstancesInputNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPartitionedAccelerationStructureInstancesInputNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPartitionedAccelerationStructureInstancesInputNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureInstancesInputNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV malloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPartitionedAccelerationStructureInstancesInputNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV calloc(MemoryStack stack) {
        return new VkPartitionedAccelerationStructureInstancesInputNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureInstancesInputNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPartitionedAccelerationStructureInstancesInputNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPartitionedAccelerationStructureInstancesInputNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPartitionedAccelerationStructureInstancesInputNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.FLAGS); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.INSTANCECOUNT); }
    /** Unsafe version of {@link #maxInstancePerPartitionCount}. */
    public static int nmaxInstancePerPartitionCount(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEPERPARTITIONCOUNT); }
    /** Unsafe version of {@link #partitionCount}. */
    public static int npartitionCount(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.PARTITIONCOUNT); }
    /** Unsafe version of {@link #maxInstanceInGlobalPartitionCount}. */
    public static int nmaxInstanceInGlobalPartitionCount(long struct) { return memGetInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEINGLOBALPARTITIONCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPartitionedAccelerationStructureInstancesInputNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.FLAGS, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.INSTANCECOUNT, value); }
    /** Unsafe version of {@link #maxInstancePerPartitionCount(int) maxInstancePerPartitionCount}. */
    public static void nmaxInstancePerPartitionCount(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEPERPARTITIONCOUNT, value); }
    /** Unsafe version of {@link #partitionCount(int) partitionCount}. */
    public static void npartitionCount(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.PARTITIONCOUNT, value); }
    /** Unsafe version of {@link #maxInstanceInGlobalPartitionCount(int) maxInstanceInGlobalPartitionCount}. */
    public static void nmaxInstanceInGlobalPartitionCount(long struct, int value) { memPutInt(struct + VkPartitionedAccelerationStructureInstancesInputNV.MAXINSTANCEINGLOBALPARTITIONCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkPartitionedAccelerationStructureInstancesInputNV} structs. */
    public static class Buffer extends StructBuffer<VkPartitionedAccelerationStructureInstancesInputNV, Buffer> implements NativeResource {

        private static final VkPartitionedAccelerationStructureInstancesInputNV ELEMENT_FACTORY = VkPartitionedAccelerationStructureInstancesInputNV.create(-1L);

        /**
         * Creates a new {@code VkPartitionedAccelerationStructureInstancesInputNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPartitionedAccelerationStructureInstancesInputNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPartitionedAccelerationStructureInstancesInputNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPartitionedAccelerationStructureInstancesInputNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPartitionedAccelerationStructureInstancesInputNV.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkBuildAccelerationStructureFlagsKHR")
        public int flags() { return VkPartitionedAccelerationStructureInstancesInputNV.nflags(address()); }
        /** @return the value of the {@code instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkPartitionedAccelerationStructureInstancesInputNV.ninstanceCount(address()); }
        /** @return the value of the {@code maxInstancePerPartitionCount} field. */
        @NativeType("uint32_t")
        public int maxInstancePerPartitionCount() { return VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstancePerPartitionCount(address()); }
        /** @return the value of the {@code partitionCount} field. */
        @NativeType("uint32_t")
        public int partitionCount() { return VkPartitionedAccelerationStructureInstancesInputNV.npartitionCount(address()); }
        /** @return the value of the {@code maxInstanceInGlobalPartitionCount} field. */
        @NativeType("uint32_t")
        public int maxInstanceInGlobalPartitionCount() { return VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstanceInGlobalPartitionCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPartitionedAccelerationStructureInstancesInputNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPartitionedAccelerationStructure#VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV} value to the {@code sType} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer sType$Default() { return sType(NVPartitionedAccelerationStructure.VK_STRUCTURE_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_INSTANCES_INPUT_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer pNext(@NativeType("void *") long value) { VkPartitionedAccelerationStructureInstancesInputNV.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPartitionedAccelerationStructureFlagsNV} value to the {@code pNext} chain. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer pNext(VkPartitionedAccelerationStructureFlagsNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer flags(@NativeType("VkBuildAccelerationStructureFlagsKHR") int value) { VkPartitionedAccelerationStructureInstancesInputNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code instanceCount} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer instanceCount(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureInstancesInputNV.ninstanceCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxInstancePerPartitionCount} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer maxInstancePerPartitionCount(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstancePerPartitionCount(address(), value); return this; }
        /** Sets the specified value to the {@code partitionCount} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer partitionCount(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureInstancesInputNV.npartitionCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxInstanceInGlobalPartitionCount} field. */
        public VkPartitionedAccelerationStructureInstancesInputNV.Buffer maxInstanceInGlobalPartitionCount(@NativeType("uint32_t") int value) { VkPartitionedAccelerationStructureInstancesInputNV.nmaxInstanceInGlobalPartitionCount(address(), value); return this; }

    }

}