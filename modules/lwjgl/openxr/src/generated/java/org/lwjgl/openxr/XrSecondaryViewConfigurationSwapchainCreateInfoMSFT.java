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
 * Hint to runtime that the created swapchain image will be used for given secondary view configuration.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present in the {@link XrSwapchainCreateInfo} next chain when calling {@link XR10#xrCreateSwapchain CreateSwapchain}, the runtime <b>should</b> optimize the created swapchain for the primary view configuration of the session.</p>
 * 
 * <p>If the application submits a swapchain image created with one view configuration type to a composition layer for another view configuration, the runtime <b>may</b> need to copy the resource across view configurations. However, the runtime <b>must</b> correctly compose the image regardless which view configuration type was hinted when swapchain image was created.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MSFTSecondaryViewConfiguration XR_MSFT_secondary_view_configuration} extension <b>must</b> be enabled prior to using {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT}</li>
 * <li>{@code type} <b>must</b> be {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code viewConfigurationType} <b>must</b> be a valid {@code XrViewConfigurationType} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSwapchainCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSecondaryViewConfigurationSwapchainCreateInfoMSFT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrViewConfigurationType {@link #viewConfigurationType};
 * }</code></pre>
 */
public class XrSecondaryViewConfigurationSwapchainCreateInfoMSFT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONTYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the secondary view configuration type the application is intending to use this swapchain for. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT} value to the {@link #type} field. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #viewConfigurationType} field. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nviewConfigurationType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT set(
        int type,
        long next,
        int viewConfigurationType
    ) {
        type(type);
        next(next);
        viewConfigurationType(viewConfigurationType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT set(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT malloc() {
        return wrap(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT calloc() {
        return wrap(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT create(long address) {
        return wrap(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : wrap(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.class, address);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT malloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT calloc(MemoryStack stack) {
        return wrap(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return UNSAFE.getInt(null, struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.VIEWCONFIGURATIONTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { UNSAFE.putInt(null, struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.VIEWCONFIGURATIONTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationSwapchainCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationSwapchainCreateInfoMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#SIZEOF}, and its mark will be undefined.
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
        protected XrSecondaryViewConfigurationSwapchainCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#next} field. */
        @NativeType("void const *")
        public long next() { return XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nviewConfigurationType(address()); }

        /** Sets the specified value to the {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#type} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT} value to the {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#type} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT); }
        /** Sets the specified value to the {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#next} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#viewConfigurationType} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nviewConfigurationType(address(), value); return this; }

    }

}