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
 * <code><pre>
 * struct VmaVulkanFunctions {
 *     PFN_vkGetPhysicalDeviceProperties vkGetPhysicalDeviceProperties;
 *     PFN_vkGetPhysicalDeviceMemoryProperties vkGetPhysicalDeviceMemoryProperties;
 *     PFN_vkAllocateMemory vkAllocateMemory;
 *     PFN_vkFreeMemory vkFreeMemory;
 *     PFN_vkMapMemory vkMapMemory;
 *     PFN_vkUnmapMemory vkUnmapMemory;
 *     PFN_vkBindBufferMemory vkBindBufferMemory;
 *     PFN_vkBindImageMemory vkBindImageMemory;
 *     PFN_vkGetBufferMemoryRequirements vkGetBufferMemoryRequirements;
 *     PFN_vkGetImageMemoryRequirements vkGetImageMemoryRequirements;
 *     PFN_vkCreateBuffer vkCreateBuffer;
 *     PFN_vkDestroyBuffer vkDestroyBuffer;
 *     PFN_vkCreateImage vkCreateImage;
 *     PFN_vkDestroyImage vkDestroyImage;
 *     PFN_vkGetBufferMemoryRequirements2KHR vkGetBufferMemoryRequirements2KHR;
 *     PFN_vkGetImageMemoryRequirements2KHR vkGetImageMemoryRequirements2KHR;
 * }</pre></code>
 */
