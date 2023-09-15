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
 * Structure specifying parameters of an image to host memory copy command.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code vkCopyImageToMemoryEXT} does not check whether the device memory associated with {@code srcImage} is currently in use before performing the copy. The application <b>must</b> guarantee that any previously submitted command that writes to the copy regions has completed before the host performs the copy.</p>
 * 
 * <p>Copy regions for the image <b>must</b> be aligned to a multiple of the texel block extent in each dimension, except at the edges of the image, where region extents <b>must</b> match the edge of the image.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code dstImage} is sparse then all memory ranges accessed by the copy command <b>must</b> be bound as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#sparsememory-resource-binding">Binding Resource Memory</a></li>
 * <li>If the stencil aspect of {@code dstImage} is accessed, and {@code dstImage} was not created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, the image <b>must</b> have been created with {@link EXTHostImageCopy#VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT IMAGE_USAGE_HOST_TRANSFER_BIT_EXT} set in {@link VkImageCreateInfo}{@code ::usage}</li>
 * <li>If the stencil aspect of {@code dstImage} is accessed, and {@code dstImage} was created with <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkImageStencilUsageCreateInfo">separate stencil usage</a>, the image <b>must</b> have been created with {@link EXTHostImageCopy#VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT IMAGE_USAGE_HOST_TRANSFER_BIT_EXT} set in {@link VkImageStencilUsageCreateInfo}{@code ::stencilUsage}</li>
 * <li>If non-stencil aspects of {@code dstImage} are accessed, the image <b>must</b> have been created with {@link EXTHostImageCopy#VK_IMAGE_USAGE_HOST_TRANSFER_BIT_EXT IMAGE_USAGE_HOST_TRANSFER_BIT_EXT} set in {@link VkImageCreateInfo}{@code ::usage}</li>
 * <li>If {@code flags} contains {@link EXTHostImageCopy#VK_HOST_IMAGE_COPY_MEMCPY_EXT HOST_IMAGE_COPY_MEMCPY_EXT}, the {@code x}, {@code y}, and {@code z} members of the {@code dstOffset} member of each element of {@code pRegions} <b>must</b> be 0</li>
 * <li>If {@code flags} contains {@link EXTHostImageCopy#VK_HOST_IMAGE_COPY_MEMCPY_EXT HOST_IMAGE_COPY_MEMCPY_EXT}, the {@code extent} member of each element of {@code pRegions} <b>must</b> equal the extents of {@code dstImage} identified by {@code dstSubresource}</li>
 * </ul>
 * 
 * <ul>
 * <li>If {@code dstImage} is non-sparse then the image or the specified <em>disjoint</em> plane <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>The <code>{@code dstSubresource.baseArrayLayer} + {@code dstSubresource.layerCount}</code> of each element of {@code pRegions} , if {@code dstSubresource.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS} and <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-maintenance5">{@code maintenance5}</a> is not enabled, <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
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
 * <li>For each element of {@code pRegions}, {@code dstOffset.x} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code dstOffset.x} and {@code extent.width} does not equal the width of the subresource specified by {@code srcSubresource}, {@code extent.width} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code dstOffset.y} and {@code extent.height} does not equal the height of the subresource specified by {@code srcSubresource}, {@code extent.height} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, if the sum of {@code dstOffset.z} and {@code extent.depth} does not equal the depth of the subresource specified by {@code srcSubresource}, {@code extent.depth} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent depth</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
 * <li>If {@code dstImage} has a <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a>, then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be a single valid <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-planes-image-aspect">multi-planar aspect mask</a> bit</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, for each element of {@code pRegions}, {@code dstSubresource.baseArrayLayer} <b>must</b> be 0 and {@code dstSubresource.layerCount} <b>must</b> be 1</li>
 * </ul>
 * 
 * <ul>
 * <li>For each element of {@code pRegions}, {@code bufferRowLength} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code bufferImageHeight} <b>must</b> be a multiple of the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent height</a> of the {@code VkFormat} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code bufferRowLength} divided by the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility-classes">texel block extent width</a> and then multiplied by the texel block size of {@code dstImage} <b>must</b> be less than or equal to <code>2<sup>31</sup>-1</code></li>
 * <li>{@code srcImageLayout} <b>must</b> specify the current layout of the image subresources of {@code srcImage} specified in {@code pRegions}</li>
 * <li>{@code srcImageLayout} <b>must</b> be one of the image layouts returned in {@link VkPhysicalDeviceHostImageCopyPropertiesEXT}{@code ::pCopySrcLayouts}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkHostImageCopyFlagBitsEXT} values</li>
 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkImageToMemoryCopyEXT} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageToMemoryCopyEXT}, {@link EXTHostImageCopy#vkCopyImageToMemoryEXT CopyImageToMemoryEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyImageToMemoryInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkHostImageCopyFlagsEXT {@link #flags};
 *     VkImage {@link #srcImage};
 *     VkImageLayout {@link #srcImageLayout};
 *     uint32_t {@link #regionCount};
 *     {@link VkImageToMemoryCopyEXT VkImageToMemoryCopyEXT} const * {@link #pRegions};
 * }</code></pre>
 */
public class VkCopyImageToMemoryInfoEXT extends Struct<VkCopyImageToMemoryInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SRCIMAGE,
        SRCIMAGELAYOUT,
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
        SRCIMAGE = layout.offsetof(3);
        SRCIMAGELAYOUT = layout.offsetof(4);
        REGIONCOUNT = layout.offsetof(5);
        PREGIONS = layout.offsetof(6);
    }

    protected VkCopyImageToMemoryInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyImageToMemoryInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkCopyImageToMemoryInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkCopyImageToMemoryInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageToMemoryInfoEXT(ByteBuffer container) {
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
    /** a bitmask of {@code VkHostImageCopyFlagBitsEXT} values describing additional copy parameters. */
    @NativeType("VkHostImageCopyFlagsEXT")
    public int flags() { return nflags(address()); }
    /** the source image. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** the layout of the source image subresources for the copy. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** the number of regions to copy. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkImageToMemoryCopyEXT} structures specifying the regions to copy. */
    @NativeType("VkImageToMemoryCopyEXT const *")
    public VkImageToMemoryCopyEXT.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkCopyImageToMemoryInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT} value to the {@link #sType} field. */
    public VkCopyImageToMemoryInfoEXT sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkCopyImageToMemoryInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkCopyImageToMemoryInfoEXT flags(@NativeType("VkHostImageCopyFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImage} field. */
    public VkCopyImageToMemoryInfoEXT srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImageLayout} field. */
    public VkCopyImageToMemoryInfoEXT srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageToMemoryCopyEXT.Buffer} to the {@link #pRegions} field. */
    public VkCopyImageToMemoryInfoEXT pRegions(@NativeType("VkImageToMemoryCopyEXT const *") VkImageToMemoryCopyEXT.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyImageToMemoryInfoEXT set(
        int sType,
        long pNext,
        int flags,
        long srcImage,
        int srcImageLayout,
        VkImageToMemoryCopyEXT.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
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
    public VkCopyImageToMemoryInfoEXT set(VkCopyImageToMemoryInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageToMemoryInfoEXT malloc() {
        return new VkCopyImageToMemoryInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageToMemoryInfoEXT calloc() {
        return new VkCopyImageToMemoryInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageToMemoryInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyImageToMemoryInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageToMemoryInfoEXT} instance for the specified memory address. */
    public static VkCopyImageToMemoryInfoEXT create(long address) {
        return new VkCopyImageToMemoryInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyImageToMemoryInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkCopyImageToMemoryInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyImageToMemoryInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyImageToMemoryInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToMemoryInfoEXT malloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyImageToMemoryInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageToMemoryInfoEXT calloc(MemoryStack stack) {
        return new VkCopyImageToMemoryInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageToMemoryInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageToMemoryInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageToMemoryInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyImageToMemoryInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageToMemoryInfoEXT.FLAGS); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return UNSAFE.getLong(null, struct + VkCopyImageToMemoryInfoEXT.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageToMemoryInfoEXT.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageToMemoryInfoEXT.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageToMemoryCopyEXT.Buffer npRegions(long struct) { return VkImageToMemoryCopyEXT.create(memGetAddress(struct + VkCopyImageToMemoryInfoEXT.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageToMemoryInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyImageToMemoryInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageToMemoryInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyImageToMemoryInfoEXT.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageToMemoryInfoEXT.SRCIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageToMemoryInfoEXT.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageToMemoryCopyEXT.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageToMemoryCopyEXT.Buffer value) { memPutAddress(struct + VkCopyImageToMemoryInfoEXT.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int regionCount = nregionCount(struct);
        long pRegions = memGetAddress(struct + VkCopyImageToMemoryInfoEXT.PREGIONS);
        check(pRegions);
        validate(pRegions, regionCount, VkImageToMemoryCopyEXT.SIZEOF, VkImageToMemoryCopyEXT::validate);
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageToMemoryInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkCopyImageToMemoryInfoEXT, Buffer> implements NativeResource {

        private static final VkCopyImageToMemoryInfoEXT ELEMENT_FACTORY = VkCopyImageToMemoryInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkCopyImageToMemoryInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageToMemoryInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkCopyImageToMemoryInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkCopyImageToMemoryInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyImageToMemoryInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkCopyImageToMemoryInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyImageToMemoryInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkCopyImageToMemoryInfoEXT#flags} field. */
        @NativeType("VkHostImageCopyFlagsEXT")
        public int flags() { return VkCopyImageToMemoryInfoEXT.nflags(address()); }
        /** @return the value of the {@link VkCopyImageToMemoryInfoEXT#srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkCopyImageToMemoryInfoEXT.nsrcImage(address()); }
        /** @return the value of the {@link VkCopyImageToMemoryInfoEXT#srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkCopyImageToMemoryInfoEXT.nsrcImageLayout(address()); }
        /** @return the value of the {@link VkCopyImageToMemoryInfoEXT#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyImageToMemoryInfoEXT.nregionCount(address()); }
        /** @return a {@link VkImageToMemoryCopyEXT.Buffer} view of the struct array pointed to by the {@link VkCopyImageToMemoryInfoEXT#pRegions} field. */
        @NativeType("VkImageToMemoryCopyEXT const *")
        public VkImageToMemoryCopyEXT.Buffer pRegions() { return VkCopyImageToMemoryInfoEXT.npRegions(address()); }

        /** Sets the specified value to the {@link VkCopyImageToMemoryInfoEXT#sType} field. */
        public VkCopyImageToMemoryInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageToMemoryInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTHostImageCopy#VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT} value to the {@link VkCopyImageToMemoryInfoEXT#sType} field. */
        public VkCopyImageToMemoryInfoEXT.Buffer sType$Default() { return sType(EXTHostImageCopy.VK_STRUCTURE_TYPE_COPY_IMAGE_TO_MEMORY_INFO_EXT); }
        /** Sets the specified value to the {@link VkCopyImageToMemoryInfoEXT#pNext} field. */
        public VkCopyImageToMemoryInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageToMemoryInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageToMemoryInfoEXT#flags} field. */
        public VkCopyImageToMemoryInfoEXT.Buffer flags(@NativeType("VkHostImageCopyFlagsEXT") int value) { VkCopyImageToMemoryInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageToMemoryInfoEXT#srcImage} field. */
        public VkCopyImageToMemoryInfoEXT.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageToMemoryInfoEXT.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkCopyImageToMemoryInfoEXT#srcImageLayout} field. */
        public VkCopyImageToMemoryInfoEXT.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageToMemoryInfoEXT.nsrcImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageToMemoryCopyEXT.Buffer} to the {@link VkCopyImageToMemoryInfoEXT#pRegions} field. */
        public VkCopyImageToMemoryInfoEXT.Buffer pRegions(@NativeType("VkImageToMemoryCopyEXT const *") VkImageToMemoryCopyEXT.Buffer value) { VkCopyImageToMemoryInfoEXT.npRegions(address(), value); return this; }

    }

}