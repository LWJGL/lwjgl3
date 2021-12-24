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
 * Structure specifying a surface and related swapchain creation parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>The members of {@link VkPhysicalDeviceSurfaceInfo2KHR} correspond to the arguments to {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}, with {@code sType} and {@code pNext} added for extensibility.</p>
 * 
 * <p>Additional capabilities of a surface <b>may</b> be available to swapchains created with different full-screen exclusive settings - particularly if exclusive full-screen access is application controlled. These additional capabilities <b>can</b> be queried by adding a {@link VkSurfaceFullScreenExclusiveInfoEXT} structure to the {@code pNext} chain of this structure when used to query surface properties. Additionally, for Win32 surfaces with application controlled exclusive full-screen access, chaining a {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} structure <b>may</b> also report additional surface capabilities. These additional capabilities only apply to swapchains created with the same parameters included in the {@code pNext} chain of {@link VkSwapchainCreateInfoKHR}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the {@code pNext} chain includes a {@link VkSurfaceFullScreenExclusiveInfoEXT} structure with its {@code fullScreenExclusive} member set to {@link EXTFullScreenExclusive#VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT}, and {@code surface} was created using {@link KHRWin32Surface#vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR}, a {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} structure <b>must</b> be included in the {@code pNext} chain</li>
 * <li>When passed as the {@code pSurfaceInfo} parameter of {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR}, if the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is enabled and the {@code pNext} chain of the {@code pSurfaceCapabilities} parameter includes {@link VkSurfaceProtectedCapabilitiesKHR}, then {@code surface} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. Otherwise, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
 * <li>When passed as the {@code pSurfaceInfo} parameter of {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceFormats2KHR GetPhysicalDeviceSurfaceFormats2KHR}, if the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is enabled, then {@code surface} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. Otherwise, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
 * <li>When passed as the {@code pSurfaceInfo} parameter of {@link EXTFullScreenExclusive#vkGetPhysicalDeviceSurfacePresentModes2EXT GetPhysicalDeviceSurfacePresentModes2EXT}, if the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is enabled, then {@code surface} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. Otherwise, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetSurfaceCapabilities2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkSurfaceFullScreenExclusiveInfoEXT} or {@link VkSurfaceFullScreenExclusiveWin32InfoEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>If {@code surface} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTFullScreenExclusive#vkGetDeviceGroupSurfacePresentModes2EXT GetDeviceGroupSurfacePresentModes2EXT}, {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR}, {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceFormats2KHR GetPhysicalDeviceSurfaceFormats2KHR}, {@link EXTFullScreenExclusive#vkGetPhysicalDeviceSurfacePresentModes2EXT GetPhysicalDeviceSurfacePresentModes2EXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSurfaceInfo2KHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSurfaceKHR {@link #surface};
 * }</code></pre>
 */
public class VkPhysicalDeviceSurfaceInfo2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SURFACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SURFACE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSurfaceInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSurfaceInfo2KHR(ByteBuffer container) {
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
    /** the surface that will be associated with the swapchain. */
    @NativeType("VkSurfaceKHR")
    public long surface() { return nsurface(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSurfaceInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGetSurfaceCapabilities2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceSurfaceInfo2KHR sType$Default() { return sType(KHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSurfaceInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkSurfaceFullScreenExclusiveInfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceSurfaceInfo2KHR pNext(VkSurfaceFullScreenExclusiveInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceSurfaceInfo2KHR pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #surface} field. */
    public VkPhysicalDeviceSurfaceInfo2KHR surface(@NativeType("VkSurfaceKHR") long value) { nsurface(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSurfaceInfo2KHR set(
        int sType,
        long pNext,
        long surface
    ) {
        sType(sType);
        pNext(pNext);
        surface(surface);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSurfaceInfo2KHR set(VkPhysicalDeviceSurfaceInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSurfaceInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSurfaceInfo2KHR malloc() {
        return wrap(VkPhysicalDeviceSurfaceInfo2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSurfaceInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSurfaceInfo2KHR calloc() {
        return wrap(VkPhysicalDeviceSurfaceInfo2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSurfaceInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSurfaceInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSurfaceInfo2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSurfaceInfo2KHR} instance for the specified memory address. */
    public static VkPhysicalDeviceSurfaceInfo2KHR create(long address) {
        return wrap(VkPhysicalDeviceSurfaceInfo2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSurfaceInfo2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSurfaceInfo2KHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSurfaceInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSurfaceInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSurfaceInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSurfaceInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSurfaceInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSurfaceInfo2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSurfaceInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSurfaceInfo2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSurfaceInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSurfaceInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSurfaceInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSurfaceInfo2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSurfaceInfo2KHR.PNEXT); }
    /** Unsafe version of {@link #surface}. */
    public static long nsurface(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceSurfaceInfo2KHR.SURFACE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSurfaceInfo2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSurfaceInfo2KHR.PNEXT, value); }
    /** Unsafe version of {@link #surface(long) surface}. */
    public static void nsurface(long struct, long value) { UNSAFE.putLong(null, struct + VkPhysicalDeviceSurfaceInfo2KHR.SURFACE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSurfaceInfo2KHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSurfaceInfo2KHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSurfaceInfo2KHR ELEMENT_FACTORY = VkPhysicalDeviceSurfaceInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSurfaceInfo2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSurfaceInfo2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSurfaceInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSurfaceInfo2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSurfaceInfo2KHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSurfaceInfo2KHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceSurfaceInfo2KHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSurfaceInfo2KHR#surface} field. */
        @NativeType("VkSurfaceKHR")
        public long surface() { return VkPhysicalDeviceSurfaceInfo2KHR.nsurface(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceSurfaceInfo2KHR#sType} field. */
        public VkPhysicalDeviceSurfaceInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSurfaceInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGetSurfaceCapabilities2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR} value to the {@link VkPhysicalDeviceSurfaceInfo2KHR#sType} field. */
        public VkPhysicalDeviceSurfaceInfo2KHR.Buffer sType$Default() { return sType(KHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SURFACE_INFO_2_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSurfaceInfo2KHR#pNext} field. */
        public VkPhysicalDeviceSurfaceInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceSurfaceInfo2KHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkSurfaceFullScreenExclusiveInfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceSurfaceInfo2KHR.Buffer pNext(VkSurfaceFullScreenExclusiveInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceFullScreenExclusiveWin32InfoEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceSurfaceInfo2KHR.Buffer pNext(VkSurfaceFullScreenExclusiveWin32InfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSurfaceInfo2KHR#surface} field. */
        public VkPhysicalDeviceSurfaceInfo2KHR.Buffer surface(@NativeType("VkSurfaceKHR") long value) { VkPhysicalDeviceSurfaceInfo2KHR.nsurface(address(), value); return this; }

    }

}