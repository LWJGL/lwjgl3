/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.vulkan.khronos;

import org.joml.*;
import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.vma.*;
import org.lwjgl.vulkan.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.shaderc.Shaderc.*;
import static org.lwjgl.util.vma.Vma.*;
import static org.lwjgl.vulkan.EXTDebugUtils.*;
import static org.lwjgl.vulkan.KHRGetPhysicalDeviceProperties2.*;
import static org.lwjgl.vulkan.KHRPortabilityEnumeration.*;
import static org.lwjgl.vulkan.KHRPortabilitySubset.*;
import static org.lwjgl.vulkan.KHRSurface.*;
import static org.lwjgl.vulkan.KHRSwapchain.*;
import static org.lwjgl.vulkan.VK10.*;

/* Copyright (c) 2018-2025, Arm Limited and Contributors
 * Copyright (c) 2025, Sascha Willems
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 the "License";
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/** Simple Vulkan demo.
 *
 * <p>Ported from <a href="https://github.com/KhronosGroup/Vulkan-Samples/tree/main/samples/api/hello_triangle">hello_triangle</a> in Vulkan-Samples.</p>
 */
public class HelloTriangle extends Demo {

    static {
        if (VK_DEBUG) {
            Configuration.DEBUG_MEMORY_ALLOCATOR.set(true);
            Configuration.DEBUG_STACK.set(true);
        }
    }

    /**
     * Vulkan objects and global state
     */
    private static class Context {
        /// The Vulkan instance.
        VkInstance instance;

        /// The Vulkan physical device.
        VkPhysicalDevice gpu;

        /// The Vulkan device.
        VkDevice device;

        /// The Vulkan device queue.
        VkQueue queue;

        /// The swapchain.
        long swapchain;

        /// The swapchain dimensions.
        SwapchainDimensions swapchain_dimensions = new SwapchainDimensions(0, 0, VK_FORMAT_UNDEFINED);

        /// The surface we will render to.
        long surface;

        /// The queue family index where graphics work will be submitted.
        int graphics_queue_index = -1;

        /// The image view for each swapchain image.
        List<Long> swapchain_image_views = new ArrayList<>();

        /// The framebuffer for each swapchain image view.
        List<Long> swapchain_framebuffers = new ArrayList<>();

        /// The renderpass description.
        long render_pass;

        /// The graphics pipeline.
        long pipeline;

        /**
         * The pipeline layout for resources.
         * Not used in this sample, but we still need to provide a dummy one.
         */
        long pipeline_layout;

        /// The debug utility callback.
        long debug_callback;

        /// A set of semaphores that can be reused.
        List<Long> recycled_semaphores = new ArrayList<>();

        /// A set of per-frame data.
        PerFrame[] per_frame = new PerFrame[0];

        long vma_allocator;
    }

    private final Context context = new Context();

    Instance vk_instance;

    /// The Vulkan buffer object that holds the vertex data for the triangle.
    long vertex_buffer;

    /// Vulkan Memory Allocator (VMA) allocation info for the vertex buffer.
    long vertex_buffer_allocation;

    VkDebugUtilsMessengerCallbackEXT debug_callback = VK_DEBUG ? VkDebugUtilsMessengerCallbackEXT.create(
        (message_severity, message_type, pCallbackData, pUserData) -> {
            VkDebugUtilsMessengerCallbackDataEXT callback_data = VkDebugUtilsMessengerCallbackDataEXT.create(pCallbackData);
            if ((message_severity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) != 0) {
                System.err.printf("%d Validation Layer: Error: %s: %s%n",
                    callback_data.messageIdNumber(),
                    callback_data.pMessageIdNameString(),
                    callback_data.pMessageString());
            } else if ((message_severity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) != 0) {
                System.err.printf("%d Validation Layer: Warning: %s: %s%n",
                    callback_data.messageIdNumber(),
                    callback_data.pMessageIdNameString(),
                    callback_data.pMessageString());
            } else if ((message_type & VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) != 0) {
                System.out.printf("%d Validation Layer: Performance Warning: %s: %s%n",
                    callback_data.messageIdNumber(),
                    callback_data.pMessageIdNameString(),
                    callback_data.pMessageString());
            } else {
                System.out.printf("%d Validation Layer: Information: %s: %s",
                    callback_data.messageIdNumber(),
                    callback_data.pMessageIdNameString(),
                    callback_data.pMessageString());
            }
            return VK_FALSE;
        }) : null;

