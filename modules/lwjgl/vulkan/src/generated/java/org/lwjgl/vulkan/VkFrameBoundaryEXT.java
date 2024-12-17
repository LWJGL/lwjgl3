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
 * struct VkFrameBoundaryEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFrameBoundaryFlagsEXT flags;
 *     uint64_t frameID;
 *     uint32_t imageCount;
 *     VkImage const * pImages;
 *     uint32_t bufferCount;
 *     VkBuffer const * pBuffers;
 *     uint64_t tagName;
 *     size_t tagSize;
 *     void const * pTag;
 * }}</pre>
 */
public class VkFrameBoundaryEXT extends Struct<VkFrameBoundaryEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        FRAMEID,
        IMAGECOUNT,
        PIMAGES,
        BUFFERCOUNT,
        PBUFFERS,
        TAGNAME,
        TAGSIZE,
        PTAG;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        FRAMEID = layout.offsetof(3);
        IMAGECOUNT = layout.offsetof(4);
        PIMAGES = layout.offsetof(5);
        BUFFERCOUNT = layout.offsetof(6);
        PBUFFERS = layout.offsetof(7);
        TAGNAME = layout.offsetof(8);
        TAGSIZE = layout.offsetof(9);
        PTAG = layout.offsetof(10);
    }

    protected VkFrameBoundaryEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFrameBoundaryEXT create(long address, @Nullable ByteBuffer container) {
        return new VkFrameBoundaryEXT(address, container);
    }

    /**
     * Creates a {@code VkFrameBoundaryEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFrameBoundaryEXT(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkFrameBoundaryFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code frameID} field. */
    @NativeType("uint64_t")
    public long frameID() { return nframeID(address()); }
    /** @return the value of the {@code imageCount} field. */
    @NativeType("uint32_t")
    public int imageCount() { return nimageCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pImages} field. */
    @NativeType("VkImage const *")
    public @Nullable LongBuffer pImages() { return npImages(address()); }
    /** @return the value of the {@code bufferCount} field. */
    @NativeType("uint32_t")
    public int bufferCount() { return nbufferCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pBuffers} field. */
    @NativeType("VkBuffer const *")
    public @Nullable LongBuffer pBuffers() { return npBuffers(address()); }
    /** @return the value of the {@code tagName} field. */
    @NativeType("uint64_t")
    public long tagName() { return ntagName(address()); }
    /** @return the value of the {@code tagSize} field. */
    @NativeType("size_t")
    public long tagSize() { return ntagSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
    @NativeType("void const *")
    public @Nullable ByteBuffer pTag() { return npTag(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFrameBoundaryEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT STRUCTURE_TYPE_FRAME_BOUNDARY_EXT} value to the {@code sType} field. */
    public VkFrameBoundaryEXT sType$Default() { return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFrameBoundaryEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkFrameBoundaryEXT flags(@NativeType("VkFrameBoundaryFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code frameID} field. */
    public VkFrameBoundaryEXT frameID(@NativeType("uint64_t") long value) { nframeID(address(), value); return this; }
    /** Sets the specified value to the {@code imageCount} field. */
    public VkFrameBoundaryEXT imageCount(@NativeType("uint32_t") int value) { nimageCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pImages} field. */
    public VkFrameBoundaryEXT pImages(@Nullable @NativeType("VkImage const *") LongBuffer value) { npImages(address(), value); return this; }
    /** Sets the specified value to the {@code bufferCount} field. */
    public VkFrameBoundaryEXT bufferCount(@NativeType("uint32_t") int value) { nbufferCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pBuffers} field. */
    public VkFrameBoundaryEXT pBuffers(@Nullable @NativeType("VkBuffer const *") LongBuffer value) { npBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code tagName} field. */
    public VkFrameBoundaryEXT tagName(@NativeType("uint64_t") long value) { ntagName(address(), value); return this; }
    /** Sets the specified value to the {@code tagSize} field. */
    public VkFrameBoundaryEXT tagSize(@NativeType("size_t") long value) { ntagSize(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
    public VkFrameBoundaryEXT pTag(@Nullable @NativeType("void const *") ByteBuffer value) { npTag(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFrameBoundaryEXT set(
        int sType,
        long pNext,
        int flags,
        long frameID,
        int imageCount,
        @Nullable LongBuffer pImages,
        int bufferCount,
        @Nullable LongBuffer pBuffers,
        long tagName,
        long tagSize,
        @Nullable ByteBuffer pTag
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        frameID(frameID);
        imageCount(imageCount);
        pImages(pImages);
        bufferCount(bufferCount);
        pBuffers(pBuffers);
        tagName(tagName);
        tagSize(tagSize);
        pTag(pTag);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFrameBoundaryEXT set(VkFrameBoundaryEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFrameBoundaryEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFrameBoundaryEXT malloc() {
        return new VkFrameBoundaryEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFrameBoundaryEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFrameBoundaryEXT calloc() {
        return new VkFrameBoundaryEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFrameBoundaryEXT} instance allocated with {@link BufferUtils}. */
    public static VkFrameBoundaryEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFrameBoundaryEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkFrameBoundaryEXT} instance for the specified memory address. */
    public static VkFrameBoundaryEXT create(long address) {
        return new VkFrameBoundaryEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFrameBoundaryEXT createSafe(long address) {
        return address == NULL ? null : new VkFrameBoundaryEXT(address, null);
    }

    /**
     * Returns a new {@link VkFrameBoundaryEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFrameBoundaryEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFrameBoundaryEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFrameBoundaryEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFrameBoundaryEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkFrameBoundaryEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFrameBoundaryEXT malloc(MemoryStack stack) {
        return new VkFrameBoundaryEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFrameBoundaryEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFrameBoundaryEXT calloc(MemoryStack stack) {
        return new VkFrameBoundaryEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFrameBoundaryEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFrameBoundaryEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFrameBoundaryEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFrameBoundaryEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFrameBoundaryEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkFrameBoundaryEXT.FLAGS); }
    /** Unsafe version of {@link #frameID}. */
    public static long nframeID(long struct) { return memGetLong(struct + VkFrameBoundaryEXT.FRAMEID); }
    /** Unsafe version of {@link #imageCount}. */
    public static int nimageCount(long struct) { return memGetInt(struct + VkFrameBoundaryEXT.IMAGECOUNT); }
    /** Unsafe version of {@link #pImages() pImages}. */
    public static @Nullable LongBuffer npImages(long struct) { return memLongBufferSafe(memGetAddress(struct + VkFrameBoundaryEXT.PIMAGES), nimageCount(struct)); }
    /** Unsafe version of {@link #bufferCount}. */
    public static int nbufferCount(long struct) { return memGetInt(struct + VkFrameBoundaryEXT.BUFFERCOUNT); }
    /** Unsafe version of {@link #pBuffers() pBuffers}. */
    public static @Nullable LongBuffer npBuffers(long struct) { return memLongBufferSafe(memGetAddress(struct + VkFrameBoundaryEXT.PBUFFERS), nbufferCount(struct)); }
    /** Unsafe version of {@link #tagName}. */
    public static long ntagName(long struct) { return memGetLong(struct + VkFrameBoundaryEXT.TAGNAME); }
    /** Unsafe version of {@link #tagSize}. */
    public static long ntagSize(long struct) { return memGetAddress(struct + VkFrameBoundaryEXT.TAGSIZE); }
    /** Unsafe version of {@link #pTag() pTag}. */
    public static @Nullable ByteBuffer npTag(long struct) { return memByteBufferSafe(memGetAddress(struct + VkFrameBoundaryEXT.PTAG), (int)ntagSize(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFrameBoundaryEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFrameBoundaryEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkFrameBoundaryEXT.FLAGS, value); }
    /** Unsafe version of {@link #frameID(long) frameID}. */
    public static void nframeID(long struct, long value) { memPutLong(struct + VkFrameBoundaryEXT.FRAMEID, value); }
    /** Sets the specified value to the {@code imageCount} field of the specified {@code struct}. */
    public static void nimageCount(long struct, int value) { memPutInt(struct + VkFrameBoundaryEXT.IMAGECOUNT, value); }
    /** Unsafe version of {@link #pImages(LongBuffer) pImages}. */
    public static void npImages(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkFrameBoundaryEXT.PIMAGES, memAddressSafe(value)); if (value != null) { nimageCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code bufferCount} field of the specified {@code struct}. */
    public static void nbufferCount(long struct, int value) { memPutInt(struct + VkFrameBoundaryEXT.BUFFERCOUNT, value); }
    /** Unsafe version of {@link #pBuffers(LongBuffer) pBuffers}. */
    public static void npBuffers(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkFrameBoundaryEXT.PBUFFERS, memAddressSafe(value)); if (value != null) { nbufferCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #tagName(long) tagName}. */
    public static void ntagName(long struct, long value) { memPutLong(struct + VkFrameBoundaryEXT.TAGNAME, value); }
    /** Sets the specified value to the {@code tagSize} field of the specified {@code struct}. */
    public static void ntagSize(long struct, long value) { memPutAddress(struct + VkFrameBoundaryEXT.TAGSIZE, value); }
    /** Unsafe version of {@link #pTag(ByteBuffer) pTag}. */
    public static void npTag(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + VkFrameBoundaryEXT.PTAG, memAddressSafe(value)); if (value != null) { ntagSize(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkFrameBoundaryEXT} structs. */
    public static class Buffer extends StructBuffer<VkFrameBoundaryEXT, Buffer> implements NativeResource {

        private static final VkFrameBoundaryEXT ELEMENT_FACTORY = VkFrameBoundaryEXT.create(-1L);

        /**
         * Creates a new {@code VkFrameBoundaryEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFrameBoundaryEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFrameBoundaryEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFrameBoundaryEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFrameBoundaryEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkFrameBoundaryFlagsEXT")
        public int flags() { return VkFrameBoundaryEXT.nflags(address()); }
        /** @return the value of the {@code frameID} field. */
        @NativeType("uint64_t")
        public long frameID() { return VkFrameBoundaryEXT.nframeID(address()); }
        /** @return the value of the {@code imageCount} field. */
        @NativeType("uint32_t")
        public int imageCount() { return VkFrameBoundaryEXT.nimageCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pImages} field. */
        @NativeType("VkImage const *")
        public @Nullable LongBuffer pImages() { return VkFrameBoundaryEXT.npImages(address()); }
        /** @return the value of the {@code bufferCount} field. */
        @NativeType("uint32_t")
        public int bufferCount() { return VkFrameBoundaryEXT.nbufferCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pBuffers} field. */
        @NativeType("VkBuffer const *")
        public @Nullable LongBuffer pBuffers() { return VkFrameBoundaryEXT.npBuffers(address()); }
        /** @return the value of the {@code tagName} field. */
        @NativeType("uint64_t")
        public long tagName() { return VkFrameBoundaryEXT.ntagName(address()); }
        /** @return the value of the {@code tagSize} field. */
        @NativeType("size_t")
        public long tagSize() { return VkFrameBoundaryEXT.ntagSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pTag} field. */
        @NativeType("void const *")
        public @Nullable ByteBuffer pTag() { return VkFrameBoundaryEXT.npTag(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFrameBoundaryEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkFrameBoundaryEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT STRUCTURE_TYPE_FRAME_BOUNDARY_EXT} value to the {@code sType} field. */
        public VkFrameBoundaryEXT.Buffer sType$Default() { return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFrameBoundaryEXT.Buffer pNext(@NativeType("void const *") long value) { VkFrameBoundaryEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkFrameBoundaryEXT.Buffer flags(@NativeType("VkFrameBoundaryFlagsEXT") int value) { VkFrameBoundaryEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code frameID} field. */
        public VkFrameBoundaryEXT.Buffer frameID(@NativeType("uint64_t") long value) { VkFrameBoundaryEXT.nframeID(address(), value); return this; }
        /** Sets the specified value to the {@code imageCount} field. */
        public VkFrameBoundaryEXT.Buffer imageCount(@NativeType("uint32_t") int value) { VkFrameBoundaryEXT.nimageCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pImages} field. */
        public VkFrameBoundaryEXT.Buffer pImages(@Nullable @NativeType("VkImage const *") LongBuffer value) { VkFrameBoundaryEXT.npImages(address(), value); return this; }
        /** Sets the specified value to the {@code bufferCount} field. */
        public VkFrameBoundaryEXT.Buffer bufferCount(@NativeType("uint32_t") int value) { VkFrameBoundaryEXT.nbufferCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pBuffers} field. */
        public VkFrameBoundaryEXT.Buffer pBuffers(@Nullable @NativeType("VkBuffer const *") LongBuffer value) { VkFrameBoundaryEXT.npBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code tagName} field. */
        public VkFrameBoundaryEXT.Buffer tagName(@NativeType("uint64_t") long value) { VkFrameBoundaryEXT.ntagName(address(), value); return this; }
        /** Sets the specified value to the {@code tagSize} field. */
        public VkFrameBoundaryEXT.Buffer tagSize(@NativeType("size_t") long value) { VkFrameBoundaryEXT.ntagSize(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pTag} field. */
        public VkFrameBoundaryEXT.Buffer pTag(@Nullable @NativeType("void const *") ByteBuffer value) { VkFrameBoundaryEXT.npTag(address(), value); return this; }

    }

}