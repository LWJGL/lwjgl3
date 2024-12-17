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
 * struct VkSemaphoreTypeCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphoreType semaphoreType;
 *     uint64_t initialValue;
 * }}</pre>
 */
public class VkSemaphoreTypeCreateInfo extends Struct<VkSemaphoreTypeCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SEMAPHORETYPE,
        INITIALVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SEMAPHORETYPE = layout.offsetof(2);
        INITIALVALUE = layout.offsetof(3);
    }

    protected VkSemaphoreTypeCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSemaphoreTypeCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkSemaphoreTypeCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkSemaphoreTypeCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSemaphoreTypeCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code semaphoreType} field. */
    @NativeType("VkSemaphoreType")
    public int semaphoreType() { return nsemaphoreType(address()); }
    /** @return the value of the {@code initialValue} field. */
    @NativeType("uint64_t")
    public long initialValue() { return ninitialValue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSemaphoreTypeCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO} value to the {@code sType} field. */
    public VkSemaphoreTypeCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSemaphoreTypeCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code semaphoreType} field. */
    public VkSemaphoreTypeCreateInfo semaphoreType(@NativeType("VkSemaphoreType") int value) { nsemaphoreType(address(), value); return this; }
    /** Sets the specified value to the {@code initialValue} field. */
    public VkSemaphoreTypeCreateInfo initialValue(@NativeType("uint64_t") long value) { ninitialValue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSemaphoreTypeCreateInfo set(
        int sType,
        long pNext,
        int semaphoreType,
        long initialValue
    ) {
        sType(sType);
        pNext(pNext);
        semaphoreType(semaphoreType);
        initialValue(initialValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSemaphoreTypeCreateInfo set(VkSemaphoreTypeCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfo malloc() {
        return new VkSemaphoreTypeCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSemaphoreTypeCreateInfo calloc() {
        return new VkSemaphoreTypeCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSemaphoreTypeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSemaphoreTypeCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkSemaphoreTypeCreateInfo} instance for the specified memory address. */
    public static VkSemaphoreTypeCreateInfo create(long address) {
        return new VkSemaphoreTypeCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSemaphoreTypeCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkSemaphoreTypeCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSemaphoreTypeCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSemaphoreTypeCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfo malloc(MemoryStack stack) {
        return new VkSemaphoreTypeCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSemaphoreTypeCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSemaphoreTypeCreateInfo calloc(MemoryStack stack) {
        return new VkSemaphoreTypeCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSemaphoreTypeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSemaphoreTypeCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSemaphoreTypeCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSemaphoreTypeCreateInfo.PNEXT); }
    /** Unsafe version of {@link #semaphoreType}. */
    public static int nsemaphoreType(long struct) { return memGetInt(struct + VkSemaphoreTypeCreateInfo.SEMAPHORETYPE); }
    /** Unsafe version of {@link #initialValue}. */
    public static long ninitialValue(long struct) { return memGetLong(struct + VkSemaphoreTypeCreateInfo.INITIALVALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSemaphoreTypeCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSemaphoreTypeCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #semaphoreType(int) semaphoreType}. */
    public static void nsemaphoreType(long struct, int value) { memPutInt(struct + VkSemaphoreTypeCreateInfo.SEMAPHORETYPE, value); }
    /** Unsafe version of {@link #initialValue(long) initialValue}. */
    public static void ninitialValue(long struct, long value) { memPutLong(struct + VkSemaphoreTypeCreateInfo.INITIALVALUE, value); }

    // -----------------------------------

    /** An array of {@link VkSemaphoreTypeCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSemaphoreTypeCreateInfo, Buffer> implements NativeResource {

        private static final VkSemaphoreTypeCreateInfo ELEMENT_FACTORY = VkSemaphoreTypeCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSemaphoreTypeCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSemaphoreTypeCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSemaphoreTypeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSemaphoreTypeCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSemaphoreTypeCreateInfo.npNext(address()); }
        /** @return the value of the {@code semaphoreType} field. */
        @NativeType("VkSemaphoreType")
        public int semaphoreType() { return VkSemaphoreTypeCreateInfo.nsemaphoreType(address()); }
        /** @return the value of the {@code initialValue} field. */
        @NativeType("uint64_t")
        public long initialValue() { return VkSemaphoreTypeCreateInfo.ninitialValue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSemaphoreTypeCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSemaphoreTypeCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO} value to the {@code sType} field. */
        public VkSemaphoreTypeCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SEMAPHORE_TYPE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSemaphoreTypeCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSemaphoreTypeCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code semaphoreType} field. */
        public VkSemaphoreTypeCreateInfo.Buffer semaphoreType(@NativeType("VkSemaphoreType") int value) { VkSemaphoreTypeCreateInfo.nsemaphoreType(address(), value); return this; }
        /** Sets the specified value to the {@code initialValue} field. */
        public VkSemaphoreTypeCreateInfo.Buffer initialValue(@NativeType("uint64_t") long value) { VkSemaphoreTypeCreateInfo.ninitialValue(address(), value); return this; }

    }

}