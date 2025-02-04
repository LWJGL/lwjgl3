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
 * struct VkClusterAccelerationStructureCommandsInfoNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     {@link VkClusterAccelerationStructureInputInfoNV VkClusterAccelerationStructureInputInfoNV} input;
 *     VkDeviceAddress dstImplicitData;
 *     VkDeviceAddress scratchData;
 *     {@link VkStridedDeviceAddressRegionKHR VkStridedDeviceAddressRegionKHR} dstAddressesArray;
 *     {@link VkStridedDeviceAddressRegionKHR VkStridedDeviceAddressRegionKHR} dstSizesArray;
 *     {@link VkStridedDeviceAddressRegionKHR VkStridedDeviceAddressRegionKHR} srcInfosArray;
 *     VkDeviceAddress srcInfosCount;
 *     VkClusterAccelerationStructureAddressResolutionFlagsNV addressResolutionFlags;
 * }}</pre>
 */
public class VkClusterAccelerationStructureCommandsInfoNV extends Struct<VkClusterAccelerationStructureCommandsInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INPUT,
        DSTIMPLICITDATA,
        SCRATCHDATA,
        DSTADDRESSESARRAY,
        DSTSIZESARRAY,
        SRCINFOSARRAY,
        SRCINFOSCOUNT,
        ADDRESSRESOLUTIONFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkClusterAccelerationStructureInputInfoNV.SIZEOF, VkClusterAccelerationStructureInputInfoNV.ALIGNOF),
            __member(8),
            __member(8),
            __member(VkStridedDeviceAddressRegionKHR.SIZEOF, VkStridedDeviceAddressRegionKHR.ALIGNOF),
            __member(VkStridedDeviceAddressRegionKHR.SIZEOF, VkStridedDeviceAddressRegionKHR.ALIGNOF),
            __member(VkStridedDeviceAddressRegionKHR.SIZEOF, VkStridedDeviceAddressRegionKHR.ALIGNOF),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INPUT = layout.offsetof(2);
        DSTIMPLICITDATA = layout.offsetof(3);
        SCRATCHDATA = layout.offsetof(4);
        DSTADDRESSESARRAY = layout.offsetof(5);
        DSTSIZESARRAY = layout.offsetof(6);
        SRCINFOSARRAY = layout.offsetof(7);
        SRCINFOSCOUNT = layout.offsetof(8);
        ADDRESSRESOLUTIONFLAGS = layout.offsetof(9);
    }

    protected VkClusterAccelerationStructureCommandsInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureCommandsInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureCommandsInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureCommandsInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureCommandsInfoNV(ByteBuffer container) {
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
    /** @return a {@link VkClusterAccelerationStructureInputInfoNV} view of the {@code input} field. */
    public VkClusterAccelerationStructureInputInfoNV input() { return ninput(address()); }
    /** @return the value of the {@code dstImplicitData} field. */
    @NativeType("VkDeviceAddress")
    public long dstImplicitData() { return ndstImplicitData(address()); }
    /** @return the value of the {@code scratchData} field. */
    @NativeType("VkDeviceAddress")
    public long scratchData() { return nscratchData(address()); }
    /** @return a {@link VkStridedDeviceAddressRegionKHR} view of the {@code dstAddressesArray} field. */
    public VkStridedDeviceAddressRegionKHR dstAddressesArray() { return ndstAddressesArray(address()); }
    /** @return a {@link VkStridedDeviceAddressRegionKHR} view of the {@code dstSizesArray} field. */
    public VkStridedDeviceAddressRegionKHR dstSizesArray() { return ndstSizesArray(address()); }
    /** @return a {@link VkStridedDeviceAddressRegionKHR} view of the {@code srcInfosArray} field. */
    public VkStridedDeviceAddressRegionKHR srcInfosArray() { return nsrcInfosArray(address()); }
    /** @return the value of the {@code srcInfosCount} field. */
    @NativeType("VkDeviceAddress")
    public long srcInfosCount() { return nsrcInfosCount(address()); }
    /** @return the value of the {@code addressResolutionFlags} field. */
    @NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV")
    public int addressResolutionFlags() { return naddressResolutionFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkClusterAccelerationStructureCommandsInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV} value to the {@code sType} field. */
    public VkClusterAccelerationStructureCommandsInfoNV sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkClusterAccelerationStructureCommandsInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkClusterAccelerationStructureInputInfoNV} to the {@code input} field. */
    public VkClusterAccelerationStructureCommandsInfoNV input(VkClusterAccelerationStructureInputInfoNV value) { ninput(address(), value); return this; }
    /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureCommandsInfoNV input(java.util.function.Consumer<VkClusterAccelerationStructureInputInfoNV> consumer) { consumer.accept(input()); return this; }
    /** Sets the specified value to the {@code dstImplicitData} field. */
    public VkClusterAccelerationStructureCommandsInfoNV dstImplicitData(@NativeType("VkDeviceAddress") long value) { ndstImplicitData(address(), value); return this; }
    /** Sets the specified value to the {@code scratchData} field. */
    public VkClusterAccelerationStructureCommandsInfoNV scratchData(@NativeType("VkDeviceAddress") long value) { nscratchData(address(), value); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressRegionKHR} to the {@code dstAddressesArray} field. */
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(VkStridedDeviceAddressRegionKHR value) { ndstAddressesArray(address(), value); return this; }
    /** Passes the {@code dstAddressesArray} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureCommandsInfoNV dstAddressesArray(java.util.function.Consumer<VkStridedDeviceAddressRegionKHR> consumer) { consumer.accept(dstAddressesArray()); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressRegionKHR} to the {@code dstSizesArray} field. */
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(VkStridedDeviceAddressRegionKHR value) { ndstSizesArray(address(), value); return this; }
    /** Passes the {@code dstSizesArray} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureCommandsInfoNV dstSizesArray(java.util.function.Consumer<VkStridedDeviceAddressRegionKHR> consumer) { consumer.accept(dstSizesArray()); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressRegionKHR} to the {@code srcInfosArray} field. */
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(VkStridedDeviceAddressRegionKHR value) { nsrcInfosArray(address(), value); return this; }
    /** Passes the {@code srcInfosArray} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosArray(java.util.function.Consumer<VkStridedDeviceAddressRegionKHR> consumer) { consumer.accept(srcInfosArray()); return this; }
    /** Sets the specified value to the {@code srcInfosCount} field. */
    public VkClusterAccelerationStructureCommandsInfoNV srcInfosCount(@NativeType("VkDeviceAddress") long value) { nsrcInfosCount(address(), value); return this; }
    /** Sets the specified value to the {@code addressResolutionFlags} field. */
    public VkClusterAccelerationStructureCommandsInfoNV addressResolutionFlags(@NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV") int value) { naddressResolutionFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureCommandsInfoNV set(
        int sType,
        long pNext,
        VkClusterAccelerationStructureInputInfoNV input,
        long dstImplicitData,
        long scratchData,
        VkStridedDeviceAddressRegionKHR dstAddressesArray,
        VkStridedDeviceAddressRegionKHR dstSizesArray,
        VkStridedDeviceAddressRegionKHR srcInfosArray,
        long srcInfosCount,
        int addressResolutionFlags
    ) {
        sType(sType);
        pNext(pNext);
        input(input);
        dstImplicitData(dstImplicitData);
        scratchData(scratchData);
        dstAddressesArray(dstAddressesArray);
        dstSizesArray(dstSizesArray);
        srcInfosArray(srcInfosArray);
        srcInfosCount(srcInfosCount);
        addressResolutionFlags(addressResolutionFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureCommandsInfoNV set(VkClusterAccelerationStructureCommandsInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureCommandsInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureCommandsInfoNV malloc() {
        return new VkClusterAccelerationStructureCommandsInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureCommandsInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureCommandsInfoNV calloc() {
        return new VkClusterAccelerationStructureCommandsInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureCommandsInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureCommandsInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureCommandsInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureCommandsInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureCommandsInfoNV create(long address) {
        return new VkClusterAccelerationStructureCommandsInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureCommandsInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureCommandsInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureCommandsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureCommandsInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureCommandsInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureCommandsInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureCommandsInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureCommandsInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureCommandsInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureCommandsInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureCommandsInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureCommandsInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureCommandsInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureCommandsInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureCommandsInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureCommandsInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureCommandsInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureCommandsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureCommandsInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureCommandsInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureCommandsInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkClusterAccelerationStructureCommandsInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkClusterAccelerationStructureCommandsInfoNV.PNEXT); }
    /** Unsafe version of {@link #input}. */
    public static VkClusterAccelerationStructureInputInfoNV ninput(long struct) { return VkClusterAccelerationStructureInputInfoNV.create(struct + VkClusterAccelerationStructureCommandsInfoNV.INPUT); }
    /** Unsafe version of {@link #dstImplicitData}. */
    public static long ndstImplicitData(long struct) { return memGetLong(struct + VkClusterAccelerationStructureCommandsInfoNV.DSTIMPLICITDATA); }
    /** Unsafe version of {@link #scratchData}. */
    public static long nscratchData(long struct) { return memGetLong(struct + VkClusterAccelerationStructureCommandsInfoNV.SCRATCHDATA); }
    /** Unsafe version of {@link #dstAddressesArray}. */
    public static VkStridedDeviceAddressRegionKHR ndstAddressesArray(long struct) { return VkStridedDeviceAddressRegionKHR.create(struct + VkClusterAccelerationStructureCommandsInfoNV.DSTADDRESSESARRAY); }
    /** Unsafe version of {@link #dstSizesArray}. */
    public static VkStridedDeviceAddressRegionKHR ndstSizesArray(long struct) { return VkStridedDeviceAddressRegionKHR.create(struct + VkClusterAccelerationStructureCommandsInfoNV.DSTSIZESARRAY); }
    /** Unsafe version of {@link #srcInfosArray}. */
    public static VkStridedDeviceAddressRegionKHR nsrcInfosArray(long struct) { return VkStridedDeviceAddressRegionKHR.create(struct + VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSARRAY); }
    /** Unsafe version of {@link #srcInfosCount}. */
    public static long nsrcInfosCount(long struct) { return memGetLong(struct + VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSCOUNT); }
    /** Unsafe version of {@link #addressResolutionFlags}. */
    public static int naddressResolutionFlags(long struct) { return memGetInt(struct + VkClusterAccelerationStructureCommandsInfoNV.ADDRESSRESOLUTIONFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureCommandsInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkClusterAccelerationStructureCommandsInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #input(VkClusterAccelerationStructureInputInfoNV) input}. */
    public static void ninput(long struct, VkClusterAccelerationStructureInputInfoNV value) { memCopy(value.address(), struct + VkClusterAccelerationStructureCommandsInfoNV.INPUT, VkClusterAccelerationStructureInputInfoNV.SIZEOF); }
    /** Unsafe version of {@link #dstImplicitData(long) dstImplicitData}. */
    public static void ndstImplicitData(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureCommandsInfoNV.DSTIMPLICITDATA, value); }
    /** Unsafe version of {@link #scratchData(long) scratchData}. */
    public static void nscratchData(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureCommandsInfoNV.SCRATCHDATA, value); }
    /** Unsafe version of {@link #dstAddressesArray(VkStridedDeviceAddressRegionKHR) dstAddressesArray}. */
    public static void ndstAddressesArray(long struct, VkStridedDeviceAddressRegionKHR value) { memCopy(value.address(), struct + VkClusterAccelerationStructureCommandsInfoNV.DSTADDRESSESARRAY, VkStridedDeviceAddressRegionKHR.SIZEOF); }
    /** Unsafe version of {@link #dstSizesArray(VkStridedDeviceAddressRegionKHR) dstSizesArray}. */
    public static void ndstSizesArray(long struct, VkStridedDeviceAddressRegionKHR value) { memCopy(value.address(), struct + VkClusterAccelerationStructureCommandsInfoNV.DSTSIZESARRAY, VkStridedDeviceAddressRegionKHR.SIZEOF); }
    /** Unsafe version of {@link #srcInfosArray(VkStridedDeviceAddressRegionKHR) srcInfosArray}. */
    public static void nsrcInfosArray(long struct, VkStridedDeviceAddressRegionKHR value) { memCopy(value.address(), struct + VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSARRAY, VkStridedDeviceAddressRegionKHR.SIZEOF); }
    /** Unsafe version of {@link #srcInfosCount(long) srcInfosCount}. */
    public static void nsrcInfosCount(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureCommandsInfoNV.SRCINFOSCOUNT, value); }
    /** Unsafe version of {@link #addressResolutionFlags(int) addressResolutionFlags}. */
    public static void naddressResolutionFlags(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureCommandsInfoNV.ADDRESSRESOLUTIONFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureCommandsInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureCommandsInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureCommandsInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureCommandsInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureCommandsInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureCommandsInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureCommandsInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkClusterAccelerationStructureCommandsInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkClusterAccelerationStructureCommandsInfoNV.npNext(address()); }
        /** @return a {@link VkClusterAccelerationStructureInputInfoNV} view of the {@code input} field. */
        public VkClusterAccelerationStructureInputInfoNV input() { return VkClusterAccelerationStructureCommandsInfoNV.ninput(address()); }
        /** @return the value of the {@code dstImplicitData} field. */
        @NativeType("VkDeviceAddress")
        public long dstImplicitData() { return VkClusterAccelerationStructureCommandsInfoNV.ndstImplicitData(address()); }
        /** @return the value of the {@code scratchData} field. */
        @NativeType("VkDeviceAddress")
        public long scratchData() { return VkClusterAccelerationStructureCommandsInfoNV.nscratchData(address()); }
        /** @return a {@link VkStridedDeviceAddressRegionKHR} view of the {@code dstAddressesArray} field. */
        public VkStridedDeviceAddressRegionKHR dstAddressesArray() { return VkClusterAccelerationStructureCommandsInfoNV.ndstAddressesArray(address()); }
        /** @return a {@link VkStridedDeviceAddressRegionKHR} view of the {@code dstSizesArray} field. */
        public VkStridedDeviceAddressRegionKHR dstSizesArray() { return VkClusterAccelerationStructureCommandsInfoNV.ndstSizesArray(address()); }
        /** @return a {@link VkStridedDeviceAddressRegionKHR} view of the {@code srcInfosArray} field. */
        public VkStridedDeviceAddressRegionKHR srcInfosArray() { return VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosArray(address()); }
        /** @return the value of the {@code srcInfosCount} field. */
        @NativeType("VkDeviceAddress")
        public long srcInfosCount() { return VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosCount(address()); }
        /** @return the value of the {@code addressResolutionFlags} field. */
        @NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV")
        public int addressResolutionFlags() { return VkClusterAccelerationStructureCommandsInfoNV.naddressResolutionFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkClusterAccelerationStructureCommandsInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVClusterAccelerationStructure#VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV} value to the {@code sType} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer sType$Default() { return sType(NVClusterAccelerationStructure.VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_COMMANDS_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer pNext(@NativeType("void *") long value) { VkClusterAccelerationStructureCommandsInfoNV.npNext(address(), value); return this; }
        /** Copies the specified {@link VkClusterAccelerationStructureInputInfoNV} to the {@code input} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer input(VkClusterAccelerationStructureInputInfoNV value) { VkClusterAccelerationStructureCommandsInfoNV.ninput(address(), value); return this; }
        /** Passes the {@code input} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer input(java.util.function.Consumer<VkClusterAccelerationStructureInputInfoNV> consumer) { consumer.accept(input()); return this; }
        /** Sets the specified value to the {@code dstImplicitData} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer dstImplicitData(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureCommandsInfoNV.ndstImplicitData(address(), value); return this; }
        /** Sets the specified value to the {@code scratchData} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer scratchData(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureCommandsInfoNV.nscratchData(address(), value); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressRegionKHR} to the {@code dstAddressesArray} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer dstAddressesArray(VkStridedDeviceAddressRegionKHR value) { VkClusterAccelerationStructureCommandsInfoNV.ndstAddressesArray(address(), value); return this; }
        /** Passes the {@code dstAddressesArray} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer dstAddressesArray(java.util.function.Consumer<VkStridedDeviceAddressRegionKHR> consumer) { consumer.accept(dstAddressesArray()); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressRegionKHR} to the {@code dstSizesArray} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer dstSizesArray(VkStridedDeviceAddressRegionKHR value) { VkClusterAccelerationStructureCommandsInfoNV.ndstSizesArray(address(), value); return this; }
        /** Passes the {@code dstSizesArray} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer dstSizesArray(java.util.function.Consumer<VkStridedDeviceAddressRegionKHR> consumer) { consumer.accept(dstSizesArray()); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressRegionKHR} to the {@code srcInfosArray} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer srcInfosArray(VkStridedDeviceAddressRegionKHR value) { VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosArray(address(), value); return this; }
        /** Passes the {@code srcInfosArray} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer srcInfosArray(java.util.function.Consumer<VkStridedDeviceAddressRegionKHR> consumer) { consumer.accept(srcInfosArray()); return this; }
        /** Sets the specified value to the {@code srcInfosCount} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer srcInfosCount(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureCommandsInfoNV.nsrcInfosCount(address(), value); return this; }
        /** Sets the specified value to the {@code addressResolutionFlags} field. */
        public VkClusterAccelerationStructureCommandsInfoNV.Buffer addressResolutionFlags(@NativeType("VkClusterAccelerationStructureAddressResolutionFlagsNV") int value) { VkClusterAccelerationStructureCommandsInfoNV.naddressResolutionFlags(address(), value); return this; }

    }

}