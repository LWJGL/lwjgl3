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
 * struct XrFrameState {
 *     XrStructureType type;
 *     void * next;
 *     XrTime predictedDisplayTime;
 *     XrDuration predictedDisplayPeriod;
 *     XrBool32 shouldRender;
 * }}</pre>
 */
public class XrFrameState extends Struct<XrFrameState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PREDICTEDDISPLAYTIME,
        PREDICTEDDISPLAYPERIOD,
        SHOULDRENDER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PREDICTEDDISPLAYTIME = layout.offsetof(2);
        PREDICTEDDISPLAYPERIOD = layout.offsetof(3);
        SHOULDRENDER = layout.offsetof(4);
    }

    protected XrFrameState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFrameState create(long address, @Nullable ByteBuffer container) {
        return new XrFrameState(address, container);
    }

    /**
     * Creates a {@code XrFrameState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFrameState(ByteBuffer container) {
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
    /** @return the value of the {@code predictedDisplayTime} field. */
    @NativeType("XrTime")
    public long predictedDisplayTime() { return npredictedDisplayTime(address()); }
    /** @return the value of the {@code predictedDisplayPeriod} field. */
    @NativeType("XrDuration")
    public long predictedDisplayPeriod() { return npredictedDisplayPeriod(address()); }
    /** @return the value of the {@code shouldRender} field. */
    @NativeType("XrBool32")
    public boolean shouldRender() { return nshouldRender(address()) != 0; }

    /** Sets the specified value to the {@code type} field. */
    public XrFrameState type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_FRAME_STATE TYPE_FRAME_STATE} value to the {@code type} field. */
    public XrFrameState type$Default() { return type(XR10.XR_TYPE_FRAME_STATE); }
    /** Sets the specified value to the {@code next} field. */
    public XrFrameState next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSecondaryViewConfigurationFrameStateMSFT} value to the {@code next} chain. */
    public XrFrameState next(XrSecondaryViewConfigurationFrameStateMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code predictedDisplayTime} field. */
    public XrFrameState predictedDisplayTime(@NativeType("XrTime") long value) { npredictedDisplayTime(address(), value); return this; }
    /** Sets the specified value to the {@code predictedDisplayPeriod} field. */
    public XrFrameState predictedDisplayPeriod(@NativeType("XrDuration") long value) { npredictedDisplayPeriod(address(), value); return this; }
    /** Sets the specified value to the {@code shouldRender} field. */
    public XrFrameState shouldRender(@NativeType("XrBool32") boolean value) { nshouldRender(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrFrameState set(
        int type,
        long next,
        long predictedDisplayTime,
        long predictedDisplayPeriod,
        boolean shouldRender
    ) {
        type(type);
        next(next);
        predictedDisplayTime(predictedDisplayTime);
        predictedDisplayPeriod(predictedDisplayPeriod);
        shouldRender(shouldRender);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFrameState set(XrFrameState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFrameState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFrameState malloc() {
        return new XrFrameState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFrameState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrameState calloc() {
        return new XrFrameState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFrameState} instance allocated with {@link BufferUtils}. */
    public static XrFrameState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFrameState(memAddress(container), container);
    }

    /** Returns a new {@code XrFrameState} instance for the specified memory address. */
    public static XrFrameState create(long address) {
        return new XrFrameState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFrameState createSafe(long address) {
        return address == NULL ? null : new XrFrameState(address, null);
    }

    /**
     * Returns a new {@link XrFrameState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrameState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFrameState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrameState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFrameState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFrameState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameState malloc(MemoryStack stack) {
        return new XrFrameState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFrameState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameState calloc(MemoryStack stack) {
        return new XrFrameState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFrameState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFrameState.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFrameState.NEXT); }
    /** Unsafe version of {@link #predictedDisplayTime}. */
    public static long npredictedDisplayTime(long struct) { return memGetLong(struct + XrFrameState.PREDICTEDDISPLAYTIME); }
    /** Unsafe version of {@link #predictedDisplayPeriod}. */
    public static long npredictedDisplayPeriod(long struct) { return memGetLong(struct + XrFrameState.PREDICTEDDISPLAYPERIOD); }
    /** Unsafe version of {@link #shouldRender}. */
    public static int nshouldRender(long struct) { return memGetInt(struct + XrFrameState.SHOULDRENDER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFrameState.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFrameState.NEXT, value); }
    /** Unsafe version of {@link #predictedDisplayTime(long) predictedDisplayTime}. */
    public static void npredictedDisplayTime(long struct, long value) { memPutLong(struct + XrFrameState.PREDICTEDDISPLAYTIME, value); }
    /** Unsafe version of {@link #predictedDisplayPeriod(long) predictedDisplayPeriod}. */
    public static void npredictedDisplayPeriod(long struct, long value) { memPutLong(struct + XrFrameState.PREDICTEDDISPLAYPERIOD, value); }
    /** Unsafe version of {@link #shouldRender(boolean) shouldRender}. */
    public static void nshouldRender(long struct, int value) { memPutInt(struct + XrFrameState.SHOULDRENDER, value); }

    // -----------------------------------

    /** An array of {@link XrFrameState} structs. */
    public static class Buffer extends StructBuffer<XrFrameState, Buffer> implements NativeResource {

        private static final XrFrameState ELEMENT_FACTORY = XrFrameState.create(-1L);

        /**
         * Creates a new {@code XrFrameState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrameState#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFrameState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFrameState.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFrameState.nnext(address()); }
        /** @return the value of the {@code predictedDisplayTime} field. */
        @NativeType("XrTime")
        public long predictedDisplayTime() { return XrFrameState.npredictedDisplayTime(address()); }
        /** @return the value of the {@code predictedDisplayPeriod} field. */
        @NativeType("XrDuration")
        public long predictedDisplayPeriod() { return XrFrameState.npredictedDisplayPeriod(address()); }
        /** @return the value of the {@code shouldRender} field. */
        @NativeType("XrBool32")
        public boolean shouldRender() { return XrFrameState.nshouldRender(address()) != 0; }

        /** Sets the specified value to the {@code type} field. */
        public XrFrameState.Buffer type(@NativeType("XrStructureType") int value) { XrFrameState.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_FRAME_STATE TYPE_FRAME_STATE} value to the {@code type} field. */
        public XrFrameState.Buffer type$Default() { return type(XR10.XR_TYPE_FRAME_STATE); }
        /** Sets the specified value to the {@code next} field. */
        public XrFrameState.Buffer next(@NativeType("void *") long value) { XrFrameState.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSecondaryViewConfigurationFrameStateMSFT} value to the {@code next} chain. */
        public XrFrameState.Buffer next(XrSecondaryViewConfigurationFrameStateMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code predictedDisplayTime} field. */
        public XrFrameState.Buffer predictedDisplayTime(@NativeType("XrTime") long value) { XrFrameState.npredictedDisplayTime(address(), value); return this; }
        /** Sets the specified value to the {@code predictedDisplayPeriod} field. */
        public XrFrameState.Buffer predictedDisplayPeriod(@NativeType("XrDuration") long value) { XrFrameState.npredictedDisplayPeriod(address(), value); return this; }
        /** Sets the specified value to the {@code shouldRender} field. */
        public XrFrameState.Buffer shouldRender(@NativeType("XrBool32") boolean value) { XrFrameState.nshouldRender(address(), value ? 1 : 0); return this; }

    }

}