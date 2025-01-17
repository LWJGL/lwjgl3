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
 * struct VkMemoryBarrierAccessFlags3KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccessFlags3KHR srcAccessMask3;
 *     VkAccessFlags3KHR dstAccessMask3;
 * }}</pre>
 */
public class VkMemoryBarrierAccessFlags3KHR extends Struct<VkMemoryBarrierAccessFlags3KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCACCESSMASK3,
        DSTACCESSMASK3;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK3 = layout.offsetof(2);
        DSTACCESSMASK3 = layout.offsetof(3);
    }

    protected VkMemoryBarrierAccessFlags3KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryBarrierAccessFlags3KHR create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryBarrierAccessFlags3KHR(address, container);
    }

    /**
     * Creates a {@code VkMemoryBarrierAccessFlags3KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryBarrierAccessFlags3KHR(ByteBuffer container) {
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
    /** @return the value of the {@code srcAccessMask3} field. */
    @NativeType("VkAccessFlags3KHR")
    public long srcAccessMask3() { return nsrcAccessMask3(address()); }
    /** @return the value of the {@code dstAccessMask3} field. */
    @NativeType("VkAccessFlags3KHR")
    public long dstAccessMask3() { return ndstAccessMask3(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMemoryBarrierAccessFlags3KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance8#VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR} value to the {@code sType} field. */
    public VkMemoryBarrierAccessFlags3KHR sType$Default() { return sType(KHRMaintenance8.VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMemoryBarrierAccessFlags3KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask3} field. */
    public VkMemoryBarrierAccessFlags3KHR srcAccessMask3(@NativeType("VkAccessFlags3KHR") long value) { nsrcAccessMask3(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask3} field. */
    public VkMemoryBarrierAccessFlags3KHR dstAccessMask3(@NativeType("VkAccessFlags3KHR") long value) { ndstAccessMask3(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryBarrierAccessFlags3KHR set(
        int sType,
        long pNext,
        long srcAccessMask3,
        long dstAccessMask3
    ) {
        sType(sType);
        pNext(pNext);
        srcAccessMask3(srcAccessMask3);
        dstAccessMask3(dstAccessMask3);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryBarrierAccessFlags3KHR set(VkMemoryBarrierAccessFlags3KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryBarrierAccessFlags3KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrierAccessFlags3KHR malloc() {
        return new VkMemoryBarrierAccessFlags3KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryBarrierAccessFlags3KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryBarrierAccessFlags3KHR calloc() {
        return new VkMemoryBarrierAccessFlags3KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryBarrierAccessFlags3KHR} instance allocated with {@link BufferUtils}. */
    public static VkMemoryBarrierAccessFlags3KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryBarrierAccessFlags3KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryBarrierAccessFlags3KHR} instance for the specified memory address. */
    public static VkMemoryBarrierAccessFlags3KHR create(long address) {
        return new VkMemoryBarrierAccessFlags3KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMemoryBarrierAccessFlags3KHR createSafe(long address) {
        return address == NULL ? null : new VkMemoryBarrierAccessFlags3KHR(address, null);
    }

    /**
     * Returns a new {@link VkMemoryBarrierAccessFlags3KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrierAccessFlags3KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrierAccessFlags3KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrierAccessFlags3KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrierAccessFlags3KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrierAccessFlags3KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryBarrierAccessFlags3KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrierAccessFlags3KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMemoryBarrierAccessFlags3KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryBarrierAccessFlags3KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrierAccessFlags3KHR malloc(MemoryStack stack) {
        return new VkMemoryBarrierAccessFlags3KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryBarrierAccessFlags3KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryBarrierAccessFlags3KHR calloc(MemoryStack stack) {
        return new VkMemoryBarrierAccessFlags3KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryBarrierAccessFlags3KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrierAccessFlags3KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryBarrierAccessFlags3KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryBarrierAccessFlags3KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMemoryBarrierAccessFlags3KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryBarrierAccessFlags3KHR.PNEXT); }
    /** Unsafe version of {@link #srcAccessMask3}. */
    public static long nsrcAccessMask3(long struct) { return memGetLong(struct + VkMemoryBarrierAccessFlags3KHR.SRCACCESSMASK3); }
    /** Unsafe version of {@link #dstAccessMask3}. */
    public static long ndstAccessMask3(long struct) { return memGetLong(struct + VkMemoryBarrierAccessFlags3KHR.DSTACCESSMASK3); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryBarrierAccessFlags3KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryBarrierAccessFlags3KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcAccessMask3(long) srcAccessMask3}. */
    public static void nsrcAccessMask3(long struct, long value) { memPutLong(struct + VkMemoryBarrierAccessFlags3KHR.SRCACCESSMASK3, value); }
    /** Unsafe version of {@link #dstAccessMask3(long) dstAccessMask3}. */
    public static void ndstAccessMask3(long struct, long value) { memPutLong(struct + VkMemoryBarrierAccessFlags3KHR.DSTACCESSMASK3, value); }

    // -----------------------------------

    /** An array of {@link VkMemoryBarrierAccessFlags3KHR} structs. */
    public static class Buffer extends StructBuffer<VkMemoryBarrierAccessFlags3KHR, Buffer> implements NativeResource {

        private static final VkMemoryBarrierAccessFlags3KHR ELEMENT_FACTORY = VkMemoryBarrierAccessFlags3KHR.create(-1L);

        /**
         * Creates a new {@code VkMemoryBarrierAccessFlags3KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryBarrierAccessFlags3KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryBarrierAccessFlags3KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryBarrierAccessFlags3KHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryBarrierAccessFlags3KHR.npNext(address()); }
        /** @return the value of the {@code srcAccessMask3} field. */
        @NativeType("VkAccessFlags3KHR")
        public long srcAccessMask3() { return VkMemoryBarrierAccessFlags3KHR.nsrcAccessMask3(address()); }
        /** @return the value of the {@code dstAccessMask3} field. */
        @NativeType("VkAccessFlags3KHR")
        public long dstAccessMask3() { return VkMemoryBarrierAccessFlags3KHR.ndstAccessMask3(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMemoryBarrierAccessFlags3KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryBarrierAccessFlags3KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance8#VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR} value to the {@code sType} field. */
        public VkMemoryBarrierAccessFlags3KHR.Buffer sType$Default() { return sType(KHRMaintenance8.VK_STRUCTURE_TYPE_MEMORY_BARRIER_ACCESS_FLAGS_3_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMemoryBarrierAccessFlags3KHR.Buffer pNext(@NativeType("void const *") long value) { VkMemoryBarrierAccessFlags3KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask3} field. */
        public VkMemoryBarrierAccessFlags3KHR.Buffer srcAccessMask3(@NativeType("VkAccessFlags3KHR") long value) { VkMemoryBarrierAccessFlags3KHR.nsrcAccessMask3(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask3} field. */
        public VkMemoryBarrierAccessFlags3KHR.Buffer dstAccessMask3(@NativeType("VkAccessFlags3KHR") long value) { VkMemoryBarrierAccessFlags3KHR.ndstAccessMask3(address(), value); return this; }

    }

}