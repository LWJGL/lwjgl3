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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGLayout {
 *     float positions[4];
 *     float dimensions[2];
 *     float margin[6];
 *     float border[6];
 *     float padding[6];
 *     YGDirection direction;
 *     uint32_t computedFlexBasisGeneration;
 *     {@link YGFloatOptional YGFloatOptional} computedFlexBasis;
 *     bool hadOverflow;
 *     uint32_t generationCount;
 *     YGDirection lastOwnerDirection;
 *     uint32_t nextCachedMeasurementsIndex;
 *     {@link YGCachedMeasurement YGCachedMeasurement} cachedMeasurements[16];
 *     float measuredDimensions[2];
 *     {@link YGCachedMeasurement YGCachedMeasurement} cachedLayout;
 *     bool didUseLegacyFlag;
 *     bool doesLegacyStretchFlagAffectsLayout;
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
        DIRECTION,
        COMPUTEDFLEXBASISGENERATION,
        COMPUTEDFLEXBASIS,
        HADOVERFLOW,
        GENERATIONCOUNT,
        LASTOWNERDIRECTION,
        NEXTCACHEDMEASUREMENTSINDEX,
        CACHEDMEASUREMENTS,
        MEASUREDDIMENSIONS,
        CACHEDLAYOUT,
        DIDUSELEGACYFLAG,
        DOESLEGACYSTRETCHFLAGAFFECTSLAYOUT;

    static {
        Layout layout = __struct(
            __array(4, 4),
            __array(4, 2),
            __array(4, 6),
            __array(4, 6),
            __array(4, 6),
            __member(4),
            __member(4),
            __member(YGFloatOptional.SIZEOF, YGFloatOptional.ALIGNOF),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __array(YGCachedMeasurement.SIZEOF, YGCachedMeasurement.ALIGNOF, 16),
            __array(4, 2),
            __member(YGCachedMeasurement.SIZEOF, YGCachedMeasurement.ALIGNOF),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        POSITIONS = layout.offsetof(0);
        DIMENSIONS = layout.offsetof(1);
        MARGIN = layout.offsetof(2);
        BORDER = layout.offsetof(3);
        PADDING = layout.offsetof(4);
        DIRECTION = layout.offsetof(5);
        COMPUTEDFLEXBASISGENERATION = layout.offsetof(6);
        COMPUTEDFLEXBASIS = layout.offsetof(7);
        HADOVERFLOW = layout.offsetof(8);
        GENERATIONCOUNT = layout.offsetof(9);
        LASTOWNERDIRECTION = layout.offsetof(10);
        NEXTCACHEDMEASUREMENTSINDEX = layout.offsetof(11);
        CACHEDMEASUREMENTS = layout.offsetof(12);
        MEASUREDDIMENSIONS = layout.offsetof(13);
        CACHEDLAYOUT = layout.offsetof(14);
        DIDUSELEGACYFLAG = layout.offsetof(15);
        DOESLEGACYSTRETCHFLAGAFFECTSLAYOUT = layout.offsetof(16);
    }

    /**
     * Creates a {@link YGLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code positions} field. */
    @NativeType("float[4]")
    public FloatBuffer positions() { return npositions(address()); }
    /** Returns the value at the specified index of the {@code positions} field. */
    public float positions(int index) { return npositions(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code dimensions} field. */
    @NativeType("float[2]")
    public FloatBuffer dimensions() { return ndimensions(address()); }
    /** Returns the value at the specified index of the {@code dimensions} field. */
    public float dimensions(int index) { return ndimensions(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code margin} field. */
    @NativeType("float[6]")
    public FloatBuffer margin() { return nmargin(address()); }
    /** Returns the value at the specified index of the {@code margin} field. */
    public float margin(int index) { return nmargin(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code border} field. */
    @NativeType("float[6]")
    public FloatBuffer border() { return nborder(address()); }
    /** Returns the value at the specified index of the {@code border} field. */
    public float border(int index) { return nborder(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code padding} field. */
    @NativeType("float[6]")
    public FloatBuffer padding() { return npadding(address()); }
    /** Returns the value at the specified index of the {@code padding} field. */
    public float padding(int index) { return npadding(address(), index); }
    /** Returns the value of the {@code direction} field. */
    @NativeType("YGDirection")
    public int direction() { return ndirection(address()); }
    /** Returns the value of the {@code computedFlexBasisGeneration} field. */
    @NativeType("uint32_t")
    public int computedFlexBasisGeneration() { return ncomputedFlexBasisGeneration(address()); }
    /** Returns a {@link YGFloatOptional} view of the {@code computedFlexBasis} field. */
    public YGFloatOptional computedFlexBasis() { return ncomputedFlexBasis(address()); }
    /** Returns the value of the {@code hadOverflow} field. */
    @NativeType("bool")
    public boolean hadOverflow() { return nhadOverflow(address()); }
    /** Returns the value of the {@code generationCount} field. */
    @NativeType("uint32_t")
    public int generationCount() { return ngenerationCount(address()); }
    /** Returns the value of the {@code lastOwnerDirection} field. */
    @NativeType("YGDirection")
    public int lastOwnerDirection() { return nlastOwnerDirection(address()); }
    /** Returns the value of the {@code nextCachedMeasurementsIndex} field. */
    @NativeType("uint32_t")
    public int nextCachedMeasurementsIndex() { return nnextCachedMeasurementsIndex(address()); }
    /** Returns a {@link YGCachedMeasurement}.Buffer view of the {@code cachedMeasurements} field. */
    @NativeType("YGCachedMeasurement[16]")
    public YGCachedMeasurement.Buffer cachedMeasurements() { return ncachedMeasurements(address()); }
    /** Returns a {@link YGCachedMeasurement} view of the struct at the specified index of the {@code cachedMeasurements} field. */
    public YGCachedMeasurement cachedMeasurements(int index) { return ncachedMeasurements(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code measuredDimensions} field. */
    @NativeType("float[2]")
    public FloatBuffer measuredDimensions() { return nmeasuredDimensions(address()); }
    /** Returns the value at the specified index of the {@code measuredDimensions} field. */
    public float measuredDimensions(int index) { return nmeasuredDimensions(address(), index); }
    /** Returns a {@link YGCachedMeasurement} view of the {@code cachedLayout} field. */
    public YGCachedMeasurement cachedLayout() { return ncachedLayout(address()); }
    /** Returns the value of the {@code didUseLegacyFlag} field. */
    @NativeType("bool")
    public boolean didUseLegacyFlag() { return ndidUseLegacyFlag(address()); }
    /** Returns the value of the {@code doesLegacyStretchFlagAffectsLayout} field. */
    @NativeType("bool")
    public boolean doesLegacyStretchFlagAffectsLayout() { return ndoesLegacyStretchFlagAffectsLayout(address()); }

    // -----------------------------------

    /** Returns a new {@link YGLayout} instance for the specified memory address. */
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
    public static FloatBuffer nmargin(long struct) { return memFloatBuffer(struct + YGLayout.MARGIN, 6); }
    /** Unsafe version of {@link #margin(int) margin}. */
    public static float nmargin(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.MARGIN + check(index, 6) * 4);
    }
    /** Unsafe version of {@link #border}. */
    public static FloatBuffer nborder(long struct) { return memFloatBuffer(struct + YGLayout.BORDER, 6); }
    /** Unsafe version of {@link #border(int) border}. */
    public static float nborder(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.BORDER + check(index, 6) * 4);
    }
    /** Unsafe version of {@link #padding}. */
    public static FloatBuffer npadding(long struct) { return memFloatBuffer(struct + YGLayout.PADDING, 6); }
    /** Unsafe version of {@link #padding(int) padding}. */
    public static float npadding(long struct, int index) {
        return UNSAFE.getFloat(null, struct + YGLayout.PADDING + check(index, 6) * 4);
    }
    /** Unsafe version of {@link #direction}. */
    public static int ndirection(long struct) { return UNSAFE.getInt(null, struct + YGLayout.DIRECTION); }
    /** Unsafe version of {@link #computedFlexBasisGeneration}. */
    public static int ncomputedFlexBasisGeneration(long struct) { return UNSAFE.getInt(null, struct + YGLayout.COMPUTEDFLEXBASISGENERATION); }
    /** Unsafe version of {@link #computedFlexBasis}. */
    public static YGFloatOptional ncomputedFlexBasis(long struct) { return YGFloatOptional.create(struct + YGLayout.COMPUTEDFLEXBASIS); }
    /** Unsafe version of {@link #hadOverflow}. */
    public static boolean nhadOverflow(long struct) { return UNSAFE.getByte(null, struct + YGLayout.HADOVERFLOW) != 0; }
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
    /** Unsafe version of {@link #didUseLegacyFlag}. */
    public static boolean ndidUseLegacyFlag(long struct) { return UNSAFE.getByte(null, struct + YGLayout.DIDUSELEGACYFLAG) != 0; }
    /** Unsafe version of {@link #doesLegacyStretchFlagAffectsLayout}. */
    public static boolean ndoesLegacyStretchFlagAffectsLayout(long struct) { return UNSAFE.getByte(null, struct + YGLayout.DOESLEGACYSTRETCHFLAGAFFECTSLAYOUT) != 0; }

    // -----------------------------------

    /** An array of {@link YGLayout} structs. */
    public static class Buffer extends StructBuffer<YGLayout, Buffer> {

        private static final YGLayout ELEMENT_FACTORY = YGLayout.create(-1L);

        /**
         * Creates a new {@link YGLayout.Buffer} instance backed by the specified container.
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

        /** Returns a {@link FloatBuffer} view of the {@code positions} field. */
        @NativeType("float[4]")
        public FloatBuffer positions() { return YGLayout.npositions(address()); }
        /** Returns the value at the specified index of the {@code positions} field. */
        public float positions(int index) { return YGLayout.npositions(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code dimensions} field. */
        @NativeType("float[2]")
        public FloatBuffer dimensions() { return YGLayout.ndimensions(address()); }
        /** Returns the value at the specified index of the {@code dimensions} field. */
        public float dimensions(int index) { return YGLayout.ndimensions(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code margin} field. */
        @NativeType("float[6]")
        public FloatBuffer margin() { return YGLayout.nmargin(address()); }
        /** Returns the value at the specified index of the {@code margin} field. */
        public float margin(int index) { return YGLayout.nmargin(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code border} field. */
        @NativeType("float[6]")
        public FloatBuffer border() { return YGLayout.nborder(address()); }
        /** Returns the value at the specified index of the {@code border} field. */
        public float border(int index) { return YGLayout.nborder(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code padding} field. */
        @NativeType("float[6]")
        public FloatBuffer padding() { return YGLayout.npadding(address()); }
        /** Returns the value at the specified index of the {@code padding} field. */
        public float padding(int index) { return YGLayout.npadding(address(), index); }
        /** Returns the value of the {@code direction} field. */
        @NativeType("YGDirection")
        public int direction() { return YGLayout.ndirection(address()); }
        /** Returns the value of the {@code computedFlexBasisGeneration} field. */
        @NativeType("uint32_t")
        public int computedFlexBasisGeneration() { return YGLayout.ncomputedFlexBasisGeneration(address()); }
        /** Returns a {@link YGFloatOptional} view of the {@code computedFlexBasis} field. */
        public YGFloatOptional computedFlexBasis() { return YGLayout.ncomputedFlexBasis(address()); }
        /** Returns the value of the {@code hadOverflow} field. */
        @NativeType("bool")
        public boolean hadOverflow() { return YGLayout.nhadOverflow(address()); }
        /** Returns the value of the {@code generationCount} field. */
        @NativeType("uint32_t")
        public int generationCount() { return YGLayout.ngenerationCount(address()); }
        /** Returns the value of the {@code lastOwnerDirection} field. */
        @NativeType("YGDirection")
        public int lastOwnerDirection() { return YGLayout.nlastOwnerDirection(address()); }
        /** Returns the value of the {@code nextCachedMeasurementsIndex} field. */
        @NativeType("uint32_t")
        public int nextCachedMeasurementsIndex() { return YGLayout.nnextCachedMeasurementsIndex(address()); }
        /** Returns a {@link YGCachedMeasurement}.Buffer view of the {@code cachedMeasurements} field. */
        @NativeType("YGCachedMeasurement[16]")
        public YGCachedMeasurement.Buffer cachedMeasurements() { return YGLayout.ncachedMeasurements(address()); }
        /** Returns a {@link YGCachedMeasurement} view of the struct at the specified index of the {@code cachedMeasurements} field. */
        public YGCachedMeasurement cachedMeasurements(int index) { return YGLayout.ncachedMeasurements(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code measuredDimensions} field. */
        @NativeType("float[2]")
        public FloatBuffer measuredDimensions() { return YGLayout.nmeasuredDimensions(address()); }
        /** Returns the value at the specified index of the {@code measuredDimensions} field. */
        public float measuredDimensions(int index) { return YGLayout.nmeasuredDimensions(address(), index); }
        /** Returns a {@link YGCachedMeasurement} view of the {@code cachedLayout} field. */
        public YGCachedMeasurement cachedLayout() { return YGLayout.ncachedLayout(address()); }
        /** Returns the value of the {@code didUseLegacyFlag} field. */
        @NativeType("bool")
        public boolean didUseLegacyFlag() { return YGLayout.ndidUseLegacyFlag(address()); }
        /** Returns the value of the {@code doesLegacyStretchFlagAffectsLayout} field. */
        @NativeType("bool")
        public boolean doesLegacyStretchFlagAffectsLayout() { return YGLayout.ndoesLegacyStretchFlagAffectsLayout(address()); }

    }

}