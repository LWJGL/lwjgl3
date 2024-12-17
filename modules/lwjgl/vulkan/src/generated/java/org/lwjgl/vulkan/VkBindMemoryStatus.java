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
 * struct VkBindMemoryStatus {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkResult * pResult;
 * }}</pre>
 */
public class VkBindMemoryStatus extends Struct<VkBindMemoryStatus> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESULT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESULT = layout.offsetof(2);
    }

    protected VkBindMemoryStatus(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindMemoryStatus create(long address, @Nullable ByteBuffer container) {
        return new VkBindMemoryStatus(address, container);
    }

    /**
     * Creates a {@code VkBindMemoryStatus} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindMemoryStatus(ByteBuffer container) {
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
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pResult} field. */
    @NativeType("VkResult *")
    public IntBuffer pResult(int capacity) { return npResult(address(), capacity); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindMemoryStatus sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS STRUCTURE_TYPE_BIND_MEMORY_STATUS} value to the {@code sType} field. */
    public VkBindMemoryStatus sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindMemoryStatus pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pResult} field. */
    public VkBindMemoryStatus pResult(@NativeType("VkResult *") IntBuffer value) { npResult(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindMemoryStatus set(
        int sType,
        long pNext,
        IntBuffer pResult
    ) {
        sType(sType);
        pNext(pNext);
        pResult(pResult);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindMemoryStatus set(VkBindMemoryStatus src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindMemoryStatus} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindMemoryStatus malloc() {
        return new VkBindMemoryStatus(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindMemoryStatus} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindMemoryStatus calloc() {
        return new VkBindMemoryStatus(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindMemoryStatus} instance allocated with {@link BufferUtils}. */
    public static VkBindMemoryStatus create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindMemoryStatus(memAddress(container), container);
    }

    /** Returns a new {@code VkBindMemoryStatus} instance for the specified memory address. */
    public static VkBindMemoryStatus create(long address) {
        return new VkBindMemoryStatus(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkBindMemoryStatus createSafe(long address) {
        return address == NULL ? null : new VkBindMemoryStatus(address, null);
    }

    /**
     * Returns a new {@link VkBindMemoryStatus.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatus.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatus.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatus.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatus.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatus.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindMemoryStatus.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatus.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkBindMemoryStatus.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindMemoryStatus} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindMemoryStatus malloc(MemoryStack stack) {
        return new VkBindMemoryStatus(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindMemoryStatus} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindMemoryStatus calloc(MemoryStack stack) {
        return new VkBindMemoryStatus(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindMemoryStatus.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatus.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindMemoryStatus.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindMemoryStatus.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBindMemoryStatus.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindMemoryStatus.PNEXT); }
    /** Unsafe version of {@link #pResult(int) pResult}. */
    public static IntBuffer npResult(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + VkBindMemoryStatus.PRESULT), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBindMemoryStatus.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindMemoryStatus.PNEXT, value); }
    /** Unsafe version of {@link #pResult(IntBuffer) pResult}. */
    public static void npResult(long struct, IntBuffer value) { memPutAddress(struct + VkBindMemoryStatus.PRESULT, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkBindMemoryStatus.PRESULT));
    }

    // -----------------------------------

    /** An array of {@link VkBindMemoryStatus} structs. */
    public static class Buffer extends StructBuffer<VkBindMemoryStatus, Buffer> implements NativeResource {

        private static final VkBindMemoryStatus ELEMENT_FACTORY = VkBindMemoryStatus.create(-1L);

        /**
         * Creates a new {@code VkBindMemoryStatus.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindMemoryStatus#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindMemoryStatus getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindMemoryStatus.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindMemoryStatus.npNext(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pResult} field. */
        @NativeType("VkResult *")
        public IntBuffer pResult(int capacity) { return VkBindMemoryStatus.npResult(address(), capacity); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindMemoryStatus.Buffer sType(@NativeType("VkStructureType") int value) { VkBindMemoryStatus.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS STRUCTURE_TYPE_BIND_MEMORY_STATUS} value to the {@code sType} field. */
        public VkBindMemoryStatus.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindMemoryStatus.Buffer pNext(@NativeType("void const *") long value) { VkBindMemoryStatus.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pResult} field. */
        public VkBindMemoryStatus.Buffer pResult(@NativeType("VkResult *") IntBuffer value) { VkBindMemoryStatus.npResult(address(), value); return this; }

    }

}