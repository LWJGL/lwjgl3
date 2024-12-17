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
 * struct VkSemaphoreSignalInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphore semaphore;
 *     uint64_t value;
 * }}</pre>
 */
public class VkSemaphoreSignalInfo extends Struct<VkSemaphoreSignalInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORE,
        VALUE;

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
        SEMAPHORE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
    }

    protected VkSemaphoreSignalInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreSignalInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreSignalInfo(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreSignalInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreSignalInfo(ByteBuffer container) {
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
    /** @return the value of the {@code semaphore} field. */
    @NativeType("VkSemaphore")
    public long semaphore() { return nsemaphore(address()); }
    /** @return the value of the {@code value} field. */
    @NativeType("uint64_t")
    public long value() { return nvalue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSemaphoreSignalInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO} value to the {@code sType} field. */
    public VkSemaphoreSignalInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSemaphoreSignalInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphore} field. */
    public VkSemaphoreSignalInfo semaphore(@NativeType("VkSemaphore") long value) { nsemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public VkSemaphoreSignalInfo value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreSignalInfo set(
        int sType,
        long pNext,
        long semaphore,
        long value
    ) {
        sType(sType);
        pNext(pNext);
        semaphore(semaphore);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreSignalInfo set(VkSemaphoreSignalInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreSignalInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSignalInfo malloc() {
        return new VkSemaphoreSignalInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreSignalInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreSignalInfo calloc() {
        return new VkSemaphoreSignalInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreSignalInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreSignalInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreSignalInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreSignalInfo} instance for the specified memory address. */
    public static VkSemaphoreSignalInfo create(long address) {
        return new VkSemaphoreSignalInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSemaphoreSignalInfo createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreSignalInfo(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreSignalInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSemaphoreSignalInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreSignalInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSignalInfo malloc(MemoryStack stack) {
        return new VkSemaphoreSignalInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreSignalInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreSignalInfo calloc(MemoryStack stack) {
        return new VkSemaphoreSignalInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreSignalInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreSignalInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSemaphoreSignalInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreSignalInfo.PNEXT); }
    /** Unsafe version of {@link #semaphore}. */
    public static long nsemaphore(long struct) { return memGetLong(struct + VkSemaphoreSignalInfo.SEMAPHORE); }
    /** Unsafe version of {@link #value}. */
    public static long nvalue(long struct) { return memGetLong(struct + VkSemaphoreSignalInfo.VALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSemaphoreSignalInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreSignalInfo.PNEXT, value); }
    /** Unsafe version of {@link #semaphore(long) semaphore}. */
    public static void nsemaphore(long struct, long value) { memPutLong(struct + VkSemaphoreSignalInfo.SEMAPHORE, value); }
    /** Unsafe version of {@link #value(long) value}. */
    public static void nvalue(long struct, long value) { memPutLong(struct + VkSemaphoreSignalInfo.VALUE, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreSignalInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreSignalInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreSignalInfo ELEMENT_FACTORY = VkSemaphoreSignalInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreSignalInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreSignalInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSemaphoreSignalInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreSignalInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreSignalInfo.npNext(address()); }
        /** @return the value of the {@code semaphore} field. */
        @NativeType("VkSemaphore")
        public long semaphore() { return VkSemaphoreSignalInfo.nsemaphore(address()); }
        /** @return the value of the {@code value} field. */
        @NativeType("uint64_t")
        public long value() { return VkSemaphoreSignalInfo.nvalue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSemaphoreSignalInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreSignalInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO} value to the {@code sType} field. */
        public VkSemaphoreSignalInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_SIGNAL_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSemaphoreSignalInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreSignalInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphore} field. */
        public VkSemaphoreSignalInfo.Buffer semaphore(@NativeType("VkSemaphore") long value) { VkSemaphoreSignalInfo.nsemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public VkSemaphoreSignalInfo.Buffer value(@NativeType("uint64_t") long value) { VkSemaphoreSignalInfo.nvalue(address(), value); return this; }

    }

}