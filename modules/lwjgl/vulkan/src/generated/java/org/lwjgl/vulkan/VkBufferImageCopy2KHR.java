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
 * Structure specifying a buffer image copy operation.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure is functionally identical to {@link VkBufferImageCopy}, but adds {@code sType} and {@code pNext} parameters, allowing it to be more easily extended.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
 * <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
 * <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> only have a single bit set</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkCopyCommandTransformInfoQCOM}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code imageSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkCopyBufferToImageInfo2KHR}, {@link VkCopyImageToBufferInfo2KHR}, {@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferImageCopy2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkDeviceSize {@link #bufferOffset};
 *     uint32_t {@link #bufferRowLength};
 *     uint32_t {@link #bufferImageHeight};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #imageSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #imageOffset};
 *     {@link VkExtent3D VkExtent3D} {@link #imageExtent};
 * }</code></pre>
 */
public class VkBufferImageCopy2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BUFFEROFFSET,
        BUFFERROWLENGTH,
        BUFFERIMAGEHEIGHT,
        IMAGESUBRESOURCE,
        IMAGEOFFSET,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
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
        BUFFEROFFSET = layout.offsetof(2);
        BUFFERROWLENGTH = layout.offsetof(3);
        BUFFERIMAGEHEIGHT = layout.offsetof(4);
        IMAGESUBRESOURCE = layout.offsetof(5);
        IMAGEOFFSET = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkBufferImageCopy2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferImageCopy2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the offset in bytes from the start of the buffer object where the image data is copied from or to. */
    @NativeType("VkDeviceSize")
    public long bufferOffset() { return nbufferOffset(address()); }
    /** {@code bufferRowLength} and {@code bufferImageHeight} specify in texels a subregion of a larger two- or three-dimensional image in buffer memory, and control the addressing calculations. If either of these values is zero, that aspect of the buffer memory is considered to be tightly packed according to the {@code imageExtent}. */
    @NativeType("uint32_t")
    public int bufferRowLength() { return nbufferRowLength(address()); }
    /** see {@code bufferRowLength} */
    @NativeType("uint32_t")
    public int bufferImageHeight() { return nbufferImageHeight(address()); }
    /** a {@link VkImageSubresourceLayers} used to specify the specific image subresources of the image used for the source or destination image data. */
    public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
    /** selects the initial {@code x}, {@code y}, {@code z} offsets in texels of the sub-region of the source or destination image data. */
    public VkOffset3D imageOffset() { return nimageOffset(address()); }
    /** the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}. */
    public VkExtent3D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBufferImageCopy2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR} value to the {@link #sType} field. */
    public VkBufferImageCopy2KHR sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBufferImageCopy2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkCopyCommandTransformInfoQCOM} value to the {@code pNext} chain. */
    public VkBufferImageCopy2KHR pNext(VkCopyCommandTransformInfoQCOM value) { return this.pNext(value.pNext(this.pNext())); }
    /** Sets the specified value to the {@link #bufferOffset} field. */
    public VkBufferImageCopy2KHR bufferOffset(@NativeType("VkDeviceSize") long value) { nbufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferRowLength} field. */
    public VkBufferImageCopy2KHR bufferRowLength(@NativeType("uint32_t") int value) { nbufferRowLength(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferImageHeight} field. */
    public VkBufferImageCopy2KHR bufferImageHeight(@NativeType("uint32_t") int value) { nbufferImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #imageSubresource} field. */
    public VkBufferImageCopy2KHR imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@link #imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy2KHR imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #imageOffset} field. */
    public VkBufferImageCopy2KHR imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@link #imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy2KHR imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #imageExtent} field. */
    public VkBufferImageCopy2KHR imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@link #imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy2KHR imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferImageCopy2KHR set(
        int sType,
        long pNext,
        long bufferOffset,
        int bufferRowLength,
        int bufferImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        sType(sType);
        pNext(pNext);
        bufferOffset(bufferOffset);
        bufferRowLength(bufferRowLength);
        bufferImageHeight(bufferImageHeight);
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
    public VkBufferImageCopy2KHR set(VkBufferImageCopy2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferImageCopy2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy2KHR malloc() {
        return wrap(VkBufferImageCopy2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferImageCopy2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy2KHR calloc() {
        return wrap(VkBufferImageCopy2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferImageCopy2KHR} instance allocated with {@link BufferUtils}. */
    public static VkBufferImageCopy2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferImageCopy2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferImageCopy2KHR} instance for the specified memory address. */
    public static VkBufferImageCopy2KHR create(long address) {
        return wrap(VkBufferImageCopy2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferImageCopy2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferImageCopy2KHR.class, address);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferImageCopy2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferImageCopy2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code VkBufferImageCopy2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy2KHR malloc(MemoryStack stack) {
        return wrap(VkBufferImageCopy2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferImageCopy2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy2KHR calloc(MemoryStack stack) {
        return wrap(VkBufferImageCopy2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBufferImageCopy2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferImageCopy2KHR.PNEXT); }
    /** Unsafe version of {@link #bufferOffset}. */
    public static long nbufferOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferImageCopy2KHR.BUFFEROFFSET); }
    /** Unsafe version of {@link #bufferRowLength}. */
    public static int nbufferRowLength(long struct) { return UNSAFE.getInt(null, struct + VkBufferImageCopy2KHR.BUFFERROWLENGTH); }
    /** Unsafe version of {@link #bufferImageHeight}. */
    public static int nbufferImageHeight(long struct) { return UNSAFE.getInt(null, struct + VkBufferImageCopy2KHR.BUFFERIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkBufferImageCopy2KHR.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkBufferImageCopy2KHR.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkBufferImageCopy2KHR.IMAGEEXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferImageCopy2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferImageCopy2KHR.PNEXT, value); }
    /** Unsafe version of {@link #bufferOffset(long) bufferOffset}. */
    public static void nbufferOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferImageCopy2KHR.BUFFEROFFSET, value); }
    /** Unsafe version of {@link #bufferRowLength(int) bufferRowLength}. */
    public static void nbufferRowLength(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferImageCopy2KHR.BUFFERROWLENGTH, value); }
    /** Unsafe version of {@link #bufferImageHeight(int) bufferImageHeight}. */
    public static void nbufferImageHeight(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferImageCopy2KHR.BUFFERIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkBufferImageCopy2KHR.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkBufferImageCopy2KHR.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkBufferImageCopy2KHR.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkBufferImageCopy2KHR} structs. */
    public static class Buffer extends StructBuffer<VkBufferImageCopy2KHR, Buffer> implements NativeResource {

        private static final VkBufferImageCopy2KHR ELEMENT_FACTORY = VkBufferImageCopy2KHR.create(-1L);

        /**
         * Creates a new {@code VkBufferImageCopy2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferImageCopy2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferImageCopy2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBufferImageCopy2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferImageCopy2KHR.nsType(address()); }
        /** @return the value of the {@link VkBufferImageCopy2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferImageCopy2KHR.npNext(address()); }
        /** @return the value of the {@link VkBufferImageCopy2KHR#bufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long bufferOffset() { return VkBufferImageCopy2KHR.nbufferOffset(address()); }
        /** @return the value of the {@link VkBufferImageCopy2KHR#bufferRowLength} field. */
        @NativeType("uint32_t")
        public int bufferRowLength() { return VkBufferImageCopy2KHR.nbufferRowLength(address()); }
        /** @return the value of the {@link VkBufferImageCopy2KHR#bufferImageHeight} field. */
        @NativeType("uint32_t")
        public int bufferImageHeight() { return VkBufferImageCopy2KHR.nbufferImageHeight(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkBufferImageCopy2KHR#imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkBufferImageCopy2KHR.nimageSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkBufferImageCopy2KHR#imageOffset} field. */
        public VkOffset3D imageOffset() { return VkBufferImageCopy2KHR.nimageOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkBufferImageCopy2KHR#imageExtent} field. */
        public VkExtent3D imageExtent() { return VkBufferImageCopy2KHR.nimageExtent(address()); }

        /** Sets the specified value to the {@link VkBufferImageCopy2KHR#sType} field. */
        public VkBufferImageCopy2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferImageCopy2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR} value to the {@link VkBufferImageCopy2KHR#sType} field. */
        public VkBufferImageCopy2KHR.Buffer sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_BUFFER_IMAGE_COPY_2_KHR); }
        /** Sets the specified value to the {@link VkBufferImageCopy2KHR#pNext} field. */
        public VkBufferImageCopy2KHR.Buffer pNext(@NativeType("void const *") long value) { VkBufferImageCopy2KHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkCopyCommandTransformInfoQCOM} value to the {@code pNext} chain. */
        public VkBufferImageCopy2KHR.Buffer pNext(VkCopyCommandTransformInfoQCOM value) { return this.pNext(value.pNext(this.pNext())); }
        /** Sets the specified value to the {@link VkBufferImageCopy2KHR#bufferOffset} field. */
        public VkBufferImageCopy2KHR.Buffer bufferOffset(@NativeType("VkDeviceSize") long value) { VkBufferImageCopy2KHR.nbufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferImageCopy2KHR#bufferRowLength} field. */
        public VkBufferImageCopy2KHR.Buffer bufferRowLength(@NativeType("uint32_t") int value) { VkBufferImageCopy2KHR.nbufferRowLength(address(), value); return this; }
        /** Sets the specified value to the {@link VkBufferImageCopy2KHR#bufferImageHeight} field. */
        public VkBufferImageCopy2KHR.Buffer bufferImageHeight(@NativeType("uint32_t") int value) { VkBufferImageCopy2KHR.nbufferImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkBufferImageCopy2KHR#imageSubresource} field. */
        public VkBufferImageCopy2KHR.Buffer imageSubresource(VkImageSubresourceLayers value) { VkBufferImageCopy2KHR.nimageSubresource(address(), value); return this; }
        /** Passes the {@link VkBufferImageCopy2KHR#imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy2KHR.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkBufferImageCopy2KHR#imageOffset} field. */
        public VkBufferImageCopy2KHR.Buffer imageOffset(VkOffset3D value) { VkBufferImageCopy2KHR.nimageOffset(address(), value); return this; }
        /** Passes the {@link VkBufferImageCopy2KHR#imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy2KHR.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkBufferImageCopy2KHR#imageExtent} field. */
        public VkBufferImageCopy2KHR.Buffer imageExtent(VkExtent3D value) { VkBufferImageCopy2KHR.nimageExtent(address(), value); return this; }
        /** Passes the {@link VkBufferImageCopy2KHR#imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy2KHR.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}