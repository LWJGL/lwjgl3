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
 * struct VkImageCreateFlags2CreateInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkImageCreateFlags2KHR flags;
 * }}</pre>
 */
public class VkImageCreateFlags2CreateInfoKHR extends Struct<VkImageCreateFlags2CreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkImageCreateFlags2CreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageCreateFlags2CreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkImageCreateFlags2CreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkImageCreateFlags2CreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageCreateFlags2CreateInfoKHR(ByteBuffer container) {
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
    @NativeType("VkImageCreateFlags2KHR")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageCreateFlags2CreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_IMAGE_CREATE_FLAGS_2_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_CREATE_FLAGS_2_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkImageCreateFlags2CreateInfoKHR sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_IMAGE_CREATE_FLAGS_2_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageCreateFlags2CreateInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkImageCreateFlags2CreateInfoKHR flags(@NativeType("VkImageCreateFlags2KHR") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageCreateFlags2CreateInfoKHR set(
        int sType,
        long pNext,
        long flags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageCreateFlags2CreateInfoKHR set(VkImageCreateFlags2CreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageCreateFlags2CreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageCreateFlags2CreateInfoKHR malloc() {
        return new VkImageCreateFlags2CreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageCreateFlags2CreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageCreateFlags2CreateInfoKHR calloc() {
        return new VkImageCreateFlags2CreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageCreateFlags2CreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkImageCreateFlags2CreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCreateFlags2CreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkImageCreateFlags2CreateInfoKHR} instance for the specified memory address. */
    public static VkImageCreateFlags2CreateInfoKHR create(long address) {
        return new VkImageCreateFlags2CreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageCreateFlags2CreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkImageCreateFlags2CreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkImageCreateFlags2CreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateFlags2CreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateFlags2CreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateFlags2CreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateFlags2CreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCreateFlags2CreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageCreateFlags2CreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageCreateFlags2CreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageCreateFlags2CreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageCreateFlags2CreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCreateFlags2CreateInfoKHR malloc(MemoryStack stack) {
        return new VkImageCreateFlags2CreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageCreateFlags2CreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCreateFlags2CreateInfoKHR calloc(MemoryStack stack) {
        return new VkImageCreateFlags2CreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageCreateFlags2CreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCreateFlags2CreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCreateFlags2CreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCreateFlags2CreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageCreateFlags2CreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageCreateFlags2CreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + VkImageCreateFlags2CreateInfoKHR.FLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageCreateFlags2CreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCreateFlags2CreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + VkImageCreateFlags2CreateInfoKHR.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkImageCreateFlags2CreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkImageCreateFlags2CreateInfoKHR, Buffer> implements NativeResource {

        private static final VkImageCreateFlags2CreateInfoKHR ELEMENT_FACTORY = VkImageCreateFlags2CreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkImageCreateFlags2CreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageCreateFlags2CreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageCreateFlags2CreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageCreateFlags2CreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkImageCreateFlags2CreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkImageCreateFlags2KHR")
        public long flags() { return VkImageCreateFlags2CreateInfoKHR.nflags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageCreateFlags2CreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkImageCreateFlags2CreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRExtendedFlags#VK_STRUCTURE_TYPE_IMAGE_CREATE_FLAGS_2_CREATE_INFO_KHR STRUCTURE_TYPE_IMAGE_CREATE_FLAGS_2_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkImageCreateFlags2CreateInfoKHR.Buffer sType$Default() { return sType(KHRExtendedFlags.VK_STRUCTURE_TYPE_IMAGE_CREATE_FLAGS_2_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageCreateFlags2CreateInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkImageCreateFlags2CreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkImageCreateFlags2CreateInfoKHR.Buffer flags(@NativeType("VkImageCreateFlags2KHR") long value) { VkImageCreateFlags2CreateInfoKHR.nflags(address(), value); return this; }

    }

}