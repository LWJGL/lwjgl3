/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.vulkan.khronos;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.shaderc.Shaderc.*;
import static org.lwjgl.vulkan.KHRSurface.*;
import static org.lwjgl.vulkan.VK10.*;

/** Base class and utilities for the hello_triangle samples. */
public abstract class Demo implements AutoCloseable {

    static final long UINT64_MAX = 0xFFFFFFFFFFFFFFFFL;

    static final boolean VK_DEBUG;
    static {
        String property = System.getProperty("debug");
        VK_DEBUG = property == null || Boolean.parseBoolean(property);
    }

    protected Demo() {
    }

    abstract boolean prepare(Window window);
    abstract boolean resize();
    abstract void update();

    static void VK_CHECK(int vkResult) {
        if (vkResult != VK_SUCCESS) {
            throw new RuntimeException("Detected Vulkan error: " + vkResult);
        }
    }

    static void select_surface_format(VkPhysicalDevice gpu, long surface, VkSurfaceFormatKHR formatOut, int... preferred_formats) {
        if (preferred_formats.length == 0) {
            preferred_formats = new int[] {
                VK_FORMAT_R8G8B8A8_SRGB,
                VK_FORMAT_B8G8R8A8_SRGB,
                VK_FORMAT_A8B8G8R8_SRGB_PACK32
            };
        }

        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer pi = stack.mallocInt(1);

            VK_CHECK(vkGetPhysicalDeviceSurfaceFormatsKHR(gpu, surface, pi, null));
            int surface_format_count = pi.get(0);
            assert (0 < surface_format_count);

            try (VkSurfaceFormatKHR.Buffer supported_surface_formats = VkSurfaceFormatKHR.calloc(surface_format_count)) {
                VK_CHECK(vkGetPhysicalDeviceSurfaceFormatsKHR(gpu, surface, pi, supported_surface_formats));

                // We use the first supported format as a fallback in case none of the preferred formats is available
                int it = 0;

                out:
                for (int i = 0; i < surface_format_count; i++) {
                    int supportedFormat = supported_surface_formats.get(i).format();
                    for (int format : preferred_formats) {
                        if (format == supportedFormat) {
                            it = i;
                            break out;
                        }
                    }
                }

                supported_surface_formats.get(it, formatOut);
            }
        }
    }

    static long compile_shader(String fileName, int shaderType, long compiler, long options) {
        ByteBuffer shader_source;
        try {
            shader_source = ioResourceToByteBuffer(fileName, 1024);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load shader source", e);
        }

        long result;
        try (MemoryStack stack = stackPush()) {
            result = shaderc_compile_into_spv(
                compiler,
                shader_source,
                shaderType,
                stack.UTF8(fileName),
                stack.UTF8("main"),
                options
            );
        }

        if (shaderc_result_get_compilation_status(result) != shaderc_compilation_status_success) {
            throw new RuntimeException("Shader compilation failed: " + shaderc_result_get_error_message(result));
        }

        return result;
    }


    public static class Instance {

        private final VkInstance handle;

        private final List<PhysicalDevice> gpus = new ArrayList<>();

        Instance(VkInstance instance) {
            handle = instance;
            if (handle.address() != VK_NULL_HANDLE) {
                query_gpus();
            } else {
                throw new RuntimeException("Instance not valid");
            }
        }

        void query_gpus() {
            try (MemoryStack stack = MemoryStack.stackPush()) {
                // Querying valid physical devices on the machine
                IntBuffer physical_device_count = stack.mallocInt(1);
                VK_CHECK(vkEnumeratePhysicalDevices(handle, physical_device_count, null));

                if (physical_device_count.get(0) < 1) {
                    throw new RuntimeException("Couldn't find a physical device that supports Vulkan.");
                }

                PointerBuffer physical_devices = stack.mallocPointer(physical_device_count.get(0));
                VK_CHECK(vkEnumeratePhysicalDevices(handle, physical_device_count, physical_devices));

                // Create gpus wrapper objects from the VkPhysicalDevice's
                for (int i = 0; i < physical_devices.capacity(); ++i) {
                    gpus.add(new PhysicalDevice(new VkPhysicalDevice(physical_devices.get(i), handle)));
                }
            }
        }

        public void free() {
            for (PhysicalDevice gpu : gpus) {
                gpu.free();
            }
            vkDestroyInstance(handle, null);
        }

        public VkInstance getHandle() {
            return handle;
        }

    }

    static class PhysicalDevice {

        private final VkPhysicalDevice handle;

        private final VkPhysicalDeviceFeatures         features          = VkPhysicalDeviceFeatures.calloc();
        private final VkPhysicalDeviceProperties       properties        = VkPhysicalDeviceProperties.calloc();
        private final VkPhysicalDeviceMemoryProperties memory_properties = VkPhysicalDeviceMemoryProperties.calloc();

        private final VkQueueFamilyProperties.Buffer queue_family_properties;
        private final VkExtensionProperties.Buffer   device_extensions;

        PhysicalDevice(VkPhysicalDevice physical_device) {
            handle = physical_device;

            vkGetPhysicalDeviceFeatures(physical_device, features);
            vkGetPhysicalDeviceProperties(physical_device, properties);
            vkGetPhysicalDeviceMemoryProperties(physical_device, memory_properties);

            System.out.printf("Found GPU: %s%n", properties.deviceNameString());
            try (MemoryStack stack = stackPush()) {
                IntBuffer queue_family_properties_count = stack.mallocInt(1);
                vkGetPhysicalDeviceQueueFamilyProperties(physical_device, queue_family_properties_count, null);

                queue_family_properties = VkQueueFamilyProperties.calloc(queue_family_properties_count.get(0));
                vkGetPhysicalDeviceQueueFamilyProperties(physical_device, queue_family_properties_count, queue_family_properties);

                IntBuffer device_extension_count = stack.mallocInt(1);
                VK_CHECK(vkEnumerateDeviceExtensionProperties(get_handle(), (ByteBuffer)null, device_extension_count, null));

                device_extensions = VkExtensionProperties.calloc(device_extension_count.get(0));
                VK_CHECK(vkEnumerateDeviceExtensionProperties(get_handle(), (ByteBuffer)null, device_extension_count, device_extensions));
            }

            // Display supported extensions
            if (device_extensions.capacity() > 0) {
                if (VK_DEBUG) {
                    System.out.println("[debug] Device supports the following extensions:");
                }
                for (VkExtensionProperties extension : device_extensions) {
                    if (VK_DEBUG) {
                        System.out.printf("[debug]  \t%s%n", extension.extensionNameString());
                    }
                }
            }
        }

        public VkPhysicalDevice get_handle() {
            return handle;
        }

        public void free() {
            device_extensions.free();
            queue_family_properties.free();
            memory_properties.free();
            properties.free();
            features.free();
        }
    }

    /**
     * Swapchain state
     */
    static class SwapchainDimensions {
        // Width of the swapchain.
        int width;

        // Height of the swapchain.
        int height;

        // Pixel format of the swapchain.
        int format;

        SwapchainDimensions(int width, int height, int format) {
            this.width = width;
            this.height = height;
            this.format = format;
        }
    }

    /**
     * Per-frame data
     */
    static class PerFrame {
        long queue_submit_fence   = VK_NULL_HANDLE;
        long primary_command_pool = VK_NULL_HANDLE;

        VkCommandBuffer primary_command_buffer;

        long swapchain_acquire_semaphore = VK_NULL_HANDLE;
        long swapchain_release_semaphore = VK_NULL_HANDLE;
    }

}