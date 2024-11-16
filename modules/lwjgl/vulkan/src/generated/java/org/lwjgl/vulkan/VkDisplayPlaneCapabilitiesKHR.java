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
 * Structure describing capabilities of a mode and plane combination.
 * 
 * <h5>Description</h5>
 * 
 * <p>The minimum and maximum position and extent fields describe the implementation limits, if any, as they apply to the specified display mode and plane. Vendors <b>may</b> support displaying a subset of a swapchain’s presentable images on the specified display plane. This is expressed by returning {@code minSrcPosition}, {@code maxSrcPosition}, {@code minSrcExtent}, and {@code maxSrcExtent} values that indicate a range of possible positions and sizes which <b>may</b> be used to specify the region within the presentable images that source pixels will be read from when creating a swapchain on the specified display mode and plane.</p>
 * 
 * <p>Vendors <b>may</b> also support mapping the presentable images’ content to a subset or superset of the visible region in the specified display mode. This is expressed by returning {@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent} and {@code maxDstExtent} values that indicate a range of possible positions and sizes which <b>may</b> be used to describe the region within the display mode that the source pixels will be mapped to.</p>
 * 
 * <p>Other vendors <b>may</b> support only a 1-1 mapping between pixels in the presentable images and the display mode. This <b>may</b> be indicated by returning <code>(0,0)</code> for {@code minSrcPosition}, {@code maxSrcPosition}, {@code minDstPosition}, and {@code maxDstPosition}, and (display mode width, display mode height) for {@code minSrcExtent}, {@code maxSrcExtent}, {@code minDstExtent}, and {@code maxDstExtent}.</p>
 * 
 * <p>The value {@code supportedAlpha} <b>must</b> contain at least one valid {@code VkDisplayPlaneAlphaFlagBitsKHR} bit.</p>
 * 
 * <p>These values indicate the limits of the implementation’s individual fields. Not all combinations of values within the offset and extent ranges returned in {@link VkDisplayPlaneCapabilitiesKHR} are guaranteed to be supported. Presentation requests specifying unsupported combinations <b>may</b> fail.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDisplayPlaneCapabilities2KHR}, {@link VkExtent2D}, {@link VkOffset2D}, {@link KHRDisplay#vkGetDisplayPlaneCapabilitiesKHR GetDisplayPlaneCapabilitiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDisplayPlaneCapabilitiesKHR {
 *     VkDisplayPlaneAlphaFlagsKHR {@link #supportedAlpha};
 *     {@link VkOffset2D VkOffset2D} {@link #minSrcPosition};
 *     {@link VkOffset2D VkOffset2D} {@link #maxSrcPosition};
 *     {@link VkExtent2D VkExtent2D} {@link #minSrcExtent};
 *     {@link VkExtent2D VkExtent2D} {@link #maxSrcExtent};
 *     {@link VkOffset2D VkOffset2D} {@link #minDstPosition};
 *     {@link VkOffset2D VkOffset2D} {@link #maxDstPosition};
 *     {@link VkExtent2D VkExtent2D} {@link #minDstExtent};
 *     {@link VkExtent2D VkExtent2D} {@link #maxDstExtent};
 * }</code></pre>
 */
public class VkDisplayPlaneCapabilitiesKHR extends Struct<VkDisplayPlaneCapabilitiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUPPORTEDALPHA,
        MINSRCPOSITION,
        MAXSRCPOSITION,
        MINSRCEXTENT,
        MAXSRCEXTENT,
        MINDSTPOSITION,
        MAXDSTPOSITION,
        MINDSTEXTENT,
        MAXDSTEXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUPPORTEDALPHA = layout.offsetof(0);
        MINSRCPOSITION = layout.offsetof(1);
        MAXSRCPOSITION = layout.offsetof(2);
        MINSRCEXTENT = layout.offsetof(3);
        MAXSRCEXTENT = layout.offsetof(4);
        MINDSTPOSITION = layout.offsetof(5);
        MAXDSTPOSITION = layout.offsetof(6);
        MINDSTEXTENT = layout.offsetof(7);
        MAXDSTEXTENT = layout.offsetof(8);
    }

    protected VkDisplayPlaneCapabilitiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDisplayPlaneCapabilitiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkDisplayPlaneCapabilitiesKHR(address, container);
    }

    /**
     * Creates a {@code VkDisplayPlaneCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDisplayPlaneCapabilitiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a bitmask of {@code VkDisplayPlaneAlphaFlagBitsKHR} describing the supported alpha blending modes. */
    @NativeType("VkDisplayPlaneAlphaFlagsKHR")
    public int supportedAlpha() { return nsupportedAlpha(address()); }
    /** the minimum source rectangle offset supported by this plane using the specified mode. */
    public VkOffset2D minSrcPosition() { return nminSrcPosition(address()); }
    /** the maximum source rectangle offset supported by this plane using the specified mode. The {@code x} and {@code y} components of {@code maxSrcPosition} <b>must</b> each be greater than or equal to the {@code x} and {@code y} components of {@code minSrcPosition}, respectively. */
    public VkOffset2D maxSrcPosition() { return nmaxSrcPosition(address()); }
    /** the minimum source rectangle size supported by this plane using the specified mode. */
    public VkExtent2D minSrcExtent() { return nminSrcExtent(address()); }
    /** the maximum source rectangle size supported by this plane using the specified mode. */
    public VkExtent2D maxSrcExtent() { return nmaxSrcExtent(address()); }
    /** {@code minDstPosition}, {@code maxDstPosition}, {@code minDstExtent}, {@code maxDstExtent} all have similar semantics to their corresponding {@code *Src*} equivalents, but apply to the output region within the mode rather than the input region within the source image. Unlike the {@code *Src*} offsets, {@code minDstPosition} and {@code maxDstPosition} <b>may</b> contain negative values. */
    public VkOffset2D minDstPosition() { return nminDstPosition(address()); }
    /** see {@code minDstPosition} */
    public VkOffset2D maxDstPosition() { return nmaxDstPosition(address()); }
    /** see {@code minDstPosition} */
    public VkExtent2D minDstExtent() { return nminDstExtent(address()); }
    /** see {@code minDstPosition} */
    public VkExtent2D maxDstExtent() { return nmaxDstExtent(address()); }

    // -----------------------------------

    /** Returns a new {@code VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneCapabilitiesKHR malloc() {
        return new VkDisplayPlaneCapabilitiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDisplayPlaneCapabilitiesKHR calloc() {
        return new VkDisplayPlaneCapabilitiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkDisplayPlaneCapabilitiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPlaneCapabilitiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkDisplayPlaneCapabilitiesKHR} instance for the specified memory address. */
    public static VkDisplayPlaneCapabilitiesKHR create(long address) {
        return new VkDisplayPlaneCapabilitiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDisplayPlaneCapabilitiesKHR createSafe(long address) {
        return address == NULL ? null : new VkDisplayPlaneCapabilitiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneCapabilitiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneCapabilitiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneCapabilitiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneCapabilitiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDisplayPlaneCapabilitiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDisplayPlaneCapabilitiesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDisplayPlaneCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneCapabilitiesKHR malloc(MemoryStack stack) {
        return new VkDisplayPlaneCapabilitiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDisplayPlaneCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDisplayPlaneCapabilitiesKHR calloc(MemoryStack stack) {
        return new VkDisplayPlaneCapabilitiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneCapabilitiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDisplayPlaneCapabilitiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #supportedAlpha}. */
    public static int nsupportedAlpha(long struct) { return memGetInt(struct + VkDisplayPlaneCapabilitiesKHR.SUPPORTEDALPHA); }
    /** Unsafe version of {@link #minSrcPosition}. */
    public static VkOffset2D nminSrcPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINSRCPOSITION); }
    /** Unsafe version of {@link #maxSrcPosition}. */
    public static VkOffset2D nmaxSrcPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCPOSITION); }
    /** Unsafe version of {@link #minSrcExtent}. */
    public static VkExtent2D nminSrcExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINSRCEXTENT); }
    /** Unsafe version of {@link #maxSrcExtent}. */
    public static VkExtent2D nmaxSrcExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCEXTENT); }
    /** Unsafe version of {@link #minDstPosition}. */
    public static VkOffset2D nminDstPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINDSTPOSITION); }
    /** Unsafe version of {@link #maxDstPosition}. */
    public static VkOffset2D nmaxDstPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTPOSITION); }
    /** Unsafe version of {@link #minDstExtent}. */
    public static VkExtent2D nminDstExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINDSTEXTENT); }
    /** Unsafe version of {@link #maxDstExtent}. */
    public static VkExtent2D nmaxDstExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTEXTENT); }

    // -----------------------------------

    /** An array of {@link VkDisplayPlaneCapabilitiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkDisplayPlaneCapabilitiesKHR, Buffer> implements NativeResource {

        private static final VkDisplayPlaneCapabilitiesKHR ELEMENT_FACTORY = VkDisplayPlaneCapabilitiesKHR.create(-1L);

        /**
         * Creates a new {@code VkDisplayPlaneCapabilitiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDisplayPlaneCapabilitiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDisplayPlaneCapabilitiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDisplayPlaneCapabilitiesKHR#supportedAlpha} field. */
        @NativeType("VkDisplayPlaneAlphaFlagsKHR")
        public int supportedAlpha() { return VkDisplayPlaneCapabilitiesKHR.nsupportedAlpha(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#minSrcPosition} field. */
        public VkOffset2D minSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.nminSrcPosition(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#maxSrcPosition} field. */
        public VkOffset2D maxSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.nmaxSrcPosition(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#minSrcExtent} field. */
        public VkExtent2D minSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.nminSrcExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#maxSrcExtent} field. */
        public VkExtent2D maxSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.nmaxSrcExtent(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#minDstPosition} field. */
        public VkOffset2D minDstPosition() { return VkDisplayPlaneCapabilitiesKHR.nminDstPosition(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#maxDstPosition} field. */
        public VkOffset2D maxDstPosition() { return VkDisplayPlaneCapabilitiesKHR.nmaxDstPosition(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#minDstExtent} field. */
        public VkExtent2D minDstExtent() { return VkDisplayPlaneCapabilitiesKHR.nminDstExtent(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkDisplayPlaneCapabilitiesKHR#maxDstExtent} field. */
        public VkExtent2D maxDstExtent() { return VkDisplayPlaneCapabilitiesKHR.nmaxDstExtent(address()); }

    }

}