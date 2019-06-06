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
 * Structure specifying the parameters of an image memory barrier.
 * 
 * <h5>Description</h5>
 * 
 * <p>The first <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified image subresource range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a> specified by {@code srcAccessMask}. If {@code srcAccessMask} includes {@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT}, memory writes performed by that access type are also made visible, as that access type is not performed through a resource.</p>
 * 
 * <p>The second <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-dependencies-access-scopes">access scope</a> is limited to access to memory through the specified image subresource range, via access types in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a> specified by {@code dstAccessMask}. If {@code dstAccessMask} includes {@link VK10#VK_ACCESS_HOST_WRITE_BIT ACCESS_HOST_WRITE_BIT} or {@link VK10#VK_ACCESS_HOST_READ_BIT ACCESS_HOST_READ_BIT}, available memory writes are also made visible to accesses of those types, as those access types are not performed through a resource.</p>
 * 
 * <p>If {@code srcQueueFamilyIndex} is not equal to {@code dstQueueFamilyIndex}, and {@code srcQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-queue-transfers-release">queue family release operation</a> for the specified image subresource range, and the second access scope includes no access, as if {@code dstAccessMask} was 0.</p>
 * 
 * <p>If {@code dstQueueFamilyIndex} is not equal to {@code srcQueueFamilyIndex}, and {@code dstQueueFamilyIndex} is equal to the current queue family, then the memory barrier defines a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-queue-transfers-acquire">queue family acquire operation</a> for the specified image subresource range, and the first access scope includes no access, as if {@code srcAccessMask} was 0.</p>
 * 
 * <p>If {@code oldLayout} is not equal to {@code newLayout}, then the memory barrier defines an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a> for the specified image subresource range.</p>
 * 
 * <p>Layout transitions that are performed via image memory barriers execute in their entirety in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-submission-order">submission order</a>, relative to other image layout transitions submitted to the same queue, including those performed by <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#renderpass">render passes</a>. In effect there is an implicit execution dependency from each such layout transition to all layout transitions previously submitted to the same queue.</p>
 * 
 * <p>The image layout of each image subresource of a depth/stencil image created with {@link EXTSampleLocations#VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT} is dependent on the last sample locations used to render to the image subresource as a depth/stencil attachment, thus when the {@code image} member of an {@link VkImageMemoryBarrier} is an image created with this flag the application <b>can</b> chain a {@link VkSampleLocationsInfoEXT} structure to the {@code pNext} chain of {@link VkImageMemoryBarrier} to specify the sample locations to use during the image layout transition.</p>
 * 
 * <p>If the {@link VkSampleLocationsInfoEXT} structure in the {@code pNext} chain of {@link VkImageMemoryBarrier} does not match the sample location state last used to render to the image subresource range specified by {@code subresourceRange} or if no {@link VkSampleLocationsInfoEXT} structure is in the {@code pNext} chain of {@link VkImageMemoryBarrier} then the contents of the given image subresource range becomes undefined as if {@code oldLayout} would equal {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED}.</p>
 * 
 * <p>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then including {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT} in the {@code aspectMask} member of {@code subresourceRange} is equivalent to including {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, and (for three-plane formats only) {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code oldLayout} <b>must</b> be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or the current layout of the image subresources affected by the barrier</li>
 * <li>{@code newLayout} <b>must</b> not be {@link VK10#VK_IMAGE_LAYOUT_UNDEFINED IMAGE_LAYOUT_UNDEFINED} or {@link VK10#VK_IMAGE_LAYOUT_PREINITIALIZED IMAGE_LAYOUT_PREINITIALIZED}</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, at least one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, and one of {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} is {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}, the other <b>must</b> be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED} or a special queue family reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a>.</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE} and {@code srcQueueFamilyIndex} is {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}, {@code dstQueueFamilyIndex} <b>must</b> also be {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}.</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE} and {@code srcQueueFamilyIndex} is not {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}, it <b>must</b> be a valid queue family or a special queue family reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a>.</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE} and {@code dstQueueFamilyIndex} is not {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}, it <b>must</b> be a valid queue family or a special queue family reserved for external memory transfers, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-queue-transfers">Queue Family Ownership Transfer</a>.</li>
 * <li>If {@code image} was created with a sharing mode of {@link VK10#VK_SHARING_MODE_EXCLUSIVE SHARING_MODE_EXCLUSIVE}, and {@code srcQueueFamilyIndex} and {@code dstQueueFamilyIndex} are not {@link VK10#VK_QUEUE_FAMILY_IGNORED QUEUE_FAMILY_IGNORED}, at least one of them <b>must</b> be the same as the family of the queue that will execute this barrier</li>
 * <li>{@code subresourceRange.baseMipLevel} <b>must</b> be less than the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.levelCount} is not {@link VK10#VK_REMAINING_MIP_LEVELS REMAINING_MIP_LEVELS}, <code>subresourceRange.baseMipLevel + subresourceRange.levelCount</code> <b>must</b> be less than or equal to the {@code mipLevels} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>{@code subresourceRange.baseArrayLayer} <b>must</b> be less than the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code subresourceRange.layerCount} is not {@link VK10#VK_REMAINING_ARRAY_LAYERS REMAINING_ARRAY_LAYERS}, <code>subresourceRange.baseArrayLayer subresourceRange.layerCount</code> <b>must</b> be less than or equal to the {@code arrayLayers} specified in {@link VkImageCreateInfo} when {@code image} was created</li>
 * <li>If {@code image} has a depth/stencil format with both depth and stencil components, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include both {@link VK10#VK_IMAGE_ASPECT_DEPTH_BIT IMAGE_ASPECT_DEPTH_BIT} and {@link VK10#VK_IMAGE_ASPECT_STENCIL_BIT IMAGE_ASPECT_STENCIL_BIT}</li>
 * <li>If {@code image} has a single-plane color format or is not <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> be {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a multi-planar format and the image is <em>disjoint</em>, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> include either at least one of {@link VK11#VK_IMAGE_ASPECT_PLANE_0_BIT IMAGE_ASPECT_PLANE_0_BIT}, {@link VK11#VK_IMAGE_ASPECT_PLANE_1_BIT IMAGE_ASPECT_PLANE_1_BIT}, and {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}; or <b>must</b> include {@link VK10#VK_IMAGE_ASPECT_COLOR_BIT IMAGE_ASPECT_COLOR_BIT}</li>
 * <li>If {@code image} has a multi-planar format with only two planes, then the {@code aspectMask} member of {@code subresourceRange} <b>must</b> not include {@link VK11#VK_IMAGE_ASPECT_PLANE_2_BIT IMAGE_ASPECT_PLANE_2_BIT}</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT IMAGE_USAGE_COLOR_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK11#VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_SAMPLED_BIT IMAGE_USAGE_SAMPLED_BIT} or {@link VK10#VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT IMAGE_USAGE_INPUT_ATTACHMENT_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_SRC_BIT IMAGE_USAGE_TRANSFER_SRC_BIT} set</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link VK10#VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL} then {@code image} <b>must</b> have been created with {@link VK10#VK_IMAGE_USAGE_TRANSFER_DST_BIT IMAGE_USAGE_TRANSFER_DST_BIT} set</li>
 * <li>If {@code image} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * <li>If either {@code oldLayout} or {@code newLayout} is {@link NVShadingRateImage#VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV} then {@code image} <b>must</b> have been created with {@link NVShadingRateImage#VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV} set</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkSampleLocationsInfoEXT}</li>
 * <li>{@code srcAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code dstAccessMask} <b>must</b> be a valid combination of {@code VkAccessFlagBits} values</li>
 * <li>{@code oldLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code newLayout} <b>must</b> be a valid {@code VkImageLayout} value</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code subresourceRange} <b>must</b> be a valid {@link VkImageSubresourceRange} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkImageSubresourceRange}, {@link VK10#vkCmdPipelineBarrier CmdPipelineBarrier}, {@link VK10#vkCmdWaitEvents CmdWaitEvents}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code srcAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-access-masks">source access mask</a>.</li>
 * <li>{@code dstAccessMask} &ndash; a bitmask of {@code VkAccessFlagBits} specifying a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-access-masks">destination access mask</a>.</li>
 * <li>{@code oldLayout} &ndash; the old layout in an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>.</li>
 * <li>{@code newLayout} &ndash; the new layout in an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-image-layout-transitions">image layout transition</a>.</li>
 * <li>{@code srcQueueFamilyIndex} &ndash; the source queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>.</li>
 * <li>{@code dstQueueFamilyIndex} &ndash; the destination queue family for a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#synchronization-queue-transfers">queue family ownership transfer</a>.</li>
 * <li>{@code image} &ndash; a handle to the image affected by this barrier.</li>
 * <li>{@code subresourceRange} &ndash; describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#resources-image-views">image subresource range</a> within {@code image} that is affected by this barrier.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageMemoryBarrier {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkImageLayout oldLayout;
 *     VkImageLayout newLayout;
 *     uint32_t srcQueueFamilyIndex;
 *     uint32_t dstQueueFamilyIndex;
 *     VkImage image;
 *     {@link VkImageSubresourceRange VkImageSubresourceRange} subresourceRange;
 * }</code></pre>
 */
public class VkImageMemoryBarrier extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCACCESSMASK,
        DSTACCESSMASK,
        OLDLAYOUT,
        NEWLAYOUT,
        SRCQUEUEFAMILYINDEX,
        DSTQUEUEFAMILYINDEX,
        IMAGE,
        SUBRESOURCERANGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(VkImageSubresourceRange.SIZEOF, VkImageSubresourceRange.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCACCESSMASK = layout.offsetof(2);
        DSTACCESSMASK = layout.offsetof(3);
        OLDLAYOUT = layout.offsetof(4);
        NEWLAYOUT = layout.offsetof(5);
        SRCQUEUEFAMILYINDEX = layout.offsetof(6);
        DSTQUEUEFAMILYINDEX = layout.offsetof(7);
        IMAGE = layout.offsetof(8);
        SUBRESOURCERANGE = layout.offsetof(9);
    }

    /**
     * Creates a {@code VkImageMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageMemoryBarrier(ByteBuffer container) {
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
    /** Returns the value of the {@code srcAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int srcAccessMask() { return nsrcAccessMask(address()); }
    /** Returns the value of the {@code dstAccessMask} field. */
    @NativeType("VkAccessFlags")
    public int dstAccessMask() { return ndstAccessMask(address()); }
    /** Returns the value of the {@code oldLayout} field. */
    @NativeType("VkImageLayout")
    public int oldLayout() { return noldLayout(address()); }
    /** Returns the value of the {@code newLayout} field. */
    @NativeType("VkImageLayout")
    public int newLayout() { return nnewLayout(address()); }
    /** Returns the value of the {@code srcQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int srcQueueFamilyIndex() { return nsrcQueueFamilyIndex(address()); }
    /** Returns the value of the {@code dstQueueFamilyIndex} field. */
    @NativeType("uint32_t")
    public int dstQueueFamilyIndex() { return ndstQueueFamilyIndex(address()); }
    /** Returns the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
    public VkImageSubresourceRange subresourceRange() { return nsubresourceRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageMemoryBarrier sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageMemoryBarrier pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcAccessMask} field. */
    public VkImageMemoryBarrier srcAccessMask(@NativeType("VkAccessFlags") int value) { nsrcAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code dstAccessMask} field. */
    public VkImageMemoryBarrier dstAccessMask(@NativeType("VkAccessFlags") int value) { ndstAccessMask(address(), value); return this; }
    /** Sets the specified value to the {@code oldLayout} field. */
    public VkImageMemoryBarrier oldLayout(@NativeType("VkImageLayout") int value) { noldLayout(address(), value); return this; }
    /** Sets the specified value to the {@code newLayout} field. */
    public VkImageMemoryBarrier newLayout(@NativeType("VkImageLayout") int value) { nnewLayout(address(), value); return this; }
    /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
    public VkImageMemoryBarrier srcQueueFamilyIndex(@NativeType("uint32_t") int value) { nsrcQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
    public VkImageMemoryBarrier dstQueueFamilyIndex(@NativeType("uint32_t") int value) { ndstQueueFamilyIndex(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkImageMemoryBarrier image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
    public VkImageMemoryBarrier subresourceRange(VkImageSubresourceRange value) { nsubresourceRange(address(), value); return this; }
    /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageMemoryBarrier subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageMemoryBarrier set(
        int sType,
        long pNext,
        int srcAccessMask,
        int dstAccessMask,
        int oldLayout,
        int newLayout,
        int srcQueueFamilyIndex,
        int dstQueueFamilyIndex,
        long image,
        VkImageSubresourceRange subresourceRange
    ) {
        sType(sType);
        pNext(pNext);
        srcAccessMask(srcAccessMask);
        dstAccessMask(dstAccessMask);
        oldLayout(oldLayout);
        newLayout(newLayout);
        srcQueueFamilyIndex(srcQueueFamilyIndex);
        dstQueueFamilyIndex(dstQueueFamilyIndex);
        image(image);
        subresourceRange(subresourceRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageMemoryBarrier set(VkImageMemoryBarrier src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier malloc() {
        return wrap(VkImageMemoryBarrier.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageMemoryBarrier calloc() {
        return wrap(VkImageMemoryBarrier.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated with {@link BufferUtils}. */
    public static VkImageMemoryBarrier create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkImageMemoryBarrier.class, memAddress(container), container);
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance for the specified memory address. */
    public static VkImageMemoryBarrier create(long address) {
        return wrap(VkImageMemoryBarrier.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier createSafe(long address) {
        return address == NULL ? null : wrap(VkImageMemoryBarrier.class, address);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkImageMemoryBarrier.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageMemoryBarrier.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkImageMemoryBarrier mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkImageMemoryBarrier} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkImageMemoryBarrier callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier mallocStack(MemoryStack stack) {
        return wrap(VkImageMemoryBarrier.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkImageMemoryBarrier} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageMemoryBarrier callocStack(MemoryStack stack) {
        return wrap(VkImageMemoryBarrier.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageMemoryBarrier.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageMemoryBarrier.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageMemoryBarrier.PNEXT); }
    /** Unsafe version of {@link #srcAccessMask}. */
    public static int nsrcAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.SRCACCESSMASK); }
    /** Unsafe version of {@link #dstAccessMask}. */
    public static int ndstAccessMask(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.DSTACCESSMASK); }
    /** Unsafe version of {@link #oldLayout}. */
    public static int noldLayout(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.OLDLAYOUT); }
    /** Unsafe version of {@link #newLayout}. */
    public static int nnewLayout(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.NEWLAYOUT); }
    /** Unsafe version of {@link #srcQueueFamilyIndex}. */
    public static int nsrcQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #dstQueueFamilyIndex}. */
    public static int ndstQueueFamilyIndex(long struct) { return UNSAFE.getInt(null, struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkImageMemoryBarrier.IMAGE); }
    /** Unsafe version of {@link #subresourceRange}. */
    public static VkImageSubresourceRange nsubresourceRange(long struct) { return VkImageSubresourceRange.create(struct + VkImageMemoryBarrier.SUBRESOURCERANGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageMemoryBarrier.PNEXT, value); }
    /** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
    public static void nsrcAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.SRCACCESSMASK, value); }
    /** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
    public static void ndstAccessMask(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.DSTACCESSMASK, value); }
    /** Unsafe version of {@link #oldLayout(int) oldLayout}. */
    public static void noldLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.OLDLAYOUT, value); }
    /** Unsafe version of {@link #newLayout(int) newLayout}. */
    public static void nnewLayout(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.NEWLAYOUT, value); }
    /** Unsafe version of {@link #srcQueueFamilyIndex(int) srcQueueFamilyIndex}. */
    public static void nsrcQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.SRCQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #dstQueueFamilyIndex(int) dstQueueFamilyIndex}. */
    public static void ndstQueueFamilyIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkImageMemoryBarrier.DSTQUEUEFAMILYINDEX, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkImageMemoryBarrier.IMAGE, value); }
    /** Unsafe version of {@link #subresourceRange(VkImageSubresourceRange) subresourceRange}. */
    public static void nsubresourceRange(long struct, VkImageSubresourceRange value) { memCopy(value.address(), struct + VkImageMemoryBarrier.SUBRESOURCERANGE, VkImageSubresourceRange.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageMemoryBarrier} structs. */
    public static class Buffer extends StructBuffer<VkImageMemoryBarrier, Buffer> implements NativeResource {

        private static final VkImageMemoryBarrier ELEMENT_FACTORY = VkImageMemoryBarrier.create(-1L);

        /**
         * Creates a new {@code VkImageMemoryBarrier.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
        protected VkImageMemoryBarrier getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageMemoryBarrier.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageMemoryBarrier.npNext(address()); }
        /** Returns the value of the {@code srcAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int srcAccessMask() { return VkImageMemoryBarrier.nsrcAccessMask(address()); }
        /** Returns the value of the {@code dstAccessMask} field. */
        @NativeType("VkAccessFlags")
        public int dstAccessMask() { return VkImageMemoryBarrier.ndstAccessMask(address()); }
        /** Returns the value of the {@code oldLayout} field. */
        @NativeType("VkImageLayout")
        public int oldLayout() { return VkImageMemoryBarrier.noldLayout(address()); }
        /** Returns the value of the {@code newLayout} field. */
        @NativeType("VkImageLayout")
        public int newLayout() { return VkImageMemoryBarrier.nnewLayout(address()); }
        /** Returns the value of the {@code srcQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int srcQueueFamilyIndex() { return VkImageMemoryBarrier.nsrcQueueFamilyIndex(address()); }
        /** Returns the value of the {@code dstQueueFamilyIndex} field. */
        @NativeType("uint32_t")
        public int dstQueueFamilyIndex() { return VkImageMemoryBarrier.ndstQueueFamilyIndex(address()); }
        /** Returns the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkImageMemoryBarrier.nimage(address()); }
        /** Returns a {@link VkImageSubresourceRange} view of the {@code subresourceRange} field. */
        public VkImageSubresourceRange subresourceRange() { return VkImageMemoryBarrier.nsubresourceRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageMemoryBarrier.Buffer sType(@NativeType("VkStructureType") int value) { VkImageMemoryBarrier.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageMemoryBarrier.Buffer pNext(@NativeType("void const *") long value) { VkImageMemoryBarrier.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcAccessMask} field. */
        public VkImageMemoryBarrier.Buffer srcAccessMask(@NativeType("VkAccessFlags") int value) { VkImageMemoryBarrier.nsrcAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code dstAccessMask} field. */
        public VkImageMemoryBarrier.Buffer dstAccessMask(@NativeType("VkAccessFlags") int value) { VkImageMemoryBarrier.ndstAccessMask(address(), value); return this; }
        /** Sets the specified value to the {@code oldLayout} field. */
        public VkImageMemoryBarrier.Buffer oldLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier.noldLayout(address(), value); return this; }
        /** Sets the specified value to the {@code newLayout} field. */
        public VkImageMemoryBarrier.Buffer newLayout(@NativeType("VkImageLayout") int value) { VkImageMemoryBarrier.nnewLayout(address(), value); return this; }
        /** Sets the specified value to the {@code srcQueueFamilyIndex} field. */
        public VkImageMemoryBarrier.Buffer srcQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier.nsrcQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code dstQueueFamilyIndex} field. */
        public VkImageMemoryBarrier.Buffer dstQueueFamilyIndex(@NativeType("uint32_t") int value) { VkImageMemoryBarrier.ndstQueueFamilyIndex(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkImageMemoryBarrier.Buffer image(@NativeType("VkImage") long value) { VkImageMemoryBarrier.nimage(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceRange} to the {@code subresourceRange} field. */
        public VkImageMemoryBarrier.Buffer subresourceRange(VkImageSubresourceRange value) { VkImageMemoryBarrier.nsubresourceRange(address(), value); return this; }
        /** Passes the {@code subresourceRange} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageMemoryBarrier.Buffer subresourceRange(java.util.function.Consumer<VkImageSubresourceRange> consumer) { consumer.accept(subresourceRange()); return this; }

    }

}