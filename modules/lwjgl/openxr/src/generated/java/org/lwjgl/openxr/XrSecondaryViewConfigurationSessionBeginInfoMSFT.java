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
 * struct XrSecondaryViewConfigurationSessionBeginInfoMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     uint32_t viewConfigurationCount;
 *     XrViewConfigurationType const * enabledViewConfigurationTypes;
 * }}</pre>
 */
public class XrSecondaryViewConfigurationSessionBeginInfoMSFT extends Struct<XrSecondaryViewConfigurationSessionBeginInfoMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        VIEWCONFIGURATIONCOUNT,
        ENABLEDVIEWCONFIGURATIONTYPES;

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
        ENABLEDVIEWCONFIGURATIONTYPES = layout.offsetof(3);
    }

    protected XrSecondaryViewConfigurationSessionBeginInfoMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSecondaryViewConfigurationSessionBeginInfoMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(address, container);
    }

    /**
     * Creates a {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code viewConfigurationCount} field. */
    @NativeType("uint32_t")
    public int viewConfigurationCount() { return nviewConfigurationCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledViewConfigurationTypes} field. */
    @NativeType("XrViewConfigurationType const *")
    public IntBuffer enabledViewConfigurationTypes() { return nenabledViewConfigurationTypes(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT} value to the {@code type} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code enabledViewConfigurationTypes} field. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT enabledViewConfigurationTypes(@NativeType("XrViewConfigurationType const *") IntBuffer value) { nenabledViewConfigurationTypes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT set(
        int type,
        long next,
        IntBuffer enabledViewConfigurationTypes
    ) {
        type(type);
        next(next);
        enabledViewConfigurationTypes(enabledViewConfigurationTypes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSecondaryViewConfigurationSessionBeginInfoMSFT set(XrSecondaryViewConfigurationSessionBeginInfoMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT malloc() {
        return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT calloc() {
        return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated with {@link BufferUtils}. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance for the specified memory address. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT create(long address) {
        return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSecondaryViewConfigurationSessionBeginInfoMSFT createSafe(long address) {
        return address == NULL ? null : new XrSecondaryViewConfigurationSessionBeginInfoMSFT(address, null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT malloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT calloc(MemoryStack stack) {
        return new XrSecondaryViewConfigurationSessionBeginInfoMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.NEXT); }
    /** Unsafe version of {@link #viewConfigurationCount}. */
    public static int nviewConfigurationCount(long struct) { return memGetInt(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.VIEWCONFIGURATIONCOUNT); }
    /** Unsafe version of {@link #enabledViewConfigurationTypes() enabledViewConfigurationTypes}. */
    public static IntBuffer nenabledViewConfigurationTypes(long struct) { return memIntBuffer(memGetAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.ENABLEDVIEWCONFIGURATIONTYPES), nviewConfigurationCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.NEXT, value); }
    /** Sets the specified value to the {@code viewConfigurationCount} field of the specified {@code struct}. */
    public static void nviewConfigurationCount(long struct, int value) { memPutInt(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.VIEWCONFIGURATIONCOUNT, value); }
    /** Unsafe version of {@link #enabledViewConfigurationTypes(IntBuffer) enabledViewConfigurationTypes}. */
    public static void nenabledViewConfigurationTypes(long struct, IntBuffer value) { memPutAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.ENABLEDVIEWCONFIGURATIONTYPES, memAddress(value)); nviewConfigurationCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSecondaryViewConfigurationSessionBeginInfoMSFT.ENABLEDVIEWCONFIGURATIONTYPES));
    }

    // -----------------------------------

    /** An array of {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT} structs. */
    public static class Buffer extends StructBuffer<XrSecondaryViewConfigurationSessionBeginInfoMSFT, Buffer> implements NativeResource {

        private static final XrSecondaryViewConfigurationSessionBeginInfoMSFT ELEMENT_FACTORY = XrSecondaryViewConfigurationSessionBeginInfoMSFT.create(-1L);

        /**
         * Creates a new {@code XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSecondaryViewConfigurationSessionBeginInfoMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSecondaryViewConfigurationSessionBeginInfoMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.nnext(address()); }
        /** @return the value of the {@code viewConfigurationCount} field. */
        @NativeType("uint32_t")
        public int viewConfigurationCount() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.nviewConfigurationCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code enabledViewConfigurationTypes} field. */
        @NativeType("XrViewConfigurationType const *")
        public IntBuffer enabledViewConfigurationTypes() { return XrSecondaryViewConfigurationSessionBeginInfoMSFT.nenabledViewConfigurationTypes(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrSecondaryViewConfigurationSessionBeginInfoMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTSecondaryViewConfiguration#XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT} value to the {@code type} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer type$Default() { return type(MSFTSecondaryViewConfiguration.XR_TYPE_SECONDARY_VIEW_CONFIGURATION_SESSION_BEGIN_INFO_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer next(@NativeType("void const *") long value) { XrSecondaryViewConfigurationSessionBeginInfoMSFT.nnext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code enabledViewConfigurationTypes} field. */
        public XrSecondaryViewConfigurationSessionBeginInfoMSFT.Buffer enabledViewConfigurationTypes(@NativeType("XrViewConfigurationType const *") IntBuffer value) { XrSecondaryViewConfigurationSessionBeginInfoMSFT.nenabledViewConfigurationTypes(address(), value); return this; }

    }

}