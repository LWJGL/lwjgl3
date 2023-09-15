/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Add frame boundary information to queue submissions.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>can</b> associate frame boundary information to a queue submission call by adding a {@link VkFrameBoundaryEXT} structure to the {@code pNext} chain of <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#devsandqueues-submission">queue submission</a>, {@link VkPresentInfoKHR}, or {@link VkBindSparseInfo}.</p>
 * 
 * <p>The frame identifier is used to associate one or more queue submission to a frame, it is thus meant to be unique within a frame lifetime, i.e. it is possible (but not recommended) to reuse frame identifiers, as long as any two frames with any chance of having overlapping queue submissions (as in the example above) use two different frame identifiers.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Since the concept of frame is application-dependent, there is no way to validate the use of frame identifier. It is good practice to use a monotonically increasing counter as the frame identifier and not reuse identifiers between frames.</p>
 * </div>
 * 
 * <p>The {@code pImages} and {@code pBuffers} arrays contain a list of images and buffers which store the "end result" of the frame. As the concept of frame is application-dependent, not all frames <b>may</b> produce their results in images or buffers, yet this is a sufficiently common case to be handled by {@link VkFrameBoundaryEXT}. Note that no extra information, such as image layout is being provided, since the images are meant to be used by tools which would already be tracking this required information. Having the possibility of passing a list of end-result images makes {@link VkFrameBoundaryEXT} as expressive as {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR}, which is often the default frame boundary delimiter.</p>
 * 
 * <p>The application <b>can</b> also associate arbitrary extra information via tag data using {@code tagName}, {@code tagSize} and {@code pTag}. This extra information is typically tool-specific.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT STRUCTURE_TYPE_FRAME_BOUNDARY_EXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkFrameBoundaryFlagBitsEXT} values</li>
 * <li>If {@code imageCount} is not 0, and {@code pImages} is not {@code NULL}, {@code pImages} <b>must</b> be a valid pointer to an array of {@code imageCount} valid {@code VkImage} handles</li>
 * <li>If {@code bufferCount} is not 0, and {@code pBuffers} is not {@code NULL}, {@code pBuffers} <b>must</b> be a valid pointer to an array of {@code bufferCount} valid {@code VkBuffer} handles</li>
 * <li>Both of the elements of {@code pBuffers}, and the elements of {@code pImages} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFrameBoundaryEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFrameBoundaryFlagsEXT {@link #flags};
 *     uint64_t {@link #frameID};
 *     uint32_t {@link #imageCount};
 *     VkImage const * {@link #pImages};
 *     uint32_t {@link #bufferCount};
 *     VkBuffer const * {@link #pBuffers};
 *     uint64_t {@link #tagName};
 *     size_t {@link #tagSize};
 *     void const * {@link #pTag};
 * }</code></pre>
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

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkFrameBoundaryFlagBitsEXT} that can flag the last submission of a frame identifier. */
    @NativeType("VkFrameBoundaryFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the frame identifier. */
    @NativeType("uint64_t")
    public long frameID() { return nframeID(address()); }
    /** the number of images that store frame results. */
    @NativeType("uint32_t")
    public int imageCount() { return nimageCount(address()); }
    /** a pointer to an array of VkImage objects with imageCount entries. */
    @Nullable
    @NativeType("VkImage const *")
    public LongBuffer pImages() { return npImages(address()); }
    /** the number of buffers the store the frame results. */
    @NativeType("uint32_t")
    public int bufferCount() { return nbufferCount(address()); }
    /** a pointer to an array of VkBuffer objects with bufferCount entries. */
    @Nullable
    @NativeType("VkBuffer const *")
    public LongBuffer pBuffers() { return npBuffers(address()); }
    /** a numerical identifier for tag data. */
    @NativeType("uint64_t")
    public long tagName() { return ntagName(address()); }
    /** the number of bytes of tag data. */
    @NativeType("size_t")
    public long tagSize() { return ntagSize(address()); }
    /** a pointer to an array of {@code tagSize} bytes containing tag data. */
    @NativeType("void const *")
    public long pTag() { return npTag(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFrameBoundaryEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT STRUCTURE_TYPE_FRAME_BOUNDARY_EXT} value to the {@link #sType} field. */
    public VkFrameBoundaryEXT sType$Default() { return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFrameBoundaryEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkFrameBoundaryEXT flags(@NativeType("VkFrameBoundaryFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #frameID} field. */
    public VkFrameBoundaryEXT frameID(@NativeType("uint64_t") long value) { nframeID(address(), value); return this; }
    /** Sets the specified value to the {@link #imageCount} field. */
    public VkFrameBoundaryEXT imageCount(@NativeType("uint32_t") int value) { nimageCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pImages} field. */
    public VkFrameBoundaryEXT pImages(@Nullable @NativeType("VkImage const *") LongBuffer value) { npImages(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferCount} field. */
    public VkFrameBoundaryEXT bufferCount(@NativeType("uint32_t") int value) { nbufferCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@link #pBuffers} field. */
    public VkFrameBoundaryEXT pBuffers(@Nullable @NativeType("VkBuffer const *") LongBuffer value) { npBuffers(address(), value); return this; }
    /** Sets the specified value to the {@link #tagName} field. */
    public VkFrameBoundaryEXT tagName(@NativeType("uint64_t") long value) { ntagName(address(), value); return this; }
    /** Sets the specified value to the {@link #tagSize} field. */
    public VkFrameBoundaryEXT tagSize(@NativeType("size_t") long value) { ntagSize(address(), value); return this; }
    /** Sets the specified value to the {@link #pTag} field. */
    public VkFrameBoundaryEXT pTag(@NativeType("void const *") long value) { npTag(address(), value); return this; }

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
        long pTag
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
    @Nullable
    public static VkFrameBoundaryEXT createSafe(long address) {
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
    @Nullable
    public static VkFrameBoundaryEXT.Buffer createSafe(long address, int capacity) {
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
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFrameBoundaryEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFrameBoundaryEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkFrameBoundaryEXT.FLAGS); }
    /** Unsafe version of {@link #frameID}. */
    public static long nframeID(long struct) { return UNSAFE.getLong(null, struct + VkFrameBoundaryEXT.FRAMEID); }
    /** Unsafe version of {@link #imageCount}. */
    public static int nimageCount(long struct) { return UNSAFE.getInt(null, struct + VkFrameBoundaryEXT.IMAGECOUNT); }
    /** Unsafe version of {@link #pImages() pImages}. */
    @Nullable public static LongBuffer npImages(long struct) { return memLongBufferSafe(memGetAddress(struct + VkFrameBoundaryEXT.PIMAGES), nimageCount(struct)); }
    /** Unsafe version of {@link #bufferCount}. */
    public static int nbufferCount(long struct) { return UNSAFE.getInt(null, struct + VkFrameBoundaryEXT.BUFFERCOUNT); }
    /** Unsafe version of {@link #pBuffers() pBuffers}. */
    @Nullable public static LongBuffer npBuffers(long struct) { return memLongBufferSafe(memGetAddress(struct + VkFrameBoundaryEXT.PBUFFERS), nbufferCount(struct)); }
    /** Unsafe version of {@link #tagName}. */
    public static long ntagName(long struct) { return UNSAFE.getLong(null, struct + VkFrameBoundaryEXT.TAGNAME); }
    /** Unsafe version of {@link #tagSize}. */
    public static long ntagSize(long struct) { return memGetAddress(struct + VkFrameBoundaryEXT.TAGSIZE); }
    /** Unsafe version of {@link #pTag}. */
    public static long npTag(long struct) { return memGetAddress(struct + VkFrameBoundaryEXT.PTAG); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFrameBoundaryEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFrameBoundaryEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkFrameBoundaryEXT.FLAGS, value); }
    /** Unsafe version of {@link #frameID(long) frameID}. */
    public static void nframeID(long struct, long value) { UNSAFE.putLong(null, struct + VkFrameBoundaryEXT.FRAMEID, value); }
    /** Sets the specified value to the {@code imageCount} field of the specified {@code struct}. */
    public static void nimageCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFrameBoundaryEXT.IMAGECOUNT, value); }
    /** Unsafe version of {@link #pImages(LongBuffer) pImages}. */
    public static void npImages(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkFrameBoundaryEXT.PIMAGES, memAddressSafe(value)); if (value != null) { nimageCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code bufferCount} field of the specified {@code struct}. */
    public static void nbufferCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFrameBoundaryEXT.BUFFERCOUNT, value); }
    /** Unsafe version of {@link #pBuffers(LongBuffer) pBuffers}. */
    public static void npBuffers(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkFrameBoundaryEXT.PBUFFERS, memAddressSafe(value)); if (value != null) { nbufferCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #tagName(long) tagName}. */
    public static void ntagName(long struct, long value) { UNSAFE.putLong(null, struct + VkFrameBoundaryEXT.TAGNAME, value); }
    /** Unsafe version of {@link #tagSize(long) tagSize}. */
    public static void ntagSize(long struct, long value) { memPutAddress(struct + VkFrameBoundaryEXT.TAGSIZE, value); }
    /** Unsafe version of {@link #pTag(long) pTag}. */
    public static void npTag(long struct, long value) { memPutAddress(struct + VkFrameBoundaryEXT.PTAG, value); }

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
        protected VkFrameBoundaryEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFrameBoundaryEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFrameBoundaryEXT.nsType(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFrameBoundaryEXT.npNext(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#flags} field. */
        @NativeType("VkFrameBoundaryFlagsEXT")
        public int flags() { return VkFrameBoundaryEXT.nflags(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#frameID} field. */
        @NativeType("uint64_t")
        public long frameID() { return VkFrameBoundaryEXT.nframeID(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#imageCount} field. */
        @NativeType("uint32_t")
        public int imageCount() { return VkFrameBoundaryEXT.nimageCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkFrameBoundaryEXT#pImages} field. */
        @Nullable
        @NativeType("VkImage const *")
        public LongBuffer pImages() { return VkFrameBoundaryEXT.npImages(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#bufferCount} field. */
        @NativeType("uint32_t")
        public int bufferCount() { return VkFrameBoundaryEXT.nbufferCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@link VkFrameBoundaryEXT#pBuffers} field. */
        @Nullable
        @NativeType("VkBuffer const *")
        public LongBuffer pBuffers() { return VkFrameBoundaryEXT.npBuffers(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#tagName} field. */
        @NativeType("uint64_t")
        public long tagName() { return VkFrameBoundaryEXT.ntagName(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#tagSize} field. */
        @NativeType("size_t")
        public long tagSize() { return VkFrameBoundaryEXT.ntagSize(address()); }
        /** @return the value of the {@link VkFrameBoundaryEXT#pTag} field. */
        @NativeType("void const *")
        public long pTag() { return VkFrameBoundaryEXT.npTag(address()); }

        /** Sets the specified value to the {@link VkFrameBoundaryEXT#sType} field. */
        public VkFrameBoundaryEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkFrameBoundaryEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFrameBoundary#VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT STRUCTURE_TYPE_FRAME_BOUNDARY_EXT} value to the {@link VkFrameBoundaryEXT#sType} field. */
        public VkFrameBoundaryEXT.Buffer sType$Default() { return sType(EXTFrameBoundary.VK_STRUCTURE_TYPE_FRAME_BOUNDARY_EXT); }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#pNext} field. */
        public VkFrameBoundaryEXT.Buffer pNext(@NativeType("void const *") long value) { VkFrameBoundaryEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#flags} field. */
        public VkFrameBoundaryEXT.Buffer flags(@NativeType("VkFrameBoundaryFlagsEXT") int value) { VkFrameBoundaryEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#frameID} field. */
        public VkFrameBoundaryEXT.Buffer frameID(@NativeType("uint64_t") long value) { VkFrameBoundaryEXT.nframeID(address(), value); return this; }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#imageCount} field. */
        public VkFrameBoundaryEXT.Buffer imageCount(@NativeType("uint32_t") int value) { VkFrameBoundaryEXT.nimageCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkFrameBoundaryEXT#pImages} field. */
        public VkFrameBoundaryEXT.Buffer pImages(@Nullable @NativeType("VkImage const *") LongBuffer value) { VkFrameBoundaryEXT.npImages(address(), value); return this; }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#bufferCount} field. */
        public VkFrameBoundaryEXT.Buffer bufferCount(@NativeType("uint32_t") int value) { VkFrameBoundaryEXT.nbufferCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@link VkFrameBoundaryEXT#pBuffers} field. */
        public VkFrameBoundaryEXT.Buffer pBuffers(@Nullable @NativeType("VkBuffer const *") LongBuffer value) { VkFrameBoundaryEXT.npBuffers(address(), value); return this; }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#tagName} field. */
        public VkFrameBoundaryEXT.Buffer tagName(@NativeType("uint64_t") long value) { VkFrameBoundaryEXT.ntagName(address(), value); return this; }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#tagSize} field. */
        public VkFrameBoundaryEXT.Buffer tagSize(@NativeType("size_t") long value) { VkFrameBoundaryEXT.ntagSize(address(), value); return this; }
        /** Sets the specified value to the {@link VkFrameBoundaryEXT#pTag} field. */
        public VkFrameBoundaryEXT.Buffer pTag(@NativeType("void const *") long value) { VkFrameBoundaryEXT.npTag(address(), value); return this; }

    }

}