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
 * struct XrSecondaryViewConfigurationStateMSFT {
 *     XrStructureType type;
 *     void * next;
 *     XrViewConfigurationType viewConfigurationType;
 *     XrBool32 active;
 * }}</pre>
 */
public class XrSecondaryViewConfigurationStateMSFT extends Struct<XrSecondaryViewConfigurationStateMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONTYPE,
        ACTIVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONTYPE = layout.offsetof(2);
        ACTIVE = layout.offsetof(3);
    }

    protected XrSecondaryViewConfigurationStateMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSecondaryViewConfigurationStateMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSecondaryViewConfigurationStateMSFT(address, container);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationStateMSFT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code viewConfigurationType} field. */
    @NativeType("XrViewConfigurationType")
    public int viewConfigurationType() { return nviewConfigurationType(address()); }
    /** @return the value of the {@code active} field. */
    @NativeType("XrBool32")
    public boolean active() { return nactive(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrSecondaryViewConfigurationStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT} value to the {@code type} field. */
    public XrSecondaryViewConfigurationStateMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSecondaryViewConfigurationStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code viewConfigurationType} field. */
    public XrSecondaryViewConfigurationStateMSFT viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { nviewConfigurationType(address(), value); return this; }
    /** Sets the specified value to the {@code active} field. */
    public XrSecondaryViewConfigurationStateMSFT active(@NativeType("XrBool32") boolean value) { nactive(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationStateMSFT set(
        int type,
        long next,
        int viewConfigurationType,
        boolean active
    ) {
        type(type);
        next(next);
        viewConfigurationType(viewConfigurationType);
        active(active);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationStateMSFT set(XrSecondaryViewConfigurationStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationStateMSFT malloc() {
        return new XrSecondaryViewConfigurationStateMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationStateMSFT calloc() {
        return new XrSecondaryViewConfigurationStateMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSecondaryViewConfigurationStateMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationStateMSFT create(long address) {
        return new XrSecondaryViewConfigurationStateMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSecondaryViewConfigurationStateMSFT createSafe(long address) {
        return address == NULL ? null : new XrSecondaryViewConfigurationStateMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSecondaryViewConfigurationStateMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationStateMSFT malloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationStateMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationStateMSFT calloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationStateMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationStateMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationType}. */
    public static int nviewConfigurationType(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationStateMSFT.VIEWCONFIGURATIONTYPE); }
    /** Unsafe version of {@link #active}. */
    public static int nactive(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationStateMSFT.ACTIVE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationStateMSFT.NEXT, value); }
    /** Unsafe version of {@link #viewConfigurationType(int) viewConfigurationType}. */
    public static void nviewConfigurationType(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationStateMSFT.VIEWCONFIGURATIONTYPE, value); }
    /** Unsafe version of {@link #active(boolean) active}. */
    public static void nactive(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationStateMSFT.ACTIVE, value); }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationStateMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationStateMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationStateMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationStateMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSecondaryViewConfigurationStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationStateMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSecondaryViewConfigurationStateMSFT.nnext(address()); }
        /** @return the value of the {@code viewConfigurationType} field. */
        @NativeType("XrViewConfigurationType")
        public int viewConfigurationType() { return XrSecondaryViewConfigurationStateMSFT.nviewConfigurationType(address()); }
        /** @return the value of the {@code active} field. */
        @NativeType("XrBool32")
        public boolean active() { return XrSecondaryViewConfigurationStateMSFT.nactive(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationStateMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT} value to the {@code type} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_STATE_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer next(@NativeType("void *") long value) { XrSecondaryViewConfigurationStateMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code viewConfigurationType} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationType(@NativeType("XrViewConfigurationType") int value) { XrSecondaryViewConfigurationStateMSFT.nviewConfigurationType(address(), value); return this; }
        /** Sets the specified value to the {@code active} field. */
        public XrSecondaryViewConfigurationStateMSFT.Buffer active(@NativeType("XrBool32") boolean value) { XrSecondaryViewConfigurationStateMSFT.nactive(address(), value ? 1 : 0); return this; }

    }

}