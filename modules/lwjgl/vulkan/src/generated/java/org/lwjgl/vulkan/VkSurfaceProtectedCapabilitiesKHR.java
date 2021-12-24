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
 * Structure describing capability of a surface to be protected.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is enabled, the value returned in {@code supportsProtected} will be identical for every valid surface created on this physical device, and so in the {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} call, {@link VkPhysicalDeviceSurfaceInfo2KHR}{@code ::surface} <b>can</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}. In that case, the contents of {@link VkSurfaceCapabilities2KHR}{@code ::surfaceCapabilities} as well as any other struct chained to it will be undefined.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSurfaceProtectedCapabilities#VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceProtectedCapabilitiesKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #supportsProtected};
 * }</code></pre>
 */
public class VkSurfaceProtectedCapabilitiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTSPROTECTED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUPPORTSPROTECTED = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSurfaceProtectedCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceProtectedCapabilitiesKHR(ByteBuffer container) {
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
    /** specifies whether a protected swapchain created from {@link VkPhysicalDeviceSurfaceInfo2KHR}{@code ::surface} for a particular windowing system <b>can</b> be displayed on screen or not. If {@code supportsProtected} is {@link VK10#VK_TRUE TRUE}, then creation of swapchains with the {@link KHRSwapchain#VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR SWAPCHAIN_CREATE_PROTECTED_BIT_KHR} flag set <b>must</b> be supported for {@code surface}. */
    @NativeType("VkBool32")
    public boolean supportsProtected() { return nsupportsProtected(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfaceProtectedCapabilitiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSurfaceProtectedCapabilities#VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR} value to the {@link #sType} field. */
    public VkSurfaceProtectedCapabilitiesKHR sType$Default() { return sType(KHRSurfaceProtectedCapabilities.VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfaceProtectedCapabilitiesKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #supportsProtected} field. */
    public VkSurfaceProtectedCapabilitiesKHR supportsProtected(@NativeType("VkBool32") boolean value) { nsupportsProtected(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceProtectedCapabilitiesKHR set(
        int sType,
        long pNext,
        boolean supportsProtected
    ) {
        sType(sType);
        pNext(pNext);
        supportsProtected(supportsProtected);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfaceProtectedCapabilitiesKHR set(VkSurfaceProtectedCapabilitiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceProtectedCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceProtectedCapabilitiesKHR malloc() {
        return wrap(VkSurfaceProtectedCapabilitiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceProtectedCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceProtectedCapabilitiesKHR calloc() {
        return wrap(VkSurfaceProtectedCapabilitiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceProtectedCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceProtectedCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceProtectedCapabilitiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceProtectedCapabilitiesKHR} instance for the specified memory address. */
    public static VkSurfaceProtectedCapabilitiesKHR create(long address) {
        return wrap(VkSurfaceProtectedCapabilitiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceProtectedCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceProtectedCapabilitiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceProtectedCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceProtectedCapabilitiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceProtectedCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceProtectedCapabilitiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceProtectedCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceProtectedCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceProtectedCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceProtectedCapabilitiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceProtectedCapabilitiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceProtectedCapabilitiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSurfaceProtectedCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceProtectedCapabilitiesKHR malloc(MemoryStack stack) {
        return wrap(VkSurfaceProtectedCapabilitiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceProtectedCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceProtectedCapabilitiesKHR calloc(MemoryStack stack) {
        return wrap(VkSurfaceProtectedCapabilitiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceProtectedCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceProtectedCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceProtectedCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceProtectedCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceProtectedCapabilitiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceProtectedCapabilitiesKHR.PNEXT); }
    /** Unsafe version of {@link #supportsProtected}. */
    public static int nsupportsProtected(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceProtectedCapabilitiesKHR.SUPPORTSPROTECTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceProtectedCapabilitiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceProtectedCapabilitiesKHR.PNEXT, value); }
    /** Unsafe version of {@link #supportsProtected(boolean) supportsProtected}. */
    public static void nsupportsProtected(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceProtectedCapabilitiesKHR.SUPPORTSPROTECTED, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceProtectedCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceProtectedCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkSurfaceProtectedCapabilitiesKHR ELEMENT_FACTORY = VkSurfaceProtectedCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkSurfaceProtectedCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceProtectedCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceProtectedCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfaceProtectedCapabilitiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceProtectedCapabilitiesKHR.nsType(address()); }
        /** @return the value of the {@link VkSurfaceProtectedCapabilitiesKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSurfaceProtectedCapabilitiesKHR.npNext(address()); }
        /** @return the value of the {@link VkSurfaceProtectedCapabilitiesKHR#supportsProtected} field. */
        @NativeType("VkBool32")
        public boolean supportsProtected() { return VkSurfaceProtectedCapabilitiesKHR.nsupportsProtected(address()) != 0; }

        /** Sets the specified value to the {@link VkSurfaceProtectedCapabilitiesKHR#sType} field. */
        public VkSurfaceProtectedCapabilitiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceProtectedCapabilitiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSurfaceProtectedCapabilities#VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR} value to the {@link VkSurfaceProtectedCapabilitiesKHR#sType} field. */
        public VkSurfaceProtectedCapabilitiesKHR.Buffer sType$Default() { return sType(KHRSurfaceProtectedCapabilities.VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR); }
        /** Sets the specified value to the {@link VkSurfaceProtectedCapabilitiesKHR#pNext} field. */
        public VkSurfaceProtectedCapabilitiesKHR.Buffer pNext(@NativeType("void const *") long value) { VkSurfaceProtectedCapabilitiesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSurfaceProtectedCapabilitiesKHR#supportsProtected} field. */
        public VkSurfaceProtectedCapabilitiesKHR.Buffer supportsProtected(@NativeType("VkBool32") boolean value) { VkSurfaceProtectedCapabilitiesKHR.nsupportsProtected(address(), value ? 1 : 0); return this; }

    }

}