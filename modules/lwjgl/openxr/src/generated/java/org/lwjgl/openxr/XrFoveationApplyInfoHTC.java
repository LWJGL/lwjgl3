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
 * struct XrFoveationApplyInfoHTC {
 *     XrStructureType type;
 *     void const * next;
 *     XrFoveationModeHTC mode;
 *     uint32_t subImageCount;
 *     {@link XrSwapchainSubImage XrSwapchainSubImage} * subImages;
 * }}</pre>
 */
public class XrFoveationApplyInfoHTC extends Struct<XrFoveationApplyInfoHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MODE,
        SUBIMAGECOUNT,
        SUBIMAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MODE = layout.offsetof(2);
        SUBIMAGECOUNT = layout.offsetof(3);
        SUBIMAGES = layout.offsetof(4);
    }

    protected XrFoveationApplyInfoHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationApplyInfoHTC create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationApplyInfoHTC(address, container);
    }

    /**
     * Creates a {@code XrFoveationApplyInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationApplyInfoHTC(ByteBuffer container) {
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
    /** @return the value of the {@code mode} field. */
    @NativeType("XrFoveationModeHTC")
    public int mode() { return nmode(address()); }
    /** @return the value of the {@code subImageCount} field. */
    @NativeType("uint32_t")
    public int subImageCount() { return nsubImageCount(address()); }
    /** @return a {@link XrSwapchainSubImage.Buffer} view of the struct array pointed to by the {@code subImages} field. */
    @NativeType("XrSwapchainSubImage *")
    public XrSwapchainSubImage.Buffer subImages() { return nsubImages(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFoveationApplyInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_APPLY_INFO_HTC TYPE_FOVEATION_APPLY_INFO_HTC} value to the {@code type} field. */
    public XrFoveationApplyInfoHTC type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_APPLY_INFO_HTC); }
    /** Sets the specified value to the {@code next} field. */
    public XrFoveationApplyInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrFoveationCustomModeInfoHTC} value to the {@code next} chain. */
    public XrFoveationApplyInfoHTC next(XrFoveationCustomModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrFoveationDynamicModeInfoHTC} value to the {@code next} chain. */
    public XrFoveationApplyInfoHTC next(XrFoveationDynamicModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code mode} field. */
    public XrFoveationApplyInfoHTC mode(@NativeType("XrFoveationModeHTC") int value) { nmode(address(), value); return this; }
    /** Sets the address of the specified {@link XrSwapchainSubImage.Buffer} to the {@code subImages} field. */
    public XrFoveationApplyInfoHTC subImages(@NativeType("XrSwapchainSubImage *") XrSwapchainSubImage.Buffer value) { nsubImages(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationApplyInfoHTC set(
        int type,
        long next,
        int mode,
        XrSwapchainSubImage.Buffer subImages
    ) {
        type(type);
        next(next);
        mode(mode);
        subImages(subImages);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFoveationApplyInfoHTC set(XrFoveationApplyInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationApplyInfoHTC malloc() {
        return new XrFoveationApplyInfoHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationApplyInfoHTC calloc() {
        return new XrFoveationApplyInfoHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrFoveationApplyInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationApplyInfoHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationApplyInfoHTC} instance for the specified memory address. */
    public static XrFoveationApplyInfoHTC create(long address) {
        return new XrFoveationApplyInfoHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFoveationApplyInfoHTC createSafe(long address) {
        return address == NULL ? null : new XrFoveationApplyInfoHTC(address, null);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationApplyInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFoveationApplyInfoHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationApplyInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationApplyInfoHTC malloc(MemoryStack stack) {
        return new XrFoveationApplyInfoHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationApplyInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationApplyInfoHTC calloc(MemoryStack stack) {
        return new XrFoveationApplyInfoHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationApplyInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationApplyInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFoveationApplyInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationApplyInfoHTC.NEXT); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return memGetInt(struct + XrFoveationApplyInfoHTC.MODE); }
    /** Unsafe version of {@link #subImageCount}. */
    public static int nsubImageCount(long struct) { return memGetInt(struct + XrFoveationApplyInfoHTC.SUBIMAGECOUNT); }
    /** Unsafe version of {@link #subImages}. */
    public static XrSwapchainSubImage.Buffer nsubImages(long struct) { return XrSwapchainSubImage.create(memGetAddress(struct + XrFoveationApplyInfoHTC.SUBIMAGES), nsubImageCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFoveationApplyInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationApplyInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { memPutInt(struct + XrFoveationApplyInfoHTC.MODE, value); }
    /** Sets the specified value to the {@code subImageCount} field of the specified {@code struct}. */
    public static void nsubImageCount(long struct, int value) { memPutInt(struct + XrFoveationApplyInfoHTC.SUBIMAGECOUNT, value); }
    /** Unsafe version of {@link #subImages(XrSwapchainSubImage.Buffer) subImages}. */
    public static void nsubImages(long struct, XrSwapchainSubImage.Buffer value) { memPutAddress(struct + XrFoveationApplyInfoHTC.SUBIMAGES, value.address()); nsubImageCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int subImageCount = nsubImageCount(struct);
        long subImages = memGetAddress(struct + XrFoveationApplyInfoHTC.SUBIMAGES);
        check(subImages);
        validate(subImages, subImageCount, XrSwapchainSubImage.SIZEOF, XrSwapchainSubImage::validate);
    }

    // -----------------------------------

    /** An array of {@link XrFoveationApplyInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrFoveationApplyInfoHTC, Buffer> implements NativeResource {

        private static final XrFoveationApplyInfoHTC ELEMENT_FACTORY = XrFoveationApplyInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrFoveationApplyInfoHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationApplyInfoHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationApplyInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationApplyInfoHTC.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFoveationApplyInfoHTC.nnext(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("XrFoveationModeHTC")
        public int mode() { return XrFoveationApplyInfoHTC.nmode(address()); }
        /** @return the value of the {@code subImageCount} field. */
        @NativeType("uint32_t")
        public int subImageCount() { return XrFoveationApplyInfoHTC.nsubImageCount(address()); }
        /** @return a {@link XrSwapchainSubImage.Buffer} view of the struct array pointed to by the {@code subImages} field. */
        @NativeType("XrSwapchainSubImage *")
        public XrSwapchainSubImage.Buffer subImages() { return XrFoveationApplyInfoHTC.nsubImages(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFoveationApplyInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationApplyInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFoveation#XR_TYPE_FOVEATION_APPLY_INFO_HTC TYPE_FOVEATION_APPLY_INFO_HTC} value to the {@code type} field. */
        public XrFoveationApplyInfoHTC.Buffer type$Default() { return type(HTCFoveation.XR_TYPE_FOVEATION_APPLY_INFO_HTC); }
        /** Sets the specified value to the {@code next} field. */
        public XrFoveationApplyInfoHTC.Buffer next(@NativeType("void const *") long value) { XrFoveationApplyInfoHTC.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrFoveationCustomModeInfoHTC} value to the {@code next} chain. */
        public XrFoveationApplyInfoHTC.Buffer next(XrFoveationCustomModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrFoveationDynamicModeInfoHTC} value to the {@code next} chain. */
        public XrFoveationApplyInfoHTC.Buffer next(XrFoveationDynamicModeInfoHTC value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code mode} field. */
        public XrFoveationApplyInfoHTC.Buffer mode(@NativeType("XrFoveationModeHTC") int value) { XrFoveationApplyInfoHTC.nmode(address(), value); return this; }
        /** Sets the address of the specified {@link XrSwapchainSubImage.Buffer} to the {@code subImages} field. */
        public XrFoveationApplyInfoHTC.Buffer subImages(@NativeType("XrSwapchainSubImage *") XrSwapchainSubImage.Buffer value) { XrFoveationApplyInfoHTC.nsubImages(address(), value); return this; }

    }

}