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
 * Structure describing capabilities of a surface.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code supportedSurfaceCounters} <b>must</b> not include {@link EXTDisplaySurfaceCounter#VK_SURFACE_COUNTER_VBLANK_EXT SURFACE_COUNTER_VBLANK_EXT} unless the surface queried is a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#wsi-display-surfaces">display surface</a>.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplaySurfaceCounter#VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link EXTDisplaySurfaceCounter#vkGetPhysicalDeviceSurfaceCapabilities2EXT GetPhysicalDeviceSurfaceCapabilities2EXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code supportedSurfaceCounters} &ndash; a bitmask of {@code VkSurfaceCounterFlagBitsEXT} indicating the supported surface counter types.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSurfaceCapabilities2EXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t minImageCount;
 *     uint32_t maxImageCount;
 *     {@link VkExtent2D VkExtent2D} currentExtent;
 *     {@link VkExtent2D VkExtent2D} minImageExtent;
 *     {@link VkExtent2D VkExtent2D} maxImageExtent;
 *     uint32_t maxImageArrayLayers;
 *     VkSurfaceTransformFlagsKHR supportedTransforms;
 *     VkSurfaceTransformFlagBitsKHR currentTransform;
 *     VkCompositeAlphaFlagsKHR supportedCompositeAlpha;
 *     VkImageUsageFlags supportedUsageFlags;
 *     VkSurfaceCounterFlagsEXT supportedSurfaceCounters;
 * }</code></pre>
 */
