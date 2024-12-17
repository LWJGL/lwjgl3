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
 * struct XrSemanticLabelsSupportInfoFB {
 *     XrStructureType type;
 *     void const * next;
 *     XrSemanticLabelsSupportFlagsFB flags;
 *     char const * recognizedLabels;
 * }}</pre>
 */
public class XrSemanticLabelsSupportInfoFB extends Struct<XrSemanticLabelsSupportInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS,
        RECOGNIZEDLABELS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RECOGNIZEDLABELS = layout.offsetof(3);
    }

    protected XrSemanticLabelsSupportInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSemanticLabelsSupportInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrSemanticLabelsSupportInfoFB(address, container);
    }

    /**
     * Creates a {@code XrSemanticLabelsSupportInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSemanticLabelsSupportInfoFB(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("XrSemanticLabelsSupportFlagsFB")
    public long flags() { return nflags(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code recognizedLabels} field. */
    @NativeType("char const *")
    public ByteBuffer recognizedLabels() { return nrecognizedLabels(address()); }
    /** @return the null-terminated string pointed to by the {@code recognizedLabels} field. */
    @NativeType("char const *")
    public String recognizedLabelsString() { return nrecognizedLabelsString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSemanticLabelsSupportInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBScene#XR_TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB} value to the {@code type} field. */
    public XrSemanticLabelsSupportInfoFB type$Default() { return type(FBScene.XR_TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSemanticLabelsSupportInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrSemanticLabelsSupportInfoFB flags(@NativeType("XrSemanticLabelsSupportFlagsFB") long value) { nflags(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code recognizedLabels} field. */
    public XrSemanticLabelsSupportInfoFB recognizedLabels(@NativeType("char const *") ByteBuffer value) { nrecognizedLabels(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSemanticLabelsSupportInfoFB set(
        int type,
        long next,
        long flags,
        ByteBuffer recognizedLabels
    ) {
        type(type);
        next(next);
        flags(flags);
        recognizedLabels(recognizedLabels);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSemanticLabelsSupportInfoFB set(XrSemanticLabelsSupportInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSemanticLabelsSupportInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSemanticLabelsSupportInfoFB malloc() {
        return new XrSemanticLabelsSupportInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSemanticLabelsSupportInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSemanticLabelsSupportInfoFB calloc() {
        return new XrSemanticLabelsSupportInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSemanticLabelsSupportInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrSemanticLabelsSupportInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSemanticLabelsSupportInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSemanticLabelsSupportInfoFB} instance for the specified memory address. */
    public static XrSemanticLabelsSupportInfoFB create(long address) {
        return new XrSemanticLabelsSupportInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSemanticLabelsSupportInfoFB createSafe(long address) {
        return address == NULL ? null : new XrSemanticLabelsSupportInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrSemanticLabelsSupportInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsSupportInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSemanticLabelsSupportInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsSupportInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSemanticLabelsSupportInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsSupportInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSemanticLabelsSupportInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsSupportInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSemanticLabelsSupportInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSemanticLabelsSupportInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSemanticLabelsSupportInfoFB malloc(MemoryStack stack) {
        return new XrSemanticLabelsSupportInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSemanticLabelsSupportInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSemanticLabelsSupportInfoFB calloc(MemoryStack stack) {
        return new XrSemanticLabelsSupportInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSemanticLabelsSupportInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsSupportInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSemanticLabelsSupportInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSemanticLabelsSupportInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSemanticLabelsSupportInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSemanticLabelsSupportInfoFB.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrSemanticLabelsSupportInfoFB.FLAGS); }
    /** Unsafe version of {@link #recognizedLabels}. */
    public static ByteBuffer nrecognizedLabels(long struct) { return memByteBufferNT1(memGetAddress(struct + XrSemanticLabelsSupportInfoFB.RECOGNIZEDLABELS)); }
    /** Unsafe version of {@link #recognizedLabelsString}. */
    public static String nrecognizedLabelsString(long struct) { return memUTF8(memGetAddress(struct + XrSemanticLabelsSupportInfoFB.RECOGNIZEDLABELS)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSemanticLabelsSupportInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSemanticLabelsSupportInfoFB.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrSemanticLabelsSupportInfoFB.FLAGS, value); }
    /** Unsafe version of {@link #recognizedLabels(ByteBuffer) recognizedLabels}. */
    public static void nrecognizedLabels(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrSemanticLabelsSupportInfoFB.RECOGNIZEDLABELS, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSemanticLabelsSupportInfoFB.RECOGNIZEDLABELS));
    }

    // -----------------------------------

    /** An array of {@link XrSemanticLabelsSupportInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrSemanticLabelsSupportInfoFB, Buffer> implements NativeResource {

        private static final XrSemanticLabelsSupportInfoFB ELEMENT_FACTORY = XrSemanticLabelsSupportInfoFB.create(-1L);

        /**
         * Creates a new {@code XrSemanticLabelsSupportInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSemanticLabelsSupportInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSemanticLabelsSupportInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSemanticLabelsSupportInfoFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSemanticLabelsSupportInfoFB.nnext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrSemanticLabelsSupportFlagsFB")
        public long flags() { return XrSemanticLabelsSupportInfoFB.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code recognizedLabels} field. */
        @NativeType("char const *")
        public ByteBuffer recognizedLabels() { return XrSemanticLabelsSupportInfoFB.nrecognizedLabels(address()); }
        /** @return the null-terminated string pointed to by the {@code recognizedLabels} field. */
        @NativeType("char const *")
        public String recognizedLabelsString() { return XrSemanticLabelsSupportInfoFB.nrecognizedLabelsString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSemanticLabelsSupportInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrSemanticLabelsSupportInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBScene#XR_TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB} value to the {@code type} field. */
        public XrSemanticLabelsSupportInfoFB.Buffer type$Default() { return type(FBScene.XR_TYPE_SEMANTIC_LABELS_SUPPORT_INFO_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSemanticLabelsSupportInfoFB.Buffer next(@NativeType("void const *") long value) { XrSemanticLabelsSupportInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrSemanticLabelsSupportInfoFB.Buffer flags(@NativeType("XrSemanticLabelsSupportFlagsFB") long value) { XrSemanticLabelsSupportInfoFB.nflags(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code recognizedLabels} field. */
        public XrSemanticLabelsSupportInfoFB.Buffer recognizedLabels(@NativeType("char const *") ByteBuffer value) { XrSemanticLabelsSupportInfoFB.nrecognizedLabels(address(), value); return this; }

    }

}