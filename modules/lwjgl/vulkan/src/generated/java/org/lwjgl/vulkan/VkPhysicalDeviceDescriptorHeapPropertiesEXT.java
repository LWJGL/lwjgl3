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
 * struct VkPhysicalDeviceDescriptorHeapPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceSize samplerHeapAlignment;
 *     VkDeviceSize resourceHeapAlignment;
 *     VkDeviceSize maxSamplerHeapSize;
 *     VkDeviceSize maxResourceHeapSize;
 *     VkDeviceSize minSamplerHeapReservedRange;
 *     VkDeviceSize minSamplerHeapReservedRangeWithEmbedded;
 *     VkDeviceSize minResourceHeapReservedRange;
 *     VkDeviceSize samplerDescriptorSize;
 *     VkDeviceSize imageDescriptorSize;
 *     VkDeviceSize bufferDescriptorSize;
 *     VkDeviceSize samplerDescriptorAlignment;
 *     VkDeviceSize imageDescriptorAlignment;
 *     VkDeviceSize bufferDescriptorAlignment;
 *     VkDeviceSize maxPushDataSize;
 *     size_t imageCaptureReplayOpaqueDataSize;
 *     uint32_t maxDescriptorHeapEmbeddedSamplers;
 *     uint32_t samplerYcbcrConversionCount;
 *     VkBool32 sparseDescriptorHeaps;
 *     VkBool32 protectedDescriptorHeaps;
 * }}</pre>
 */
