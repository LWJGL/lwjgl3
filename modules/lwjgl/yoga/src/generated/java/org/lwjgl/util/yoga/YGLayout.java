/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Unstable/private API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGLayout {
 *     float positions[4];
 *     float dimensions[2];
 *     float margin[4];
 *     float border[4];
 *     float padding[4];
 *     YGDirection direction : 2;
 *     bool didUseLegacyFlag : 1;
 *     bool doesLegacyStretchFlagAffectsLayout : 1;
 *     bool hadOverflow : 1;
 *     uint32_t computedFlexBasisGeneration;
 *     {@link YGFloatOptional YGFloatOptional} computedFlexBasis;
 *     uint32_t generationCount;
 *     YGDirection lastOwnerDirection;
 *     uint32_t nextCachedMeasurementsIndex;
 *     {@link YGCachedMeasurement YGCachedMeasurement} cachedMeasurements[16];
 *     float measuredDimensions[2];
 *     {@link YGCachedMeasurement YGCachedMeasurement} cachedLayout;
 * }</code></pre>
 */
public class YGLayout extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        POSITIONS,
        DIMENSIONS,
        MARGIN,
        BORDER,
        PADDING,
        FLAGS,
        COMPUTEDFLEXBASISGENERATION,
        COMPUTEDFLEXBASIS,
        GENERATIONCOUNT,
        LASTOWNERDIRECTION,
        NEXTCACHEDMEASUREMENTSINDEX,
        CACHEDMEASUREMENTS,
        MEASUREDDIMENSIONS,
        CACHEDLAYOUT;

    static {
        Layout layout = __struct(
            __array(4, 4),
            __array(4, 2),
            __array(4, 4),
            __array(4, 4),
            __array(4, 4),
            __member(1),
            __member(4),
            __member(YGFloatOptional.SIZEOF, YGFloatOptional.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __array(YGCachedMeasurement.SIZEOF, YGCachedMeasurement.ALIGNOF, 16),
            __array(4, 2),
            __member(YGCachedMeasurement.SIZEOF, YGCachedMeasurement.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITIONS = layout.offsetof(0);
        DIMENSIONS = layout.offsetof(1);
        MARGIN = layout.offsetof(2);
        BORDER = layout.offsetof(3);
        PADDING = layout.offsetof(4);
        FLAGS = layout.offsetof(5);
        COMPUTEDFLEXBASISGENERATION = layout.offsetof(6);
        COMPUTEDFLEXBASIS = layout.offsetof(7);
        GENERATIONCOUNT = layout.offsetof(8);
        LASTOWNERDIRECTION = layout.offsetof(9);
        NEXTCACHEDMEASUREMENTSINDEX = layout.offsetof(10);
        CACHEDMEASUREMENTS = layout.offsetof(11);
        MEASUREDDIMENSIONS = layout.offsetof(12);
        CACHEDLAYOUT = layout.offsetof(13);
    }

    /**
     * Creates a {@code YGLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link FloatBuffer} view of the {@code positions} field. */
    @NativeType("float[4]")
    public FloatBuffer positions() { return npositions(address()); }
    /** @return the value at the specified index of the {@code positions} field. */
    public float positions(int index) { return npositions(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code dimensions} field. */
    @NativeType("float[2]")
    public FloatBuffer dimensions() { return ndimensions(address()); }
    /** @return the value at the specified index of the {@code dimensions} field. */
    public float dimensions(int index) { return ndimensions(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code margin} field. */
    @NativeType("float[4]")
    public FloatBuffer margin() { return nmargin(address()); }
    /** @return the value at the specified index of the {@code margin} field. */
    public float margin(int index) { return nmargin(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code border} field. */
    @NativeType("float[4]")
    public FloatBuffer border() { return nborder(address()); }
    /** @return the value at the specified index of the {@code border} field. */
    public float border(int index) { return nborder(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code padding} field. */
    @NativeType("float[4]")
    public FloatBuffer padding() { return npadding(address()); }
    /** @return the value at the specified index of the {@code padding} field. */
    public float padding(int index) { return npadding(address(), index); }
    /** @return the value of the {@code direction} field. */
    @NativeType("YGDirection")
    public int direction() { return ndirection(address()); }
    /** @return the value of the {@code didUseLegacyFlag} field. */
    @NativeType("bool")
    public boolean didUseLegacyFlag() { return ndidUseLegacyFlag(address()); }
    /** @return the value of the {@code doesLegacyStretchFlagAffectsLayout} field. */
    @NativeType("bool")
    public boolean doesLegacyStretchFlagAffectsLayout() { return ndoesLegacyStretchFlagAffectsLayout(address()); }
    /** @return the value of the {@code hadOverflow} field. */
    @NativeType("bool")
    public boolean hadOverflow() { return nhadOverflow(address()); }
    /** @return the value of the {@code computedFlexBasisGeneration} field. */
    @NativeType("uint32_t")
    public int computedFlexBasisGeneration() { return ncomputedFlexBasisGeneration(address()); }
    /** @return a {@link YGFloatOptional} view of the {@code computedFlexBasis} field. */
    public YGFloatOptional computedFlexBasis() { return ncomputedFlexBasis(address()); }
    /** @return the value of the {@code generationCount} field. */
    @NativeType("uint32_t")
    public int generationCount() { return ngenerationCount(address()); }
    /** @return the value of the {@code lastOwnerDirection} field. */
    @NativeType("YGDirection")
    public int lastOwnerDirection() { return nlastOwnerDirection(address()); }
    /** @return the value of the {@code nextCachedMeasurementsIndex} field. */
    @NativeType("uint32_t")
    public int nextCachedMeasurementsIndex() { return nnextCachedMeasurementsIndex(address()); }
    /** @return a {@link YGCachedMeasurement}.Buffer view of the {@code cachedMeasurements} field. */
    @NativeType("YGCachedMeasurement[16]")
    public YGCachedMeasurement.Buffer cachedMeasurements() { return ncachedMeasurements(address()); }
    /** @return a {@link YGCachedMeasurement} view of the struct at the specified index of the {@code cachedMeasurements} field. */
    public YGCachedMeasurement cachedMeasurements(int index) { return ncachedMeasurements(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code measuredDimensions} field. */
    @NativeType("float[2]")
    public FloatBuffer measuredDimensions() { return nmeasuredDimensions(address()); }
    /** @return the value at the specified index of the {@code measuredDimensions} field. */
    public float measuredDimensions(int index) { return nmeasuredDimensions(address(), index); }
    /** @return a {@link YGCachedMeasurement} view of the {@code cachedLayout} field. */
    public YGCachedMeasurement cachedLayout() { return ncachedLayout(address()); }

    // -----------------------------------

    /** Returns a new {@code YGLayout} instance for the specified memory address. */
    public static YGLayout create(long address) {
        return wrap(YGLayout.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGLayout createSafe(long address) {
        return address == NULL ? null : wrap(YGLayout.class, address);
    }

    /**
     * Create a {@link YGLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGLayout.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGLayout.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #positions}. */
    public static FloatBuffer npositions(long struct) { return memFloatBuffer(struct + YGLayout.POSITIONS, 4); }
    /** Unsafe version of {@link #positions(int) positions}. */
    public static float npositions(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.POSITIONS + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #dimensions}. */
    public static FloatBuffer ndimensions(long struct) { return memFloatBuffer(struct + YGLayout.DIMENSIONS, 2); }
    /** Unsafe version of {@link #dimensions(int) dimensions}. */
    public static float ndimensions(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.DIMENSIONS + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #margin}. */
    public static FloatBuffer nmargin(long struct) { return memFloatBuffer(struct + YGLayout.MARGIN, 4); }
    /** Unsafe version of {@link #margin(int) margin}. */
    public static float nmargin(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.MARGIN + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #border}. */
    public static FloatBuffer nborder(long struct) { return memFloatBuffer(struct + YGLayout.BORDER, 4); }
    /** Unsafe version of {@link #border(int) border}. */
    public static float nborder(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.BORDER + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #padding}. */
    public static FloatBuffer npadding(long struct) { return memFloatBuffer(struct + YGLayout.PADDING, 4); }
    /** Unsafe version of {@link #padding(int) padding}. */
    public static float npadding(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.PADDING + check(index, 4) * 4);
    }
    public static byte nflags(long struct) { return UNSAFE.getByte(null, struct + YGLayout.FLAGS); }
    /** Unsafe version of {@link #direction}. */
    public static int ndirection(long struct) { return nflags(struct) & 0b11; }
    /** Unsafe version of {@link #didUseLegacyFlag}. */
    public static boolean ndidUseLegacyFlag(long struct) { return ((nflags(struct) >>> 2) & 0b1) != 0; }
    /** Unsafe version of {@link #doesLegacyStretchFlagAffectsLayout}. */
    public static boolean ndoesLegacyStretchFlagAffectsLayout(long struct) { return ((nflags(struct) >>> 3) & 0b1) != 0; }
    /** Unsafe version of {@link #hadOverflow}. */
    public static boolean nhadOverflow(long struct) { return ((nflags(struct) >>> 4) & 0b1) != 0; }
    /** Unsafe version of {@link #computedFlexBasisGeneration}. */
    public static int ncomputedFlexBasisGeneration(long struct) { return UNSAFE.getInt(null, struct + YGLayout.COMPUTEDFLEXBASISGENERATION); }
    /** Unsafe version of {@link #computedFlexBasis}. */
    public static YGFloatOptional ncomputedFlexBasis(long struct) { return YGFloatOptional.create(struct + YGLayout.COMPUTEDFLEXBASIS); }
    /** Unsafe version of {@link #generationCount}. */
    public static int ngenerationCount(long struct) { return UNSAFE.getInt(null, struct + YGLayout.GENERATIONCOUNT); }
    /** Unsafe version of {@link #lastOwnerDirection}. */
    public static int nlastOwnerDirection(long struct) { return UNSAFE.getInt(null, struct + YGLayout.LASTOWNERDIRECTION); }
    /** Unsafe version of {@link #nextCachedMeasurementsIndex}. */
    public static int nnextCachedMeasurementsIndex(long struct) { return UNSAFE.getInt(null, struct + YGLayout.NEXTCACHEDMEASUREMENTSINDEX); }
    /** Unsafe version of {@link #cachedMeasurements}. */
    public static YGCachedMeasurement.Buffer ncachedMeasurements(long struct) { return YGCachedMeasurement.create(struct + YGLayout.CACHEDMEASUREMENTS, 16); }
    /** Unsafe version of {@link #cachedMeasurements(int) cachedMeasurements}. */
    public static YGCachedMeasurement ncachedMeasurements(long struct, int index) {
        return YGCachedMeasurement.create(struct + YGLayout.CACHEDMEASUREMENTS + check(index, 16) * YGCachedMeasurement.SIZEOF);
    }
    /** Unsafe version of {@link #measuredDimensions}. */
    public static FloatBuffer nmeasuredDimensions(long struct) { return memFloatBuffer(struct + YGLayout.MEASUREDDIMENSIONS, 2); }
    /** Unsafe version of {@link #measuredDimensions(int) measuredDimensions}. */
    public static float nmeasuredDimensions(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.MEASUREDDIMENSIONS + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #cachedLayout}. */
    public static YGCachedMeasurement ncachedLayout(long struct) { return YGCachedMeasurement.create(struct + YGLayout.CACHEDLAYOUT); }

    // -----------------------------------

    /** An array of {@link YGLayout} structs. */
    public static class Buffer extends StructBuffer<YGLayout, Buffer> {

        private static final YGLayout ELEMENT_FACTORY = YGLayout.create(-1L);

        /**
         * Creates a new {@code YGLayout.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGLayout#SIZEOF}, and its mark will be undefined.
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
        protected YGLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@code positions} field. */
        @NativeType("float[4]")
        public FloatBuffer positions() { return YGLayout.npositions(address()); }
        /** @return the value at the specified index of the {@code positions} field. */
        public float positions(int index) { return YGLayout.npositions(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code dimensions} field. */
        @NativeType("float[2]")
        public FloatBuffer dimensions() { return YGLayout.ndimensions(address()); }
        /** @return the value at the specified index of the {@code dimensions} field. */
        public float dimensions(int index) { return YGLayout.ndimensions(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code margin} field. */
        @NativeType("float[4]")
        public FloatBuffer margin() { return YGLayout.nmargin(address()); }
        /** @return the value at the specified index of the {@code margin} field. */
        public float margin(int index) { return YGLayout.nmargin(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code border} field. */
        @NativeType("float[4]")
        public FloatBuffer border() { return YGLayout.nborder(address()); }
        /** @return the value at the specified index of the {@code border} field. */
        public float border(int index) { return YGLayout.nborder(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code padding} field. */
        @NativeType("float[4]")
        public FloatBuffer padding() { return YGLayout.npadding(address()); }
        /** @return the value at the specified index of the {@code padding} field. */
        public float padding(int index) { return YGLayout.npadding(address(), index); }
        /** @return the value of the {@code direction} field. */
        @NativeType("YGDirection")
        public int direction() { return YGLayout.ndirection(address()); }
        /** @return the value of the {@code didUseLegacyFlag} field. */
        @NativeType("bool")
        public boolean didUseLegacyFlag() { return YGLayout.ndidUseLegacyFlag(address()); }
        /** @return the value of the {@code doesLegacyStretchFlagAffectsLayout} field. */
        @NativeType("bool")
        public boolean doesLegacyStretchFlagAffectsLayout() { return YGLayout.ndoesLegacyStretchFlagAffectsLayout(address()); }
        /** @return the value of the {@code hadOverflow} field. */
        @NativeType("bool")
        public boolean hadOverflow() { return YGLayout.nhadOverflow(address()); }
        /** @return the value of the {@code computedFlexBasisGeneration} field. */
        @NativeType("uint32_t")
        public int computedFlexBasisGeneration() { return YGLayout.ncomputedFlexBasisGeneration(address()); }
        /** @return a {@link YGFloatOptional} view of the {@code computedFlexBasis} field. */
        public YGFloatOptional computedFlexBasis() { return YGLayout.ncomputedFlexBasis(address()); }
        /** @return the value of the {@code generationCount} field. */
        @NativeType("uint32_t")
        public int generationCount() { return YGLayout.ngenerationCount(address()); }
        /** @return the value of the {@code lastOwnerDirection} field. */
        @NativeType("YGDirection")
        public int lastOwnerDirection() { return YGLayout.nlastOwnerDirection(address()); }
        /** @return the value of the {@code nextCachedMeasurementsIndex} field. */
        @NativeType("uint32_t")
        public int nextCachedMeasurementsIndex() { return YGLayout.nnextCachedMeasurementsIndex(address()); }
        /** @return a {@link YGCachedMeasurement}.Buffer view of the {@code cachedMeasurements} field. */
        @NativeType("YGCachedMeasurement[16]")
        public YGCachedMeasurement.Buffer cachedMeasurements() { return YGLayout.ncachedMeasurements(address()); }
        /** @return a {@link YGCachedMeasurement} view of the struct at the specified index of the {@code cachedMeasurements} field. */
        public YGCachedMeasurement cachedMeasurements(int index) { return YGLayout.ncachedMeasurements(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code measuredDimensions} field. */
        @NativeType("float[2]")
        public FloatBuffer measuredDimensions() { return YGLayout.nmeasuredDimensions(address()); }
        /** @return the value at the specified index of the {@code measuredDimensions} field. */
        public float measuredDimensions(int index) { return YGLayout.nmeasuredDimensions(address(), index); }
        /** @return a {@link YGCachedMeasurement} view of the {@code cachedLayout} field. */
        public YGCachedMeasurement cachedLayout() { return YGLayout.ncachedLayout(address()); }

    }

}