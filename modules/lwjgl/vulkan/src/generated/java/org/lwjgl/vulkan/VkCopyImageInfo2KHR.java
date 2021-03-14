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
 * Structure specifying parameters of an image copy command.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The union of all source regions, and the union of all destination regions, specified by the elements of {@code pRegions}, <b>must</b> not overlap in memory</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code srcImage} <b>must</b> contain {@link VK11#VK_FORMAT_FEATURE_TRANSFER_SRC_BIT FORMAT_FEATURE_TRANSFER_SRC_BIT}</li>
 * <li>{@code srcImage} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} usage flag</li>
 * <li>If {@code srcImage} is non-sparse then the image or <em>disjoint</em> plane to be copied <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code srcImageLayout} <b>must</b> specify the layout of the image subresources of {@code srcImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code srcImageLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}, or {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#resources-image-format-features">format features</a> of {@code dstImage} <b>must</b> contain {@link VK11#VK_FORMAT_FEATURE_TRANSFER_DST_BIT FORMAT_FEATURE_TRANSFER_DST_BIT}</li>
 * <li>{@code dstImage} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} usage flag</li>
 * <li>If {@code dstImage} is non-sparse then the image or <em>disjoint</em> plane that is the destination of the copy <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>{@code dstImageLayout} <b>must</b> specify the layout of the image subresources of {@code dstImage} specified in {@code pRegions} at the time this command is executed on a {@code VkDevice}</li>
 * <li>{@code dstImageLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL}, {@link VK10#VK_IMAGE_LAYOUT_GENERAL IMAGE_LAYOUT_GENERAL}, or {@link KHRSharedPresentableImage#VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR IMAGE_LAYOUT_SHARED_PRESENT_KHR}</li>
 * <li>If the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} is not a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion"><em>multi-planar format</em</a>>, the {@code VkFormat} of each of {@code srcImage} and {@code dstImage} <b>must</b> be compatible, as defined <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#copies-images-format-compatibility">above</a></li>
 * <li>In a copy to or from a plane of a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image</a>, the {@code VkFormat} of the image and plane <b>must</b> be compatible according to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-compatible-planes">the description of compatible planes</a> for the plane being copied</li>
 * <li>The sample count of {@code srcImage} and {@code dstImage} <b>must</b> match</li>
 * <li>The {@code srcSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The {@code dstSubresource.mipLevel} member of each element of {@code pRegions} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>The <code>srcSubresource.baseArrayLayer srcSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code srcImage} was created</li>
 * <li>The <code>dstSubresource.baseArrayLayer dstSubresource.layerCount</code> of each element of {@code pRegions} <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code dstImage} was created</li>
 * <li>The {@code srcOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in {@link VkQueueFamilyProperties}</li>
 * <li>The {@code dstOffset} and {@code extent} members of each element of {@code pRegions} <b>must</b> respect the image transfer granularity requirements of {@code commandBuffer}&#8217;s command pool&#8217;s queue family, as described in {@link VkQueueFamilyProperties}</li>
 * <li>{@code dstImage} and {@code srcImage} <b>must</b> not have been created with {@code flags} containing {@link EXTFragmentDensityMap#VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT IMAGE_CREATE_SUBSAMPLED_BIT_EXT}</li>
 * <li>If neither {@code srcImage} nor {@code dstImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} and {@code dstSubresource.aspectMask} <b>must</b> match</li>
 * <li>If {@code srcImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">two planes</a> then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT} or {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}</li>
 * <li>If {@code srcImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">three planes</a> then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>If {@code dstImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">two planes</a> then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT} or {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}</li>
 * <li>If {@code dstImage} has a {@code VkFormat} with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">three planes</a> then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, or {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>If {@code srcImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> and the {@code dstImage} does not have a multi-planar image format, then for each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code dstImage} has a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#formats-requiring-sampler-ycbcr-conversion">multi-planar image format</a> and the {@code srcImage} does not have a multi-planar image format, then for each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code srcSubresource.baseArrayLayer} <b>must</b> be 0 and and {@code srcSubresource.layerCount} <b>must</b> be 1</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code dstSubresource.baseArrayLayer} <b>must</b> be 0 and and {@code dstSubresource.layerCount} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code srcSubresource.aspectMask} <b>must</b> specify aspects present in {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstSubresource.aspectMask} <b>must</b> specify aspects present in {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.x} and <code>(extent.width + srcOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.y} and <code>(extent.height + srcOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code srcOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code srcOffset.z} and <code>(extent.depth + srcOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0 and {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code srcOffset.z} <b>must</b> be 0</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code dstOffset.z} <b>must</b> be 0</li>
 * <li>If {@code srcImage} and {@code dstImage} are both of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be 1</li>
 * <li>If {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> equal {@code srcSubresource.layerCount}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_2D IMAGE_TYPE_2D}, and {@code srcImage} is of type {@link VK10#VK_IMAGE_TYPE_3D IMAGE_TYPE_3D}, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> equal {@code dstSubresource.layerCount}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.x} and <code>(extent.width + dstOffset.x)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the width of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.y} and <code>(extent.height + dstOffset.y)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the height of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is of type {@link VK10#VK_IMAGE_TYPE_1D IMAGE_TYPE_1D}, then for each element of {@code pRegions}, {@code dstOffset.y} <b>must</b> be 0 and {@code extent.height} <b>must</b> be 1</li>
 * <li>For each element of {@code pRegions}, {@code dstOffset.z} and <code>(extent.depth + dstOffset.z)</code> <b>must</b> both be greater than or equal to 0 and less than or equal to the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, all members of {@code srcOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(extent.width srcOffset.x)</code> <b>must</b> equal the width of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(extent.height srcOffset.y)</code> <b>must</b> equal the height of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code srcImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(extent.depth srcOffset.z)</code> <b>must</b> equal the depth of the specified {@code srcSubresource} of {@code srcImage}</li>
 * <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, all members of {@code dstOffset} <b>must</b> be a multiple of the corresponding dimensions of the compressed texel block</li>
 * <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.width} <b>must</b> be a multiple of the compressed texel block width or <code>(extent.width dstOffset.x)</code> <b>must</b> equal the width of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.height} <b>must</b> be a multiple of the compressed texel block height or <code>(extent.height dstOffset.y)</code> <b>must</b> equal the height of the specified {@code dstSubresource} of {@code dstImage}</li>
 * <li>If {@code dstImage} is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#blocked-image">blocked image</a>, then for each element of {@code pRegions}, {@code extent.depth} <b>must</b> be a multiple of the compressed texel block depth or <code>(extent.depth dstOffset.z)</code> <b>must</b> equal the depth of the specified {@code dstSubresource} of {@code dstImage}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRCopyCommands2#VK_STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR STRUCTURE_TYPE_COPY_IMAGE_INFO_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code srcImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code dstImage} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code dstImageLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code pRegions} <b>must</b> be a valid pointer to an array of {@code regionCount} valid {@link VkImageCopy2KHR} structures</li>
 * <li>{@code regionCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code dstImage}, and {@code srcImage} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageCopy2KHR}, {@link KHRCopyCommands2#vkCmdCopyImage2KHR CmdCopyImage2KHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to a structure extending this structure.</li>
 * <li>{@code srcImage} &ndash; the source image.</li>
 * <li>{@code srcImageLayout} &ndash; the current layout of the source image subresource.</li>
 * <li>{@code dstImage} &ndash; the destination image.</li>
 * <li>{@code dstImageLayout} &ndash; the current layout of the destination image subresource.</li>
 * <li>{@code regionCount} &ndash; the number of regions to copy.</li>
 * <li>{@code pRegions} &ndash; a pointer to an array of {@link VkImageCopy2KHR} structures specifying the regions to copy.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyImageInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage srcImage;
 *     VkImageLayout srcImageLayout;
 *     VkImage dstImage;
 *     VkImageLayout dstImageLayout;
 *     uint32_t regionCount;
 *     {@link VkImageCopy2KHR VkImageCopy2KHR} const * pRegions;
 * }</code></pre>
 */
