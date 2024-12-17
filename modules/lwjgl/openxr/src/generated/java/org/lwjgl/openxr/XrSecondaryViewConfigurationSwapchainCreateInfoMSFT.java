/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSecondaryViewConfigurationSwapchainCreateInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     XrViewConfigurationType viewConfigurationType;
 * }}</pre>
 */
public class XrSecondaryViewConfigurationSwapchainCreateInfoMSFT extends Struct<XrSecondaryViewConfigurationSwapchainCreateInfoMSFT> implements NativeResource {

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

    protected XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSecondaryViewConfigurationSwapchainCreateInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(address, container);
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code viewConfigurationType} field. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT} value to the {@code type} field. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code viewConfigurationType} field. */
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
        return new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT calloc() {
        return new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT create(long address) {
        return new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSecondaryViewConfigurationSwapchainCreateInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT malloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT calloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationSwapchainCreateInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.VIEWCONFIGURATIONTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.NEXT, value); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.VIEWCONFIGURATIONTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationSwapchainCreateInfoMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationSwapchainCreateInfoMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSecondaryViewConfigurationSwapchainCreateInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nnext(address()); }
        /** @return the value of the {@code viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nviewConfigurationType(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT} value to the {@code type} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SWAPCHAIN_CREATE_INFO_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code viewConfigurationType} field. */
        public XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrSecondaryViewConfigurationSwapchainCreateInfoMSFT.nviewConfigurationType(address(), value); return this; }

    }

}