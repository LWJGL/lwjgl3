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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of host memory to image copy command.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code vkCopyMemoryToImage} does not check whether the device memory associated with {@code dstImage} is currently in use before performing the copy. The application <b>must</b> guarantee that any previously submitted command that reads from or writes to the copy regions has completed before the host performs the copy.</p>
 * 
 * <p>Copy regions for the image <b>must</b> be aligned to a multiple of the texel block extent in each dimension, except at the edges of the image, where region extents <b>must</b> match the edge of the image.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code dstImage} is sparse then all memory ranges accessed by the copy command <b>must</b> be bound as described in <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#sparsememory-resource-binding">Binding Resource Memory</a></li>
 * <li>If the stencil aspect of {@code dstImage} is accessed, and {@code dstImage} was not created with <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, {@code dstImage} <b>must</b> have been created with {@link VK14#VK_IMAGE_USAGE_HOST_TRANSFER_BIT IMAGE_USAGE_HOST_TRANSFER_BIT} set in {@link VkImageCreateInfo}{@code ::usage}</li>
 * <li>If the stencil aspect of {@code dstImage} is accessed, and {@code dstImage} was created with <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, {@code dstImage} <b>must</b> have been created with {@link VK14#VK_IMAGE_USAGE_HOST_TRANSFER_BIT IMAGE_USAGE_HOST_TRANSFER_BIT} set in {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage}</li>
 * <li>If non-stencil aspects of {@code dstImage} are accessed, {@code dstImage} <b>must</b> have been created with {@link VK14#VK_IMAGE_USAGE_HOST_TRANSFER_BIT IMAGE_USAGE_HOST_TRANSFER_BIT} set in {@link VkImageCreateInfo}{@code ::usage}</li>
 * <li>If {@code flags} contains {@link VK14#VK_HOST_IMAGE_COPY_MEMCPY HOST_IMAGE_COPY_MEMCPY}, the {@code x}, {@code y}, and {@code z} members of the {@code dstOffset} member of each element of {@code pRegions} <b>must</b> be 0</li>
 * <li>If {@code flags} contains {@link VK14#VK_HOST_IMAGE_COPY_MEMCPY HOST_IMAGE_COPY_MEMCPY}, the {@code extent} member of each element of {@code pRegions} <b>must</b> equal the extents of {@code dstImage} identified by {@code dstSubresource}</li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code dstImage} is non-sparse then the image or the specified <em>disjoint</em> plane <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>If {@code dstSubresource.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, <code>{@code dstSubresource.baseArrayLayer} + {@code dstSubresource.layerCount}</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>{@code dstImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * </ul>
 * 
 * <ul>
 * <li>The image region specified by each element of {@code pRegions} <b>must</b> be contained within the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.x} and <code>({@code extent.width} + {@code dstOffset.x})</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.y} and <code>({@code extent.height} + {@code dstOffset.y})</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
 * </ul>
 * 
 * <ul>
 * <li>{@code dstImage} <b>must</b> have a sample count equal to {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.z} and <code>({@code extent.depth} + {@code dstOffset.z})</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR} or {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}, {@code dstOffset.x} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR} or {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}, and {@code dstOffset.x} does not equal the width of the subresource specified by {@code dstSubresource}, {@code dstOffset.x} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR} or {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}, {@code dstOffset.y} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR} or {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR}, and {@code dstOffset.y} does not equal the height of the subresource specified by {@code dstSubresource}, {@code dstOffset.y} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}, the sum of {@code dstOffset.x} and {@code extent.width} does not equal the width of the subresource specified by {@code dstSubresource}, {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}, the difference of {@code dstOffset.x} and {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR}, the difference of {@code dstOffset.x} and {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}, the sum of {@code dstOffset.x} and {@code extent.height} does not equal the width of the subresource specified by {@code dstSubresource}, {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR SURFACE_TRANSFORM_IDENTITY_BIT_KHR}, and the sum of {@code dstOffset.y} and {@code extent.height} does not equal the height of the subresource specified by {@code dstSubresource}, {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR SURFACE_TRANSFORM_ROTATE_90_BIT_KHR}, the sum of {@code dstOffset.y} and {@code extent.width} does not equal the height of the subresource specified by {@code dstSubresource}, {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR SURFACE_TRANSFORM_ROTATE_180_BIT_KHR}, the difference of {@code dstOffset.y} and {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if {@link VkCopyCommandTransformInfoQCOM}{@code ::transform} is equal to {@link KHRSurface#VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR SURFACE_TRANSFORM_ROTATE_270_BIT_KHR}, the difference of {@code dstOffset.y} and {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code dstOffset.z} and {@code extent.depth} does not equal the depth of the subresource specified by {@code srcSubresource}, {@code extent.depth} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
 * <li>If {@code dstImage} has a <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, for each element of {@code pRegions}, {@code dstSubresource.baseArrayLayer} <b>must</b> be 0 and {@code dstSubresource.layerCount} <b>must</b> be 1</li>
 * </ul>
 * 
 * <ul>
 * <li>For each element of {@code pRegions}, {@code bufferRowLength} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code bufferImageHeight} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code bufferRowLength} divided by the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> and then multiplied by the texel block size of {@code dstImage} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
 * <li>{@code dstImageLayout} <b>must</b> specify the current layout of the image subresources of {@code dstImage} specified in {@code pRegions}</li>
 * <li>{@code dstImageLayout} <b>must</b> be one of the image layouts returned in {@link VkPhysicalDeviceHostImageCopyProperties}{@code ::pCopyDstLayouts}</li>
 * <li>If {@code flags} includes {@link VK14#VK_HOST_IMAGE_COPY_MEMCPY HOST_IMAGE_COPY_MEMCPY}, for each region in {@code pRegions}, {@code memoryRowLength} and {@code memoryImageHeight} <b>must</b> both be 0</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK14#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkHostImageCopyFlagBits} values</li>
 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkMemoryToImageCopy} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMemoryToImageCopy}, {@link VK14#vkCopyMemoryToImage CopyMemoryToImage}, {@link EXTHostImageCopy#vkCopyMemoryToImageEXT CopyMemoryToImageEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyMemoryToImageInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkHostImageCopyFlags {@link #flags};
 *     VkImage {@link #dstImage};
 *     VkImageLayout {@link #dstImageLayout};
 *     uint32_t {@link #regionCount};
 *     {@link VkMemoryToImageCopy VkMemoryToImageCopy} const * {@link #pRegions};
 * }</code></pre>
 */
public class VkCopyMemoryToImageInfo extends Struct<VkCopyMemoryToImageInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DSTIMAGE,
        DSTIMAGELAYOUT,
        REGIONCOUNT,
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DSTIMAGE = layout.offsetof(3);
        DSTIMAGELAYOUT = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyMemoryToImageInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyMemoryToImageInfo create(long address, @Nullable ByteBuffer container) {
        return new VkCopyMemoryToImageInfo(address, container);
    }

    /**
     * Creates a {@code VkCopyMemoryToImageInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyMemoryToImageInfo(ByteBuffer container) {
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
    /** a bitmask of {@code VkHostImageCopyFlagBits} values describing additional copy parameters. */
    @NativeType("VkHostImageCopyFlags")
    public int flags() { return nflags(address()); }
    /** the destination image. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** the layout of the destination image subresources for the copy. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** the number of regions to copy. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkMemoryToImageCopy} structures specifying the regions to copy. */
    @NativeType("VkMemoryToImageCopy const *")
    public VkMemoryToImageCopy.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyMemoryToImageInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO} value to the {@link #sType} field. */
    public VkCopyMemoryToImageInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyMemoryToImageInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkCopyMemoryToImageInfo flags(@NativeType("VkHostImageCopyFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImage} field. */
    public VkCopyMemoryToImageInfo dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImageLayout} field. */
    public VkCopyMemoryToImageInfo dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkMemoryToImageCopy.Buffer} to the {@link #pRegions} field. */
    public VkCopyMemoryToImageInfo pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyMemoryToImageInfo set(
        int sType,
        long pNext,
        int flags,
        long dstImage,
        int dstImageLayout,
        VkMemoryToImageCopy.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
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
    public VkCopyMemoryToImageInfo set(VkCopyMemoryToImageInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageInfo malloc() {
        return new VkCopyMemoryToImageInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyMemoryToImageInfo calloc() {
        return new VkCopyMemoryToImageInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance allocated with {@link BufferUtils}. */
    public static VkCopyMemoryToImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyMemoryToImageInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyMemoryToImageInfo} instance for the specified memory address. */
    public static VkCopyMemoryToImageInfo create(long address) {
        return new VkCopyMemoryToImageInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkCopyMemoryToImageInfo createSafe(long address) {
        return address == NULL ? null : new VkCopyMemoryToImageInfo(address, null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyMemoryToImageInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkCopyMemoryToImageInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageInfo malloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyMemoryToImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyMemoryToImageInfo calloc(MemoryStack stack) {
        return new VkCopyMemoryToImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyMemoryToImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyMemoryToImageInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyMemoryToImageInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.FLAGS); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return memGetLong(struct + VkCopyMemoryToImageInfo.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return memGetInt(struct + VkCopyMemoryToImageInfo.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkMemoryToImageCopy.Buffer npRegions(long struct) { return VkMemoryToImageCopy.create(memGetAddress(struct + VkCopyMemoryToImageInfo.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyMemoryToImageInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.FLAGS, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { memPutLong(struct + VkCopyMemoryToImageInfo.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { memPutInt(struct + VkCopyMemoryToImageInfo.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkMemoryToImageCopy.Buffer) pRegions}. */
    public static void npRegions(long struct, VkMemoryToImageCopy.Buffer value) { memPutAddress(struct + VkCopyMemoryToImageInfo.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int regionCount = nregionCount(struct);
        long pRegions = memGetAddress(struct + VkCopyMemoryToImageInfo.PREGIONS);
        check(pRegions);
        validate(pRegions, regionCount, VkMemoryToImageCopy.SIZEOF, VkMemoryToImageCopy::validate);
    }

    // -----------------------------------

    /** An array of {@link VkCopyMemoryToImageInfo} structs. */
    public static class Buffer extends StructBuffer<VkCopyMemoryToImageInfo, Buffer> implements NativeResource {

        private static final VkCopyMemoryToImageInfo ELEMENT_FACTORY = VkCopyMemoryToImageInfo.create(-1L);

        /**
         * Creates a new {@code VkCopyMemoryToImageInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyMemoryToImageInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyMemoryToImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyMemoryToImageInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyMemoryToImageInfo.nsType(address()); }
        /** @return the value of the {@link VkCopyMemoryToImageInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyMemoryToImageInfo.npNext(address()); }
        /** @return the value of the {@link VkCopyMemoryToImageInfo#flags} field. */
        @NativeType("VkHostImageCopyFlags")
        public int flags() { return VkCopyMemoryToImageInfo.nflags(address()); }
        /** @return the value of the {@link VkCopyMemoryToImageInfo#dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkCopyMemoryToImageInfo.ndstImage(address()); }
        /** @return the value of the {@link VkCopyMemoryToImageInfo#dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkCopyMemoryToImageInfo.ndstImageLayout(address()); }
        /** @return the value of the {@link VkCopyMemoryToImageInfo#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyMemoryToImageInfo.nregionCount(address()); }
        /** @return a {@link VkMemoryToImageCopy.Buffer} view of the struct array pointed to by the {@link VkCopyMemoryToImageInfo#pRegions} field. */
        @NativeType("VkMemoryToImageCopy const *")
        public VkMemoryToImageCopy.Buffer pRegions() { return VkCopyMemoryToImageInfo.npRegions(address()); }

        /** Sets the specified value to the {@link VkCopyMemoryToImageInfo#sType} field. */
        public VkCopyMemoryToImageInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyMemoryToImageInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO} value to the {@link VkCopyMemoryToImageInfo#sType} field. */
        public VkCopyMemoryToImageInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_COPY_MEMORY_TO_IMAGE_INFO); }
        /** Sets the specified value to the {@link VkCopyMemoryToImageInfo#pNext} field. */
        public VkCopyMemoryToImageInfo.Buffer pNext(@NativeType("void const *") long value) { VkCopyMemoryToImageInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToImageInfo#flags} field. */
        public VkCopyMemoryToImageInfo.Buffer flags(@NativeType("VkHostImageCopyFlags") int value) { VkCopyMemoryToImageInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToImageInfo#dstImage} field. */
        public VkCopyMemoryToImageInfo.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyMemoryToImageInfo.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyMemoryToImageInfo#dstImageLayout} field. */
        public VkCopyMemoryToImageInfo.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyMemoryToImageInfo.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkMemoryToImageCopy.Buffer} to the {@link VkCopyMemoryToImageInfo#pRegions} field. */
        public VkCopyMemoryToImageInfo.Buffer pRegions(@NativeType("VkMemoryToImageCopy const *") VkMemoryToImageCopy.Buffer value) { VkCopyMemoryToImageInfo.npRegions(address(), value); return this; }

    }

}