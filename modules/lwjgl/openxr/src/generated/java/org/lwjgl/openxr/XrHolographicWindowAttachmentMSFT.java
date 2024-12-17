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
 * struct XrHolographicWindowAttachmentMSFT {
 *     XrStructureType type;
 *     void const * next;
 *     IUnknown * holographicSpace;
 *     IUnknown * coreWindow;
 * }}</pre>
 */
public class XrHolographicWindowAttachmentMSFT extends Struct<XrHolographicWindowAttachmentMSFT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        HOLOGRAPHICSPACE,
        COREWINDOW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        HOLOGRAPHICSPACE = layout.offsetof(2);
        COREWINDOW = layout.offsetof(3);
    }

    protected XrHolographicWindowAttachmentMSFT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrHolographicWindowAttachmentMSFT create(long address, @Nullable ByteBuffer container) {
        return new XrHolographicWindowAttachmentMSFT(address, container);
    }

    /**
     * Creates a {@code XrHolographicWindowAttachmentMSFT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHolographicWindowAttachmentMSFT(ByteBuffer container) {
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
    /** @return the value of the {@code holographicSpace} field. */
    @NativeType("IUnknown *")
    public long holographicSpace() { return nholographicSpace(address()); }
    /** @return the value of the {@code coreWindow} field. */
    @NativeType("IUnknown *")
    public long coreWindow() { return ncoreWindow(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHolographicWindowAttachmentMSFT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MSFTHolographicWindowAttachment#XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT} value to the {@code type} field. */
    public XrHolographicWindowAttachmentMSFT type$Default() { return type(MSFTHolographicWindowAttachment.XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT); }
    /** Sets the specified value to the {@code next} field. */
    public XrHolographicWindowAttachmentMSFT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code holographicSpace} field. */
    public XrHolographicWindowAttachmentMSFT holographicSpace(@NativeType("IUnknown *") long value) { nholographicSpace(address(), value); return this; }
    /** Sets the specified value to the {@code coreWindow} field. */
    public XrHolographicWindowAttachmentMSFT coreWindow(@NativeType("IUnknown *") long value) { ncoreWindow(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHolographicWindowAttachmentMSFT set(
        int type,
        long next,
        long holographicSpace,
        long coreWindow
    ) {
        type(type);
        next(next);
        holographicSpace(holographicSpace);
        coreWindow(coreWindow);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHolographicWindowAttachmentMSFT set(XrHolographicWindowAttachmentMSFT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHolographicWindowAttachmentMSFT malloc() {
        return new XrHolographicWindowAttachmentMSFT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHolographicWindowAttachmentMSFT calloc() {
        return new XrHolographicWindowAttachmentMSFT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated with {@link BufferUtils}. */
    public static XrHolographicWindowAttachmentMSFT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrHolographicWindowAttachmentMSFT(memAddress(container), container);
    }

    /** Returns a new {@code XrHolographicWindowAttachmentMSFT} instance for the specified memory address. */
    public static XrHolographicWindowAttachmentMSFT create(long address) {
        return new XrHolographicWindowAttachmentMSFT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrHolographicWindowAttachmentMSFT createSafe(long address) {
        return address == NULL ? null : new XrHolographicWindowAttachmentMSFT(address, null);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrHolographicWindowAttachmentMSFT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrHolographicWindowAttachmentMSFT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHolographicWindowAttachmentMSFT malloc(MemoryStack stack) {
        return new XrHolographicWindowAttachmentMSFT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrHolographicWindowAttachmentMSFT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHolographicWindowAttachmentMSFT calloc(MemoryStack stack) {
        return new XrHolographicWindowAttachmentMSFT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHolographicWindowAttachmentMSFT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHolographicWindowAttachmentMSFT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrHolographicWindowAttachmentMSFT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHolographicWindowAttachmentMSFT.NEXT); }
    /** Unsafe version of {@link #holographicSpace}. */
    public static long nholographicSpace(long struct) { return memGetAddress(struct + XrHolographicWindowAttachmentMSFT.HOLOGRAPHICSPACE); }
    /** Unsafe version of {@link #coreWindow}. */
    public static long ncoreWindow(long struct) { return memGetAddress(struct + XrHolographicWindowAttachmentMSFT.COREWINDOW); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrHolographicWindowAttachmentMSFT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHolographicWindowAttachmentMSFT.NEXT, value); }
    /** Unsafe version of {@link #holographicSpace(long) holographicSpace}. */
    public static void nholographicSpace(long struct, long value) { memPutAddress(struct + XrHolographicWindowAttachmentMSFT.HOLOGRAPHICSPACE, check(value)); }
    /** Unsafe version of {@link #coreWindow(long) coreWindow}. */
    public static void ncoreWindow(long struct, long value) { memPutAddress(struct + XrHolographicWindowAttachmentMSFT.COREWINDOW, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHolographicWindowAttachmentMSFT.HOLOGRAPHICSPACE));
        check(memGetAddress(struct + XrHolographicWindowAttachmentMSFT.COREWINDOW));
    }

    // -----------------------------------

    /** An array of {@link XrHolographicWindowAttachmentMSFT} structs. */
    public static class Buffer extends StructBuffer<XrHolographicWindowAttachmentMSFT, Buffer> implements NativeResource {

        private static final XrHolographicWindowAttachmentMSFT ELEMENT_FACTORY = XrHolographicWindowAttachmentMSFT.create(-1L);

        /**
         * Creates a new {@code XrHolographicWindowAttachmentMSFT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHolographicWindowAttachmentMSFT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrHolographicWindowAttachmentMSFT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHolographicWindowAttachmentMSFT.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrHolographicWindowAttachmentMSFT.nnext(address()); }
        /** @return the value of the {@code holographicSpace} field. */
        @NativeType("IUnknown *")
        public long holographicSpace() { return XrHolographicWindowAttachmentMSFT.nholographicSpace(address()); }
        /** @return the value of the {@code coreWindow} field. */
        @NativeType("IUnknown *")
        public long coreWindow() { return XrHolographicWindowAttachmentMSFT.ncoreWindow(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer type(@NativeType("XrStructureType") int value) { XrHolographicWindowAttachmentMSFT.ntype(address(), value); return this; }
        /** Sets the {@link MSFTHolographicWindowAttachment#XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT} value to the {@code type} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer type$Default() { return type(MSFTHolographicWindowAttachment.XR_TYPE_HOLOGRAPHIC_WINDOW_ATTACHMENT_MSFT); }
        /** Sets the specified value to the {@code next} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer next(@NativeType("void const *") long value) { XrHolographicWindowAttachmentMSFT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code holographicSpace} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer holographicSpace(@NativeType("IUnknown *") long value) { XrHolographicWindowAttachmentMSFT.nholographicSpace(address(), value); return this; }
        /** Sets the specified value to the {@code coreWindow} field. */
        public XrHolographicWindowAttachmentMSFT.Buffer coreWindow(@NativeType("IUnknown *") long value) { XrHolographicWindowAttachmentMSFT.ncoreWindow(address(), value); return this; }

    }

}