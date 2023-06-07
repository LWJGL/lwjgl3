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
 * Structure specifying indirect buffer image copy operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code srcAddress} <b>must</b> be 4 byte aligned</li>
 * <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
 * <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
 * <li>{@code imageOffset} <b>must</b> specify a valid offset in the destination image</li>
 * <li>{@code imageExtent} <b>must</b> specify a valid region in the destination image and can be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code imageSubresource} <b>must</b> be a valid {@link VkImageSubresourceLayers} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyMemoryToImageIndirectCommandNV {
 *     VkDeviceAddress {@link #srcAddress};
 *     uint32_t {@link #bufferRowLength};
 *     uint32_t {@link #bufferImageHeight};
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} {@link #imageSubresource};
 *     {@link VkOffset3D VkOffset3D} {@link #imageOffset};
 *     {@link VkExtent3D VkExtent3D} {@link #imageExtent};
 * }</code></pre>
 */
public class VkCopyMemoryToImageIndirectCommandNV extends Struct<VkCopyMemoryToImageIndirectCommandNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCADDRESS,
        BUFFERROWLENGTH,
        BUFFERIMAGEHEIGHT,
        IMAGESUBRESOURCE,
        IMAGEOFFSET,
        IMAGEEXTENT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCADDRESS = layout.offsetof(0);
        BUFFERROWLENGTH = layout.offsetof(1);
        BUFFERIMAGEHEIGHT = layout.offsetof(2);
        IMAGESUBRESOURCE = layout.offsetof(3);
        IMAGEOFFSET = layout.offsetof(4);
        IMAGEEXTENT = layout.offsetof(5);
    }

    protected VkCopyMemoryToImageIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToImageIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToImageIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToImageIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToImageIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the starting address of the source host or device memory to copy from. */
    @NativeType("VkDeviceAddress")
    public long srcAddress() { return nsrcAddress(address()); }
    /** {@code bufferRowLength} and {@code bufferImageHeight} specify in texels a subregion of a larger two- or three-dimensional image in buffer memory, and control the addressing calculations. If either of these values is zero, that aspect of the buffer memory is considered to be tightly packed according to the {@code imageExtent}. */
    @NativeType("uint32_t")
    public int bufferRowLength() { return nbufferRowLength(address()); }
    /** see {@code bufferRowLength} */
    @NativeType("uint32_t")
    public int bufferImageHeight() { return nbufferImageHeight(address()); }
    /** a {@link VkImageSubresourceLayers} used to specify the specific image subresources of the image used for the destination image data, which <b>must</b> match the values specified in {@code pImageSubresources} parameter of {@link NVCopyMemoryIndirect#vkCmdCopyMemoryToImageIndirectNV CmdCopyMemoryToImageIndirectNV} during command recording. */
    public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
    /** selects the initial {@code x}, {@code y}, {@code z} offsets in texels of the sub-region of the destination image data. */
    public VkOffset3D imageOffset() { return nimageOffset(address()); }
    /** the size in texels of the destination image in {@code width}, {@code height} and {@code depth}. */
    public VkExtent3D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@link #srcAddress} field. */
    public VkCopyMemoryToImageIndirectCommandNV srcAddress(@NativeType("VkDeviceAddress") long value) { nsrcAddress(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferRowLength} field. */
    public VkCopyMemoryToImageIndirectCommandNV bufferRowLength(@NativeType("uint32_t") int value) { nbufferRowLength(address(), value); return this; }
    /** Sets the specified value to the {@link #bufferImageHeight} field. */
    public VkCopyMemoryToImageIndirectCommandNV bufferImageHeight(@NativeType("uint32_t") int value) { nbufferImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@link #imageSubresource} field. */
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@link #imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToImageIndirectCommandNV imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@link #imageOffset} field. */
    public VkCopyMemoryToImageIndirectCommandNV imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@link #imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToImageIndirectCommandNV imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@link #imageExtent} field. */
    public VkCopyMemoryToImageIndirectCommandNV imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@link #imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkCopyMemoryToImageIndirectCommandNV imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToImageIndirectCommandNV set(
        long srcAddress,
        int bufferRowLength,
        int bufferImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
        srcAddress(srcAddress);
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
    public VkCopyMemoryToImageIndirectCommandNV set(VkCopyMemoryToImageIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectCommandNV malloc() {
        return new VkCopyMemoryToImageIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageIndirectCommandNV calloc() {
        return new VkCopyMemoryToImageIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToImageIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance for the specified memory address. */
    public static VkCopyMemoryToImageIndirectCommandNV create(long address) {
        return new VkCopyMemoryToImageIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMemoryToImageIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToImageIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectCommandNV malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageIndirectCommandNV calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcAddress}. */
    public static long nsrcAddress(long struct) { return UNSAFE.getLong(null, struct + VkCopyMemoryToImageIndirectCommandNV.SRCADDRESS); }
    /** Unsafe version of {@link #bufferRowLength}. */
    public static int nbufferRowLength(long struct) { return UNSAFE.getInt(null, struct + VkCopyMemoryToImageIndirectCommandNV.BUFFERROWLENGTH); }
    /** Unsafe version of {@link #bufferImageHeight}. */
    public static int nbufferImageHeight(long struct) { return UNSAFE.getInt(null, struct + VkCopyMemoryToImageIndirectCommandNV.BUFFERIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkCopyMemoryToImageIndirectCommandNV.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkCopyMemoryToImageIndirectCommandNV.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkCopyMemoryToImageIndirectCommandNV.IMAGEEXTENT); }

    /** Unsafe version of {@link #srcAddress(long) srcAddress}. */
    public static void nsrcAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyMemoryToImageIndirectCommandNV.SRCADDRESS, value); }
    /** Unsafe version of {@link #bufferRowLength(int) bufferRowLength}. */
    public static void nbufferRowLength(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMemoryToImageIndirectCommandNV.BUFFERROWLENGTH, value); }
    /** Unsafe version of {@link #bufferImageHeight(int) bufferImageHeight}. */
    public static void nbufferImageHeight(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyMemoryToImageIndirectCommandNV.BUFFERIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkCopyMemoryToImageIndirectCommandNV.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkCopyMemoryToImageIndirectCommandNV.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkCopyMemoryToImageIndirectCommandNV.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToImageIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkCopyMemoryToImageIndirectCommandNV ELEMENT_FACTORY = VkCopyMemoryToImageIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToImageIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToImageIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToImageIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyMemoryToImageIndirectCommandNV#srcAddress} field. */
        @NativeType("VkDeviceAddress")
        public long srcAddress() { return VkCopyMemoryToImageIndirectCommandNV.nsrcAddress(address()); }
        /** @return the value of the {@link VkCopyMemoryToImageIndirectCommandNV#bufferRowLength} field. */
        @NativeType("uint32_t")
        public int bufferRowLength() { return VkCopyMemoryToImageIndirectCommandNV.nbufferRowLength(address()); }
        /** @return the value of the {@link VkCopyMemoryToImageIndirectCommandNV#bufferImageHeight} field. */
        @NativeType("uint32_t")
        public int bufferImageHeight() { return VkCopyMemoryToImageIndirectCommandNV.nbufferImageHeight(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@link VkCopyMemoryToImageIndirectCommandNV#imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkCopyMemoryToImageIndirectCommandNV.nimageSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@link VkCopyMemoryToImageIndirectCommandNV#imageOffset} field. */
        public VkOffset3D imageOffset() { return VkCopyMemoryToImageIndirectCommandNV.nimageOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@link VkCopyMemoryToImageIndirectCommandNV#imageExtent} field. */
        public VkExtent3D imageExtent() { return VkCopyMemoryToImageIndirectCommandNV.nimageExtent(address()); }

        /** Sets the specified value to the {@link VkCopyMemoryToImageIndirectCommandNV#srcAddress} field. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer srcAddress(@NativeType("VkDeviceAddress") long value) { VkCopyMemoryToImageIndirectCommandNV.nsrcAddress(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToImageIndirectCommandNV#bufferRowLength} field. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer bufferRowLength(@NativeType("uint32_t") int value) { VkCopyMemoryToImageIndirectCommandNV.nbufferRowLength(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToImageIndirectCommandNV#bufferImageHeight} field. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer bufferImageHeight(@NativeType("uint32_t") int value) { VkCopyMemoryToImageIndirectCommandNV.nbufferImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@link VkCopyMemoryToImageIndirectCommandNV#imageSubresource} field. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageSubresource(VkImageSubresourceLayers value) { VkCopyMemoryToImageIndirectCommandNV.nimageSubresource(address(), value); return this; }
        /** Passes the {@link VkCopyMemoryToImageIndirectCommandNV#imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@link VkCopyMemoryToImageIndirectCommandNV#imageOffset} field. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageOffset(VkOffset3D value) { VkCopyMemoryToImageIndirectCommandNV.nimageOffset(address(), value); return this; }
        /** Passes the {@link VkCopyMemoryToImageIndirectCommandNV#imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@link VkCopyMemoryToImageIndirectCommandNV#imageExtent} field. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageExtent(VkExtent3D value) { VkCopyMemoryToImageIndirectCommandNV.nimageExtent(address(), value); return this; }
        /** Passes the {@link VkCopyMemoryToImageIndirectCommandNV#imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkCopyMemoryToImageIndirectCommandNV.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}