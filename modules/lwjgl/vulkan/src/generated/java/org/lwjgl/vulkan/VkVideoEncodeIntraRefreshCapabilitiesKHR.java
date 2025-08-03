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
 * struct VkVideoEncodeIntraRefreshCapabilitiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkVideoEncodeIntraRefreshModeFlagsKHR intraRefreshModes;
 *     uint32_t maxIntraRefreshCycleDuration;
 *     uint32_t maxIntraRefreshActiveReferencePictures;
 *     VkBool32 partitionIndependentIntraRefreshRegions;
 *     VkBool32 nonRectangularIntraRefreshRegions;
 * }}</pre>
 */
public class VkVideoEncodeIntraRefreshCapabilitiesKHR extends Struct<VkVideoEncodeIntraRefreshCapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INTRAREFRESHMODES,
        MAXINTRAREFRESHCYCLEDURATION,
        MAXINTRAREFRESHACTIVEREFERENCEPICTURES,
        PARTITIONINDEPENDENTINTRAREFRESHREGIONS,
        NONRECTANGULARINTRAREFRESHREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INTRAREFRESHMODES = layout.offsetof(2);
        MAXINTRAREFRESHCYCLEDURATION = layout.offsetof(3);
        MAXINTRAREFRESHACTIVEREFERENCEPICTURES = layout.offsetof(4);
        PARTITIONINDEPENDENTINTRAREFRESHREGIONS = layout.offsetof(5);
        NONRECTANGULARINTRAREFRESHREGIONS = layout.offsetof(6);
    }

    protected VkVideoEncodeIntraRefreshCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeIntraRefreshCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeIntraRefreshCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeIntraRefreshCapabilitiesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code intraRefreshModes} field. */
    @NativeType("VkVideoEncodeIntraRefreshModeFlagsKHR")
    public int intraRefreshModes() { return nintraRefreshModes(address()); }
    /** @return the value of the {@code maxIntraRefreshCycleDuration} field. */
    @NativeType("uint32_t")
    public int maxIntraRefreshCycleDuration() { return nmaxIntraRefreshCycleDuration(address()); }
    /** @return the value of the {@code maxIntraRefreshActiveReferencePictures} field. */
    @NativeType("uint32_t")
    public int maxIntraRefreshActiveReferencePictures() { return nmaxIntraRefreshActiveReferencePictures(address()); }
    /** @return the value of the {@code partitionIndependentIntraRefreshRegions} field. */
    @NativeType("VkBool32")
    public boolean partitionIndependentIntraRefreshRegions() { return npartitionIndependentIntraRefreshRegions(address()) != 0; }
    /** @return the value of the {@code nonRectangularIntraRefreshRegions} field. */
    @NativeType("VkBool32")
    public boolean nonRectangularIntraRefreshRegions() { return nnonRectangularIntraRefreshRegions(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeIntraRefreshCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR} value to the {@code sType} field. */
    public VkVideoEncodeIntraRefreshCapabilitiesKHR sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeIntraRefreshCapabilitiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeIntraRefreshCapabilitiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeIntraRefreshCapabilitiesKHR set(VkVideoEncodeIntraRefreshCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeIntraRefreshCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR malloc() {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeIntraRefreshCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR calloc() {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeIntraRefreshCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeIntraRefreshCapabilitiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR create(long address) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeIntraRefreshCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeIntraRefreshCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeIntraRefreshCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeIntraRefreshCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeIntraRefreshCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #intraRefreshModes}. */
    public static int nintraRefreshModes(long struct) { return memGetInt(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.INTRAREFRESHMODES); }
    /** Unsafe version of {@link #maxIntraRefreshCycleDuration}. */
    public static int nmaxIntraRefreshCycleDuration(long struct) { return memGetInt(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.MAXINTRAREFRESHCYCLEDURATION); }
    /** Unsafe version of {@link #maxIntraRefreshActiveReferencePictures}. */
    public static int nmaxIntraRefreshActiveReferencePictures(long struct) { return memGetInt(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.MAXINTRAREFRESHACTIVEREFERENCEPICTURES); }
    /** Unsafe version of {@link #partitionIndependentIntraRefreshRegions}. */
    public static int npartitionIndependentIntraRefreshRegions(long struct) { return memGetInt(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.PARTITIONINDEPENDENTINTRAREFRESHREGIONS); }
    /** Unsafe version of {@link #nonRectangularIntraRefreshRegions}. */
    public static int nnonRectangularIntraRefreshRegions(long struct) { return memGetInt(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.NONRECTANGULARINTRAREFRESHREGIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeIntraRefreshCapabilitiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeIntraRefreshCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeIntraRefreshCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeIntraRefreshCapabilitiesKHR ELEMENT_FACTORY = VkVideoEncodeIntraRefreshCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeIntraRefreshCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeIntraRefreshCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeIntraRefreshCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeIntraRefreshCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@code intraRefreshModes} field. */
        @NativeType("VkVideoEncodeIntraRefreshModeFlagsKHR")
        public int intraRefreshModes() { return VkVideoEncodeIntraRefreshCapabilitiesKHR.nintraRefreshModes(address()); }
        /** @return the value of the {@code maxIntraRefreshCycleDuration} field. */
        @NativeType("uint32_t")
        public int maxIntraRefreshCycleDuration() { return VkVideoEncodeIntraRefreshCapabilitiesKHR.nmaxIntraRefreshCycleDuration(address()); }
        /** @return the value of the {@code maxIntraRefreshActiveReferencePictures} field. */
        @NativeType("uint32_t")
        public int maxIntraRefreshActiveReferencePictures() { return VkVideoEncodeIntraRefreshCapabilitiesKHR.nmaxIntraRefreshActiveReferencePictures(address()); }
        /** @return the value of the {@code partitionIndependentIntraRefreshRegions} field. */
        @NativeType("VkBool32")
        public boolean partitionIndependentIntraRefreshRegions() { return VkVideoEncodeIntraRefreshCapabilitiesKHR.npartitionIndependentIntraRefreshRegions(address()) != 0; }
        /** @return the value of the {@code nonRectangularIntraRefreshRegions} field. */
        @NativeType("VkBool32")
        public boolean nonRectangularIntraRefreshRegions() { return VkVideoEncodeIntraRefreshCapabilitiesKHR.nnonRectangularIntraRefreshRegions(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeIntraRefreshCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR} value to the {@code sType} field. */
        public VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_INTRA_REFRESH_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeIntraRefreshCapabilitiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeIntraRefreshCapabilitiesKHR.npNext(address(), value); return this; }

    }

}