    /**
     * Validates a list of required extensions, comparing it with the available ones.
     *
     * @param required  A PointerBuffer containing required extension names.
     * @param available A VkExtensionProperties object containing available extensions.
     *
     * @return true if all required extensions are available, false otherwise
     */
    private static boolean validate_extensions(PointerBuffer required, VkExtensionProperties.Buffer available) {
        for (int i = 0; i < required.capacity(); ++i) {
            String extension_name = memUTF8(required.get(i));

            boolean found = false;
            for (VkExtensionProperties available_extension : available) {
                if (available_extension.extensionNameString().equals(extension_name)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    /**
     * Initializes the Vulkan instance.
     */
    private void init_instance(PointerBuffer requiredExtensions) {
        System.out.println("Initializing vulkan instance.");

        try (MemoryStack stack = stackPush()) {
            IntBuffer instance_extension_count = stack.mallocInt(1);
            VK_CHECK(vkEnumerateInstanceExtensionProperties((ByteBuffer)null, instance_extension_count, null));

            boolean has_debug_utils                   = false;
            boolean portability_enumeration_available = false;

            PointerBuffer required_instance_extensions;
            try (VkExtensionProperties.Buffer available_instance_extensions = VkExtensionProperties.calloc(instance_extension_count.get(0))) {
                VK_CHECK(vkEnumerateInstanceExtensionProperties((ByteBuffer)null, instance_extension_count, available_instance_extensions));

                List<String> required_instance_extensions_strings = new ArrayList<>();

                if (VK_DEBUG) {
                    // Validation layers help find wrong api usage, we enable them by default in this sample but should be disabled in release builds of applications
                    // For this we use the debug utils extension if it is supported
                    for (VkExtensionProperties ext : available_instance_extensions) {
                        if (ext.extensionNameString().equals(VK_EXT_DEBUG_UTILS_EXTENSION_NAME)) {
                            has_debug_utils = true;
                            required_instance_extensions_strings.add(VK_EXT_DEBUG_UTILS_EXTENSION_NAME);
                            break;
                        }
                    }
                    if (!has_debug_utils) {
                        System.err.printf("%s not supported or available%n", VK_EXT_DEBUG_UTILS_EXTENSION_NAME);
                        System.err.println("Make sure to compile the sample in debug mode and/or enable the validation layers");
                    }
                }

                if (Platform.get().equals(Platform.MACOSX)) {
                    required_instance_extensions_strings.add(VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME);
                    for (VkExtensionProperties ext : available_instance_extensions) {
                        if (ext.extensionNameString().equals(VK_KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME)) {
                            required_instance_extensions_strings.add(VK_KHR_PORTABILITY_ENUMERATION_EXTENSION_NAME);
                            portability_enumeration_available = true;
                            break;
                        }
                    }
                }

                required_instance_extensions = stack.mallocPointer(requiredExtensions.capacity() + required_instance_extensions_strings.size());
                required_instance_extensions.put(requiredExtensions);
                for (String string : required_instance_extensions_strings) {
                    required_instance_extensions.put(stack.ASCII(string));
                }
                required_instance_extensions.flip();

                if (!validate_extensions(required_instance_extensions, available_instance_extensions)) {
                    throw new RuntimeException("Required instance extensions are missing.");
                }
            }

            PointerBuffer requested_instance_layers = stack.mallocPointer(1);
            if (VK_DEBUG) {
                String validationLayer = "VK_LAYER_KHRONOS_validation";

                IntBuffer instance_layer_count = stack.mallocInt(1);
                VK_CHECK(vkEnumerateInstanceLayerProperties(instance_layer_count, null));

                boolean validationLayerFound = false;
                try (VkLayerProperties.Buffer supported_instance_layers = VkLayerProperties.calloc(instance_layer_count.get(0))) {
                    VK_CHECK(vkEnumerateInstanceLayerProperties(instance_layer_count, supported_instance_layers));

                    for (VkLayerProperties lp : supported_instance_layers) {
                        if (lp.layerNameString().equals(validationLayer)) {
                            validationLayerFound = true;
                            break;
                        }
                    }
                }

                if (validationLayerFound) {
                    requested_instance_layers.put(stack.UTF8(validationLayer));
                    System.out.printf("Enabled Validation Layer %s%n", validationLayer);
                } else {
                    System.err.printf("Validation Layer %s is not available%n", validationLayer);
                }
            }
            requested_instance_layers.flip();

            VkApplicationInfo app = VkApplicationInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_APPLICATION_INFO)
                .pApplicationName(stack.UTF8("Hello Triangle"))
                .pEngineName(stack.UTF8("Vulkan Samples"))
                .apiVersion(VK_API_VERSION_1_0);

            VkInstanceCreateInfo instance_info = VkInstanceCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO)
                .pApplicationInfo(app)
                .ppEnabledLayerNames(requested_instance_layers)
                .ppEnabledExtensionNames(required_instance_extensions);

            VkDebugUtilsMessengerCreateInfoEXT debug_utils_create_info = null;
            if (VK_DEBUG && has_debug_utils) {
                // Validation layers help finding wrong api usage, we enable them when explicitly requested or in debug builds
                // For this we use the debug utils extension if it is supported
                debug_utils_create_info = VkDebugUtilsMessengerCreateInfoEXT.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT)
                    .messageSeverity(VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT)
                    .messageType(VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT)
                    .pfnUserCallback(debug_callback);

                instance_info.pNext(debug_utils_create_info);
            }

            if (portability_enumeration_available) {
                instance_info.flags(instance_info.flags() | VK_INSTANCE_CREATE_ENUMERATE_PORTABILITY_BIT_KHR);
            }

            PointerBuffer pp = stack.mallocPointer(1);

            // Create the Vulkan instance
            VK_CHECK(vkCreateInstance(instance_info, null, pp));
            context.instance = new VkInstance(pp.get(0), instance_info);

            if (VK_DEBUG && has_debug_utils) {
                LongBuffer pl = stack.mallocLong(1);
                VK_CHECK(vkCreateDebugUtilsMessengerEXT(context.instance, debug_utils_create_info, null, pl));
                context.debug_callback = pl.get(0);
            }
        }
    }

    /**
     * Initializes the Vulkan physical device and logical device.
     */
    private void init_device() {
        System.out.println("Initializing Vulkan device.");

        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);

            VK_CHECK(vkEnumeratePhysicalDevices(context.instance, pi, null));
            int gpu_count = pi.get(0);

            if (gpu_count < 1) {
                throw new RuntimeException("No physical device found.");
            }

            // For simplicity, the sample selects the first gpu that has a graphics and present queue
            PointerBuffer gpus = stack.mallocPointer(gpu_count);
            VK_CHECK(vkEnumeratePhysicalDevices(context.instance, pi, gpus));

            for (int i = 0; i < gpu_count && (context.graphics_queue_index < 0); i++) {
                context.gpu = new VkPhysicalDevice(gpus.get(i), context.instance);

                IntBuffer queue_family_count = stack.mallocInt(1);
                vkGetPhysicalDeviceQueueFamilyProperties(context.gpu, queue_family_count, null);

                if (queue_family_count.get(0) < 1) {
                    throw new RuntimeException("No queue family found.");
                }

                VkQueueFamilyProperties.Buffer queue_family_properties = VkQueueFamilyProperties.calloc(queue_family_count.get(0), stack);
                vkGetPhysicalDeviceQueueFamilyProperties(context.gpu, queue_family_count, queue_family_properties);

                for (int j = 0; j < queue_family_count.get(0); j++) {
                    IntBuffer supports_present = stack.mallocInt(1);
                    vkGetPhysicalDeviceSurfaceSupportKHR(context.gpu, j, context.surface, supports_present);

                    // Find a queue family which supports graphics and presentation.
                    if (((queue_family_properties.get(j).queueFlags() & VK_QUEUE_GRAPHICS_BIT) != 0) && supports_present.get(0) == VK_TRUE) {
                        context.graphics_queue_index = j;
                        break;
                    }
                }
            }

            if (context.graphics_queue_index < 0) {
                throw new RuntimeException("Did not find suitable device with a queue that supports graphics and presentation.");
            }

            VK_CHECK(vkEnumerateDeviceExtensionProperties(context.gpu, (ByteBuffer)null, pi, null));
            int device_extension_count = pi.get(0);

            PointerBuffer required_device_extensions;
            try (VkExtensionProperties.Buffer device_extensions = VkExtensionProperties.calloc(device_extension_count)) {
                VK_CHECK(vkEnumerateDeviceExtensionProperties(context.gpu, (ByteBuffer)null, pi, device_extensions));

                // Since this sample has visual output, the device needs to support the swapchain extension
                required_device_extensions = stack.pointers(stack.UTF8(VK_KHR_SWAPCHAIN_EXTENSION_NAME));
                if (!validate_extensions(required_device_extensions, device_extensions)) {
                    throw new RuntimeException("Required device extensions are missing.");
                }

                if (Platform.get().equals(Platform.MACOSX)) {
                    // VK_KHR_portability_subset must be enabled if present in the implementation (e.g on macOS/iOS with beta extensions enabled)
                    for (VkExtensionProperties extension : device_extensions) {
                        if (extension.extensionNameString().equals(VK_KHR_PORTABILITY_SUBSET_EXTENSION_NAME)) {
                            required_device_extensions = stack.pointers(
                                required_device_extensions.get(0),
                                stack.nUTF8(VK_KHR_PORTABILITY_SUBSET_EXTENSION_NAME, true)
                            );
                        }
                    }
                }
            }

            // The sample uses a single graphics queue
            FloatBuffer queue_priority = stack.floats(1.0f);

            VkDeviceQueueCreateInfo.Buffer queue_info = VkDeviceQueueCreateInfo.calloc(1, stack)
                .sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO)
                .queueFamilyIndex(context.graphics_queue_index)
                .pQueuePriorities(queue_priority);

