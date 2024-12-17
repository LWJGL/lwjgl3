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
 * struct VkLatencySubmissionPresentIdNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t presentID;
 * }}</pre>
 */
public class VkLatencySubmissionPresentIdNV extends Struct<VkLatencySubmissionPresentIdNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID;

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
        PRESENTID = layout.offsetof(2);
    }

    protected VkLatencySubmissionPresentIdNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkLatencySubmissionPresentIdNV create(long address, @Nullable ByteBuffer container) {
        return new VkLatencySubmissionPresentIdNV(address, container);
    }

    /**
     * Creates a {@code VkLatencySubmissionPresentIdNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLatencySubmissionPresentIdNV(ByteBuffer container) {
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
    /** @return the value of the {@code presentID} field. */
    @NativeType("uint64_t")
    public long presentID() { return npresentID(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkLatencySubmissionPresentIdNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV} value to the {@code sType} field. */
    public VkLatencySubmissionPresentIdNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkLatencySubmissionPresentIdNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentID} field. */
    public VkLatencySubmissionPresentIdNV presentID(@NativeType("uint64_t") long value) { npresentID(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkLatencySubmissionPresentIdNV set(
        int sType,
        long pNext,
        long presentID
    ) {
        sType(sType);
        pNext(pNext);
        presentID(presentID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkLatencySubmissionPresentIdNV set(VkLatencySubmissionPresentIdNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkLatencySubmissionPresentIdNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLatencySubmissionPresentIdNV malloc() {
        return new VkLatencySubmissionPresentIdNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySubmissionPresentIdNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLatencySubmissionPresentIdNV calloc() {
        return new VkLatencySubmissionPresentIdNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySubmissionPresentIdNV} instance allocated with {@link BufferUtils}. */
    public static VkLatencySubmissionPresentIdNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySubmissionPresentIdNV(memAddress(container), container);
    }

    /** Returns a new {@code VkLatencySubmissionPresentIdNV} instance for the specified memory address. */
    public static VkLatencySubmissionPresentIdNV create(long address) {
        return new VkLatencySubmissionPresentIdNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkLatencySubmissionPresentIdNV createSafe(long address) {
        return address == NULL ? null : new VkLatencySubmissionPresentIdNV(address, null);
    }

    /**
     * Returns a new {@link VkLatencySubmissionPresentIdNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySubmissionPresentIdNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLatencySubmissionPresentIdNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySubmissionPresentIdNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySubmissionPresentIdNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySubmissionPresentIdNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkLatencySubmissionPresentIdNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLatencySubmissionPresentIdNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkLatencySubmissionPresentIdNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkLatencySubmissionPresentIdNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySubmissionPresentIdNV malloc(MemoryStack stack) {
        return new VkLatencySubmissionPresentIdNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkLatencySubmissionPresentIdNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySubmissionPresentIdNV calloc(MemoryStack stack) {
        return new VkLatencySubmissionPresentIdNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkLatencySubmissionPresentIdNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySubmissionPresentIdNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySubmissionPresentIdNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySubmissionPresentIdNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkLatencySubmissionPresentIdNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkLatencySubmissionPresentIdNV.PNEXT); }
    /** Unsafe version of {@link #presentID}. */
    public static long npresentID(long struct) { return memGetLong(struct + VkLatencySubmissionPresentIdNV.PRESENTID); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkLatencySubmissionPresentIdNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkLatencySubmissionPresentIdNV.PNEXT, value); }
    /** Unsafe version of {@link #presentID(long) presentID}. */
    public static void npresentID(long struct, long value) { memPutLong(struct + VkLatencySubmissionPresentIdNV.PRESENTID, value); }

    // -----------------------------------

    /** An array of {@link VkLatencySubmissionPresentIdNV} structs. */
    public static class Buffer extends StructBuffer<VkLatencySubmissionPresentIdNV, Buffer> implements NativeResource {

        private static final VkLatencySubmissionPresentIdNV ELEMENT_FACTORY = VkLatencySubmissionPresentIdNV.create(-1L);

        /**
         * Creates a new {@code VkLatencySubmissionPresentIdNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLatencySubmissionPresentIdNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkLatencySubmissionPresentIdNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkLatencySubmissionPresentIdNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkLatencySubmissionPresentIdNV.npNext(address()); }
        /** @return the value of the {@code presentID} field. */
        @NativeType("uint64_t")
        public long presentID() { return VkLatencySubmissionPresentIdNV.npresentID(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkLatencySubmissionPresentIdNV.Buffer sType(@NativeType("VkStructureType") int value) { VkLatencySubmissionPresentIdNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV} value to the {@code sType} field. */
        public VkLatencySubmissionPresentIdNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SUBMISSION_PRESENT_ID_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkLatencySubmissionPresentIdNV.Buffer pNext(@NativeType("void const *") long value) { VkLatencySubmissionPresentIdNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentID} field. */
        public VkLatencySubmissionPresentIdNV.Buffer presentID(@NativeType("uint64_t") long value) { VkLatencySubmissionPresentIdNV.npresentID(address(), value); return this; }

    }

}