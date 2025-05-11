/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.vulkan.khronos;

import org.joml.*;
import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.shaderc.Shaderc.*;
import static org.lwjgl.vulkan.EXTDebugUtils.*;
import static org.lwjgl.vulkan.EXTExtendedDynamicState.*;
import static org.lwjgl.vulkan.KHRDynamicRendering.*;
import static org.lwjgl.vulkan.KHRGetPhysicalDeviceProperties2.*;
import static org.lwjgl.vulkan.KHRPortabilityEnumeration.*;
import static org.lwjgl.vulkan.KHRPortabilitySubset.*;
import static org.lwjgl.vulkan.KHRSurface.*;
import static org.lwjgl.vulkan.KHRSwapchain.*;
import static org.lwjgl.vulkan.VK10.*;
import static org.lwjgl.vulkan.VK11.*;
import static org.lwjgl.vulkan.VK13.*;

/* Copyright (c) 2024-2025, Huawei Technologies Co., Ltd.
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
 * <p>Similar to {@link HelloTriangle}, but uses modern features. Requires Vulkan 1.3 or higher.</p>
 *
 * <p>Ported from <a href="https://github.com/KhronosGroup/Vulkan-Samples/tree/main/samples/api/hello_triangle_1_3">hello_triangle_1_3</a> in Vulkan-Samples.</p>
 */
public class HelloTriangle_1_3 extends Demo {

    private final Context context = new Context();

    private Instance vk_instance;

    private long dbg_msg_callback_pointer;

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
        // VkSwapchainKHR
        long swapchain = VK_NULL_HANDLE;

        /// The swapchain dimensions.
        SwapchainDimensions swapchain_dimensions = new SwapchainDimensions(0, 0, VK_FORMAT_UNDEFINED);

        /// The surface we will render to.
        // VkSurfaceKHR
        long surface;

        /// The queue family index where graphics work will be submitted.
        int graphics_queue_index = -1;

        /// The image view for each swapchain image.
        // List<VkImageView>
        List<Long> swapchain_image_views = new ArrayList<>();

        /// The handles to the images in the swapchain.
        // List<VkImage>
        List<Long> swapchain_images = new ArrayList<>();

        /// The graphics pipeline.
        // VkPipeline
        long pipeline = VK_NULL_HANDLE;

        /**
         * The pipeline layout for resources.
         * Not used in this sample, but we still need to provide a dummy one.
         */
        // VkPipelineLayout
        long pipeline_layout = VK_NULL_HANDLE;

        /// The debug utility messenger callback.
        VkDebugUtilsMessengerCallbackEXT debug_callback;

        /// A set of semaphores that can be reused.
        // List<VkSemaphore>
        List<Long> recycled_semaphores = new ArrayList<>();

        /// A set of per-frame data.
        List<PerFrame> per_frame = new ArrayList<>();

        /// The Vulkan buffer object that holds the vertex data for the triangle.
        // VkBuffer
        long vertex_buffer = VK_NULL_HANDLE;