public class VkPhysicalDeviceDescriptorHeapPropertiesEXT extends Struct<VkPhysicalDeviceDescriptorHeapPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLERHEAPALIGNMENT,
        RESOURCEHEAPALIGNMENT,
        MAXSAMPLERHEAPSIZE,
        MAXRESOURCEHEAPSIZE,
        MINSAMPLERHEAPRESERVEDRANGE,
        MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED,
        MINRESOURCEHEAPRESERVEDRANGE,
        SAMPLERDESCRIPTORSIZE,
        IMAGEDESCRIPTORSIZE,
        BUFFERDESCRIPTORSIZE,
        SAMPLERDESCRIPTORALIGNMENT,
        IMAGEDESCRIPTORALIGNMENT,
        BUFFERDESCRIPTORALIGNMENT,
        MAXPUSHDATASIZE,
        IMAGECAPTUREREPLAYOPAQUEDATASIZE,
        MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS,
        SAMPLERYCBCRCONVERSIONCOUNT,
        SPARSEDESCRIPTORHEAPS,
        PROTECTEDDESCRIPTORHEAPS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLERHEAPALIGNMENT = layout.offsetof(2);
        RESOURCEHEAPALIGNMENT = layout.offsetof(3);
        MAXSAMPLERHEAPSIZE = layout.offsetof(4);
        MAXRESOURCEHEAPSIZE = layout.offsetof(5);
        MINSAMPLERHEAPRESERVEDRANGE = layout.offsetof(6);
        MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED = layout.offsetof(7);
        MINRESOURCEHEAPRESERVEDRANGE = layout.offsetof(8);
        SAMPLERDESCRIPTORSIZE = layout.offsetof(9);
        IMAGEDESCRIPTORSIZE = layout.offsetof(10);
        BUFFERDESCRIPTORSIZE = layout.offsetof(11);
        SAMPLERDESCRIPTORALIGNMENT = layout.offsetof(12);
        IMAGEDESCRIPTORALIGNMENT = layout.offsetof(13);
        BUFFERDESCRIPTORALIGNMENT = layout.offsetof(14);
        MAXPUSHDATASIZE = layout.offsetof(15);
        IMAGECAPTUREREPLAYOPAQUEDATASIZE = layout.offsetof(16);
        MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS = layout.offsetof(17);
        SAMPLERYCBCRCONVERSIONCOUNT = layout.offsetof(18);
        SPARSEDESCRIPTORHEAPS = layout.offsetof(19);
        PROTECTEDDESCRIPTORHEAPS = layout.offsetof(20);
    }

    protected VkPhysicalDeviceDescriptorHeapPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDescriptorHeapPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code samplerHeapAlignment} field. */
    @NativeType("VkDeviceSize")
    public long samplerHeapAlignment() { return nsamplerHeapAlignment(address()); }
    /** @return the value of the {@code resourceHeapAlignment} field. */
    @NativeType("VkDeviceSize")
    public long resourceHeapAlignment() { return nresourceHeapAlignment(address()); }
    /** @return the value of the {@code maxSamplerHeapSize} field. */
    @NativeType("VkDeviceSize")
    public long maxSamplerHeapSize() { return nmaxSamplerHeapSize(address()); }
    /** @return the value of the {@code maxResourceHeapSize} field. */
    @NativeType("VkDeviceSize")
    public long maxResourceHeapSize() { return nmaxResourceHeapSize(address()); }
    /** @return the value of the {@code minSamplerHeapReservedRange} field. */
    @NativeType("VkDeviceSize")
    public long minSamplerHeapReservedRange() { return nminSamplerHeapReservedRange(address()); }
    /** @return the value of the {@code minSamplerHeapReservedRangeWithEmbedded} field. */
    @NativeType("VkDeviceSize")
    public long minSamplerHeapReservedRangeWithEmbedded() { return nminSamplerHeapReservedRangeWithEmbedded(address()); }
    /** @return the value of the {@code minResourceHeapReservedRange} field. */
    @NativeType("VkDeviceSize")
    public long minResourceHeapReservedRange() { return nminResourceHeapReservedRange(address()); }
    /** @return the value of the {@code samplerDescriptorSize} field. */
    @NativeType("VkDeviceSize")
    public long samplerDescriptorSize() { return nsamplerDescriptorSize(address()); }
    /** @return the value of the {@code imageDescriptorSize} field. */
    @NativeType("VkDeviceSize")
    public long imageDescriptorSize() { return nimageDescriptorSize(address()); }
    /** @return the value of the {@code bufferDescriptorSize} field. */
    @NativeType("VkDeviceSize")
    public long bufferDescriptorSize() { return nbufferDescriptorSize(address()); }
    /** @return the value of the {@code samplerDescriptorAlignment} field. */
    @NativeType("VkDeviceSize")
    public long samplerDescriptorAlignment() { return nsamplerDescriptorAlignment(address()); }
    /** @return the value of the {@code imageDescriptorAlignment} field. */
    @NativeType("VkDeviceSize")
    public long imageDescriptorAlignment() { return nimageDescriptorAlignment(address()); }
    /** @return the value of the {@code bufferDescriptorAlignment} field. */
    @NativeType("VkDeviceSize")
    public long bufferDescriptorAlignment() { return nbufferDescriptorAlignment(address()); }
    /** @return the value of the {@code maxPushDataSize} field. */
    @NativeType("VkDeviceSize")
    public long maxPushDataSize() { return nmaxPushDataSize(address()); }
    /** @return the value of the {@code imageCaptureReplayOpaqueDataSize} field. */
    @NativeType("size_t")
    public long imageCaptureReplayOpaqueDataSize() { return nimageCaptureReplayOpaqueDataSize(address()); }
    /** @return the value of the {@code maxDescriptorHeapEmbeddedSamplers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorHeapEmbeddedSamplers() { return nmaxDescriptorHeapEmbeddedSamplers(address()); }
    /** @return the value of the {@code samplerYcbcrConversionCount} field. */
    @NativeType("uint32_t")
    public int samplerYcbcrConversionCount() { return nsamplerYcbcrConversionCount(address()); }
    /** @return the value of the {@code sparseDescriptorHeaps} field. */
    @NativeType("VkBool32")
    public boolean sparseDescriptorHeaps() { return nsparseDescriptorHeaps(address()) != 0; }
    /** @return the value of the {@code protectedDescriptorHeaps} field. */
    @NativeType("VkBool32")
    public boolean protectedDescriptorHeaps() { return nprotectedDescriptorHeaps(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT set(
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
    public VkPhysicalDeviceDescriptorHeapPropertiesEXT set(VkPhysicalDeviceDescriptorHeapPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT malloc() {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT calloc() {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT create(long address) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDescriptorHeapPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDescriptorHeapPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDescriptorHeapPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #samplerHeapAlignment}. */
    public static long nsamplerHeapAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERHEAPALIGNMENT); }
    /** Unsafe version of {@link #resourceHeapAlignment}. */
    public static long nresourceHeapAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.RESOURCEHEAPALIGNMENT); }
    /** Unsafe version of {@link #maxSamplerHeapSize}. */
    public static long nmaxSamplerHeapSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXSAMPLERHEAPSIZE); }
    /** Unsafe version of {@link #maxResourceHeapSize}. */
    public static long nmaxResourceHeapSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXRESOURCEHEAPSIZE); }
    /** Unsafe version of {@link #minSamplerHeapReservedRange}. */
    public static long nminSamplerHeapReservedRange(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINSAMPLERHEAPRESERVEDRANGE); }
    /** Unsafe version of {@link #minSamplerHeapReservedRangeWithEmbedded}. */
    public static long nminSamplerHeapReservedRangeWithEmbedded(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED); }
    /** Unsafe version of {@link #minResourceHeapReservedRange}. */
    public static long nminResourceHeapReservedRange(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINRESOURCEHEAPRESERVEDRANGE); }
    /** Unsafe version of {@link #samplerDescriptorSize}. */
    public static long nsamplerDescriptorSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #imageDescriptorSize}. */
    public static long nimageDescriptorSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGEDESCRIPTORSIZE); }
    /** Unsafe version of {@link #bufferDescriptorSize}. */
    public static long nbufferDescriptorSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.BUFFERDESCRIPTORSIZE); }
    /** Unsafe version of {@link #samplerDescriptorAlignment}. */
    public static long nsamplerDescriptorAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERDESCRIPTORALIGNMENT); }
    /** Unsafe version of {@link #imageDescriptorAlignment}. */
    public static long nimageDescriptorAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGEDESCRIPTORALIGNMENT); }
    /** Unsafe version of {@link #bufferDescriptorAlignment}. */
    public static long nbufferDescriptorAlignment(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.BUFFERDESCRIPTORALIGNMENT); }
    /** Unsafe version of {@link #maxPushDataSize}. */
    public static long nmaxPushDataSize(long struct) { return memGetLong(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXPUSHDATASIZE); }
    /** Unsafe version of {@link #imageCaptureReplayOpaqueDataSize}. */
    public static long nimageCaptureReplayOpaqueDataSize(long struct) { return memGetAddress(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGECAPTUREREPLAYOPAQUEDATASIZE); }
    /** Unsafe version of {@link #maxDescriptorHeapEmbeddedSamplers}. */
    public static int nmaxDescriptorHeapEmbeddedSamplers(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS); }
    /** Unsafe version of {@link #samplerYcbcrConversionCount}. */
    public static int nsamplerYcbcrConversionCount(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERYCBCRCONVERSIONCOUNT); }
    /** Unsafe version of {@link #sparseDescriptorHeaps}. */
    public static int nsparseDescriptorHeaps(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.SPARSEDESCRIPTORHEAPS); }
    /** Unsafe version of {@link #protectedDescriptorHeaps}. */
    public static int nprotectedDescriptorHeaps(long struct) { return memGetInt(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.PROTECTEDDESCRIPTORHEAPS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDescriptorHeapPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDescriptorHeapPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDescriptorHeapPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceDescriptorHeapPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDescriptorHeapPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDescriptorHeapPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.npNext(address()); }
        /** @return the value of the {@code samplerHeapAlignment} field. */
        @NativeType("VkDeviceSize")
        public long samplerHeapAlignment() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerHeapAlignment(address()); }
        /** @return the value of the {@code resourceHeapAlignment} field. */
        @NativeType("VkDeviceSize")
        public long resourceHeapAlignment() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nresourceHeapAlignment(address()); }
        /** @return the value of the {@code maxSamplerHeapSize} field. */
        @NativeType("VkDeviceSize")
        public long maxSamplerHeapSize() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxSamplerHeapSize(address()); }
        /** @return the value of the {@code maxResourceHeapSize} field. */
        @NativeType("VkDeviceSize")
        public long maxResourceHeapSize() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxResourceHeapSize(address()); }
        /** @return the value of the {@code minSamplerHeapReservedRange} field. */
        @NativeType("VkDeviceSize")
        public long minSamplerHeapReservedRange() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminSamplerHeapReservedRange(address()); }
        /** @return the value of the {@code minSamplerHeapReservedRangeWithEmbedded} field. */
        @NativeType("VkDeviceSize")
        public long minSamplerHeapReservedRangeWithEmbedded() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminSamplerHeapReservedRangeWithEmbedded(address()); }
        /** @return the value of the {@code minResourceHeapReservedRange} field. */
        @NativeType("VkDeviceSize")
        public long minResourceHeapReservedRange() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminResourceHeapReservedRange(address()); }
        /** @return the value of the {@code samplerDescriptorSize} field. */
        @NativeType("VkDeviceSize")
        public long samplerDescriptorSize() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerDescriptorSize(address()); }
        /** @return the value of the {@code imageDescriptorSize} field. */
        @NativeType("VkDeviceSize")
        public long imageDescriptorSize() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageDescriptorSize(address()); }
        /** @return the value of the {@code bufferDescriptorSize} field. */
        @NativeType("VkDeviceSize")
        public long bufferDescriptorSize() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nbufferDescriptorSize(address()); }
        /** @return the value of the {@code samplerDescriptorAlignment} field. */
        @NativeType("VkDeviceSize")
        public long samplerDescriptorAlignment() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerDescriptorAlignment(address()); }
        /** @return the value of the {@code imageDescriptorAlignment} field. */
        @NativeType("VkDeviceSize")
        public long imageDescriptorAlignment() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageDescriptorAlignment(address()); }
        /** @return the value of the {@code bufferDescriptorAlignment} field. */
        @NativeType("VkDeviceSize")
        public long bufferDescriptorAlignment() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nbufferDescriptorAlignment(address()); }
        /** @return the value of the {@code maxPushDataSize} field. */
        @NativeType("VkDeviceSize")
        public long maxPushDataSize() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxPushDataSize(address()); }
        /** @return the value of the {@code imageCaptureReplayOpaqueDataSize} field. */
        @NativeType("size_t")
        public long imageCaptureReplayOpaqueDataSize() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageCaptureReplayOpaqueDataSize(address()); }
        /** @return the value of the {@code maxDescriptorHeapEmbeddedSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorHeapEmbeddedSamplers() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxDescriptorHeapEmbeddedSamplers(address()); }
        /** @return the value of the {@code samplerYcbcrConversionCount} field. */
        @NativeType("uint32_t")
        public int samplerYcbcrConversionCount() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerYcbcrConversionCount(address()); }
        /** @return the value of the {@code sparseDescriptorHeaps} field. */
        @NativeType("VkBool32")
        public boolean sparseDescriptorHeaps() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsparseDescriptorHeaps(address()) != 0; }
        /** @return the value of the {@code protectedDescriptorHeaps} field. */
        @NativeType("VkBool32")
        public boolean protectedDescriptorHeaps() { return VkPhysicalDeviceDescriptorHeapPropertiesEXT.nprotectedDescriptorHeaps(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorHeap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer sType$Default() { return sType(EXTDescriptorHeap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_HEAP_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDescriptorHeapPropertiesEXT.npNext(address(), value); return this; }

    }

}