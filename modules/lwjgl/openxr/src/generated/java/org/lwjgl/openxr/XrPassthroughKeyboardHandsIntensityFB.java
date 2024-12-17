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
 * struct XrPassthroughKeyboardHandsIntensityFB {
 *     XrStructureType type;
 *     void const * next;
 *     float leftHandIntensity;
 *     float rightHandIntensity;
 * }}</pre>
 */
public class XrPassthroughKeyboardHandsIntensityFB extends Struct<XrPassthroughKeyboardHandsIntensityFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LEFTHANDINTENSITY,
        RIGHTHANDINTENSITY;

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
        LEFTHANDINTENSITY = layout.offsetof(2);
        RIGHTHANDINTENSITY = layout.offsetof(3);
    }

    protected XrPassthroughKeyboardHandsIntensityFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPassthroughKeyboardHandsIntensityFB create(long address, @Nullable ByteBuffer container) {
        return new XrPassthroughKeyboardHandsIntensityFB(address, container);
    }

    /**
     * Creates a {@code XrPassthroughKeyboardHandsIntensityFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPassthroughKeyboardHandsIntensityFB(ByteBuffer container) {
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
    /** @return the value of the {@code leftHandIntensity} field. */
    public float leftHandIntensity() { return nleftHandIntensity(address()); }
    /** @return the value of the {@code rightHandIntensity} field. */
    public float rightHandIntensity() { return nrightHandIntensity(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrPassthroughKeyboardHandsIntensityFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBPassthroughKeyboardHands#XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB} value to the {@code type} field. */
    public XrPassthroughKeyboardHandsIntensityFB type$Default() { return type(FBPassthroughKeyboardHands.XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrPassthroughKeyboardHandsIntensityFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code leftHandIntensity} field. */
    public XrPassthroughKeyboardHandsIntensityFB leftHandIntensity(float value) { nleftHandIntensity(address(), value); return this; }
    /** Sets the specified value to the {@code rightHandIntensity} field. */
    public XrPassthroughKeyboardHandsIntensityFB rightHandIntensity(float value) { nrightHandIntensity(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPassthroughKeyboardHandsIntensityFB set(
        int type,
        long next,
        float leftHandIntensity,
        float rightHandIntensity
    ) {
        type(type);
        next(next);
        leftHandIntensity(leftHandIntensity);
        rightHandIntensity(rightHandIntensity);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPassthroughKeyboardHandsIntensityFB set(XrPassthroughKeyboardHandsIntensityFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPassthroughKeyboardHandsIntensityFB malloc() {
        return new XrPassthroughKeyboardHandsIntensityFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPassthroughKeyboardHandsIntensityFB calloc() {
        return new XrPassthroughKeyboardHandsIntensityFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated with {@link BufferUtils}. */
    public static XrPassthroughKeyboardHandsIntensityFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPassthroughKeyboardHandsIntensityFB(memAddress(container), container);
    }

    /** Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance for the specified memory address. */
    public static XrPassthroughKeyboardHandsIntensityFB create(long address) {
        return new XrPassthroughKeyboardHandsIntensityFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrPassthroughKeyboardHandsIntensityFB createSafe(long address) {
        return address == NULL ? null : new XrPassthroughKeyboardHandsIntensityFB(address, null);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrPassthroughKeyboardHandsIntensityFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughKeyboardHandsIntensityFB malloc(MemoryStack stack) {
        return new XrPassthroughKeyboardHandsIntensityFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPassthroughKeyboardHandsIntensityFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPassthroughKeyboardHandsIntensityFB calloc(MemoryStack stack) {
        return new XrPassthroughKeyboardHandsIntensityFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPassthroughKeyboardHandsIntensityFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPassthroughKeyboardHandsIntensityFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrPassthroughKeyboardHandsIntensityFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPassthroughKeyboardHandsIntensityFB.NEXT); }
    /** Unsafe version of {@link #leftHandIntensity}. */
    public static float nleftHandIntensity(long struct) { return memGetFloat(struct + XrPassthroughKeyboardHandsIntensityFB.LEFTHANDINTENSITY); }
    /** Unsafe version of {@link #rightHandIntensity}. */
    public static float nrightHandIntensity(long struct) { return memGetFloat(struct + XrPassthroughKeyboardHandsIntensityFB.RIGHTHANDINTENSITY); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrPassthroughKeyboardHandsIntensityFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPassthroughKeyboardHandsIntensityFB.NEXT, value); }
    /** Unsafe version of {@link #leftHandIntensity(float) leftHandIntensity}. */
    public static void nleftHandIntensity(long struct, float value) { memPutFloat(struct + XrPassthroughKeyboardHandsIntensityFB.LEFTHANDINTENSITY, value); }
    /** Unsafe version of {@link #rightHandIntensity(float) rightHandIntensity}. */
    public static void nrightHandIntensity(long struct, float value) { memPutFloat(struct + XrPassthroughKeyboardHandsIntensityFB.RIGHTHANDINTENSITY, value); }

    // -----------------------------------

    /** An array of {@link XrPassthroughKeyboardHandsIntensityFB} structs. */
    public static class Buffer extends StructBuffer<XrPassthroughKeyboardHandsIntensityFB, Buffer> implements NativeResource {

        private static final XrPassthroughKeyboardHandsIntensityFB ELEMENT_FACTORY = XrPassthroughKeyboardHandsIntensityFB.create(-1L);

        /**
         * Creates a new {@code XrPassthroughKeyboardHandsIntensityFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPassthroughKeyboardHandsIntensityFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPassthroughKeyboardHandsIntensityFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPassthroughKeyboardHandsIntensityFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrPassthroughKeyboardHandsIntensityFB.nnext(address()); }
        /** @return the value of the {@code leftHandIntensity} field. */
        public float leftHandIntensity() { return XrPassthroughKeyboardHandsIntensityFB.nleftHandIntensity(address()); }
        /** @return the value of the {@code rightHandIntensity} field. */
        public float rightHandIntensity() { return XrPassthroughKeyboardHandsIntensityFB.nrightHandIntensity(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer type(@NativeType("XrStructureType") int value) { XrPassthroughKeyboardHandsIntensityFB.ntype(address(), value); return this; }
        /** Sets the {@link FBPassthroughKeyboardHands#XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB} value to the {@code type} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer type$Default() { return type(FBPassthroughKeyboardHands.XR_TYPE_PASSTHROUGH_KEYBOARD_HANDS_INTENSITY_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer next(@NativeType("void const *") long value) { XrPassthroughKeyboardHandsIntensityFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code leftHandIntensity} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer leftHandIntensity(float value) { XrPassthroughKeyboardHandsIntensityFB.nleftHandIntensity(address(), value); return this; }
        /** Sets the specified value to the {@code rightHandIntensity} field. */
        public XrPassthroughKeyboardHandsIntensityFB.Buffer rightHandIntensity(float value) { XrPassthroughKeyboardHandsIntensityFB.nrightHandIntensity(address(), value); return this; }

    }

}