/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Pointers to some Vulkan functions - a subset used by the library.
 * 
 * <p>Used in {@link VmaAllocatorCreateInfo}{@code ::pVulkanFunctions}.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VmaVulkanFunctions {
 *     PFN_vkGetInstanceProcAddr vkGetInstanceProcAddr;
 *     PFN_vkGetDeviceProcAddr vkGetDeviceProcAddr;
 *     PFN_vkGetPhysicalDeviceProperties vkGetPhysicalDeviceProperties;
 *     PFN_vkGetPhysicalDeviceMemoryProperties vkGetPhysicalDeviceMemoryProperties;
 *     PFN_vkAllocateMemory vkAllocateMemory;
 *     PFN_vkFreeMemory vkFreeMemory;
 *     PFN_vkMapMemory vkMapMemory;
 *     PFN_vkUnmapMemory vkUnmapMemory;
 *     PFN_vkFlushMappedMemoryRanges vkFlushMappedMemoryRanges;
 *     PFN_vkInvalidateMappedMemoryRanges vkInvalidateMappedMemoryRanges;
 *     PFN_vkBindBufferMemory vkBindBufferMemory;
 *     PFN_vkBindImageMemory vkBindImageMemory;
 *     PFN_vkGetBufferMemoryRequirements vkGetBufferMemoryRequirements;
 *     PFN_vkGetImageMemoryRequirements vkGetImageMemoryRequirements;
 *     PFN_vkCreateBuffer vkCreateBuffer;
 *     PFN_vkDestroyBuffer vkDestroyBuffer;
 *     PFN_vkCreateImage vkCreateImage;
 *     PFN_vkDestroyImage vkDestroyImage;
 *     PFN_vkCmdCopyBuffer vkCmdCopyBuffer;
 *     PFN_vkGetBufferMemoryRequirements2KHR {@link #vkGetBufferMemoryRequirements2KHR};
 *     PFN_vkGetImageMemoryRequirements2KHR {@link #vkGetImageMemoryRequirements2KHR};
 *     PFN_vkBindBufferMemory2KHR {@link #vkBindBufferMemory2KHR};
 *     PFN_vkBindImageMemory2KHR {@link #vkBindImageMemory2KHR};
 *     PFN_vkGetPhysicalDeviceMemoryProperties2KHR vkGetPhysicalDeviceMemoryProperties2KHR;
 *     PFN_vkGetDeviceBufferMemoryRequirements vkGetDeviceBufferMemoryRequirements;
 *     PFN_vkGetDeviceImageMemoryRequirements vkGetDeviceImageMemoryRequirements;
 * }</code></pre>
 */
public class VmaVulkanFunctions extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VKGETINSTANCEPROCADDR,
        VKGETDEVICEPROCADDR,
        VKGETPHYSICALDEVICEPROPERTIES,
        VKGETPHYSICALDEVICEMEMORYPROPERTIES,
        VKALLOCATEMEMORY,
        VKFREEMEMORY,
        VKMAPMEMORY,
        VKUNMAPMEMORY,
        VKFLUSHMAPPEDMEMORYRANGES,
        VKINVALIDATEMAPPEDMEMORYRANGES,
        VKBINDBUFFERMEMORY,
        VKBINDIMAGEMEMORY,
        VKGETBUFFERMEMORYREQUIREMENTS,
        VKGETIMAGEMEMORYREQUIREMENTS,
        VKCREATEBUFFER,
        VKDESTROYBUFFER,
        VKCREATEIMAGE,
        VKDESTROYIMAGE,
        VKCMDCOPYBUFFER,
        VKGETBUFFERMEMORYREQUIREMENTS2KHR,
        VKGETIMAGEMEMORYREQUIREMENTS2KHR,
        VKBINDBUFFERMEMORY2KHR,
        VKBINDIMAGEMEMORY2KHR,
        VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR,
        VKGETDEVICEBUFFERMEMORYREQUIREMENTS,
        VKGETDEVICEIMAGEMEMORYREQUIREMENTS;

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
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VKGETINSTANCEPROCADDR = layout.offsetof(0);
        VKGETDEVICEPROCADDR = layout.offsetof(1);
        VKGETPHYSICALDEVICEPROPERTIES = layout.offsetof(2);
        VKGETPHYSICALDEVICEMEMORYPROPERTIES = layout.offsetof(3);
        VKALLOCATEMEMORY = layout.offsetof(4);
        VKFREEMEMORY = layout.offsetof(5);
        VKMAPMEMORY = layout.offsetof(6);
        VKUNMAPMEMORY = layout.offsetof(7);
        VKFLUSHMAPPEDMEMORYRANGES = layout.offsetof(8);
        VKINVALIDATEMAPPEDMEMORYRANGES = layout.offsetof(9);
        VKBINDBUFFERMEMORY = layout.offsetof(10);
        VKBINDIMAGEMEMORY = layout.offsetof(11);
        VKGETBUFFERMEMORYREQUIREMENTS = layout.offsetof(12);
        VKGETIMAGEMEMORYREQUIREMENTS = layout.offsetof(13);
        VKCREATEBUFFER = layout.offsetof(14);
        VKDESTROYBUFFER = layout.offsetof(15);
        VKCREATEIMAGE = layout.offsetof(16);
        VKDESTROYIMAGE = layout.offsetof(17);
        VKCMDCOPYBUFFER = layout.offsetof(18);
        VKGETBUFFERMEMORYREQUIREMENTS2KHR = layout.offsetof(19);
        VKGETIMAGEMEMORYREQUIREMENTS2KHR = layout.offsetof(20);
        VKBINDBUFFERMEMORY2KHR = layout.offsetof(21);
        VKBINDIMAGEMEMORY2KHR = layout.offsetof(22);
        VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR = layout.offsetof(23);
        VKGETDEVICEBUFFERMEMORYREQUIREMENTS = layout.offsetof(24);
        VKGETDEVICEIMAGEMEMORYREQUIREMENTS = layout.offsetof(25);
    }

    /**
     * Creates a {@code VmaVulkanFunctions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaVulkanFunctions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vkGetInstanceProcAddr} field. */
    @NativeType("PFN_vkGetInstanceProcAddr")
    public long vkGetInstanceProcAddr() { return nvkGetInstanceProcAddr(address()); }
    /** @return the value of the {@code vkGetDeviceProcAddr} field. */
    @NativeType("PFN_vkGetDeviceProcAddr")
    public long vkGetDeviceProcAddr() { return nvkGetDeviceProcAddr(address()); }
    /** @return the value of the {@code vkGetPhysicalDeviceProperties} field. */
    @NativeType("PFN_vkGetPhysicalDeviceProperties")
    public long vkGetPhysicalDeviceProperties() { return nvkGetPhysicalDeviceProperties(address()); }
    /** @return the value of the {@code vkGetPhysicalDeviceMemoryProperties} field. */
    @NativeType("PFN_vkGetPhysicalDeviceMemoryProperties")
    public long vkGetPhysicalDeviceMemoryProperties() { return nvkGetPhysicalDeviceMemoryProperties(address()); }
    /** @return the value of the {@code vkAllocateMemory} field. */
    @NativeType("PFN_vkAllocateMemory")
    public long vkAllocateMemory() { return nvkAllocateMemory(address()); }
    /** @return the value of the {@code vkFreeMemory} field. */
    @NativeType("PFN_vkFreeMemory")
    public long vkFreeMemory() { return nvkFreeMemory(address()); }
    /** @return the value of the {@code vkMapMemory} field. */
    @NativeType("PFN_vkMapMemory")
    public long vkMapMemory() { return nvkMapMemory(address()); }
    /** @return the value of the {@code vkUnmapMemory} field. */
    @NativeType("PFN_vkUnmapMemory")
    public long vkUnmapMemory() { return nvkUnmapMemory(address()); }
    /** @return the value of the {@code vkFlushMappedMemoryRanges} field. */
    @NativeType("PFN_vkFlushMappedMemoryRanges")
    public long vkFlushMappedMemoryRanges() { return nvkFlushMappedMemoryRanges(address()); }
    /** @return the value of the {@code vkInvalidateMappedMemoryRanges} field. */
    @NativeType("PFN_vkInvalidateMappedMemoryRanges")
    public long vkInvalidateMappedMemoryRanges() { return nvkInvalidateMappedMemoryRanges(address()); }
    /** @return the value of the {@code vkBindBufferMemory} field. */
    @NativeType("PFN_vkBindBufferMemory")
    public long vkBindBufferMemory() { return nvkBindBufferMemory(address()); }
    /** @return the value of the {@code vkBindImageMemory} field. */
    @NativeType("PFN_vkBindImageMemory")
    public long vkBindImageMemory() { return nvkBindImageMemory(address()); }
    /** @return the value of the {@code vkGetBufferMemoryRequirements} field. */
    @NativeType("PFN_vkGetBufferMemoryRequirements")
    public long vkGetBufferMemoryRequirements() { return nvkGetBufferMemoryRequirements(address()); }
    /** @return the value of the {@code vkGetImageMemoryRequirements} field. */
    @NativeType("PFN_vkGetImageMemoryRequirements")
    public long vkGetImageMemoryRequirements() { return nvkGetImageMemoryRequirements(address()); }
    /** @return the value of the {@code vkCreateBuffer} field. */
    @NativeType("PFN_vkCreateBuffer")
    public long vkCreateBuffer() { return nvkCreateBuffer(address()); }
    /** @return the value of the {@code vkDestroyBuffer} field. */
    @NativeType("PFN_vkDestroyBuffer")
    public long vkDestroyBuffer() { return nvkDestroyBuffer(address()); }
    /** @return the value of the {@code vkCreateImage} field. */
    @NativeType("PFN_vkCreateImage")
    public long vkCreateImage() { return nvkCreateImage(address()); }
    /** @return the value of the {@code vkDestroyImage} field. */
    @NativeType("PFN_vkDestroyImage")
    public long vkDestroyImage() { return nvkDestroyImage(address()); }
    /** @return the value of the {@code vkCmdCopyBuffer} field. */
    @NativeType("PFN_vkCmdCopyBuffer")
    public long vkCmdCopyBuffer() { return nvkCmdCopyBuffer(address()); }
    /**
     * {@code vkGetBufferMemoryRequirements2} on Vulkan &ge; 1.1, {@code vkGetBufferMemoryRequirements2KHR} when using {@code VK_KHR_dedicated_allocation}
     * extension.
     */
    @NativeType("PFN_vkGetBufferMemoryRequirements2KHR")
    public long vkGetBufferMemoryRequirements2KHR() { return nvkGetBufferMemoryRequirements2KHR(address()); }
    /**
     * {@code vkGetImageMemoryRequirements2} on Vulkan &ge; 1.1, {@code vkGetImageMemoryRequirements2KHR} when using {@code VK_KHR_dedicated_allocation}
     * extension.
     */
    @NativeType("PFN_vkGetImageMemoryRequirements2KHR")
    public long vkGetImageMemoryRequirements2KHR() { return nvkGetImageMemoryRequirements2KHR(address()); }
    /** {@code vkBindBufferMemory2} on Vulkan &ge; 1.1, {@code vkBindBufferMemory2KHR} when using {@code VK_KHR_bind_memory2} extension. */
    @NativeType("PFN_vkBindBufferMemory2KHR")
    public long vkBindBufferMemory2KHR() { return nvkBindBufferMemory2KHR(address()); }
    /** {@code vkBindImageMemory2} on Vulkan &ge; 1.1, {@code vkBindImageMemory2KHR} when using {@code VK_KHR_bind_memory2} extension. */
    @NativeType("PFN_vkBindImageMemory2KHR")
    public long vkBindImageMemory2KHR() { return nvkBindImageMemory2KHR(address()); }
    /** @return the value of the {@code vkGetPhysicalDeviceMemoryProperties2KHR} field. */
    @NativeType("PFN_vkGetPhysicalDeviceMemoryProperties2KHR")
    public long vkGetPhysicalDeviceMemoryProperties2KHR() { return nvkGetPhysicalDeviceMemoryProperties2KHR(address()); }
    /** @return the value of the {@code vkGetDeviceBufferMemoryRequirements} field. */
    @NativeType("PFN_vkGetDeviceBufferMemoryRequirements")
    public long vkGetDeviceBufferMemoryRequirements() { return nvkGetDeviceBufferMemoryRequirements(address()); }
    /** @return the value of the {@code vkGetDeviceImageMemoryRequirements} field. */
    @NativeType("PFN_vkGetDeviceImageMemoryRequirements")
    public long vkGetDeviceImageMemoryRequirements() { return nvkGetDeviceImageMemoryRequirements(address()); }

    /** Sets the specified value to the {@code vkGetInstanceProcAddr} field. */
    public VmaVulkanFunctions vkGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) { nvkGetInstanceProcAddr(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetDeviceProcAddr} field. */
    public VmaVulkanFunctions vkGetDeviceProcAddr(@NativeType("PFN_vkGetDeviceProcAddr") long value) { nvkGetDeviceProcAddr(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetPhysicalDeviceProperties} field. */
    public VmaVulkanFunctions vkGetPhysicalDeviceProperties(@NativeType("PFN_vkGetPhysicalDeviceProperties") long value) { nvkGetPhysicalDeviceProperties(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetPhysicalDeviceMemoryProperties} field. */
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties(@NativeType("PFN_vkGetPhysicalDeviceMemoryProperties") long value) { nvkGetPhysicalDeviceMemoryProperties(address(), value); return this; }
    /** Sets the specified value to the {@code vkAllocateMemory} field. */
    public VmaVulkanFunctions vkAllocateMemory(@NativeType("PFN_vkAllocateMemory") long value) { nvkAllocateMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkFreeMemory} field. */
    public VmaVulkanFunctions vkFreeMemory(@NativeType("PFN_vkFreeMemory") long value) { nvkFreeMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkMapMemory} field. */
    public VmaVulkanFunctions vkMapMemory(@NativeType("PFN_vkMapMemory") long value) { nvkMapMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkUnmapMemory} field. */
    public VmaVulkanFunctions vkUnmapMemory(@NativeType("PFN_vkUnmapMemory") long value) { nvkUnmapMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkFlushMappedMemoryRanges} field. */
    public VmaVulkanFunctions vkFlushMappedMemoryRanges(@NativeType("PFN_vkFlushMappedMemoryRanges") long value) { nvkFlushMappedMemoryRanges(address(), value); return this; }
    /** Sets the specified value to the {@code vkInvalidateMappedMemoryRanges} field. */
    public VmaVulkanFunctions vkInvalidateMappedMemoryRanges(@NativeType("PFN_vkInvalidateMappedMemoryRanges") long value) { nvkInvalidateMappedMemoryRanges(address(), value); return this; }
    /** Sets the specified value to the {@code vkBindBufferMemory} field. */
    public VmaVulkanFunctions vkBindBufferMemory(@NativeType("PFN_vkBindBufferMemory") long value) { nvkBindBufferMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkBindImageMemory} field. */
    public VmaVulkanFunctions vkBindImageMemory(@NativeType("PFN_vkBindImageMemory") long value) { nvkBindImageMemory(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetBufferMemoryRequirements} field. */
    public VmaVulkanFunctions vkGetBufferMemoryRequirements(@NativeType("PFN_vkGetBufferMemoryRequirements") long value) { nvkGetBufferMemoryRequirements(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetImageMemoryRequirements} field. */
    public VmaVulkanFunctions vkGetImageMemoryRequirements(@NativeType("PFN_vkGetImageMemoryRequirements") long value) { nvkGetImageMemoryRequirements(address(), value); return this; }
    /** Sets the specified value to the {@code vkCreateBuffer} field. */
    public VmaVulkanFunctions vkCreateBuffer(@NativeType("PFN_vkCreateBuffer") long value) { nvkCreateBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vkDestroyBuffer} field. */
    public VmaVulkanFunctions vkDestroyBuffer(@NativeType("PFN_vkDestroyBuffer") long value) { nvkDestroyBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code vkCreateImage} field. */
    public VmaVulkanFunctions vkCreateImage(@NativeType("PFN_vkCreateImage") long value) { nvkCreateImage(address(), value); return this; }
    /** Sets the specified value to the {@code vkDestroyImage} field. */
    public VmaVulkanFunctions vkDestroyImage(@NativeType("PFN_vkDestroyImage") long value) { nvkDestroyImage(address(), value); return this; }
    /** Sets the specified value to the {@code vkCmdCopyBuffer} field. */
    public VmaVulkanFunctions vkCmdCopyBuffer(@NativeType("PFN_vkCmdCopyBuffer") long value) { nvkCmdCopyBuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #vkGetBufferMemoryRequirements2KHR} field. */
    public VmaVulkanFunctions vkGetBufferMemoryRequirements2KHR(@NativeType("PFN_vkGetBufferMemoryRequirements2KHR") long value) { nvkGetBufferMemoryRequirements2KHR(address(), value); return this; }
    /** Sets the specified value to the {@link #vkGetImageMemoryRequirements2KHR} field. */
    public VmaVulkanFunctions vkGetImageMemoryRequirements2KHR(@NativeType("PFN_vkGetImageMemoryRequirements2KHR") long value) { nvkGetImageMemoryRequirements2KHR(address(), value); return this; }
    /** Sets the specified value to the {@link #vkBindBufferMemory2KHR} field. */
    public VmaVulkanFunctions vkBindBufferMemory2KHR(@NativeType("PFN_vkBindBufferMemory2KHR") long value) { nvkBindBufferMemory2KHR(address(), value); return this; }
    /** Sets the specified value to the {@link #vkBindImageMemory2KHR} field. */
    public VmaVulkanFunctions vkBindImageMemory2KHR(@NativeType("PFN_vkBindImageMemory2KHR") long value) { nvkBindImageMemory2KHR(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetPhysicalDeviceMemoryProperties2KHR} field. */
    public VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties2KHR(@NativeType("PFN_vkGetPhysicalDeviceMemoryProperties2KHR") long value) { nvkGetPhysicalDeviceMemoryProperties2KHR(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetDeviceBufferMemoryRequirements} field. */
    public VmaVulkanFunctions vkGetDeviceBufferMemoryRequirements(@NativeType("PFN_vkGetDeviceBufferMemoryRequirements") long value) { nvkGetDeviceBufferMemoryRequirements(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetDeviceImageMemoryRequirements} field. */
    public VmaVulkanFunctions vkGetDeviceImageMemoryRequirements(@NativeType("PFN_vkGetDeviceImageMemoryRequirements") long value) { nvkGetDeviceImageMemoryRequirements(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaVulkanFunctions set(
        long vkGetInstanceProcAddr,
        long vkGetDeviceProcAddr,
        long vkGetPhysicalDeviceProperties,
        long vkGetPhysicalDeviceMemoryProperties,
        long vkAllocateMemory,
        long vkFreeMemory,
        long vkMapMemory,
        long vkUnmapMemory,
        long vkFlushMappedMemoryRanges,
        long vkInvalidateMappedMemoryRanges,
        long vkBindBufferMemory,
        long vkBindImageMemory,
        long vkGetBufferMemoryRequirements,
        long vkGetImageMemoryRequirements,
        long vkCreateBuffer,
        long vkDestroyBuffer,
        long vkCreateImage,
        long vkDestroyImage,
        long vkCmdCopyBuffer,
        long vkGetBufferMemoryRequirements2KHR,
        long vkGetImageMemoryRequirements2KHR,
        long vkBindBufferMemory2KHR,
        long vkBindImageMemory2KHR,
        long vkGetPhysicalDeviceMemoryProperties2KHR,
        long vkGetDeviceBufferMemoryRequirements,
        long vkGetDeviceImageMemoryRequirements
    ) {
        vkGetInstanceProcAddr(vkGetInstanceProcAddr);
        vkGetDeviceProcAddr(vkGetDeviceProcAddr);
        vkGetPhysicalDeviceProperties(vkGetPhysicalDeviceProperties);
        vkGetPhysicalDeviceMemoryProperties(vkGetPhysicalDeviceMemoryProperties);
        vkAllocateMemory(vkAllocateMemory);
        vkFreeMemory(vkFreeMemory);
        vkMapMemory(vkMapMemory);
        vkUnmapMemory(vkUnmapMemory);
        vkFlushMappedMemoryRanges(vkFlushMappedMemoryRanges);
        vkInvalidateMappedMemoryRanges(vkInvalidateMappedMemoryRanges);
        vkBindBufferMemory(vkBindBufferMemory);
        vkBindImageMemory(vkBindImageMemory);
        vkGetBufferMemoryRequirements(vkGetBufferMemoryRequirements);
        vkGetImageMemoryRequirements(vkGetImageMemoryRequirements);
        vkCreateBuffer(vkCreateBuffer);
        vkDestroyBuffer(vkDestroyBuffer);
        vkCreateImage(vkCreateImage);
        vkDestroyImage(vkDestroyImage);
        vkCmdCopyBuffer(vkCmdCopyBuffer);
        vkGetBufferMemoryRequirements2KHR(vkGetBufferMemoryRequirements2KHR);
        vkGetImageMemoryRequirements2KHR(vkGetImageMemoryRequirements2KHR);
        vkBindBufferMemory2KHR(vkBindBufferMemory2KHR);
        vkBindImageMemory2KHR(vkBindImageMemory2KHR);
        vkGetPhysicalDeviceMemoryProperties2KHR(vkGetPhysicalDeviceMemoryProperties2KHR);
        vkGetDeviceBufferMemoryRequirements(vkGetDeviceBufferMemoryRequirements);
        vkGetDeviceImageMemoryRequirements(vkGetDeviceImageMemoryRequirements);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VmaVulkanFunctions set(VmaVulkanFunctions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VmaVulkanFunctions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaVulkanFunctions malloc() {
        return wrap(VmaVulkanFunctions.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VmaVulkanFunctions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaVulkanFunctions calloc() {
        return wrap(VmaVulkanFunctions.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VmaVulkanFunctions} instance allocated with {@link BufferUtils}. */
    public static VmaVulkanFunctions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VmaVulkanFunctions.class, memAddress(container), container);
    }

    /** Returns a new {@code VmaVulkanFunctions} instance for the specified memory address. */
    public static VmaVulkanFunctions create(long address) {
        return wrap(VmaVulkanFunctions.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaVulkanFunctions createSafe(long address) {
        return address == NULL ? null : wrap(VmaVulkanFunctions.class, address);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaVulkanFunctions mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaVulkanFunctions callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VmaVulkanFunctions mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VmaVulkanFunctions callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */

    /**
     * Returns a new {@code VmaVulkanFunctions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVulkanFunctions malloc(MemoryStack stack) {
        return wrap(VmaVulkanFunctions.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VmaVulkanFunctions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVulkanFunctions calloc(MemoryStack stack) {
        return wrap(VmaVulkanFunctions.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #vkGetInstanceProcAddr}. */
    public static long nvkGetInstanceProcAddr(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETINSTANCEPROCADDR); }
    /** Unsafe version of {@link #vkGetDeviceProcAddr}. */
    public static long nvkGetDeviceProcAddr(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETDEVICEPROCADDR); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceProperties}. */
    public static long nvkGetPhysicalDeviceProperties(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties}. */
    public static long nvkGetPhysicalDeviceMemoryProperties(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES); }
    /** Unsafe version of {@link #vkAllocateMemory}. */
    public static long nvkAllocateMemory(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKALLOCATEMEMORY); }
    /** Unsafe version of {@link #vkFreeMemory}. */
    public static long nvkFreeMemory(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKFREEMEMORY); }
    /** Unsafe version of {@link #vkMapMemory}. */
    public static long nvkMapMemory(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKMAPMEMORY); }
    /** Unsafe version of {@link #vkUnmapMemory}. */
    public static long nvkUnmapMemory(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKUNMAPMEMORY); }
    /** Unsafe version of {@link #vkFlushMappedMemoryRanges}. */
    public static long nvkFlushMappedMemoryRanges(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKFLUSHMAPPEDMEMORYRANGES); }
    /** Unsafe version of {@link #vkInvalidateMappedMemoryRanges}. */
    public static long nvkInvalidateMappedMemoryRanges(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKINVALIDATEMAPPEDMEMORYRANGES); }
    /** Unsafe version of {@link #vkBindBufferMemory}. */
    public static long nvkBindBufferMemory(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKBINDBUFFERMEMORY); }
    /** Unsafe version of {@link #vkBindImageMemory}. */
    public static long nvkBindImageMemory(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKBINDIMAGEMEMORY); }
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements}. */
    public static long nvkGetBufferMemoryRequirements(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements}. */
    public static long nvkGetImageMemoryRequirements(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS); }
    /** Unsafe version of {@link #vkCreateBuffer}. */
    public static long nvkCreateBuffer(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKCREATEBUFFER); }
    /** Unsafe version of {@link #vkDestroyBuffer}. */
    public static long nvkDestroyBuffer(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKDESTROYBUFFER); }
    /** Unsafe version of {@link #vkCreateImage}. */
    public static long nvkCreateImage(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKCREATEIMAGE); }
    /** Unsafe version of {@link #vkDestroyImage}. */
    public static long nvkDestroyImage(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKDESTROYIMAGE); }
    /** Unsafe version of {@link #vkCmdCopyBuffer}. */
    public static long nvkCmdCopyBuffer(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKCMDCOPYBUFFER); }
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements2KHR}. */
    public static long nvkGetBufferMemoryRequirements2KHR(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements2KHR}. */
    public static long nvkGetImageMemoryRequirements2KHR(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR); }
    /** Unsafe version of {@link #vkBindBufferMemory2KHR}. */
    public static long nvkBindBufferMemory2KHR(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKBINDBUFFERMEMORY2KHR); }
    /** Unsafe version of {@link #vkBindImageMemory2KHR}. */
    public static long nvkBindImageMemory2KHR(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKBINDIMAGEMEMORY2KHR); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties2KHR}. */
    public static long nvkGetPhysicalDeviceMemoryProperties2KHR(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR); }
    /** Unsafe version of {@link #vkGetDeviceBufferMemoryRequirements}. */
    public static long nvkGetDeviceBufferMemoryRequirements(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETDEVICEBUFFERMEMORYREQUIREMENTS); }
    /** Unsafe version of {@link #vkGetDeviceImageMemoryRequirements}. */
    public static long nvkGetDeviceImageMemoryRequirements(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETDEVICEIMAGEMEMORYREQUIREMENTS); }

    /** Unsafe version of {@link #vkGetInstanceProcAddr(long) vkGetInstanceProcAddr}. */
    public static void nvkGetInstanceProcAddr(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETINSTANCEPROCADDR, value); }
    /** Unsafe version of {@link #vkGetDeviceProcAddr(long) vkGetDeviceProcAddr}. */
    public static void nvkGetDeviceProcAddr(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETDEVICEPROCADDR, value); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceProperties(long) vkGetPhysicalDeviceProperties}. */
    public static void nvkGetPhysicalDeviceProperties(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES, check(value)); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties(long) vkGetPhysicalDeviceMemoryProperties}. */
    public static void nvkGetPhysicalDeviceMemoryProperties(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES, check(value)); }
    /** Unsafe version of {@link #vkAllocateMemory(long) vkAllocateMemory}. */
    public static void nvkAllocateMemory(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKALLOCATEMEMORY, check(value)); }
    /** Unsafe version of {@link #vkFreeMemory(long) vkFreeMemory}. */
    public static void nvkFreeMemory(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKFREEMEMORY, check(value)); }
    /** Unsafe version of {@link #vkMapMemory(long) vkMapMemory}. */
    public static void nvkMapMemory(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKMAPMEMORY, check(value)); }
    /** Unsafe version of {@link #vkUnmapMemory(long) vkUnmapMemory}. */
    public static void nvkUnmapMemory(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKUNMAPMEMORY, check(value)); }
    /** Unsafe version of {@link #vkFlushMappedMemoryRanges(long) vkFlushMappedMemoryRanges}. */
    public static void nvkFlushMappedMemoryRanges(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKFLUSHMAPPEDMEMORYRANGES, check(value)); }
    /** Unsafe version of {@link #vkInvalidateMappedMemoryRanges(long) vkInvalidateMappedMemoryRanges}. */
    public static void nvkInvalidateMappedMemoryRanges(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKINVALIDATEMAPPEDMEMORYRANGES, check(value)); }
    /** Unsafe version of {@link #vkBindBufferMemory(long) vkBindBufferMemory}. */
    public static void nvkBindBufferMemory(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKBINDBUFFERMEMORY, check(value)); }
    /** Unsafe version of {@link #vkBindImageMemory(long) vkBindImageMemory}. */
    public static void nvkBindImageMemory(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKBINDIMAGEMEMORY, check(value)); }
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements(long) vkGetBufferMemoryRequirements}. */
    public static void nvkGetBufferMemoryRequirements(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS, check(value)); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements(long) vkGetImageMemoryRequirements}. */
    public static void nvkGetImageMemoryRequirements(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS, check(value)); }
    /** Unsafe version of {@link #vkCreateBuffer(long) vkCreateBuffer}. */
    public static void nvkCreateBuffer(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKCREATEBUFFER, check(value)); }
    /** Unsafe version of {@link #vkDestroyBuffer(long) vkDestroyBuffer}. */
    public static void nvkDestroyBuffer(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKDESTROYBUFFER, check(value)); }
    /** Unsafe version of {@link #vkCreateImage(long) vkCreateImage}. */
    public static void nvkCreateImage(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKCREATEIMAGE, check(value)); }
    /** Unsafe version of {@link #vkDestroyImage(long) vkDestroyImage}. */
    public static void nvkDestroyImage(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKDESTROYIMAGE, check(value)); }
    /** Unsafe version of {@link #vkCmdCopyBuffer(long) vkCmdCopyBuffer}. */
    public static void nvkCmdCopyBuffer(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKCMDCOPYBUFFER, check(value)); }
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements2KHR(long) vkGetBufferMemoryRequirements2KHR}. */
    public static void nvkGetBufferMemoryRequirements2KHR(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR, value); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements2KHR(long) vkGetImageMemoryRequirements2KHR}. */
    public static void nvkGetImageMemoryRequirements2KHR(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR, value); }
    /** Unsafe version of {@link #vkBindBufferMemory2KHR(long) vkBindBufferMemory2KHR}. */
    public static void nvkBindBufferMemory2KHR(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKBINDBUFFERMEMORY2KHR, value); }
    /** Unsafe version of {@link #vkBindImageMemory2KHR(long) vkBindImageMemory2KHR}. */
    public static void nvkBindImageMemory2KHR(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKBINDIMAGEMEMORY2KHR, value); }
    /** Unsafe version of {@link #vkGetPhysicalDeviceMemoryProperties2KHR(long) vkGetPhysicalDeviceMemoryProperties2KHR}. */
    public static void nvkGetPhysicalDeviceMemoryProperties2KHR(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR, value); }
    /** Unsafe version of {@link #vkGetDeviceBufferMemoryRequirements(long) vkGetDeviceBufferMemoryRequirements}. */
    public static void nvkGetDeviceBufferMemoryRequirements(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETDEVICEBUFFERMEMORYREQUIREMENTS, value); }
    /** Unsafe version of {@link #vkGetDeviceImageMemoryRequirements(long) vkGetDeviceImageMemoryRequirements}. */
    public static void nvkGetDeviceImageMemoryRequirements(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETDEVICEIMAGEMEMORYREQUIREMENTS, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES));
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES));
        check(memGetAddress(struct + VmaVulkanFunctions.VKALLOCATEMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKFREEMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKMAPMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKUNMAPMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKFLUSHMAPPEDMEMORYRANGES));
        check(memGetAddress(struct + VmaVulkanFunctions.VKINVALIDATEMAPPEDMEMORYRANGES));
        check(memGetAddress(struct + VmaVulkanFunctions.VKBINDBUFFERMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKBINDIMAGEMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS));
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS));
        check(memGetAddress(struct + VmaVulkanFunctions.VKCREATEBUFFER));
        check(memGetAddress(struct + VmaVulkanFunctions.VKDESTROYBUFFER));
        check(memGetAddress(struct + VmaVulkanFunctions.VKCREATEIMAGE));
        check(memGetAddress(struct + VmaVulkanFunctions.VKDESTROYIMAGE));
        check(memGetAddress(struct + VmaVulkanFunctions.VKCMDCOPYBUFFER));
    }

    /**
     * Helper method that populates this struct with required Vulkan function pointers from the specified Vulkan instance and device.
     *
     * @param instance a Vulkan instance
     * @param device   a Vulkan device
     */
    public VmaVulkanFunctions set(VkInstance instance, VkDevice device) {
        VKCapabilitiesInstance ic = instance.getCapabilities();
        VKCapabilitiesDevice   dc = device.getCapabilities();
        this
            .vkGetInstanceProcAddr(NULL)
            .vkGetDeviceProcAddr(NULL)
            .vkGetPhysicalDeviceProperties(ic.vkGetPhysicalDeviceProperties)
            .vkGetPhysicalDeviceMemoryProperties(ic.vkGetPhysicalDeviceMemoryProperties)
            .vkAllocateMemory(dc.vkAllocateMemory)
            .vkFreeMemory(dc.vkFreeMemory)
            .vkMapMemory(dc.vkMapMemory)
            .vkUnmapMemory(dc.vkUnmapMemory)
            .vkFlushMappedMemoryRanges(dc.vkFlushMappedMemoryRanges)
            .vkInvalidateMappedMemoryRanges(dc.vkInvalidateMappedMemoryRanges)
            .vkBindBufferMemory(dc.vkBindBufferMemory)
            .vkBindImageMemory(dc.vkBindImageMemory)
            .vkGetBufferMemoryRequirements(dc.vkGetBufferMemoryRequirements)
            .vkGetImageMemoryRequirements(dc.vkGetImageMemoryRequirements)
            .vkCreateBuffer(dc.vkCreateBuffer)
            .vkDestroyBuffer(dc.vkDestroyBuffer)
            .vkCreateImage(dc.vkCreateImage)
            .vkDestroyImage(dc.vkDestroyImage)
            .vkCmdCopyBuffer(dc.vkCmdCopyBuffer)
            .vkGetBufferMemoryRequirements2KHR(dc.vkGetBufferMemoryRequirements2 != NULL ? dc.vkGetBufferMemoryRequirements2 : dc.vkGetBufferMemoryRequirements2KHR)
            .vkGetImageMemoryRequirements2KHR(dc.vkGetImageMemoryRequirements2 != NULL ? dc.vkGetImageMemoryRequirements2 : dc.vkGetImageMemoryRequirements2KHR)
            .vkBindBufferMemory2KHR(dc.vkBindBufferMemory2 != NULL ? dc.vkBindBufferMemory2 : dc.vkBindBufferMemory2KHR)
            .vkBindImageMemory2KHR(dc.vkBindImageMemory2 != NULL ? dc.vkBindImageMemory2 : dc.vkBindImageMemory2KHR)
            .vkGetPhysicalDeviceMemoryProperties2KHR(ic.vkGetPhysicalDeviceMemoryProperties2 != NULL ? ic.vkGetPhysicalDeviceMemoryProperties2 : ic.vkGetPhysicalDeviceMemoryProperties2KHR)
            .vkGetDeviceBufferMemoryRequirements(dc.vkGetDeviceBufferMemoryRequirements != NULL ? dc.vkGetDeviceBufferMemoryRequirements : dc.vkGetDeviceBufferMemoryRequirementsKHR)
            .vkGetDeviceImageMemoryRequirements(dc.vkGetDeviceImageMemoryRequirements != NULL ? dc.vkGetDeviceImageMemoryRequirements : dc.vkGetDeviceImageMemoryRequirementsKHR);
        return this;
    }

}