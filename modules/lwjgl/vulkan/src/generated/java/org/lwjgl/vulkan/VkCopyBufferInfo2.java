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
 * struct VkCopyBufferInfo2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer srcBuffer;
 *     VkBuffer dstBuffer;
 *     uint32_t regionCount;
 *     {@link VkBufferCopy2 VkBufferCopy2} const * pRegions;
 * }}</pre>
 */
public class VkCopyBufferInfo2 extends Struct<VkCopyBufferInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCBUFFER,
        DSTBUFFER,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCBUFFER = layout.offsetof(2);
        DSTBUFFER = layout.offsetof(3);
        REGIONCOUNT = layout.offsetof(4);
        PREGIONS = layout.offsetof(5);
    }

    protected VkCopyBufferInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyBufferInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkCopyBufferInfo2(address, container);
    }

    /**
     * Creates a {@code VkCopyBufferInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyBufferInfo2(ByteBuffer container) {
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
    /** @return the value of the {@code srcBuffer} field. */
    @NativeType("VkBuffer")
    public long srcBuffer() { return nsrcBuffer(address()); }
    /** @return the value of the {@code dstBuffer} field. */
    @NativeType("VkBuffer")
    public long dstBuffer() { return ndstBuffer(address()); }
    /** @return the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** @return a {@link VkBufferCopy2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkBufferCopy2 const *")
    public VkBufferCopy2.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyBufferInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2} value to the {@code sType} field. */
    public VkCopyBufferInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyBufferInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcBuffer} field. */
    public VkCopyBufferInfo2 srcBuffer(@NativeType("VkBuffer") long value) { nsrcBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code dstBuffer} field. */
    public VkCopyBufferInfo2 dstBuffer(@NativeType("VkBuffer") long value) { ndstBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferCopy2.Buffer} to the {@code pRegions} field. */
    public VkCopyBufferInfo2 pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyBufferInfo2 set(
        int sType,
        long pNext,
        long srcBuffer,
        long dstBuffer,
        VkBufferCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcBuffer(srcBuffer);
        dstBuffer(dstBuffer);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyBufferInfo2 set(VkCopyBufferInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyBufferInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyBufferInfo2 malloc() {
        return new VkCopyBufferInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyBufferInfo2 calloc() {
        return new VkCopyBufferInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferInfo2} instance allocated with {@link BufferUtils}. */
    public static VkCopyBufferInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyBufferInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyBufferInfo2} instance for the specified memory address. */
    public static VkCopyBufferInfo2 create(long address) {
        return new VkCopyBufferInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyBufferInfo2 createSafe(long address) {
        return address == NULL ? null : new VkCopyBufferInfo2(address, null);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyBufferInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyBufferInfo2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyBufferInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferInfo2 malloc(MemoryStack stack) {
        return new VkCopyBufferInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyBufferInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferInfo2 calloc(MemoryStack stack) {
        return new VkCopyBufferInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyBufferInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyBufferInfo2.PNEXT); }
    /** Unsafe version of {@link #srcBuffer}. */
    public static long nsrcBuffer(long struct) { return memGetLong(struct + VkCopyBufferInfo2.SRCBUFFER); }
    /** Unsafe version of {@link #dstBuffer}. */
    public static long ndstBuffer(long struct) { return memGetLong(struct + VkCopyBufferInfo2.DSTBUFFER); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyBufferInfo2.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkBufferCopy2.Buffer npRegions(long struct) { return VkBufferCopy2.create(memGetAddress(struct + VkCopyBufferInfo2.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyBufferInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyBufferInfo2.PNEXT, value); }
    /** Unsafe version of {@link #srcBuffer(long) srcBuffer}. */
    public static void nsrcBuffer(long struct, long value) { memPutLong(struct + VkCopyBufferInfo2.SRCBUFFER, value); }
    /** Unsafe version of {@link #dstBuffer(long) dstBuffer}. */
    public static void ndstBuffer(long struct, long value) { memPutLong(struct + VkCopyBufferInfo2.DSTBUFFER, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyBufferInfo2.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkBufferCopy2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkBufferCopy2.Buffer value) { memPutAddress(struct + VkCopyBufferInfo2.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyBufferInfo2.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyBufferInfo2} structs. */
    public static class Buffer extends StructBuffer<VkCopyBufferInfo2, Buffer> implements NativeResource {

        private static final VkCopyBufferInfo2 ELEMENT_FACTORY = VkCopyBufferInfo2.create(-1L);

        /**
         * Creates a new {@code VkCopyBufferInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyBufferInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyBufferInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyBufferInfo2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyBufferInfo2.npNext(address()); }
        /** @return the value of the {@code srcBuffer} field. */
        @NativeType("VkBuffer")
        public long srcBuffer() { return VkCopyBufferInfo2.nsrcBuffer(address()); }
        /** @return the value of the {@code dstBuffer} field. */
        @NativeType("VkBuffer")
        public long dstBuffer() { return VkCopyBufferInfo2.ndstBuffer(address()); }
        /** @return the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyBufferInfo2.nregionCount(address()); }
        /** @return a {@link VkBufferCopy2.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkBufferCopy2 const *")
        public VkBufferCopy2.Buffer pRegions() { return VkCopyBufferInfo2.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyBufferInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyBufferInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2} value to the {@code sType} field. */
        public VkCopyBufferInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyBufferInfo2.Buffer pNext(@NativeType("void const *") long value) { VkCopyBufferInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcBuffer} field. */
        public VkCopyBufferInfo2.Buffer srcBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferInfo2.nsrcBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code dstBuffer} field. */
        public VkCopyBufferInfo2.Buffer dstBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferInfo2.ndstBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferCopy2.Buffer} to the {@code pRegions} field. */
        public VkCopyBufferInfo2.Buffer pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) { VkCopyBufferInfo2.npRegions(address(), value); return this; }

    }

}