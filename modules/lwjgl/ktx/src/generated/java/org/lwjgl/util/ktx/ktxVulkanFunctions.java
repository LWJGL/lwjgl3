/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Struct for applications to pass Vulkan function pointers to the {@link KTXVulkan#ktxTexture_VkUpload Texture_VkUpload} functions via a {@code ktxVulkanDeviceInfo} struct.
 * 
 * <p>{@code vkGetInstanceProcAddr} and {@code vkGetDeviceProcAddr} should be set, others are optional.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ktxVulkanFunctions {
 *     PFN_vkGetInstanceProcAddr {@link #vkGetInstanceProcAddr};
 *     PFN_vkGetDeviceProcAddr vkGetDeviceProcAddr;
 *     PFN_vkAllocateCommandBuffers vkAllocateCommandBuffers;
 *     PFN_vkAllocateMemory vkAllocateMemory;
 *     PFN_vkBeginCommandBuffer vkBeginCommandBuffer;
 *     PFN_vkBindBufferMemory vkBindBufferMemory;
 *     PFN_vkBindImageMemory vkBindImageMemory;
 *     PFN_vkCmdBlitImage vkCmdBlitImage;
 *     PFN_vkCmdCopyBufferToImage vkCmdCopyBufferToImage;
 *     PFN_vkCmdPipelineBarrier vkCmdPipelineBarrier;
 *     PFN_vkCreateImage vkCreateImage;
 *     PFN_vkDestroyImage vkDestroyImage;
 *     PFN_vkCreateBuffer vkCreateBuffer;
 *     PFN_vkDestroyBuffer vkDestroyBuffer;
 *     PFN_vkCreateFence vkCreateFence;
 *     PFN_vkDestroyFence vkDestroyFence;
 *     PFN_vkEndCommandBuffer vkEndCommandBuffer;
 *     PFN_vkFreeCommandBuffers vkFreeCommandBuffers;
 *     PFN_vkFreeMemory vkFreeMemory;
 *     PFN_vkGetBufferMemoryRequirements vkGetBufferMemoryRequirements;
 *     PFN_vkGetImageMemoryRequirements vkGetImageMemoryRequirements;
 *     PFN_vkGetImageSubresourceLayout vkGetImageSubresourceLayout;
 *     PFN_vkGetPhysicalDeviceImageFormatProperties vkGetPhysicalDeviceImageFormatProperties;
 *     PFN_vkGetPhysicalDeviceFormatProperties vkGetPhysicalDeviceFormatProperties;
 *     PFN_vkGetPhysicalDeviceMemoryProperties vkGetPhysicalDeviceMemoryProperties;
 *     PFN_vkMapMemory vkMapMemory;
 *     PFN_vkQueueSubmit vkQueueSubmit;
 *     PFN_vkQueueWaitIdle vkQueueWaitIdle;
 *     PFN_vkUnmapMemory vkUnmapMemory;
 *     PFN_vkWaitForFences vkWaitForFences;
 * }</code></pre>
 */
public class ktxVulkanFunctions extends Struct<ktxVulkanFunctions> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VKGETINSTANCEPROCADDR,
        VKGETDEVICEPROCADDR,
        VKALLOCATECOMMANDBUFFERS,
        VKALLOCATEMEMORY,
        VKBEGINCOMMANDBUFFER,
        VKBINDBUFFERMEMORY,
        VKBINDIMAGEMEMORY,
        VKCMDBLITIMAGE,
        VKCMDCOPYBUFFERTOIMAGE,
        VKCMDPIPELINEBARRIER,
        VKCREATEIMAGE,
        VKDESTROYIMAGE,
        VKCREATEBUFFER,
        VKDESTROYBUFFER,
        VKCREATEFENCE,
        VKDESTROYFENCE,
        VKENDCOMMANDBUFFER,
        VKFREECOMMANDBUFFERS,
        VKFREEMEMORY,
        VKGETBUFFERMEMORYREQUIREMENTS,
        VKGETIMAGEMEMORYREQUIREMENTS,
        VKGETIMAGESUBRESOURCELAYOUT,
        VKGETPHYSICALDEVICEIMAGEFORMATPROPERTIES,
        VKGETPHYSICALDEVICEFORMATPROPERTIES,
        VKGETPHYSICALDEVICEMEMORYPROPERTIES,
        VKMAPMEMORY,
        VKQUEUESUBMIT,
        VKQUEUEWAITIDLE,
        VKUNMAPMEMORY,
        VKWAITFORFENCES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VKGETINSTANCEPROCADDR = layout.offsetof(0);
        VKGETDEVICEPROCADDR = layout.offsetof(1);
        VKALLOCATECOMMANDBUFFERS = layout.offsetof(2);
        VKALLOCATEMEMORY = layout.offsetof(3);
        VKBEGINCOMMANDBUFFER = layout.offsetof(4);
        VKBINDBUFFERMEMORY = layout.offsetof(5);
        VKBINDIMAGEMEMORY = layout.offsetof(6);
        VKCMDBLITIMAGE = layout.offsetof(7);
        VKCMDCOPYBUFFERTOIMAGE = layout.offsetof(8);
        VKCMDPIPELINEBARRIER = layout.offsetof(9);
        VKCREATEIMAGE = layout.offsetof(10);
        VKDESTROYIMAGE = layout.offsetof(11);
        VKCREATEBUFFER = layout.offsetof(12);
        VKDESTROYBUFFER = layout.offsetof(13);
        VKCREATEFENCE = layout.offsetof(14);
        VKDESTROYFENCE = layout.offsetof(15);
        VKENDCOMMANDBUFFER = layout.offsetof(16);
        VKFREECOMMANDBUFFERS = layout.offsetof(17);
        VKFREEMEMORY = layout.offsetof(18);
        VKGETBUFFERMEMORYREQUIREMENTS = layout.offsetof(19);
        VKGETIMAGEMEMORYREQUIREMENTS = layout.offsetof(20);
        VKGETIMAGESUBRESOURCELAYOUT = layout.offsetof(21);
        VKGETPHYSICALDEVICEIMAGEFORMATPROPERTIES = layout.offsetof(22);
        VKGETPHYSICALDEVICEFORMATPROPERTIES = layout.offsetof(23);
        VKGETPHYSICALDEVICEMEMORYPROPERTIES = layout.offsetof(24);
        VKMAPMEMORY = layout.offsetof(25);
        VKQUEUESUBMIT = layout.offsetof(26);
        VKQUEUEWAITIDLE = layout.offsetof(27);
        VKUNMAPMEMORY = layout.offsetof(28);
        VKWAITFORFENCES = layout.offsetof(29);
    }

    protected ktxVulkanFunctions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected ktxVulkanFunctions create(long address, @Nullable ByteBuffer container) {
        return new ktxVulkanFunctions(address, container);
    }

    /**
     * Creates a {@code ktxVulkanFunctions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ktxVulkanFunctions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** these are functions pointers we need to perform our vulkan duties */
    @NativeType("PFN_vkGetInstanceProcAddr")
    public long vkGetInstanceProcAddr() { return nvkGetInstanceProcAddr(address()); }
    /** @return the value of the {@code vkGetDeviceProcAddr} field. */
    @NativeType("PFN_vkGetDeviceProcAddr")
    public long vkGetDeviceProcAddr() { return nvkGetDeviceProcAddr(address()); }
    /** @return the value of the {@code vkAllocateCommandBuffers} field. */
    @NativeType("PFN_vkAllocateCommandBuffers")
    public long vkAllocateCommandBuffers() { return nvkAllocateCommandBuffers(address()); }
    /** @return the value of the {@code vkAllocateMemory} field. */
    @NativeType("PFN_vkAllocateMemory")
    public long vkAllocateMemory() { return nvkAllocateMemory(address()); }
    /** @return the value of the {@code vkBeginCommandBuffer} field. */
    @NativeType("PFN_vkBeginCommandBuffer")
    public long vkBeginCommandBuffer() { return nvkBeginCommandBuffer(address()); }
    /** @return the value of the {@code vkBindBufferMemory} field. */
    @NativeType("PFN_vkBindBufferMemory")
    public long vkBindBufferMemory() { return nvkBindBufferMemory(address()); }
    /** @return the value of the {@code vkBindImageMemory} field. */
    @NativeType("PFN_vkBindImageMemory")
    public long vkBindImageMemory() { return nvkBindImageMemory(address()); }
    /** @return the value of the {@code vkCmdBlitImage} field. */
    @NativeType("PFN_vkCmdBlitImage")
    public long vkCmdBlitImage() { return nvkCmdBlitImage(address()); }
    /** @return the value of the {@code vkCmdCopyBufferToImage} field. */
    @NativeType("PFN_vkCmdCopyBufferToImage")
    public long vkCmdCopyBufferToImage() { return nvkCmdCopyBufferToImage(address()); }
    /** @return the value of the {@code vkCmdPipelineBarrier} field. */
    @NativeType("PFN_vkCmdPipelineBarrier")
    public long vkCmdPipelineBarrier() { return nvkCmdPipelineBarrier(address()); }
    /** @return the value of the {@code vkCreateImage} field. */
    @NativeType("PFN_vkCreateImage")
    public long vkCreateImage() { return nvkCreateImage(address()); }
    /** @return the value of the {@code vkDestroyImage} field. */
    @NativeType("PFN_vkDestroyImage")
    public long vkDestroyImage() { return nvkDestroyImage(address()); }
    /** @return the value of the {@code vkCreateBuffer} field. */
    @NativeType("PFN_vkCreateBuffer")
    public long vkCreateBuffer() { return nvkCreateBuffer(address()); }
    /** @return the value of the {@code vkDestroyBuffer} field. */
    @NativeType("PFN_vkDestroyBuffer")
    public long vkDestroyBuffer() { return nvkDestroyBuffer(address()); }
    /** @return the value of the {@code vkCreateFence} field. */
    @NativeType("PFN_vkCreateFence")
    public long vkCreateFence() { return nvkCreateFence(address()); }
    /** @return the value of the {@code vkDestroyFence} field. */
    @NativeType("PFN_vkDestroyFence")
    public long vkDestroyFence() { return nvkDestroyFence(address()); }
    /** @return the value of the {@code vkEndCommandBuffer} field. */
    @NativeType("PFN_vkEndCommandBuffer")
    public long vkEndCommandBuffer() { return nvkEndCommandBuffer(address()); }
    /** @return the value of the {@code vkFreeCommandBuffers} field. */
    @NativeType("PFN_vkFreeCommandBuffers")
    public long vkFreeCommandBuffers() { return nvkFreeCommandBuffers(address()); }
    /** @return the value of the {@code vkFreeMemory} field. */
    @NativeType("PFN_vkFreeMemory")
    public long vkFreeMemory() { return nvkFreeMemory(address()); }
    /** @return the value of the {@code vkGetBufferMemoryRequirements} field. */
    @NativeType("PFN_vkGetBufferMemoryRequirements")
    public long vkGetBufferMemoryRequirements() { return nvkGetBufferMemoryRequirements(address()); }
    /** @return the value of the {@code vkGetImageMemoryRequirements} field. */
    @NativeType("PFN_vkGetImageMemoryRequirements")
    public long vkGetImageMemoryRequirements() { return nvkGetImageMemoryRequirements(address()); }
    /** @return the value of the {@code vkGetImageSubresourceLayout} field. */
    @NativeType("PFN_vkGetImageSubresourceLayout")
    public long vkGetImageSubresourceLayout() { return nvkGetImageSubresourceLayout(address()); }
    /** @return the value of the {@code vkGetPhysicalDeviceImageFormatProperties} field. */
    @NativeType("PFN_vkGetPhysicalDeviceImageFormatProperties")
    public long vkGetPhysicalDeviceImageFormatProperties() { return nvkGetPhysicalDeviceImageFormatProperties(address()); }
    /** @return the value of the {@code vkGetPhysicalDeviceFormatProperties} field. */
    @NativeType("PFN_vkGetPhysicalDeviceFormatProperties")
    public long vkGetPhysicalDeviceFormatProperties() { return nvkGetPhysicalDeviceFormatProperties(address()); }
    /** @return the value of the {@code vkGetPhysicalDeviceMemoryProperties} field. */
    @NativeType("PFN_vkGetPhysicalDeviceMemoryProperties")
    public long vkGetPhysicalDeviceMemoryProperties() { return nvkGetPhysicalDeviceMemoryProperties(address()); }
    /** @return the value of the {@code vkMapMemory} field. */
    @NativeType("PFN_vkMapMemory")
    public long vkMapMemory() { return nvkMapMemory(address()); }
    /** @return the value of the {@code vkQueueSubmit} field. */
    @NativeType("PFN_vkQueueSubmit")
    public long vkQueueSubmit() { return nvkQueueSubmit(address()); }
    /** @return the value of the {@code vkQueueWaitIdle} field. */
    @NativeType("PFN_vkQueueWaitIdle")
    public long vkQueueWaitIdle() { return nvkQueueWaitIdle(address()); }
    /** @return the value of the {@code vkUnmapMemory} field. */
    @NativeType("PFN_vkUnmapMemory")
    public long vkUnmapMemory() { return nvkUnmapMemory(address()); }
    /** @return the value of the {@code vkWaitForFences} field. */
    @NativeType("PFN_vkWaitForFences")
    public long vkWaitForFences() { return nvkWaitForFences(address()); }

    /** Sets the specified value to the {@link #vkGetInstanceProcAddr} field. */
    public ktxVulkanFunctions vkGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) { nvkGetInstanceProcAddr(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetDeviceProcAddr} field. */
    public ktxVulkanFunctions vkGetDeviceProcAddr(@NativeType("PFN_vkGetDeviceProcAddr") long value) { nvkGetDeviceProcAddr(address(), value); return this; }
    /** Sets the specified value to the {@code vkAllocateCommandBuffers} field. */
    public ktxVulkanFunctions vkAllocateCommandBuffers(@NativeType("PFN_vkAllocateCommandBuffers") long value) { nvkAllocateCommandBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code vkAllocateMemory} field. */
    public ktxVulkanFunctions vkAllocateMemory(@NativeType("PFN_vkAllocateMemory") long value) { nvkAllocateMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkBeginCommandBuffer} field. */
    public ktxVulkanFunctions vkBeginCommandBuffer(@NativeType("PFN_vkBeginCommandBuffer") long value) { nvkBeginCommandBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vkBindBufferMemory} field. */
    public ktxVulkanFunctions vkBindBufferMemory(@NativeType("PFN_vkBindBufferMemory") long value) { nvkBindBufferMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkBindImageMemory} field. */
    public ktxVulkanFunctions vkBindImageMemory(@NativeType("PFN_vkBindImageMemory") long value) { nvkBindImageMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkCmdBlitImage} field. */
    public ktxVulkanFunctions vkCmdBlitImage(@NativeType("PFN_vkCmdBlitImage") long value) { nvkCmdBlitImage(address(), value); return this; }
    /** Sets the specified value to the {@code vkCmdCopyBufferToImage} field. */
    public ktxVulkanFunctions vkCmdCopyBufferToImage(@NativeType("PFN_vkCmdCopyBufferToImage") long value) { nvkCmdCopyBufferToImage(address(), value); return this; }
    /** Sets the specified value to the {@code vkCmdPipelineBarrier} field. */
    public ktxVulkanFunctions vkCmdPipelineBarrier(@NativeType("PFN_vkCmdPipelineBarrier") long value) { nvkCmdPipelineBarrier(address(), value); return this; }
    /** Sets the specified value to the {@code vkCreateImage} field. */
    public ktxVulkanFunctions vkCreateImage(@NativeType("PFN_vkCreateImage") long value) { nvkCreateImage(address(), value); return this; }
    /** Sets the specified value to the {@code vkDestroyImage} field. */
    public ktxVulkanFunctions vkDestroyImage(@NativeType("PFN_vkDestroyImage") long value) { nvkDestroyImage(address(), value); return this; }
    /** Sets the specified value to the {@code vkCreateBuffer} field. */
    public ktxVulkanFunctions vkCreateBuffer(@NativeType("PFN_vkCreateBuffer") long value) { nvkCreateBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vkDestroyBuffer} field. */
    public ktxVulkanFunctions vkDestroyBuffer(@NativeType("PFN_vkDestroyBuffer") long value) { nvkDestroyBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vkCreateFence} field. */
    public ktxVulkanFunctions vkCreateFence(@NativeType("PFN_vkCreateFence") long value) { nvkCreateFence(address(), value); return this; }
    /** Sets the specified value to the {@code vkDestroyFence} field. */
    public ktxVulkanFunctions vkDestroyFence(@NativeType("PFN_vkDestroyFence") long value) { nvkDestroyFence(address(), value); return this; }
    /** Sets the specified value to the {@code vkEndCommandBuffer} field. */
    public ktxVulkanFunctions vkEndCommandBuffer(@NativeType("PFN_vkEndCommandBuffer") long value) { nvkEndCommandBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vkFreeCommandBuffers} field. */
    public ktxVulkanFunctions vkFreeCommandBuffers(@NativeType("PFN_vkFreeCommandBuffers") long value) { nvkFreeCommandBuffers(address(), value); return this; }
    /** Sets the specified value to the {@code vkFreeMemory} field. */
    public ktxVulkanFunctions vkFreeMemory(@NativeType("PFN_vkFreeMemory") long value) { nvkFreeMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetBufferMemoryRequirements} field. */
    public ktxVulkanFunctions vkGetBufferMemoryRequirements(@NativeType("PFN_vkGetBufferMemoryRequirements") long value) { nvkGetBufferMemoryRequirements(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetImageMemoryRequirements} field. */
    public ktxVulkanFunctions vkGetImageMemoryRequirements(@NativeType("PFN_vkGetImageMemoryRequirements") long value) { nvkGetImageMemoryRequirements(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetImageSubresourceLayout} field. */
    public ktxVulkanFunctions vkGetImageSubresourceLayout(@NativeType("PFN_vkGetImageSubresourceLayout") long value) { nvkGetImageSubresourceLayout(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetPhysicalDeviceImageFormatProperties} field. */
    public ktxVulkanFunctions vkGetPhysicalDeviceImageFormatProperties(@NativeType("PFN_vkGetPhysicalDeviceImageFormatProperties") long value) { nvkGetPhysicalDeviceImageFormatProperties(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetPhysicalDeviceFormatProperties} field. */
    public ktxVulkanFunctions vkGetPhysicalDeviceFormatProperties(@NativeType("PFN_vkGetPhysicalDeviceFormatProperties") long value) { nvkGetPhysicalDeviceFormatProperties(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetPhysicalDeviceMemoryProperties} field. */
    public ktxVulkanFunctions vkGetPhysicalDeviceMemoryProperties(@NativeType("PFN_vkGetPhysicalDeviceMemoryProperties") long value) { nvkGetPhysicalDeviceMemoryProperties(address(), value); return this; }
    /** Sets the specified value to the {@code vkMapMemory} field. */
    public ktxVulkanFunctions vkMapMemory(@NativeType("PFN_vkMapMemory") long value) { nvkMapMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkQueueSubmit} field. */
    public ktxVulkanFunctions vkQueueSubmit(@NativeType("PFN_vkQueueSubmit") long value) { nvkQueueSubmit(address(), value); return this; }
    /** Sets the specified value to the {@code vkQueueWaitIdle} field. */
    public ktxVulkanFunctions vkQueueWaitIdle(@NativeType("PFN_vkQueueWaitIdle") long value) { nvkQueueWaitIdle(address(), value); return this; }
    /** Sets the specified value to the {@code vkUnmapMemory} field. */
    public ktxVulkanFunctions vkUnmapMemory(@NativeType("PFN_vkUnmapMemory") long value) { nvkUnmapMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkWaitForFences} field. */
    public ktxVulkanFunctions vkWaitForFences(@NativeType("PFN_vkWaitForFences") long value) { nvkWaitForFences(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ktxVulkanFunctions set(
        long vkGetInstanceProcAddr,
        long vkGetDeviceProcAddr,
        long vkAllocateCommandBuffers,
        long vkAllocateMemory,
        long vkBeginCommandBuffer,
        long vkBindBufferMemory,
        long vkBindImageMemory,
        long vkCmdBlitImage,
        long vkCmdCopyBufferToImage,
        long vkCmdPipelineBarrier,
        long vkCreateImage,
        long vkDestroyImage,
        long vkCreateBuffer,
        long vkDestroyBuffer,
        long vkCreateFence,
        long vkDestroyFence,
        long vkEndCommandBuffer,
        long vkFreeCommandBuffers,
        long vkFreeMemory,
        long vkGetBufferMemoryRequirements,
        long vkGetImageMemoryRequirements,
        long vkGetImageSubresourceLayout,
        long vkGetPhysicalDeviceImageFormatProperties,
        long vkGetPhysicalDeviceFormatProperties,
        long vkGetPhysicalDeviceMemoryProperties,
        long vkMapMemory,
        long vkQueueSubmit,
        long vkQueueWaitIdle,
        long vkUnmapMemory,
        long vkWaitForFences
    ) {
        vkGetInstanceProcAddr(vkGetInstanceProcAddr);
        vkGetDeviceProcAddr(vkGetDeviceProcAddr);
        vkAllocateCommandBuffers(vkAllocateCommandBuffers);
        vkAllocateMemory(vkAllocateMemory);
        vkBeginCommandBuffer(vkBeginCommandBuffer);
        vkBindBufferMemory(vkBindBufferMemory);
        vkBindImageMemory(vkBindImageMemory);
        vkCmdBlitImage(vkCmdBlitImage);
        vkCmdCopyBufferToImage(vkCmdCopyBufferToImage);
        vkCmdPipelineBarrier(vkCmdPipelineBarrier);
        vkCreateImage(vkCreateImage);
        vkDestroyImage(vkDestroyImage);
        vkCreateBuffer(vkCreateBuffer);
        vkDestroyBuffer(vkDestroyBuffer);
        vkCreateFence(vkCreateFence);
        vkDestroyFence(vkDestroyFence);
        vkEndCommandBuffer(vkEndCommandBuffer);
        vkFreeCommandBuffers(vkFreeCommandBuffers);
        vkFreeMemory(vkFreeMemory);
        vkGetBufferMemoryRequirements(vkGetBufferMemoryRequirements);
        vkGetImageMemoryRequirements(vkGetImageMemoryRequirements);
        vkGetImageSubresourceLayout(vkGetImageSubresourceLayout);
        vkGetPhysicalDeviceImageFormatProperties(vkGetPhysicalDeviceImageFormatProperties);
        vkGetPhysicalDeviceFormatProperties(vkGetPhysicalDeviceFormatProperties);
        vkGetPhysicalDeviceMemoryProperties(vkGetPhysicalDeviceMemoryProperties);
        vkMapMemory(vkMapMemory);
        vkQueueSubmit(vkQueueSubmit);
        vkQueueWaitIdle(vkQueueWaitIdle);
        vkUnmapMemory(vkUnmapMemory);
        vkWaitForFences(vkWaitForFences);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ktxVulkanFunctions set(ktxVulkanFunctions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ktxVulkanFunctions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ktxVulkanFunctions malloc() {
        return new ktxVulkanFunctions(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanFunctions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ktxVulkanFunctions calloc() {
        return new ktxVulkanFunctions(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code ktxVulkanFunctions} instance allocated with {@link BufferUtils}. */
    public static ktxVulkanFunctions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new ktxVulkanFunctions(memAddress(container), container);
    }

    /** Returns a new {@code ktxVulkanFunctions} instance for the specified memory address. */
    public static ktxVulkanFunctions create(long address) {
        return new ktxVulkanFunctions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxVulkanFunctions createSafe(long address) {
        return address == NULL ? null : new ktxVulkanFunctions(address, null);
    }

    /**
     * Returns a new {@link ktxVulkanFunctions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanFunctions.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanFunctions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanFunctions.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanFunctions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ktxVulkanFunctions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link ktxVulkanFunctions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ktxVulkanFunctions.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ktxVulkanFunctions.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code ktxVulkanFunctions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanFunctions malloc(MemoryStack stack) {
        return new ktxVulkanFunctions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code ktxVulkanFunctions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ktxVulkanFunctions calloc(MemoryStack stack) {
        return new ktxVulkanFunctions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link ktxVulkanFunctions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanFunctions.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ktxVulkanFunctions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ktxVulkanFunctions.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vkGetInstanceProcAddr}. */
    public static long nvkGetInstanceProcAddr(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETINSTANCEPROCADDR); }
    /** Unsafe version of {@link #vkGetDeviceProcAddr}. */
    public static long nvkGetDeviceProcAddr(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETDEVICEPROCADDR); }
    /** Unsafe version of {@link #vkAllocateCommandBuffers}. */
    public static long nvkAllocateCommandBuffers(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKALLOCATECOMMANDBUFFERS); }
    /** Unsafe version of {@link #vkAllocateMemory}. */
    public static long nvkAllocateMemory(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKALLOCATEMEMORY); }
    /** Unsafe version of {@link #vkBeginCommandBuffer}. */
    public static long nvkBeginCommandBuffer(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKBEGINCOMMANDBUFFER); }
    /** Unsafe version of {@link #vkBindBufferMemory}. */
    public static long nvkBindBufferMemory(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKBINDBUFFERMEMORY); }
    /** Unsafe version of {@link #vkBindImageMemory}. */
    public static long nvkBindImageMemory(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKBINDIMAGEMEMORY); }
    /** Unsafe version of {@link #vkCmdBlitImage}. */
    public static long nvkCmdBlitImage(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKCMDBLITIMAGE); }
    /** Unsafe version of {@link #vkCmdCopyBufferToImage}. */
    public static long nvkCmdCopyBufferToImage(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKCMDCOPYBUFFERTOIMAGE); }
    /** Unsafe version of {@link #vkCmdPipelineBarrier}. */
    public static long nvkCmdPipelineBarrier(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKCMDPIPELINEBARRIER); }
    /** Unsafe version of {@link #vkCreateImage}. */
    public static long nvkCreateImage(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKCREATEIMAGE); }
    /** Unsafe version of {@link #vkDestroyImage}. */
    public static long nvkDestroyImage(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKDESTROYIMAGE); }
    /** Unsafe version of {@link #vkCreateBuffer}. */
    public static long nvkCreateBuffer(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKCREATEBUFFER); }
    /** Unsafe version of {@link #vkDestroyBuffer}. */
    public static long nvkDestroyBuffer(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKDESTROYBUFFER); }
    /** Unsafe version of {@link #vkCreateFence}. */
    public static long nvkCreateFence(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKCREATEFENCE); }
    /** Unsafe version of {@link #vkDestroyFence}. */
    public static long nvkDestroyFence(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKDESTROYFENCE); }
    /** Unsafe version of {@link #vkEndCommandBuffer}. */
    public static long nvkEndCommandBuffer(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKENDCOMMANDBUFFER); }
    /** Unsafe version of {@link #vkFreeCommandBuffers}. */
    public static long nvkFreeCommandBuffers(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKFREECOMMANDBUFFERS); }
    /** Unsafe version of {@link #vkFreeMemory}. */
    public static long nvkFreeMemory(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKFREEMEMORY); }
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements}. */
    public static long nvkGetBufferMemoryRequirements(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements}. */
    public static long nvkGetImageMemoryRequirements(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS); }
    /** Unsafe version of {@link #vkGetImageSubresourceLayout}. */
    public static long nvkGetImageSubresourceLayout(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETIMAGESUBRESOURCELAYOUT); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceImageFormatProperties}. */
    public static long nvkGetPhysicalDeviceImageFormatProperties(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETPHYSICALDEVICEIMAGEFORMATPROPERTIES); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceFormatProperties}. */
    public static long nvkGetPhysicalDeviceFormatProperties(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETPHYSICALDEVICEFORMATPROPERTIES); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties}. */
    public static long nvkGetPhysicalDeviceMemoryProperties(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES); }
    /** Unsafe version of {@link #vkMapMemory}. */
    public static long nvkMapMemory(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKMAPMEMORY); }
    /** Unsafe version of {@link #vkQueueSubmit}. */
    public static long nvkQueueSubmit(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKQUEUESUBMIT); }
    /** Unsafe version of {@link #vkQueueWaitIdle}. */
    public static long nvkQueueWaitIdle(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKQUEUEWAITIDLE); }
    /** Unsafe version of {@link #vkUnmapMemory}. */
    public static long nvkUnmapMemory(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKUNMAPMEMORY); }
    /** Unsafe version of {@link #vkWaitForFences}. */
    public static long nvkWaitForFences(long struct) { return memGetAddress(struct + ktxVulkanFunctions.VKWAITFORFENCES); }

    /** Unsafe version of {@link #vkGetInstanceProcAddr(long) vkGetInstanceProcAddr}. */
    public static void nvkGetInstanceProcAddr(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETINSTANCEPROCADDR, check(value)); }
    /** Unsafe version of {@link #vkGetDeviceProcAddr(long) vkGetDeviceProcAddr}. */
    public static void nvkGetDeviceProcAddr(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETDEVICEPROCADDR, check(value)); }
    /** Unsafe version of {@link #vkAllocateCommandBuffers(long) vkAllocateCommandBuffers}. */
    public static void nvkAllocateCommandBuffers(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKALLOCATECOMMANDBUFFERS, value); }
    /** Unsafe version of {@link #vkAllocateMemory(long) vkAllocateMemory}. */
    public static void nvkAllocateMemory(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKALLOCATEMEMORY, value); }
    /** Unsafe version of {@link #vkBeginCommandBuffer(long) vkBeginCommandBuffer}. */
    public static void nvkBeginCommandBuffer(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKBEGINCOMMANDBUFFER, value); }
    /** Unsafe version of {@link #vkBindBufferMemory(long) vkBindBufferMemory}. */
    public static void nvkBindBufferMemory(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKBINDBUFFERMEMORY, value); }
    /** Unsafe version of {@link #vkBindImageMemory(long) vkBindImageMemory}. */
    public static void nvkBindImageMemory(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKBINDIMAGEMEMORY, value); }
    /** Unsafe version of {@link #vkCmdBlitImage(long) vkCmdBlitImage}. */
    public static void nvkCmdBlitImage(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKCMDBLITIMAGE, value); }
    /** Unsafe version of {@link #vkCmdCopyBufferToImage(long) vkCmdCopyBufferToImage}. */
    public static void nvkCmdCopyBufferToImage(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKCMDCOPYBUFFERTOIMAGE, value); }
    /** Unsafe version of {@link #vkCmdPipelineBarrier(long) vkCmdPipelineBarrier}. */
    public static void nvkCmdPipelineBarrier(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKCMDPIPELINEBARRIER, value); }
    /** Unsafe version of {@link #vkCreateImage(long) vkCreateImage}. */
    public static void nvkCreateImage(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKCREATEIMAGE, value); }
    /** Unsafe version of {@link #vkDestroyImage(long) vkDestroyImage}. */
    public static void nvkDestroyImage(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKDESTROYIMAGE, value); }
    /** Unsafe version of {@link #vkCreateBuffer(long) vkCreateBuffer}. */
    public static void nvkCreateBuffer(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKCREATEBUFFER, value); }
    /** Unsafe version of {@link #vkDestroyBuffer(long) vkDestroyBuffer}. */
    public static void nvkDestroyBuffer(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKDESTROYBUFFER, value); }
    /** Unsafe version of {@link #vkCreateFence(long) vkCreateFence}. */
    public static void nvkCreateFence(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKCREATEFENCE, value); }
    /** Unsafe version of {@link #vkDestroyFence(long) vkDestroyFence}. */
    public static void nvkDestroyFence(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKDESTROYFENCE, value); }
    /** Unsafe version of {@link #vkEndCommandBuffer(long) vkEndCommandBuffer}. */
    public static void nvkEndCommandBuffer(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKENDCOMMANDBUFFER, value); }
    /** Unsafe version of {@link #vkFreeCommandBuffers(long) vkFreeCommandBuffers}. */
    public static void nvkFreeCommandBuffers(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKFREECOMMANDBUFFERS, value); }
    /** Unsafe version of {@link #vkFreeMemory(long) vkFreeMemory}. */
    public static void nvkFreeMemory(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKFREEMEMORY, value); }
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements(long) vkGetBufferMemoryRequirements}. */
    public static void nvkGetBufferMemoryRequirements(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS, value); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements(long) vkGetImageMemoryRequirements}. */
    public static void nvkGetImageMemoryRequirements(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS, value); }
    /** Unsafe version of {@link #vkGetImageSubresourceLayout(long) vkGetImageSubresourceLayout}. */
    public static void nvkGetImageSubresourceLayout(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETIMAGESUBRESOURCELAYOUT, value); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceImageFormatProperties(long) vkGetPhysicalDeviceImageFormatProperties}. */
    public static void nvkGetPhysicalDeviceImageFormatProperties(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETPHYSICALDEVICEIMAGEFORMATPROPERTIES, value); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceFormatProperties(long) vkGetPhysicalDeviceFormatProperties}. */
    public static void nvkGetPhysicalDeviceFormatProperties(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETPHYSICALDEVICEFORMATPROPERTIES, value); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties(long) vkGetPhysicalDeviceMemoryProperties}. */
    public static void nvkGetPhysicalDeviceMemoryProperties(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES, value); }
    /** Unsafe version of {@link #vkMapMemory(long) vkMapMemory}. */
    public static void nvkMapMemory(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKMAPMEMORY, value); }
    /** Unsafe version of {@link #vkQueueSubmit(long) vkQueueSubmit}. */
    public static void nvkQueueSubmit(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKQUEUESUBMIT, value); }
    /** Unsafe version of {@link #vkQueueWaitIdle(long) vkQueueWaitIdle}. */
    public static void nvkQueueWaitIdle(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKQUEUEWAITIDLE, value); }
    /** Unsafe version of {@link #vkUnmapMemory(long) vkUnmapMemory}. */
    public static void nvkUnmapMemory(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKUNMAPMEMORY, value); }
    /** Unsafe version of {@link #vkWaitForFences(long) vkWaitForFences}. */
    public static void nvkWaitForFences(long struct, long value) { memPutAddress(struct + ktxVulkanFunctions.VKWAITFORFENCES, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + ktxVulkanFunctions.VKGETINSTANCEPROCADDR));
        check(memGetAddress(struct + ktxVulkanFunctions.VKGETDEVICEPROCADDR));
    }

    /**
     * Helper method that populates this struct with required Vulkan function pointers from the specified Vulkan instance and device.
     *
     * @param instance a Vulkan instance
     * @param device   a Vulkan device
     */
    public ktxVulkanFunctions set(VkInstance instance, VkDevice device) {
        VKCapabilitiesInstance ic = instance.getCapabilities();
        VKCapabilitiesDevice   dc = device.getCapabilities();
        this
            .vkGetInstanceProcAddr(VK.getFunctionProvider().getFunctionAddress("vkGetInstanceProcAddr"))
            .vkGetDeviceProcAddr(dc.vkGetDeviceProcAddr)
            .vkAllocateCommandBuffers(dc.vkAllocateCommandBuffers)
            .vkAllocateMemory(dc.vkAllocateMemory)
            .vkBeginCommandBuffer(dc.vkBeginCommandBuffer)
            .vkBindBufferMemory(dc.vkBindBufferMemory)
            .vkBindImageMemory(dc.vkBindImageMemory)
            .vkCmdBlitImage(dc.vkCmdBlitImage)
            .vkCmdCopyBufferToImage(dc.vkCmdCopyBufferToImage)
            .vkCmdPipelineBarrier(dc.vkCmdPipelineBarrier)
            .vkCreateImage(dc.vkCreateImage)
            .vkDestroyImage(dc.vkDestroyImage)
            .vkCreateBuffer(dc.vkCreateBuffer)
            .vkDestroyBuffer(dc.vkDestroyBuffer)
            .vkCreateFence(dc.vkCreateFence)
            .vkDestroyFence(dc.vkDestroyFence)
            .vkEndCommandBuffer(dc.vkEndCommandBuffer)
            .vkFreeCommandBuffers(dc.vkFreeCommandBuffers)
            .vkFreeMemory(dc.vkFreeMemory)
            .vkGetBufferMemoryRequirements(dc.vkGetBufferMemoryRequirements)
            .vkGetImageMemoryRequirements(dc.vkGetImageMemoryRequirements)
            .vkGetImageSubresourceLayout(dc.vkGetImageSubresourceLayout)
            .vkGetPhysicalDeviceImageFormatProperties(ic.vkGetPhysicalDeviceImageFormatProperties)
            .vkGetPhysicalDeviceFormatProperties(ic.vkGetPhysicalDeviceFormatProperties)
            .vkGetPhysicalDeviceMemoryProperties(ic.vkGetPhysicalDeviceMemoryProperties)
            .vkMapMemory(dc.vkMapMemory)
            .vkQueueSubmit(dc.vkQueueSubmit)
            .vkQueueWaitIdle(dc.vkQueueWaitIdle)
            .vkUnmapMemory(dc.vkUnmapMemory)
            .vkWaitForFences(dc.vkWaitForFences);
        return this;
    }

    // -----------------------------------

    /** An array of {@link ktxVulkanFunctions} structs. */
    public static class Buffer extends StructBuffer<ktxVulkanFunctions, Buffer> implements NativeResource {

        private static final ktxVulkanFunctions ELEMENT_FACTORY = ktxVulkanFunctions.create(-1L);

        /**
         * Creates a new {@code ktxVulkanFunctions.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ktxVulkanFunctions#SIZEOF}, and its mark will be undefined.</p>
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
        protected ktxVulkanFunctions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ktxVulkanFunctions#vkGetInstanceProcAddr} field. */
        @NativeType("PFN_vkGetInstanceProcAddr")
        public long vkGetInstanceProcAddr() { return ktxVulkanFunctions.nvkGetInstanceProcAddr(address()); }
        /** @return the value of the {@code vkGetDeviceProcAddr} field. */
        @NativeType("PFN_vkGetDeviceProcAddr")
        public long vkGetDeviceProcAddr() { return ktxVulkanFunctions.nvkGetDeviceProcAddr(address()); }
        /** @return the value of the {@code vkAllocateCommandBuffers} field. */
        @NativeType("PFN_vkAllocateCommandBuffers")
        public long vkAllocateCommandBuffers() { return ktxVulkanFunctions.nvkAllocateCommandBuffers(address()); }
        /** @return the value of the {@code vkAllocateMemory} field. */
        @NativeType("PFN_vkAllocateMemory")
        public long vkAllocateMemory() { return ktxVulkanFunctions.nvkAllocateMemory(address()); }
        /** @return the value of the {@code vkBeginCommandBuffer} field. */
        @NativeType("PFN_vkBeginCommandBuffer")
        public long vkBeginCommandBuffer() { return ktxVulkanFunctions.nvkBeginCommandBuffer(address()); }
        /** @return the value of the {@code vkBindBufferMemory} field. */
        @NativeType("PFN_vkBindBufferMemory")
        public long vkBindBufferMemory() { return ktxVulkanFunctions.nvkBindBufferMemory(address()); }
        /** @return the value of the {@code vkBindImageMemory} field. */
        @NativeType("PFN_vkBindImageMemory")
        public long vkBindImageMemory() { return ktxVulkanFunctions.nvkBindImageMemory(address()); }
        /** @return the value of the {@code vkCmdBlitImage} field. */
        @NativeType("PFN_vkCmdBlitImage")
        public long vkCmdBlitImage() { return ktxVulkanFunctions.nvkCmdBlitImage(address()); }
        /** @return the value of the {@code vkCmdCopyBufferToImage} field. */
        @NativeType("PFN_vkCmdCopyBufferToImage")
        public long vkCmdCopyBufferToImage() { return ktxVulkanFunctions.nvkCmdCopyBufferToImage(address()); }
        /** @return the value of the {@code vkCmdPipelineBarrier} field. */
        @NativeType("PFN_vkCmdPipelineBarrier")
        public long vkCmdPipelineBarrier() { return ktxVulkanFunctions.nvkCmdPipelineBarrier(address()); }
        /** @return the value of the {@code vkCreateImage} field. */
        @NativeType("PFN_vkCreateImage")
        public long vkCreateImage() { return ktxVulkanFunctions.nvkCreateImage(address()); }
        /** @return the value of the {@code vkDestroyImage} field. */
        @NativeType("PFN_vkDestroyImage")
        public long vkDestroyImage() { return ktxVulkanFunctions.nvkDestroyImage(address()); }
        /** @return the value of the {@code vkCreateBuffer} field. */
        @NativeType("PFN_vkCreateBuffer")
        public long vkCreateBuffer() { return ktxVulkanFunctions.nvkCreateBuffer(address()); }
        /** @return the value of the {@code vkDestroyBuffer} field. */
        @NativeType("PFN_vkDestroyBuffer")
        public long vkDestroyBuffer() { return ktxVulkanFunctions.nvkDestroyBuffer(address()); }
        /** @return the value of the {@code vkCreateFence} field. */
        @NativeType("PFN_vkCreateFence")
        public long vkCreateFence() { return ktxVulkanFunctions.nvkCreateFence(address()); }
        /** @return the value of the {@code vkDestroyFence} field. */
        @NativeType("PFN_vkDestroyFence")
        public long vkDestroyFence() { return ktxVulkanFunctions.nvkDestroyFence(address()); }
        /** @return the value of the {@code vkEndCommandBuffer} field. */
        @NativeType("PFN_vkEndCommandBuffer")
        public long vkEndCommandBuffer() { return ktxVulkanFunctions.nvkEndCommandBuffer(address()); }
        /** @return the value of the {@code vkFreeCommandBuffers} field. */
        @NativeType("PFN_vkFreeCommandBuffers")
        public long vkFreeCommandBuffers() { return ktxVulkanFunctions.nvkFreeCommandBuffers(address()); }
        /** @return the value of the {@code vkFreeMemory} field. */
        @NativeType("PFN_vkFreeMemory")
        public long vkFreeMemory() { return ktxVulkanFunctions.nvkFreeMemory(address()); }
        /** @return the value of the {@code vkGetBufferMemoryRequirements} field. */
        @NativeType("PFN_vkGetBufferMemoryRequirements")
        public long vkGetBufferMemoryRequirements() { return ktxVulkanFunctions.nvkGetBufferMemoryRequirements(address()); }
        /** @return the value of the {@code vkGetImageMemoryRequirements} field. */
        @NativeType("PFN_vkGetImageMemoryRequirements")
        public long vkGetImageMemoryRequirements() { return ktxVulkanFunctions.nvkGetImageMemoryRequirements(address()); }
        /** @return the value of the {@code vkGetImageSubresourceLayout} field. */
        @NativeType("PFN_vkGetImageSubresourceLayout")
        public long vkGetImageSubresourceLayout() { return ktxVulkanFunctions.nvkGetImageSubresourceLayout(address()); }
        /** @return the value of the {@code vkGetPhysicalDeviceImageFormatProperties} field. */
        @NativeType("PFN_vkGetPhysicalDeviceImageFormatProperties")
        public long vkGetPhysicalDeviceImageFormatProperties() { return ktxVulkanFunctions.nvkGetPhysicalDeviceImageFormatProperties(address()); }
        /** @return the value of the {@code vkGetPhysicalDeviceFormatProperties} field. */
        @NativeType("PFN_vkGetPhysicalDeviceFormatProperties")
        public long vkGetPhysicalDeviceFormatProperties() { return ktxVulkanFunctions.nvkGetPhysicalDeviceFormatProperties(address()); }
        /** @return the value of the {@code vkGetPhysicalDeviceMemoryProperties} field. */
        @NativeType("PFN_vkGetPhysicalDeviceMemoryProperties")
        public long vkGetPhysicalDeviceMemoryProperties() { return ktxVulkanFunctions.nvkGetPhysicalDeviceMemoryProperties(address()); }
        /** @return the value of the {@code vkMapMemory} field. */
        @NativeType("PFN_vkMapMemory")
        public long vkMapMemory() { return ktxVulkanFunctions.nvkMapMemory(address()); }
        /** @return the value of the {@code vkQueueSubmit} field. */
        @NativeType("PFN_vkQueueSubmit")
        public long vkQueueSubmit() { return ktxVulkanFunctions.nvkQueueSubmit(address()); }
        /** @return the value of the {@code vkQueueWaitIdle} field. */
        @NativeType("PFN_vkQueueWaitIdle")
        public long vkQueueWaitIdle() { return ktxVulkanFunctions.nvkQueueWaitIdle(address()); }
        /** @return the value of the {@code vkUnmapMemory} field. */
        @NativeType("PFN_vkUnmapMemory")
        public long vkUnmapMemory() { return ktxVulkanFunctions.nvkUnmapMemory(address()); }
        /** @return the value of the {@code vkWaitForFences} field. */
        @NativeType("PFN_vkWaitForFences")
        public long vkWaitForFences() { return ktxVulkanFunctions.nvkWaitForFences(address()); }

        /** Sets the specified value to the {@link ktxVulkanFunctions#vkGetInstanceProcAddr} field. */
        public ktxVulkanFunctions.Buffer vkGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) { ktxVulkanFunctions.nvkGetInstanceProcAddr(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetDeviceProcAddr} field. */
        public ktxVulkanFunctions.Buffer vkGetDeviceProcAddr(@NativeType("PFN_vkGetDeviceProcAddr") long value) { ktxVulkanFunctions.nvkGetDeviceProcAddr(address(), value); return this; }
        /** Sets the specified value to the {@code vkAllocateCommandBuffers} field. */
        public ktxVulkanFunctions.Buffer vkAllocateCommandBuffers(@NativeType("PFN_vkAllocateCommandBuffers") long value) { ktxVulkanFunctions.nvkAllocateCommandBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code vkAllocateMemory} field. */
        public ktxVulkanFunctions.Buffer vkAllocateMemory(@NativeType("PFN_vkAllocateMemory") long value) { ktxVulkanFunctions.nvkAllocateMemory(address(), value); return this; }
        /** Sets the specified value to the {@code vkBeginCommandBuffer} field. */
        public ktxVulkanFunctions.Buffer vkBeginCommandBuffer(@NativeType("PFN_vkBeginCommandBuffer") long value) { ktxVulkanFunctions.nvkBeginCommandBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code vkBindBufferMemory} field. */
        public ktxVulkanFunctions.Buffer vkBindBufferMemory(@NativeType("PFN_vkBindBufferMemory") long value) { ktxVulkanFunctions.nvkBindBufferMemory(address(), value); return this; }
        /** Sets the specified value to the {@code vkBindImageMemory} field. */
        public ktxVulkanFunctions.Buffer vkBindImageMemory(@NativeType("PFN_vkBindImageMemory") long value) { ktxVulkanFunctions.nvkBindImageMemory(address(), value); return this; }
        /** Sets the specified value to the {@code vkCmdBlitImage} field. */
        public ktxVulkanFunctions.Buffer vkCmdBlitImage(@NativeType("PFN_vkCmdBlitImage") long value) { ktxVulkanFunctions.nvkCmdBlitImage(address(), value); return this; }
        /** Sets the specified value to the {@code vkCmdCopyBufferToImage} field. */
        public ktxVulkanFunctions.Buffer vkCmdCopyBufferToImage(@NativeType("PFN_vkCmdCopyBufferToImage") long value) { ktxVulkanFunctions.nvkCmdCopyBufferToImage(address(), value); return this; }
        /** Sets the specified value to the {@code vkCmdPipelineBarrier} field. */
        public ktxVulkanFunctions.Buffer vkCmdPipelineBarrier(@NativeType("PFN_vkCmdPipelineBarrier") long value) { ktxVulkanFunctions.nvkCmdPipelineBarrier(address(), value); return this; }
        /** Sets the specified value to the {@code vkCreateImage} field. */
        public ktxVulkanFunctions.Buffer vkCreateImage(@NativeType("PFN_vkCreateImage") long value) { ktxVulkanFunctions.nvkCreateImage(address(), value); return this; }
        /** Sets the specified value to the {@code vkDestroyImage} field. */
        public ktxVulkanFunctions.Buffer vkDestroyImage(@NativeType("PFN_vkDestroyImage") long value) { ktxVulkanFunctions.nvkDestroyImage(address(), value); return this; }
        /** Sets the specified value to the {@code vkCreateBuffer} field. */
        public ktxVulkanFunctions.Buffer vkCreateBuffer(@NativeType("PFN_vkCreateBuffer") long value) { ktxVulkanFunctions.nvkCreateBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code vkDestroyBuffer} field. */
        public ktxVulkanFunctions.Buffer vkDestroyBuffer(@NativeType("PFN_vkDestroyBuffer") long value) { ktxVulkanFunctions.nvkDestroyBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code vkCreateFence} field. */
        public ktxVulkanFunctions.Buffer vkCreateFence(@NativeType("PFN_vkCreateFence") long value) { ktxVulkanFunctions.nvkCreateFence(address(), value); return this; }
        /** Sets the specified value to the {@code vkDestroyFence} field. */
        public ktxVulkanFunctions.Buffer vkDestroyFence(@NativeType("PFN_vkDestroyFence") long value) { ktxVulkanFunctions.nvkDestroyFence(address(), value); return this; }
        /** Sets the specified value to the {@code vkEndCommandBuffer} field. */
        public ktxVulkanFunctions.Buffer vkEndCommandBuffer(@NativeType("PFN_vkEndCommandBuffer") long value) { ktxVulkanFunctions.nvkEndCommandBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code vkFreeCommandBuffers} field. */
        public ktxVulkanFunctions.Buffer vkFreeCommandBuffers(@NativeType("PFN_vkFreeCommandBuffers") long value) { ktxVulkanFunctions.nvkFreeCommandBuffers(address(), value); return this; }
        /** Sets the specified value to the {@code vkFreeMemory} field. */
        public ktxVulkanFunctions.Buffer vkFreeMemory(@NativeType("PFN_vkFreeMemory") long value) { ktxVulkanFunctions.nvkFreeMemory(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetBufferMemoryRequirements} field. */
        public ktxVulkanFunctions.Buffer vkGetBufferMemoryRequirements(@NativeType("PFN_vkGetBufferMemoryRequirements") long value) { ktxVulkanFunctions.nvkGetBufferMemoryRequirements(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetImageMemoryRequirements} field. */
        public ktxVulkanFunctions.Buffer vkGetImageMemoryRequirements(@NativeType("PFN_vkGetImageMemoryRequirements") long value) { ktxVulkanFunctions.nvkGetImageMemoryRequirements(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetImageSubresourceLayout} field. */
        public ktxVulkanFunctions.Buffer vkGetImageSubresourceLayout(@NativeType("PFN_vkGetImageSubresourceLayout") long value) { ktxVulkanFunctions.nvkGetImageSubresourceLayout(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetPhysicalDeviceImageFormatProperties} field. */
        public ktxVulkanFunctions.Buffer vkGetPhysicalDeviceImageFormatProperties(@NativeType("PFN_vkGetPhysicalDeviceImageFormatProperties") long value) { ktxVulkanFunctions.nvkGetPhysicalDeviceImageFormatProperties(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetPhysicalDeviceFormatProperties} field. */
        public ktxVulkanFunctions.Buffer vkGetPhysicalDeviceFormatProperties(@NativeType("PFN_vkGetPhysicalDeviceFormatProperties") long value) { ktxVulkanFunctions.nvkGetPhysicalDeviceFormatProperties(address(), value); return this; }
        /** Sets the specified value to the {@code vkGetPhysicalDeviceMemoryProperties} field. */
        public ktxVulkanFunctions.Buffer vkGetPhysicalDeviceMemoryProperties(@NativeType("PFN_vkGetPhysicalDeviceMemoryProperties") long value) { ktxVulkanFunctions.nvkGetPhysicalDeviceMemoryProperties(address(), value); return this; }
        /** Sets the specified value to the {@code vkMapMemory} field. */
        public ktxVulkanFunctions.Buffer vkMapMemory(@NativeType("PFN_vkMapMemory") long value) { ktxVulkanFunctions.nvkMapMemory(address(), value); return this; }
        /** Sets the specified value to the {@code vkQueueSubmit} field. */
        public ktxVulkanFunctions.Buffer vkQueueSubmit(@NativeType("PFN_vkQueueSubmit") long value) { ktxVulkanFunctions.nvkQueueSubmit(address(), value); return this; }
        /** Sets the specified value to the {@code vkQueueWaitIdle} field. */
        public ktxVulkanFunctions.Buffer vkQueueWaitIdle(@NativeType("PFN_vkQueueWaitIdle") long value) { ktxVulkanFunctions.nvkQueueWaitIdle(address(), value); return this; }
        /** Sets the specified value to the {@code vkUnmapMemory} field. */
        public ktxVulkanFunctions.Buffer vkUnmapMemory(@NativeType("PFN_vkUnmapMemory") long value) { ktxVulkanFunctions.nvkUnmapMemory(address(), value); return this; }
        /** Sets the specified value to the {@code vkWaitForFences} field. */
        public ktxVulkanFunctions.Buffer vkWaitForFences(@NativeType("PFN_vkWaitForFences") long value) { ktxVulkanFunctions.nvkWaitForFences(address(), value); return this; }

    }

}