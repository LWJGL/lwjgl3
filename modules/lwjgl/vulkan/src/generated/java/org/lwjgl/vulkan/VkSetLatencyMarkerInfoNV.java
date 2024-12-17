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
 * struct VkSetLatencyMarkerInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t presentID;
 *     VkLatencyMarkerNV marker;
 * }}</pre>
 */
public class VkSetLatencyMarkerInfoNV extends Struct<VkSetLatencyMarkerInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTID,
        MARKER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRESENTID = layout.offsetof(2);
        MARKER = layout.offsetof(3);
    }

    protected VkSetLatencyMarkerInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSetLatencyMarkerInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkSetLatencyMarkerInfoNV(address, container);
    }

    /**
     * Creates a {@code VkSetLatencyMarkerInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSetLatencyMarkerInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code marker} field. */
    @NativeType("VkLatencyMarkerNV")
    public int marker() { return nmarker(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSetLatencyMarkerInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV} value to the {@code sType} field. */
    public VkSetLatencyMarkerInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSetLatencyMarkerInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentID} field. */
    public VkSetLatencyMarkerInfoNV presentID(@NativeType("uint64_t") long value) { npresentID(address(), value); return this; }
    /** Sets the specified value to the {@code marker} field. */
    public VkSetLatencyMarkerInfoNV marker(@NativeType("VkLatencyMarkerNV") int value) { nmarker(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSetLatencyMarkerInfoNV set(
        int sType,
        long pNext,
        long presentID,
        int marker
    ) {
        sType(sType);
        pNext(pNext);
        presentID(presentID);
        marker(marker);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSetLatencyMarkerInfoNV set(VkSetLatencyMarkerInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSetLatencyMarkerInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSetLatencyMarkerInfoNV malloc() {
        return new VkSetLatencyMarkerInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSetLatencyMarkerInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSetLatencyMarkerInfoNV calloc() {
        return new VkSetLatencyMarkerInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSetLatencyMarkerInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkSetLatencyMarkerInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSetLatencyMarkerInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkSetLatencyMarkerInfoNV} instance for the specified memory address. */
    public static VkSetLatencyMarkerInfoNV create(long address) {
        return new VkSetLatencyMarkerInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSetLatencyMarkerInfoNV createSafe(long address) {
        return address == NULL ? null : new VkSetLatencyMarkerInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkSetLatencyMarkerInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetLatencyMarkerInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSetLatencyMarkerInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetLatencyMarkerInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetLatencyMarkerInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSetLatencyMarkerInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSetLatencyMarkerInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSetLatencyMarkerInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSetLatencyMarkerInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSetLatencyMarkerInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetLatencyMarkerInfoNV malloc(MemoryStack stack) {
        return new VkSetLatencyMarkerInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSetLatencyMarkerInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSetLatencyMarkerInfoNV calloc(MemoryStack stack) {
        return new VkSetLatencyMarkerInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSetLatencyMarkerInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetLatencyMarkerInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSetLatencyMarkerInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSetLatencyMarkerInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSetLatencyMarkerInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSetLatencyMarkerInfoNV.PNEXT); }
    /** Unsafe version of {@link #presentID}. */
    public static long npresentID(long struct) { return memGetLong(struct + VkSetLatencyMarkerInfoNV.PRESENTID); }
    /** Unsafe version of {@link #marker}. */
    public static int nmarker(long struct) { return memGetInt(struct + VkSetLatencyMarkerInfoNV.MARKER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSetLatencyMarkerInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSetLatencyMarkerInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #presentID(long) presentID}. */
    public static void npresentID(long struct, long value) { memPutLong(struct + VkSetLatencyMarkerInfoNV.PRESENTID, value); }
    /** Unsafe version of {@link #marker(int) marker}. */
    public static void nmarker(long struct, int value) { memPutInt(struct + VkSetLatencyMarkerInfoNV.MARKER, value); }

    // -----------------------------------

    /** An array of {@link VkSetLatencyMarkerInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkSetLatencyMarkerInfoNV, Buffer> implements NativeResource {

        private static final VkSetLatencyMarkerInfoNV ELEMENT_FACTORY = VkSetLatencyMarkerInfoNV.create(-1L);

        /**
         * Creates a new {@code VkSetLatencyMarkerInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSetLatencyMarkerInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSetLatencyMarkerInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSetLatencyMarkerInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSetLatencyMarkerInfoNV.npNext(address()); }
        /** @return the value of the {@code presentID} field. */
        @NativeType("uint64_t")
        public long presentID() { return VkSetLatencyMarkerInfoNV.npresentID(address()); }
        /** @return the value of the {@code marker} field. */
        @NativeType("VkLatencyMarkerNV")
        public int marker() { return VkSetLatencyMarkerInfoNV.nmarker(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSetLatencyMarkerInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkSetLatencyMarkerInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV} value to the {@code sType} field. */
        public VkSetLatencyMarkerInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SET_LATENCY_MARKER_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSetLatencyMarkerInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkSetLatencyMarkerInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentID} field. */
        public VkSetLatencyMarkerInfoNV.Buffer presentID(@NativeType("uint64_t") long value) { VkSetLatencyMarkerInfoNV.npresentID(address(), value); return this; }
        /** Sets the specified value to the {@code marker} field. */
        public VkSetLatencyMarkerInfoNV.Buffer marker(@NativeType("VkLatencyMarkerNV") int value) { VkSetLatencyMarkerInfoNV.nmarker(address(), value); return this; }

    }

}