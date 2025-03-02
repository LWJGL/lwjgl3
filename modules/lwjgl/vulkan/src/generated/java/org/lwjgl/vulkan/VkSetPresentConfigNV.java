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
 * struct VkSetPresentConfigNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t numFramesPerBatch;
 *     uint32_t presentConfigFeedback;
 * }}</pre>
 */
public class VkSetPresentConfigNV extends Struct<VkSetPresentConfigNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NUMFRAMESPERBATCH,
        PRESENTCONFIGFEEDBACK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NUMFRAMESPERBATCH = layout.offsetof(2);
        PRESENTCONFIGFEEDBACK = layout.offsetof(3);
    }

    protected VkSetPresentConfigNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSetPresentConfigNV create(long address, @Nullable ByteBuffer container) {
        return new VkSetPresentConfigNV(address, container);
    }

    /**
     * Creates a {@code VkSetPresentConfigNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSetPresentConfigNV(ByteBuffer container) {
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
    /** @return the value of the {@code numFramesPerBatch} field. */
    @NativeType("uint32_t")
    public int numFramesPerBatch() { return nnumFramesPerBatch(address()); }
    /** @return the value of the {@code presentConfigFeedback} field. */
    @NativeType("uint32_t")
    public int presentConfigFeedback() { return npresentConfigFeedback(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSetPresentConfigNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPresentMetering#VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV} value to the {@code sType} field. */
    public VkSetPresentConfigNV sType$Default() { return sType(NVPresentMetering.VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSetPresentConfigNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code numFramesPerBatch} field. */
    public VkSetPresentConfigNV numFramesPerBatch(@NativeType("uint32_t") int value) { nnumFramesPerBatch(address(), value); return this; }
    /** Sets the specified value to the {@code presentConfigFeedback} field. */
    public VkSetPresentConfigNV presentConfigFeedback(@NativeType("uint32_t") int value) { npresentConfigFeedback(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSetPresentConfigNV set(
        int sType,
        long pNext,
        int numFramesPerBatch,
        int presentConfigFeedback
    ) {
        sType(sType);
        pNext(pNext);
        numFramesPerBatch(numFramesPerBatch);
        presentConfigFeedback(presentConfigFeedback);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSetPresentConfigNV set(VkSetPresentConfigNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSetPresentConfigNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSetPresentConfigNV malloc() {
        return new VkSetPresentConfigNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSetPresentConfigNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSetPresentConfigNV calloc() {
        return new VkSetPresentConfigNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSetPresentConfigNV} instance allocated with {@link BufferUtils}. */
    public static VkSetPresentConfigNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetPresentConfigNV(memAddress(container), container);
    }

    /** Returns a new {@code VkSetPresentConfigNV} instance for the specified memory address. */
    public static VkSetPresentConfigNV create(long address) {
        return new VkSetPresentConfigNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSetPresentConfigNV createSafe(long address) {
        return address == NULL ? null : new VkSetPresentConfigNV(address, null);
    }

    /**
     * Returns a new {@link VkSetPresentConfigNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetPresentConfigNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSetPresentConfigNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetPresentConfigNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetPresentConfigNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetPresentConfigNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSetPresentConfigNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSetPresentConfigNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSetPresentConfigNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSetPresentConfigNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetPresentConfigNV malloc(MemoryStack stack) {
        return new VkSetPresentConfigNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSetPresentConfigNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetPresentConfigNV calloc(MemoryStack stack) {
        return new VkSetPresentConfigNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSetPresentConfigNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetPresentConfigNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetPresentConfigNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetPresentConfigNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSetPresentConfigNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSetPresentConfigNV.PNEXT); }
    /** Unsafe version of {@link #numFramesPerBatch}. */
    public static int nnumFramesPerBatch(long struct) { return memGetInt(struct + VkSetPresentConfigNV.NUMFRAMESPERBATCH); }
    /** Unsafe version of {@link #presentConfigFeedback}. */
    public static int npresentConfigFeedback(long struct) { return memGetInt(struct + VkSetPresentConfigNV.PRESENTCONFIGFEEDBACK); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSetPresentConfigNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSetPresentConfigNV.PNEXT, value); }
    /** Unsafe version of {@link #numFramesPerBatch(int) numFramesPerBatch}. */
    public static void nnumFramesPerBatch(long struct, int value) { memPutInt(struct + VkSetPresentConfigNV.NUMFRAMESPERBATCH, value); }
    /** Unsafe version of {@link #presentConfigFeedback(int) presentConfigFeedback}. */
    public static void npresentConfigFeedback(long struct, int value) { memPutInt(struct + VkSetPresentConfigNV.PRESENTCONFIGFEEDBACK, value); }

    // -----------------------------------

    /** An array of {@link VkSetPresentConfigNV} structs. */
    public static class Buffer extends StructBuffer<VkSetPresentConfigNV, Buffer> implements NativeResource {

        private static final VkSetPresentConfigNV ELEMENT_FACTORY = VkSetPresentConfigNV.create(-1L);

        /**
         * Creates a new {@code VkSetPresentConfigNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSetPresentConfigNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSetPresentConfigNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSetPresentConfigNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSetPresentConfigNV.npNext(address()); }
        /** @return the value of the {@code numFramesPerBatch} field. */
        @NativeType("uint32_t")
        public int numFramesPerBatch() { return VkSetPresentConfigNV.nnumFramesPerBatch(address()); }
        /** @return the value of the {@code presentConfigFeedback} field. */
        @NativeType("uint32_t")
        public int presentConfigFeedback() { return VkSetPresentConfigNV.npresentConfigFeedback(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSetPresentConfigNV.Buffer sType(@NativeType("VkStructureType") int value) { VkSetPresentConfigNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPresentMetering#VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV} value to the {@code sType} field. */
        public VkSetPresentConfigNV.Buffer sType$Default() { return sType(NVPresentMetering.VK_STRUCTURE_TYPE_SET_PRESENT_CONFIG_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSetPresentConfigNV.Buffer pNext(@NativeType("void const *") long value) { VkSetPresentConfigNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code numFramesPerBatch} field. */
        public VkSetPresentConfigNV.Buffer numFramesPerBatch(@NativeType("uint32_t") int value) { VkSetPresentConfigNV.nnumFramesPerBatch(address(), value); return this; }
        /** Sets the specified value to the {@code presentConfigFeedback} field. */
        public VkSetPresentConfigNV.Buffer presentConfigFeedback(@NativeType("uint32_t") int value) { VkSetPresentConfigNV.npresentConfigFeedback(address(), value); return this; }

    }

}