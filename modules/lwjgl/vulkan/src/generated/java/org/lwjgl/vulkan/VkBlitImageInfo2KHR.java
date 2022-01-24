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
 * Structure specifying parameters of blit image command.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The source region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code srcImage}</li>
 * <li>The destination region specified by each element of {@code pRegions} <b>must</b> be a region that is contained within {@code dstImage}</li>
 * <li>The union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory with any texel that <b>may</b> be sampled during the blit operation</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</li>
 * <li>{@code srcImage} <b>must</b> not use a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">format that requires a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a></li>
 * <li>{@code srcImage} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
 * <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code srcImageLayout} <b>must</b> be {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}</li>
 * <li>{@code dstImage} <b>must</b> not use a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">format that requires a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a></li>
 * <li>{@code dstImage} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
 * <li>If {@code dstImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code dstImageLayout} <b>must</b> be {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>If either of {@code srcImage} or {@code dstImage} was created with a signed integer {@code VkFormat}, the other <b>must</b> also have been created with a signed integer {@code VkFormat}</li>
 * <li>If either of {@code srcImage} or {@code dstImage} was created with an unsigned integer {@code VkFormat}, the other <b>must</b> also have been created with an unsigned integer {@code VkFormat}</li>
 * <li>If either of {@code srcImage} or {@code dstImage} was created with a depth/stencil format, the other <b>must</b> have exactly the same format</li>
 * <li>If {@code srcImage} was created with a depth/stencil format, {@code filter} <b>must</b> be {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST}</li>
 * <li>{@code srcImage} <b>must</b> have been created with a {@code samples} value of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>{@code dstImage} <b>must</b> have been created with a {@code samples} value of {@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</li>
 * <li>If {@code filter} is {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
 * <li>If {@code filter} is {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
 * <li>If {@code filter} is {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}, {@code srcImage} <b>must</b> be of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>The <code>srcSubresource.baseArrayLayer + srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The <code>dstSubresource.baseArrayLayer + dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * <li>If either {@code srcImage} or {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} and {@code dstSubresource.baseArrayLayer} <b>must</b> each be 0, and {@code srcSubresource.layerCount} and {@code dstSubresource.layerCount} <b>must</b> each be 1</li>
 * <li>For each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> specify aspects present in {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffsets}[0].x and {@code srcOffsets}[1].x <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffsets}[0].y and {@code srcOffsets}[1].y <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code srcOffsets}[0].y <b>must</b> be 0 and {@code srcOffsets}[1].y <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code srcOffsets}[0].z and {@code srcOffsets}[1].z <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code srcOffsets}[0].z <b>must</b> be 0 and {@code srcOffsets}[1].z <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code dstOffsets}[0].x and {@code dstOffsets}[1].x <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffsets}[0].y and {@code dstOffsets}[1].y <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code dstOffsets}[0].y <b>must</b> be 0 and {@code dstOffsets}[1].y <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code dstOffsets}[0].z and {@code dstOffsets}[1].z <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D} or {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code dstOffsets}[0].z <b>must</b> be 0 and {@code dstOffsets}[1].z <b>must</b> be 1</li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code srcImage} and {@code dstImage} <b>must</b> not be block-compressed images</li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code srcImage} <b>must</b> be of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}</li>
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code srcImage} <b>must</b> not have a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkImageBlit2KHR} structures</li>
 * <li>{@code filter} <b>must</b> be a valid {@code VkFilter} value</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageBlit2KHR}, {@link KHRCopyCommands2#vkCmdBlitImage2KHR CmdBlitImage2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBlitImageInfo2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #srcImage};
 *     VkImageLayout {@link #srcImageLayout};
 *     VkImage {@link #dstImage};
 *     VkImageLayout {@link #dstImageLayout};
 *     uint32_t {@link #regionCount};
 *     {@link VkImageBlit2KHR VkImageBlit2KHR} const * {@link #pRegions};
 *     VkFilter {@link #filter};
 * }</code></pre>
 */
public class VkBlitImageInfo2KHR extends Struct implements NativeResource {

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
        DSTIMAGE,
        DSTIMAGELAYOUT,
        REGIONCOUNT,
        PREGIONS,
        FILTER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTIMAGE = layout.offsetof(4);
        DSTIMAGELAYOUT = layout.offsetof(5);
        REGIONCOUNT = layout.offsetof(6);
        PREGIONS = layout.offsetof(7);
        FILTER = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkBlitImageInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBlitImageInfo2KHR(ByteBuffer container) {
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
    /** the layout of the source image subresources for the blit. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** the destination image. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** the layout of the destination image subresources for the blit. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** the number of regions to blit. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** a pointer to an array of {@link VkImageBlit2KHR} structures specifying the regions to blit. */
    @NativeType("VkImageBlit2KHR const *")
    public VkImageBlit2KHR.Buffer pRegions() { return npRegions(address()); }
    /** a {@code VkFilter} specifying the filter to apply if the blits require scaling. */
    @NativeType("VkFilter")
    public int filter() { return nfilter(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBlitImageInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR} value to the {@link #sType} field. */
    public VkBlitImageInfo2KHR sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBlitImageInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImage} field. */
    public VkBlitImageInfo2KHR srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImageLayout} field. */
    public VkBlitImageInfo2KHR srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImage} field. */
    public VkBlitImageInfo2KHR dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImageLayout} field. */
    public VkBlitImageInfo2KHR dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageBlit2KHR.Buffer} to the {@link #pRegions} field. */
    public VkBlitImageInfo2KHR pRegions(@NativeType("VkImageBlit2KHR const *") VkImageBlit2KHR.Buffer value) { npRegions(address(), value); return this; }
    /** Sets the specified value to the {@link #filter} field. */
    public VkBlitImageInfo2KHR filter(@NativeType("VkFilter") int value) { nfilter(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBlitImageInfo2KHR set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageBlit2KHR.Buffer pRegions,
        int filter
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
        dstImage(dstImage);
        dstImageLayout(dstImageLayout);
        pRegions(pRegions);
        filter(filter);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBlitImageInfo2KHR set(VkBlitImageInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBlitImageInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBlitImageInfo2KHR malloc() {
        return wrap(VkBlitImageInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBlitImageInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBlitImageInfo2KHR calloc() {
        return wrap(VkBlitImageInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBlitImageInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkBlitImageInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBlitImageInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBlitImageInfo2KHR} instance for the specified memory address. */
    public static VkBlitImageInfo2KHR create(long address) {
        return wrap(VkBlitImageInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBlitImageInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkBlitImageInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBlitImageInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBlitImageInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBlitImageInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBlitImageInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkBlitImageInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBlitImageInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBlitImageInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkBlitImageInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBlitImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBlitImageInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return UNSAFE.getLong(null, struct + VkBlitImageInfo2KHR.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2KHR.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return UNSAFE.getLong(null, struct + VkBlitImageInfo2KHR.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2KHR.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2KHR.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageBlit2KHR.Buffer npRegions(long struct) { return VkImageBlit2KHR.create(memGetAddress(struct + VkBlitImageInfo2KHR.PREGIONS), nregionCount(struct)); }
    /** Unsafe version of {@link #filter}. */
    public static int nfilter(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2KHR.FILTER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBlitImageInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { UNSAFE.putLong(null, struct + VkBlitImageInfo2KHR.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2KHR.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { UNSAFE.putLong(null, struct + VkBlitImageInfo2KHR.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2KHR.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2KHR.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageBlit2KHR.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageBlit2KHR.Buffer value) { memPutAddress(struct + VkBlitImageInfo2KHR.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }
    /** Unsafe version of {@link #filter(int) filter}. */
    public static void nfilter(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2KHR.FILTER, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkBlitImageInfo2KHR.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkBlitImageInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkBlitImageInfo2KHR, Buffer> implements NativeResource {

        private static final VkBlitImageInfo2KHR ELEMENT_FACTORY = VkBlitImageInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkBlitImageInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBlitImageInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkBlitImageInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBlitImageInfo2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBlitImageInfo2KHR.nsType(address()); }
        /** @return the value of the {@link VkBlitImageInfo2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBlitImageInfo2KHR.npNext(address()); }
        /** @return the value of the {@link VkBlitImageInfo2KHR#srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkBlitImageInfo2KHR.nsrcImage(address()); }
        /** @return the value of the {@link VkBlitImageInfo2KHR#srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkBlitImageInfo2KHR.nsrcImageLayout(address()); }
        /** @return the value of the {@link VkBlitImageInfo2KHR#dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkBlitImageInfo2KHR.ndstImage(address()); }
        /** @return the value of the {@link VkBlitImageInfo2KHR#dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkBlitImageInfo2KHR.ndstImageLayout(address()); }
        /** @return the value of the {@link VkBlitImageInfo2KHR#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkBlitImageInfo2KHR.nregionCount(address()); }
        /** @return a {@link VkImageBlit2KHR.Buffer} view of the struct array pointed to by the {@link VkBlitImageInfo2KHR#pRegions} field. */
        @NativeType("VkImageBlit2KHR const *")
        public VkImageBlit2KHR.Buffer pRegions() { return VkBlitImageInfo2KHR.npRegions(address()); }
        /** @return the value of the {@link VkBlitImageInfo2KHR#filter} field. */
        @NativeType("VkFilter")
        public int filter() { return VkBlitImageInfo2KHR.nfilter(address()); }

        /** Sets the specified value to the {@link VkBlitImageInfo2KHR#sType} field. */
        public VkBlitImageInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkBlitImageInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR} value to the {@link VkBlitImageInfo2KHR#sType} field. */
        public VkBlitImageInfo2KHR.Buffer sType$Default() { return sType(KHRCopyCommands2.VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2_KHR); }
        /** Sets the specified value to the {@link VkBlitImageInfo2KHR#pNext} field. */
        public VkBlitImageInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkBlitImageInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2KHR#srcImage} field. */
        public VkBlitImageInfo2KHR.Buffer srcImage(@NativeType("VkImage") long value) { VkBlitImageInfo2KHR.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2KHR#srcImageLayout} field. */
        public VkBlitImageInfo2KHR.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkBlitImageInfo2KHR.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2KHR#dstImage} field. */
        public VkBlitImageInfo2KHR.Buffer dstImage(@NativeType("VkImage") long value) { VkBlitImageInfo2KHR.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2KHR#dstImageLayout} field. */
        public VkBlitImageInfo2KHR.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkBlitImageInfo2KHR.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageBlit2KHR.Buffer} to the {@link VkBlitImageInfo2KHR#pRegions} field. */
        public VkBlitImageInfo2KHR.Buffer pRegions(@NativeType("VkImageBlit2KHR const *") VkImageBlit2KHR.Buffer value) { VkBlitImageInfo2KHR.npRegions(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2KHR#filter} field. */
        public VkBlitImageInfo2KHR.Buffer filter(@NativeType("VkFilter") int value) { VkBlitImageInfo2KHR.nfilter(address(), value); return this; }

    }

}