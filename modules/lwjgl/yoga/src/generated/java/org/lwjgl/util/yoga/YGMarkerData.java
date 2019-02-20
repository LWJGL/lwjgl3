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
 * union YGMarkerData {
 *     {@link YGMarkerLayoutData YGMarkerLayoutData} * layout;
 *     {@link YGMarkerNoData YGMarkerNoData} * noData;
 * }</code></pre>
 */
public class YGMarkerData extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LAYOUT,
        NODATA;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LAYOUT = layout.offsetof(0);
        NODATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code YGMarkerData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGMarkerData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link YGMarkerLayoutData} view of the struct pointed to by the {@code layout} field. */
    @NativeType("YGMarkerLayoutData *")
    public YGMarkerLayoutData layout() { return nlayout(address()); }
    /** Returns a {@link YGMarkerNoData} view of the struct pointed to by the {@code noData} field. */
    @NativeType("YGMarkerNoData *")
    public YGMarkerNoData noData() { return nnoData(address()); }

    // -----------------------------------

    /** Returns a new {@code YGMarkerData} instance for the specified memory address. */
    public static YGMarkerData create(long address) {
        return wrap(YGMarkerData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGMarkerData createSafe(long address) {
        return address == NULL ? null : wrap(YGMarkerData.class, address);
    }

    /**
     * Create a {@link YGMarkerData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGMarkerData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGMarkerData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #layout}. */
    public static YGMarkerLayoutData nlayout(long struct) { return YGMarkerLayoutData.create(memGetAddress(struct + YGMarkerData.LAYOUT)); }
    /** Unsafe version of {@link #noData}. */
    public static YGMarkerNoData nnoData(long struct) { return YGMarkerNoData.create(memGetAddress(struct + YGMarkerData.NODATA)); }

    // -----------------------------------

    /** An array of {@link YGMarkerData} structs. */
    public static class Buffer extends StructBuffer<YGMarkerData, Buffer> {

        private static final YGMarkerData ELEMENT_FACTORY = YGMarkerData.create(-1L);

        /**
         * Creates a new {@code YGMarkerData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGMarkerData#SIZEOF}, and its mark will be undefined.
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
        protected YGMarkerData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link YGMarkerLayoutData} view of the struct pointed to by the {@code layout} field. */
        @NativeType("YGMarkerLayoutData *")
        public YGMarkerLayoutData layout() { return YGMarkerData.nlayout(address()); }
        /** Returns a {@link YGMarkerNoData} view of the struct pointed to by the {@code noData} field. */
        @NativeType("YGMarkerNoData *")
        public YGMarkerNoData noData() { return YGMarkerData.nnoData(address()); }

    }

}