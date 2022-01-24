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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Individual view configuration.
 * 
 * <h5>Description</h5>
 * 
 * <p>See {@link XrSwapchainSubImage} for more information about {@code imageRect} values, and {@link XrSwapchainCreateInfo} for more information about creating swapchains appropriately sized to support those {@code imageRect} values.</p>
 * 
 * <p>The array of {@link XrViewConfigurationView} returned by the runtime <b>must</b> adhere to the rules defined in <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#view_configuration_type">{@code XrViewConfigurationType}</a>, such as the count and association to the left and right eyes.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_VIEW_CONFIGURATION_VIEW TYPE_VIEW_CONFIGURATION_VIEW}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrFoveatedViewConfigurationViewVARJO}, {@link XrViewConfigurationDepthRangeEXT}, {@link XrViewConfigurationViewFovEPIC}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrViewConfigurationProperties}, {@link XR10#xrEnumerateViewConfigurationViews EnumerateViewConfigurationViews}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrViewConfigurationView {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     uint32_t {@link #recommendedImageRectWidth};
 *     uint32_t {@link #maxImageRectWidth};
 *     uint32_t {@link #recommendedImageRectHeight};
 *     uint32_t {@link #maxImageRectHeight};
 *     uint32_t {@link #recommendedSwapchainSampleCount};
 *     uint32_t {@link #maxSwapchainSampleCount};
 * }</code></pre>
 */
public class XrViewConfigurationView extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RECOMMENDEDIMAGERECTWIDTH,
        MAXIMAGERECTWIDTH,
        RECOMMENDEDIMAGERECTHEIGHT,
        MAXIMAGERECTHEIGHT,
        RECOMMENDEDSWAPCHAINSAMPLECOUNT,
        MAXSWAPCHAINSAMPLECOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RECOMMENDEDIMAGERECTWIDTH = layout.offsetof(2);
        MAXIMAGERECTWIDTH = layout.offsetof(3);
        RECOMMENDEDIMAGERECTHEIGHT = layout.offsetof(4);
        MAXIMAGERECTHEIGHT = layout.offsetof(5);
        RECOMMENDEDSWAPCHAINSAMPLECOUNT = layout.offsetof(6);
        MAXSWAPCHAINSAMPLECOUNT = layout.offsetof(7);
    }

    /**
     * Creates a {@code XrViewConfigurationView} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrViewConfigurationView(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** the optimal width of {@code imageRect} to use when rendering this view into a swapchain. */
    @NativeType("uint32_t")
    public int recommendedImageRectWidth() { return nrecommendedImageRectWidth(address()); }
    /** the maximum width of {@code imageRect} supported when rendering this view into a swapchain. */
    @NativeType("uint32_t")
    public int maxImageRectWidth() { return nmaxImageRectWidth(address()); }
    /** the optimal height of {@code imageRect} to use when rendering this view into a swapchain. */
    @NativeType("uint32_t")
    public int recommendedImageRectHeight() { return nrecommendedImageRectHeight(address()); }
    /** the maximum height of {@code imageRect} supported when rendering this view into a swapchain. */
    @NativeType("uint32_t")
    public int maxImageRectHeight() { return nmaxImageRectHeight(address()); }
    /** the recommended number of sub-data element samples to create for each swapchain image that will be rendered into for this view. */
    @NativeType("uint32_t")
    public int recommendedSwapchainSampleCount() { return nrecommendedSwapchainSampleCount(address()); }
    /** the maximum number of sub-data element samples supported for swapchain images that will be rendered into for this view. */
    @NativeType("uint32_t")
    public int maxSwapchainSampleCount() { return nmaxSwapchainSampleCount(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrViewConfigurationView type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_VIEW_CONFIGURATION_VIEW TYPE_VIEW_CONFIGURATION_VIEW} value to the {@link #type} field. */
    public XrViewConfigurationView type$Default() { return type(XR10.XR_TYPE_VIEW_CONFIGURATION_VIEW); }
    /** Sets the specified value to the {@link #next} field. */
    public XrViewConfigurationView next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrFoveatedViewConfigurationViewVARJO} value to the {@code next} chain. */
    public XrViewConfigurationView next(XrFoveatedViewConfigurationViewVARJO value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrViewConfigurationDepthRangeEXT} value to the {@code next} chain. */
    public XrViewConfigurationView next(XrViewConfigurationDepthRangeEXT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrViewConfigurationViewFovEPIC} value to the {@code next} chain. */
    public XrViewConfigurationView next(XrViewConfigurationViewFovEPIC value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #recommendedImageRectWidth} field. */
    public XrViewConfigurationView recommendedImageRectWidth(@NativeType("uint32_t") int value) { nrecommendedImageRectWidth(address(), value); return this; }
    /** Sets the specified value to the {@link #maxImageRectWidth} field. */
    public XrViewConfigurationView maxImageRectWidth(@NativeType("uint32_t") int value) { nmaxImageRectWidth(address(), value); return this; }
    /** Sets the specified value to the {@link #recommendedImageRectHeight} field. */
    public XrViewConfigurationView recommendedImageRectHeight(@NativeType("uint32_t") int value) { nrecommendedImageRectHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #maxImageRectHeight} field. */
    public XrViewConfigurationView maxImageRectHeight(@NativeType("uint32_t") int value) { nmaxImageRectHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #recommendedSwapchainSampleCount} field. */
    public XrViewConfigurationView recommendedSwapchainSampleCount(@NativeType("uint32_t") int value) { nrecommendedSwapchainSampleCount(address(), value); return this; }
    /** Sets the specified value to the {@link #maxSwapchainSampleCount} field. */
    public XrViewConfigurationView maxSwapchainSampleCount(@NativeType("uint32_t") int value) { nmaxSwapchainSampleCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrViewConfigurationView set(
        int type,
        long next,
        int recommendedImageRectWidth,
        int maxImageRectWidth,
        int recommendedImageRectHeight,
        int maxImageRectHeight,
        int recommendedSwapchainSampleCount,
        int maxSwapchainSampleCount
    ) {
        type(type);
        next(next);
        recommendedImageRectWidth(recommendedImageRectWidth);
        maxImageRectWidth(maxImageRectWidth);
        recommendedImageRectHeight(recommendedImageRectHeight);
        maxImageRectHeight(maxImageRectHeight);
        recommendedSwapchainSampleCount(recommendedSwapchainSampleCount);
        maxSwapchainSampleCount(maxSwapchainSampleCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrViewConfigurationView set(XrViewConfigurationView src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrViewConfigurationView} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationView malloc() {
        return wrap(XrViewConfigurationView.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrViewConfigurationView} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrViewConfigurationView calloc() {
        return wrap(XrViewConfigurationView.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrViewConfigurationView} instance allocated with {@link BufferUtils}. */
    public static XrViewConfigurationView create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrViewConfigurationView.class, memAddress(container), container);
    }

    /** Returns a new {@code XrViewConfigurationView} instance for the specified memory address. */
    public static XrViewConfigurationView create(long address) {
        return wrap(XrViewConfigurationView.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewConfigurationView createSafe(long address) {
        return address == NULL ? null : wrap(XrViewConfigurationView.class, address);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrViewConfigurationView.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrViewConfigurationView.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrViewConfigurationView} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationView malloc(MemoryStack stack) {
        return wrap(XrViewConfigurationView.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrViewConfigurationView} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrViewConfigurationView calloc(MemoryStack stack) {
        return wrap(XrViewConfigurationView.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrViewConfigurationView.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrViewConfigurationView.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationView.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrViewConfigurationView.NEXT); }
    /** Unsafe version of {@link #recommendedImageRectWidth}. */
    public static int nrecommendedImageRectWidth(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTWIDTH); }
    /** Unsafe version of {@link #maxImageRectWidth}. */
    public static int nmaxImageRectWidth(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationView.MAXIMAGERECTWIDTH); }
    /** Unsafe version of {@link #recommendedImageRectHeight}. */
    public static int nrecommendedImageRectHeight(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTHEIGHT); }
    /** Unsafe version of {@link #maxImageRectHeight}. */
    public static int nmaxImageRectHeight(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationView.MAXIMAGERECTHEIGHT); }
    /** Unsafe version of {@link #recommendedSwapchainSampleCount}. */
    public static int nrecommendedSwapchainSampleCount(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationView.RECOMMENDEDSWAPCHAINSAMPLECOUNT); }
    /** Unsafe version of {@link #maxSwapchainSampleCount}. */
    public static int nmaxSwapchainSampleCount(long struct) { return UNSAFE.getInt(null, struct + XrViewConfigurationView.MAXSWAPCHAINSAMPLECOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationView.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrViewConfigurationView.NEXT, value); }
    /** Unsafe version of {@link #recommendedImageRectWidth(int) recommendedImageRectWidth}. */
    public static void nrecommendedImageRectWidth(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTWIDTH, value); }
    /** Unsafe version of {@link #maxImageRectWidth(int) maxImageRectWidth}. */
    public static void nmaxImageRectWidth(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationView.MAXIMAGERECTWIDTH, value); }
    /** Unsafe version of {@link #recommendedImageRectHeight(int) recommendedImageRectHeight}. */
    public static void nrecommendedImageRectHeight(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationView.RECOMMENDEDIMAGERECTHEIGHT, value); }
    /** Unsafe version of {@link #maxImageRectHeight(int) maxImageRectHeight}. */
    public static void nmaxImageRectHeight(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationView.MAXIMAGERECTHEIGHT, value); }
    /** Unsafe version of {@link #recommendedSwapchainSampleCount(int) recommendedSwapchainSampleCount}. */
    public static void nrecommendedSwapchainSampleCount(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationView.RECOMMENDEDSWAPCHAINSAMPLECOUNT, value); }
    /** Unsafe version of {@link #maxSwapchainSampleCount(int) maxSwapchainSampleCount}. */
    public static void nmaxSwapchainSampleCount(long struct, int value) { UNSAFE.putInt(null, struct + XrViewConfigurationView.MAXSWAPCHAINSAMPLECOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrViewConfigurationView} structs. */
    public static class Buffer extends StructBuffer<XrViewConfigurationView, Buffer> implements NativeResource {

        private static final XrViewConfigurationView ELEMENT_FACTORY = XrViewConfigurationView.create(-1L);

        /**
         * Creates a new {@code XrViewConfigurationView.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrViewConfigurationView#SIZEOF}, and its mark will be undefined.
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
        protected XrViewConfigurationView getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrViewConfigurationView#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrViewConfigurationView.ntype(address()); }
        /** @return the value of the {@link XrViewConfigurationView#next} field. */
        @NativeType("void *")
        public long next() { return XrViewConfigurationView.nnext(address()); }
        /** @return the value of the {@link XrViewConfigurationView#recommendedImageRectWidth} field. */
        @NativeType("uint32_t")
        public int recommendedImageRectWidth() { return XrViewConfigurationView.nrecommendedImageRectWidth(address()); }
        /** @return the value of the {@link XrViewConfigurationView#maxImageRectWidth} field. */
        @NativeType("uint32_t")
        public int maxImageRectWidth() { return XrViewConfigurationView.nmaxImageRectWidth(address()); }
        /** @return the value of the {@link XrViewConfigurationView#recommendedImageRectHeight} field. */
        @NativeType("uint32_t")
        public int recommendedImageRectHeight() { return XrViewConfigurationView.nrecommendedImageRectHeight(address()); }
        /** @return the value of the {@link XrViewConfigurationView#maxImageRectHeight} field. */
        @NativeType("uint32_t")
        public int maxImageRectHeight() { return XrViewConfigurationView.nmaxImageRectHeight(address()); }
        /** @return the value of the {@link XrViewConfigurationView#recommendedSwapchainSampleCount} field. */
        @NativeType("uint32_t")
        public int recommendedSwapchainSampleCount() { return XrViewConfigurationView.nrecommendedSwapchainSampleCount(address()); }
        /** @return the value of the {@link XrViewConfigurationView#maxSwapchainSampleCount} field. */
        @NativeType("uint32_t")
        public int maxSwapchainSampleCount() { return XrViewConfigurationView.nmaxSwapchainSampleCount(address()); }

        /** Sets the specified value to the {@link XrViewConfigurationView#type} field. */
        public XrViewConfigurationView.Buffer type(@NativeType("XrStructureType") int value) { XrViewConfigurationView.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_VIEW_CONFIGURATION_VIEW TYPE_VIEW_CONFIGURATION_VIEW} value to the {@link XrViewConfigurationView#type} field. */
        public XrViewConfigurationView.Buffer type$Default() { return type(XR10.XR_TYPE_VIEW_CONFIGURATION_VIEW); }
        /** Sets the specified value to the {@link XrViewConfigurationView#next} field. */
        public XrViewConfigurationView.Buffer next(@NativeType("void *") long value) { XrViewConfigurationView.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrFoveatedViewConfigurationViewVARJO} value to the {@code next} chain. */
        public XrViewConfigurationView.Buffer next(XrFoveatedViewConfigurationViewVARJO value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrViewConfigurationDepthRangeEXT} value to the {@code next} chain. */
        public XrViewConfigurationView.Buffer next(XrViewConfigurationDepthRangeEXT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrViewConfigurationViewFovEPIC} value to the {@code next} chain. */
        public XrViewConfigurationView.Buffer next(XrViewConfigurationViewFovEPIC value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrViewConfigurationView#recommendedImageRectWidth} field. */
        public XrViewConfigurationView.Buffer recommendedImageRectWidth(@NativeType("uint32_t") int value) { XrViewConfigurationView.nrecommendedImageRectWidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewConfigurationView#maxImageRectWidth} field. */
        public XrViewConfigurationView.Buffer maxImageRectWidth(@NativeType("uint32_t") int value) { XrViewConfigurationView.nmaxImageRectWidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewConfigurationView#recommendedImageRectHeight} field. */
        public XrViewConfigurationView.Buffer recommendedImageRectHeight(@NativeType("uint32_t") int value) { XrViewConfigurationView.nrecommendedImageRectHeight(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewConfigurationView#maxImageRectHeight} field. */
        public XrViewConfigurationView.Buffer maxImageRectHeight(@NativeType("uint32_t") int value) { XrViewConfigurationView.nmaxImageRectHeight(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewConfigurationView#recommendedSwapchainSampleCount} field. */
        public XrViewConfigurationView.Buffer recommendedSwapchainSampleCount(@NativeType("uint32_t") int value) { XrViewConfigurationView.nrecommendedSwapchainSampleCount(address(), value); return this; }
        /** Sets the specified value to the {@link XrViewConfigurationView#maxSwapchainSampleCount} field. */
        public XrViewConfigurationView.Buffer maxSwapchainSampleCount(@NativeType("uint32_t") int value) { XrViewConfigurationView.nmaxSwapchainSampleCount(address(), value); return this; }

    }

}