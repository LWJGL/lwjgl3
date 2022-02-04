/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.openxr;

import org.joml.*;
import org.lwjgl.*;
import org.lwjgl.openxr.*;
import org.lwjgl.system.*;
import org.lwjgl.vulkan.*;

import java.io.*;
import java.lang.reflect.*;
import java.nio.*;
import java.util.Random;
import java.util.*;
import java.util.function.*;

import static org.joml.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.openxr.EXTDebugUtils.*;
import static org.lwjgl.openxr.KHRVulkanEnable.*;
import static org.lwjgl.openxr.XR10.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.EXTDebugUtils.*;
import static org.lwjgl.vulkan.VK10.*;

public class HelloOpenXRVK {

    private static final String VK_LAYER_LUNARG_STANDARD_VALIDATION = "VK_LAYER_LUNARG_standard_validation";

    private static final int VERTEX_SIZE              = 2 * 3 * 4;
    private static final int VERTEX_LOCATION_POSITION = 0;
    private static final int VERTEX_LOCATION_COLOR    = 1;
    private static final int VERTEX_OFFSET_POSITION   = 0;
    private static final int VERTEX_OFFSET_COLOR      = 1 * 3 * 4;

    private static final int INDEX_SIZE = 2;
    private static final int INDEX_TYPE = VK_INDEX_TYPE_UINT16;

    private static class BigModel {

        static final int NUM_CUBES = 500;

        static final int NUM_VERTICES = NUM_CUBES * 6 * 4;
        static final int NUM_INDICES  = NUM_CUBES * 6 * 6;
    }

    private static class SwapchainImage {
        final long colorImage;
        final long colorImageView;
        final long framebuffer;

        SwapchainImage(long colorImage, long colorImageView, long framebuffer) {
            this.colorImage = colorImage;
            this.colorImageView = colorImageView;
            this.framebuffer = framebuffer;
        }
    }

    private static class SwapchainWrapper {

        final XrSwapchain swapchain;

        final int width, height, numSamples;

        final long depthImage;
        final long depthImageView;
        final long depthImageMemory;

        final SwapchainImage[] images;

        final long fence;

        final VkCommandBuffer commandBuffer;

        SwapchainWrapper(
            XrSwapchain swapchain, int width, int height, int numSamples,
            long depthImage, long depthImageView, long depthImageMemory, SwapchainImage[] images,
            long fence, VkCommandBuffer commandBuffer
        ) {
            if (swapchain == null) {
                throw new NullPointerException("swapchain");
            }
            this.swapchain = swapchain;
            if (width <= 0) {
                throw new IllegalArgumentException("width is " + width);
            }
            this.width = width;
            if (height <= 0) {
                throw new IllegalArgumentException("height is " + height);
            }
            this.height = height;

            if (numSamples <= 0) {
                throw new IllegalArgumentException("numSamples is " + numSamples);
            }

            if (images == null) {
                throw new IllegalArgumentException("images are null");
            }
            this.numSamples = numSamples;
            for (SwapchainImage image : images) {
                if (image == null) {
                    throw new IllegalArgumentException("An image is null");
                }

                if (image.colorImage == 0) {
                    throw new IllegalArgumentException("A color image is 0");
                }
                if (image.colorImageView == 0) {
                    throw new IllegalArgumentException("A color image view is 0");
                }
                if (image.framebuffer == 0) {
                    throw new IllegalArgumentException("A framebuffer is 0");
                }
            }
            this.images = images;

            if (depthImage == 0) {
                throw new IllegalArgumentException("The depth image is 0");
            }
            this.depthImage = depthImage;
            if (depthImageView == 0) {
                throw new IllegalArgumentException("The depth image view is 0");
            }
            this.depthImageView = depthImageView;
            if (depthImageMemory == 0) {
                throw new IllegalArgumentException("The depth image memory is 0");
            }
            this.depthImageMemory = depthImageMemory;

            if (fence == 0) {
                throw new IllegalArgumentException("Fence is 0");
            }
            this.fence = fence;

            if (commandBuffer == null) {
                throw new NullPointerException("commandBuffer");
            }
            this.commandBuffer = commandBuffer;
        }
    }

    private static ByteBuffer getShaderResource(String resource) {
        try {
            return ioResourceToByteBuffer(resource, 2048);
        } catch (IOException e) {
            throw new IllegalStateException("Needed resources should always be available", e);
        }
    }

    public static void main(String[] args) {
        HelloOpenXRVK classInstance = new HelloOpenXRVK();
        classInstance.start();
    }

    private XrInstance xrInstance;

    private XrDebugUtilsMessengerEXT xrDebugMessenger;

    private long xrSystemId;

    private XrSession xrVkSession;

    private int xrSessionState;

    private XrActionSet xrActionSet;
    private XrAction    xrHandPoseAction;
    private XrAction    xrHandClickAction;

    private long xrPathLeftHand;
    private long xrPathRightHand;

    private XrSpace xrLeftHandSpace;
    private XrSpace xrRightHandSpace;

    private boolean missingXrDebug;

    private VkInstance vkInstance;

    private long vkDebugMessenger;

    private VkPhysicalDevice vkPhysicalDevice;
    private VkDevice         vkDevice;

    private VkQueue vkQueue;

    private int vkQueueFamilyIndex;
    private int vkQueueIndex;

    private long vkCommandPoolCopying;
    private long vkCommandPoolDrawing;

    private long vkRenderPass;
    private long vkPipelineLayout;

    private long[] vkGraphicsPipelines;

    private long vkDeviceMemory;
    private long vkBigBuffer;

    private SwapchainWrapper[] swapchains;

    private int viewConfiguration;
    private int swapchainColorFormat;
    private int swapchainDepthFormat;

    private XrSpace renderSpace;

    // The default value can be used in edge cases where the position tracking of the driver fails right at the start
    // Let's hope it won't be used a lot
    private Matrix4f lastCameraMatrix = new Matrix4f().perspective(toRadians(70f), 0.7f, 0.01f, 100f, true);

    private void start() {
        try {
            createXrInstance();
            initXrSystem();
            initVk();
            createXrVkSession();
            initXrActions();
            createRenderResources();
            loopXrSession();
        } catch (RuntimeException ex) {
            System.err.println("OpenXR testing failed:");
            ex.printStackTrace();
        }

        // Always clean up
        destroySwapchains();
        destroyXrVkSession();
        destroyVk();
        destroyXrInstance();
    }

    private void createXrInstance() {
        try (MemoryStack stack = stackPush()) {
            boolean hasCoreValidationLayer = false;

            IntBuffer pi = stack.callocInt(1);
            xrCheck(xrEnumerateApiLayerProperties(pi, null), "EnumerateApiLayerProperties");
            int numLayers = pi.get(0);

            XrApiLayerProperties.Buffer pLayers = XRHelper.prepareApiLayerProperties(stack, numLayers);
            xrCheck(xrEnumerateApiLayerProperties(pi, pLayers), "EnumerateApiLayerProperties");
            System.out.println(numLayers + " XR layers are available:");
            for (int index = 0; index < numLayers; index++) {
                XrApiLayerProperties layer = pLayers.get(index);

                String layerName = layer.layerNameString();
                System.out.println(layerName);
                if (layerName.equals("XR_APILAYER_LUNARG_core_validation")) {
                    hasCoreValidationLayer = true;
                }
            }
            System.out.println("-----------");

            xrCheck(xrEnumerateInstanceExtensionProperties((ByteBuffer)null, pi, null), "EnumerateInstanceExtensionProperties");
            int numExtensions = pi.get(0);

            XrExtensionProperties.Buffer properties = XRHelper.prepareExtensionProperties(stack, numExtensions);
            xrCheck(xrEnumerateInstanceExtensionProperties((ByteBuffer)null, pi, properties), "EnumerateInstanceExtensionProperties");

            System.out.printf("OpenXR loaded with %d extensions:%n", numExtensions);
            System.out.println("~~~~~~~~~~~~~~~~~~");

            missingXrDebug = true;
            boolean missingVulkan = true;

            PointerBuffer extensions = stack.mallocPointer(numExtensions);
            for (int i = 0; i < numExtensions; i++) {
                XrExtensionProperties prop = properties.get(i);
                extensions.put(i, prop.extensionName());

                String extensionName = prop.extensionNameString();
                System.out.println(extensionName);
                if (extensionName.equals(KHRVulkanEnable.XR_KHR_VULKAN_ENABLE_EXTENSION_NAME)) {
                    missingVulkan = false;
                }
                if (extensionName.equals("XR_EXT_debug_utils")) {
                    missingXrDebug = false;
                }
            }
            System.out.println("~~~~~~~~~~~~~~~~~~");

            if (missingVulkan) {
                throw new IllegalStateException("OpenXR library does not provide required extension: " + KHRVulkanEnable.XR_KHR_VULKAN_ENABLE_EXTENSION_NAME);
            }

            PointerBuffer wantedExtensions;
            if (missingXrDebug) {
                wantedExtensions = stack.callocPointer(1);
            } else {
                wantedExtensions = stack.callocPointer(2);
                wantedExtensions.put(1, stack.UTF8("XR_EXT_debug_utils"));
                System.out.println("Enabling XR debug utils");
            }
            wantedExtensions.put(0, stack.UTF8(XR_KHR_VULKAN_ENABLE_EXTENSION_NAME));

            PointerBuffer wantedLayers;
            if (hasCoreValidationLayer) {
                wantedLayers = stack.callocPointer(1);
                wantedLayers.put(0, stack.UTF8("XR_APILAYER_LUNARG_core_validation"));
                System.out.println("Enabling XR core validation");
            } else {
                wantedLayers = null;
            }

            XrInstanceCreateInfo createInfo = XrInstanceCreateInfo.malloc(stack)
                .type$Default()
                .next(NULL)
                .createFlags(0)
                .applicationInfo(XrApplicationInfo.malloc(stack)
                    .applicationName(stack.UTF8("DummyXRVK"))
                    .apiVersion(XR_CURRENT_API_VERSION))
                .enabledApiLayerNames(wantedLayers)
                .enabledExtensionNames(wantedExtensions);

            System.out.println("Create instance...");
            PointerBuffer pp = stack.mallocPointer(1);
            xrCheck(xrCreateInstance(createInfo, pp), "CreateInstance");
            xrInstance = new XrInstance(pp.get(0), createInfo);
            System.out.println("Created instance");
        }
    }

    private void initXrSystem() {
        try (MemoryStack stack = stackPush()) {
            XrSystemGetInfo giSystem = XrSystemGetInfo.calloc(stack)
                .type$Default()
                .formFactor(XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY);

            LongBuffer pl = stack.callocLong(1);
            System.out.println("xrInstance is " + xrInstance + " and giSystem is " + giSystem);
            xrCheck(xrGetSystem(xrInstance, giSystem, pl), "GetSystem");
            xrSystemId = pl.get(0);

            System.out.println("System ID is " + xrSystemId);
        }
    }

