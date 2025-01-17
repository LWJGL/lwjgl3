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
 * struct VkBufferMemoryBarrier2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineStageFlags2 srcStageMask;
 *     VkAccessFlags2 srcAccessMask;
 *     VkPipelineStageFlags2 dstStageMask;
 *     VkAccessFlags2 dstAccessMask;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkBufferMemoryBarrier2 extends Struct<VkBufferMemoryBarrier2> implements NativeResource {

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
        BUFFER,
        OFFSET,
        SIZE;

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
            __member(8),
            __member(8),
            __member(8)
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
        BUFFER = layout.offsetof(8);
        OFFSET = layout.offsetof(9);
        SIZE = layout.offsetof(10);
    }

    protected VkBufferMemoryBarrier2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBufferMemoryBarrier2 create(long address, @Nullable ByteBuffer container) {
        return new VkBufferMemoryBarrier2(address, container);
    }

    /**
     * Creates a {@code VkBufferMemoryBarrier2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferMemoryBarrier2(ByteBuffer container) {
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
    /** @return the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBufferMemoryBarrier2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2} value to the {@code sType} field. */
    public VkBufferMemoryBarrier2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBufferMemoryBarrier2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
    public VkBufferMemoryBarrier2 pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkMemoryBarrierAccessFlags3KHR} value to the {@code pNext} chain. */
    public VkBufferMemoryBarrier2 pNext(VkMemoryBarrierAccessFlags3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code srcStageMask} field. */
    public VkBufferMemoryBarrier2 srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { nsrcStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkBufferMemoryBarrier2 srcAccessMask(@NativeType("VkAccessFlags2") long value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstStageMask} field. */
    public VkBufferMemoryBarrier2 dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { ndstStageMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkBufferMemoryBarrier2 dstAccessMask(@NativeType("VkAccessFlags2") long value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
    public VkBufferMemoryBarrier2 srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
    public VkBufferMemoryBarrier2 dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkBufferMemoryBarrier2 buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkBufferMemoryBarrier2 offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkBufferMemoryBarrier2 size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferMemoryBarrier2 set(
        int sType,
        long pNext,
        long srcStageMask,
        long srcAccessMask,
        long dstStageMask,
        long dstAccessMask,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long buffer,
        long offset,
        long size
    ) {
        sType(sType);
        pNext(pNext);
        srcStageMask(srcStageMask);
        srcAccessMask(srcAccessMask);
        dstStageMask(dstStageMask);
        dstAccessMask(dstAccessMask);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        buffer(buffer);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferMemoryBarrier2 set(VkBufferMemoryBarrier2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferMemoryBarrier2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryBarrier2 malloc() {
        return new VkBufferMemoryBarrier2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBufferMemoryBarrier2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferMemoryBarrier2 calloc() {
        return new VkBufferMemoryBarrier2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBufferMemoryBarrier2} instance allocated with {@link BufferUtils}. */
    public static VkBufferMemoryBarrier2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBufferMemoryBarrier2(memAddress(container), container);
    }

    /** Returns a new {@code VkBufferMemoryBarrier2} instance for the specified memory address. */
    public static VkBufferMemoryBarrier2 create(long address) {
        return new VkBufferMemoryBarrier2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBufferMemoryBarrier2 createSafe(long address) {
        return address == NULL ? null : new VkBufferMemoryBarrier2(address, null);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBufferMemoryBarrier2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBufferMemoryBarrier2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBufferMemoryBarrier2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryBarrier2 malloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBufferMemoryBarrier2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferMemoryBarrier2 calloc(MemoryStack stack) {
        return new VkBufferMemoryBarrier2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferMemoryBarrier2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferMemoryBarrier2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBufferMemoryBarrier2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferMemoryBarrier2.PNEXT); }
    /** Unsafe version of {@link #srcStageMask}. */
    public static long nsrcStageMask(long struct) { return memGetLong(struct + VkBufferMemoryBarrier2.SRCSTAGEMASK); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static long nsrcAccessMask(long struct) { return memGetLong(struct + VkBufferMemoryBarrier2.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstStageMask}. */
    public static long ndstStageMask(long struct) { return memGetLong(struct + VkBufferMemoryBarrier2.DSTSTAGEMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static long ndstAccessMask(long struct) { return memGetLong(struct + VkBufferMemoryBarrier2.DSTACCESSMASK); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return memGetInt(struct + VkBufferMemoryBarrier2.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return memGetInt(struct + VkBufferMemoryBarrier2.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkBufferMemoryBarrier2.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkBufferMemoryBarrier2.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkBufferMemoryBarrier2.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferMemoryBarrier2.PNEXT, value); }
    /** Unsafe version of {@link #srcStageMask(long) srcStageMask}. */
    public static void nsrcStageMask(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier2.SRCSTAGEMASK, value); }
    /** Unsafe version of {@link #srcAccessMask(long) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier2.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstStageMask(long) dstStageMask}. */
    public static void ndstStageMask(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier2.DSTSTAGEMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(long) dstAccessMask}. */
    public static void ndstAccessMask(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier2.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier2.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { memPutInt(struct + VkBufferMemoryBarrier2.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier2.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier2.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkBufferMemoryBarrier2.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkBufferMemoryBarrier2} structs. */
    public static class Buffer extends StructBuffer<VkBufferMemoryBarrier2, Buffer> implements NativeResource {

        private static final VkBufferMemoryBarrier2 ELEMENT_FACTORY = VkBufferMemoryBarrier2.create(-1L);

        /**
         * Creates a new {@code VkBufferMemoryBarrier2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferMemoryBarrier2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBufferMemoryBarrier2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferMemoryBarrier2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferMemoryBarrier2.npNext(address()); }
        /** @return the value of the {@code srcStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long srcStageMask() { return VkBufferMemoryBarrier2.nsrcStageMask(address()); }
        /** @return the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long srcAccessMask() { return VkBufferMemoryBarrier2.nsrcAccessMask(address()); }
        /** @return the value of the {@code dstStageMask} field. */
        @NativeType("VkPipelineStageFlags2")
        public long dstStageMask() { return VkBufferMemoryBarrier2.ndstStageMask(address()); }
        /** @return the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags2")
        public long dstAccessMask() { return VkBufferMemoryBarrier2.ndstAccessMask(address()); }
        /** @return the value of the {@code srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkBufferMemoryBarrier2.nsrcQueueFamilyIndex(address()); }
        /** @return the value of the {@code dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkBufferMemoryBarrier2.ndstQueueFamilyIndex(address()); }
        /** @return the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkBufferMemoryBarrier2.nbuffer(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkBufferMemoryBarrier2.noffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferMemoryBarrier2.nsize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBufferMemoryBarrier2.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferMemoryBarrier2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2 STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2} value to the {@code sType} field. */
        public VkBufferMemoryBarrier2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBufferMemoryBarrier2.Buffer pNext(@NativeType("void const *") long value) { VkBufferMemoryBarrier2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkExternalMemoryAcquireUnmodifiedEXT} value to the {@code pNext} chain. */
        public VkBufferMemoryBarrier2.Buffer pNext(VkExternalMemoryAcquireUnmodifiedEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkMemoryBarrierAccessFlags3KHR} value to the {@code pNext} chain. */
        public VkBufferMemoryBarrier2.Buffer pNext(VkMemoryBarrierAccessFlags3KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code srcStageMask} field. */
        public VkBufferMemoryBarrier2.Buffer srcStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.nsrcStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkBufferMemoryBarrier2.Buffer srcAccessMask(@NativeType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstStageMask} field. */
        public VkBufferMemoryBarrier2.Buffer dstStageMask(@NativeType("VkPipelineStageFlags2") long value) { VkBufferMemoryBarrier2.ndstStageMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkBufferMemoryBarrier2.Buffer dstAccessMask(@NativeType("VkAccessFlags2") long value) { VkBufferMemoryBarrier2.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
        public VkBufferMemoryBarrier2.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkBufferMemoryBarrier2.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
        public VkBufferMemoryBarrier2.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkBufferMemoryBarrier2.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkBufferMemoryBarrier2.Buffer buffer(@NativeType("VkBuffer") long value) { VkBufferMemoryBarrier2.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkBufferMemoryBarrier2.Buffer offset(@NativeType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkBufferMemoryBarrier2.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferMemoryBarrier2.nsize(address(), value); return this; }

    }

}