public class VmaVulkanFunctions extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VKGETPHYSICALDEVICEPROPERTIES,
        VKGETPHYSICALDEVICEMEMORYPROPERTIES,
        VKALLOCATEMEMORY,
        VKFREEMEMORY,
        VKMAPMEMORY,
        VKUNMAPMEMORY,
        VKBINDBUFFERMEMORY,
        VKBINDIMAGEMEMORY,
        VKGETBUFFERMEMORYREQUIREMENTS,
        VKGETIMAGEMEMORYREQUIREMENTS,
        VKCREATEBUFFER,
        VKDESTROYBUFFER,
        VKCREATEIMAGE,
        VKDESTROYIMAGE,
        VKGETBUFFERMEMORYREQUIREMENTS2KHR,
        VKGETIMAGEMEMORYREQUIREMENTS2KHR;

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
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VKGETPHYSICALDEVICEPROPERTIES = layout.offsetof(0);
        VKGETPHYSICALDEVICEMEMORYPROPERTIES = layout.offsetof(1);
        VKALLOCATEMEMORY = layout.offsetof(2);
        VKFREEMEMORY = layout.offsetof(3);
        VKMAPMEMORY = layout.offsetof(4);
        VKUNMAPMEMORY = layout.offsetof(5);
        VKBINDBUFFERMEMORY = layout.offsetof(6);
        VKBINDIMAGEMEMORY = layout.offsetof(7);
        VKGETBUFFERMEMORYREQUIREMENTS = layout.offsetof(8);
        VKGETIMAGEMEMORYREQUIREMENTS = layout.offsetof(9);
        VKCREATEBUFFER = layout.offsetof(10);
        VKDESTROYBUFFER = layout.offsetof(11);
        VKCREATEIMAGE = layout.offsetof(12);
        VKDESTROYIMAGE = layout.offsetof(13);
        VKGETBUFFERMEMORYREQUIREMENTS2KHR = layout.offsetof(14);
        VKGETIMAGEMEMORYREQUIREMENTS2KHR = layout.offsetof(15);
    }

    VmaVulkanFunctions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VmaVulkanFunctions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VmaVulkanFunctions(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code vkGetPhysicalDeviceProperties} field. */
    @NativeType("PFN_vkGetPhysicalDeviceProperties")
    public long vkGetPhysicalDeviceProperties() { return nvkGetPhysicalDeviceProperties(address()); }
    /** Returns the value of the {@code vkGetPhysicalDeviceMemoryProperties} field. */
    @NativeType("PFN_vkGetPhysicalDeviceMemoryProperties")
    public long vkGetPhysicalDeviceMemoryProperties() { return nvkGetPhysicalDeviceMemoryProperties(address()); }
    /** Returns the value of the {@code vkAllocateMemory} field. */
    @NativeType("PFN_vkAllocateMemory")
    public long vkAllocateMemory() { return nvkAllocateMemory(address()); }
    /** Returns the value of the {@code vkFreeMemory} field. */
    @NativeType("PFN_vkFreeMemory")
    public long vkFreeMemory() { return nvkFreeMemory(address()); }
    /** Returns the value of the {@code vkMapMemory} field. */
    @NativeType("PFN_vkMapMemory")
    public long vkMapMemory() { return nvkMapMemory(address()); }
    /** Returns the value of the {@code vkUnmapMemory} field. */
    @NativeType("PFN_vkUnmapMemory")
    public long vkUnmapMemory() { return nvkUnmapMemory(address()); }
    /** Returns the value of the {@code vkBindBufferMemory} field. */
    @NativeType("PFN_vkBindBufferMemory")
    public long vkBindBufferMemory() { return nvkBindBufferMemory(address()); }
    /** Returns the value of the {@code vkBindImageMemory} field. */
    @NativeType("PFN_vkBindImageMemory")
    public long vkBindImageMemory() { return nvkBindImageMemory(address()); }
    /** Returns the value of the {@code vkGetBufferMemoryRequirements} field. */
    @NativeType("PFN_vkGetBufferMemoryRequirements")
    public long vkGetBufferMemoryRequirements() { return nvkGetBufferMemoryRequirements(address()); }
    /** Returns the value of the {@code vkGetImageMemoryRequirements} field. */
    @NativeType("PFN_vkGetImageMemoryRequirements")
    public long vkGetImageMemoryRequirements() { return nvkGetImageMemoryRequirements(address()); }
    /** Returns the value of the {@code vkCreateBuffer} field. */
    @NativeType("PFN_vkCreateBuffer")
    public long vkCreateBuffer() { return nvkCreateBuffer(address()); }
    /** Returns the value of the {@code vkDestroyBuffer} field. */
    @NativeType("PFN_vkDestroyBuffer")
    public long vkDestroyBuffer() { return nvkDestroyBuffer(address()); }
    /** Returns the value of the {@code vkCreateImage} field. */
    @NativeType("PFN_vkCreateImage")
    public long vkCreateImage() { return nvkCreateImage(address()); }
    /** Returns the value of the {@code vkDestroyImage} field. */
    @NativeType("PFN_vkDestroyImage")
    public long vkDestroyImage() { return nvkDestroyImage(address()); }
    /** Returns the value of the {@code vkGetBufferMemoryRequirements2KHR} field. */
    @NativeType("PFN_vkGetBufferMemoryRequirements2KHR")
    public long vkGetBufferMemoryRequirements2KHR() { return nvkGetBufferMemoryRequirements2KHR(address()); }
    /** Returns the value of the {@code vkGetImageMemoryRequirements2KHR} field. */
    @NativeType("PFN_vkGetImageMemoryRequirements2KHR")
    public long vkGetImageMemoryRequirements2KHR() { return nvkGetImageMemoryRequirements2KHR(address()); }

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
    /** Sets the specified value to the {@code vkGetBufferMemoryRequirements2KHR} field. */
    public VmaVulkanFunctions vkGetBufferMemoryRequirements2KHR(@NativeType("PFN_vkGetBufferMemoryRequirements2KHR") long value) { nvkGetBufferMemoryRequirements2KHR(address(), value); return this; }
    /** Sets the specified value to the {@code vkGetImageMemoryRequirements2KHR} field. */
    public VmaVulkanFunctions vkGetImageMemoryRequirements2KHR(@NativeType("PFN_vkGetImageMemoryRequirements2KHR") long value) { nvkGetImageMemoryRequirements2KHR(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VmaVulkanFunctions set(
        long vkGetPhysicalDeviceProperties,
        long vkGetPhysicalDeviceMemoryProperties,
        long vkAllocateMemory,
        long vkFreeMemory,
        long vkMapMemory,
        long vkUnmapMemory,
        long vkBindBufferMemory,
        long vkBindImageMemory,
        long vkGetBufferMemoryRequirements,
        long vkGetImageMemoryRequirements,
        long vkCreateBuffer,
        long vkDestroyBuffer,
        long vkCreateImage,
        long vkDestroyImage,
        long vkGetBufferMemoryRequirements2KHR,
        long vkGetImageMemoryRequirements2KHR
    ) {
        vkGetPhysicalDeviceProperties(vkGetPhysicalDeviceProperties);
        vkGetPhysicalDeviceMemoryProperties(vkGetPhysicalDeviceMemoryProperties);
        vkAllocateMemory(vkAllocateMemory);
        vkFreeMemory(vkFreeMemory);
        vkMapMemory(vkMapMemory);
        vkUnmapMemory(vkUnmapMemory);
        vkBindBufferMemory(vkBindBufferMemory);
        vkBindImageMemory(vkBindImageMemory);
        vkGetBufferMemoryRequirements(vkGetBufferMemoryRequirements);
        vkGetImageMemoryRequirements(vkGetImageMemoryRequirements);
        vkCreateBuffer(vkCreateBuffer);
        vkDestroyBuffer(vkDestroyBuffer);
        vkCreateImage(vkCreateImage);
        vkDestroyImage(vkDestroyImage);
        vkGetBufferMemoryRequirements2KHR(vkGetBufferMemoryRequirements2KHR);
        vkGetImageMemoryRequirements2KHR(vkGetImageMemoryRequirements2KHR);

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

    /** Returns a new {@link VmaVulkanFunctions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VmaVulkanFunctions malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VmaVulkanFunctions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VmaVulkanFunctions calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VmaVulkanFunctions} instance allocated with {@link BufferUtils}. */
    public static VmaVulkanFunctions create() {
        return new VmaVulkanFunctions(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VmaVulkanFunctions} instance for the specified memory address. */
    public static VmaVulkanFunctions create(long address) {
        return new VmaVulkanFunctions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VmaVulkanFunctions createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    // -----------------------------------

    /** Returns a new {@link VmaVulkanFunctions} instance allocated on the thread-local {@link MemoryStack}. */
    public static VmaVulkanFunctions mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VmaVulkanFunctions} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VmaVulkanFunctions callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VmaVulkanFunctions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVulkanFunctions mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VmaVulkanFunctions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VmaVulkanFunctions callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

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
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements2KHR}. */
    public static long nvkGetBufferMemoryRequirements2KHR(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements2KHR}. */
    public static long nvkGetImageMemoryRequirements2KHR(long struct) { return memGetAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR); }

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
    /** Unsafe version of {@link #vkGetBufferMemoryRequirements2KHR(long) vkGetBufferMemoryRequirements2KHR}. */
    public static void nvkGetBufferMemoryRequirements2KHR(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR, check(value)); }
    /** Unsafe version of {@link #vkGetImageMemoryRequirements2KHR(long) vkGetImageMemoryRequirements2KHR}. */
    public static void nvkGetImageMemoryRequirements2KHR(long struct, long value) { memPutAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR, check(value)); }

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
        check(memGetAddress(struct + VmaVulkanFunctions.VKBINDBUFFERMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKBINDIMAGEMEMORY));
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS));
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS));
        check(memGetAddress(struct + VmaVulkanFunctions.VKCREATEBUFFER));
        check(memGetAddress(struct + VmaVulkanFunctions.VKDESTROYBUFFER));
        check(memGetAddress(struct + VmaVulkanFunctions.VKCREATEIMAGE));
        check(memGetAddress(struct + VmaVulkanFunctions.VKDESTROYIMAGE));
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR));
        check(memGetAddress(struct + VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    /**
     * Helper method that populates this struct with required Vulkan function pointers from the specified Vulkan instance and device.
     *
     * @param instance         a Vulkan instance
     * @param device           a Vulkan device
     */
    public void set(VkInstance instance, VkDevice device) {
        VKCapabilitiesInstance ic = instance.getCapabilities();
        VKCapabilitiesDevice   dc = device.getCapabilities();
        this
            .vkGetPhysicalDeviceProperties(ic.vkGetPhysicalDeviceProperties)
            .vkGetPhysicalDeviceMemoryProperties(ic.vkGetPhysicalDeviceMemoryProperties)
            .vkAllocateMemory(dc.vkAllocateMemory)
            .vkFreeMemory(dc.vkFreeMemory)
            .vkMapMemory(dc.vkMapMemory)
            .vkUnmapMemory(dc.vkUnmapMemory)
            .vkBindBufferMemory(dc.vkBindBufferMemory)
            .vkBindImageMemory(dc.vkBindImageMemory)
            .vkGetBufferMemoryRequirements(dc.vkGetBufferMemoryRequirements)
            .vkGetImageMemoryRequirements(dc.vkGetImageMemoryRequirements)
            .vkCreateBuffer(dc.vkCreateBuffer)
            .vkDestroyBuffer(dc.vkDestroyBuffer)
            .vkCreateImage(dc.vkCreateImage)
            .vkDestroyImage(dc.vkDestroyImage)
            .vkGetBufferMemoryRequirements2KHR(dc.vkGetBufferMemoryRequirements2KHR)
            .vkGetImageMemoryRequirements2KHR(dc.vkGetImageMemoryRequirements2KHR);
    }

}