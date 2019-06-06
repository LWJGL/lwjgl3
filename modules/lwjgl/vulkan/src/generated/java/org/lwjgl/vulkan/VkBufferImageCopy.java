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
 * <p>When copying to or from a depth or stencil aspect, the data in buffer memory uses a layout that is a (mostly) tightly packed representation of the depth or stencil data. Specifically:</p>
 * 
 * <ul>
 * <li>data copied to or from the stencil aspect of any depth/stencil format is tightly packed with one {@link VK10#VK_FORMAT_S8_UINT FORMAT_S8_UINT} value per texel.</li>
 * <li>data copied to or from the depth aspect of a {@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM} or {@link VK10#VK_FORMAT_D16_UNORM_S8_UINT FORMAT_D16_UNORM_S8_UINT} format is tightly packed with one {@link VK10#VK_FORMAT_D16_UNORM FORMAT_D16_UNORM} value per texel.</li>
 * <li>data copied to or from the depth aspect of a {@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT} or {@link VK10#VK_FORMAT_D32_SFLOAT_S8_UINT FORMAT_D32_SFLOAT_S8_UINT} format is tightly packed with one {@link VK10#VK_FORMAT_D32_SFLOAT FORMAT_D32_SFLOAT} value per texel.</li>
 * <li>data copied to or from the depth aspect of a {@link VK10#VK_FORMAT_X8_D24_UNORM_PACK32 FORMAT_X8_D24_UNORM_PACK32} or {@link VK10#VK_FORMAT_D24_UNORM_S8_UINT FORMAT_D24_UNORM_S8_UINT} format is packed with one 32-bit word per texel with the D24 value in the LSBs of the word, and undefined values in the eight MSBs.</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>To copy both the depth and stencil aspects of a depth/stencil format, two entries in {@code pRegions} <b>can</b> be used, where one specifies the depth aspect in {@code imageSubresource}, and the other specifies the stencil aspect.</p>
 * </div>
 * 
 * <p>Because depth or stencil aspect buffer to image copies <b>may</b> require format conversions on some implementations, they are not supported on queues that do not support graphics.</p>
 * 
 * <p>Copies are done layer by layer starting with image layer {@code baseArrayLayer} member of {@code imageSubresource}. {@code layerCount} layers are copied from the source image or to the destination image.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the calling command&#8217;s {@code VkImage} parameter&#8217;s format is not a depth/stencil format or a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then {@code bufferOffset} <b>must</b> be a multiple of the format&#8217;s texel block size.</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter&#8217;s format is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then {@code bufferOffset} <b>must</b> be a multiple of the element size of the compatible format for the format and the {@code aspectMask} of the {@code imageSubresource} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a></li>
 * <li>{@code bufferOffset} <b>must</b> be a multiple of 4</li>
 * <li>{@code bufferRowLength} <b>must</b> be 0, or greater than or equal to the {@code width} member of {@code imageExtent}</li>
 * <li>{@code bufferImageHeight} <b>must</b> be 0, or greater than or equal to the {@code height} member of {@code imageExtent}</li>
 * <li>{@code imageOffset.x} and <code>(imageExtent.width imageOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource width where this refers to the width of the <em>plane</em> of the image involved in the copy in the case of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
 * <li>{@code imageOffset.y} and <code>(imageExtent.height imageOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource height where this refers to the height of the <em>plane</em> of the image involved in the copy in the case of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
 * <li>If the calling command&#8217;s {@code srcImage} ({@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}) or {@code dstImage} ({@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}) is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then {@code imageOffset.y} <b>must</b> be 0 and {@code imageExtent.height} <b>must</b> be 1.</li>
 * <li>{@code imageOffset.z} and <code>(imageExtent.depth imageOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the image subresource depth</li>
 * <li>If the calling command&#8217;s {@code srcImage} ({@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}) or {@code dstImage} ({@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}) is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then {@code imageOffset.z} <b>must</b> be 0 and {@code imageExtent.depth} <b>must</b> be 1</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed image, or a <em>single-plane</em>, “{@code _422}” image format, {@code bufferRowLength} <b>must</b> be a multiple of the compressed texel block width</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed image, or a <em>single-plane</em>, “{@code _422}” image format, {@code bufferImageHeight} <b>must</b> be a multiple of the compressed texel block height</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed image, or a <em>single-plane</em>, “{@code _422}” image format, all members of {@code imageOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed image, or a <em>single-plane</em>, “{@code _422}” image format, {@code bufferOffset} <b>must</b> be a multiple of the compressed texel block size in bytes</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed image, or a <em>single-plane</em>, “{@code _422}” image format, {@code imageExtent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(imageExtent.width imageOffset.x)</code> <b>must</b> equal the image subresource width</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed image, or a <em>single-plane</em>, “{@code _422}” image format, {@code imageExtent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(imageExtent.height imageOffset.y)</code> <b>must</b> equal the image subresource height</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is a compressed image, or a <em>single-plane</em>, “{@code _422}” image format, {@code imageExtent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(imageExtent.depth imageOffset.z)</code> <b>must</b> equal the image subresource depth</li>
 * <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> specify aspects present in the calling command&#8217;s {@code VkImage} parameter</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter&#8217;s format is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then the {@code aspectMask} member of {@code imageSubresource} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT} (with {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT} valid only for image formats with three planes)</li>
 * <li>The {@code aspectMask} member of {@code imageSubresource} <b>must</b> only have a single bit set</li>
 * <li>If the calling command&#8217;s {@code VkImage} parameter is of {@code VkImageType} {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, the {@code baseArrayLayer} and {@code layerCount} members of {@code imageSubresource} <b>must</b> be 0 and 1, respectively</li>
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
 * <p>{@link VkExtent3D}, {@link VkImageSubresourceLayers}, {@link VkOffset3D}, {@link VK10#vkCmdCopyBufferToImage CmdCopyBufferToImage}, {@link VK10#vkCmdCopyImageToBuffer CmdCopyImageToBuffer}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code bufferOffset} &ndash; the offset in bytes from the start of the buffer object where the image data is copied from or to.</li>
 * <li>{@code bufferRowLength} &ndash; {@code bufferRowLength} and {@code bufferImageHeight} specify in texels a subregion of a larger two- or three-dimensional image in buffer memory, and control the addressing calculations. If either of these values is zero, that aspect of the buffer memory is considered to be tightly packed according to the {@code imageExtent}.</li>
 * <li>{@code bufferImageHeight} &ndash; see {@code bufferRowLength}</li>
 * <li>{@code imageSubresource} &ndash; a {@link VkImageSubresourceLayers} used to specify the specific image subresources of the image used for the source or destination image data.</li>
 * <li>{@code imageOffset} &ndash; selects the initial {@code x}, {@code y}, {@code z} offsets in texels of the sub-region of the source or destination image data.</li>
 * <li>{@code imageExtent} &ndash; the size in texels of the image to copy in {@code width}, {@code height} and {@code depth}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferImageCopy {
 *     VkDeviceSize bufferOffset;
 *     uint32_t bufferRowLength;
 *     uint32_t bufferImageHeight;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} imageSubresource;
 *     {@link VkOffset3D VkOffset3D} imageOffset;
 *     {@link VkExtent3D VkExtent3D} imageExtent;
 * }</code></pre>
 */
public class VkBufferImageCopy extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFEROFFSET,
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

        BUFFEROFFSET = layout.offsetof(0);
        BUFFERROWLENGTH = layout.offsetof(1);
        BUFFERIMAGEHEIGHT = layout.offsetof(2);
        IMAGESUBRESOURCE = layout.offsetof(3);
        IMAGEOFFSET = layout.offsetof(4);
        IMAGEEXTENT = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkBufferImageCopy} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferImageCopy(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code bufferOffset} field. */
    @NativeType("VkDeviceSize")
    public long bufferOffset() { return nbufferOffset(address()); }
    /** Returns the value of the {@code bufferRowLength} field. */
    @NativeType("uint32_t")
    public int bufferRowLength() { return nbufferRowLength(address()); }
    /** Returns the value of the {@code bufferImageHeight} field. */
    @NativeType("uint32_t")
    public int bufferImageHeight() { return nbufferImageHeight(address()); }
    /** Returns a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
    public VkImageSubresourceLayers imageSubresource() { return nimageSubresource(address()); }
    /** Returns a {@link VkOffset3D} view of the {@code imageOffset} field. */
    public VkOffset3D imageOffset() { return nimageOffset(address()); }
    /** Returns a {@link VkExtent3D} view of the {@code imageExtent} field. */
    public VkExtent3D imageExtent() { return nimageExtent(address()); }

    /** Sets the specified value to the {@code bufferOffset} field. */
    public VkBufferImageCopy bufferOffset(@NativeType("VkDeviceSize") long value) { nbufferOffset(address(), value); return this; }
    /** Sets the specified value to the {@code bufferRowLength} field. */
    public VkBufferImageCopy bufferRowLength(@NativeType("uint32_t") int value) { nbufferRowLength(address(), value); return this; }
    /** Sets the specified value to the {@code bufferImageHeight} field. */
    public VkBufferImageCopy bufferImageHeight(@NativeType("uint32_t") int value) { nbufferImageHeight(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
    public VkBufferImageCopy imageSubresource(VkImageSubresourceLayers value) { nimageSubresource(address(), value); return this; }
    /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
    public VkBufferImageCopy imageOffset(VkOffset3D value) { nimageOffset(address(), value); return this; }
    /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
    public VkBufferImageCopy imageExtent(VkExtent3D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkBufferImageCopy imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferImageCopy set(
        long bufferOffset,
        int bufferRowLength,
        int bufferImageHeight,
        VkImageSubresourceLayers imageSubresource,
        VkOffset3D imageOffset,
        VkExtent3D imageExtent
    ) {
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
    public VkBufferImageCopy set(VkBufferImageCopy src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferImageCopy} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy malloc() {
        return wrap(VkBufferImageCopy.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBufferImageCopy} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferImageCopy calloc() {
        return wrap(VkBufferImageCopy.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBufferImageCopy} instance allocated with {@link BufferUtils}. */
    public static VkBufferImageCopy create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBufferImageCopy.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBufferImageCopy} instance for the specified memory address. */
    public static VkBufferImageCopy create(long address) {
        return wrap(VkBufferImageCopy.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferImageCopy createSafe(long address) {
        return address == NULL ? null : wrap(VkBufferImageCopy.class, address);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBufferImageCopy.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferImageCopy.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBufferImageCopy} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBufferImageCopy mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBufferImageCopy} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBufferImageCopy callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBufferImageCopy} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy mallocStack(MemoryStack stack) {
        return wrap(VkBufferImageCopy.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBufferImageCopy} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferImageCopy callocStack(MemoryStack stack) {
        return wrap(VkBufferImageCopy.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferImageCopy.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferImageCopy.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferOffset}. */
    public static long nbufferOffset(long struct) { return UNSAFE.getLong(null, struct + VkBufferImageCopy.BUFFEROFFSET); }
    /** Unsafe version of {@link #bufferRowLength}. */
    public static int nbufferRowLength(long struct) { return UNSAFE.getInt(null, struct + VkBufferImageCopy.BUFFERROWLENGTH); }
    /** Unsafe version of {@link #bufferImageHeight}. */
    public static int nbufferImageHeight(long struct) { return UNSAFE.getInt(null, struct + VkBufferImageCopy.BUFFERIMAGEHEIGHT); }
    /** Unsafe version of {@link #imageSubresource}. */
    public static VkImageSubresourceLayers nimageSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkBufferImageCopy.IMAGESUBRESOURCE); }
    /** Unsafe version of {@link #imageOffset}. */
    public static VkOffset3D nimageOffset(long struct) { return VkOffset3D.create(struct + VkBufferImageCopy.IMAGEOFFSET); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent3D nimageExtent(long struct) { return VkExtent3D.create(struct + VkBufferImageCopy.IMAGEEXTENT); }

    /** Unsafe version of {@link #bufferOffset(long) bufferOffset}. */
    public static void nbufferOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBufferImageCopy.BUFFEROFFSET, value); }
    /** Unsafe version of {@link #bufferRowLength(int) bufferRowLength}. */
    public static void nbufferRowLength(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferImageCopy.BUFFERROWLENGTH, value); }
    /** Unsafe version of {@link #bufferImageHeight(int) bufferImageHeight}. */
    public static void nbufferImageHeight(long struct, int value) { UNSAFE.putInt(null, struct + VkBufferImageCopy.BUFFERIMAGEHEIGHT, value); }
    /** Unsafe version of {@link #imageSubresource(VkImageSubresourceLayers) imageSubresource}. */
    public static void nimageSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGESUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #imageOffset(VkOffset3D) imageOffset}. */
    public static void nimageOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGEOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #imageExtent(VkExtent3D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkBufferImageCopy.IMAGEEXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkBufferImageCopy} structs. */
    public static class Buffer extends StructBuffer<VkBufferImageCopy, Buffer> implements NativeResource {

        private static final VkBufferImageCopy ELEMENT_FACTORY = VkBufferImageCopy.create(-1L);

        /**
         * Creates a new {@code VkBufferImageCopy.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferImageCopy#SIZEOF}, and its mark will be undefined.
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
        protected VkBufferImageCopy getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code bufferOffset} field. */
        @NativeType("VkDeviceSize")
        public long bufferOffset() { return VkBufferImageCopy.nbufferOffset(address()); }
        /** Returns the value of the {@code bufferRowLength} field. */
        @NativeType("uint32_t")
        public int bufferRowLength() { return VkBufferImageCopy.nbufferRowLength(address()); }
        /** Returns the value of the {@code bufferImageHeight} field. */
        @NativeType("uint32_t")
        public int bufferImageHeight() { return VkBufferImageCopy.nbufferImageHeight(address()); }
        /** Returns a {@link VkImageSubresourceLayers} view of the {@code imageSubresource} field. */
        public VkImageSubresourceLayers imageSubresource() { return VkBufferImageCopy.nimageSubresource(address()); }
        /** Returns a {@link VkOffset3D} view of the {@code imageOffset} field. */
        public VkOffset3D imageOffset() { return VkBufferImageCopy.nimageOffset(address()); }
        /** Returns a {@link VkExtent3D} view of the {@code imageExtent} field. */
        public VkExtent3D imageExtent() { return VkBufferImageCopy.nimageExtent(address()); }

        /** Sets the specified value to the {@code bufferOffset} field. */
        public VkBufferImageCopy.Buffer bufferOffset(@NativeType("VkDeviceSize") long value) { VkBufferImageCopy.nbufferOffset(address(), value); return this; }
        /** Sets the specified value to the {@code bufferRowLength} field. */
        public VkBufferImageCopy.Buffer bufferRowLength(@NativeType("uint32_t") int value) { VkBufferImageCopy.nbufferRowLength(address(), value); return this; }
        /** Sets the specified value to the {@code bufferImageHeight} field. */
        public VkBufferImageCopy.Buffer bufferImageHeight(@NativeType("uint32_t") int value) { VkBufferImageCopy.nbufferImageHeight(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code imageSubresource} field. */
        public VkBufferImageCopy.Buffer imageSubresource(VkImageSubresourceLayers value) { VkBufferImageCopy.nimageSubresource(address(), value); return this; }
        /** Passes the {@code imageSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy.Buffer imageSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(imageSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code imageOffset} field. */
        public VkBufferImageCopy.Buffer imageOffset(VkOffset3D value) { VkBufferImageCopy.nimageOffset(address(), value); return this; }
        /** Passes the {@code imageOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy.Buffer imageOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(imageOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code imageExtent} field. */
        public VkBufferImageCopy.Buffer imageExtent(VkExtent3D value) { VkBufferImageCopy.nimageExtent(address(), value); return this; }
        /** Passes the {@code imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkBufferImageCopy.Buffer imageExtent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(imageExtent()); return this; }

    }

}