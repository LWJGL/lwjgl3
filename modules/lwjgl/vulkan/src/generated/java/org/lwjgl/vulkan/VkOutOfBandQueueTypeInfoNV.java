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
 * struct VkOutOfBandQueueTypeInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkOutOfBandQueueTypeNV queueType;
 * }}</pre>
 */
public class VkOutOfBandQueueTypeInfoNV extends Struct<VkOutOfBandQueueTypeInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUETYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUETYPE = layout.offsetof(2);
    }

    protected VkOutOfBandQueueTypeInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOutOfBandQueueTypeInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkOutOfBandQueueTypeInfoNV(address, container);
    }

    /**
     * Creates a {@code VkOutOfBandQueueTypeInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOutOfBandQueueTypeInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code queueType} field. */
    @NativeType("VkOutOfBandQueueTypeNV")
    public int queueType() { return nqueueType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkOutOfBandQueueTypeInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV} value to the {@code sType} field. */
    public VkOutOfBandQueueTypeInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkOutOfBandQueueTypeInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code queueType} field. */
    public VkOutOfBandQueueTypeInfoNV queueType(@NativeType("VkOutOfBandQueueTypeNV") int value) { nqueueType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOutOfBandQueueTypeInfoNV set(
        int sType,
        long pNext,
        int queueType
    ) {
        sType(sType);
        pNext(pNext);
        queueType(queueType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkOutOfBandQueueTypeInfoNV set(VkOutOfBandQueueTypeInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOutOfBandQueueTypeInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOutOfBandQueueTypeInfoNV malloc() {
        return new VkOutOfBandQueueTypeInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOutOfBandQueueTypeInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOutOfBandQueueTypeInfoNV calloc() {
        return new VkOutOfBandQueueTypeInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOutOfBandQueueTypeInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkOutOfBandQueueTypeInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOutOfBandQueueTypeInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkOutOfBandQueueTypeInfoNV} instance for the specified memory address. */
    public static VkOutOfBandQueueTypeInfoNV create(long address) {
        return new VkOutOfBandQueueTypeInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkOutOfBandQueueTypeInfoNV createSafe(long address) {
        return address == NULL ? null : new VkOutOfBandQueueTypeInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkOutOfBandQueueTypeInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOutOfBandQueueTypeInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOutOfBandQueueTypeInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOutOfBandQueueTypeInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOutOfBandQueueTypeInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOutOfBandQueueTypeInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOutOfBandQueueTypeInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOutOfBandQueueTypeInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkOutOfBandQueueTypeInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOutOfBandQueueTypeInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOutOfBandQueueTypeInfoNV malloc(MemoryStack stack) {
        return new VkOutOfBandQueueTypeInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOutOfBandQueueTypeInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOutOfBandQueueTypeInfoNV calloc(MemoryStack stack) {
        return new VkOutOfBandQueueTypeInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOutOfBandQueueTypeInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOutOfBandQueueTypeInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOutOfBandQueueTypeInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOutOfBandQueueTypeInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkOutOfBandQueueTypeInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOutOfBandQueueTypeInfoNV.PNEXT); }
    /** Unsafe version of {@link #queueType}. */
    public static int nqueueType(long struct) { return memGetInt(struct + VkOutOfBandQueueTypeInfoNV.QUEUETYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkOutOfBandQueueTypeInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOutOfBandQueueTypeInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #queueType(int) queueType}. */
    public static void nqueueType(long struct, int value) { memPutInt(struct + VkOutOfBandQueueTypeInfoNV.QUEUETYPE, value); }

    // -----------------------------------

    /** An array of {@link VkOutOfBandQueueTypeInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkOutOfBandQueueTypeInfoNV, Buffer> implements NativeResource {

        private static final VkOutOfBandQueueTypeInfoNV ELEMENT_FACTORY = VkOutOfBandQueueTypeInfoNV.create(-1L);

        /**
         * Creates a new {@code VkOutOfBandQueueTypeInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOutOfBandQueueTypeInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOutOfBandQueueTypeInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOutOfBandQueueTypeInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkOutOfBandQueueTypeInfoNV.npNext(address()); }
        /** @return the value of the {@code queueType} field. */
        @NativeType("VkOutOfBandQueueTypeNV")
        public int queueType() { return VkOutOfBandQueueTypeInfoNV.nqueueType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkOutOfBandQueueTypeInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkOutOfBandQueueTypeInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV} value to the {@code sType} field. */
        public VkOutOfBandQueueTypeInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkOutOfBandQueueTypeInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkOutOfBandQueueTypeInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code queueType} field. */
        public VkOutOfBandQueueTypeInfoNV.Buffer queueType(@NativeType("VkOutOfBandQueueTypeNV") int value) { VkOutOfBandQueueTypeInfoNV.nqueueType(address(), value); return this; }

    }

}