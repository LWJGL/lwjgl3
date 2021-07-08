/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Unstable/private API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGCachedMeasurement {
 *     float availableWidth;
 *     float availableHeight;
 *     YGMeasureMode widthMeasureMode;
 *     YGMeasureMode heightMeasureMode;
 *     float computedWidth;
 *     float computedHeight;
 * }</code></pre>
 */
public class YGCachedMeasurement extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        AVAILABLEWIDTH,
        AVAILABLEHEIGHT,
        WIDTHMEASUREMODE,
        HEIGHTMEASUREMODE,
        COMPUTEDWIDTH,
        COMPUTEDHEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        AVAILABLEWIDTH = layout.offsetof(0);
        AVAILABLEHEIGHT = layout.offsetof(1);
        WIDTHMEASUREMODE = layout.offsetof(2);
        HEIGHTMEASUREMODE = layout.offsetof(3);
        COMPUTEDWIDTH = layout.offsetof(4);
        COMPUTEDHEIGHT = layout.offsetof(5);
    }

    /**
     * Creates a {@code YGCachedMeasurement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGCachedMeasurement(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code availableWidth} field. */
    public float availableWidth() { return navailableWidth(address()); }
    /** @return the value of the {@code availableHeight} field. */
    public float availableHeight() { return navailableHeight(address()); }
    /** @return the value of the {@code widthMeasureMode} field. */
    @NativeType("YGMeasureMode")
    public int widthMeasureMode() { return nwidthMeasureMode(address()); }
    /** @return the value of the {@code heightMeasureMode} field. */
    @NativeType("YGMeasureMode")
    public int heightMeasureMode() { return nheightMeasureMode(address()); }
    /** @return the value of the {@code computedWidth} field. */
    public float computedWidth() { return ncomputedWidth(address()); }
    /** @return the value of the {@code computedHeight} field. */
    public float computedHeight() { return ncomputedHeight(address()); }

    // -----------------------------------

    /** Returns a new {@code YGCachedMeasurement} instance for the specified memory address. */
    public static YGCachedMeasurement create(long address) {
        return wrap(YGCachedMeasurement.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGCachedMeasurement createSafe(long address) {
        return address == NULL ? null : wrap(YGCachedMeasurement.class, address);
    }

    /**
     * Create a {@link YGCachedMeasurement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGCachedMeasurement.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGCachedMeasurement.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #availableWidth}. */
    public static float navailableWidth(long struct) { return UNSAFE.getFloat(null, struct + YGCachedMeasurement.AVAILABLEWIDTH); }
    /** Unsafe version of {@link #availableHeight}. */
    public static float navailableHeight(long struct) { return UNSAFE.getFloat(null, struct + YGCachedMeasurement.AVAILABLEHEIGHT); }
    /** Unsafe version of {@link #widthMeasureMode}. */
    public static int nwidthMeasureMode(long struct) { return UNSAFE.getInt(null, struct + YGCachedMeasurement.WIDTHMEASUREMODE); }
    /** Unsafe version of {@link #heightMeasureMode}. */
    public static int nheightMeasureMode(long struct) { return UNSAFE.getInt(null, struct + YGCachedMeasurement.HEIGHTMEASUREMODE); }
    /** Unsafe version of {@link #computedWidth}. */
    public static float ncomputedWidth(long struct) { return UNSAFE.getFloat(null, struct + YGCachedMeasurement.COMPUTEDWIDTH); }
    /** Unsafe version of {@link #computedHeight}. */
    public static float ncomputedHeight(long struct) { return UNSAFE.getFloat(null, struct + YGCachedMeasurement.COMPUTEDHEIGHT); }

    // -----------------------------------

    /** An array of {@link YGCachedMeasurement} structs. */
    public static class Buffer extends StructBuffer<YGCachedMeasurement, Buffer> {

        private static final YGCachedMeasurement ELEMENT_FACTORY = YGCachedMeasurement.create(-1L);

        /**
         * Creates a new {@code YGCachedMeasurement.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGCachedMeasurement#SIZEOF}, and its mark will be undefined.
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
        protected YGCachedMeasurement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code availableWidth} field. */
        public float availableWidth() { return YGCachedMeasurement.navailableWidth(address()); }
        /** @return the value of the {@code availableHeight} field. */
        public float availableHeight() { return YGCachedMeasurement.navailableHeight(address()); }
        /** @return the value of the {@code widthMeasureMode} field. */
        @NativeType("YGMeasureMode")
        public int widthMeasureMode() { return YGCachedMeasurement.nwidthMeasureMode(address()); }
        /** @return the value of the {@code heightMeasureMode} field. */
        @NativeType("YGMeasureMode")
        public int heightMeasureMode() { return YGCachedMeasurement.nheightMeasureMode(address()); }
        /** @return the value of the {@code computedWidth} field. */
        public float computedWidth() { return YGCachedMeasurement.ncomputedWidth(address()); }
        /** @return the value of the {@code computedHeight} field. */
        public float computedHeight() { return YGCachedMeasurement.ncomputedHeight(address()); }

    }

}