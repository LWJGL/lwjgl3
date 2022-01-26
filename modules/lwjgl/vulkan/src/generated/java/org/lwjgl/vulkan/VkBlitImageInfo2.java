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
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT}</li>
 * <li>{@code srcImage} <b>must</b> not use a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">format that requires a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a></li>
 * <li>{@code srcImage} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
 * <li>If {@code srcImage} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code srcImageLayout} <b>must</b> be {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}, {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} or {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_BLIT_DST_BIT FORMAT_FEATURE_BLIT_DST_BIT}</li>
 * <li>{@code dstImage} <b>must</b> not use a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">format that requires a sampler Y’C<sub>B</sub>C<sub>R</sub> conversion</a></li>
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
 * <li>If {@code filter} is {@link VK10#VK_FILTER_LINEAR FILTER_LINEAR}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT}</li>
 * <li>If {@code filter} is {@link EXTFilterCubic#VK_FILTER_CUBIC_EXT FILTER_CUBIC_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link EXTFilterCubic#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT}</li>
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
 * <li>If any element of {@code pRegions} contains {@link VkCopyCommandTransformInfoQCOM} in its {@code pNext} chain, then {@code srcImage} <b>must</b> not have a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar format</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 STRUCTURE_TYPE_BLIT_IMAGE_INFO_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkImageBlit2} structures</li>
 * <li>{@code filter} <b>must</b> be a valid {@code VkFilter} value</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageBlit2}, {@link VK13#vkCmdBlitImage2 CmdBlitImage2}, {@link KHRCopyCommands2#vkCmdBlitImage2KHR CmdBlitImage2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBlitImageInfo2 {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #srcImage};
 *     VkImageLayout {@link #srcImageLayout};
 *     VkImage {@link #dstImage};
 *     VkImageLayout {@link #dstImageLayout};
 *     uint32_t {@link #regionCount};
 *     {@link VkImageBlit2 VkImageBlit2} const * {@link #pRegions};
 *     VkFilter {@link #filter};
 * }</code></pre>
 */
public class VkBlitImageInfo2 extends Struct implements NativeResource {

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
     * Creates a {@code VkBlitImageInfo2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBlitImageInfo2(ByteBuffer container) {
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
    /** a pointer to an array of {@link VkImageBlit2} structures specifying the regions to blit. */
    @NativeType("VkImageBlit2 const *")
    public VkImageBlit2.Buffer pRegions() { return npRegions(address()); }
    /** a {@code VkFilter} specifying the filter to apply if the blits require scaling. */
    @NativeType("VkFilter")
    public int filter() { return nfilter(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBlitImageInfo2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 STRUCTURE_TYPE_BLIT_IMAGE_INFO_2} value to the {@link #sType} field. */
    public VkBlitImageInfo2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBlitImageInfo2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImage} field. */
    public VkBlitImageInfo2 srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@link #srcImageLayout} field. */
    public VkBlitImageInfo2 srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImage} field. */
    public VkBlitImageInfo2 dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@link #dstImageLayout} field. */
    public VkBlitImageInfo2 dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageBlit2.Buffer} to the {@link #pRegions} field. */
    public VkBlitImageInfo2 pRegions(@NativeType("VkImageBlit2 const *") VkImageBlit2.Buffer value) { npRegions(address(), value); return this; }
    /** Sets the specified value to the {@link #filter} field. */
    public VkBlitImageInfo2 filter(@NativeType("VkFilter") int value) { nfilter(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBlitImageInfo2 set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageBlit2.Buffer pRegions,
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
    public VkBlitImageInfo2 set(VkBlitImageInfo2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBlitImageInfo2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBlitImageInfo2 malloc() {
        return wrap(VkBlitImageInfo2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBlitImageInfo2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBlitImageInfo2 calloc() {
        return wrap(VkBlitImageInfo2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBlitImageInfo2} instance allocated with {@link BufferUtils}. */
    public static VkBlitImageInfo2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBlitImageInfo2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBlitImageInfo2} instance for the specified memory address. */
    public static VkBlitImageInfo2 create(long address) {
        return wrap(VkBlitImageInfo2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBlitImageInfo2 createSafe(long address) {
        return address == NULL ? null : wrap(VkBlitImageInfo2.class, address);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBlitImageInfo2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBlitImageInfo2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkBlitImageInfo2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBlitImageInfo2 malloc(MemoryStack stack) {
        return wrap(VkBlitImageInfo2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBlitImageInfo2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBlitImageInfo2 calloc(MemoryStack stack) {
        return wrap(VkBlitImageInfo2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBlitImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageInfo2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBlitImageInfo2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBlitImageInfo2.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return UNSAFE.getLong(null, struct + VkBlitImageInfo2.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return UNSAFE.getLong(null, struct + VkBlitImageInfo2.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageBlit2.Buffer npRegions(long struct) { return VkImageBlit2.create(memGetAddress(struct + VkBlitImageInfo2.PREGIONS), nregionCount(struct)); }
    /** Unsafe version of {@link #filter}. */
    public static int nfilter(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageInfo2.FILTER); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBlitImageInfo2.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { UNSAFE.putLong(null, struct + VkBlitImageInfo2.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { UNSAFE.putLong(null, struct + VkBlitImageInfo2.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageBlit2.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageBlit2.Buffer value) { memPutAddress(struct + VkBlitImageInfo2.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }
    /** Unsafe version of {@link #filter(int) filter}. */
    public static void nfilter(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageInfo2.FILTER, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkBlitImageInfo2.PREGIONS));
    }

    // -----------------------------------

    /** An array of {@link VkBlitImageInfo2} structs. */
    public static class Buffer extends StructBuffer<VkBlitImageInfo2, Buffer> implements NativeResource {

        private static final VkBlitImageInfo2 ELEMENT_FACTORY = VkBlitImageInfo2.create(-1L);

        /**
         * Creates a new {@code VkBlitImageInfo2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBlitImageInfo2#SIZEOF}, and its mark will be undefined.
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
        protected VkBlitImageInfo2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBlitImageInfo2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBlitImageInfo2.nsType(address()); }
        /** @return the value of the {@link VkBlitImageInfo2#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBlitImageInfo2.npNext(address()); }
        /** @return the value of the {@link VkBlitImageInfo2#srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkBlitImageInfo2.nsrcImage(address()); }
        /** @return the value of the {@link VkBlitImageInfo2#srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkBlitImageInfo2.nsrcImageLayout(address()); }
        /** @return the value of the {@link VkBlitImageInfo2#dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkBlitImageInfo2.ndstImage(address()); }
        /** @return the value of the {@link VkBlitImageInfo2#dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkBlitImageInfo2.ndstImageLayout(address()); }
        /** @return the value of the {@link VkBlitImageInfo2#regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkBlitImageInfo2.nregionCount(address()); }
        /** @return a {@link VkImageBlit2.Buffer} view of the struct array pointed to by the {@link VkBlitImageInfo2#pRegions} field. */
        @NativeType("VkImageBlit2 const *")
        public VkImageBlit2.Buffer pRegions() { return VkBlitImageInfo2.npRegions(address()); }
        /** @return the value of the {@link VkBlitImageInfo2#filter} field. */
        @NativeType("VkFilter")
        public int filter() { return VkBlitImageInfo2.nfilter(address()); }

        /** Sets the specified value to the {@link VkBlitImageInfo2#sType} field. */
        public VkBlitImageInfo2.Buffer sType(@NativeType("VkStructureType") int value) { VkBlitImageInfo2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2 STRUCTURE_TYPE_BLIT_IMAGE_INFO_2} value to the {@link VkBlitImageInfo2#sType} field. */
        public VkBlitImageInfo2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_BLIT_IMAGE_INFO_2); }
        /** Sets the specified value to the {@link VkBlitImageInfo2#pNext} field. */
        public VkBlitImageInfo2.Buffer pNext(@NativeType("void const *") long value) { VkBlitImageInfo2.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2#srcImage} field. */
        public VkBlitImageInfo2.Buffer srcImage(@NativeType("VkImage") long value) { VkBlitImageInfo2.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2#srcImageLayout} field. */
        public VkBlitImageInfo2.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkBlitImageInfo2.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2#dstImage} field. */
        public VkBlitImageInfo2.Buffer dstImage(@NativeType("VkImage") long value) { VkBlitImageInfo2.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2#dstImageLayout} field. */
        public VkBlitImageInfo2.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkBlitImageInfo2.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageBlit2.Buffer} to the {@link VkBlitImageInfo2#pRegions} field. */
        public VkBlitImageInfo2.Buffer pRegions(@NativeType("VkImageBlit2 const *") VkImageBlit2.Buffer value) { VkBlitImageInfo2.npRegions(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageInfo2#filter} field. */
        public VkBlitImageInfo2.Buffer filter(@NativeType("VkFilter") int value) { VkBlitImageInfo2.nfilter(address(), value); return this; }

    }

}