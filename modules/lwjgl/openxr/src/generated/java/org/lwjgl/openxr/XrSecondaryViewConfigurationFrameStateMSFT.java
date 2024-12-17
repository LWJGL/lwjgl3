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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSecondaryViewConfigurationFrameStateMSFT {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t viewConfigurationCount;
 *     {@link XrSecondaryViewConfigurationStateMSFT XrSecondaryViewConfigurationStateMSFT} * viewConfigurationStates;
 * }}</pre>
 */
public class XrSecondaryViewConfigurationFrameStateMSFT extends Struct<XrSecondaryViewConfigurationFrameStateMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONCOUNT,
        VIEWCONFIGURATIONSTATES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        VIEWCONFIGURATIONCOUNT = layout.offsetof(2);
        VIEWCONFIGURATIONSTATES = layout.offsetof(3);
    }

    protected XrSecondaryViewConfigurationFrameStateMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSecondaryViewConfigurationFrameStateMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSecondaryViewConfigurationFrameStateMSFT(address, container);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationFrameStateMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationFrameStateMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code viewConfigurationCount} field. */
    @NativeType("uint32_t")
    public int viewConfigurationCount() { return nviewConfigurationCount(address()); }
    /** @return a {@link XrSecondaryViewConfigurationStateMSFT.Buffer} view of the struct array pointed to by the {@code viewConfigurationStates} field. */
    @NativeType("XrSecondaryViewConfigurationStateMSFT *")
    public XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationStates() { return nviewConfigurationStates(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSecondaryViewConfigurationFrameStateMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT} value to the {@code type} field. */
    public XrSecondaryViewConfigurationFrameStateMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSecondaryViewConfigurationFrameStateMSFT next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link XrSecondaryViewConfigurationStateMSFT.Buffer} to the {@code viewConfigurationStates} field. */
    public XrSecondaryViewConfigurationFrameStateMSFT viewConfigurationStates(@NativeType("XrSecondaryViewConfigurationStateMSFT *") XrSecondaryViewConfigurationStateMSFT.Buffer value) { nviewConfigurationStates(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationFrameStateMSFT set(
        int type,
        long next,
        XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationStates
    ) {
        type(type);
        next(next);
        viewConfigurationStates(viewConfigurationStates);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationFrameStateMSFT set(XrSecondaryViewConfigurationFrameStateMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationFrameStateMSFT malloc() {
        return new XrSecondaryViewConfigurationFrameStateMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationFrameStateMSFT calloc() {
        return new XrSecondaryViewConfigurationFrameStateMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationFrameStateMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSecondaryViewConfigurationFrameStateMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationFrameStateMSFT create(long address) {
        return new XrSecondaryViewConfigurationFrameStateMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSecondaryViewConfigurationFrameStateMSFT createSafe(long address) {
        return address == NULL ? null : new XrSecondaryViewConfigurationFrameStateMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSecondaryViewConfigurationFrameStateMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT malloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationFrameStateMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationFrameStateMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT calloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationFrameStateMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationFrameStateMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationFrameStateMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationCount}. */
    public static int nviewConfigurationCount(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONCOUNT); }
    /** Unsafe version of {@link #viewConfigurationStates}. */
    public static XrSecondaryViewConfigurationStateMSFT.Buffer nviewConfigurationStates(long struct) { return XrSecondaryViewConfigurationStateMSFT.create(memGetAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONSTATES), nviewConfigurationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationFrameStateMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.NEXT, value); }
    /** Sets the specified value to the {@code viewConfigurationCount} field of the specified {@code struct}. */
    public static void nviewConfigurationCount(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONCOUNT, value); }
    /** Unsafe version of {@link #viewConfigurationStates(XrSecondaryViewConfigurationStateMSFT.Buffer) viewConfigurationStates}. */
    public static void nviewConfigurationStates(long struct, XrSecondaryViewConfigurationStateMSFT.Buffer value) { memPutAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONSTATES, value.address()); nviewConfigurationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSecondaryViewConfigurationFrameStateMSFT.VIEWCONFIGURATIONSTATES));
    }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationFrameStateMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationFrameStateMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationFrameStateMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationFrameStateMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationFrameStateMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationFrameStateMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSecondaryViewConfigurationFrameStateMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationFrameStateMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSecondaryViewConfigurationFrameStateMSFT.nnext(address()); }
        /** @return the value of the {@code viewConfigurationCount} field. */
        @NativeType("uint32_t")
        public int viewConfigurationCount() { return XrSecondaryViewConfigurationFrameStateMSFT.nviewConfigurationCount(address()); }
        /** @return a {@link XrSecondaryViewConfigurationStateMSFT.Buffer} view of the struct array pointed to by the {@code viewConfigurationStates} field. */
        @NativeType("XrSecondaryViewConfigurationStateMSFT *")
        public XrSecondaryViewConfigurationStateMSFT.Buffer viewConfigurationStates() { return XrSecondaryViewConfigurationFrameStateMSFT.nviewConfigurationStates(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSecondaryViewConfigurationFrameStateMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationFrameStateMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT} value to the {@code type} field. */
        public XrSecondaryViewConfigurationFrameStateMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_FRAME_STATE_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSecondaryViewConfigurationFrameStateMSFT.Buffer next(@NativeType("void *") long value) { XrSecondaryViewConfigurationFrameStateMSFT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link XrSecondaryViewConfigurationStateMSFT.Buffer} to the {@code viewConfigurationStates} field. */
        public XrSecondaryViewConfigurationFrameStateMSFT.Buffer viewConfigurationStates(@NativeType("XrSecondaryViewConfigurationStateMSFT *") XrSecondaryViewConfigurationStateMSFT.Buffer value) { XrSecondaryViewConfigurationFrameStateMSFT.nviewConfigurationStates(address(), value); return this; }

    }

}