public class VkSurfaceCapabilities2EXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINIMAGECOUNT,
        MAXIMAGECOUNT,
        CURRENTEXTENT,
        MINIMAGEEXTENT,
        MAXIMAGEEXTENT,
        MAXIMAGEARRAYLAYERS,
        SUPPORTEDTRANSFORMS,
        CURRENTTRANSFORM,
        SUPPORTEDCOMPOSITEALPHA,
        SUPPORTEDUSAGEFLAGS,
        SUPPORTEDSURFACECOUNTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINIMAGECOUNT = layout.offsetof(2);
        MAXIMAGECOUNT = layout.offsetof(3);
        CURRENTEXTENT = layout.offsetof(4);
        MINIMAGEEXTENT = layout.offsetof(5);
        MAXIMAGEEXTENT = layout.offsetof(6);
        MAXIMAGEARRAYLAYERS = layout.offsetof(7);
        SUPPORTEDTRANSFORMS = layout.offsetof(8);
        CURRENTTRANSFORM = layout.offsetof(9);
        SUPPORTEDCOMPOSITEALPHA = layout.offsetof(10);
        SUPPORTEDUSAGEFLAGS = layout.offsetof(11);
        SUPPORTEDSURFACECOUNTERS = layout.offsetof(12);
    }

    /**
     * Creates a {@code VkSurfaceCapabilities2EXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSurfaceCapabilities2EXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code minImageCount} field. */
    @NativeType("uint32_t")
    public int minImageCount() { return nminImageCount(address()); }
    /** Returns the value of the {@code maxImageCount} field. */
    @NativeType("uint32_t")
    public int maxImageCount() { return nmaxImageCount(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code currentExtent} field. */
    public VkExtent2D currentExtent() { return ncurrentExtent(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code minImageExtent} field. */
    public VkExtent2D minImageExtent() { return nminImageExtent(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
    public VkExtent2D maxImageExtent() { return nmaxImageExtent(address()); }
    /** Returns the value of the {@code maxImageArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxImageArrayLayers() { return nmaxImageArrayLayers(address()); }
    /** Returns the value of the {@code supportedTransforms} field. */
    @NativeType("VkSurfaceTransformFlagsKHR")
    public int supportedTransforms() { return nsupportedTransforms(address()); }
    /** Returns the value of the {@code currentTransform} field. */
    @NativeType("VkSurfaceTransformFlagBitsKHR")
    public int currentTransform() { return ncurrentTransform(address()); }
    /** Returns the value of the {@code supportedCompositeAlpha} field. */
    @NativeType("VkCompositeAlphaFlagsKHR")
    public int supportedCompositeAlpha() { return nsupportedCompositeAlpha(address()); }
    /** Returns the value of the {@code supportedUsageFlags} field. */
    @NativeType("VkImageUsageFlags")
    public int supportedUsageFlags() { return nsupportedUsageFlags(address()); }
    /** Returns the value of the {@code supportedSurfaceCounters} field. */
    @NativeType("VkSurfaceCounterFlagsEXT")
    public int supportedSurfaceCounters() { return nsupportedSurfaceCounters(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSurfaceCapabilities2EXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSurfaceCapabilities2EXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSurfaceCapabilities2EXT set(
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
    public VkSurfaceCapabilities2EXT set(VkSurfaceCapabilities2EXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilities2EXT malloc() {
        return wrap(VkSurfaceCapabilities2EXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSurfaceCapabilities2EXT calloc() {
        return wrap(VkSurfaceCapabilities2EXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated with {@link BufferUtils}. */
    public static VkSurfaceCapabilities2EXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSurfaceCapabilities2EXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance for the specified memory address. */
    public static VkSurfaceCapabilities2EXT create(long address) {
        return wrap(VkSurfaceCapabilities2EXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilities2EXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSurfaceCapabilities2EXT.class, address);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSurfaceCapabilities2EXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSurfaceCapabilities2EXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSurfaceCapabilities2EXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSurfaceCapabilities2EXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilities2EXT mallocStack(MemoryStack stack) {
        return wrap(VkSurfaceCapabilities2EXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSurfaceCapabilities2EXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSurfaceCapabilities2EXT callocStack(MemoryStack stack) {
        return wrap(VkSurfaceCapabilities2EXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSurfaceCapabilities2EXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSurfaceCapabilities2EXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSurfaceCapabilities2EXT.PNEXT); }
    /** Unsafe version of {@link #minImageCount}. */
    public static int nminImageCount(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.MINIMAGECOUNT); }
    /** Unsafe version of {@link #maxImageCount}. */
    public static int nmaxImageCount(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.MAXIMAGECOUNT); }
    /** Unsafe version of {@link #currentExtent}. */
    public static VkExtent2D ncurrentExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilities2EXT.CURRENTEXTENT); }
    /** Unsafe version of {@link #minImageExtent}. */
    public static VkExtent2D nminImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilities2EXT.MINIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageExtent}. */
    public static VkExtent2D nmaxImageExtent(long struct) { return VkExtent2D.create(struct + VkSurfaceCapabilities2EXT.MAXIMAGEEXTENT); }
    /** Unsafe version of {@link #maxImageArrayLayers}. */
    public static int nmaxImageArrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.MAXIMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #supportedTransforms}. */
    public static int nsupportedTransforms(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDTRANSFORMS); }
    /** Unsafe version of {@link #currentTransform}. */
    public static int ncurrentTransform(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.CURRENTTRANSFORM); }
    /** Unsafe version of {@link #supportedCompositeAlpha}. */
    public static int nsupportedCompositeAlpha(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDCOMPOSITEALPHA); }
    /** Unsafe version of {@link #supportedUsageFlags}. */
    public static int nsupportedUsageFlags(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDUSAGEFLAGS); }
    /** Unsafe version of {@link #supportedSurfaceCounters}. */
    public static int nsupportedSurfaceCounters(long struct) { return UNSAFE.getInt(null, struct + VkSurfaceCapabilities2EXT.SUPPORTEDSURFACECOUNTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSurfaceCapabilities2EXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSurfaceCapabilities2EXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkSurfaceCapabilities2EXT} structs. */
    public static class Buffer extends StructBuffer<VkSurfaceCapabilities2EXT, Buffer> implements NativeResource {

        private static final VkSurfaceCapabilities2EXT ELEMENT_FACTORY = VkSurfaceCapabilities2EXT.create(-1L);

        /**
         * Creates a new {@code VkSurfaceCapabilities2EXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSurfaceCapabilities2EXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSurfaceCapabilities2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSurfaceCapabilities2EXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSurfaceCapabilities2EXT.npNext(address()); }
        /** Returns the value of the {@code minImageCount} field. */
        @NativeType("uint32_t")
        public int minImageCount() { return VkSurfaceCapabilities2EXT.nminImageCount(address()); }
        /** Returns the value of the {@code maxImageCount} field. */
        @NativeType("uint32_t")
        public int maxImageCount() { return VkSurfaceCapabilities2EXT.nmaxImageCount(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code currentExtent} field. */
        public VkExtent2D currentExtent() { return VkSurfaceCapabilities2EXT.ncurrentExtent(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code minImageExtent} field. */
        public VkExtent2D minImageExtent() { return VkSurfaceCapabilities2EXT.nminImageExtent(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code maxImageExtent} field. */
        public VkExtent2D maxImageExtent() { return VkSurfaceCapabilities2EXT.nmaxImageExtent(address()); }
        /** Returns the value of the {@code maxImageArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxImageArrayLayers() { return VkSurfaceCapabilities2EXT.nmaxImageArrayLayers(address()); }
        /** Returns the value of the {@code supportedTransforms} field. */
        @NativeType("VkSurfaceTransformFlagsKHR")
        public int supportedTransforms() { return VkSurfaceCapabilities2EXT.nsupportedTransforms(address()); }
        /** Returns the value of the {@code currentTransform} field. */
        @NativeType("VkSurfaceTransformFlagBitsKHR")
        public int currentTransform() { return VkSurfaceCapabilities2EXT.ncurrentTransform(address()); }
        /** Returns the value of the {@code supportedCompositeAlpha} field. */
        @NativeType("VkCompositeAlphaFlagsKHR")
        public int supportedCompositeAlpha() { return VkSurfaceCapabilities2EXT.nsupportedCompositeAlpha(address()); }
        /** Returns the value of the {@code supportedUsageFlags} field. */
        @NativeType("VkImageUsageFlags")
        public int supportedUsageFlags() { return VkSurfaceCapabilities2EXT.nsupportedUsageFlags(address()); }
        /** Returns the value of the {@code supportedSurfaceCounters} field. */
        @NativeType("VkSurfaceCounterFlagsEXT")
        public int supportedSurfaceCounters() { return VkSurfaceCapabilities2EXT.nsupportedSurfaceCounters(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSurfaceCapabilities2EXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSurfaceCapabilities2EXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSurfaceCapabilities2EXT.Buffer pNext(@NativeType("void *") long value) { VkSurfaceCapabilities2EXT.npNext(address(), value); return this; }

    }

}