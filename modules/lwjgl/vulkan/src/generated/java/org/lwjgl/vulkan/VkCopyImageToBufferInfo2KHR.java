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
 * Structure specifying parameters of an image to buffer copy command.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the image region specified by each element of {@code pRegions} does not contain {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, it <b>must</b> be contained within the specified {@code imageSubresource} of {@code srcImage}</li>
 * <li>If the image region specified by each element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, the rotated source region as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#copies-buffers-images-rotation-addressing">Buffer and Image Addressing with Rotation</a> <b>must</b> be contained within {@code srcImage}</li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code srcImage} <b>must</b> not be a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a></li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code srcImage} <b>must</b> be of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code srcImage} <b>must</b> not have a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
 * </ul>
 * 
 * <ul>
 * <li>{@code dstBuffer} <b>must</b> be large enough to contain all buffer locations that are accessed according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * <li>{@code srcImage} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link VK11#VK_FORMAT_FEATURE_TRANSFER_SRC_BIT FORMAT_FEATURE_TRANSFER_SRC_BIT}</li>
 * <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code dstBuffer} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_TRANSFER_DST_BIT BUFFER_USAGE_TRANSFER_DST_BIT} usage flag</li>
 * <li>If {@code dstBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code srcImage} <b>must</b> have a sample count equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code srcImageLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}, or {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}</li>
 * <li>The {@code imageSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The <code>imageSubresource.baseArrayLayer + imageSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The {@code imageOffset} and {@code imageExtent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}’s command pool’s queue family, as described in {@link VkQueueFamilyProperties}</li>
 * <li>{@code srcImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * <li>For each element of {@code pRegions} not containing {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, {@code imageOffset.x} and <code>(imageExtent.width + imageOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code imageSubresource} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions} not containing {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, {@code imageOffset.y} and <code>(imageExtent.height + imageOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code imageSubresource} of {@code srcImage}</li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code srcImage} does not have either a depth/stencil or a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the format’s texel block size</li>
 * <li>If {@code srcImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the element size of the compatible format for the format and the {@code aspectMask} of the {@code imageSubresource} as defined in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a></li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code imageOffset.y} <b>must</b> be 0 and {@code imageExtent.height} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code imageOffset.z} and <code>(imageExtent.depth + imageOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code imageSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code imageOffset.z} <b>must</b> be 0 and {@code imageExtent.depth} <b>must</b> be 1</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} <b>must</b> be a multiple of the compressed texel block width</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferImageHeight} <b>must</b> be a multiple of the compressed texel block height</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, all members of {@code imageOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the compressed texel block size in bytes</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(imageExtent.width + imageOffset.x)</code> <b>must</b> equal the width of the specified {@code imageSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(imageExtent.height + imageOffset.y)</code> <b>must</b> equal the height of the specified {@code imageSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code imageExtent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(imageExtent.depth + imageOffset.z)</code> <b>must</b> equal the depth of the specified {@code imageSubresource} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> specify aspects present in {@code srcImage}</li>
 * <li>If {@code srcImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT} (with {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT} valid only for image formats with three planes)</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, for each element of {@code pRegions}, {@code imageSubresource.baseArrayLayer} <b>must</b> be 0 and {@code imageSubresource.layerCount} <b>must</b> be 1</li>
 * <li>If {@code srcImage} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} multiplied by the texel block size of {@code srcImage} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, for each element of {@code pRegions}, {@code bufferRowLength} divided by the compressed texel block width and then multiplied by the texel block size of {@code srcImage} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
 * <li>If the queue family used to create the {@code VkCommandPool} which {@code commandBuffer} was allocated from does not support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}, the {@code bufferOffset} member of any element of {@code pRegions} <b>must</b> be a multiple of 4</li>
 * <li>If {@code srcImage} has a depth/stencil format, the {@code bufferOffset} member of any element of {@code pRegions} <b>must</b> be a multiple of 4</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code dstBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy2KHR} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstBuffer}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBufferImageCopy2KHR}, {@link KHRCopyCommands2#vkCmdCopyImageToBuffer2KHR CmdCopyImageToBuffer2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyImageToBufferInfo2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #srcImage};
 *     VkImageLayout {@link #srcImageLayout};
 *     VkBuffer {@link #dstBuffer};
 *     uint32_t {@link #regionCount};
 *     {@link VkBufferImageCopy2KHR VkBufferImageCopy2KHR} const * {@link #pRegions};
 * }</code></pre>
 */
public class VkCopyImageToBufferInfo2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCIMAGE,
        SRCIMAGELAYOUT,
        DSTBUFFER,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTBUFFER = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkCopyImageToBufferInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageToBufferInfo2KHR(ByteBuffer container) {
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
    /** the source image. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** the layout of the source image subresources for the copy. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** the destination buffer. */
    @NativeType("VkBuffer")
    public long dstBuffer() { return ndstBuffer(address()); }
    /** the number of regions to copy. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkBufferImageCopy2KHR} structures specifying the regions to copy. */
    @NativeType("VkBufferImageCopy2KHR const *")
    public VkBufferImageCopy2KHR.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyImageToBufferInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR} value to the {@link #sType} field. */
    public VkCopyImageToBufferInfo2KHR sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyImageToBufferInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImage} field. */
    public VkCopyImageToBufferInfo2KHR srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImageLayout} field. */
    public VkCopyImageToBufferInfo2KHR srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #dstBuffer} field. */
    public VkCopyImageToBufferInfo2KHR dstBuffer(@NativeType("VkBuffer") long value) { ndstBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferImageCopy2KHR.Buffer} to the {@link #pRegions} field. */
    public VkCopyImageToBufferInfo2KHR pRegions(@NativeType("VkBufferImageCopy2KHR const *") VkBufferImageCopy2KHR.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyImageToBufferInfo2KHR set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstBuffer,
        VkBufferImageCopy2KHR.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstBuffer(dstBuffer);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyImageToBufferInfo2KHR set(VkCopyImageToBufferInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageToBufferInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageToBufferInfo2KHR malloc() {
        return wrap(VkCopyImageToBufferInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyImageToBufferInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageToBufferInfo2KHR calloc() {
        return wrap(VkCopyImageToBufferInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyImageToBufferInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageToBufferInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyImageToBufferInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageToBufferInfo2KHR} instance for the specified memory address. */
    public static VkCopyImageToBufferInfo2KHR create(long address) {
        return wrap(VkCopyImageToBufferInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyImageToBufferInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyImageToBufferInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyImageToBufferInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyImageToBufferInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageToBufferInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToBufferInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkCopyImageToBufferInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyImageToBufferInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToBufferInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkCopyImageToBufferInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToBufferInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToBufferInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageToBufferInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyImageToBufferInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return UNSAFE.getLong(null, struct + VkCopyImageToBufferInfo2KHR.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageToBufferInfo2KHR.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstBuffer}. */
    public static long ndstBuffer(long struct) { return UNSAFE.getLong(null, struct + VkCopyImageToBufferInfo2KHR.DSTBUFFER); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageToBufferInfo2KHR.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkBufferImageCopy2KHR.Buffer npRegions(long struct) { return VkBufferImageCopy2KHR.create(memGetAddress(struct + VkCopyImageToBufferInfo2KHR.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageToBufferInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyImageToBufferInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyImageToBufferInfo2KHR.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageToBufferInfo2KHR.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstBuffer(long) dstBuffer}. */
    public static void ndstBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyImageToBufferInfo2KHR.DSTBUFFER, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageToBufferInfo2KHR.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkBufferImageCopy2KHR.Buffer) pRegions}. */
    public static void npRegions(long struct, VkBufferImageCopy2KHR.Buffer value) { memPutAddress(struct + VkCopyImageToBufferInfo2KHR.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyImageToBufferInfo2KHR.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageToBufferInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyImageToBufferInfo2KHR, Buffer> implements NativeResource {

        private static final VkCopyImageToBufferInfo2KHR ELEMENT_FACTORY = VkCopyImageToBufferInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkCopyImageToBufferInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageToBufferInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyImageToBufferInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyImageToBufferInfo2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyImageToBufferInfo2KHR.nsType(address()); }
        /** @return the value of the {@link VkCopyImageToBufferInfo2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyImageToBufferInfo2KHR.npNext(address()); }
        /** @return the value of the {@link VkCopyImageToBufferInfo2KHR#srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkCopyImageToBufferInfo2KHR.nsrcImage(address()); }
        /** @return the value of the {@link VkCopyImageToBufferInfo2KHR#srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkCopyImageToBufferInfo2KHR.nsrcImageLayout(address()); }
        /** @return the value of the {@link VkCopyImageToBufferInfo2KHR#dstBuffer} field. */
        @NativeType("VkBuffer")
        public long dstBuffer() { return VkCopyImageToBufferInfo2KHR.ndstBuffer(address()); }
        /** @return the value of the {@link VkCopyImageToBufferInfo2KHR#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyImageToBufferInfo2KHR.nregionCount(address()); }
        /** @return a {@link VkBufferImageCopy2KHR.Buffer} view of the struct array pointed to by the {@link VkCopyImageToBufferInfo2KHR#pRegions} field. */
        @NativeType("VkBufferImageCopy2KHR const *")
        public VkBufferImageCopy2KHR.Buffer pRegions() { return VkCopyImageToBufferInfo2KHR.npRegions(address()); }

        /** Sets the specified value to the {@link VkCopyImageToBufferInfo2KHR#sType} field. */
        public VkCopyImageToBufferInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageToBufferInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR} value to the {@link VkCopyImageToBufferInfo2KHR#sType} field. */
        public VkCopyImageToBufferInfo2KHR.Buffer sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_BUFFER_INFO_2_KHR); }
        /** Sets the specified value to the {@link VkCopyImageToBufferInfo2KHR#pNext} field. */
        public VkCopyImageToBufferInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageToBufferInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageToBufferInfo2KHR#srcImage} field. */
        public VkCopyImageToBufferInfo2KHR.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageToBufferInfo2KHR.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageToBufferInfo2KHR#srcImageLayout} field. */
        public VkCopyImageToBufferInfo2KHR.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToBufferInfo2KHR.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageToBufferInfo2KHR#dstBuffer} field. */
        public VkCopyImageToBufferInfo2KHR.Buffer dstBuffer(@NativeType("VkBuffer") long value) { VkCopyImageToBufferInfo2KHR.ndstBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferImageCopy2KHR.Buffer} to the {@link VkCopyImageToBufferInfo2KHR#pRegions} field. */
        public VkCopyImageToBufferInfo2KHR.Buffer pRegions(@NativeType("VkBufferImageCopy2KHR const *") VkBufferImageCopy2KHR.Buffer value) { VkCopyImageToBufferInfo2KHR.npRegions(address(), value); return this; }

    }

}