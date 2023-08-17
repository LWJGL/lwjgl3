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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a host memory to image copy operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is functionally similar to {@link VkBufferImageCopy2}, except it defines host memory as the source of copy instead of a buffer. In particular, the same data packing rules and restrictions as that structure apply here as well.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pHostPointer} <b>must</b> point to memory that is large enough to contain all memory locations that are accessed according to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
 * <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
 * <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> only have a single bit set</li>
 * <li>{@code imageExtent.width} <b>must</b> not be 0</li>
 * <li>{@code imageExtent.height} <b>must</b> not be 0</li>
 * <li>{@code imageExtent.depth} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code pHostPointer} <b>must</b> be a pointer value</li>
 * <li>{@code imageSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCopyMemoryToImageInfoEXT}, {@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMemoryToImageCopyEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     void const * {@link #pHostPointer};
 *     uint32_t {@link #memoryRowLength};
 *     uint32_t {@link #memoryImageHeight};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #imageSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #imageOffset};
 *     {@link VkExtent3D VkExtent3D} {@link #imageExtent};
 * }</code></pre>
 */
public class VkMemoryToImageCopyEXT extends Struct<VkMemoryToImageCopyEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PHOSTPOINTER,
        MEMORYROWLENGTH,
        MEMORYIMAGEHEIGHT,
        IMAGESUBRESOURCE,
        IMAGEOFFSET,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PHOSTPOINTER = layout.offsetof(2);
        MEMORYROWLENGTH = layout.offsetof(3);
        MEMORYIMAGEHEIGHT = layout.offsetof(4);
        IMAGESUBRESOURCE = layout.offsetof(5);
        IMAGEOFFSET = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
    }

    protected VkMemoryToImageCopyEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMemoryToImageCopyEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMemoryToImageCopyEXT(address, container);
    }

    /**
     * Creates a {@code VkMemoryToImageCopyEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMemoryToImageCopyEXT(ByteBuffer container) {
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
    /** the host memory address which is the source of the copy. */
    @NativeType("void const *")
    public long pHostPointer() { return npHostPointer(address()); }
    /** {@code memoryRowLength} and {@code memoryImageHeight} specify in texels a subregion of a larger two- or three-dimensional image in host memory, and control the addressing calculations. If either of these values is zero, that aspect of the host memory is considered to be tightly packed according to the {@code imageExtent}. */
    @NativeType("uint32_t")
    public int memoryRowLength() { return nmemoryRowLength(address()); }
    /** see {@code memoryRowLength} */
    @NativeType("uint32_t")
    public int memoryImageHeight() { return nmemoryImageHeight(address()); }
    /** a {@link VkImageSubresourceLayers} used to specify the specific image subresources of the image used for the source or destination image data. */
    public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
    /** selects the initial {@code x}, {@code y}, {@code z} offsets in texels of the sub-region of the destination image data. */
    public VkOffset3D imageOffset() { return nimageOffset(address()); }
    /** the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}. */
    public VkExtent3D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMemoryToImageCopyEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT} value to the {@link #sType} field. */
    public VkMemoryToImageCopyEXT sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMemoryToImageCopyEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pHostPointer} field. */
    public VkMemoryToImageCopyEXT pHostPointer(@NativeType("void const *") long value) { npHostPointer(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryRowLength} field. */
    public VkMemoryToImageCopyEXT memoryRowLength(@NativeType("uint32_t") int value) { nmemoryRowLength(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryImageHeight} field. */
    public VkMemoryToImageCopyEXT memoryImageHeight(@NativeType("uint32_t") int value) { nmemoryImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #imageSubresource} field. */
    public VkMemoryToImageCopyEXT imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@link #imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMemoryToImageCopyEXT imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #imageOffset} field. */
    public VkMemoryToImageCopyEXT imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@link #imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMemoryToImageCopyEXT imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #imageExtent} field. */
    public VkMemoryToImageCopyEXT imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@link #imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkMemoryToImageCopyEXT imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkMemoryToImageCopyEXT set(
        int sType,
        long pNext,
        long pHostPointer,
        int memoryRowLength,
        int memoryImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        pHostPointer(pHostPointer);
        memoryRowLength(memoryRowLength);
        memoryImageHeight(memoryImageHeight);
        imageSubresource(imageSubresource);
        imageOffset(imageOffset);
        imageExtent(imageExtent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMemoryToImageCopyEXT set(VkMemoryToImageCopyEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMemoryToImageCopyEXT malloc() {
        return new VkMemoryToImageCopyEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMemoryToImageCopyEXT calloc() {
        return new VkMemoryToImageCopyEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance allocated with {@link BufferUtils}. */
    public static VkMemoryToImageCopyEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryToImageCopyEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMemoryToImageCopyEXT} instance for the specified memory address. */
    public static VkMemoryToImageCopyEXT create(long address) {
        return new VkMemoryToImageCopyEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryToImageCopyEXT createSafe(long address) {
        return address == NULL ? null : new VkMemoryToImageCopyEXT(address, null);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMemoryToImageCopyEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMemoryToImageCopyEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMemoryToImageCopyEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryToImageCopyEXT malloc(MemoryStack stack) {
        return new VkMemoryToImageCopyEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMemoryToImageCopyEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMemoryToImageCopyEXT calloc(MemoryStack stack) {
        return new VkMemoryToImageCopyEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMemoryToImageCopyEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMemoryToImageCopyEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMemoryToImageCopyEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMemoryToImageCopyEXT.PNEXT); }
    /** Unsafe version of {@link #pHostPointer}. */
    public static long npHostPointer(long struct) { return memGetAddress(struct + VkMemoryToImageCopyEXT.PHOSTPOINTER); }
    /** Unsafe version of {@link #memoryRowLength}. */
    public static int nmemoryRowLength(long struct) { return UNSAFE.getInt(null, struct + VkMemoryToImageCopyEXT.MEMORYROWLENGTH); }
    /** Unsafe version of {@link #memoryImageHeight}. */
    public static int nmemoryImageHeight(long struct) { return UNSAFE.getInt(null, struct + VkMemoryToImageCopyEXT.MEMORYIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkMemoryToImageCopyEXT.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkMemoryToImageCopyEXT.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkMemoryToImageCopyEXT.IMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryToImageCopyEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryToImageCopyEXT.PNEXT, value); }
    /** Unsafe version of {@link #pHostPointer(long) pHostPointer}. */
    public static void npHostPointer(long struct, long value) { memPutAddress(struct + VkMemoryToImageCopyEXT.PHOSTPOINTER, check(value)); }
    /** Unsafe version of {@link #memoryRowLength(int) memoryRowLength}. */
    public static void nmemoryRowLength(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryToImageCopyEXT.MEMORYROWLENGTH, value); }
    /** Unsafe version of {@link #memoryImageHeight(int) memoryImageHeight}. */
    public static void nmemoryImageHeight(long struct, int value) { UNSAFE.putInt(null, struct + VkMemoryToImageCopyEXT.MEMORYIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkMemoryToImageCopyEXT.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkMemoryToImageCopyEXT.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkMemoryToImageCopyEXT.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkMemoryToImageCopyEXT.PHOSTPOINTER));
    }

    // -----------------------------------

    /** An array of {@link VkMemoryToImageCopyEXT} structs. */
    public static class Buffer extends StructBuffer<VkMemoryToImageCopyEXT, Buffer> implements NativeResource {

        private static final VkMemoryToImageCopyEXT ELEMENT_FACTORY = VkMemoryToImageCopyEXT.create(-1L);

        /**
         * Creates a new {@code VkMemoryToImageCopyEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMemoryToImageCopyEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMemoryToImageCopyEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMemoryToImageCopyEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMemoryToImageCopyEXT.nsType(address()); }
        /** @return the value of the {@link VkMemoryToImageCopyEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMemoryToImageCopyEXT.npNext(address()); }
        /** @return the value of the {@link VkMemoryToImageCopyEXT#pHostPointer} field. */
        @NativeType("void const *")
        public long pHostPointer() { return VkMemoryToImageCopyEXT.npHostPointer(address()); }
        /** @return the value of the {@link VkMemoryToImageCopyEXT#memoryRowLength} field. */
        @NativeType("uint32_t")
        public int memoryRowLength() { return VkMemoryToImageCopyEXT.nmemoryRowLength(address()); }
        /** @return the value of the {@link VkMemoryToImageCopyEXT#memoryImageHeight} field. */
        @NativeType("uint32_t")
        public int memoryImageHeight() { return VkMemoryToImageCopyEXT.nmemoryImageHeight(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkMemoryToImageCopyEXT#imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkMemoryToImageCopyEXT.nimageSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkMemoryToImageCopyEXT#imageOffset} field. */
        public VkOffset3D imageOffset() { return VkMemoryToImageCopyEXT.nimageOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkMemoryToImageCopyEXT#imageExtent} field. */
        public VkExtent3D imageExtent() { return VkMemoryToImageCopyEXT.nimageExtent(address()); }

        /** Sets the specified value to the {@link VkMemoryToImageCopyEXT#sType} field. */
        public VkMemoryToImageCopyEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMemoryToImageCopyEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT} value to the {@link VkMemoryToImageCopyEXT#sType} field. */
        public VkMemoryToImageCopyEXT.Buffer sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_MEMORY_TO_IMAGE_COPY_EXT); }
        /** Sets the specified value to the {@link VkMemoryToImageCopyEXT#pNext} field. */
        public VkMemoryToImageCopyEXT.Buffer pNext(@NativeType("void const *") long value) { VkMemoryToImageCopyEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryToImageCopyEXT#pHostPointer} field. */
        public VkMemoryToImageCopyEXT.Buffer pHostPointer(@NativeType("void const *") long value) { VkMemoryToImageCopyEXT.npHostPointer(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryToImageCopyEXT#memoryRowLength} field. */
        public VkMemoryToImageCopyEXT.Buffer memoryRowLength(@NativeType("uint32_t") int value) { VkMemoryToImageCopyEXT.nmemoryRowLength(address(), value); return this; }
        /** Sets the specified value to the {@link VkMemoryToImageCopyEXT#memoryImageHeight} field. */
        public VkMemoryToImageCopyEXT.Buffer memoryImageHeight(@NativeType("uint32_t") int value) { VkMemoryToImageCopyEXT.nmemoryImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkMemoryToImageCopyEXT#imageSubresource} field. */
        public VkMemoryToImageCopyEXT.Buffer imageSubresource(VkImageSubresourceLayers value) { VkMemoryToImageCopyEXT.nimageSubresource(address(), value); return this; }
        /** Passes the {@link VkMemoryToImageCopyEXT#imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMemoryToImageCopyEXT.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkMemoryToImageCopyEXT#imageOffset} field. */
        public VkMemoryToImageCopyEXT.Buffer imageOffset(VkOffset3D value) { VkMemoryToImageCopyEXT.nimageOffset(address(), value); return this; }
        /** Passes the {@link VkMemoryToImageCopyEXT#imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMemoryToImageCopyEXT.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkMemoryToImageCopyEXT#imageExtent} field. */
        public VkMemoryToImageCopyEXT.Buffer imageExtent(VkExtent3D value) { VkMemoryToImageCopyEXT.nimageExtent(address(), value); return this; }
        /** Passes the {@link VkMemoryToImageCopyEXT#imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkMemoryToImageCopyEXT.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}