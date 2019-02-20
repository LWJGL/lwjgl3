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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGMarkerLayoutData {
 *     int layouts;
 *     int measures;
 *     int maxMeasureCache;
 *     int cachedLayouts;
 *     int cachedMeasures;
 * }</code></pre>
 */
public class YGMarkerLayoutData extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LAYOUTS,
        MEASURES,
        MAXMEASURECACHE,
        CACHEDLAYOUTS,
        CACHEDMEASURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LAYOUTS = layout.offsetof(0);
        MEASURES = layout.offsetof(1);
        MAXMEASURECACHE = layout.offsetof(2);
        CACHEDLAYOUTS = layout.offsetof(3);
        CACHEDMEASURES = layout.offsetof(4);
    }

    /**
     * Creates a {@code YGMarkerLayoutData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGMarkerLayoutData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code layouts} field. */
    public int layouts() { return nlayouts(address()); }
    /** Returns the value of the {@code measures} field. */
    public int measures() { return nmeasures(address()); }
    /** Returns the value of the {@code maxMeasureCache} field. */
    public int maxMeasureCache() { return nmaxMeasureCache(address()); }
    /** Returns the value of the {@code cachedLayouts} field. */
    public int cachedLayouts() { return ncachedLayouts(address()); }
    /** Returns the value of the {@code cachedMeasures} field. */
    public int cachedMeasures() { return ncachedMeasures(address()); }

    // -----------------------------------

    /** Returns a new {@code YGMarkerLayoutData} instance for the specified memory address. */
    public static YGMarkerLayoutData create(long address) {
        return wrap(YGMarkerLayoutData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGMarkerLayoutData createSafe(long address) {
        return address == NULL ? null : wrap(YGMarkerLayoutData.class, address);
    }

    /**
     * Create a {@link YGMarkerLayoutData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGMarkerLayoutData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGMarkerLayoutData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #layouts}. */
    public static int nlayouts(long struct) { return UNSAFE.getInt(null, struct + YGMarkerLayoutData.LAYOUTS); }
    /** Unsafe version of {@link #measures}. */
    public static int nmeasures(long struct) { return UNSAFE.getInt(null, struct + YGMarkerLayoutData.MEASURES); }
    /** Unsafe version of {@link #maxMeasureCache}. */
    public static int nmaxMeasureCache(long struct) { return UNSAFE.getInt(null, struct + YGMarkerLayoutData.MAXMEASURECACHE); }
    /** Unsafe version of {@link #cachedLayouts}. */
    public static int ncachedLayouts(long struct) { return UNSAFE.getInt(null, struct + YGMarkerLayoutData.CACHEDLAYOUTS); }
    /** Unsafe version of {@link #cachedMeasures}. */
    public static int ncachedMeasures(long struct) { return UNSAFE.getInt(null, struct + YGMarkerLayoutData.CACHEDMEASURES); }

    // -----------------------------------

    /** An array of {@link YGMarkerLayoutData} structs. */
    public static class Buffer extends StructBuffer<YGMarkerLayoutData, Buffer> {

        private static final YGMarkerLayoutData ELEMENT_FACTORY = YGMarkerLayoutData.create(-1L);

        /**
         * Creates a new {@code YGMarkerLayoutData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGMarkerLayoutData#SIZEOF}, and its mark will be undefined.
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
        protected YGMarkerLayoutData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code layouts} field. */
        public int layouts() { return YGMarkerLayoutData.nlayouts(address()); }
        /** Returns the value of the {@code measures} field. */
        public int measures() { return YGMarkerLayoutData.nmeasures(address()); }
        /** Returns the value of the {@code maxMeasureCache} field. */
        public int maxMeasureCache() { return YGMarkerLayoutData.nmaxMeasureCache(address()); }
        /** Returns the value of the {@code cachedLayouts} field. */
        public int cachedLayouts() { return YGMarkerLayoutData.ncachedLayouts(address()); }
        /** Returns the value of the {@code cachedMeasures} field. */
        public int cachedMeasures() { return YGMarkerLayoutData.ncachedMeasures(address()); }

    }

}