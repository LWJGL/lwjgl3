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
 * <pre><code>
 * struct VkMemoryRangeBarrierKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineStageFlags2 srcStageMask;
 *     VkAccessFlags2 srcAccessMask;
 *     VkPipelineStageFlags2 dstStageMask;
 *     VkAccessFlags2 dstAccessMask;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     {@link VkDeviceAddressRangeKHR VkDeviceAddressRangeKHR} addressRange;
 *     VkAddressCommandFlagsKHR addressFlags;
 * }</code></pre>
 */
public class VkMemoryRangeBarrierKHR extends Struct<VkMemoryRangeBarrierKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSTAGEMASK,
        SRCACCESSMASK,
        DSTSTAGEMASK,
        DSTACCESSMASK,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        ADDRESSRANGE,
        ADDRESSFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(VkDeviceAddressRangeKHR.SIZEOF, VkDeviceAddressRangeKHR.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSTAGEMASK = layout.offsetof(2);
        SRCACCESSMASK = layout.offsetof(3);
        DSTSTAGEMASK = layout.offsetof(4);
        DSTACCESSMASK = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        ADDRESSRANGE = layout.offsetof(8);
        ADDRESSFLAGS = layout.offsetof(9);
    }

    protected VkMemoryRangeBarrierKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryRangeBarrierKHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryRangeBarrierKHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryRangeBarrierKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryRangeBarrierKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code srcStageMask} field. */
    @NativeType("VkPipelineStageFlags2")
    public long srcStageMask() { return nsrcStageMask(address()); }
    /** @return the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags2")
    public long srcAccessMask() { return nsrcAccessMask(address()); }
    /** @return the value of the {@code dstStageMask} field. */
    @NativeType("VkPipelineStageFlags2")
    public long dstStageMask() { return ndstStageMask(address()); }
    /** @return the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags2")
    public long dstAccessMask() { return ndstAccessMask(address()); }
    /** @return the value of the {@code srcQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** @return the value of the {@code dstQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code addressRange} field. */
    public VkDeviceAddressRangeKHR addressRange() { return naddressRange(address()); }
    /** @return the value of the {@code addressFlags} field. */
    @NativeType("VkAddressCommandFlagsKHR")
    public int addressFlags() { return naddressFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryRangeBarrierKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR} value to the {@code sType} field. */
    public VkMemoryRangeBarrierKHR sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryRangeBarrierKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcStageMask} field. */
    public VkMemoryRangeBarrierKHR srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkMemoryRangeBarrierKHR srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    public VkMemoryRangeBarrierKHR dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkMemoryRangeBarrierKHR dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
    public VkMemoryRangeBarrierKHR srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
    public VkMemoryRangeBarrierKHR dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
    public VkMemoryRangeBarrierKHR addressRange(VkDeviceAddressRangeKHR value) { naddressRange(address(), value); return this; }
    /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMemoryRangeBarrierKHR addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
    /** Sets the specified value to the {@code addressFlags} field. */
    public VkMemoryRangeBarrierKHR addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { naddressFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryRangeBarrierKHR set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        VkDeviceAddressRangeKHR addressRange,
        int addressFlags
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        addressRange(addressRange);
        addressFlags(addressFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryRangeBarrierKHR set(VkMemoryRangeBarrierKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryRangeBarrierKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryRangeBarrierKHR malloc() {
        return new VkMemoryRangeBarrierKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryRangeBarrierKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryRangeBarrierKHR calloc() {
        return new VkMemoryRangeBarrierKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryRangeBarrierKHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryRangeBarrierKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryRangeBarrierKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryRangeBarrierKHR} instance for the specified memory address. */
    public static VkMemoryRangeBarrierKHR create(long address) {
        return new VkMemoryRangeBarrierKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryRangeBarrierKHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryRangeBarrierKHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarrierKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarrierKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarrierKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarrierKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarrierKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarrierKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryRangeBarrierKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarrierKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryRangeBarrierKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryRangeBarrierKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRangeBarrierKHR malloc(MemoryStack stack) {
        return new VkMemoryRangeBarrierKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryRangeBarrierKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryRangeBarrierKHR calloc(MemoryStack stack) {
        return new VkMemoryRangeBarrierKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarrierKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarrierKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryRangeBarrierKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryRangeBarrierKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryRangeBarrierKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryRangeBarrierKHR.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static long nsrcStageMask(long struct) { return memGetLong(struct + VkMemoryRangeBarrierKHR.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static long nsrcAccessMask(long struct) { return memGetLong(struct + VkMemoryRangeBarrierKHR.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static long ndstStageMask(long struct) { return memGetLong(struct + VkMemoryRangeBarrierKHR.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static long ndstAccessMask(long struct) { return memGetLong(struct + VkMemoryRangeBarrierKHR.DSTACCESSMASK); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkMemoryRangeBarrierKHR.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkMemoryRangeBarrierKHR.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #addressRange}. */
    public static VkDeviceAddressRangeKHR naddressRange(long struct) { return VkDeviceAddressRangeKHR.create(struct + VkMemoryRangeBarrierKHR.ADDRESSRANGE); }
    /** Unsafe version of {@link #addressFlags}. */
    public static int naddressFlags(long struct) { return memGetInt(struct + VkMemoryRangeBarrierKHR.ADDRESSFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryRangeBarrierKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryRangeBarrierKHR.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(long) srcStageMask}. */
    public static void nsrcStageMask(long struct, long value) { memPutLong(struct + VkMemoryRangeBarrierKHR.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(long) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, long value) { memPutLong(struct + VkMemoryRangeBarrierKHR.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(long) dstStageMask}. */
    public static void ndstStageMask(long struct, long value) { memPutLong(struct + VkMemoryRangeBarrierKHR.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(long) dstAccessMask}. */
    public static void ndstAccessMask(long struct, long value) { memPutLong(struct + VkMemoryRangeBarrierKHR.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkMemoryRangeBarrierKHR.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkMemoryRangeBarrierKHR.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #addressRange(VkDeviceAddressRangeKHR) addressRange}. */
    public static void naddressRange(long struct, VkDeviceAddressRangeKHR value) { memCopy(value.address(), struct + VkMemoryRangeBarrierKHR.ADDRESSRANGE, VkDeviceAddressRangeKHR.SIZEOF); }
    /** Unsafe version of {@link #addressFlags(int) addressFlags}. */
    public static void naddressFlags(long struct, int value) { memPutInt(struct + VkMemoryRangeBarrierKHR.ADDRESSFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryRangeBarrierKHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryRangeBarrierKHR, Buffer> implements NativeResource {

        private static final VkMemoryRangeBarrierKHR ELEMENT_FACTORY = VkMemoryRangeBarrierKHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryRangeBarrierKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryRangeBarrierKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryRangeBarrierKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryRangeBarrierKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryRangeBarrierKHR.npNext(address()); }
        /** @return the value of the {@code srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() { return VkMemoryRangeBarrierKHR.nsrcStageMask(address()); }
        /** @return the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long srcAccessMask() { return VkMemoryRangeBarrierKHR.nsrcAccessMask(address()); }
        /** @return the value of the {@code dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() { return VkMemoryRangeBarrierKHR.ndstStageMask(address()); }
        /** @return the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long dstAccessMask() { return VkMemoryRangeBarrierKHR.ndstAccessMask(address()); }
        /** @return the value of the {@code srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkMemoryRangeBarrierKHR.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@code dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkMemoryRangeBarrierKHR.ndstQueueFamilyIndex(address()); }
        /** @return a {@link VkDeviceAddressRangeKHR} view of the {@code addressRange} field. */
        public VkDeviceAddressRangeKHR addressRange() { return VkMemoryRangeBarrierKHR.naddressRange(address()); }
        /** @return the value of the {@code addressFlags} field. */
        @NativeType("VkAddressCommandFlagsKHR")
        public int addressFlags() { return VkMemoryRangeBarrierKHR.naddressFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryRangeBarrierKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryRangeBarrierKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDeviceAddressCommands#VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR} value to the {@code sType} field. */
        public VkMemoryRangeBarrierKHR.Buffer sType$Default() { return sType(KHRDeviceAddressCommands.VK_STRUCTURE_TYPE_MEMORY_RANGE_BARRIER_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryRangeBarrierKHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryRangeBarrierKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcStageMask} field. */
        public VkMemoryRangeBarrierKHR.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkMemoryRangeBarrierKHR.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkMemoryRangeBarrierKHR.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkMemoryRangeBarrierKHR.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        public VkMemoryRangeBarrierKHR.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkMemoryRangeBarrierKHR.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkMemoryRangeBarrierKHR.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkMemoryRangeBarrierKHR.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
        public VkMemoryRangeBarrierKHR.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkMemoryRangeBarrierKHR.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
        public VkMemoryRangeBarrierKHR.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkMemoryRangeBarrierKHR.ndstQueueFamilyIndex(address(), value); return this; }
        /** Copies the specified {@link VkDeviceAddressRangeKHR} to the {@code addressRange} field. */
        public VkMemoryRangeBarrierKHR.Buffer addressRange(VkDeviceAddressRangeKHR value) { VkMemoryRangeBarrierKHR.naddressRange(address(), value); return this; }
        /** Passes the {@code addressRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMemoryRangeBarrierKHR.Buffer addressRange(java.util.function.Consumer<VkDeviceAddressRangeKHR> consumer) { consumer.accept(addressRange()); return this; }
        /** Sets the specified value to the {@code addressFlags} field. */
        public VkMemoryRangeBarrierKHR.Buffer addressFlags(@NativeType("VkAddressCommandFlagsKHR") int value) { VkMemoryRangeBarrierKHR.naddressFlags(address(), value); return this; }

    }

}