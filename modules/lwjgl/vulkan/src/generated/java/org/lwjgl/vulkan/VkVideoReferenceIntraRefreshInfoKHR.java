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
 * struct VkVideoReferenceIntraRefreshInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t dirtyIntraRefreshRegions;
 * }}</pre>
 */
public class VkVideoReferenceIntraRefreshInfoKHR extends Struct<VkVideoReferenceIntraRefreshInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DIRTYINTRAREFRESHREGIONS;

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
        DIRTYINTRAREFRESHREGIONS = layout.offsetof(2);
    }

    protected VkVideoReferenceIntraRefreshInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoReferenceIntraRefreshInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoReferenceIntraRefreshInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoReferenceIntraRefreshInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoReferenceIntraRefreshInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code dirtyIntraRefreshRegions} field. */
    @NativeType("uint32_t")
    public int dirtyIntraRefreshRegions() { return ndirtyIntraRefreshRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoReferenceIntraRefreshInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR} value to the {@code sType} field. */
    public VkVideoReferenceIntraRefreshInfoKHR sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoReferenceIntraRefreshInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dirtyIntraRefreshRegions} field. */
    public VkVideoReferenceIntraRefreshInfoKHR dirtyIntraRefreshRegions(@NativeType("uint32_t") int value) { ndirtyIntraRefreshRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoReferenceIntraRefreshInfoKHR set(
        int sType,
        long pNext,
        int dirtyIntraRefreshRegions
    ) {
        sType(sType);
        pNext(pNext);
        dirtyIntraRefreshRegions(dirtyIntraRefreshRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoReferenceIntraRefreshInfoKHR set(VkVideoReferenceIntraRefreshInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoReferenceIntraRefreshInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoReferenceIntraRefreshInfoKHR malloc() {
        return new VkVideoReferenceIntraRefreshInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoReferenceIntraRefreshInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoReferenceIntraRefreshInfoKHR calloc() {
        return new VkVideoReferenceIntraRefreshInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoReferenceIntraRefreshInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoReferenceIntraRefreshInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoReferenceIntraRefreshInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoReferenceIntraRefreshInfoKHR} instance for the specified memory address. */
    public static VkVideoReferenceIntraRefreshInfoKHR create(long address) {
        return new VkVideoReferenceIntraRefreshInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoReferenceIntraRefreshInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoReferenceIntraRefreshInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoReferenceIntraRefreshInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceIntraRefreshInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceIntraRefreshInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceIntraRefreshInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceIntraRefreshInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceIntraRefreshInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoReferenceIntraRefreshInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceIntraRefreshInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoReferenceIntraRefreshInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoReferenceIntraRefreshInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoReferenceIntraRefreshInfoKHR malloc(MemoryStack stack) {
        return new VkVideoReferenceIntraRefreshInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoReferenceIntraRefreshInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoReferenceIntraRefreshInfoKHR calloc(MemoryStack stack) {
        return new VkVideoReferenceIntraRefreshInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoReferenceIntraRefreshInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceIntraRefreshInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoReferenceIntraRefreshInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoReferenceIntraRefreshInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoReferenceIntraRefreshInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoReferenceIntraRefreshInfoKHR.PNEXT); }
    /** Unsafe version of {@link #dirtyIntraRefreshRegions}. */
    public static int ndirtyIntraRefreshRegions(long struct) { return memGetInt(struct + VkVideoReferenceIntraRefreshInfoKHR.DIRTYINTRAREFRESHREGIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoReferenceIntraRefreshInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoReferenceIntraRefreshInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #dirtyIntraRefreshRegions(int) dirtyIntraRefreshRegions}. */
    public static void ndirtyIntraRefreshRegions(long struct, int value) { memPutInt(struct + VkVideoReferenceIntraRefreshInfoKHR.DIRTYINTRAREFRESHREGIONS, value); }

    // -----------------------------------

    /** An array of {@link VkVideoReferenceIntraRefreshInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoReferenceIntraRefreshInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoReferenceIntraRefreshInfoKHR ELEMENT_FACTORY = VkVideoReferenceIntraRefreshInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoReferenceIntraRefreshInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoReferenceIntraRefreshInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoReferenceIntraRefreshInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoReferenceIntraRefreshInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoReferenceIntraRefreshInfoKHR.npNext(address()); }
        /** @return the value of the {@code dirtyIntraRefreshRegions} field. */
        @NativeType("uint32_t")
        public int dirtyIntraRefreshRegions() { return VkVideoReferenceIntraRefreshInfoKHR.ndirtyIntraRefreshRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoReferenceIntraRefreshInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoReferenceIntraRefreshInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR} value to the {@code sType} field. */
        public VkVideoReferenceIntraRefreshInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_REFERENCE_INTRA_REFRESH_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoReferenceIntraRefreshInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoReferenceIntraRefreshInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dirtyIntraRefreshRegions} field. */
        public VkVideoReferenceIntraRefreshInfoKHR.Buffer dirtyIntraRefreshRegions(@NativeType("uint32_t") int value) { VkVideoReferenceIntraRefreshInfoKHR.ndirtyIntraRefreshRegions(address(), value); return this; }

    }

}