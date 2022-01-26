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
 * Structure specifying parameters of a newly created swapchain object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code surface} <b>must</b> be a surface that is supported by the device as determined using {@link KHRSurface#vkGetPhysicalDeviceSurfaceSupportKHR GetPhysicalDeviceSurfaceSupportKHR}</li>
 * <li>{@code minImageCount} <b>must</b> be less than or equal to the value returned in the {@code maxImageCount} member of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface if the returned {@code maxImageCount} is not zero</li>
 * <li>If {@code presentMode} is not {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} nor {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}, then {@code minImageCount} <b>must</b> be greater than or equal to the value returned in the {@code minImageCount} member of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code minImageCount} <b>must</b> be 1 if {@code presentMode} is either {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} or {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}</li>
 * <li>{@code imageFormat} and {@code imageColorSpace} <b>must</b> match the {@code format} and {@code colorSpace} members, respectively, of one of the {@link VkSurfaceFormatKHR} structures returned by {@code vkGetPhysicalDeviceSurfaceFormatsKHR} for the surface</li>
 * <li>{@code imageExtent} <b>must</b> be between {@code minImageExtent} and {@code maxImageExtent}, inclusive, where {@code minImageExtent} and {@code maxImageExtent} are members of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code imageExtent} members {@code width} and {@code height} <b>must</b> both be non-zero</li>
 * <li>{@code imageArrayLayers} <b>must</b> be greater than 0 and less than or equal to the {@code maxImageArrayLayers} member of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>If {@code presentMode} is {@link KHRSurface#VK_PRESENT_MODE_IMMEDIATE_KHR PRESENT_MODE_IMMEDIATE_KHR}, {@link KHRSurface#VK_PRESENT_MODE_MAILBOX_KHR PRESENT_MODE_MAILBOX_KHR}, {@link KHRSurface#VK_PRESENT_MODE_FIFO_KHR PRESENT_MODE_FIFO_KHR} or {@link KHRSurface#VK_PRESENT_MODE_FIFO_RELAXED_KHR PRESENT_MODE_FIFO_RELAXED_KHR}, {@code imageUsage} <b>must</b> be a subset of the supported usage flags present in the {@code supportedUsageFlags} member of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR} for {@code surface}</li>
 * <li>If {@code presentMode} is {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR} or {@link KHRSharedPresentableImage#VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR}, {@code imageUsage} <b>must</b> be a subset of the supported usage flags present in the {@code sharedPresentSupportedUsageFlags} member of the {@link VkSharedPresentSurfaceCapabilitiesKHR} structure returned by {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} for {@code surface}</li>
 * <li>If {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code pQueueFamilyIndices} <b>must</b> be a valid pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
 * <li>If {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>If {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} or {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} for the {@code physicalDevice} that was used to create {@code device}</li>
 * <li>{@code preTransform} <b>must</b> be one of the bits present in the {@code supportedTransforms} member of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code compositeAlpha} <b>must</b> be one of the bits present in the {@code supportedCompositeAlpha} member of the {@link VkSurfaceCapabilitiesKHR} structure returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR} for the surface</li>
 * <li>{@code presentMode} <b>must</b> be one of the {@code VkPresentModeKHR} values returned by {@code vkGetPhysicalDeviceSurfacePresentModesKHR} for the surface</li>
 * <li>If the logical device was created with {@link VkDeviceGroupDeviceCreateInfo}{@code ::physicalDeviceCount} equal to 1, {@code flags} <b>must</b> not contain {@link KHRSwapchain#VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR}</li>
 * <li>If {@code oldSwapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code oldSwapchain} <b>must</b> be a non-retired swapchain associated with native window referred to by {@code surface}</li>
 * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#swapchain-wsi-image-create-info">implied image creation parameters</a> of the swapchain <b>must</b> be supported as reported by {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties}</li>
 * <li>If {@code flags} contains {@link KHRSwapchainMutableFormat#VK_SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR} then the {@code pNext} chain <b>must</b> include a {@link VkImageFormatListCreateInfo} structure with a {@code viewFormatCount} greater than zero and {@code pViewFormats} <b>must</b> have an element equal to {@code imageFormat}</li>
 * <li>If a {@link VkImageFormatListCreateInfo} structure was included in the {@code pNext} chain and {@link VkImageFormatListCreateInfo}{@code ::viewFormatCount} is not zero then all of the formats in {@link VkImageFormatListCreateInfo}{@code ::pViewFormats} <b>must</b> be compatible with the {@code format} as described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#formats-compatibility">compatibility table</a></li>
 * <li>If {@code flags} does not contain {@link KHRSwapchainMutableFormat#VK_SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR} and the {@code pNext} chain include a {@link VkImageFormatListCreateInfo} structure then {@link VkImageFormatListCreateInfo}{@code ::viewFormatCount} <b>must</b> be 0 or 1</li>
 * <li>If {@code flags} contains {@link KHRSwapchain#VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR SWAPCHAIN_CREATE_PROTECTED_BIT_KHR}, then {@link VkSurfaceProtectedCapabilitiesKHR}{@code ::supportsProtected} <b>must</b> be {@link VK10#VK_TRUE TRUE} in the {@link VkSurfaceProtectedCapabilitiesKHR} structure returned by {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} for {@code surface}</li>
 * <li>If the {@code pNext} chain includes a {@link VkSurfaceFullScreenExclusiveInfoEXT} structure with its {@code fullScreenExclusive} member set to {@link EXTFullScreenExclusive#VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT}, and {@code surface} was created using {@link KHRWin32Surface#vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR}, a {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} structure <b>must</b> be included in the {@code pNext} chain</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupSwapchainCreateInfoKHR}, {@link VkImageFormatListCreateInfo}, {@link VkSurfaceFullScreenExclusiveInfoEXT}, {@link VkSurfaceFullScreenExclusiveWin32InfoEXT}, {@link VkSwapchainCounterCreateInfoEXT}, or {@link VkSwapchainDisplayNativeHdrCreateInfoAMD}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkSwapchainCreateFlagBitsKHR} values</li>
 * <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
 * <li>{@code imageFormat} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code imageColorSpace} <b>must</b> be a valid {@code VkColorSpaceKHR} value</li>
 * <li>{@code imageUsage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code imageUsage} <b>must</b> not be 0</li>
 * <li>{@code imageSharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * <li>{@code preTransform} <b>must</b> be a valid {@code VkSurfaceTransformFlagBitsKHR} value</li>
 * <li>{@code compositeAlpha} <b>must</b> be a valid {@code VkCompositeAlphaFlagBitsKHR} value</li>
 * <li>{@code presentMode} <b>must</b> be a valid {@code VkPresentModeKHR} value</li>
 * <li>If {@code oldSwapchain} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code oldSwapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
 * <li>If {@code oldSwapchain} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code surface}</li>
 * <li>Both of {@code oldSwapchain}, and {@code surface} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link KHRDisplaySwapchain#vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR}, {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSwapchainCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSwapchainCreateFlagsKHR {@link #flags};
 *     VkSurfaceKHR {@link #surface};
 *     uint32_t {@link #minImageCount};
 *     VkFormat {@link #imageFormat};
 *     VkColorSpaceKHR {@link #imageColorSpace};
 *     {@link VkExtent2D VkExtent2D} {@link #imageExtent};
 *     uint32_t {@link #imageArrayLayers};
 *     VkImageUsageFlags {@link #imageUsage};
 *     VkSharingMode {@link #imageSharingMode};
 *     uint32_t {@link #queueFamilyIndexCount};
 *     uint32_t const * {@link #pQueueFamilyIndices};
 *     VkSurfaceTransformFlagBitsKHR {@link #preTransform};
 *     VkCompositeAlphaFlagBitsKHR {@link #compositeAlpha};
 *     VkPresentModeKHR {@link #presentMode};
 *     VkBool32 {@link #clipped};
 *     VkSwapchainKHR {@link #oldSwapchain};
 * }</code></pre>
 */
public class VkSwapchainCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SURFACE,
        MINIMAGECOUNT,
        IMAGEFORMAT,
        IMAGECOLORSPACE,
        IMAGEEXTENT,
        IMAGEARRAYLAYERS,
        IMAGEUSAGE,
        IMAGESHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES,
        PRETRANSFORM,
        COMPOSITEALPHA,
        PRESENTMODE,
        CLIPPED,
        OLDSWAPCHAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SURFACE = layout.offsetof(3);
        MINIMAGECOUNT = layout.offsetof(4);
        IMAGEFORMAT = layout.offsetof(5);
        IMAGECOLORSPACE = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
        IMAGEARRAYLAYERS = layout.offsetof(8);
        IMAGEUSAGE = layout.offsetof(9);
        IMAGESHARINGMODE = layout.offsetof(10);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(11);
        PQUEUEFAMILYINDICES = layout.offsetof(12);
        PRETRANSFORM = layout.offsetof(13);
        COMPOSITEALPHA = layout.offsetof(14);
        PRESENTMODE = layout.offsetof(15);
        CLIPPED = layout.offsetof(16);
        OLDSWAPCHAIN = layout.offsetof(17);
    }

    /**
     * Creates a {@code VkSwapchainCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainCreateInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkSwapchainCreateFlagBitsKHR} indicating parameters of the swapchain creation. */
    @NativeType("VkSwapchainCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** the surface onto which the swapchain will present images. If the creation succeeds, the swapchain becomes associated with {@code surface}. */
    @NativeType("VkSurfaceKHR")
    public long surface() { return nsurface(address()); }
    /** the minimum number of presentable images that the application needs. The implementation will either create the swapchain with at least that many images, or it will fail to create the swapchain. */
    @NativeType("uint32_t")
    public int minImageCount() { return nminImageCount(address()); }
    /** a {@code VkFormat} value specifying the format the swapchain image(s) will be created with. */
    @NativeType("VkFormat")
    public int imageFormat() { return nimageFormat(address()); }
    /** a {@code VkColorSpaceKHR} value specifying the way the swapchain interprets image data. */
    @NativeType("VkColorSpaceKHR")
    public int imageColorSpace() { return nimageColorSpace(address()); }
    /**
     * the size (in pixels) of the swapchain image(s). The behavior is platform-dependent if the image extent does not match the surface’s {@code currentExtent} as returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR}.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>On some platforms, it is normal that {@code maxImageExtent} <b>may</b> become {@code (0, 0)}, for example when the window is minimized. In such a case, it is not possible to create a swapchain due to the Valid Usage requirements.</p>
     * </div>
     */
    public VkExtent2D imageExtent() { return nimageExtent(address()); }
    /** the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1. */
    @NativeType("uint32_t")
    public int imageArrayLayers() { return nimageArrayLayers(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits} describing the intended usage of the (acquired) swapchain images. */
    @NativeType("VkImageUsageFlags")
    public int imageUsage() { return nimageUsage(address()); }
    /** the sharing mode used for the image(s) of the swapchain. */
    @NativeType("VkSharingMode")
    public int imageSharingMode() { return nimageSharingMode(address()); }
    /** the number of queue families having access to the image(s) of the swapchain when {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** a pointer to an array of queue family indices having access to the images(s) of the swapchain when {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
    /** a {@code VkSurfaceTransformFlagBitsKHR} value describing the transform, relative to the presentation engine’s natural orientation, applied to the image content prior to presentation. If it does not match the {@code currentTransform} value returned by {@code vkGetPhysicalDeviceSurfaceCapabilitiesKHR}, the presentation engine will transform the image content as part of the presentation operation. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int preTransform() { return npreTransform(address()); }
    /** a {@code VkCompositeAlphaFlagBitsKHR} value indicating the alpha compositing mode to use when this surface is composited together with other surfaces on certain window systems. */
    @NativeType("VkCompositeAlphaFlagBitsKHR")
    public int compositeAlpha() { return ncompositeAlpha(address()); }
    /** the presentation mode the swapchain will use. A swapchain’s present mode determines how incoming present requests will be processed and queued internally. */
    @NativeType("VkPresentModeKHR")
    public int presentMode() { return npresentMode(address()); }
    /**
     * specifies whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface that are not visible.
     * 
     * <ul>
     * <li>If set to {@link VK10#VK_TRUE TRUE}, the presentable images associated with the swapchain <b>may</b> not own all of their pixels. Pixels in the presentable images that correspond to regions of the target surface obscured by another window on the desktop, or subject to some other clipping mechanism will have undefined content when read back. Fragment shaders <b>may</b> not execute for these pixels, and thus any side effects they would have had will not occur. Setting {@link VK10#VK_TRUE TRUE} does not guarantee any clipping will occur, but allows more efficient presentation methods to be used on some platforms.</li>
     * <li>If set to {@link VK10#VK_FALSE FALSE}, presentable images associated with the swapchain will own all of the pixels they contain.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Applications <b>should</b> set this value to {@link VK10#VK_TRUE TRUE} if they do not expect to read back the content of presentable images before presenting them or after reacquiring them, and if their fragment shaders do not have any side effects that require them to run for all pixels in the presentable image.</p>
     * </div>
     * </li>
     * </ul>
     */
    @NativeType("VkBool32")
    public boolean clipped() { return nclipped(address()) != 0; }
    /**
     * {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, or the existing non-retired swapchain currently associated with {@code surface}. Providing a valid {@code oldSwapchain} <b>may</b> aid in the resource reuse, and also allows the application to still present any images that are already acquired from it.
     * 
     * <p>Upon calling {@code vkCreateSwapchainKHR} with an {@code oldSwapchain} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code oldSwapchain} is retired — even if creation of the new swapchain fails. The new swapchain is created in the non-retired state whether or not {@code oldSwapchain} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}.</p>
     * 
     * <p>Upon calling {@code vkCreateSwapchainKHR} with an {@code oldSwapchain} that is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, any images from {@code oldSwapchain} that are not acquired by the application <b>may</b> be freed by the implementation, which <b>may</b> occur even if creation of the new swapchain fails. The application <b>can</b> destroy {@code oldSwapchain} to free all memory associated with {@code oldSwapchain}.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Multiple retired swapchains <b>can</b> be associated with the same {@code VkSurfaceKHR} through multiple uses of {@code oldSwapchain} that outnumber calls to {@link KHRSwapchain#vkDestroySwapchainKHR DestroySwapchainKHR}.</p>
     * 
     * <p>After {@code oldSwapchain} is retired, the application <b>can</b> pass to {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} any images it had already acquired from {@code oldSwapchain}. E.g., an application may present an image from the old swapchain before an image from the new swapchain is ready to be presented. As usual, {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} <b>may</b> fail if {@code oldSwapchain} has entered a state that causes {@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR} to be returned.</p>
     * 
     * <p>The application <b>can</b> continue to use a shared presentable image obtained from {@code oldSwapchain} until a presentable image is acquired from the new swapchain, as long as it has not entered a state that causes it to return {@link KHRSwapchain#VK_ERROR_OUT_OF_DATE_KHR ERROR_OUT_OF_DATE_KHR}.</p>
     * </div>
     */
    @NativeType("VkSwapchainKHR")
    public long oldSwapchain() { return noldSwapchain(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSwapchainCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkSwapchainCreateInfoKHR sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSwapchainCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDeviceGroupSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkDeviceGroupSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceFullScreenExclusiveInfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSurfaceFullScreenExclusiveInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainCounterCreateInfoEXT} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainCounterCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSwapchainDisplayNativeHdrCreateInfoAMD} value to the {@code pNext} chain. */
    public VkSwapchainCreateInfoKHR pNext(VkSwapchainDisplayNativeHdrCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #flags} field. */
    public VkSwapchainCreateInfoKHR flags(@NativeType("VkSwapchainCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #surface} field. */
    public VkSwapchainCreateInfoKHR surface(@NativeType("VkSurfaceKHR") long value) { nsurface(address(), value); return this; }
    /** Sets the specified value to the {@link #minImageCount} field. */
    public VkSwapchainCreateInfoKHR minImageCount(@NativeType("uint32_t") int value) { nminImageCount(address(), value); return this; }
    /** Sets the specified value to the {@link #imageFormat} field. */
    public VkSwapchainCreateInfoKHR imageFormat(@NativeType("VkFormat") int value) { nimageFormat(address(), value); return this; }
    /** Sets the specified value to the {@link #imageColorSpace} field. */
    public VkSwapchainCreateInfoKHR imageColorSpace(@NativeType("VkColorSpaceKHR") int value) { nimageColorSpace(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #imageExtent} field. */
    public VkSwapchainCreateInfoKHR imageExtent(VkExtent2D value) { nimageExtent(address(), value); return this; }
    /** Passes the {@link #imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSwapchainCreateInfoKHR imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }
    /** Sets the specified value to the {@link #imageArrayLayers} field. */
    public VkSwapchainCreateInfoKHR imageArrayLayers(@NativeType("uint32_t") int value) { nimageArrayLayers(address(), value); return this; }
    /** Sets the specified value to the {@link #imageUsage} field. */
    public VkSwapchainCreateInfoKHR imageUsage(@NativeType("VkImageUsageFlags") int value) { nimageUsage(address(), value); return this; }
    /** Sets the specified value to the {@link #imageSharingMode} field. */
    public VkSwapchainCreateInfoKHR imageSharingMode(@NativeType("VkSharingMode") int value) { nimageSharingMode(address(), value); return this; }
    /** Sets the specified value to the {@link #queueFamilyIndexCount} field. */
    public VkSwapchainCreateInfoKHR queueFamilyIndexCount(@NativeType("uint32_t") int value) { nqueueFamilyIndexCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pQueueFamilyIndices} field. */
    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
    /** Sets the specified value to the {@link #preTransform} field. */
    public VkSwapchainCreateInfoKHR preTransform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { npreTransform(address(), value); return this; }
    /** Sets the specified value to the {@link #compositeAlpha} field. */
    public VkSwapchainCreateInfoKHR compositeAlpha(@NativeType("VkCompositeAlphaFlagBitsKHR") int value) { ncompositeAlpha(address(), value); return this; }
    /** Sets the specified value to the {@link #presentMode} field. */
    public VkSwapchainCreateInfoKHR presentMode(@NativeType("VkPresentModeKHR") int value) { npresentMode(address(), value); return this; }
    /** Sets the specified value to the {@link #clipped} field. */
    public VkSwapchainCreateInfoKHR clipped(@NativeType("VkBool32") boolean value) { nclipped(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #oldSwapchain} field. */
    public VkSwapchainCreateInfoKHR oldSwapchain(@NativeType("VkSwapchainKHR") long value) { noldSwapchain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long surface,
        int minImageCount,
        int imageFormat,
        int imageColorSpace,
        VkExtent2D imageExtent,
        int imageArrayLayers,
        int imageUsage,
        int imageSharingMode,
        int queueFamilyIndexCount,
        @Nullable IntBuffer pQueueFamilyIndices,
        int preTransform,
        int compositeAlpha,
        int presentMode,
        boolean clipped,
        long oldSwapchain
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        surface(surface);
        minImageCount(minImageCount);
        imageFormat(imageFormat);
        imageColorSpace(imageColorSpace);
        imageExtent(imageExtent);
        imageArrayLayers(imageArrayLayers);
        imageUsage(imageUsage);
        imageSharingMode(imageSharingMode);
        queueFamilyIndexCount(queueFamilyIndexCount);
        pQueueFamilyIndices(pQueueFamilyIndices);
        preTransform(preTransform);
        compositeAlpha(compositeAlpha);
        presentMode(presentMode);
        clipped(clipped);
        oldSwapchain(oldSwapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainCreateInfoKHR set(VkSwapchainCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainCreateInfoKHR malloc() {
        return wrap(VkSwapchainCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainCreateInfoKHR calloc() {
        return wrap(VkSwapchainCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSwapchainCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainCreateInfoKHR} instance for the specified memory address. */
    public static VkSwapchainCreateInfoKHR create(long address) {
        return wrap(VkSwapchainCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSwapchainCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSwapchainCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSwapchainCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(VkSwapchainCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(VkSwapchainCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #surface}. */
    public static long nsurface(long struct) { return UNSAFE.getLong(null, struct + VkSwapchainCreateInfoKHR.SURFACE); }
    /** Unsafe version of {@link #minImageCount}. */
    public static int nminImageCount(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT); }
    /** Unsafe version of {@link #imageFormat}. */
    public static int nimageFormat(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT); }
    /** Unsafe version of {@link #imageColorSpace}. */
    public static int nimageColorSpace(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent2D nimageExtent(long struct) { return VkExtent2D.create(struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT); }
    /** Unsafe version of {@link #imageArrayLayers}. */
    public static int nimageArrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #imageUsage}. */
    public static int nimageUsage(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE); }
    /** Unsafe version of {@link #imageSharingMode}. */
    public static int nimageSharingMode(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    @Nullable public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
    /** Unsafe version of {@link #preTransform}. */
    public static int npreTransform(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.PRETRANSFORM); }
    /** Unsafe version of {@link #compositeAlpha}. */
    public static int ncompositeAlpha(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA); }
    /** Unsafe version of {@link #presentMode}. */
    public static int npresentMode(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.PRESENTMODE); }
    /** Unsafe version of {@link #clipped}. */
    public static int nclipped(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCreateInfoKHR.CLIPPED); }
    /** Unsafe version of {@link #oldSwapchain}. */
    public static long noldSwapchain(long struct) { return UNSAFE.getLong(null, struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #surface(long) surface}. */
    public static void nsurface(long struct, long value) { UNSAFE.putLong(null, struct + VkSwapchainCreateInfoKHR.SURFACE, value); }
    /** Unsafe version of {@link #minImageCount(int) minImageCount}. */
    public static void nminImageCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT, value); }
    /** Unsafe version of {@link #imageFormat(int) imageFormat}. */
    public static void nimageFormat(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT, value); }
    /** Unsafe version of {@link #imageColorSpace(int) imageColorSpace}. */
    public static void nimageColorSpace(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE, value); }
    /** Unsafe version of {@link #imageExtent(VkExtent2D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #imageArrayLayers(int) imageArrayLayers}. */
    public static void nimageArrayLayers(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS, value); }
    /** Unsafe version of {@link #imageUsage(int) imageUsage}. */
    public static void nimageUsage(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE, value); }
    /** Unsafe version of {@link #imageSharingMode(int) imageSharingMode}. */
    public static void nimageSharingMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES, memAddressSafe(value)); if (value != null) { nqueueFamilyIndexCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #preTransform(int) preTransform}. */
    public static void npreTransform(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.PRETRANSFORM, value); }
    /** Unsafe version of {@link #compositeAlpha(int) compositeAlpha}. */
    public static void ncompositeAlpha(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA, value); }
    /** Unsafe version of {@link #presentMode(int) presentMode}. */
    public static void npresentMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.PRESENTMODE, value); }
    /** Unsafe version of {@link #clipped(boolean) clipped}. */
    public static void nclipped(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCreateInfoKHR.CLIPPED, value); }
    /** Unsafe version of {@link #oldSwapchain(long) oldSwapchain}. */
    public static void noldSwapchain(long struct, long value) { UNSAFE.putLong(null, struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkSwapchainCreateInfoKHR ELEMENT_FACTORY = VkSwapchainCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSwapchainCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSwapchainCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSwapchainCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#flags} field. */
        @NativeType("VkSwapchainCreateFlagsKHR")
        public int flags() { return VkSwapchainCreateInfoKHR.nflags(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#surface} field. */
        @NativeType("VkSurfaceKHR")
        public long surface() { return VkSwapchainCreateInfoKHR.nsurface(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#minImageCount} field. */
        @NativeType("uint32_t")
        public int minImageCount() { return VkSwapchainCreateInfoKHR.nminImageCount(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#imageFormat} field. */
        @NativeType("VkFormat")
        public int imageFormat() { return VkSwapchainCreateInfoKHR.nimageFormat(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#imageColorSpace} field. */
        @NativeType("VkColorSpaceKHR")
        public int imageColorSpace() { return VkSwapchainCreateInfoKHR.nimageColorSpace(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkSwapchainCreateInfoKHR#imageExtent} field. */
        public VkExtent2D imageExtent() { return VkSwapchainCreateInfoKHR.nimageExtent(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#imageArrayLayers} field. */
        @NativeType("uint32_t")
        public int imageArrayLayers() { return VkSwapchainCreateInfoKHR.nimageArrayLayers(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#imageUsage} field. */
        @NativeType("VkImageUsageFlags")
        public int imageUsage() { return VkSwapchainCreateInfoKHR.nimageUsage(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#imageSharingMode} field. */
        @NativeType("VkSharingMode")
        public int imageSharingMode() { return VkSwapchainCreateInfoKHR.nimageSharingMode(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkSwapchainCreateInfoKHR#pQueueFamilyIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() { return VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#preTransform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int preTransform() { return VkSwapchainCreateInfoKHR.npreTransform(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#compositeAlpha} field. */
        @NativeType("VkCompositeAlphaFlagBitsKHR")
        public int compositeAlpha() { return VkSwapchainCreateInfoKHR.ncompositeAlpha(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#presentMode} field. */
        @NativeType("VkPresentModeKHR")
        public int presentMode() { return VkSwapchainCreateInfoKHR.npresentMode(address()); }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#clipped} field. */
        @NativeType("VkBool32")
        public boolean clipped() { return VkSwapchainCreateInfoKHR.nclipped(address()) != 0; }
        /** @return the value of the {@link VkSwapchainCreateInfoKHR#oldSwapchain} field. */
        @NativeType("VkSwapchainKHR")
        public long oldSwapchain() { return VkSwapchainCreateInfoKHR.noldSwapchain(address()); }

        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#sType} field. */
        public VkSwapchainCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchain#VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR} value to the {@link VkSwapchainCreateInfoKHR#sType} field. */
        public VkSwapchainCreateInfoKHR.Buffer sType$Default() { return sType(KHRSwapchain.VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#pNext} field. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDeviceGroupSwapchainCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkDeviceGroupSwapchainCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfo} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkImageFormatListCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkImageFormatListCreateInfoKHR} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkImageFormatListCreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceFullScreenExclusiveInfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSurfaceFullScreenExclusiveInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainCounterCreateInfoEXT} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainCounterCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSwapchainDisplayNativeHdrCreateInfoAMD} value to the {@code pNext} chain. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(VkSwapchainDisplayNativeHdrCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#flags} field. */
        public VkSwapchainCreateInfoKHR.Buffer flags(@NativeType("VkSwapchainCreateFlagsKHR") int value) { VkSwapchainCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#surface} field. */
        public VkSwapchainCreateInfoKHR.Buffer surface(@NativeType("VkSurfaceKHR") long value) { VkSwapchainCreateInfoKHR.nsurface(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#minImageCount} field. */
        public VkSwapchainCreateInfoKHR.Buffer minImageCount(@NativeType("uint32_t") int value) { VkSwapchainCreateInfoKHR.nminImageCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#imageFormat} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageFormat(@NativeType("VkFormat") int value) { VkSwapchainCreateInfoKHR.nimageFormat(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#imageColorSpace} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageColorSpace(@NativeType("VkColorSpaceKHR") int value) { VkSwapchainCreateInfoKHR.nimageColorSpace(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkSwapchainCreateInfoKHR#imageExtent} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageExtent(VkExtent2D value) { VkSwapchainCreateInfoKHR.nimageExtent(address(), value); return this; }
        /** Passes the {@link VkSwapchainCreateInfoKHR#imageExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSwapchainCreateInfoKHR.Buffer imageExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(imageExtent()); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#imageArrayLayers} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageArrayLayers(@NativeType("uint32_t") int value) { VkSwapchainCreateInfoKHR.nimageArrayLayers(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#imageUsage} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageUsage(@NativeType("VkImageUsageFlags") int value) { VkSwapchainCreateInfoKHR.nimageUsage(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#imageSharingMode} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageSharingMode(@NativeType("VkSharingMode") int value) { VkSwapchainCreateInfoKHR.nimageSharingMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#queueFamilyIndexCount} field. */
        public VkSwapchainCreateInfoKHR.Buffer queueFamilyIndexCount(@NativeType("uint32_t") int value) { VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkSwapchainCreateInfoKHR#pQueueFamilyIndices} field. */
        public VkSwapchainCreateInfoKHR.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#preTransform} field. */
        public VkSwapchainCreateInfoKHR.Buffer preTransform(@NativeType("VkSurfaceTransformFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.npreTransform(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#compositeAlpha} field. */
        public VkSwapchainCreateInfoKHR.Buffer compositeAlpha(@NativeType("VkCompositeAlphaFlagBitsKHR") int value) { VkSwapchainCreateInfoKHR.ncompositeAlpha(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#presentMode} field. */
        public VkSwapchainCreateInfoKHR.Buffer presentMode(@NativeType("VkPresentModeKHR") int value) { VkSwapchainCreateInfoKHR.npresentMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#clipped} field. */
        public VkSwapchainCreateInfoKHR.Buffer clipped(@NativeType("VkBool32") boolean value) { VkSwapchainCreateInfoKHR.nclipped(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkSwapchainCreateInfoKHR#oldSwapchain} field. */
        public VkSwapchainCreateInfoKHR.Buffer oldSwapchain(@NativeType("VkSwapchainKHR") long value) { VkSwapchainCreateInfoKHR.noldSwapchain(address(), value); return this; }

    }

}