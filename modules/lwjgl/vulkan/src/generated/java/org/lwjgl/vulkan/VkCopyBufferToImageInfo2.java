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
 * Structure specifying parameters of a buffer to image copy command.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the image region specified by each element of {@code pRegions} does not contain {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, it <b>must</b> be a region that is contained within the specified {@code imageSubresource} of {@code dstImage}</li>
 * <li>If the image region specified by each element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, the rotated destination region as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#copies-buffers-images-rotation-addressing">Buffer and Image Addressing with Rotation</a> <b>must</b> be contained within {@code dstImage}</li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code dstImage} <b>must</b> have a 1x1x1 <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent</a></li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code dstImage} <b>must</b> be of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code dstImage} <b>must</b> not have a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
 * </ul>
 * 
 * <ul>
 * <li>{@code srcBuffer} <b>must</b> be large enough to contain all buffer locations that are accessed according to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#copies-buffers-images-addressing">Buffer and Image Addressing</a>, for each element of {@code pRegions}</li>
 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * <li>{@code srcBuffer} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_TRANSFER_SRC_BIT BUFFER_USAGE_TRANSFER_SRC_BIT} usage flag</li>
 * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain {@link VK11#VK_FORMAT_FEATURE_TRANSFER_DST_BIT FORMAT_FEATURE_TRANSFER_DST_BIT}</li>
 * <li>If {@code srcBuffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code dstImage} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code dstImageLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}, or {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}</li>
 * <li>If {@link EXTDepthRangeUnrestricted VK_EXT_depth_range_unrestricted} is not enabled, for each element of {@code pRegions} whose {@code imageSubresource} contains a depth aspect, the data in {@code srcBuffer} <b>must</b> be in the range <code>[0,1]</code></li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code dstImage} is non-sparse then the image or the specified <em>disjoint</em> plane <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>The {@code imageSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>The <code>{@code imageSubresource.baseArrayLayer} + {@code imageSubresource.layerCount}</code> of each element of {@code pRegions} , if {@code imageSubresource.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS} and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance5">{@code maintenance5}</a> is not enabled, <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>{@code dstImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code imageOffset.y} <b>must</b> be 0 and {@code imageExtent.height} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code imageOffset.z} and <code>({@code imageExtent.depth} + {@code imageOffset.z})</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code imageSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code imageOffset.z} <b>must</b> be 0 and {@code imageExtent.depth} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code imageOffset.x} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code imageOffset.y} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code imageOffset.z} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code imageOffset.x} and {@code extent.width} does not equal the width of the subresource specified by {@code srcSubresource}, {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code imageOffset.y} and {@code extent.height} does not equal the height of the subresource specified by {@code srcSubresource}, {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code imageOffset.z} and {@code extent.depth} does not equal the depth of the subresource specified by {@code srcSubresource}, {@code extent.depth} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
 * <li>If {@code dstImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then for each element of {@code pRegions}, {@code imageSubresource.aspectMask} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, for each element of {@code pRegions}, {@code imageSubresource.baseArrayLayer} <b>must</b> be 0 and {@code imageSubresource.layerCount} <b>must</b> be 1</li>
 * </ul>
 * 
 * <ul>
 * <li>For each element of {@code pRegions}, {@code bufferRowLength} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code bufferImageHeight} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code bufferRowLength} divided by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> and then multiplied by the texel block size of {@code dstImage} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code dstImage} does not have either a depth/stencil or a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block size</a></li>
 * <li>If {@code dstImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a>, then for each element of {@code pRegions}, {@code bufferOffset} <b>must</b> be a multiple of the element size of the compatible format for the format and the {@code aspectMask} of the {@code imageSubresource} as defined in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatible-planes">Compatible formats of planes of multi-planar formats</a></li>
 * <li>If {@code dstImage} has a depth/stencil format, the {@code bufferOffset} member of any element of {@code pRegions} <b>must</b> be a multiple of 4</li>
 * <li>For each element of {@code pRegions} not containing {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, {@code imageOffset.x} and <code>(imageExtent.width + imageOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code imageSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions} not containing {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, {@code imageOffset.y} and <code>(imageExtent.height + imageOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code imageSubresource} of {@code dstImage}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcBuffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkBufferImageCopy2} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstImage}, and {@code srcBuffer} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkBufferImageCopy2}, {@link VK13#vkCmdCopyBufferToImage2 CmdCopyBufferToImage2}, {@link KHRCopyCommands2#vkCmdCopyBufferToImage2KHR CmdCopyBufferToImage2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyBufferToImageInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBuffer {@link #srcBuffer};
 *     VkImage {@link #dstImage};
 *     VkImageLayout {@link #dstImageLayout};
 *     uint32_t {@link #regionCount};
 *     {@link VkBufferImageCopy2 VkBufferImageCopy2} const * {@link #pRegions};
 * }</code></pre>
 */
public class VkCopyBufferToImageInfo2 extends Struct<VkCopyBufferToImageInfo2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCBUFFER,
        DSTIMAGE,
        DSTIMAGELAYOUT,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCBUFFER = layout.offsetof(2);
        DSTIMAGE = layout.offsetof(3);
        DSTIMAGELAYOUT = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyBufferToImageInfo2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyBufferToImageInfo2 create(long address, @Nullable ByteBuffer container) {
        return new VkCopyBufferToImageInfo2(address, container);
    }

    /**
     * Creates a {@code VkCopyBufferToImageInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyBufferToImageInfo2(ByteBuffer container) {
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
    /** the source buffer. */
    @NativeType("VkBuffer")
    public long srcBuffer() { return nsrcBuffer(address()); }
    /** the destination image. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** the layout of the destination image subresources for the copy. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** the number of regions to copy. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkBufferImageCopy2} structures specifying the regions to copy. */
    @NativeType("VkBufferImageCopy2 const *")
    public VkBufferImageCopy2.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyBufferToImageInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2} value to the {@link #sType} field. */
    public VkCopyBufferToImageInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyBufferToImageInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcBuffer} field. */
    public VkCopyBufferToImageInfo2 srcBuffer(@NativeType("VkBuffer") long value) { nsrcBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImage} field. */
    public VkCopyBufferToImageInfo2 dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImageLayout} field. */
    public VkCopyBufferToImageInfo2 dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferImageCopy2.Buffer} to the {@link #pRegions} field. */
    public VkCopyBufferToImageInfo2 pRegions(@NativeType("VkBufferImageCopy2 const *") VkBufferImageCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyBufferToImageInfo2 set(
        int sType,
        long pNext,
        long srcBuffer,
        long dstImage,
        int dstImageLayout,
        VkBufferImageCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcBuffer(srcBuffer);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
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
    public VkCopyBufferToImageInfo2 set(VkCopyBufferToImageInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyBufferToImageInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyBufferToImageInfo2 malloc() {
        return new VkCopyBufferToImageInfo2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferToImageInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyBufferToImageInfo2 calloc() {
        return new VkCopyBufferToImageInfo2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferToImageInfo2} instance allocated with {@link BufferUtils}. */
    public static VkCopyBufferToImageInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyBufferToImageInfo2(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyBufferToImageInfo2} instance for the specified memory address. */
    public static VkCopyBufferToImageInfo2 create(long address) {
        return new VkCopyBufferToImageInfo2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyBufferToImageInfo2 createSafe(long address) {
        return address == NULL ? null : new VkCopyBufferToImageInfo2(address, null);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyBufferToImageInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyBufferToImageInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyBufferToImageInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferToImageInfo2 malloc(MemoryStack stack) {
        return new VkCopyBufferToImageInfo2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyBufferToImageInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferToImageInfo2 calloc(MemoryStack stack) {
        return new VkCopyBufferToImageInfo2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferToImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferToImageInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyBufferToImageInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyBufferToImageInfo2.PNEXT); }
    /** Unsafe version of {@link #srcBuffer}. */
    public static long nsrcBuffer(long struct) { return UNSAFE.getLong(null, struct + VkCopyBufferToImageInfo2.SRCBUFFER); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return UNSAFE.getLong(null, struct + VkCopyBufferToImageInfo2.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkCopyBufferToImageInfo2.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkCopyBufferToImageInfo2.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkBufferImageCopy2.Buffer npRegions(long struct) { return VkBufferImageCopy2.create(memGetAddress(struct + VkCopyBufferToImageInfo2.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyBufferToImageInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyBufferToImageInfo2.PNEXT, value); }
    /** Unsafe version of {@link #srcBuffer(long) srcBuffer}. */
    public static void nsrcBuffer(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyBufferToImageInfo2.SRCBUFFER, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyBufferToImageInfo2.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyBufferToImageInfo2.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyBufferToImageInfo2.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkBufferImageCopy2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkBufferImageCopy2.Buffer value) { memPutAddress(struct + VkCopyBufferToImageInfo2.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyBufferToImageInfo2.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkCopyBufferToImageInfo2} structs. */
    public static class Buffer extends StructBuffer<VkCopyBufferToImageInfo2, Buffer> implements NativeResource {

        private static final VkCopyBufferToImageInfo2 ELEMENT_FACTORY = VkCopyBufferToImageInfo2.create(-1L);

        /**
         * Creates a new {@code VkCopyBufferToImageInfo2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyBufferToImageInfo2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyBufferToImageInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyBufferToImageInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyBufferToImageInfo2.nsType(address()); }
        /** @return the value of the {@link VkCopyBufferToImageInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyBufferToImageInfo2.npNext(address()); }
        /** @return the value of the {@link VkCopyBufferToImageInfo2#srcBuffer} field. */
        @NativeType("VkBuffer")
        public long srcBuffer() { return VkCopyBufferToImageInfo2.nsrcBuffer(address()); }
        /** @return the value of the {@link VkCopyBufferToImageInfo2#dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkCopyBufferToImageInfo2.ndstImage(address()); }
        /** @return the value of the {@link VkCopyBufferToImageInfo2#dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkCopyBufferToImageInfo2.ndstImageLayout(address()); }
        /** @return the value of the {@link VkCopyBufferToImageInfo2#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyBufferToImageInfo2.nregionCount(address()); }
        /** @return a {@link VkBufferImageCopy2.Buffer} view of the struct array pointed to by the {@link VkCopyBufferToImageInfo2#pRegions} field. */
        @NativeType("VkBufferImageCopy2 const *")
        public VkBufferImageCopy2.Buffer pRegions() { return VkCopyBufferToImageInfo2.npRegions(address()); }

        /** Sets the specified value to the {@link VkCopyBufferToImageInfo2#sType} field. */
        public VkCopyBufferToImageInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyBufferToImageInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2} value to the {@link VkCopyBufferToImageInfo2#sType} field. */
        public VkCopyBufferToImageInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_TO_IMAGE_INFO_2); }
        /** Sets the specified value to the {@link VkCopyBufferToImageInfo2#pNext} field. */
        public VkCopyBufferToImageInfo2.Buffer pNext(@NativeType("void const *") long value) { VkCopyBufferToImageInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyBufferToImageInfo2#srcBuffer} field. */
        public VkCopyBufferToImageInfo2.Buffer srcBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferToImageInfo2.nsrcBuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyBufferToImageInfo2#dstImage} field. */
        public VkCopyBufferToImageInfo2.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyBufferToImageInfo2.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyBufferToImageInfo2#dstImageLayout} field. */
        public VkCopyBufferToImageInfo2.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyBufferToImageInfo2.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferImageCopy2.Buffer} to the {@link VkCopyBufferToImageInfo2#pRegions} field. */
        public VkCopyBufferToImageInfo2.Buffer pRegions(@NativeType("VkBufferImageCopy2 const *") VkBufferImageCopy2.Buffer value) { VkCopyBufferToImageInfo2.npRegions(address(), value); return this; }

    }

}