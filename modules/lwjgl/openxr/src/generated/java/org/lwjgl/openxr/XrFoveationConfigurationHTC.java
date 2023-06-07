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
 * Configuration of foveation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCFoveation XR_HTC_foveation} extension <b>must</b> be enabled prior to using {@link XrFoveationConfigurationHTC}</li>
 * <li>{@code level} <b>must</b> be a valid {@code XrFoveationLevelHTC} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrFoveationCustomModeInfoHTC}, {@link XrVector2f}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationConfigurationHTC {
 *     XrFoveationLevelHTC {@link #level};
 *     float {@link #clearFovDegree};
 *     {@link XrVector2f XrVector2f} {@link #focalCenterOffset};
 * }</code></pre>
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

    /** the pixel density drop level of periphery area specified by {@code XrFoveationLevelHTC} . */
    @NativeType("XrFoveationLevelHTC")
    public int level() { return nlevel(address()); }
    /** the value indicating the total horizontal and vertical field angle with the original pixel density level. {@code clearFovDegree} <b>must</b> be specified in degree, and <b>must</b> be in the range [0, 180]. */
    public float clearFovDegree() { return nclearFovDegree(address()); }
    /** the desired center offset of the field of view in NDC(normalized device coordinates) space. The x and y of {@code focalCenterOffset} <b>must</b> be in the range [-1, 1]. */
    public XrVector2f focalCenterOffset() { return nfocalCenterOffset(address()); }

    /** Sets the specified value to the {@link #level} field. */
    public XrFoveationConfigurationHTC level(@NativeType("XrFoveationLevelHTC") int value) { nlevel(address(), value); return this; }
    /** Sets the specified value to the {@link #clearFovDegree} field. */
    public XrFoveationConfigurationHTC clearFovDegree(float value) { nclearFovDegree(address(), value); return this; }
    /** Copies the specified {@link XrVector2f} to the {@link #focalCenterOffset} field. */
    public XrFoveationConfigurationHTC focalCenterOffset(XrVector2f value) { nfocalCenterOffset(address(), value); return this; }
    /** Passes the {@link #focalCenterOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
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
    @Nullable
    public static XrFoveationConfigurationHTC createSafe(long address) {
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
    @Nullable
    public static XrFoveationConfigurationHTC.Buffer createSafe(long address, int capacity) {
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
    public static int nlevel(long struct) { return UNSAFE.getInt(null, struct + XrFoveationConfigurationHTC.LEVEL); }
    /** Unsafe version of {@link #clearFovDegree}. */
    public static float nclearFovDegree(long struct) { return UNSAFE.getFloat(null, struct + XrFoveationConfigurationHTC.CLEARFOVDEGREE); }
    /** Unsafe version of {@link #focalCenterOffset}. */
    public static XrVector2f nfocalCenterOffset(long struct) { return XrVector2f.create(struct + XrFoveationConfigurationHTC.FOCALCENTEROFFSET); }

    /** Unsafe version of {@link #level(int) level}. */
    public static void nlevel(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationConfigurationHTC.LEVEL, value); }
    /** Unsafe version of {@link #clearFovDegree(float) clearFovDegree}. */
    public static void nclearFovDegree(long struct, float value) { UNSAFE.putFloat(null, struct + XrFoveationConfigurationHTC.CLEARFOVDEGREE, value); }
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
        protected XrFoveationConfigurationHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationConfigurationHTC#level} field. */
        @NativeType("XrFoveationLevelHTC")
        public int level() { return XrFoveationConfigurationHTC.nlevel(address()); }
        /** @return the value of the {@link XrFoveationConfigurationHTC#clearFovDegree} field. */
        public float clearFovDegree() { return XrFoveationConfigurationHTC.nclearFovDegree(address()); }
        /** @return a {@link XrVector2f} view of the {@link XrFoveationConfigurationHTC#focalCenterOffset} field. */
        public XrVector2f focalCenterOffset() { return XrFoveationConfigurationHTC.nfocalCenterOffset(address()); }

        /** Sets the specified value to the {@link XrFoveationConfigurationHTC#level} field. */
        public XrFoveationConfigurationHTC.Buffer level(@NativeType("XrFoveationLevelHTC") int value) { XrFoveationConfigurationHTC.nlevel(address(), value); return this; }
        /** Sets the specified value to the {@link XrFoveationConfigurationHTC#clearFovDegree} field. */
        public XrFoveationConfigurationHTC.Buffer clearFovDegree(float value) { XrFoveationConfigurationHTC.nclearFovDegree(address(), value); return this; }
        /** Copies the specified {@link XrVector2f} to the {@link XrFoveationConfigurationHTC#focalCenterOffset} field. */
        public XrFoveationConfigurationHTC.Buffer focalCenterOffset(XrVector2f value) { XrFoveationConfigurationHTC.nfocalCenterOffset(address(), value); return this; }
        /** Passes the {@link XrFoveationConfigurationHTC#focalCenterOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrFoveationConfigurationHTC.Buffer focalCenterOffset(java.util.function.Consumer<XrVector2f> consumer) { consumer.accept(focalCenterOffset()); return this; }

    }

}