            VkDeviceCreateInfo device_info = VkDeviceCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO)
                .pQueueCreateInfos(queue_info)
                .ppEnabledExtensionNames(required_device_extensions);

            PointerBuffer pp = stack.mallocPointer(1);

            VK_CHECK(vkCreateDevice(context.gpu, device_info, null, pp));
            context.device = new VkDevice(pp.get(0), context.gpu, device_info);

            vkGetDeviceQueue(context.device, context.graphics_queue_index, 0, pp);
            context.queue = new VkQueue(pp.get(0), context.device);

            // This sample uses the Vulkan Memory Alloctor (VMA), which needs to be set up
            VmaVulkanFunctions vma_vulkan_func = VmaVulkanFunctions.calloc(stack)
                .set(context.instance, context.device);

            VmaAllocatorCreateInfo allocator_info = VmaAllocatorCreateInfo.calloc(stack)
                .physicalDevice(context.gpu)
                .device(context.device)
                .pVulkanFunctions(vma_vulkan_func)
                .instance(context.instance);

            int result = vmaCreateAllocator(allocator_info, pp);
            if (result != VK_SUCCESS) {
                throw new RuntimeException("Could not create allocator for VMA allocator");
            }
            context.vma_allocator = pp.get(0);
        }
    }

    /**
     * Initializes the vertex buffer by creating it, allocating memory, binding the memory, and uploading vertex data.
     * This function must be called after the Vulkan device has been initialized.
     * throws runtime exception if any Vulkan operation fails.
     */
    private void init_vertex_buffer() {
        // Vertex data for a single colored triangle
        float[] vertices = {
            0.5f, -0.5f, 0.5f,
            1.0f, 0.0f, 0.0f,

            0.5f, 0.5f, 0.5f,
            0.0f, 1.0f, 0.0f,

            -0.5f, 0.5f, 0.5f,
            0.0f, 0.0f, 1.0f
        };

        long buffer_size = vertices.length * Float.BYTES;

        try (MemoryStack stack = stackPush()) {
            // Copy Vertex data to a buffer accessible by the device
            VkBufferCreateInfo buffer_info = VkBufferCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO)
                .size(buffer_size)
                .usage(VK_BUFFER_USAGE_VERTEX_BUFFER_BIT);

            // We use the Vulkan Memory Allocator to find a memory type that can be written and mapped from the host
            // On most setups this will return a memory type that resides in VRAM and is accessible from the host
            VmaAllocationCreateInfo buffer_alloc_ci = VmaAllocationCreateInfo.calloc(stack)
                .flags(VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT | VMA_ALLOCATION_CREATE_MAPPED_BIT)
                .usage(VMA_MEMORY_USAGE_AUTO);

            PointerBuffer pp = stack.mallocPointer(1);
            LongBuffer    pl = stack.mallocLong(1);

            VmaAllocationInfo buffer_alloc_info = VmaAllocationInfo.calloc(stack);
            vmaCreateBuffer(context.vma_allocator, buffer_info, buffer_alloc_ci, pl, pp, buffer_alloc_info);
            if (buffer_alloc_info.pMappedData() != VK_NULL_HANDLE) {
                vertex_buffer = pl.get(0);
                vertex_buffer_allocation = pp.get(0);

                memByteBuffer(buffer_alloc_info.pMappedData(), (int)buffer_size)
                    .asFloatBuffer()
                    .put(vertices);
            } else {
                throw new RuntimeException("Could not map vertex buffer.");
            }
        }
    }

    /**
     * Initializes per frame data.
     *
     * @param per_frame The data of a frame.
     */
    private void init_per_frame(PerFrame per_frame) {
        try (MemoryStack stack = stackPush()) {
            VkFenceCreateInfo info = VkFenceCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_FENCE_CREATE_INFO)
                .flags(VK_FENCE_CREATE_SIGNALED_BIT);

            LongBuffer pl = stack.mallocLong(1);
            VK_CHECK(vkCreateFence(context.device, info, null, pl));
            per_frame.queue_submit_fence = pl.get(0);

            VkCommandPoolCreateInfo cmd_pool_info = VkCommandPoolCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO)
                .flags(VK_COMMAND_POOL_CREATE_TRANSIENT_BIT)
                .queueFamilyIndex(context.graphics_queue_index);
            VK_CHECK(vkCreateCommandPool(context.device, cmd_pool_info, null, pl));
            per_frame.primary_command_pool = pl.get(0);

            VkCommandBufferAllocateInfo cmd_buf_info = VkCommandBufferAllocateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO)
                .commandPool(per_frame.primary_command_pool)
                .level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
                .commandBufferCount(1);

            PointerBuffer pp = stack.mallocPointer(1);

            VK_CHECK(vkAllocateCommandBuffers(context.device, cmd_buf_info, pp));
            per_frame.primary_command_buffer = new VkCommandBuffer(pp.get(0), context.device);
        }
    }

    /**
     * Tears down the frame data.
     *
     * @param per_frame The data of a frame.
     */
    private void teardown_per_frame(PerFrame per_frame) {
        if (per_frame.queue_submit_fence != VK_NULL_HANDLE) {
            vkDestroyFence(context.device, per_frame.queue_submit_fence, null);

            per_frame.queue_submit_fence = VK_NULL_HANDLE;
        }

        if (per_frame.primary_command_buffer != null) {
            vkFreeCommandBuffers(context.device, per_frame.primary_command_pool, per_frame.primary_command_buffer);

            per_frame.primary_command_buffer = null;
        }

        if (per_frame.primary_command_pool != VK_NULL_HANDLE) {
            vkDestroyCommandPool(context.device, per_frame.primary_command_pool, null);

            per_frame.primary_command_pool = VK_NULL_HANDLE;
        }

        if (per_frame.swapchain_acquire_semaphore != VK_NULL_HANDLE) {
            vkDestroySemaphore(context.device, per_frame.swapchain_acquire_semaphore, null);

            per_frame.swapchain_acquire_semaphore = VK_NULL_HANDLE;
        }

        if (per_frame.swapchain_release_semaphore != VK_NULL_HANDLE) {
            vkDestroySemaphore(context.device, per_frame.swapchain_release_semaphore, null);

            per_frame.swapchain_release_semaphore = VK_NULL_HANDLE;
        }
    }

    /**
     * Initializes the Vulkan swapchain.
     */
    private void init_swapchain() {
        try (MemoryStack stack = stackPush()) {
            VkSurfaceCapabilitiesKHR surface_properties = VkSurfaceCapabilitiesKHR.calloc(stack);
            VK_CHECK(vkGetPhysicalDeviceSurfaceCapabilitiesKHR(context.gpu, context.surface, surface_properties));

            VkSurfaceFormatKHR format = VkSurfaceFormatKHR.malloc(stack);
            select_surface_format(context.gpu, context.surface, format);

            VkExtent2D swapchain_size = VkExtent2D.malloc(stack);
            if (surface_properties.currentExtent().width() == 0xFFFFFFFF) {
                swapchain_size.width(context.swapchain_dimensions.width);
                swapchain_size.height(context.swapchain_dimensions.height);
            } else {
                swapchain_size.set(surface_properties.currentExtent());
            }

            // FIFO must be supported by all implementations.
            int swapchain_present_mode = VK_PRESENT_MODE_FIFO_KHR;

            // Determine the number of VkImage's to use in the swapchain.
            // Ideally, we desire to own 1 image at a time, the rest of the images can
            // either be rendered to and/or being queued up for display.
            int desired_swapchain_images = surface_properties.minImageCount() + 1;
            if ((surface_properties.maxImageCount() > 0) && (desired_swapchain_images > surface_properties.maxImageCount())) {
                // Application must settle for fewer images than desired.
                desired_swapchain_images = surface_properties.maxImageCount();
            }

            // Figure out a suitable surface transform.
            int pre_transform = (surface_properties.supportedTransforms() & VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR) != 0
                ? VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR
                : surface_properties.currentTransform();

            long old_swapchain = context.swapchain;

            // Find a supported composite type.
            int composite = VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR;
            if ((surface_properties.supportedCompositeAlpha() & VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR) != 0) {
                composite = VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR;
            } else if ((surface_properties.supportedCompositeAlpha() & VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR) != 0) {
                composite = VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR;
            } else if ((surface_properties.supportedCompositeAlpha() & VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR) != 0) {
                composite = VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR;
            } else if ((surface_properties.supportedCompositeAlpha() & VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR) != 0) {
                composite = VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR;
            }

            VkSwapchainCreateInfoKHR info = VkSwapchainCreateInfoKHR.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR)
                .surface(context.surface)
                .minImageCount(desired_swapchain_images)
                .imageFormat(format.format())
                .imageColorSpace(format.colorSpace())
                .imageExtent(swapchain_size)
                .imageArrayLayers(1)
                .imageUsage(VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT)
                .imageSharingMode(VK_SHARING_MODE_EXCLUSIVE)
                .preTransform(pre_transform)
                .compositeAlpha(composite)
                .presentMode(swapchain_present_mode)
                .clipped(true)
                .oldSwapchain(old_swapchain);

            LongBuffer pl = stack.mallocLong(1);
            VK_CHECK(vkCreateSwapchainKHR(context.device, info, null, pl));
            context.swapchain = pl.get(0);

            if (old_swapchain != VK_NULL_HANDLE) {
                for (long image_view : context.swapchain_image_views) {
                    vkDestroyImageView(context.device, image_view, null);
                }
                for (PerFrame per_frame : context.per_frame) {
                    teardown_per_frame(per_frame);
                }

                context.swapchain_image_views.clear();

                vkDestroySwapchainKHR(context.device, old_swapchain, null);
            }

            context.swapchain_dimensions = new SwapchainDimensions(swapchain_size.width(), swapchain_size.height(), format.format());

            IntBuffer image_count = stack.mallocInt(1);
            VK_CHECK(vkGetSwapchainImagesKHR(context.device, context.swapchain, image_count, null));

            /// The swapchain images.

            LongBuffer swapchain_images = stack.mallocLong(image_count.get(0));
            VK_CHECK(vkGetSwapchainImagesKHR(context.device, context.swapchain, image_count, swapchain_images));

            // Initialize per-frame resources.
            // Every swapchain image has its own command pool and fence manager.
            // This makes it very easy to keep track of when we can reset command buffers and such.
            context.per_frame = new PerFrame[image_count.get(0)];

            for (int i = 0; i < image_count.get(0); i++) {
                context.per_frame[i] = new PerFrame();
                init_per_frame(context.per_frame[i]);
            }

            for (int i = 0; i < image_count.get(0); i++) {
                // Create an image view which we can render into.
                VkImageViewCreateInfo view_info = VkImageViewCreateInfo.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO)
                    .image(swapchain_images.get(i))
                    .viewType(VK_IMAGE_VIEW_TYPE_2D)
                    .format(context.swapchain_dimensions.format)
                    .subresourceRange(VkImageSubresourceRange.malloc(stack)
                        .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                        .baseMipLevel(0)
                        .levelCount(1)
                        .baseArrayLayer(0)
                        .layerCount(1));

                VK_CHECK(vkCreateImageView(context.device, view_info, null, pl));

                context.swapchain_image_views.add(pl.get(0));
            }
        }
    }

    /**
     * Initializes the Vulkan render pass.
     */
    private void init_render_pass() {
        try (MemoryStack stack = stackPush()) {
            VkAttachmentDescription.Buffer attachment = VkAttachmentDescription.calloc(1, stack)
                .format(context.swapchain_dimensions.format)// Backbuffer format.
                .samples(VK_SAMPLE_COUNT_1_BIT)// Not multisampled.
                .loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)// When starting the frame, we want tiles to be cleared.
                .storeOp(VK_ATTACHMENT_STORE_OP_STORE)// When ending the frame, we want tiles to be written out.
                .stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)// Don't care about stencil since we're not using it.
                .stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)// Don't care about stencil since we're not using it.
                .initialLayout(VK_IMAGE_LAYOUT_UNDEFINED)// The image layout will be undefined when the render pass begins.
                .finalLayout(VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);// After the render pass is complete, we will transition to PRESENT_SRC_KHR layout.

            // We have one subpass. This subpass has one color attachment.
            // While executing this subpass, the attachment will be in attachment optimal layout.
            VkAttachmentReference.Buffer color_ref = VkAttachmentReference.calloc(1, stack)
                .attachment(0)
                .layout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            // We will end up with two transitions.
            // The first one happens right before we start subpass #0, where
            // UNDEFINED is transitioned into COLOR_ATTACHMENT_OPTIMAL.
            // The final layout in the render pass attachment states PRESENT_SRC_KHR, so we
            // will get a final transition from COLOR_ATTACHMENT_OPTIMAL to PRESENT_SRC_KHR.
            VkSubpassDescription.Buffer subpass = VkSubpassDescription.calloc(1, stack)
                .pipelineBindPoint(VK_PIPELINE_BIND_POINT_GRAPHICS)
                .colorAttachmentCount(1)
                .pColorAttachments(color_ref);

            // Create a dependency to external events.
            // We need to wait for the WSI semaphore to signal.
            // Only pipeline stages which depend on COLOR_ATTACHMENT_OUTPUT_BIT will
            // actually wait for the semaphore, so we must also wait for that pipeline stage.
            VkSubpassDependency.Buffer dependency = VkSubpassDependency.calloc(1, stack)
                .srcSubpass(VK_SUBPASS_EXTERNAL)
                .dstSubpass(0)
                .srcStageMask(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT)
                .dstStageMask(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);

            // Since we changed the image layout, we need to make the memory visible to
            // color attachment to modify.
            dependency.srcAccessMask(0);
            dependency.dstAccessMask(VK_ACCESS_COLOR_ATTACHMENT_READ_BIT | VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT);

            // Finally, create the renderpass.
            VkRenderPassCreateInfo rp_info = VkRenderPassCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO)
                .pAttachments(attachment)
                .pSubpasses(subpass)
                .pDependencies(dependency);

            LongBuffer pl = stack.mallocLong(1);
            VK_CHECK(vkCreateRenderPass(context.device, rp_info, null, pl));
            context.render_pass = pl.get(0);
        }
    }

    /**
     * Helper function to load a shader module from an offline-compiled SPIR-V file
     *
     * @param spv the SPIR-V binary to load
     *
     * @return a VkShaderModule handle. Aborts execution if shader creation fails.
     */
    private long load_shader_module(long spv) {
        try (MemoryStack stack = stackPush()) {
            VkShaderModuleCreateInfo module_info = VkShaderModuleCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO)
                .pCode(Objects.requireNonNull(shaderc_result_get_bytes((spv))));

            LongBuffer pl = stack.mallocLong(1);
            VK_CHECK(vkCreateShaderModule(context.device, module_info, null, pl));
            return pl.get(0);
        } finally {
            shaderc_result_release(spv);
        }
    }

    /**
     * Initializes the Vulkan pipeline.
     */
    private void init_pipeline() {
        try (MemoryStack memoryStack = stackPush()) {
            // Create a blank pipeline layout.
            // We are not binding any resources to the pipeline in this first sample.
            VkPipelineLayoutCreateInfo layout_info = VkPipelineLayoutCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
            LongBuffer pipeline_layout_pointer = memoryStack.mallocLong(1);
            VK_CHECK(vkCreatePipelineLayout(context.device, layout_info, null, pipeline_layout_pointer));
            context.pipeline_layout = pipeline_layout_pointer.get(0);

            // The Vertex input properties define the interface between the vertex buffer and the vertex shader.

            // Specify we will use triangle lists to draw geometry.
            VkPipelineInputAssemblyStateCreateInfo input_assembly = VkPipelineInputAssemblyStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO)
                .topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);

            // Define the vertex input binding.
            VkVertexInputBindingDescription.Buffer binding_description = VkVertexInputBindingDescription.calloc(1, memoryStack)
                .binding(0)
                .stride(6 * Float.BYTES) //sizeof(Vertex)
                .inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

            // Define the vertex input attribute.
            VkVertexInputAttributeDescription.Buffer attribute_descriptions = VkVertexInputAttributeDescription.calloc(2, memoryStack);
            attribute_descriptions.get(0)
                .location(0)
                .binding(0)
                .format(VK_FORMAT_R32G32_SFLOAT)
                .offset(0);//offsetOf(Vertex, position)
            attribute_descriptions.get(1)
                .location(1)
                .binding(0)
                .format(VK_FORMAT_R32G32B32_SFLOAT)
                .offset(3 * Float.BYTES);//offsetOf(Vertex, color)

            // Define the pipeline vertex input.
            VkPipelineVertexInputStateCreateInfo vertex_input = VkPipelineVertexInputStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO)
                .pVertexBindingDescriptions(binding_description)
                .pVertexAttributeDescriptions(attribute_descriptions);

            // Specify rasterization state.
            VkPipelineRasterizationStateCreateInfo raster = VkPipelineRasterizationStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO)
                .cullMode(VK_CULL_MODE_BACK_BIT)
                .frontFace(VK_FRONT_FACE_CLOCKWISE)
                .lineWidth(1.0f);

            // Our attachment will write to all color channels, but no blending is enabled.
            VkPipelineColorBlendAttachmentState.Buffer blend_attachment = VkPipelineColorBlendAttachmentState.calloc(1, memoryStack)
                .colorWriteMask(VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT | VK_COLOR_COMPONENT_A_BIT);
            VkPipelineColorBlendStateCreateInfo blend = VkPipelineColorBlendStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO)
                .attachmentCount(1)
                .pAttachments(blend_attachment);

            // We will have one viewport and scissor box.
            VkPipelineViewportStateCreateInfo viewport = VkPipelineViewportStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO)
                .viewportCount(1)
                .scissorCount(1);

            // Disable all depth testing.
            VkPipelineDepthStencilStateCreateInfo depth_stencil = VkPipelineDepthStencilStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);

            // No multisampling.
            VkPipelineMultisampleStateCreateInfo multisample = VkPipelineMultisampleStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO)
                .rasterizationSamples(VK_SAMPLE_COUNT_1_BIT);

            // Specify that these states will be dynamic, i.e. not part of pipeline state object.
            IntBuffer dynamics = memoryStack.mallocInt(2);
            dynamics.put(VK_DYNAMIC_STATE_VIEWPORT);
            dynamics.put(VK_DYNAMIC_STATE_SCISSOR);
            dynamics.flip();

            VkPipelineDynamicStateCreateInfo dynamic = VkPipelineDynamicStateCreateInfo.calloc(memoryStack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO)
                .pDynamicStates(dynamics);

            // Load our SPIR-V shaders.
            VkPipelineShaderStageCreateInfo.Buffer shader_stages = VkPipelineShaderStageCreateInfo.calloc(2, memoryStack);

            // LWJGL: compile at runtime with shaderc
            long compiler = shaderc_compiler_initialize();
            long options  = shaderc_compile_options_initialize();
            try {
                // Vertex stage of the pipeline
                shader_stages.get(0)
                    .sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
                    .stage(VK_SHADER_STAGE_VERTEX_BIT)
                    .module(load_shader_module(compile_shader("demo/vulkan/triangle.vert", shaderc_vertex_shader, compiler, options)))
                    .pName(memoryStack.UTF8("main"));

                // Fragment stage of the pipeline
                shader_stages.get(1)
                    .sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
                    .stage(VK_SHADER_STAGE_FRAGMENT_BIT)
                    .module(load_shader_module(compile_shader("demo/vulkan/triangle.frag", shaderc_fragment_shader, compiler, options)))
                    .pName(memoryStack.UTF8("main"));
            } finally {
                shaderc_compile_options_release(options);
                shaderc_compiler_release(compiler);
            }

            VkGraphicsPipelineCreateInfo.Buffer pipe = VkGraphicsPipelineCreateInfo.calloc(1, memoryStack)
                .sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO)
                .stageCount(shader_stages.capacity())
                .pStages(shader_stages)
                .pVertexInputState(vertex_input)
                .pInputAssemblyState(input_assembly)
                .pViewportState(viewport)
                .pRasterizationState(raster)
                .pMultisampleState(multisample)
                .pDepthStencilState(depth_stencil)
                .pColorBlendState(blend)
                .pDynamicState(dynamic)
                .layout(context.pipeline_layout) // We need to specify the pipeline layout up front
                .renderPass(context.render_pass); // We need to specify the render pass up front

            LongBuffer pl = memoryStack.mallocLong(1);
            VK_CHECK(vkCreateGraphicsPipelines(context.device, VK_NULL_HANDLE, pipe, null, pl));
            context.pipeline = pl.get(0);

            // Pipeline is baked, we can delete the shader modules now.
            vkDestroyShaderModule(context.device, shader_stages.get(0).module(), null);
            vkDestroyShaderModule(context.device, shader_stages.get(1).module(), null);
        }
    }

    /**
     * Acquires an image from the swapchain.
     *
     * @param image The swapchain index for the acquired image.
     *
     * @return Vulkan result code
     */
    private int acquire_next_image(IntBuffer image) {
        try (MemoryStack stack = stackPush()) {
            long acquire_semaphore;
            if (context.recycled_semaphores.isEmpty()) {
                VkSemaphoreCreateInfo info = VkSemaphoreCreateInfo.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);

                LongBuffer pl = stack.mallocLong(1);
                VK_CHECK(vkCreateSemaphore(context.device, info, null, pl));
                acquire_semaphore = pl.get(0);
            } else {
                acquire_semaphore = context.recycled_semaphores.get(context.recycled_semaphores.size() - 1);
                context.recycled_semaphores.remove(context.recycled_semaphores.size() - 1);
            }

            int res = vkAcquireNextImageKHR(context.device, context.swapchain, UINT64_MAX, acquire_semaphore, VK_NULL_HANDLE, image);

            if (res != VK_SUCCESS) {
                context.recycled_semaphores.add(acquire_semaphore);
                return res;
            }

            int index = image.get(0);

            // If we have outstanding fences for this swapchain image, wait for them to complete first.
            // After begin frame returns, it is safe to reuse or delete resources which
            // were used previously.
            //
            // We wait for fences which completes N frames earlier, so we do not stall,
            // waiting for all GPU work to complete before this returns.
            // Normally, this doesn't really block at all,
            // since we're waiting for old frames to have been completed, but just in case.
            if (context.per_frame[index].queue_submit_fence != VK_NULL_HANDLE) {
                vkWaitForFences(context.device, context.per_frame[index].queue_submit_fence, true, UINT64_MAX);
                vkResetFences(context.device, context.per_frame[index].queue_submit_fence);
            }

            if (context.per_frame[index].primary_command_pool != VK_NULL_HANDLE) {
                vkResetCommandPool(context.device, context.per_frame[index].primary_command_pool, 0);
            }

            // Recycle the old semaphore back into the semaphore manager.
            long old_semaphore = context.per_frame[index].swapchain_acquire_semaphore;

            if (old_semaphore != VK_NULL_HANDLE) {
                context.recycled_semaphores.add(old_semaphore);
            }

            context.per_frame[index].swapchain_acquire_semaphore = acquire_semaphore;

            return VK_SUCCESS;
        }
    }

    /**
     * Renders a triangle to the specified swapchain image.
     *
     * @param swapchain_index The swapchain index for the image being rendered.
     */
    private void render_triangle(int swapchain_index) {
        // Render to this framebuffer.
        long framebuffer = context.swapchain_framebuffers.get(swapchain_index);

        // Allocate or re-use a primary command buffer.
        VkCommandBuffer cmd = context.per_frame[swapchain_index].primary_command_buffer;
        try (MemoryStack stack = stackPush()) {
            // We will only submit this once before it's recycled.
            VkCommandBufferBeginInfo begin_info = VkCommandBufferBeginInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO)
                .flags(VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT);
            // Begin command recording
            vkBeginCommandBuffer(cmd, begin_info);

            // Set clear color values.
            VkClearValue.Buffer clear_value = VkClearValue.calloc(1, stack)
                .color(VkClearColorValue.malloc(stack)
                    .float32(0, 0.01f)
                    .float32(1, 0.01f)
                    .float32(2, 0.033f)
                    .float32(3, 1.0f));

            // Begin the render pass.
            VkRenderPassBeginInfo rp_begin = VkRenderPassBeginInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO)
                .renderPass(context.render_pass)
                .framebuffer(framebuffer)
                .renderArea(VkRect2D.calloc(stack)
                    .extent(it -> it
                        .width(context.swapchain_dimensions.width)
                        .height(context.swapchain_dimensions.height)))
                .clearValueCount(1)
                .pClearValues(clear_value);
            // We will add draw commands in the same command buffer.
            vkCmdBeginRenderPass(cmd, rp_begin, VK_SUBPASS_CONTENTS_INLINE);

            // Bind the graphics pipeline.
            vkCmdBindPipeline(cmd, VK_PIPELINE_BIND_POINT_GRAPHICS, context.pipeline);

            VkViewport.Buffer vp = VkViewport.calloc(1, stack)
                .width(context.swapchain_dimensions.width)
                .height(context.swapchain_dimensions.height)
                .minDepth(0.0f)
                .maxDepth(1.0f);
            // Set viewport dynamically
            vkCmdSetViewport(cmd, 0, vp);

            VkRect2D.Buffer scissor = VkRect2D.calloc(1, stack)
                .extent(it -> it
                    .width(context.swapchain_dimensions.width)
                    .height(context.swapchain_dimensions.height));
            // Set scissor dynamically
            vkCmdSetScissor(cmd, 0, scissor);

            // Bind the vertex buffer to source the draw calls from.
            LongBuffer offset = stack.longs(0);
            vkCmdBindVertexBuffers(cmd, 0, stack.longs(vertex_buffer), offset);

            // Draw three vertices with one instance from the currently bound vertex bound.
            vkCmdDraw(cmd, 3, 1, 0, 0);

            // Complete render pass.
            vkCmdEndRenderPass(cmd);

            // Complete the command buffer.
            VK_CHECK(vkEndCommandBuffer(cmd));

            // Submit it to the queue with a release semaphore.
            if (context.per_frame[swapchain_index].swapchain_release_semaphore == VK_NULL_HANDLE) {
                VkSemaphoreCreateInfo semaphore_info = VkSemaphoreCreateInfo.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);

                LongBuffer pl = stack.mallocLong(1);
                VK_CHECK(vkCreateSemaphore(context.device, semaphore_info, null, pl));
                context.per_frame[swapchain_index].swapchain_release_semaphore = pl.get(0);
            }

            IntBuffer wait_stage = stack.ints(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);

            VkSubmitInfo info = VkSubmitInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_SUBMIT_INFO)
                .waitSemaphoreCount(1)
                .pWaitSemaphores(stack.longs(context.per_frame[swapchain_index].swapchain_acquire_semaphore))
                .pWaitDstStageMask(wait_stage)
                .pCommandBuffers(stack.pointers(cmd))
                .pSignalSemaphores(stack.longs(context.per_frame[swapchain_index].swapchain_release_semaphore));
            // Submit command buffer to graphics queue
            VK_CHECK(vkQueueSubmit(context.queue, info, context.per_frame[swapchain_index].queue_submit_fence));
        }
    }

    /**
     * Presents an image to the swapchain.
     *
     * @param index The swapchain index previously obtained from {@link #acquire_next_image}.
     *
     * @return Vulkan result code
     */
    private int present_image(int index) {
        try (MemoryStack stack = stackPush()) {
            VkPresentInfoKHR present = VkPresentInfoKHR.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PRESENT_INFO_KHR)
                .pWaitSemaphores(stack.longs(context.per_frame[index].swapchain_release_semaphore))
                .swapchainCount(1)
                .pSwapchains(stack.longs(context.swapchain))
                .pImageIndices(stack.ints(index));
            // Present swapchain image
            return vkQueuePresentKHR(context.queue, present);
        }
    }

    /**
     * Initializes the Vulkan framebuffers.
     */
    private void init_framebuffers() {
        context.swapchain_framebuffers.clear();

        try (MemoryStack stack = stackPush()) {
            for (long image_view : context.swapchain_image_views) {
                // Build the framebuffer.
                VkFramebufferCreateInfo fb_info = VkFramebufferCreateInfo.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO)
                    .renderPass(context.render_pass)
                    .attachmentCount(1)
                    .pAttachments(stack.longs(image_view))
                    .width(context.swapchain_dimensions.width)
                    .height(context.swapchain_dimensions.height)
                    .layers(1);

                LongBuffer pl = stack.mallocLong(1);
                VK_CHECK(vkCreateFramebuffer(context.device, fb_info, null, pl));

                context.swapchain_framebuffers.add(pl.get(0));
            }
        }
    }

    @Override
    public void close() { destroy(); }
    private void destroy() {
        // When destroying the application, we need to make sure the GPU is no longer accessing any resources
        // This is done by doing a device wait idle, which blocks until the GPU signals
        vkDeviceWaitIdle(context.device);

        for (long framebuffer : context.swapchain_framebuffers) {
            vkDestroyFramebuffer(context.device, framebuffer, null);
        }

        for (PerFrame per_frame : context.per_frame) {
            teardown_per_frame(per_frame);
        }

        for (long semaphore : context.recycled_semaphores) {
            vkDestroySemaphore(context.device, semaphore, null);
        }

        if (context.pipeline != VK_NULL_HANDLE) {
            vkDestroyPipeline(context.device, context.pipeline, null);
        }

        if (context.pipeline_layout != VK_NULL_HANDLE) {
            vkDestroyPipelineLayout(context.device, context.pipeline_layout, null);
        }

        if (context.render_pass != VK_NULL_HANDLE) {
            vkDestroyRenderPass(context.device, context.render_pass, null);
        }

        for (long image_view : context.swapchain_image_views) {
            vkDestroyImageView(context.device, image_view, null);
        }

        if (context.swapchain != VK_NULL_HANDLE) {
            vkDestroySwapchainKHR(context.device, context.swapchain, null);
        }

        if (context.surface != VK_NULL_HANDLE) {
            vkDestroySurfaceKHR(context.instance, context.surface, null);
        }

        if (vertex_buffer_allocation != VK_NULL_HANDLE) {
            vmaDestroyBuffer(context.vma_allocator, vertex_buffer, vertex_buffer_allocation);
        }

        if (context.vma_allocator != VK_NULL_HANDLE) {
            vmaDestroyAllocator(context.vma_allocator);
        }

        if (context.device != null) {
            vkDestroyDevice(context.device, null);
        }

        if (context.debug_callback != VK_NULL_HANDLE) {
            vkDestroyDebugUtilsMessengerEXT(context.instance, context.debug_callback, null);
        }

        vk_instance.free();
        vk_instance = null;
        if (debug_callback != null) {
            debug_callback.free();
        }
    }

    @Override
    public boolean prepare(Window window) {
        assert window != null;

        init_instance(window.getRequiredExtensions());

        vk_instance = new Instance(context.instance);

        context.surface = window.create_surface(vk_instance);
        Vector2i extent = window.getExtent();
        context.swapchain_dimensions.width = extent.x;
        context.swapchain_dimensions.height = extent.y;

        if (context.surface == NULL) {
            throw new RuntimeException("Failed to create window surface.");
        }

        init_device();

        init_vertex_buffer();

        init_swapchain();

        // Create the necessary objects for rendering.
        init_render_pass();
        init_pipeline();
        init_framebuffers();

        return true;
    }

    @Override
    public void update() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer index = stack.mallocInt(1);

            int res = acquire_next_image(index);

            // Handle outdated error in acquire.
            if (res == VK_SUBOPTIMAL_KHR || res == VK_ERROR_OUT_OF_DATE_KHR) {
                resize();
                res = acquire_next_image(index);
            }

            if (res != VK_SUCCESS) {
                vkQueueWaitIdle(context.queue);
                return;
            }

            render_triangle(index.get(0));
            res = present_image(index.get(0));

            // Handle Outdated error in present.
            if (res == VK_SUBOPTIMAL_KHR || res == VK_ERROR_OUT_OF_DATE_KHR) {
                resize();
            } else if (res != VK_SUCCESS) {
                System.err.println("Failed to present swapchain image.");
            }
        }
    }

    @Override
    public boolean resize() {
        if (context.device == null) {
            return false;
        }

        try (MemoryStack stack = stackPush()) {
            VkSurfaceCapabilitiesKHR surface_properties = VkSurfaceCapabilitiesKHR.calloc(stack);
            VK_CHECK(vkGetPhysicalDeviceSurfaceCapabilitiesKHR(context.gpu, context.surface, surface_properties));

            // Only rebuild the swapchain if the dimensions have changed
            if (surface_properties.currentExtent().width() == context.swapchain_dimensions.width &&
                surface_properties.currentExtent().height() == context.swapchain_dimensions.height) {
                return false;
            }
        }

        vkDeviceWaitIdle(context.device);

        for (long framebuffer : context.swapchain_framebuffers) {
            vkDestroyFramebuffer(context.device, framebuffer, null);
        }

        init_swapchain();
        init_framebuffers();
        return true;
    }

    public static void main(String[] args) throws IOException {
        int    width  = 1280;
        int    height = 720;
        String title  = "Vulkan Samples: Hello Triangle";

        try (
            Window window = "GLFW".equalsIgnoreCase(System.getProperty("window", "SDL"))
                ? new GLFWWindow(width, height, title)
                : new SDLWindow(width, height, title);
            HelloTriangle app = new HelloTriangle()
        ) {
            app.prepare(window);
            window.mainLoop(app);
        }
    }

}