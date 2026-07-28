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
 * struct VkPresentWait2InfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t presentId;
 *     uint64_t timeout;
 * }}</pre>
 */
public class VkPresentWait2InfoKHR extends Struct<VkPresentWait2InfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID,
        TIMEOUT;

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
        PRESENTID = layout.offsetof(2);
        TIMEOUT = layout.offsetof(3);
    }

    protected VkPresentWait2InfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPresentWait2InfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPresentWait2InfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPresentWait2InfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentWait2InfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code presentId} field. */
    @NativeType("uint64_t")
    public long presentId() { return npresentId(address()); }
    /** @return the value of the {@code timeout} field. */
    @NativeType("uint64_t")
    public long timeout() { return ntimeout(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPresentWait2InfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPresentWait2#VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR} value to the {@code sType} field. */
    public VkPresentWait2InfoKHR sType$Default() { return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPresentWait2InfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentId} field. */
    public VkPresentWait2InfoKHR presentId(@NativeType("uint64_t") long value) { npresentId(address(), value); return this; }
    /** Sets the specified value to the {@code timeout} field. */
    public VkPresentWait2InfoKHR timeout(@NativeType("uint64_t") long value) { ntimeout(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentWait2InfoKHR set(
        int sType,
        long pNext,
        long presentId,
        long timeout
    ) {
        sType(sType);
        pNext(pNext);
        presentId(presentId);
        timeout(timeout);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentWait2InfoKHR set(VkPresentWait2InfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentWait2InfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentWait2InfoKHR malloc() {
        return new VkPresentWait2InfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPresentWait2InfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentWait2InfoKHR calloc() {
        return new VkPresentWait2InfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPresentWait2InfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPresentWait2InfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentWait2InfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPresentWait2InfoKHR} instance for the specified memory address. */
    public static VkPresentWait2InfoKHR create(long address) {
        return new VkPresentWait2InfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPresentWait2InfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPresentWait2InfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPresentWait2InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentWait2InfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentWait2InfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentWait2InfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentWait2InfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentWait2InfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPresentWait2InfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentWait2InfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPresentWait2InfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPresentWait2InfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentWait2InfoKHR malloc(MemoryStack stack) {
        return new VkPresentWait2InfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPresentWait2InfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentWait2InfoKHR calloc(MemoryStack stack) {
        return new VkPresentWait2InfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPresentWait2InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentWait2InfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentWait2InfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentWait2InfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPresentWait2InfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentWait2InfoKHR.PNEXT); }
    /** Unsafe version of {@link #presentId}. */
    public static long npresentId(long struct) { return memGetLong(struct + VkPresentWait2InfoKHR.PRESENTID); }
    /** Unsafe version of {@link #timeout}. */
    public static long ntimeout(long struct) { return memGetLong(struct + VkPresentWait2InfoKHR.TIMEOUT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPresentWait2InfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentWait2InfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #presentId(long) presentId}. */
    public static void npresentId(long struct, long value) { memPutLong(struct + VkPresentWait2InfoKHR.PRESENTID, value); }
    /** Unsafe version of {@link #timeout(long) timeout}. */
    public static void ntimeout(long struct, long value) { memPutLong(struct + VkPresentWait2InfoKHR.TIMEOUT, value); }

    // -----------------------------------

    /** An array of {@link VkPresentWait2InfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPresentWait2InfoKHR, Buffer> implements NativeResource {

        private static final VkPresentWait2InfoKHR ELEMENT_FACTORY = VkPresentWait2InfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPresentWait2InfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentWait2InfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPresentWait2InfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentWait2InfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentWait2InfoKHR.npNext(address()); }
        /** @return the value of the {@code presentId} field. */
        @NativeType("uint64_t")
        public long presentId() { return VkPresentWait2InfoKHR.npresentId(address()); }
        /** @return the value of the {@code timeout} field. */
        @NativeType("uint64_t")
        public long timeout() { return VkPresentWait2InfoKHR.ntimeout(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPresentWait2InfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentWait2InfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPresentWait2#VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR} value to the {@code sType} field. */
        public VkPresentWait2InfoKHR.Buffer sType$Default() { return sType(KHRPresentWait2.VK_STRUCTURE_TYPE_PRESENT_WAIT_2_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPresentWait2InfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPresentWait2InfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentId} field. */
        public VkPresentWait2InfoKHR.Buffer presentId(@NativeType("uint64_t") long value) { VkPresentWait2InfoKHR.npresentId(address(), value); return this; }
        /** Sets the specified value to the {@code timeout} field. */
        public VkPresentWait2InfoKHR.Buffer timeout(@NativeType("uint64_t") long value) { VkPresentWait2InfoKHR.ntimeout(address(), value); return this; }

    }

}