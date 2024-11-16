/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing capabilities of a surface.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is enabled and {@link VkPhysicalDeviceSurfaceInfo2KHR}{@code ::surface} in the {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR} call is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, the values returned in {@code minImageCount}, {@code maxImageCount}, {@code currentExtent}, and {@code currentTransform} will not reflect that of any surface and will instead be as such:</p>
 * 
 * <ul>
 * <li>{@code minImageCount} and {@code maxImageCount} will be <code>0xFFFFFFFF</code></li>
 * <li>{@code currentExtent} will be <code>(0xFFFFFFFF, 0xFFFFFFFF)</code></li>
 * <li>{@code currentTransform} will be {@link KHRSurface#VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR SURFACE_TRANSFORM_INHERIT_BIT_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetSurfaceCapabilities2#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD}, {@link VkLatencySurfaceCapabilitiesNV}, {@link VkSharedPresentSurfaceCapabilitiesKHR}, {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT}, {@link VkSurfaceCapabilitiesPresentBarrierNV}, {@link VkSurfacePresentModeCompatibilityEXT}, {@link VkSurfacePresentScalingCapabilitiesEXT}, or {@link VkSurfaceProtectedCapabilitiesKHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSurfaceCapabilitiesKHR}, {@link KHRGetSurfaceCapabilities2#vkGetPhysicalDeviceSurfaceCapabilities2KHR GetPhysicalDeviceSurfaceCapabilities2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceCapabilities2KHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkSurfaceCapabilitiesKHR VkSurfaceCapabilitiesKHR} {@link #surfaceCapabilities};
 * }</code></pre>
 */
public class VkSurfaceCapabilities2KHR extends Struct<VkSurfaceCapabilities2KHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SURFACECAPABILITIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkSurfaceCapabilitiesKHR.SIZEOF, VkSurfaceCapabilitiesKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SURFACECAPABILITIES = layout.offsetof(2);
    }

    protected VkSurfaceCapabilities2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSurfaceCapabilities2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkSurfaceCapabilities2KHR(address, container);
    }

    /**
     * Creates a {@code VkSurfaceCapabilities2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilities2KHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkSurfaceCapabilitiesKHR} structure describing the capabilities of the specified surface. */
    public VkSurfaceCapabilitiesKHR surfaceCapabilities() { return nsurfaceCapabilities(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSurfaceCapabilities2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRGetSurfaceCapabilities2#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR} value to the {@link #sType} field. */
    public VkSurfaceCapabilities2KHR sType$Default() { return sType(KHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSurfaceCapabilities2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkDisplayNativeHdrSurfaceCapabilitiesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkLatencySurfaceCapabilitiesNV} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkLatencySurfaceCapabilitiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSharedPresentSurfaceCapabilitiesKHR} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkSharedPresentSurfaceCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkSurfaceCapabilitiesFullScreenExclusiveEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceCapabilitiesPresentBarrierNV} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkSurfaceCapabilitiesPresentBarrierNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfacePresentModeCompatibilityEXT} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkSurfacePresentModeCompatibilityEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfacePresentScalingCapabilitiesEXT} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkSurfacePresentScalingCapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSurfaceProtectedCapabilitiesKHR} value to the {@code pNext} chain. */
    public VkSurfaceCapabilities2KHR pNext(VkSurfaceProtectedCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkSurfaceCapabilities2KHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSurfaceCapabilities2KHR set(VkSurfaceCapabilities2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilities2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilities2KHR malloc() {
        return new VkSurfaceCapabilities2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilities2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilities2KHR calloc() {
        return new VkSurfaceCapabilities2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSurfaceCapabilities2KHR} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilities2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfaceCapabilities2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilities2KHR} instance for the specified memory address. */
    public static VkSurfaceCapabilities2KHR create(long address) {
        return new VkSurfaceCapabilities2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSurfaceCapabilities2KHR createSafe(long address) {
        return address == NULL ? null : new VkSurfaceCapabilities2KHR(address, null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSurfaceCapabilities2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSurfaceCapabilities2KHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkSurfaceCapabilities2KHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkSurfaceCapabilities2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilities2KHR malloc(MemoryStack stack) {
        return new VkSurfaceCapabilities2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSurfaceCapabilities2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilities2KHR calloc(MemoryStack stack) {
        return new VkSurfaceCapabilities2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSurfaceCapabilities2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceCapabilities2KHR.PNEXT); }
    /** Unsafe version of {@link #surfaceCapabilities}. */
    public static VkSurfaceCapabilitiesKHR nsurfaceCapabilities(long struct) { return VkSurfaceCapabilitiesKHR.create(struct + VkSurfaceCapabilities2KHR.SURFACECAPABILITIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSurfaceCapabilities2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceCapabilities2KHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilities2KHR} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilities2KHR, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilities2KHR ELEMENT_FACTORY = VkSurfaceCapabilities2KHR.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilities2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilities2KHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkSurfaceCapabilities2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSurfaceCapabilities2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceCapabilities2KHR.nsType(address()); }
        /** @return the value of the {@link VkSurfaceCapabilities2KHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfaceCapabilities2KHR.npNext(address()); }
        /** @return a {@link VkSurfaceCapabilitiesKHR} view of the {@link VkSurfaceCapabilities2KHR#surfaceCapabilities} field. */
        public VkSurfaceCapabilitiesKHR surfaceCapabilities() { return VkSurfaceCapabilities2KHR.nsurfaceCapabilities(address()); }

        /** Sets the specified value to the {@link VkSurfaceCapabilities2KHR#sType} field. */
        public VkSurfaceCapabilities2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceCapabilities2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRGetSurfaceCapabilities2#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR} value to the {@link VkSurfaceCapabilities2KHR#sType} field. */
        public VkSurfaceCapabilities2KHR.Buffer sType$Default() { return sType(KHRGetSurfaceCapabilities2.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_KHR); }
        /** Sets the specified value to the {@link VkSurfaceCapabilities2KHR#pNext} field. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(@NativeType("void *") long value) { VkSurfaceCapabilities2KHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDisplayNativeHdrSurfaceCapabilitiesAMD} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkDisplayNativeHdrSurfaceCapabilitiesAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkLatencySurfaceCapabilitiesNV} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkLatencySurfaceCapabilitiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSharedPresentSurfaceCapabilitiesKHR} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkSharedPresentSurfaceCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceCapabilitiesFullScreenExclusiveEXT} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkSurfaceCapabilitiesFullScreenExclusiveEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceCapabilitiesPresentBarrierNV} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkSurfaceCapabilitiesPresentBarrierNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfacePresentModeCompatibilityEXT} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkSurfacePresentModeCompatibilityEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfacePresentScalingCapabilitiesEXT} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkSurfacePresentScalingCapabilitiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSurfaceProtectedCapabilitiesKHR} value to the {@code pNext} chain. */
        public VkSurfaceCapabilities2KHR.Buffer pNext(VkSurfaceProtectedCapabilitiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}