    private void initXrActions() {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            LongBuffer    lp = stack.mallocLong(1);

            xrCheck(xrCreateActionSet(
                xrInstance,
                XrActionSetCreateInfo.calloc(stack)
                    .type$Default()
                    .priority(1)
                    .actionSetName(stack.UTF8("handcontrols"))
                    .localizedActionSetName(stack.UTF8("Demo Hand Controls")),
                pp
            ), "CreateActionSet");
            this.xrActionSet = new XrActionSet(pp.get(0), xrInstance);

            xrCheck(xrStringToPath(xrInstance, stack.UTF8("/user/hand/left"), lp), "StringToPath");
            this.xrPathLeftHand = lp.get(0);

            xrCheck(xrStringToPath(xrInstance, stack.UTF8("/user/hand/right"), lp), "StringToPath");
            this.xrPathRightHand = lp.get(0);

            xrCheck(xrCreateAction(
                xrActionSet,
                XrActionCreateInfo.calloc(stack)
                    .type$Default()
                    .actionType(XR_ACTION_TYPE_POSE_INPUT)
                    .actionName(stack.UTF8("handpose"))
                    .localizedActionName(stack.UTF8("Hand pose"))
                    .subactionPaths(stack.longs(xrPathLeftHand, xrPathRightHand)),
                pp), "CreateAction");
            this.xrHandPoseAction = new XrAction(pp.get(0), xrActionSet);

            xrCheck(xrCreateAction(
                xrActionSet,
                XrActionCreateInfo.calloc(stack)
                    .type$Default()
                    .actionType(XR_ACTION_TYPE_BOOLEAN_INPUT)
                    .actionName(stack.UTF8("invert_colors"))
                    .localizedActionName(stack.UTF8("Invert colors"))
                    .subactionPaths(stack.longs(xrPathLeftHand, xrPathRightHand)),
                pp
            ), "CreateAction");
            this.xrHandClickAction = new XrAction(pp.get(0), xrActionSet);

            xrCheck(xrStringToPath(xrInstance, stack.UTF8("/interaction_profiles/khr/simple_controller"), lp), "StringToPath");
            long interactionProfile = lp.get(0);

            XrActionSuggestedBinding.Buffer suggestedBindings = XrActionSuggestedBinding.calloc(4, stack);

            xrCheck(xrStringToPath(xrInstance, stack.UTF8("/user/hand/left/input/grip/pose"), lp), "StringToPath");
            suggestedBindings.get(0)
                .action(xrHandPoseAction)
                .binding(lp.get(0));

            xrCheck(xrStringToPath(xrInstance, stack.UTF8("/user/hand/right/input/grip/pose"), lp), "StringToPath");
            suggestedBindings.get(1)
                .action(xrHandPoseAction)
                .binding(lp.get(0));

            xrCheck(xrStringToPath(xrInstance, stack.UTF8("/user/hand/left/input/select/click"), lp), "StringToPath");
            suggestedBindings.get(2)
                .action(xrHandClickAction)
                .binding(lp.get(0));

            xrCheck(xrStringToPath(xrInstance, stack.UTF8("/user/hand/right/input/select/click"), lp), "StringToPath");
            suggestedBindings.get(3)
                .action(xrHandClickAction)
                .binding(lp.get(0));

            xrCheck(xrSuggestInteractionProfileBindings(
                xrInstance,
                XrInteractionProfileSuggestedBinding.calloc(stack)
                    .type$Default()
                    .interactionProfile(interactionProfile)
                    .suggestedBindings(suggestedBindings)
            ), "SuggestInteractionProfileBindings");

            xrCheck(xrCreateActionSpace(
                xrVkSession,
                XrActionSpaceCreateInfo.calloc(stack)
                    .type$Default()
                    .action(xrHandPoseAction)
                    .subactionPath(xrPathLeftHand)
                    .poseInActionSpace(identityPose(stack)),
                pp
            ), "CreateActionSpace");
            this.xrLeftHandSpace = new XrSpace(pp.get(0), xrVkSession);

            xrCheck(xrCreateActionSpace(
                xrVkSession,
                XrActionSpaceCreateInfo.calloc(stack)
                    .type$Default()
                    .action(xrHandPoseAction)
                    .subactionPath(xrPathRightHand)
                    .poseInActionSpace(identityPose(stack)),
                pp
            ), "CreateActionSpace");
            this.xrRightHandSpace = new XrSpace(pp.get(0), xrVkSession);

            xrCheck(xrAttachSessionActionSets(
                xrVkSession,
                XrSessionActionSetsAttachInfo.calloc(stack)
                    .type$Default()
                    .actionSets(stack.pointers(xrActionSet))
            ), "AttachSessionActionSets");
        }
    }

    private void initVk() {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            IntBuffer     pi = stack.mallocInt(1);
            LongBuffer    pl = stack.mallocLong(1);

            XrGraphicsRequirementsVulkanKHR graphicsRequirements = XrGraphicsRequirementsVulkanKHR.calloc(stack)
                .type$Default();

            xrCheck(xrGetVulkanGraphicsRequirementsKHR(xrInstance, xrSystemId, graphicsRequirements), "GetVulkanGraphicsRequirements");

            long minApiVersion = graphicsRequirements.minApiVersionSupported();
            long maxApiVersion = graphicsRequirements.maxApiVersionSupported();

            long minVkMajor = XR_VERSION_MAJOR(minApiVersion);
            long minVkMinor = XR_VERSION_MINOR(minApiVersion);
            long minVkPatch = XR_VERSION_PATCH(minApiVersion);

            System.out.println("Minimum Vulkan API version: " + minVkMajor + "." + minVkMinor + "." + minVkPatch);
            System.out.println("Maximum Vulkan API version: " + XR_VERSION_MAJOR(maxApiVersion) + "." + XR_VERSION_MINOR(maxApiVersion) + "." + XR_VERSION_PATCH(maxApiVersion));

            VkInstanceCreateInfo ciInstance = VkInstanceCreateInfo.calloc(stack)
                .sType$Default()
                .pApplicationInfo(VkApplicationInfo.calloc(stack)
                    .sType$Default()
                    .pApplicationName(stack.UTF8("DummyXRVK"))
                    .applicationVersion(VK_MAKE_VERSION(0, 1, 0))
                    .apiVersion(VK_MAKE_VERSION((int)minVkMajor, (int)minVkMinor, (int)minVkPatch)));

            xrCheck(xrGetVulkanInstanceExtensionsKHR(xrInstance, xrSystemId, pi, null), "GetVulkanInstanceExtensions");

            ByteBuffer pXrVkInstanceExtensions = stack.calloc(pi.get(0));
            xrCheck(xrGetVulkanInstanceExtensionsKHR(xrInstance, xrSystemId, pi, pXrVkInstanceExtensions), "GetVulkanInstanceExtensions");

            // NOTE: The call to memAddress is important because LWJGL doesn't expect byte buffers to end with the null char
            String[]    requiredInstanceExtensionsArray = memUTF8(memAddress(pXrVkInstanceExtensions)).split(" ");
            Set<String> requiredInstanceExtensions      = new HashSet<>(requiredInstanceExtensionsArray.length);
            Collections.addAll(requiredInstanceExtensions, requiredInstanceExtensionsArray);

            vkCheck(vkEnumerateInstanceExtensionProperties((ByteBuffer)null, pi, null), "EnumerateInstanceExtensionProperties");
            int numExtensions = pi.get(0);

            VkExtensionProperties.Buffer pExtensionProps = VkExtensionProperties.calloc(numExtensions, stack);
            vkCheck(vkEnumerateInstanceExtensionProperties((ByteBuffer)null, pi, pExtensionProps), "EnumerateInstanceExtensionProperties");

            Set<String> availableInstanceExtensions = new HashSet<>(numExtensions);
            for (int index = 0; index < numExtensions; index++) {
                availableInstanceExtensions.add(pExtensionProps.get(index).extensionNameString());
            }

            boolean hasExtDebugUtils = availableInstanceExtensions.contains(VK_EXT_DEBUG_UTILS_EXTENSION_NAME);
            System.out.println("Available Vulkan instance extensions:");
            for (String extension : availableInstanceExtensions) {
                System.out.println(extension);
            }
            System.out.println("-----------");

            Set<String> chosenInstanceExtensions = new HashSet<>(requiredInstanceExtensions.size() + 1);
            if (hasExtDebugUtils) {
                chosenInstanceExtensions.add(VK_EXT_DEBUG_UTILS_EXTENSION_NAME);
            }
            System.out.println(requiredInstanceExtensions.size() + " Vulkan instance extensions are required for OpenXR:");
            for (String extension : requiredInstanceExtensions) {
                if (availableInstanceExtensions.contains(extension)) {
                    System.out.println(extension);
                    chosenInstanceExtensions.add(extension);
                } else {
                    // This can happen if the OpenXR runtime is being stupid
                    System.out.println(extension + " [NOT SUPPORTED]");
                }
            }
            System.out.println("--------------");

            PointerBuffer ppExtensionNames = stack.callocPointer(chosenInstanceExtensions.size());

            int instanceExtensionIndex = 0;
            for (String extension : chosenInstanceExtensions) {
                ppExtensionNames.put(instanceExtensionIndex, stack.UTF8(extension));
                instanceExtensionIndex++;
            }
            ciInstance.ppEnabledExtensionNames(ppExtensionNames);

            vkCheck(vkEnumerateInstanceLayerProperties(pi, null), "EnumerateInstanceLayerProperties");
            int propertyCount = pi.get(0);

            VkLayerProperties.Buffer layerProps = VkLayerProperties.calloc(propertyCount, stack);
            vkCheck(vkEnumerateInstanceLayerProperties(pi, layerProps), "EnumerateInstanceLayerProperties");

            boolean hasValidationLayer = false;
            System.out.println("Available vulkan layers:");
            for (int index = 0; index < propertyCount; index++) {
                VkLayerProperties layerProp = layerProps.get(index);

                String layerName = layerProp.layerNameString();
                System.out.println(layerName);
                if (layerName.equals(VK_LAYER_LUNARG_STANDARD_VALIDATION)) {
                    hasValidationLayer = true;
                }
            }
            System.out.println("-------------");

            if (hasValidationLayer) {
                System.out.println("Enabling vulkan validation layer");
                PointerBuffer ppLayers = stack.callocPointer(1);
                ppLayers.put(0, stack.UTF8(VK_LAYER_LUNARG_STANDARD_VALIDATION));
                ciInstance.ppEnabledLayerNames(ppLayers);
            } else {
                System.out.println("Vulkan validation layer is not available");
            }

            vkCheck(vkCreateInstance(ciInstance, null, pp), "CreateInstance");
            vkInstance = new VkInstance(pp.get(0), ciInstance);

            if (hasExtDebugUtils) {
                VkDebugUtilsMessengerCreateInfoEXT ciDebugUtils = VkDebugUtilsMessengerCreateInfoEXT.calloc(stack)
                    .sType$Default()
                    .messageSeverity(
                        VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                        VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
                    )
                    .messageType(
                        VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                        VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT |
                        VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT
                    )
                    .pfnUserCallback((messageSeverity, messageTypes, pCallbackData, userData) -> {
                        VkDebugUtilsMessengerCallbackDataEXT callbackData = VkDebugUtilsMessengerCallbackDataEXT.create(pCallbackData);
                        System.out.println("DebugUtils: " + callbackData.pMessageString());
                        return 0;
                    });

                vkCheck(vkCreateDebugUtilsMessengerEXT(vkInstance, ciDebugUtils, null, pl), "CreateDebugUtilsMessenger");
                vkDebugMessenger = pl.get(0);
            }

            xrCheck(xrGetVulkanGraphicsDeviceKHR(xrInstance, xrSystemId, vkInstance, pp), "GetVulkanGraphicsDevice");
            vkPhysicalDevice = new VkPhysicalDevice(pp.get(0), vkInstance);

            xrCheck(xrGetVulkanDeviceExtensionsKHR(xrInstance, xrSystemId, pi, null), "GetVulkanDeviceExtensions");
            ByteBuffer pXrDeviceExtensions = stack.calloc(pi.get(0));

            xrCheck(xrGetVulkanDeviceExtensionsKHR(xrInstance, xrSystemId, pi, pXrDeviceExtensions), "GetVulkanDeviceExtensions");
            // NOTE: The memAddress call is important because LWJGL doesn't expect byte buffers to contain the 0 char
            String[] requiredDeviceExtensions = memUTF8(memAddress(pXrDeviceExtensions)).split(" ");

            vkCheck(vkEnumerateDeviceExtensionProperties(vkPhysicalDevice, (ByteBuffer)null, pi, null), "EnumerateDeviceExtensionProperties");
            int numDeviceExtensions = pi.get(0);

            VkExtensionProperties.Buffer pAvailableDeviceExtensions = VkExtensionProperties.calloc(numDeviceExtensions, stack);
            vkCheck(vkEnumerateDeviceExtensionProperties(vkPhysicalDevice, (ByteBuffer)null, pi, pAvailableDeviceExtensions), "enumerateDeviceExtensionProperties");

            // Collect the available extensions in a set for easier lookup
            Set<String> availableDeviceExtensions = new HashSet<>(numDeviceExtensions);
            for (int index = 0; index < numDeviceExtensions; index++) {
                availableDeviceExtensions.add(pAvailableDeviceExtensions.get(index).extensionNameString());
            }

            Set<String> chosenDeviceExtensions = new HashSet<>(requiredDeviceExtensions.length);

            // Enumerate available device extensions
            System.out.println(requiredDeviceExtensions.length + " Vulkan device extensions are required for OpenXR:");
            for (String extension : requiredDeviceExtensions) {
                if (availableDeviceExtensions.contains(extension)) {
                    System.out.println(extension);
                    chosenDeviceExtensions.add(extension);
                } else {
                    // The SteamVR OpenXR runtime sometimes requires extensions that are not supported...
                    System.out.println(extension + " [NOT SUPPORTED]");
                }
            }
            System.out.println("-------------");

            VkPhysicalDeviceProperties pPhysicalProperties = VkPhysicalDeviceProperties.calloc(stack);
            vkGetPhysicalDeviceProperties(vkPhysicalDevice, pPhysicalProperties);
            System.out.println("The OpenXR runtime chose physical device " + pPhysicalProperties.deviceNameString());

            vkGetPhysicalDeviceQueueFamilyProperties(vkPhysicalDevice, pi, null);
            int queueFamilyCount = pi.get(0);

            VkQueueFamilyProperties.Buffer pQueueFamilies = VkQueueFamilyProperties.calloc(queueFamilyCount, stack);
            vkGetPhysicalDeviceQueueFamilyProperties(vkPhysicalDevice, pi, pQueueFamilies);
            System.out.println("Found " + queueFamilyCount + " queue families");

            int suitableQueueFamilyIndex = -1;
            for (int index = 0; index < queueFamilyCount; index++) {
                VkQueueFamilyProperties familyProps = pQueueFamilies.get(index);

                int flags = familyProps.queueFlags();
                if ((flags & VK_QUEUE_GRAPHICS_BIT) != 0) {
                    suitableQueueFamilyIndex = index;
                }
            }

            if (suitableQueueFamilyIndex == -1) {
                throw new RuntimeException("No queue family with graphics support was found");
            }

            vkQueueFamilyIndex = suitableQueueFamilyIndex;
            // We only use 1 queue
            vkQueueIndex = 0;

            VkDeviceQueueCreateInfo.Buffer cipDeviceQueue = VkDeviceQueueCreateInfo.calloc(1, stack);
            cipDeviceQueue.get(0)
                .sType$Default()
                .queueFamilyIndex(suitableQueueFamilyIndex)
                .pQueuePriorities(stack.floats(1.0f));

            VkDeviceCreateInfo ciDevice = VkDeviceCreateInfo.calloc(stack)
                .sType$Default()
                .pQueueCreateInfos(cipDeviceQueue);

            PointerBuffer ppDeviceExtensions = stack.callocPointer(chosenDeviceExtensions.size());

            int deviceExtensionIndex = 0;
            for (String extension : chosenDeviceExtensions) {
                ppDeviceExtensions.put(deviceExtensionIndex, stack.UTF8(extension));
                deviceExtensionIndex++;
            }
            ciDevice.ppEnabledExtensionNames(ppDeviceExtensions);

            vkCheck(vkCreateDevice(vkPhysicalDevice, ciDevice, null, pp), "CreateDevice");
            this.vkDevice = new VkDevice(pp.get(0), vkPhysicalDevice, ciDevice);

            vkGetDeviceQueue(vkDevice, vkQueueFamilyIndex, vkQueueIndex, pp);
            this.vkQueue = new VkQueue(pp.get(0), vkDevice);
        }
    }

    private void destroyVk() {
        if (this.vkRenderPass != 0) {
            vkDestroyRenderPass(vkDevice, vkRenderPass, null);
        }

        if (vkPipelineLayout != 0) {
            vkDestroyPipelineLayout(vkDevice, vkPipelineLayout, null);
        }

        if (vkGraphicsPipelines != null) {
            for (int pipelineIndex = 0; pipelineIndex < vkGraphicsPipelines.length; pipelineIndex++) {
                long graphicsPipeline = vkGraphicsPipelines[pipelineIndex];
                if (graphicsPipeline != 0 && (pipelineIndex == 0 || graphicsPipeline != vkGraphicsPipelines[pipelineIndex - 1])) {
                    vkDestroyPipeline(vkDevice, graphicsPipeline, null);
                }
            }
        }

        if (vkCommandPoolCopying != 0) {
            vkDestroyCommandPool(vkDevice, vkCommandPoolCopying, null);
        }
        if (vkCommandPoolDrawing != 0) {
            vkDestroyCommandPool(vkDevice, vkCommandPoolDrawing, null);
        }

        if (vkBigBuffer != 0) {
            vkDestroyBuffer(vkDevice, vkBigBuffer, null);
        }
        if (vkDeviceMemory != 0) {
            vkFreeMemory(vkDevice, vkDeviceMemory, null);
        }

        if (vkDevice != null) {
            vkDestroyDevice(vkDevice, null);
        }

        if (vkDebugMessenger != 0L) {
            vkDestroyDebugUtilsMessengerEXT(vkInstance, vkDebugMessenger, null);
        }
        if (vkInstance != null) {
            vkDestroyInstance(vkInstance, null);
        }
    }

    private void createXrVkSession() {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.callocPointer(1);

            xrCheck(xrCreateSession(
                xrInstance,
                XrSessionCreateInfo.calloc(stack)
                    .type$Default()
                    .systemId(xrSystemId)
                    .next(XrGraphicsBindingVulkanKHR.calloc(stack)
                        .type$Default()
                        .instance(vkInstance)
                        .physicalDevice(vkPhysicalDevice)
                        .device(vkDevice)
                        .queueFamilyIndex(vkQueueFamilyIndex)
                        .queueIndex(vkQueueIndex)),
                pp
            ), "CreateSession");
            xrVkSession = new XrSession(pp.get(0), xrInstance);
            xrSessionState = XR_SESSION_STATE_IDLE;
            System.out.println("Session is " + xrVkSession);

            if (!missingXrDebug) {
                XrDebugUtilsMessengerCreateInfoEXT ciDebugUtils = XrDebugUtilsMessengerCreateInfoEXT.calloc(stack)
                    .type$Default()
                    .messageSeverities(
                        XR_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT |
                        XR_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                        XR_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
                    )
                    .messageTypes(
                        XR_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                        XR_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                        XR_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT |
                        XR_DEBUG_UTILS_MESSAGE_TYPE_CONFORMANCE_BIT_EXT
                    )
                    .userCallback((messageSeverity, messageTypes, pCallbackData, userData) -> {
                        XrDebugUtilsMessengerCallbackDataEXT callbackData = XrDebugUtilsMessengerCallbackDataEXT.create(pCallbackData);
                        System.out.println("XR Debug Utils: " + callbackData.messageString());
                        return 0;
                    });

                System.out.println("Enabling OpenXR debug utils");
                xrCheck(xrCreateDebugUtilsMessengerEXT(xrInstance, ciDebugUtils, pp), "CreateDebugUtilsMessenger");
                xrDebugMessenger = new XrDebugUtilsMessengerEXT(pp.get(0), xrInstance);
            }
        }
    }

    private static XrPosef identityPose(MemoryStack stack) {
        return XrPosef.calloc(stack)
            .orientation(XrQuaternionf.calloc(stack)
                .w(1.0f))
            .position$(XrVector3f.calloc(stack));
    }

    private void createRenderResources() {
        chooseSwapchainFormats();
        createRenderPass();
        createCommandPools();
        createSwapchains();
        createGraphicsPipelines();
        createRenderSpace();
        createBuffers();
    }

    private int chooseMemoryTypeIndex(VkMemoryRequirements requirements, int requiredPropertyBits, MemoryStack stack) {
        VkPhysicalDeviceMemoryProperties memoryProps = VkPhysicalDeviceMemoryProperties.calloc(stack);
        vkGetPhysicalDeviceMemoryProperties(vkPhysicalDevice, memoryProps);

        for (int memoryTypeIndex = 0; memoryTypeIndex < memoryProps.memoryTypeCount(); memoryTypeIndex++) {
            boolean allowedByResource   = (requirements.memoryTypeBits() & (1 << memoryTypeIndex)) != 0;
            boolean hasNeededProperties = (memoryProps.memoryTypes(memoryTypeIndex).propertyFlags() & requiredPropertyBits) == requiredPropertyBits;

            if (allowedByResource && hasNeededProperties) {
                return memoryTypeIndex;
            }
        }

        throw new IllegalArgumentException("Failed to find suitable memory type for resource");
    }

    private static final float[][] QUAD_OFFSETS = {
        {-1, -1, 0}, {1, -1, 0}, {1, 1, 0}, {-1, 1, 0}
    };

    private static class CubePlane {

        final float constantX, constantY, constantZ;
        final float factorX, factorY, factorZ;
        final int offsetX, offsetY, offsetZ;
        final int colorIndex;

        CubePlane(
            float constantX, float constantY, float constantZ,
            float factorX, float factorY, float factorZ,
            int offsetX, int offsetY, int offsetZ, int colorIndex
        ) {
            this.constantX = constantX;
            this.constantY = constantY;
            this.constantZ = constantZ;

            this.factorX = factorX;
            this.factorY = factorY;
            this.factorZ = factorZ;

            this.offsetX = offsetX;
            this.offsetY = offsetY;
            this.offsetZ = offsetZ;

            this.colorIndex = colorIndex;
        }
    }

    private static final CubePlane[] CUBE_PLANES = {
        // Bottom
        new CubePlane(
            0, -1, 0, 1, 0, 1,
            0, 2, 1, 0
        ),
        // Top
        new CubePlane(
            0, 1, 0, 1, 0, -1,
            0, 2, 1, 1
        ),
        // Left
        new CubePlane(
            -1, 0, 0, 0, 1, 1,
            2, 1, 0, 2
        ),
        // Right
        new CubePlane(
            1, 0, 0, 0, 1, -1,
            2, 1, 0, 3
        ),
        // Front
        new CubePlane(
            0, 0, -1, -1, 1, 0,
            0, 1, 2, 4
        ),
        // Back
        new CubePlane(
            0, 0, 1, 1, 1, 0,
            0, 1, 2, 5
        )
    };

    private static void putVertexData(ByteBuffer dest) {
        Random random = new Random(87234);
        for (int cubeIndex = 0; cubeIndex < BigModel.NUM_CUBES; cubeIndex++) {
            float midX = 60f * random.nextFloat() - 30f;
            float midY = 60f * random.nextFloat() - 30f;
            float midZ = 60f * random.nextFloat() - 30f;

            // Each side has its own color
            float[] red   = new float[6];
            float[] green = new float[6];
            float[] blue  = new float[6];

            for (int side = 0; side < 6; side++) {
                red[side] = random.nextFloat();
                green[side] = random.nextFloat();
                blue[side] = random.nextFloat();
            }

            float size = 1.5f;

            for (CubePlane plane : CUBE_PLANES) {
                for (float[] offsets : QUAD_OFFSETS) {
                    float cornerX = midX + size * (plane.constantX + offsets[plane.offsetX] * plane.factorX);
                    float cornerY = midY + size * (plane.constantY + offsets[plane.offsetY] * plane.factorY);
                    float cornerZ = midZ + size * (plane.constantZ + offsets[plane.offsetZ] * plane.factorZ);
                    dest.putFloat(cornerX);
                    dest.putFloat(cornerY);
                    dest.putFloat(cornerZ);
                    dest.putFloat(red[plane.colorIndex]);
                    dest.putFloat(green[plane.colorIndex]);
                    dest.putFloat(blue[plane.colorIndex]);
                }
            }
        }

        // 1 more cube for the small model
        float size = 0.15f;
        for (CubePlane plane : CUBE_PLANES) {
            for (float[] offsets : QUAD_OFFSETS) {
                float cornerX = size * (plane.constantX + offsets[plane.offsetX] * plane.factorX);
                float cornerY = size * (plane.constantY + offsets[plane.offsetY] * plane.factorY);
                float cornerZ = size * (plane.constantZ + offsets[plane.offsetZ] * plane.factorZ);
                dest.putFloat(cornerX);
                dest.putFloat(cornerY);
                dest.putFloat(cornerZ);
                dest.putFloat(max(0f, abs(plane.constantX)));
                dest.putFloat(max(0f, abs(plane.constantY)));
                dest.putFloat(max(0f, abs(plane.constantZ)));
            }
        }
    }

    private static void putIndexData(ByteBuffer dest) {
        int vertexIndex = 0;

        for (int cubeCounter = 0; cubeCounter < BigModel.NUM_CUBES; cubeCounter++) {
            for (int quadCounter = 0; quadCounter < 6; quadCounter++) {

                int[] indexOffsets = {0, 1, 2, 2, 3, 0};
                for (int indexOffset : indexOffsets) {
                    if (INDEX_SIZE == 4) {
                        dest.putInt(vertexIndex + indexOffset);
                    } else if (INDEX_SIZE == 2) {
                        dest.putShort((short)(vertexIndex + indexOffset));
                    } else {
                        throw new Error("Unexpected index size: " + INDEX_SIZE);
                    }
                }

                vertexIndex += 4;
            }
        }
    }

    private void createBuffers() {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.callocPointer(1);
            LongBuffer    pl = stack.callocLong(1);

            int bigVertexSize = BigModel.NUM_VERTICES * VERTEX_SIZE;
            int bigIndexSize  = BigModel.NUM_INDICES * INDEX_SIZE;

            // The small model only needs 1 cube
            int smallVertexSize = 6 * 4 * VERTEX_SIZE;
            // We can just reuse the indices of the big model because the ones for the small model should be a substring of it

            int totalVertexSize = bigVertexSize + smallVertexSize;

            long sharedBuffer = createBuffer(totalVertexSize + bigIndexSize, VK_BUFFER_USAGE_TRANSFER_SRC_BIT);

            VkMemoryRequirements sharedMemRequirements = VkMemoryRequirements.calloc(stack);
            vkGetBufferMemoryRequirements(vkDevice, sharedBuffer, sharedMemRequirements);

            vkCheck(vkAllocateMemory(
                vkDevice,
                VkMemoryAllocateInfo.calloc(stack)
                    .sType$Default()
                    .allocationSize(sharedMemRequirements.size())
                    .memoryTypeIndex(chooseMemoryTypeIndex(sharedMemRequirements, VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT, stack)),
                null,
                pl
            ), "AllocateMemory");
            long sharedMemory = pl.get(0);

            vkCheck(vkMapMemory(vkDevice, sharedMemory, 0, VK_WHOLE_SIZE, 0, pp), "MapMemory");
            ByteBuffer sharedData = memByteBuffer(pp.get(0), totalVertexSize + bigIndexSize);

            sharedData.position(0);
            sharedData.limit(totalVertexSize);
            putVertexData(sharedData);

            sharedData.position(totalVertexSize);
            sharedData.limit(totalVertexSize + bigIndexSize);
            putIndexData(sharedData);

            sharedData.position(0);
            sharedData.limit(sharedData.capacity());

            vkCheck(vkFlushMappedMemoryRanges(
                vkDevice,
                VkMappedMemoryRange.calloc(stack)
                    .sType$Default()
                    .memory(sharedMemory)
                    .offset(0)
                    .size(VK_WHOLE_SIZE)
            ), "FlushMappedMemoryRanges");
            vkUnmapMemory(vkDevice, sharedMemory);
            vkCheck(vkBindBufferMemory(vkDevice, sharedBuffer, sharedMemory, 0), "BindBufferMemory");

            this.vkBigBuffer = createBuffer(
                totalVertexSize + bigIndexSize,
                VK_BUFFER_USAGE_TRANSFER_DST_BIT | VK_BUFFER_USAGE_VERTEX_BUFFER_BIT | VK_BUFFER_USAGE_INDEX_BUFFER_BIT
            );

            VkMemoryRequirements deviceMemRequirements = VkMemoryRequirements.calloc(stack);
            vkGetBufferMemoryRequirements(vkDevice, vkBigBuffer, deviceMemRequirements);

            vkCheck(vkAllocateMemory(
                vkDevice,
                VkMemoryAllocateInfo.calloc(stack)
                    .sType$Default()
                    .allocationSize(deviceMemRequirements.size())
                    .memoryTypeIndex(chooseMemoryTypeIndex(deviceMemRequirements, VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT, stack)),
                null,
                pl
            ), "AllocateMemory");
            this.vkDeviceMemory = pl.get(0);

            vkCheck(vkBindBufferMemory(vkDevice, vkBigBuffer, vkDeviceMemory, 0), "BindBufferMemory");

            vkCheck(vkAllocateCommandBuffers(
                vkDevice,
                VkCommandBufferAllocateInfo.calloc(stack)
                    .sType$Default()
                    .commandPool(vkCommandPoolCopying)
                    .level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
                    .commandBufferCount(1),
                pp
            ), "AllocateCommandBuffers");
            VkCommandBuffer copyCommandBuffer = new VkCommandBuffer(pp.get(0), vkDevice);

            vkCheck(vkBeginCommandBuffer(
                copyCommandBuffer,
                VkCommandBufferBeginInfo.calloc(stack)
                    .sType$Default()
                    .flags(VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT)
            ), "BeginCommandBuffer");

            VkBufferCopy.Buffer copyRegions = VkBufferCopy.calloc(1, stack);
            copyRegions.get(0)
                .srcOffset(0)
                .dstOffset(0)
                .size(totalVertexSize + bigIndexSize);

            vkCmdCopyBuffer(copyCommandBuffer, sharedBuffer, vkBigBuffer, copyRegions);
            vkEndCommandBuffer(copyCommandBuffer);

            vkCheck(vkCreateFence(
                vkDevice,
                VkFenceCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0),
                null,
                pl
            ), "CreateFence");
            long fence = pl.get(0);

            vkCheck(vkQueueSubmit(
                vkQueue,
                VkSubmitInfo.calloc(stack)
                    .sType$Default()
                    .waitSemaphoreCount(0) // I'm not sure why I need to set this explicitly
                    .pWaitSemaphores(null)
                    .pSignalSemaphores(null)
                    .pWaitDstStageMask(null)
                    .pCommandBuffers(stack.pointers(copyCommandBuffer)),
                fence
            ), "QueueSubmit");
            vkCheck(vkWaitForFences(vkDevice, pl, true, 1_000_000_000L), "WaitForFences");
            vkCheck(vkQueueWaitIdle(vkQueue), "QueueWaitIdle");

            vkFreeMemory(vkDevice, sharedMemory, null);
            vkDestroyBuffer(vkDevice, sharedBuffer, null);
            vkFreeCommandBuffers(vkDevice, vkCommandPoolCopying, copyCommandBuffer);
            vkDestroyFence(vkDevice, fence, null);
        }
    }

    private long createBuffer(long size, int usage) {
        try (MemoryStack stack = stackPush()) {
            LongBuffer pl = stack.callocLong(1);
            vkCreateBuffer(
                vkDevice,
                VkBufferCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .size(size)
                    .usage(usage)
                    .sharingMode(VK_SHARING_MODE_EXCLUSIVE),
                null,
                pl);
            return pl.get(0);
        }
    }

    private void createRenderSpace() {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.callocPointer(1);
            xrCheck(xrCreateReferenceSpace(
                xrVkSession,
                XrReferenceSpaceCreateInfo.calloc(stack)
                    .type$Default()
                    .referenceSpaceType(XR_REFERENCE_SPACE_TYPE_LOCAL)
                    .poseInReferenceSpace(identityPose(stack)),
                pp
            ), "CreateReferenceSpace");
            renderSpace = new XrSpace(pp.get(0), xrVkSession);
        }
    }

    private void createRenderPass() {
        try (MemoryStack stack = stackPush()) {
            VkAttachmentDescription.Buffer attachments = VkAttachmentDescription.calloc(2, stack);

            attachments.get(0)
                .flags(0)
                .format(swapchainColorFormat)
                // TODO SAMPLES
                .samples(VK_SAMPLE_COUNT_1_BIT)
                .loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
                .storeOp(VK_ATTACHMENT_STORE_OP_STORE)
                .stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)
                .stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
                .initialLayout(VK_IMAGE_LAYOUT_UNDEFINED)
                .finalLayout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            attachments.get(1)
                .flags(0)
                .format(swapchainDepthFormat)
                // TODO SAMPLES
                .samples(VK_SAMPLE_COUNT_1_BIT)
                .loadOp(VK_ATTACHMENT_LOAD_OP_CLEAR)
                .storeOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
                .stencilLoadOp(VK_ATTACHMENT_LOAD_OP_DONT_CARE)
                .stencilStoreOp(VK_ATTACHMENT_STORE_OP_DONT_CARE)
                .initialLayout(VK_IMAGE_LAYOUT_UNDEFINED)
                .finalLayout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

            VkAttachmentReference.Buffer colorAttachmentRefs = VkAttachmentReference.calloc(1, stack);
            colorAttachmentRefs.get(0)
                .attachment(0)
                .layout(VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            // Ensure that the render pass doesn't begin too early
            VkSubpassDependency.Buffer dependencies = VkSubpassDependency.calloc(1, stack);
            dependencies.get(0)
                .srcSubpass(VK_SUBPASS_EXTERNAL)
                .dstSubpass(0)
                .srcStageMask(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT)
                .srcAccessMask(0)
                .dstStageMask(VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT)
                .dstAccessMask(VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT);

            VkSubpassDescription.Buffer subpasses = VkSubpassDescription.calloc(1, stack);
            subpasses.get(0)
                .flags(0)
                .pipelineBindPoint(VK_PIPELINE_BIND_POINT_GRAPHICS)
                // For some reason, I have to specify the colorAttachmentCount explicitly
                .colorAttachmentCount(1)
                .pColorAttachments(colorAttachmentRefs)
                .pDepthStencilAttachment(VkAttachmentReference.calloc(stack)
                    .attachment(1)
                    .layout(VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL));

            LongBuffer pl = stack.callocLong(1);
            vkCheck(vkCreateRenderPass(
                vkDevice,
                VkRenderPassCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .pAttachments(attachments)
                    .pSubpasses(subpasses)
                    .pDependencies(dependencies),
                null,
                pl
            ), "CreateRenderPass");
            this.vkRenderPass = pl.get(0);
        }
    }

    private void createGraphicsPipelines() {
        try (MemoryStack stack = stackPush()) {
            VkPushConstantRange.Buffer pushConstants = VkPushConstantRange.calloc(1, stack);
            pushConstants.get(0)
                .stageFlags(VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT)
                .offset(0)
                // 1 matrix of 4x4 floats (4 bytes per float)
                // and 1 boolean that needs 4 bytes
                .size(4 * 4 * 4 + 4);

            LongBuffer pl = stack.callocLong(1);
            vkCheck(vkCreatePipelineLayout(
                vkDevice,
                VkPipelineLayoutCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    // I will add uniform variables or push constants later
                    .pSetLayouts(null)
                    .pPushConstantRanges(pushConstants),
                null,
                pl
            ), "CreatePipelineLayout");
            this.vkPipelineLayout = pl.get(0);
        }

        long vertexModule, fragmentModule;
        try (MemoryStack stack = stackPush()) {
            LongBuffer pl = stack.callocLong(1);

            ByteBuffer vertexBytes = getShaderResource("demo/openxr/vulkan/hello.vert.spv");
            vkCheck(vkCreateShaderModule(
                vkDevice,
                VkShaderModuleCreateInfo.calloc(stack)
                    .sType$Default()
                    .pCode(vertexBytes),
                null,
                pl
            ), "CreateShaderModule (vertex)");
            vertexModule = pl.get(0);

            ByteBuffer fragmentBytes = getShaderResource("demo/openxr/vulkan/hello.frag.spv");
            vkCheck(vkCreateShaderModule(
                vkDevice,
                VkShaderModuleCreateInfo.calloc(stack)
                    .sType$Default()
                    .pCode(fragmentBytes),
                null,
                pl
            ), "CreateShaderModule (fragment)");
            fragmentModule = pl.get(0);
        }

        this.vkGraphicsPipelines = new long[this.swapchains.length];

        for (int swapchainIndex = 0; swapchainIndex < this.swapchains.length; swapchainIndex++) {
            if (
                swapchainIndex == 0 || this.swapchains[swapchainIndex - 1].width != this.swapchains[swapchainIndex].width
                || this.swapchains[swapchainIndex - 1].height != this.swapchains[swapchainIndex].height
            ) {
                createGraphicsPipeline(swapchainIndex, vertexModule, fragmentModule);
            } else {
                // If the swapchain has the same size as the previous swapchain (expected case), share the graphics pipeline
                this.vkGraphicsPipelines[swapchainIndex] = this.vkGraphicsPipelines[swapchainIndex - 1];
            }
        }

        vkDestroyShaderModule(vkDevice, vertexModule, null);
        vkDestroyShaderModule(vkDevice, fragmentModule, null);
    }

    private void createGraphicsPipeline(int swapchainIndex, long vertexModule, long fragmentModule) {
        try (MemoryStack stack = stackPush()) {
            VkPipelineShaderStageCreateInfo.Buffer ciPipelineShaderStages = VkPipelineShaderStageCreateInfo.calloc(2, stack);
            ciPipelineShaderStages.get(0)
                .sType$Default()
                .flags(0)
                .stage(VK_SHADER_STAGE_VERTEX_BIT)
                .module(vertexModule)
                .pName(stack.UTF8("main"));

            ciPipelineShaderStages.get(1)
                .sType$Default()
                .flags(0)
                .stage(VK_SHADER_STAGE_FRAGMENT_BIT)
                .module(fragmentModule)
                .pName(stack.UTF8("main"));

            VkVertexInputBindingDescription.Buffer vertexBindingDescriptions = VkVertexInputBindingDescription.calloc(1, stack);
            vertexBindingDescriptions.get(0)
                .binding(0)
                .stride(VERTEX_SIZE)
                .inputRate(VK_VERTEX_INPUT_RATE_VERTEX);

            VkVertexInputAttributeDescription.Buffer vertexAttributeDescriptions = VkVertexInputAttributeDescription.calloc(2, stack);
            vertexAttributeDescriptions.get(0)
                .location(VERTEX_LOCATION_POSITION)
                .binding(0)
                .format(VK_FORMAT_R32G32B32_SFLOAT)
                .offset(VERTEX_OFFSET_POSITION);

            vertexAttributeDescriptions.get(1)
                .location(VERTEX_LOCATION_COLOR)
                .binding(0)
                .format(VK_FORMAT_R32G32B32_SFLOAT)
                .offset(VERTEX_OFFSET_COLOR);

            VkViewport.Buffer viewports = VkViewport.calloc(1, stack);
            viewports.get(0)
                .x(0f)
                .y(0f)
                .width(this.swapchains[swapchainIndex].width)
                .height(this.swapchains[swapchainIndex].height)
                .minDepth(0f)
                .maxDepth(1f);

            VkRect2D.Buffer scissors = VkRect2D.calloc(1, stack);
            scissors.get(0)
                .offset(VkOffset2D.calloc(stack)) // By using calloc, the offset will have a default value of 0, which is desired
                .extent(VkExtent2D.calloc(stack).set(
                    this.swapchains[swapchainIndex].width,
                    this.swapchains[swapchainIndex].height
                ));

            VkPipelineColorBlendAttachmentState.Buffer atsColorBlend = VkPipelineColorBlendAttachmentState.calloc(1, stack);
            // We only have 1 color attachment, so we only use 1 color blend attachment state
            atsColorBlend.get(0)
                .blendEnable(false) // We won't be doing any fancy blending
                .colorWriteMask(VK_COLOR_COMPONENT_R_BIT | VK_COLOR_COMPONENT_G_BIT | VK_COLOR_COMPONENT_B_BIT | VK_COLOR_COMPONENT_A_BIT);

            VkGraphicsPipelineCreateInfo.Buffer ciGraphicsPipelines = VkGraphicsPipelineCreateInfo.calloc(1, stack);

            // In this example, I will use only 1 graphics pipeline
            ciGraphicsPipelines.get(0)
                .sType$Default()
                .flags(0)
                .renderPass(this.vkRenderPass)
                .subpass(0)
                .layout(this.vkPipelineLayout)
                .basePipelineHandle(VK_NULL_HANDLE) // No pipeline derivatives in this example
                .basePipelineIndex(-1)
                .pStages(ciPipelineShaderStages)
                .pVertexInputState(VkPipelineVertexInputStateCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .pVertexBindingDescriptions(vertexBindingDescriptions)
                    .pVertexAttributeDescriptions(vertexAttributeDescriptions))
                .pInputAssemblyState(VkPipelineInputAssemblyStateCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST)
                    .primitiveRestartEnable(false))
                // This example won't use a tessellation shader
                .pTessellationState(null)
                .pViewportState(VkPipelineViewportStateCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .pViewports(viewports)
                    .pScissors(scissors))
                .pRasterizationState(VkPipelineRasterizationStateCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .depthClampEnable(false)
                    .rasterizerDiscardEnable(false)
                    .polygonMode(VK_POLYGON_MODE_FILL)
                    .lineWidth(1f)
                    .cullMode(VK_CULL_MODE_BACK_BIT)
                    .frontFace(VK_FRONT_FACE_COUNTER_CLOCKWISE)
                    .depthBiasEnable(false))
                .pMultisampleState(VkPipelineMultisampleStateCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    // TODO SAMPLES
                    .rasterizationSamples(VK_SAMPLE_COUNT_1_BIT)
                    .sampleShadingEnable(false)
                    // I won't ignore a part of the samples
                    .pSampleMask(null)
                    // I won't use transparency in this example
                    .alphaToCoverageEnable(false)
                    .alphaToOneEnable(false))
                .pDepthStencilState(VkPipelineDepthStencilStateCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .depthTestEnable(true)
                    .depthWriteEnable(true)
                    .depthCompareOp(VK_COMPARE_OP_LESS)
                    .depthBoundsTestEnable(false)
                    .stencilTestEnable(false))
                .pColorBlendState(VkPipelineColorBlendStateCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .logicOpEnable(false)
                    .pAttachments(atsColorBlend))
                .pDynamicState(null); // No dynamic state will be needed

            LongBuffer pl = stack.callocLong(1);
            vkCheck(vkCreateGraphicsPipelines(vkDevice, VK_NULL_HANDLE, ciGraphicsPipelines, null, pl), "CreateGraphicsPipelines");
            this.vkGraphicsPipelines[swapchainIndex] = pl.get(0);
        }
    }

    private void createCommandPools() {
        try (MemoryStack stack = stackPush()) {
            LongBuffer pl = stack.callocLong(1);

            // The copy command pool is for 1-time-use copy commands
            vkCheck(vkCreateCommandPool(
                vkDevice,
                VkCommandPoolCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(VK_COMMAND_POOL_CREATE_TRANSIENT_BIT)
                    .queueFamilyIndex(vkQueueFamilyIndex),
                null,
                pl
            ), "CreateCommandPool");
            this.vkCommandPoolCopying = pl.get(0);

            // The drawing command buffers will be allocated once and recorded many times
            vkCheck(vkCreateCommandPool(
                vkDevice,
                VkCommandPoolCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT)
                    .queueFamilyIndex(vkQueueFamilyIndex),
                null,
                pl
            ), "CreateCommandPool");
            this.vkCommandPoolDrawing = pl.get(0);
        }
    }

    private void chooseSwapchainFormats() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer pi = stack.callocInt(1);
            xrCheck(xrEnumerateSwapchainFormats(xrVkSession, pi, null), "EnumerateSwapchainFormats");
            int numFormats = pi.get(0);

            LongBuffer formats = stack.callocLong(numFormats);
            xrCheck(xrEnumerateSwapchainFormats(xrVkSession, pi, formats), "EnumerateSwapchainFormats");

            // SRGB formats are preferred due to the human perception of colors
            // Non-alpha formats are preferred because I don't intend to use it and it would spare memory
            int[] preferredColorFormats = {
                VK_FORMAT_R8G8B8_SRGB, VK_FORMAT_B8G8R8_SRGB,
                VK_FORMAT_R8G8B8A8_SRGB, VK_FORMAT_B8G8R8A8_SRGB,
                VK_FORMAT_R8G8B8_UNORM, VK_FORMAT_B8G8R8_UNORM,
                VK_FORMAT_R8G8B8A8_UNORM, VK_FORMAT_B8G8R8A8_UNORM
            };
            boolean[] hasPreferredColorFormats = new boolean[preferredColorFormats.length];

            // NVidia recommends avoiding 32 bits for the depth component because it slows down depth testing.
            // (For graphics cards, comparisons with 24 bit floating point numbers is easier than with 32.)
            // We don't use the stencil test, so we prefer a format without one.
            int[] preferredDepthFormats = {
                VK_FORMAT_X8_D24_UNORM_PACK32,
                VK_FORMAT_D24_UNORM_S8_UINT,
                VK_FORMAT_D32_SFLOAT,
                VK_FORMAT_D32_SFLOAT_S8_UINT
            };
            boolean[] hasPrefferedDepthFormats = new boolean[preferredDepthFormats.length];

            System.out.println("There are " + numFormats + " swapchain formats:");
            for (int index = 0; index < numFormats; index++) {
                long format = formats.get(index);

                String formatName = findConstantMeaning(VK10.class, name -> name.startsWith("VK_FORMAT_"), format);
                if (formatName == null) {
                    formatName = "unknown";
                }
                System.out.println(formatName + " (" + format + ")");

                for (int prefIndex = 0; prefIndex < preferredColorFormats.length; prefIndex++) {
                    if (format == preferredColorFormats[prefIndex]) {
                        hasPreferredColorFormats[prefIndex] = true;
                    }
                }

                for (int prefIndex = 0; prefIndex < preferredDepthFormats.length; prefIndex++) {
                    if (format == preferredDepthFormats[prefIndex]) {
                        hasPrefferedDepthFormats[prefIndex] = true;
                    }
                }
            }
            System.out.println("--------------");

            swapchainColorFormat = -1;
            swapchainDepthFormat = -1;

            // Pick the best formats available
            for (int prefIndex = 0; prefIndex < preferredColorFormats.length; prefIndex++) {
                if (hasPreferredColorFormats[prefIndex]) {
                    swapchainColorFormat = preferredColorFormats[prefIndex];
                    break;
                }
            }

            for (int prefIndex = 0; prefIndex < preferredDepthFormats.length; prefIndex++) {
                if (hasPrefferedDepthFormats[prefIndex]) {
                    swapchainDepthFormat = preferredDepthFormats[prefIndex];
                    break;
                }
            }

            if (swapchainColorFormat == -1) {
                // Damn... what kind of graphics card/xr runtime is this?
                // Well... if we can't find any format we like, we will just pick the first one
                swapchainColorFormat = (int)formats.get(0);
            }
            if (swapchainDepthFormat == -1) {
                // Let's hope it will never come to this...
                swapchainDepthFormat = (int)formats.get(0);
            }

            System.out.println("Chose swapchain formats " + swapchainColorFormat + " and " + swapchainDepthFormat);
        }
    }

    private void createSwapchains() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer  pi = stack.callocInt(1);
            LongBuffer pl = stack.callocLong(1);

            xrCheck(xrEnumerateViewConfigurations(xrInstance, xrSystemId, pi, null), "EnumerateViewConfigurations");
            int numViewConfigurations = pi.get(0);

            System.out.println("There are " + numViewConfigurations + " view configurations:");
            IntBuffer viewConfigurations = stack.callocInt(numViewConfigurations);
            xrCheck(xrEnumerateViewConfigurations(xrInstance, xrSystemId, pi, viewConfigurations), "EnumerateViewConfigurations");

            boolean hasPrimarySterio = false;
            for (int viewIndex = 0; viewIndex < numViewConfigurations; viewIndex++) {
                int viewConfiguration = viewConfigurations.get(viewIndex);
                System.out.println(findConstantMeaning(XR10.class, constantName -> constantName.startsWith("XR_VIEW_CONFIGURATION_TYPE_"), viewConfiguration) + " (" + viewConfiguration + ")");
                if (viewConfiguration == XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO) {
                    hasPrimarySterio = true;
                }
            }
            System.out.println("~~~~~~~~~~");

            // I prefer primary stereo. If that is not available, I will go for the first best alternative.
            viewConfiguration = hasPrimarySterio
                ? XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO
                : viewConfigurations.get(0);
            System.out.println("Chose " + viewConfiguration);

            xrCheck(xrEnumerateViewConfigurationViews(xrInstance, xrSystemId, viewConfiguration, pi, null), "EnumerateViewConfigurationViews");
            int numViews = pi.get(0);

            System.out.println("There are " + numViews + " views");
            XrViewConfigurationView.Buffer viewConfigurationViews = XRHelper.fill(
                XrViewConfigurationView.calloc(numViews, stack),
                XrViewConfigurationView.TYPE,
                XR_TYPE_VIEW_CONFIGURATION_VIEW
            );
            xrCheck(xrEnumerateViewConfigurationViews(xrInstance, xrSystemId, viewConfiguration, pi, viewConfigurationViews), "EnumerateViewConfigurationViews");

            PointerBuffer pCommandBuffers = stack.callocPointer(2);
            vkCheck(vkAllocateCommandBuffers(
                vkDevice,
                VkCommandBufferAllocateInfo.calloc(stack)
                    .sType$Default()
                    .commandPool(vkCommandPoolDrawing)
                    .level(VK_COMMAND_BUFFER_LEVEL_PRIMARY)
                    .commandBufferCount(numViews),
                pCommandBuffers
            ), "AllocateCommandBuffers");

            this.swapchains = new SwapchainWrapper[numViews];
            for (int swapchainIndex = 0; swapchainIndex < numViews; swapchainIndex++) {
                XrViewConfigurationView viewConfig = viewConfigurationViews.get(swapchainIndex);

                XrSwapchainCreateInfo ciSwapchain = XrSwapchainCreateInfo.calloc(stack)
                    .type$Default()
                    .createFlags(0)
                    .usageFlags(XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT | XR_SWAPCHAIN_USAGE_SAMPLED_BIT)
                    .format(swapchainColorFormat)
                    .width(viewConfig.recommendedImageRectWidth())
                    .height(viewConfig.recommendedImageRectHeight())
                    .sampleCount(viewConfig.recommendedSwapchainSampleCount())
                    .mipCount(1)
                    .arraySize(1)
                    .faceCount(1);

                System.out.println("Creating a swapchain of " +
                                   ciSwapchain.width() + " x " +
                                   ciSwapchain.height() + " with " +
                                   ciSwapchain.sampleCount() + " samples");

                PointerBuffer pp = stack.callocPointer(1);
                xrCheck(xrCreateSwapchain(xrVkSession, ciSwapchain, pp), "CreateSwapchain");
                XrSwapchain swapchain = new XrSwapchain(pp.get(0), xrVkSession);

                xrCheck(xrEnumerateSwapchainImages(swapchain, pi, null), "EnumerateSwapchainImages");
                int numImages = pi.get(0);

                System.out.println("Swapchain " + swapchainIndex + " has " + numImages + " images");
                XrSwapchainImageVulkanKHR.Buffer swapchainColorImages = XRHelper.fill(
                    XrSwapchainImageVulkanKHR.calloc(numImages, stack),
                    XrSwapchainImageVulkanKHR.TYPE,
                    XR_TYPE_SWAPCHAIN_IMAGE_VULKAN_KHR
                );

                xrCheck(xrEnumerateSwapchainImages(
                    swapchain, pi,
                    XrSwapchainImageBaseHeader.create(swapchainColorImages)
                ), "EnumerateSwapchainImages");

                vkCheck(vkCreateImage(
                    vkDevice,
                    VkImageCreateInfo.calloc(stack)
                        .sType$Default()
                        .flags(0)
                        .imageType(VK_IMAGE_TYPE_2D)
                        .format(swapchainDepthFormat)
                        .extent(it -> it
                            .width(ciSwapchain.width())
                            .height(ciSwapchain.height())
                            .depth(1))
                        .mipLevels(1)
                        .arrayLayers(1)
                        // TODO SAMPLES
                        .samples(VK_SAMPLE_COUNT_1_BIT)
                        .tiling(VK_IMAGE_TILING_OPTIMAL)
                        .usage(VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT)
                        .sharingMode(VK_SHARING_MODE_EXCLUSIVE)
                        .initialLayout(VK_IMAGE_LAYOUT_UNDEFINED),
                    null,
                    pl
                ), "CreateImage");
                long depthImage = pl.get(0);

                SwapchainImage[] swapchainImages = new SwapchainImage[numImages];

                VkComponentMapping componentMapping = VkComponentMapping.calloc(stack)
                    .r(VK_COMPONENT_SWIZZLE_IDENTITY)
                    .g(VK_COMPONENT_SWIZZLE_IDENTITY)
                    .b(VK_COMPONENT_SWIZZLE_IDENTITY)
                    .a(VK_COMPONENT_SWIZZLE_IDENTITY);

                VkImageViewCreateInfo ciDepthImageView = VkImageViewCreateInfo.calloc(stack)
                    .sType$Default()
                    .flags(0)
                    .image(depthImage)
                    .viewType(VK_IMAGE_VIEW_TYPE_2D)
                    .format(swapchainDepthFormat)
                    .components(componentMapping)
                    .subresourceRange(VkImageSubresourceRange.calloc(stack)
                        .aspectMask(VK_IMAGE_ASPECT_DEPTH_BIT)
                        .baseMipLevel(0)
                        .levelCount(1)
                        .baseArrayLayer(0)
                        .layerCount(1));

                VkMemoryRequirements pMemoryRequirements = VkMemoryRequirements.calloc(stack);
                vkGetImageMemoryRequirements(vkDevice, depthImage, pMemoryRequirements);

                int memoryTypeIndex = chooseMemoryTypeIndex(pMemoryRequirements, VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT, stack);

                vkCheck(vkAllocateMemory(
                    vkDevice,
                    VkMemoryAllocateInfo.calloc(stack)
                        .sType$Default()
                        .allocationSize(pMemoryRequirements.size())
                        .memoryTypeIndex(memoryTypeIndex),
                    null,
                    pl
                ), "AllocateMemory");
                long depthImageMemory = pl.get(0);

                vkCheck(vkBindImageMemory(vkDevice, depthImage, depthImageMemory, 0), "BindImageMemory");
                vkCheck(vkCreateImageView(vkDevice, ciDepthImageView, null, pl), "CreateImageView");
                long depthImageView = pl.get(0);

                for (int imageIndex = 0; imageIndex < numImages; imageIndex++) {
                    long colorImage = swapchainColorImages.get(imageIndex).image();

                    vkCheck(vkCreateImageView(
                        vkDevice,
                        VkImageViewCreateInfo.calloc(stack)
                            .sType$Default()
                            .flags(0)
                            .image(colorImage)
                            .viewType(VK_IMAGE_VIEW_TYPE_2D)
                            .format(swapchainColorFormat)
                            .components(componentMapping)
                            .subresourceRange(VkImageSubresourceRange.calloc(stack)
                                .aspectMask(VK_IMAGE_ASPECT_COLOR_BIT)
                                .baseMipLevel(0)
                                .levelCount(1)
                                .baseArrayLayer(0)
                                .layerCount(1)),
                        null,
                        pl
                    ), "CreateImageView");
                    long colorImageView = pl.get(0);

                    vkCheck(vkCreateFramebuffer(
                        vkDevice,
                        VkFramebufferCreateInfo.calloc(stack)
                            .sType$Default()
                            .flags(0)
                            .renderPass(vkRenderPass)
                            .pAttachments(stack.longs(colorImageView, depthImageView))
                            .width(ciSwapchain.width())
                            .height(ciSwapchain.height())
                            .layers(1),
                        null,
                        pl
                    ), "CreateFramebuffer");
                    long framebuffer = pl.get(0);

                    swapchainImages[imageIndex] = new SwapchainImage(colorImage, colorImageView, framebuffer);
                }

                vkCheck(vkCreateFence(
                    vkDevice,
                    VkFenceCreateInfo.calloc(stack)
                        .sType$Default()
                        .flags(0),
                    null,
                    pl
                ), "CreateFence");

                this.swapchains[swapchainIndex] = new SwapchainWrapper(
                    new XrSwapchain(pp.get(0), xrVkSession),
                    ciSwapchain.width(), ciSwapchain.height(), ciSwapchain.sampleCount(),
                    depthImage, depthImageView, depthImageMemory, swapchainImages,
                    pl.get(0), new VkCommandBuffer(pCommandBuffers.get(swapchainIndex), vkDevice)
                );
            }
        }
    }

    private XrCompositionLayerProjectionView.Buffer createProjectionViews(MemoryStack stack, long displayTime) {
        IntBuffer pi = stack.ints(swapchains.length);

        XrViewState viewState = XrViewState.calloc(stack)
            .type$Default();

        XrView.Buffer views = XRHelper.fill(
            XrView.calloc(swapchains.length, stack),
            XrView.TYPE,
            XR_TYPE_VIEW
        );

        xrCheck(xrLocateViews(
            xrVkSession,
            XrViewLocateInfo.calloc(stack)
                .type$Default()
                .viewConfigurationType(viewConfiguration)
                .displayTime(displayTime)
                .space(renderSpace),
            viewState,
            pi,
            views
        ), "LocateViews");

        long viewFlags = viewState.viewStateFlags();
        if ((viewFlags & XR_VIEW_STATE_POSITION_VALID_BIT) == 0) {
            System.out.println("View position invalid; abort rendering this frame");
            return null;
        }
        if ((viewFlags & XR_VIEW_STATE_ORIENTATION_VALID_BIT) == 0) {
            System.out.println("View orientation invalid; abort rendering this frame");
            return null;
        }

        XrCompositionLayerProjectionView.Buffer projectionViews = XrCompositionLayerProjectionView.calloc(swapchains.length, stack);
        for (int viewIndex = 0; viewIndex < swapchains.length; viewIndex++) {
            SwapchainWrapper swapchain = swapchains[viewIndex];

            XrView currentView = views.get(viewIndex);

            projectionViews.get(viewIndex)
                .type$Default()
                .pose(currentView.pose())
                .fov(currentView.fov())
                .subImage(XrSwapchainSubImage.calloc(stack)
                    .swapchain(swapchain.swapchain)
                    .imageRect(XrRect2Di.calloc(stack)
                        .offset(it -> it
                            .x(0)
                            .y(0))
                        .extent(it -> it
                            .width(swapchain.width)
                            .height(swapchain.height)))
                    .imageArrayIndex(0));
        }

        return projectionViews;
    }

    private void updateSessionState(MemoryStack stack) {
        // Use malloc instead of calloc because this will be called frequently
        XrEventDataBuffer pollEventData = XrEventDataBuffer.malloc(stack);

        while (true) {
            pollEventData
                .type$Default()
                .next(NULL);

            int pollResult = xrPollEvent(xrInstance, pollEventData);
            xrCheck(pollResult, "PollEvent");
            if (pollResult != XR_EVENT_UNAVAILABLE) {
                if (pollEventData.type() == XR_TYPE_EVENT_DATA_SESSION_STATE_CHANGED) {
                    XrEventDataSessionStateChanged sessionEvent = XrEventDataSessionStateChanged.create(pollEventData.address());
                    xrSessionState = sessionEvent.state();
                    System.out.println("Changed session state to " + xrSessionState);
                } else {
                    System.out.println("Received another event");
                }
            } else {
                break;
            }
        }
    }

    private static class HandStates {
        final Vector3f leftPosition, rightPosition;
        final Quaternionf leftRotation, rightRotation;

        HandStates(Vector3f leftPosition, Vector3f rightPosition, Quaternionf leftRotation, Quaternionf rightRotation) {
            this.leftPosition = leftPosition;
            this.rightPosition = rightPosition;
            this.leftRotation = leftRotation;
            this.rightRotation = rightRotation;
        }
    }

    private HandStates getHandStates(MemoryStack stack, long time) {
        XrActiveActionSet.Buffer activeActionSets = XrActiveActionSet.calloc(1, stack);
        activeActionSets.get(0)
            .actionSet(xrActionSet)
            .subactionPath(XR_NULL_PATH);

        xrCheck(xrSyncActions(
            xrVkSession,
            XrActionsSyncInfo.calloc(stack)
                .type$Default()
                .activeActionSets(activeActionSets)
        ), "SyncActions");

        XrSpaceLocation leftHandLocation = XrSpaceLocation.calloc(stack)
            .type$Default();

        XrSpaceLocation rightHandLocation = XrSpaceLocation.calloc(stack)
            .type$Default();

        xrCheck(xrLocateSpace(xrLeftHandSpace, renderSpace, time, leftHandLocation), "LocateSpace");
        xrCheck(xrLocateSpace(xrRightHandSpace, renderSpace, time, rightHandLocation), "LocateSpace");

        Vector3f leftHandPosition  = null;
        Vector3f rightHandPosition = null;

        if ((leftHandLocation.locationFlags() & XR_SPACE_LOCATION_POSITION_VALID_BIT) != 0) {
            XrVector3f pos = leftHandLocation.pose().position$();
            leftHandPosition = new Vector3f(pos.x(), pos.y(), pos.z());
        }
        if ((rightHandLocation.locationFlags() & XR_SPACE_LOCATION_POSITION_VALID_BIT) != 0) {
            XrVector3f pos = rightHandLocation.pose().position$();
            rightHandPosition = new Vector3f(pos.x(), pos.y(), pos.z());
        }

        Quaternionf leftHandRotation  = null;
        Quaternionf rightHandRotation = null;

        if ((leftHandLocation.locationFlags() & XR_SPACE_LOCATION_ORIENTATION_VALID_BIT) != 0) {
            XrQuaternionf rot = leftHandLocation.pose().orientation();
            leftHandRotation = new Quaternionf(rot.x(), rot.y(), rot.z(), rot.w());
        }

        if ((rightHandLocation.locationFlags() & XR_SPACE_LOCATION_ORIENTATION_VALID_BIT) != 0) {
            XrQuaternionf rot = rightHandLocation.pose().orientation();
            rightHandRotation = new Quaternionf(rot.x(), rot.y(), rot.z(), rot.w());
        }

        return new HandStates(leftHandPosition, rightHandPosition, leftHandRotation, rightHandRotation);
    }

    private void loopXrSession() {
        // This is a safety check for debugging. Set to 0 to disable this.
        long endTime = System.currentTimeMillis() + 10_000;

        boolean startedSession = false;

        while (true) {
            try (MemoryStack stack = stackPush()) {
                updateSessionState(stack);

                if (xrSessionState == XR_SESSION_STATE_IDLE) {
                    try {
                        System.out.println("Session is idle");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException("Shouldn't happen", e);
                    }
                    continue;
                }

                boolean timeoutStop = endTime != 0 && System.currentTimeMillis() > endTime;
                if (timeoutStop && startedSession) {
                    xrCheck(xrRequestExitSession(xrVkSession), "RequestExitSession");
                    startedSession = false;
                }

                if (xrSessionState == XR_SESSION_STATE_STOPPING) {
                    xrEndSession(xrVkSession);
                }
                if (
                    xrSessionState == XR_SESSION_STATE_LOSS_PENDING || xrSessionState == XR_SESSION_STATE_EXITING ||
                    xrSessionState == XR_SESSION_STATE_STOPPING
                ) {
                    break;
                }

                if (timeoutStop) {
                    continue;
                }

                if (xrSessionState == XR_SESSION_STATE_READY && !startedSession) {
                    System.out.println("Begin session");
                    xrCheck(xrBeginSession(
                        xrVkSession,
                        XrSessionBeginInfo.calloc(stack)
                            .type$Default()
                            .primaryViewConfigurationType(viewConfiguration)
                    ), "BeginSession");
                    startedSession = true;
                }

                updateSessionState(stack);

                if (
                    xrSessionState == XR_SESSION_STATE_SYNCHRONIZED || xrSessionState == XR_SESSION_STATE_VISIBLE ||
                    xrSessionState == XR_SESSION_STATE_FOCUSED || xrSessionState == XR_SESSION_STATE_READY
                ) {
                    XrFrameState frameState = XrFrameState.calloc(stack)
                        .type$Default();

                    xrCheck(xrWaitFrame(xrVkSession, null, frameState), "WaitFrame");
                    xrCheck(xrBeginFrame(xrVkSession, null), "BeginFrame");

                    PointerBuffer layers = null;
                    if (frameState.shouldRender()) {
                        XrCompositionLayerProjection layer = XrCompositionLayerProjection.calloc(stack)
                            .type$Default()
                            .layerFlags(0) // If we were to use alpha, we should set the alpha layer flag
                            .space(renderSpace);

                        XrCompositionLayerProjectionView.Buffer projectionViews = createProjectionViews(stack, frameState.predictedDisplayTime());
                        if (projectionViews != null) {
                            layer.views(projectionViews);
                            layers = stack.pointers(layer);
                        }

                        HandStates handStates = getHandStates(stack, frameState.predictedDisplayTime());

                        Matrix4f leftHandMatrix = null;
                        if (handStates.leftPosition != null) {
                            leftHandMatrix = new Matrix4f().translate(handStates.leftPosition);

                            if (handStates.leftRotation != null) {
                                leftHandMatrix.rotate(handStates.leftRotation);
                            }
                        }

                        Matrix4f rightHandMatrix = null;
                        if (handStates.rightPosition != null) {
                            rightHandMatrix = new Matrix4f().translate(handStates.rightPosition);

                            if (handStates.rightRotation != null) {
                                rightHandMatrix.rotate(handStates.rightRotation);
                            }
                        }

                        for (int swapchainIndex = 0; swapchainIndex < swapchains.length; swapchainIndex++) {
                            SwapchainWrapper swapchain = this.swapchains[swapchainIndex];

                            IntBuffer pi = stack.callocInt(1);
                            xrCheck(xrAcquireSwapchainImage(swapchain.swapchain, null, pi), "AcquireSwapchainImage");
                            int imageIndex = pi.get(0);

                            Matrix4f cameraMatrix;
                            if (projectionViews != null) {
                                // If the position tracker is working, we should use it to create the camera matrix
                                XrCompositionLayerProjectionView projectionView = projectionViews.get(swapchainIndex);

                                Matrix4f projectionMatrix = new Matrix4f().scale(1f, -1f, 1f);
                                XRHelper.applyProjectionToMatrix(projectionMatrix, projectionView.fov(), 0.01f, 100f, true);

                                Matrix4f viewMatrix = new Matrix4f();

                                XrVector3f    position    = projectionView.pose().position$();
                                XrQuaternionf orientation = projectionView.pose().orientation();

                                viewMatrix.translationRotateScaleInvert(
                                    position.x(), position.y(), position.z(),
                                    orientation.x(), orientation.y(), orientation.z(), orientation.w(),
                                    1, 1, 1
                                );

                                cameraMatrix = projectionMatrix.mul(viewMatrix);
                            } else {
                                // When the position tracking is having issues, we will fall back to the previous one
                                cameraMatrix = lastCameraMatrix;
                            }

                            lastCameraMatrix = cameraMatrix;

                            xrCheck(xrWaitSwapchainImage(
                                swapchain.swapchain,
                                XrSwapchainImageWaitInfo.calloc(stack)
                                    .type$Default()
                                    .timeout(1_000_000_000) // Time out after 1 second. If we would have to wait so long, something is seriously wrong
                            ), "WaitSwapchainImage");

                            vkCheck(vkBeginCommandBuffer(
                                swapchain.commandBuffer,
                                VkCommandBufferBeginInfo.calloc(stack)
                                    .sType$Default()
                                    .flags(VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT)
                            ), "BeginCommandBuffer");

                            VkClearValue.Buffer clearValues = VkClearValue.calloc(2, stack);
                            clearValues.get(0)
                                .color(VkClearColorValue.calloc(stack)
                                    .float32(0, 0.1f)
                                    .float32(1, 0.2f)
                                    .float32(2, 0.92f)
                                    .float32(3, 1f));
                            clearValues.get(1)
                                .depthStencil(VkClearDepthStencilValue.calloc(stack)
                                    .depth(1f));

                            VkRenderPassBeginInfo biRenderPass = VkRenderPassBeginInfo.calloc(stack)
                                .sType$Default()
                                .pNext(VK_NULL_HANDLE)
                                .renderPass(vkRenderPass)
                                .framebuffer(swapchain.images[imageIndex].framebuffer)
                                .renderArea(it -> it
                                    .offset(offset -> offset
                                        .x(0)
                                        .y(0))
                                    .extent(extent -> extent
                                        .width(swapchain.width)
                                        .height(swapchain.height)))
                                .pClearValues(clearValues);

                            int pushIndexInvertColor = 4 * 4 * 4;

                            ByteBuffer pushConstants = stack.calloc(pushIndexInvertColor + 4);
                            cameraMatrix.get(pushConstants);

                            int stageFlags = VK_SHADER_STAGE_VERTEX_BIT | VK_SHADER_STAGE_FRAGMENT_BIT;
                            vkCmdBeginRenderPass(swapchain.commandBuffer, biRenderPass, VK_SUBPASS_CONTENTS_INLINE);
                            vkCmdBindPipeline(swapchain.commandBuffer, VK_PIPELINE_BIND_POINT_GRAPHICS, vkGraphicsPipelines[swapchainIndex]);
                            vkCmdPushConstants(swapchain.commandBuffer, vkPipelineLayout, stageFlags, 0, pushConstants);
                            vkCmdBindVertexBuffers(swapchain.commandBuffer, 0, stack.longs(vkBigBuffer), stack.longs(0));
                            vkCmdBindIndexBuffer(swapchain.commandBuffer, vkBigBuffer, VERTEX_SIZE * (BigModel.NUM_VERTICES + 4 * 6), INDEX_TYPE);

                            // Draw big model
                            vkCmdDrawIndexed(swapchain.commandBuffer, BigModel.NUM_INDICES, 1, 0, 0, 0);

                            // Draw (small) hand models if hand locations are known
                            if (leftHandMatrix != null) {
                                XrActionStateBoolean actionState = XrActionStateBoolean.calloc(stack)
                                    .type$Default();

                                xrCheck(xrGetActionStateBoolean(
                                    xrVkSession,
                                    XrActionStateGetInfo.calloc(stack)
                                        .type$Default()
                                        .action(xrHandClickAction)
                                        .subactionPath(xrPathLeftHand),
                                    actionState
                                ), "GetActionStateBoolean");

                                pushConstants.putInt(pushIndexInvertColor, actionState.currentState() ? 1 : 0);
                                cameraMatrix.mul(leftHandMatrix, new Matrix4f()).get(pushConstants);
                                vkCmdPushConstants(swapchain.commandBuffer, vkPipelineLayout, stageFlags, 0, pushConstants);
                                vkCmdDrawIndexed(swapchain.commandBuffer, 6 * 6, 1, 0, BigModel.NUM_VERTICES, 0);
                            }

                            if (rightHandMatrix != null) {
                                XrActionStateBoolean actionState = XrActionStateBoolean.calloc(stack)
                                    .type$Default();

                                xrCheck(xrGetActionStateBoolean(
                                    xrVkSession,
                                    XrActionStateGetInfo.calloc(stack)
                                        .type$Default()
                                        .action(xrHandClickAction)
                                        .subactionPath(xrPathRightHand),
                                    actionState
                                ), "GetActionStateBoolean");

                                pushConstants.putInt(pushIndexInvertColor, actionState.currentState() ? 1 : 0);
                                cameraMatrix.mul(rightHandMatrix, new Matrix4f()).get(pushConstants);
                                vkCmdPushConstants(swapchain.commandBuffer, vkPipelineLayout, VK_SHADER_STAGE_VERTEX_BIT, 0, pushConstants);
                                vkCmdDrawIndexed(swapchain.commandBuffer, 6 * 6, 1, 0, BigModel.NUM_VERTICES, 0);
                            }

                            vkCmdEndRenderPass(swapchain.commandBuffer);

                            vkCheck(vkEndCommandBuffer(swapchain.commandBuffer), "EndCommandBuffer");

                            vkCheck(vkQueueSubmit(
                                vkQueue,
                                VkSubmitInfo.calloc(stack)
                                    .sType$Default()
                                    .pCommandBuffers(stack.pointers(swapchain.commandBuffer)),
                                swapchain.fence
                            ), "QueueSubmit");
                        }

                        // Submit command buffers for both eyes before waiting for them to complete
                        for (SwapchainWrapper swapchain : swapchains) {
                            vkCheck(vkWaitForFences(vkDevice, swapchain.fence, true, 1_000_000_000), "WaitForFences");
                            vkCheck(vkResetFences(vkDevice, swapchain.fence), "ResetFences");
                            xrCheck(xrReleaseSwapchainImage(swapchain.swapchain, null), "ReleaseSwapchainImage");
                        }
                    } else {
                        System.out.println("Skip frame");
                    }

                    xrCheck(xrEndFrame(
                        xrVkSession,
                        XrFrameEndInfo.calloc(stack)
                            .type$Default()
                            .displayTime(frameState.predictedDisplayTime())
                            .environmentBlendMode(XR_ENVIRONMENT_BLEND_MODE_OPAQUE)
                            .layers(layers)
                    ), "EndFrame");
                }
            }
        }
    }

    private void destroySwapchains() {
        if (swapchains != null) {
            for (SwapchainWrapper swapchain : swapchains) {
                if (swapchain != null) {
                    // In case we crashed during rendering, let's at least make sure that it is finished
                    vkWaitForFences(vkDevice, swapchain.fence, true, 100_000_000);
                    xrDestroySwapchain(swapchain.swapchain);

                    for (SwapchainImage swapchainImage : swapchain.images) {
                        vkDestroyFramebuffer(vkDevice, swapchainImage.framebuffer, null);
                        vkDestroyImageView(vkDevice, swapchainImage.colorImageView, null);
                        // No need to destroy the colorImage because that happens implicitly upon destroying swapchain
                    }

                    vkDestroyImageView(vkDevice, swapchain.depthImageView, null);
                    vkDestroyImage(vkDevice, swapchain.depthImage, null);
                    vkFreeMemory(vkDevice, swapchain.depthImageMemory, null);
                    vkDestroyFence(vkDevice, swapchain.fence, null);
                    vkFreeCommandBuffers(vkDevice, vkCommandPoolDrawing, swapchain.commandBuffer);
                }
            }
        }
    }

    private void destroyXrVkSession() {
        if (xrHandPoseAction != null) {
            xrDestroyAction(xrHandPoseAction);
        }
        if (xrHandClickAction != null) {
            xrDestroyAction(xrHandClickAction);
        }
        if (xrActionSet != null) {
            xrDestroyActionSet(xrActionSet);
        }
        if (xrLeftHandSpace != null) {
            xrDestroySpace(xrLeftHandSpace);
        }
        if (xrRightHandSpace != null) {
            xrDestroySpace(xrRightHandSpace);
        }
        if (renderSpace != null) {
            xrDestroySpace(renderSpace);
        }
        if (xrVkSession != null) {
            xrDestroySession(xrVkSession);
        }
    }

    private void destroyXrInstance() {
        if (xrDebugMessenger != null) {
            xrDestroyDebugUtilsMessengerEXT(xrDebugMessenger);
        }
        if (xrInstance != null) {
            xrDestroyInstance(xrInstance);
        }
    }

    private static void xrCheck(int result, String functionName) {
        if (result < XR_SUCCESS) {
            String constantName = findConstantMeaning(XR10.class, candidateConstant -> candidateConstant.startsWith("XR_ERROR_"), result);
            throw new RuntimeException("OpenXR function " + functionName + " returned " + result + " (" + constantName + ")");
        }
    }

    private static void vkCheck(int result, String functionName) {
        if (result < VK_SUCCESS) {
            String constantName = findConstantMeaning(VK10.class, candidateConstant -> candidateConstant.startsWith("VK_ERROR_"), result);
            throw new RuntimeException("Vulkan function " + functionName + " returned " + result + " (" + constantName + ")");
        }
    }

    private static String findConstantMeaning(Class<?> containingClass, Predicate<String> constantFilter, Object constant) {
        Field[] fields = containingClass.getFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers()) && constantFilter.test(field.getName())) {
                try {
                    Object value = field.get(null);
                    if (value instanceof Number && constant instanceof Number) {
                        if (((Number)value).longValue() == ((Number)constant).longValue()) {
                            return field.getName();
                        }
                    }
                    if (constant.equals(value)) {
                        return field.getName();
                    }
                } catch (IllegalAccessException ex) {
                    // Ignore private fields
                }
            }
        }

        return null;
    }

}
