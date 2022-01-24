/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * Vulkan Device Create Info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link KHRVulkanEnable2 XR_KHR_vulkan_enable2} extension <b>must</b> be enabled prior to using {@link XrVulkanDeviceCreateInfoKHR}</li>
 * <li>{@code type} <b>must</b> be {@link KHRVulkanEnable2#XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR TYPE_VULKAN_DEVICE_CREATE_INFO_KHR}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code createFlags} <b>must</b> be 0</li>
 * <li>{@code pfnGetInstanceProcAddr} <b>must</b> be a valid {@code PFN_vkGetInstanceProcAddr} value</li>
 * <li>{@code vulkanPhysicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} value</li>
 * <li>{@code vulkanCreateInfo} <b>must</b> be a pointer to a valid {@code VkDeviceCreateInfo} value</li>
 * <li>If {@code vulkanAllocator} is not {@code NULL}, {@code vulkanAllocator} <b>must</b> be a pointer to a valid {@code VkAllocationCallbacks} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVulkanEnable2#xrCreateVulkanDeviceKHR CreateVulkanDeviceKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrVulkanDeviceCreateInfoKHR {
 *     XrStructureType type;
 *     void const * next;
 *     XrSystemId {@link #systemId};
 *     XrVulkanDeviceCreateFlagsKHR createFlags;
 *     PFN_vkGetInstanceProcAddr {@link #pfnGetInstanceProcAddr};
 *     VkPhysicalDevice {@link #vulkanPhysicalDevice};
 *     {@link VkDeviceCreateInfo VkDeviceCreateInfo} const * {@link #vulkanCreateInfo};
 *     {@link VkAllocationCallbacks VkAllocationCallbacks} const * {@link #vulkanAllocator};
 * }</code></pre>
 */
public class XrVulkanDeviceCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SYSTEMID,
        CREATEFLAGS,
        PFNGETINSTANCEPROCADDR,
        VULKANPHYSICALDEVICE,
        VULKANCREATEINFO,
        VULKANALLOCATOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SYSTEMID = layout.offsetof(2);
        CREATEFLAGS = layout.offsetof(3);
        PFNGETINSTANCEPROCADDR = layout.offsetof(4);
        VULKANPHYSICALDEVICE = layout.offsetof(5);
        VULKANCREATEINFO = layout.offsetof(6);
        VULKANALLOCATOR = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrVulkanDeviceCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrVulkanDeviceCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrSystemId} handle for the system which will be used to create a session. */
    @NativeType("XrSystemId")
    public long systemId() { return nsystemId(address()); }
    /** @return the value of the {@code createFlags} field. */
    @NativeType("XrVulkanDeviceCreateFlagsKHR")
    public long createFlags() { return ncreateFlags(address()); }
    /** a function pointer to {@code vkGetInstanceProcAddr} or a compatible entry point. */
    @NativeType("PFN_vkGetInstanceProcAddr")
    public long pfnGetInstanceProcAddr() { return npfnGetInstanceProcAddr(address()); }
    /** <b>must</b> match {@link KHRVulkanEnable#xrGetVulkanGraphicsDeviceKHR GetVulkanGraphicsDeviceKHR}. */
    @NativeType("VkPhysicalDevice")
    public long vulkanPhysicalDevice() { return nvulkanPhysicalDevice(address()); }
    /** the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkDeviceCreateInfo.html">{@code VkDeviceCreateInfo} as specified by Vulkan</a>. */
    @NativeType("VkDeviceCreateInfo const *")
    public VkDeviceCreateInfo vulkanCreateInfo() { return nvulkanCreateInfo(address()); }
    /** the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/man/html/VkAllocationCallbacks.html">{@code VkAllocationCallbacks} as specified by Vulkan</a>. */
    @Nullable
    @NativeType("VkAllocationCallbacks const *")
    public VkAllocationCallbacks vulkanAllocator() { return nvulkanAllocator(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrVulkanDeviceCreateInfoKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanEnable2#XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR TYPE_VULKAN_DEVICE_CREATE_INFO_KHR} value to the {@code type} field. */
    public XrVulkanDeviceCreateInfoKHR type$Default() { return type(KHRVulkanEnable2.XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrVulkanDeviceCreateInfoKHR next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #systemId} field. */
    public XrVulkanDeviceCreateInfoKHR systemId(@NativeType("XrSystemId") long value) { nsystemId(address(), value); return this; }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrVulkanDeviceCreateInfoKHR createFlags(@NativeType("XrVulkanDeviceCreateFlagsKHR") long value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnGetInstanceProcAddr} field. */
    public XrVulkanDeviceCreateInfoKHR pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) { npfnGetInstanceProcAddr(address(), value); return this; }
    /** Sets the specified value to the {@link #vulkanPhysicalDevice} field. */
    public XrVulkanDeviceCreateInfoKHR vulkanPhysicalDevice(VkPhysicalDevice value) { nvulkanPhysicalDevice(address(), value); return this; }
    /** Sets the address of the specified {@link VkDeviceCreateInfo} to the {@link #vulkanCreateInfo} field. */
    public XrVulkanDeviceCreateInfoKHR vulkanCreateInfo(@NativeType("VkDeviceCreateInfo const *") VkDeviceCreateInfo value) { nvulkanCreateInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@link #vulkanAllocator} field. */
    public XrVulkanDeviceCreateInfoKHR vulkanAllocator(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { nvulkanAllocator(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrVulkanDeviceCreateInfoKHR set(
        int type,
        long next,
        long systemId,
        long createFlags,
        long pfnGetInstanceProcAddr,
        VkPhysicalDevice vulkanPhysicalDevice,
        VkDeviceCreateInfo vulkanCreateInfo,
        @Nullable VkAllocationCallbacks vulkanAllocator
    ) {
        type(type);
        next(next);
        systemId(systemId);
        createFlags(createFlags);
        pfnGetInstanceProcAddr(pfnGetInstanceProcAddr);
        vulkanPhysicalDevice(vulkanPhysicalDevice);
        vulkanCreateInfo(vulkanCreateInfo);
        vulkanAllocator(vulkanAllocator);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrVulkanDeviceCreateInfoKHR set(XrVulkanDeviceCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrVulkanDeviceCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrVulkanDeviceCreateInfoKHR malloc() {
        return wrap(XrVulkanDeviceCreateInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrVulkanDeviceCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrVulkanDeviceCreateInfoKHR calloc() {
        return wrap(XrVulkanDeviceCreateInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrVulkanDeviceCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static XrVulkanDeviceCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrVulkanDeviceCreateInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code XrVulkanDeviceCreateInfoKHR} instance for the specified memory address. */
    public static XrVulkanDeviceCreateInfoKHR create(long address) {
        return wrap(XrVulkanDeviceCreateInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanDeviceCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(XrVulkanDeviceCreateInfoKHR.class, address);
    }

    /**
     * Returns a new {@link XrVulkanDeviceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanDeviceCreateInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrVulkanDeviceCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanDeviceCreateInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanDeviceCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrVulkanDeviceCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrVulkanDeviceCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrVulkanDeviceCreateInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrVulkanDeviceCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrVulkanDeviceCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanDeviceCreateInfoKHR malloc(MemoryStack stack) {
        return wrap(XrVulkanDeviceCreateInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrVulkanDeviceCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrVulkanDeviceCreateInfoKHR calloc(MemoryStack stack) {
        return wrap(XrVulkanDeviceCreateInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrVulkanDeviceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanDeviceCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrVulkanDeviceCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrVulkanDeviceCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrVulkanDeviceCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.NEXT); }
    /** Unsafe version of {@link #systemId}. */
    public static long nsystemId(long struct) { return UNSAFE.getLong(null, struct + XrVulkanDeviceCreateInfoKHR.SYSTEMID); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrVulkanDeviceCreateInfoKHR.CREATEFLAGS); }
    /** Unsafe version of {@link #pfnGetInstanceProcAddr}. */
    public static long npfnGetInstanceProcAddr(long struct) { return memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.PFNGETINSTANCEPROCADDR); }
    /** Unsafe version of {@link #vulkanPhysicalDevice}. */
    public static long nvulkanPhysicalDevice(long struct) { return memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANPHYSICALDEVICE); }
    /** Unsafe version of {@link #vulkanCreateInfo}. */
    public static VkDeviceCreateInfo nvulkanCreateInfo(long struct) { return VkDeviceCreateInfo.create(memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANCREATEINFO)); }
    /** Unsafe version of {@link #vulkanAllocator}. */
    @Nullable public static VkAllocationCallbacks nvulkanAllocator(long struct) { return VkAllocationCallbacks.createSafe(memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANALLOCATOR)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrVulkanDeviceCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrVulkanDeviceCreateInfoKHR.NEXT, value); }
    /** Unsafe version of {@link #systemId(long) systemId}. */
    public static void nsystemId(long struct, long value) { UNSAFE.putLong(null, struct + XrVulkanDeviceCreateInfoKHR.SYSTEMID, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrVulkanDeviceCreateInfoKHR.CREATEFLAGS, value); }
    /** Unsafe version of {@link #pfnGetInstanceProcAddr(long) pfnGetInstanceProcAddr}. */
    public static void npfnGetInstanceProcAddr(long struct, long value) { memPutAddress(struct + XrVulkanDeviceCreateInfoKHR.PFNGETINSTANCEPROCADDR, check(value)); }
    /** Unsafe version of {@link #vulkanPhysicalDevice(VkPhysicalDevice) vulkanPhysicalDevice}. */
    public static void nvulkanPhysicalDevice(long struct, VkPhysicalDevice value) { memPutAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANPHYSICALDEVICE, value.address()); }
    /** Unsafe version of {@link #vulkanCreateInfo(VkDeviceCreateInfo) vulkanCreateInfo}. */
    public static void nvulkanCreateInfo(long struct, VkDeviceCreateInfo value) { memPutAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANCREATEINFO, value.address()); }
    /** Unsafe version of {@link #vulkanAllocator(VkAllocationCallbacks) vulkanAllocator}. */
    public static void nvulkanAllocator(long struct, @Nullable VkAllocationCallbacks value) { memPutAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANALLOCATOR, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.PFNGETINSTANCEPROCADDR));
        check(memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANPHYSICALDEVICE));
        long vulkanCreateInfo = memGetAddress(struct + XrVulkanDeviceCreateInfoKHR.VULKANCREATEINFO);
        check(vulkanCreateInfo);
        VkDeviceCreateInfo.validate(vulkanCreateInfo);
    }

    // -----------------------------------

    /** An array of {@link XrVulkanDeviceCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<XrVulkanDeviceCreateInfoKHR, Buffer> implements NativeResource {

        private static final XrVulkanDeviceCreateInfoKHR ELEMENT_FACTORY = XrVulkanDeviceCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code XrVulkanDeviceCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrVulkanDeviceCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected XrVulkanDeviceCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrVulkanDeviceCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrVulkanDeviceCreateInfoKHR.nnext(address()); }
        /** @return the value of the {@link XrVulkanDeviceCreateInfoKHR#systemId} field. */
        @NativeType("XrSystemId")
        public long systemId() { return XrVulkanDeviceCreateInfoKHR.nsystemId(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("XrVulkanDeviceCreateFlagsKHR")
        public long createFlags() { return XrVulkanDeviceCreateInfoKHR.ncreateFlags(address()); }
        /** @return the value of the {@link XrVulkanDeviceCreateInfoKHR#pfnGetInstanceProcAddr} field. */
        @NativeType("PFN_vkGetInstanceProcAddr")
        public long pfnGetInstanceProcAddr() { return XrVulkanDeviceCreateInfoKHR.npfnGetInstanceProcAddr(address()); }
        /** @return the value of the {@link XrVulkanDeviceCreateInfoKHR#vulkanPhysicalDevice} field. */
        @NativeType("VkPhysicalDevice")
        public long vulkanPhysicalDevice() { return XrVulkanDeviceCreateInfoKHR.nvulkanPhysicalDevice(address()); }
        /** @return a {@link VkDeviceCreateInfo} view of the struct pointed to by the {@link XrVulkanDeviceCreateInfoKHR#vulkanCreateInfo} field. */
        @NativeType("VkDeviceCreateInfo const *")
        public VkDeviceCreateInfo vulkanCreateInfo() { return XrVulkanDeviceCreateInfoKHR.nvulkanCreateInfo(address()); }
        /** @return a {@link VkAllocationCallbacks} view of the struct pointed to by the {@link XrVulkanDeviceCreateInfoKHR#vulkanAllocator} field. */
        @Nullable
        @NativeType("VkAllocationCallbacks const *")
        public VkAllocationCallbacks vulkanAllocator() { return XrVulkanDeviceCreateInfoKHR.nvulkanAllocator(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer type(@NativeType("XrStructureType") int value) { XrVulkanDeviceCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanEnable2#XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR TYPE_VULKAN_DEVICE_CREATE_INFO_KHR} value to the {@code type} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer type$Default() { return type(KHRVulkanEnable2.XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer next(@NativeType("void const *") long value) { XrVulkanDeviceCreateInfoKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrVulkanDeviceCreateInfoKHR#systemId} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer systemId(@NativeType("XrSystemId") long value) { XrVulkanDeviceCreateInfoKHR.nsystemId(address(), value); return this; }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer createFlags(@NativeType("XrVulkanDeviceCreateFlagsKHR") long value) { XrVulkanDeviceCreateInfoKHR.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrVulkanDeviceCreateInfoKHR#pfnGetInstanceProcAddr} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer pfnGetInstanceProcAddr(@NativeType("PFN_vkGetInstanceProcAddr") long value) { XrVulkanDeviceCreateInfoKHR.npfnGetInstanceProcAddr(address(), value); return this; }
        /** Sets the specified value to the {@link XrVulkanDeviceCreateInfoKHR#vulkanPhysicalDevice} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer vulkanPhysicalDevice(VkPhysicalDevice value) { XrVulkanDeviceCreateInfoKHR.nvulkanPhysicalDevice(address(), value); return this; }
        /** Sets the address of the specified {@link VkDeviceCreateInfo} to the {@link XrVulkanDeviceCreateInfoKHR#vulkanCreateInfo} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer vulkanCreateInfo(@NativeType("VkDeviceCreateInfo const *") VkDeviceCreateInfo value) { XrVulkanDeviceCreateInfoKHR.nvulkanCreateInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkAllocationCallbacks} to the {@link XrVulkanDeviceCreateInfoKHR#vulkanAllocator} field. */
        public XrVulkanDeviceCreateInfoKHR.Buffer vulkanAllocator(@Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks value) { XrVulkanDeviceCreateInfoKHR.nvulkanAllocator(address(), value); return this; }

    }

}