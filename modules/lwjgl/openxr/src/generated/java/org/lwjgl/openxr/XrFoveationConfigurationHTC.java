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
 * struct XrFoveationConfigurationHTC {
 *     XrFoveationLevelHTC level;
 *     float clearFovDegree;
 *     {@link XrVector2f XrVector2f} focalCenterOffset;
 * }}</pre>
 */
public class XrFoveationConfigurationHTC extends Struct<XrFoveationConfigurationHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LEVEL,
        CLEARFOVDEGREE,
        FOCALCENTEROFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(XrVector2f.SIZEOF, XrVector2f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LEVEL = layout.offsetof(0);
        CLEARFOVDEGREE = layout.offsetof(1);
        FOCALCENTEROFFSET = layout.offsetof(2);
    }

    protected XrFoveationConfigurationHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationConfigurationHTC create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationConfigurationHTC(address, container);
    }

    /**
     * Creates a {@code XrFoveationConfigurationHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationConfigurationHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code level} field. */
    @NativeType("XrFoveationLevelHTC")
    public int level() { return nlevel(address()); }
    /** @return the value of the {@code clearFovDegree} field. */
    public float clearFovDegree() { return nclearFovDegree(address()); }
    /** @return a {@link XrVector2f} view of the {@code focalCenterOffset} field. */
    public XrVector2f focalCenterOffset() { return nfocalCenterOffset(address()); }

    /** Sets the specified value to the {@code level} field. */
    public XrFoveationConfigurationHTC level(@NativeType("XrFoveationLevelHTC") int value) { nlevel(address(), value); return this; }
    /** Sets the specified value to the {@code clearFovDegree} field. */
    public XrFoveationConfigurationHTC clearFovDegree(float value) { nclearFovDegree(address(), value); return this; }
    /** Copies the specified {@link XrVector2f} to the {@code focalCenterOffset} field. */
    public XrFoveationConfigurationHTC focalCenterOffset(XrVector2f value) { nfocalCenterOffset(address(), value); return this; }
    /** Passes the {@code focalCenterOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrFoveationConfigurationHTC focalCenterOffset(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(focalCenterOffset()); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationConfigurationHTC set(
        int level,
        float clearFovDegree,
        XrVector2f focalCenterOffset
    ) {
        level(level);
        clearFovDegree(clearFovDegree);
        focalCenterOffset(focalCenterOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFoveationConfigurationHTC set(XrFoveationConfigurationHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationConfigurationHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationConfigurationHTC malloc() {
        return new XrFoveationConfigurationHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationConfigurationHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationConfigurationHTC calloc() {
        return new XrFoveationConfigurationHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationConfigurationHTC} instance allocated with {@link BufferUtils}. */
    public static XrFoveationConfigurationHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationConfigurationHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationConfigurationHTC} instance for the specified memory address. */
    public static XrFoveationConfigurationHTC create(long address) {
        return new XrFoveationConfigurationHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFoveationConfigurationHTC createSafe(long address) {
        return address == NULL ? null : new XrFoveationConfigurationHTC(address, null);
    }

    /**
     * Returns a new {@link XrFoveationConfigurationHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationConfigurationHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationConfigurationHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationConfigurationHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationConfigurationHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationConfigurationHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationConfigurationHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationConfigurationHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFoveationConfigurationHTC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationConfigurationHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationConfigurationHTC malloc(MemoryStack stack) {
        return new XrFoveationConfigurationHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationConfigurationHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationConfigurationHTC calloc(MemoryStack stack) {
        return new XrFoveationConfigurationHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationConfigurationHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationConfigurationHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationConfigurationHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationConfigurationHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #level}. */
    public static int nlevel(long struct) { return memGetInt(struct + XrFoveationConfigurationHTC.LEVEL); }
    /** Unsafe version of {@link #clearFovDegree}. */
    public static float nclearFovDegree(long struct) { return memGetFloat(struct + XrFoveationConfigurationHTC.CLEARFOVDEGREE); }
    /** Unsafe version of {@link #focalCenterOffset}. */
    public static XrVector2f nfocalCenterOffset(long struct) { return XrVector2f.create(struct + XrFoveationConfigurationHTC.FOCALCENTEROFFSET); }

    /** Unsafe version of {@link #level(int) level}. */
    public static void nlevel(long struct, int value) { memPutInt(struct + XrFoveationConfigurationHTC.LEVEL, value); }
    /** Unsafe version of {@link #clearFovDegree(float) clearFovDegree}. */
    public static void nclearFovDegree(long struct, float value) { memPutFloat(struct + XrFoveationConfigurationHTC.CLEARFOVDEGREE, value); }
    /** Unsafe version of {@link #focalCenterOffset(XrVector2f) focalCenterOffset}. */
    public static void nfocalCenterOffset(long struct, XrVector2f value) { memCopy(value.address(), struct + XrFoveationConfigurationHTC.FOCALCENTEROFFSET, XrVector2f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrFoveationConfigurationHTC} structs. */
    public static class Buffer extends StructBuffer<XrFoveationConfigurationHTC, Buffer> implements NativeResource {

        private static final XrFoveationConfigurationHTC ELEMENT_FACTORY = XrFoveationConfigurationHTC.create(-1L);

        /**
         * Creates a new {@code XrFoveationConfigurationHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationConfigurationHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationConfigurationHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code level} field. */
        @NativeType("XrFoveationLevelHTC")
        public int level() { return XrFoveationConfigurationHTC.nlevel(address()); }
        /** @return the value of the {@code clearFovDegree} field. */
        public float clearFovDegree() { return XrFoveationConfigurationHTC.nclearFovDegree(address()); }
        /** @return a {@link XrVector2f} view of the {@code focalCenterOffset} field. */
        public XrVector2f focalCenterOffset() { return XrFoveationConfigurationHTC.nfocalCenterOffset(address()); }

        /** Sets the specified value to the {@code level} field. */
        public XrFoveationConfigurationHTC.Buffer level(@NativeType("XrFoveationLevelHTC") int value) { XrFoveationConfigurationHTC.nlevel(address(), value); return this; }
        /** Sets the specified value to the {@code clearFovDegree} field. */
        public XrFoveationConfigurationHTC.Buffer clearFovDegree(float value) { XrFoveationConfigurationHTC.nclearFovDegree(address(), value); return this; }
        /** Copies the specified {@link XrVector2f} to the {@code focalCenterOffset} field. */
        public XrFoveationConfigurationHTC.Buffer focalCenterOffset(XrVector2f value) { XrFoveationConfigurationHTC.nfocalCenterOffset(address(), value); return this; }
        /** Passes the {@code focalCenterOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFoveationConfigurationHTC.Buffer focalCenterOffset(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(focalCenterOffset()); return this; }

    }

}