public class VkCopyImageInfo2KHR extends Struct implements NativeResource {

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
        PREGIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
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
        SRCIMAGE = layout.offsetof(2);
        SRCIMAGELAYOUT = layout.offsetof(3);
        DSTIMAGE = layout.offsetof(4);
        DSTIMAGELAYOUT = layout.offsetof(5);
        REGIONCOUNT = layout.offsetof(6);
        PREGIONS = layout.offsetof(7);
    }

    /**
     * Creates a {@code VkCopyImageInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyImageInfo2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code srcImage} field. */
    @NativeType("VkImage")
    public long srcImage() { return nsrcImage(address()); }
    /** Returns the value of the {@code srcImageLayout} field. */
    @NativeType("VkImageLayout")
    public int srcImageLayout() { return nsrcImageLayout(address()); }
    /** Returns the value of the {@code dstImage} field. */
    @NativeType("VkImage")
    public long dstImage() { return ndstImage(address()); }
    /** Returns the value of the {@code dstImageLayout} field. */
    @NativeType("VkImageLayout")
    public int dstImageLayout() { return ndstImageLayout(address()); }
    /** Returns the value of the {@code regionCount} field. */
    @NativeType("uint32_t")
    public int regionCount() { return nregionCount(address()); }
    /** Returns a {@link VkImageCopy2KHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
    @NativeType("VkImageCopy2KHR const *")
    public VkImageCopy2KHR.Buffer pRegions() { return npRegions(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkCopyImageInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkCopyImageInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcImage} field. */
    public VkCopyImageInfo2KHR srcImage(@NativeType("VkImage") long value) { nsrcImage(address(), value); return this; }
    /** Sets the specified value to the {@code srcImageLayout} field. */
    public VkCopyImageInfo2KHR srcImageLayout(@NativeType("VkImageLayout") int value) { nsrcImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code dstImage} field. */
    public VkCopyImageInfo2KHR dstImage(@NativeType("VkImage") long value) { ndstImage(address(), value); return this; }
    /** Sets the specified value to the {@code dstImageLayout} field. */
    public VkCopyImageInfo2KHR dstImageLayout(@NativeType("VkImageLayout") int value) { ndstImageLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkImageCopy2KHR.Buffer} to the {@code pRegions} field. */
    public VkCopyImageInfo2KHR pRegions(@NativeType("VkImageCopy2KHR const *") VkImageCopy2KHR.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkCopyImageInfo2KHR set(
        int sType,
        long pNext,
        long srcImage,
        int srcImageLayout,
        long dstImage,
        int dstImageLayout,
        VkImageCopy2KHR.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcImage(srcImage);
        srcImageLayout(srcImageLayout);
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
    public VkCopyImageInfo2KHR set(VkCopyImageInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyImageInfo2KHR malloc() {
        return wrap(VkCopyImageInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkCopyImageInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyImageInfo2KHR calloc() {
        return wrap(VkCopyImageInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkCopyImageInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyImageInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkCopyImageInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkCopyImageInfo2KHR} instance for the specified memory address. */
    public static VkCopyImageInfo2KHR create(long address) {
        return wrap(VkCopyImageInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyImageInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkCopyImageInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkCopyImageInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyImageInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyImageInfo2KHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkCopyImageInfo2KHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkCopyImageInfo2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkCopyImageInfo2KHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkCopyImageInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageInfo2KHR mallocStack(MemoryStack stack) {
        return wrap(VkCopyImageInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkCopyImageInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyImageInfo2KHR callocStack(MemoryStack stack) {
        return wrap(VkCopyImageInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkCopyImageInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCopyImageInfo2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkCopyImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyImageInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyImageInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkCopyImageInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #srcImage}. */
    public static long nsrcImage(long struct) { return UNSAFE.getLong(null, struct + VkCopyImageInfo2KHR.SRCIMAGE); }
    /** Unsafe version of {@link #srcImageLayout}. */
    public static int nsrcImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageInfo2KHR.SRCIMAGELAYOUT); }
    /** Unsafe version of {@link #dstImage}. */
    public static long ndstImage(long struct) { return UNSAFE.getLong(null, struct + VkCopyImageInfo2KHR.DSTIMAGE); }
    /** Unsafe version of {@link #dstImageLayout}. */
    public static int ndstImageLayout(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageInfo2KHR.DSTIMAGELAYOUT); }
    /** Unsafe version of {@link #regionCount}. */
    public static int nregionCount(long struct) { return UNSAFE.getInt(null, struct + VkCopyImageInfo2KHR.REGIONCOUNT); }
    /** Unsafe version of {@link #pRegions}. */
    public static VkImageCopy2KHR.Buffer npRegions(long struct) { return VkImageCopy2KHR.create(memGetAddress(struct + VkCopyImageInfo2KHR.PREGIONS), nregionCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyImageInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #srcImage(long) srcImage}. */
    public static void nsrcImage(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyImageInfo2KHR.SRCIMAGE, value); }
    /** Unsafe version of {@link #srcImageLayout(int) srcImageLayout}. */
    public static void nsrcImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageInfo2KHR.SRCIMAGELAYOUT, value); }
    /** Unsafe version of {@link #dstImage(long) dstImage}. */
    public static void ndstImage(long struct, long value) { UNSAFE.putLong(null, struct + VkCopyImageInfo2KHR.DSTIMAGE, value); }
    /** Unsafe version of {@link #dstImageLayout(int) dstImageLayout}. */
    public static void ndstImageLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageInfo2KHR.DSTIMAGELAYOUT, value); }
    /** Sets the specified value to the {@code regionCount} field of the specified {@code struct}. */
    public static void nregionCount(long struct, int value) { UNSAFE.putInt(null, struct + VkCopyImageInfo2KHR.REGIONCOUNT, value); }
    /** Unsafe version of {@link #pRegions(VkImageCopy2KHR.Buffer) pRegions}. */
    public static void npRegions(long struct, VkImageCopy2KHR.Buffer value) { memPutAddress(struct + VkCopyImageInfo2KHR.PREGIONS, value.address()); nregionCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkCopyImageInfo2KHR.PREGIONS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkCopyImageInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkCopyImageInfo2KHR, Buffer> implements NativeResource {

        private static final VkCopyImageInfo2KHR ELEMENT_FACTORY = VkCopyImageInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkCopyImageInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyImageInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkCopyImageInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkCopyImageInfo2KHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkCopyImageInfo2KHR.npNext(address()); }
        /** Returns the value of the {@code srcImage} field. */
        @NativeType("VkImage")
        public long srcImage() { return VkCopyImageInfo2KHR.nsrcImage(address()); }
        /** Returns the value of the {@code srcImageLayout} field. */
        @NativeType("VkImageLayout")
        public int srcImageLayout() { return VkCopyImageInfo2KHR.nsrcImageLayout(address()); }
        /** Returns the value of the {@code dstImage} field. */
        @NativeType("VkImage")
        public long dstImage() { return VkCopyImageInfo2KHR.ndstImage(address()); }
        /** Returns the value of the {@code dstImageLayout} field. */
        @NativeType("VkImageLayout")
        public int dstImageLayout() { return VkCopyImageInfo2KHR.ndstImageLayout(address()); }
        /** Returns the value of the {@code regionCount} field. */
        @NativeType("uint32_t")
        public int regionCount() { return VkCopyImageInfo2KHR.nregionCount(address()); }
        /** Returns a {@link VkImageCopy2KHR.Buffer} view of the struct array pointed to by the {@code pRegions} field. */
        @NativeType("VkImageCopy2KHR const *")
        public VkImageCopy2KHR.Buffer pRegions() { return VkCopyImageInfo2KHR.npRegions(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkCopyImageInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyImageInfo2KHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkCopyImageInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyImageInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcImage} field. */
        public VkCopyImageInfo2KHR.Buffer srcImage(@NativeType("VkImage") long value) { VkCopyImageInfo2KHR.nsrcImage(address(), value); return this; }
        /** Sets the specified value to the {@code srcImageLayout} field. */
        public VkCopyImageInfo2KHR.Buffer srcImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageInfo2KHR.nsrcImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code dstImage} field. */
        public VkCopyImageInfo2KHR.Buffer dstImage(@NativeType("VkImage") long value) { VkCopyImageInfo2KHR.ndstImage(address(), value); return this; }
        /** Sets the specified value to the {@code dstImageLayout} field. */
        public VkCopyImageInfo2KHR.Buffer dstImageLayout(@NativeType("VkImageLayout") int value) { VkCopyImageInfo2KHR.ndstImageLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkImageCopy2KHR.Buffer} to the {@code pRegions} field. */
        public VkCopyImageInfo2KHR.Buffer pRegions(@NativeType("VkImageCopy2KHR const *") VkImageCopy2KHR.Buffer value) { VkCopyImageInfo2KHR.npRegions(address(), value); return this; }

    }

}