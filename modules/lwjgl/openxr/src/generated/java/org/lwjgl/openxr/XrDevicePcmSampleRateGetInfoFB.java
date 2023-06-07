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
 * See {@link XrDevicePcmSampleRateStateFB}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrDevicePcmSampleRateGetInfoFB {
 *     XrStructureType type;
 *     void * next;
 *     float sampleRate;
 * }</code></pre>
 */
public class XrDevicePcmSampleRateGetInfoFB extends XrDevicePcmSampleRateStateFB {

    protected XrDevicePcmSampleRateGetInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrDevicePcmSampleRateGetInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrDevicePcmSampleRateGetInfoFB(address, container);
    }

    /**
     * Creates a {@code XrDevicePcmSampleRateGetInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrDevicePcmSampleRateGetInfoFB(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code type} field. */
    @Override
    public XrDevicePcmSampleRateGetInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHapticPcm#XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB} value to the {@code type} field. */
    @Override
    public XrDevicePcmSampleRateGetInfoFB type$Default() { return type(FBHapticPcm.XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB); }
    /** Sets the specified value to the {@code next} field. */
    @Override
    public XrDevicePcmSampleRateGetInfoFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code sampleRate} field. */
    @Override
    public XrDevicePcmSampleRateGetInfoFB sampleRate(float value) { nsampleRate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public XrDevicePcmSampleRateGetInfoFB set(
        int type,
        long next,
        float sampleRate
    ) {
        type(type);
        next(next);
        sampleRate(sampleRate);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrDevicePcmSampleRateGetInfoFB set(XrDevicePcmSampleRateGetInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrDevicePcmSampleRateGetInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrDevicePcmSampleRateGetInfoFB malloc() {
        return new XrDevicePcmSampleRateGetInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrDevicePcmSampleRateGetInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrDevicePcmSampleRateGetInfoFB calloc() {
        return new XrDevicePcmSampleRateGetInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrDevicePcmSampleRateGetInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrDevicePcmSampleRateGetInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrDevicePcmSampleRateGetInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrDevicePcmSampleRateGetInfoFB} instance for the specified memory address. */
    public static XrDevicePcmSampleRateGetInfoFB create(long address) {
        return new XrDevicePcmSampleRateGetInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDevicePcmSampleRateGetInfoFB createSafe(long address) {
        return address == NULL ? null : new XrDevicePcmSampleRateGetInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateGetInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateGetInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateGetInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateGetInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateGetInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateGetInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrDevicePcmSampleRateGetInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateGetInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrDevicePcmSampleRateGetInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrDevicePcmSampleRateGetInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDevicePcmSampleRateGetInfoFB malloc(MemoryStack stack) {
        return new XrDevicePcmSampleRateGetInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrDevicePcmSampleRateGetInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrDevicePcmSampleRateGetInfoFB calloc(MemoryStack stack) {
        return new XrDevicePcmSampleRateGetInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateGetInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateGetInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrDevicePcmSampleRateGetInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrDevicePcmSampleRateGetInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link XrDevicePcmSampleRateGetInfoFB} structs. */
    public static class Buffer extends XrDevicePcmSampleRateStateFB.Buffer {

        private static final XrDevicePcmSampleRateGetInfoFB ELEMENT_FACTORY = XrDevicePcmSampleRateGetInfoFB.create(-1L);

        /**
         * Creates a new {@code XrDevicePcmSampleRateGetInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrDevicePcmSampleRateGetInfoFB#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
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
        protected XrDevicePcmSampleRateGetInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code type} field. */
        @Override
        public XrDevicePcmSampleRateGetInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrDevicePcmSampleRateGetInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHapticPcm#XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB} value to the {@code type} field. */
        @Override
        public XrDevicePcmSampleRateGetInfoFB.Buffer type$Default() { return type(FBHapticPcm.XR_TYPE_DEVICE_PCM_SAMPLE_RATE_STATE_FB); }
        /** Sets the specified value to the {@code next} field. */
        @Override
        public XrDevicePcmSampleRateGetInfoFB.Buffer next(@NativeType("void *") long value) { XrDevicePcmSampleRateGetInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code sampleRate} field. */
        @Override
        public XrDevicePcmSampleRateGetInfoFB.Buffer sampleRate(float value) { XrDevicePcmSampleRateGetInfoFB.nsampleRate(address(), value); return this; }

    }

}