        /// The device memory allocated for the vertex buffer.
        // VkDeviceMemory
        long vertex_buffer_memory = VK_NULL_HANDLE;
    }

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
                System.err.println("Error: Required extension not found: " + extension_name);
                return false;
            }
        }
        return true;
    }

    private void init_instance(PointerBuffer requiredExtensions) {
        System.out.println("Initializing Vulkan instance.");

        if (VK_DEBUG) {
            context.debug_callback = VkDebugUtilsMessengerCallbackEXT.create(
                (messageSeverity, messageTypes, pCallbackData, pUserData) -> {
                    String severity;
                    if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT) != 0) {
                        severity = "VERBOSE";
                    } else if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT) != 0) {
                        severity = "INFO";
                    } else if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) != 0) {
                        severity = "WARNING";
                    } else if ((messageSeverity & VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT) != 0) {
                        severity = "ERROR";
                    } else {
                        severity = "UNKNOWN";
                    }

                    String type;
                    if ((messageTypes & VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT) != 0) {
                        type = "GENERAL";
                    } else if ((messageTypes & VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT) != 0) {
                        type = "VALIDATION";
                    } else if ((messageTypes & VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT) != 0) {
                        type = "PERFORMANCE";
                    } else {
                        type = "UNKNOWN";
                    }

                    VkDebugUtilsMessengerCallbackDataEXT data = VkDebugUtilsMessengerCallbackDataEXT.create(pCallbackData);
                    System.err.format(
                        "%s %s: [%s]\n\t%s\n",
                        type, severity, data.pMessageIdNameString(), data.pMessageString()
                    );

                    /*
                     * false indicates that layer should not bail-out of an
                     * API call that had validation failures. This may mean that the
                     * app dies inside the driver due to invalid parameter(s).
                     * That's what would happen without validation layers, so we'll
                     * keep that behavior here.
                     */
                    return VK_FALSE;
                }
            );
        }

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
                .pApplicationName(stack.UTF8("Hello Triangle V1.3"))
                .pEngineName(stack.UTF8("Vulkan Samples"))
                .apiVersion(VK_MAKE_VERSION(1, 3, 0));

            VkInstanceCreateInfo instance_info = VkInstanceCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO)
                .pApplicationInfo(app)
                .ppEnabledLayerNames(requested_instance_layers)
                .ppEnabledExtensionNames(required_instance_extensions);

            VkDebugUtilsMessengerCreateInfoEXT debug_messenger_create_info = null;
            if (VK_DEBUG && has_debug_utils) {
                debug_messenger_create_info = VkDebugUtilsMessengerCreateInfoEXT.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT)
                    .messageSeverity(VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT)
                    .messageType(VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT | VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT)
                    .pfnUserCallback(context.debug_callback);

                instance_info.pNext(debug_messenger_create_info);
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
                VK_CHECK(vkCreateDebugUtilsMessengerEXT(context.instance, debug_messenger_create_info, null, pl));
                dbg_msg_callback_pointer = pl.get(0);
            }
        }
    }

    private void init_device() {
        System.out.println("Initializing Vulkan device.");

        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.mallocInt(1);

            VK_CHECK(vkEnumeratePhysicalDevices(context.instance, pi, null));
            int gpu_count = pi.get(0);

            if (gpu_count < 1) {
                throw new RuntimeException("No physical device found.");
            }

            PointerBuffer physical_devices = stack.mallocPointer(gpu_count);
            VK_CHECK(vkEnumeratePhysicalDevices(context.instance, pi, physical_devices));

            for (int i = 0; i < gpu_count; i++) {
                VkPhysicalDevice device = new VkPhysicalDevice(physical_devices.get(i), context.instance);

                VkPhysicalDeviceProperties gpu_props = VkPhysicalDeviceProperties.calloc(stack);
                vkGetPhysicalDeviceProperties(device, gpu_props);

                if (gpu_props.apiVersion() < VK_API_VERSION_1_3) {
                    System.out.printf("Physical device %s does not support Vulkan 1.3, skipping.%n", gpu_props.deviceNameString());
                    continue;
                }

                vkGetPhysicalDeviceQueueFamilyProperties(device, pi, null);
                int queue_family_count = pi.get(0);

                VkQueueFamilyProperties.Buffer queue_family_properties = VkQueueFamilyProperties.calloc(queue_family_count, stack);
                vkGetPhysicalDeviceQueueFamilyProperties(device, pi, queue_family_properties);

                // Iterate over each queue to learn whether it supports presenting:
                IntBuffer supportsPresent = stack.mallocInt(queue_family_properties.capacity());

                for (int j = 0; j < supportsPresent.capacity(); j++) {
                    supportsPresent.position(j);
                    vkGetPhysicalDeviceSurfaceSupportKHR(device, j, context.surface, supportsPresent);
                }

                for (int j = 0; j < supportsPresent.capacity(); j++) {
                    if ((queue_family_properties.get(j).queueFlags() & VK_QUEUE_GRAPHICS_BIT) != 0) {
                        if (supportsPresent.get(j) == VK_TRUE) {
                            context.graphics_queue_index = j;
                            break;
                        }
                    }
                }

                if (context.graphics_queue_index >= 0) {
                    context.gpu = device;
                    break;
                }
            }

            if (context.graphics_queue_index < 0) {
                throw new RuntimeException("Failed to find a suitable GPU with Vulkan 1.3 support.");
            }

            boolean swapchainExtFound = false;
            VK_CHECK(vkEnumerateDeviceExtensionProperties(context.gpu, (String)null, pi, null));
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

            VkPhysicalDeviceExtendedDynamicStateFeaturesEXT query_extended_dynamic_state_features = VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT);

            VkPhysicalDeviceVulkan13Features query_vulkan13_features = VkPhysicalDeviceVulkan13Features.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES)
                .pNext(query_extended_dynamic_state_features.address());

            VkPhysicalDeviceFeatures2 query_device_features2 = VkPhysicalDeviceFeatures2.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2)
                .pNext(query_vulkan13_features.address());

            // Now query the device
            vkGetPhysicalDeviceFeatures2(context.gpu, query_device_features2);

            if (!query_vulkan13_features.dynamicRendering()) {
                throw new RuntimeException("Dynamic Rendering feature is missing");
            }
            if (!query_vulkan13_features.synchronization2()) {
                throw new RuntimeException("Synchronization2 feature is missing");
            }
            if (!query_extended_dynamic_state_features.extendedDynamicState()) {
                throw new RuntimeException("Extended Dynamic State feature is missing");
            }

            VkPhysicalDeviceExtendedDynamicStateFeaturesEXT enable_extended_dynamic_state_features = VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_FEATURES_EXT)
                .extendedDynamicState(true);

            VkPhysicalDeviceVulkan13Features enable_vulkan13_features = VkPhysicalDeviceVulkan13Features.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES)
                .pNext(enable_extended_dynamic_state_features.address())
                .synchronization2(true)
                .dynamicRendering(true);

            VkPhysicalDeviceFeatures2 enable_device_features2 = VkPhysicalDeviceFeatures2.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2)
                .pNext(enable_vulkan13_features.address());

            VkDeviceQueueCreateInfo.Buffer queue_info = VkDeviceQueueCreateInfo.calloc(1, stack)
                .sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO)
                .queueFamilyIndex(context.graphics_queue_index)
                .pQueuePriorities(stack.floats(1.0f));

            VkDeviceCreateInfo device_info = VkDeviceCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO)
                .pNext(enable_device_features2.address())
                .pQueueCreateInfos(queue_info)
                .ppEnabledExtensionNames(required_device_extensions);

            PointerBuffer pp = stack.mallocPointer(1);

            VK_CHECK(vkCreateDevice(context.gpu, device_info, null, pp));
            context.device = new VkDevice(pp.get(0), context.gpu, device_info);

            vkGetDeviceQueue(context.device, context.graphics_queue_index, 0, pp);
            context.queue = new VkQueue(pp.get(0), context.device);
        }
    }

    private void init_vertex_buffer() {
        float[] vertices = {
            //  X      Y       R     G     B
            0.5f, -0.5f, 1.0f, 0.0f, 0.0f,
            0.5f, 0.5f, 0.0f, 1.0f, 0.0f,
            -0.5f, 0.5f, 0.0f, 0.0f, 1.0f
        };

        long buffer_size = vertices.length * Float.BYTES;

        try (MemoryStack stack = stackPush()) {
            // Create the vertex buffer
            VkBufferCreateInfo vertex_buffer_info = VkBufferCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO)
                .flags(0)
                .size(buffer_size)
                .usage(VK_BUFFER_USAGE_VERTEX_BUFFER_BIT)
                .sharingMode(VK_SHARING_MODE_EXCLUSIVE);

            LongBuffer pl = stack.mallocLong(1);

            VK_CHECK(vkCreateBuffer(context.device, vertex_buffer_info, null, pl));
            context.vertex_buffer = pl.get(0);

            // Get memory requirements
            VkMemoryRequirements mem_reqs = VkMemoryRequirements.calloc(stack);
            vkGetBufferMemoryRequirements(context.device, context.vertex_buffer, mem_reqs);

            // Allocate memory for the buffer
            VkMemoryAllocateInfo alloc_info = VkMemoryAllocateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO)
                .allocationSize(mem_reqs.size())
                .memoryTypeIndex(find_memory_type(context.gpu, mem_reqs.memoryTypeBits(), VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT | VK_MEMORY_PROPERTY_HOST_COHERENT_BIT));

            VK_CHECK(vkAllocateMemory(context.device, alloc_info, null, pl));
            context.vertex_buffer_memory = pl.get(0);

            // Bind the buffer with the allocated memory
            VK_CHECK(vkBindBufferMemory(context.device, context.vertex_buffer, context.vertex_buffer_memory, 0));

            PointerBuffer pp = stack.mallocPointer(1);

            // Map the memory and copy the vertex data
            VK_CHECK(vkMapMemory(context.device, context.vertex_buffer_memory, 0, buffer_size, 0, pp));

            FloatBuffer vertex_buffer = pp.getFloatBuffer(0, (int)buffer_size);
            vertex_buffer.put(vertices);
            vkUnmapMemory(context.device, context.vertex_buffer_memory);
        }
    }

    private static int find_memory_type(VkPhysicalDevice physical_device, int type_filter, int properties) {
        try (MemoryStack stack = stackPush()) {
            VkPhysicalDeviceMemoryProperties memory_properties = VkPhysicalDeviceMemoryProperties.calloc(stack);
            vkGetPhysicalDeviceMemoryProperties(physical_device, memory_properties);

            for (int i = 0; i < memory_properties.memoryTypeCount(); i++) {
                if ((type_filter & 1 << i) != 0) {
                    if ((memory_properties.memoryTypes(i).propertyFlags() & properties) == properties) {
                        return i;
                    }
                }
            }
        }
        throw new RuntimeException("Failed to find suitable memory type.");
    }

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

    private void init_swapchain() {
        System.out.println("Initializing Swap chain.");

        try (MemoryStack stack = stackPush()) {
            VkSurfaceCapabilitiesKHR surface_properties = VkSurfaceCapabilitiesKHR.calloc(stack);
            VK_CHECK(vkGetPhysicalDeviceSurfaceCapabilitiesKHR(context.gpu, context.surface, surface_properties));

            VkSurfaceFormatKHR format = VkSurfaceFormatKHR.malloc(stack);
            select_surface_format(context.gpu, context.surface, format);

            VkExtent2D swapchain_size = VkExtent2D.calloc(stack);

            if (surface_properties.currentExtent().width() == 0xFFFFFFFF) {
                swapchain_size.width(context.swapchain_dimensions.width);
                swapchain_size.height(context.swapchain_dimensions.height);

                if (swapchain_size.width() < surface_properties.minImageExtent().width()) {
                    swapchain_size.width(surface_properties.minImageExtent().width());
                } else if (swapchain_size.width() > surface_properties.maxImageExtent().width()) {
                    swapchain_size.width(surface_properties.maxImageExtent().width());
                }

                if (swapchain_size.height() < surface_properties.minImageExtent().height()) {
                    swapchain_size.height(surface_properties.minImageExtent().height());
                } else if (swapchain_size.height() > surface_properties.maxImageExtent().height()) {
                    swapchain_size.height(surface_properties.maxImageExtent().height());
                }
            } else {
                swapchain_size = surface_properties.currentExtent();
                context.swapchain_dimensions.width = surface_properties.currentExtent().width();
                context.swapchain_dimensions.height = surface_properties.currentExtent().height();
            }

            int desired_swapchain_images = surface_properties.minImageCount();
            if (surface_properties.maxImageCount() > 0 && desired_swapchain_images > surface_properties.maxImageCount()) {
                desired_swapchain_images = surface_properties.maxImageCount();
            }

            int pre_transform;
            if ((surface_properties.supportedTransforms() & VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR) != 0) {
                pre_transform = VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
            } else {
                pre_transform = surface_properties.currentTransform();
            }

            long old_swapchain = context.swapchain;

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
                .presentMode(VK_PRESENT_MODE_FIFO_KHR)
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

                vkDestroySwapchainKHR(context.device, old_swapchain, null);
            }

            context.swapchain_dimensions = new SwapchainDimensions(swapchain_size.width(), swapchain_size.height(), format.format());

            IntBuffer pi = stack.mallocInt(1);

            VK_CHECK(vkGetSwapchainImagesKHR(context.device, context.swapchain, pi, null));
            int image_count = pi.get(0);

            LongBuffer swapchain_images = stack.mallocLong(image_count);
            VK_CHECK(vkGetSwapchainImagesKHR(context.device, context.swapchain, pi, swapchain_images));

            context.per_frame.clear();

            for (int i = 0; i < image_count; i++) {
                PerFrame perFrame = new PerFrame();
                init_per_frame(perFrame);
                context.per_frame.add(perFrame);
            }

            context.swapchain_images.clear();
            context.swapchain_image_views.clear();

            for (int i = 0; i < image_count; i++) {
                long image = swapchain_images.get(i);

                VkImageViewCreateInfo color_attachment_view = VkImageViewCreateInfo.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO)
                    .flags(0)
                    .image(image)
                    .viewType(VK_IMAGE_VIEW_TYPE_2D)
                    .format(format.format())
                    .subresourceRange(it -> it
                        .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                        .baseMipLevel(0)
                        .levelCount(1)
                        .baseArrayLayer(0)
                        .layerCount(1));

                VK_CHECK(vkCreateImageView(context.device, color_attachment_view, null, pl));

                context.swapchain_images.add(image);
                context.swapchain_image_views.add(pl.get(0));
            }
        }
    }

    private long load_shader_module(long spv) {
        try (MemoryStack stack = stackPush()) {
            VkShaderModuleCreateInfo module_info = VkShaderModuleCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO)
                .flags(0)
                .pCode(Objects.requireNonNull(shaderc_result_get_bytes((spv))));

            LongBuffer pl = stack.mallocLong(1);
            VK_CHECK(vkCreateShaderModule(context.device, module_info, null, pl));
            return pl.get(0);
        } finally {
            shaderc_result_release(spv);
        }
    }

    private void init_pipeline() {
        System.out.println("Initializing Render pipeline.");

        try (MemoryStack stack = stackPush()) {
            VkPipelineLayoutCreateInfo layout_info = VkPipelineLayoutCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);

            LongBuffer pl = stack.mallocLong(1);

            VK_CHECK(vkCreatePipelineLayout(context.device, layout_info, null, pl));
            context.pipeline_layout = pl.get(0);

            VkVertexInputBindingDescription.Buffer binding_description = VkVertexInputBindingDescription.calloc(1, stack)
                .binding(0)
                .stride(Float.BYTES * 5)
                .inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

            VkVertexInputAttributeDescription.Buffer attribute_descriptions = VkVertexInputAttributeDescription.calloc(2, stack);

            attribute_descriptions.get(0)
                .location(0)
                .binding(0)
                .format(VK_FORMAT_R32G32_SFLOAT)
                .offset(0);

            attribute_descriptions.get(1)
                .location(1)
                .binding(0)
                .format(VK_FORMAT_R32G32B32_SFLOAT)
                .offset(Float.BYTES * 2);

            VkPipelineVertexInputStateCreateInfo vertex_input = VkPipelineVertexInputStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO)
                .pVertexBindingDescriptions(binding_description)
                .pVertexAttributeDescriptions(attribute_descriptions);

            VkPipelineInputAssemblyStateCreateInfo input_assembly = VkPipelineInputAssemblyStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO)
                .topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST)
                .primitiveRestartEnable(false);

            VkPipelineRasterizationStateCreateInfo raster = VkPipelineRasterizationStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO)
                .depthClampEnable(false)
                .rasterizerDiscardEnable(false)
                .polygonMode(VK_POLYGON_MODE_FILL)
                .depthBiasEnable(false)
                .lineWidth(1.0f);

            VkPipelineColorBlendAttachmentState.Buffer blend_attachment = VkPipelineColorBlendAttachmentState.calloc(1, stack)
                .colorWriteMask(VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT | VK_COLOR_COMPONENT_A_BIT);

            VkPipelineColorBlendStateCreateInfo blend = VkPipelineColorBlendStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO)
                .attachmentCount(1)
                .pAttachments(blend_attachment);

            VkPipelineViewportStateCreateInfo viewport = VkPipelineViewportStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO)
                .viewportCount(1)
                .scissorCount(1);

            VkPipelineDepthStencilStateCreateInfo depth_stencil = VkPipelineDepthStencilStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO)
                .depthCompareOp(VK_COMPARE_OP_ALWAYS);

            VkPipelineMultisampleStateCreateInfo multisample = VkPipelineMultisampleStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO)
                .rasterizationSamples(VK_SAMPLE_COUNT_1_BIT);

            VkPipelineDynamicStateCreateInfo dynamic_state_info = VkPipelineDynamicStateCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO)
                .pDynamicStates(stack.ints(VK_DYNAMIC_STATE_VIEWPORT,
                    VK_DYNAMIC_STATE_SCISSOR,
                    VK_DYNAMIC_STATE_CULL_MODE,
                    VK_DYNAMIC_STATE_FRONT_FACE,
                    VK_DYNAMIC_STATE_PRIMITIVE_TOPOLOGY));

            VkPipelineShaderStageCreateInfo.Buffer shader_stages = VkPipelineShaderStageCreateInfo.calloc(2, stack);

            long vert_shader_module;
            long frag_shader_module;

            ByteBuffer main = stack.UTF8("main");

            // LWJGL: compile at runtime with shaderc
            long compiler = shaderc_compiler_initialize();
            long options  = shaderc_compile_options_initialize();
            try {
                shader_stages.get(0)
                    .sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
                    .stage(VK_SHADER_STAGE_VERTEX_BIT)
                    .module(vert_shader_module = load_shader_module(compile_shader("demo/vulkan/triangle.vert", shaderc_vertex_shader, compiler, options)))
                    .pName(main);

                shader_stages.get(1)
                    .sType(VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO)
                    .stage(VK_SHADER_STAGE_FRAGMENT_BIT)
                    .module(frag_shader_module = load_shader_module(compile_shader("demo/vulkan/triangle.frag", shaderc_fragment_shader, compiler, options)))
                    .pName(main);
            } finally {
                shaderc_compile_options_release(options);
                shaderc_compiler_release(compiler);
            }

            VkPipelineRenderingCreateInfo pipeline_rendering_info = VkPipelineRenderingCreateInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO)
                .colorAttachmentCount(1)
                .pColorAttachmentFormats(stack.ints(context.swapchain_dimensions.format));

            VkGraphicsPipelineCreateInfo.Buffer pipe = VkGraphicsPipelineCreateInfo.calloc(1, stack)
                .sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO)
                .pNext(pipeline_rendering_info.address())
                .stageCount(2)
                .pStages(shader_stages)
                .pVertexInputState(vertex_input)
                .pInputAssemblyState(input_assembly)
                .pViewportState(viewport)
                .pRasterizationState(raster)
                .pMultisampleState(multisample)
                .pDepthStencilState(depth_stencil)
                .pColorBlendState(blend)
                .pDynamicState(dynamic_state_info)
                .layout(context.pipeline_layout)
                .renderPass(VK_NULL_HANDLE)
                .subpass(0);

            VK_CHECK(vkCreateGraphicsPipelines(context.device, VK_NULL_HANDLE, pipe, null, pl));
            context.pipeline = pl.get(0);

            vkDestroyShaderModule(context.device, vert_shader_module, null);
            vkDestroyShaderModule(context.device, frag_shader_module, null);
        }
    }

    private int acquire_next_swapchain_image(IntBuffer image) {
        try (MemoryStack stack = stackPush()) {
            long acquire_semaphore;
            if (context.recycled_semaphores.isEmpty()) {
                VkSemaphoreCreateInfo info = VkSemaphoreCreateInfo.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);

                LongBuffer pl = stack.mallocLong(1);

                VK_CHECK(vkCreateSemaphore(context.device, info, null, pl));
                acquire_semaphore = pl.get(0);
            } else {
                acquire_semaphore = context.recycled_semaphores
                    .remove(context.recycled_semaphores.size() - 1);
            }

            int res = vkAcquireNextImageKHR(context.device, context.swapchain, Long.MAX_VALUE, acquire_semaphore, VK_NULL_HANDLE, image);

            if (res != VK_SUCCESS) {
                /*
                    In the original C++ demo, the acquire_semaphore is recycled here. However, this results in a
                    validation error when the window is resizing, which why the vkAcquireNextImageKHR() call typically
                    returns a value that is not VK_SUCCESS (usually,VK_ERROR_OUT_OF_DATE_KHR or VK_SUBOPTIMAL_KHR).
                    When this occurs, the semaphore may still be in a signalled state, and as there is no API to
                    "un-signal" a semaphore, the only appropriate action is to destroy it. A new one will be created
                    automatically on the next call to acquire_next_swapchain_image. For an example of a similar bug
                    (with a similar solution), See the following commit in the godot game engine project:
                    - https://github.com/umutbalkan/godot/commit/f1eb9aa9f30695243ea1d175af338d031666aa9d
                 */
                vkDestroySemaphore(context.device, acquire_semaphore, null);
                return res;
            }

            int index = image.get(0);

            if (context.per_frame.get(index).queue_submit_fence != VK_NULL_HANDLE) {
                vkWaitForFences(context.device, context.per_frame.get(index).queue_submit_fence, true, Long.MAX_VALUE);
                vkResetFences(context.device, context.per_frame.get(index).queue_submit_fence);
            }

            if (context.per_frame.get(index).primary_command_pool != VK_NULL_HANDLE) {
                vkResetCommandPool(context.device, context.per_frame.get(index).primary_command_pool, 0);
            }

            long old_semaphore = context.per_frame.get(index).swapchain_acquire_semaphore;

            if (old_semaphore != VK_NULL_HANDLE) {
                context.recycled_semaphores.add(old_semaphore);
            }

            context.per_frame.get(index).swapchain_acquire_semaphore = acquire_semaphore;

            return VK_SUCCESS;
        }
    }

    private void render_triangle(int swapchain_index) {
        try (MemoryStack stack = stackPush()) {
            VkCommandBuffer cmd = context.per_frame.get(swapchain_index).primary_command_buffer;

            VkCommandBufferBeginInfo begin_info = VkCommandBufferBeginInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO)
                .flags(VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT);

            VK_CHECK(vkBeginCommandBuffer(cmd, begin_info));

            transition_image_layout(
                cmd,
                context.swapchain_images.get(swapchain_index),
                VK_IMAGE_LAYOUT_UNDEFINED,
                VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL,
                0,
                VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT,
                VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT,
                VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT
            );

            VkClearColorValue clear_color = VkClearColorValue.calloc(stack)
                .float32(0, 0.01f)
                .float32(1, 0.01f)
                .float32(2, 0.33f)
                .float32(3, 1.0f);

            VkClearValue clear_value = VkClearValue.calloc(stack)
                .color(clear_color);

            VkRenderingAttachmentInfo.Buffer color_attachment = VkRenderingAttachmentInfo.calloc(1, stack)
                .sType(VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO)
                .imageView(context.swapchain_image_views.get(swapchain_index))
                .imageLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL)
                .loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
                .storeOp(VK_ATTACHMENT_STORE_OP_STORE)
                .clearValue(clear_value);

            VkOffset2D render_offset = VkOffset2D.calloc(stack)
                .set(0, 0);

            VkExtent2D render_extent = VkExtent2D.calloc(stack)
                .width(context.swapchain_dimensions.width)
                .height(context.swapchain_dimensions.height);

            VkRect2D rendering_rect = VkRect2D.calloc(stack)
                .offset(render_offset)
                .extent(render_extent);

            VkRenderingInfo rendering_info = VkRenderingInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_RENDERING_INFO_KHR)
                .renderArea(rendering_rect)
                .layerCount(1)
                .pColorAttachments(color_attachment);

            vkCmdBeginRendering(cmd, rendering_info);

            vkCmdBindPipeline(cmd, VK_PIPELINE_BIND_POINT_GRAPHICS, context.pipeline);

            VkViewport.Buffer vp = VkViewport.calloc(1, stack)
                .width(context.swapchain_dimensions.width)
                .height(context.swapchain_dimensions.height)
                .minDepth(0.0f)
                .maxDepth(1.0f);

            vkCmdSetViewport(cmd, 0, vp);

            VkExtent2D scissor_extent = VkExtent2D.calloc(stack)
                .width(context.swapchain_dimensions.width)
                .height(context.swapchain_dimensions.height);

            VkRect2D.Buffer scissor = VkRect2D.calloc(1, stack)
                .extent(scissor_extent);

            vkCmdSetScissor(cmd, 0, scissor);

            vkCmdSetCullMode(cmd, VK_CULL_MODE_NONE);

            vkCmdSetFrontFace(cmd, VK_FRONT_FACE_CLOCKWISE);

            vkCmdSetPrimitiveTopology(cmd, VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);

            LongBuffer pl = stack.mallocLong(1);

            vkCmdBindVertexBuffers(cmd, 0, stack.longs(context.vertex_buffer), pl.put(0, 0));

            vkCmdDraw(cmd, 3, 1, 0, 0);

            vkCmdEndRendering(cmd);

            transition_image_layout(
                cmd,
                context.swapchain_images.get(swapchain_index),
                VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL,
                VK_IMAGE_LAYOUT_PRESENT_SRC_KHR,
                VK_ACCESS_2_COLOR_ATTACHMENT_WRITE_BIT,
                0,
                VK_PIPELINE_STAGE_2_COLOR_ATTACHMENT_OUTPUT_BIT,
                VK_PIPELINE_STAGE_2_BOTTOM_OF_PIPE_BIT
            );

            VK_CHECK(vkEndCommandBuffer(cmd));

            IntBuffer     pi = stack.mallocInt(1);
            PointerBuffer pp = stack.mallocPointer(1);

            if (context.per_frame.get(swapchain_index).swapchain_release_semaphore == VK_NULL_HANDLE) {
                VkSemaphoreCreateInfo semaphore_info = VkSemaphoreCreateInfo.calloc(stack)
                    .sType(VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);


                VK_CHECK(vkCreateSemaphore(context.device, semaphore_info, null, pl));
                context.per_frame.get(swapchain_index).swapchain_release_semaphore = pl.get(0);
            }

            VkSubmitInfo info = VkSubmitInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_SUBMIT_INFO)
                .waitSemaphoreCount(1)
                .pWaitSemaphores(pl.put(0, context.per_frame.get(swapchain_index).swapchain_acquire_semaphore))
                .pWaitDstStageMask(pi.put(0, (int)VK_PIPELINE_STAGE_2_TOP_OF_PIPE_BIT))
                .pCommandBuffers(pp.put(0, cmd))
                .pSignalSemaphores(stack.longs(context.per_frame.get(swapchain_index).swapchain_release_semaphore));

            VK_CHECK(vkQueueSubmit(context.queue, info, context.per_frame.get(swapchain_index).queue_submit_fence));
        }
    }

    private int present_image(int index) {
        try (MemoryStack stack = stackPush()) {
            VkPresentInfoKHR present = VkPresentInfoKHR.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_PRESENT_INFO_KHR)
                .pWaitSemaphores(stack.longs(context.per_frame.get(index).swapchain_release_semaphore))
                .swapchainCount(1)
                .pSwapchains(stack.longs(context.swapchain))
                .pImageIndices(stack.ints(index));

            return vkQueuePresentKHR(context.queue, present);
        }
    }

    private static void transition_image_layout(
        VkCommandBuffer cmd,
        long image,
        int oldLayout,
        int newLayout,
        long srcAccessMask,
        long dstAccessMask,
        long srcStage,
        long dstStage
    ) {
        try (MemoryStack stack = stackPush()) {
            VkImageSubresourceRange subresource_range = VkImageSubresourceRange.calloc(stack)
                .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                .baseMipLevel(0)
                .levelCount(1)
                .baseArrayLayer(0)
                .layerCount(1);

            VkImageMemoryBarrier2.Buffer image_barrier = VkImageMemoryBarrier2.calloc(1, stack)
                .sType(VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER_2)
                .srcStageMask(srcStage)
                .srcAccessMask(srcAccessMask)
                .dstStageMask(dstStage)
                .dstAccessMask(dstAccessMask)
                .oldLayout(oldLayout)
                .newLayout(newLayout)
                .srcQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
                .dstQueueFamilyIndex(VK_QUEUE_FAMILY_IGNORED)
                .image(image)
                .subresourceRange(subresource_range);

            VkDependencyInfo dependency_info = VkDependencyInfo.calloc(stack)
                .sType(VK_STRUCTURE_TYPE_DEPENDENCY_INFO)
                .dependencyFlags(0)
                .pImageMemoryBarriers(image_barrier);

            vkCmdPipelineBarrier2(cmd, dependency_info);
        }
    }

    @Override
    public void close() { destroy(); }
    private void destroy() {
        if (context.device != null) {
            vkDeviceWaitIdle(context.device);
        }

        for (PerFrame per_frame : context.per_frame) {
            teardown_per_frame(per_frame);
        }

        context.per_frame.clear();

        for (long semaphore : context.recycled_semaphores) {
            vkDestroySemaphore(context.device, semaphore, null);
        }

        if (context.pipeline != VK_NULL_HANDLE) {
            vkDestroyPipeline(context.device, context.pipeline, null);
        }

        if (context.pipeline_layout != VK_NULL_HANDLE) {
            vkDestroyPipelineLayout(context.device, context.pipeline_layout, null);
        }

        for (long image_view : context.swapchain_image_views) {
            vkDestroyImageView(context.device, image_view, null);
        }

        if (context.swapchain != VK_NULL_HANDLE) {
            vkDestroySwapchainKHR(context.device, context.swapchain, null);
            context.swapchain = VK_NULL_HANDLE;
        }

        if (context.surface != VK_NULL_HANDLE) {
            vkDestroySurfaceKHR(context.instance, context.surface, null);
            context.surface = VK_NULL_HANDLE;
        }

        if (context.vertex_buffer != VK_NULL_HANDLE) {
            vkDestroyBuffer(context.device, context.vertex_buffer, null);
            context.vertex_buffer = VK_NULL_HANDLE;
        }

        if (context.vertex_buffer_memory != VK_NULL_HANDLE) {
            vkFreeMemory(context.device, context.vertex_buffer_memory, null);
            context.vertex_buffer_memory = VK_NULL_HANDLE;
        }

        if (context.device != null) {
            vkDestroyDevice(context.device, null);
            context.device = null;
        }

        if (context.debug_callback != null) {
            vkDestroyDebugUtilsMessengerEXT(context.instance, dbg_msg_callback_pointer, null);
        }

        vk_instance.free();
        vk_instance = null;

        if (context.debug_callback != null) {
            context.debug_callback.free();
            context.debug_callback = null;
        }
    }

    @Override
    public boolean prepare(Window window) {
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
        init_pipeline();

        return true;
    }


    @Override
    public void update() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer index = stack.mallocInt(1);

            int res = acquire_next_swapchain_image(index);

            if (res == VK_SUBOPTIMAL_KHR || res == VK_ERROR_OUT_OF_DATE_KHR) {
                if (!resize()) {
                    System.err.println("Resize failed");
                }
                res = acquire_next_swapchain_image(index);
            }

            if (res != VK_SUCCESS) {
                vkQueueWaitIdle(context.queue);
                return;
            }

            render_triangle(index.get(0));
            res = present_image(index.get(0));

            if (res == VK_SUBOPTIMAL_KHR || res == VK_ERROR_OUT_OF_DATE_KHR) {
                if (!resize()) {
                    System.err.println("Resize failed");
                }
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

            vkDeviceWaitIdle(context.device);

            init_swapchain();
            return true;
        }
    }

    public static void main(String[] args) {
        int    width  = 1280;
        int    height = 720;
        String title  = "Vulkan Samples: Hello Triangle - VK 1.3";

        try (
            Window window = "GLFW".equalsIgnoreCase(System.getProperty("window", "SDL"))
                ? new GLFWWindow(width, height, title)
                : new SDLWindow(width, height, title);
            HelloTriangle_1_3 app = new HelloTriangle_1_3()
        ) {
            app.prepare(window);
            window.mainLoop(app);
        }
    }
}