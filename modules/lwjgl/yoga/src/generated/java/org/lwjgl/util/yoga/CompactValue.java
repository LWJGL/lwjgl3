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

import static org.lwjgl.util.yoga.Yoga.*;

/**
 * Unstable/private API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CompactValue {
 *     union {
 *         float value;
 *         uint32_t repr;
 *     };
 * }</code></pre>
 */
public class CompactValue extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VALUE,
        REPR;

    static {
        Layout layout = __struct(
            __union(
                __member(4),
                __member(4)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VALUE = layout.offsetof(1);
        REPR = layout.offsetof(2);
    }

    /**
     * Creates a {@code CompactValue} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CompactValue(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code value} field. */
    public float value() { return nvalue(address()); }
    /** @return the value of the {@code repr} field. */
    @NativeType("uint32_t")
    public int repr() { return nrepr(address()); }

    // -----------------------------------

    /** Returns a new {@code CompactValue} instance for the specified memory address. */
    public static CompactValue create(long address) {
        return wrap(CompactValue.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompactValue createSafe(long address) {
        return address == NULL ? null : wrap(CompactValue.class, address);
    }

    /**
     * Create a {@link CompactValue.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CompactValue.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompactValue.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #value}. */
    public static float nvalue(long struct) { return UNSAFE.getFloat(null, struct + CompactValue.VALUE); }
    /** Unsafe version of {@link #repr}. */
    public static int nrepr(long struct) { return UNSAFE.getInt(null, struct + CompactValue.REPR); }

    private static final int BIAS        = 0x20000000;
    private static final int PERCENT_BIT = 0x40000000;

    private static final int AUTO_BITS         = 0x7faaaaaa;
    private static final int ZERO_BITS_POINT   = 0x7f8f0f0f;
    private static final int ZERO_BITS_PERCENT = 0x7f80f0f0;

    public float decode() {
        int repr = repr();

        switch (repr) {
            case AUTO_BITS:
                return Float.NaN;
            case ZERO_BITS_POINT:
            case ZERO_BITS_PERCENT:
                return 0.0f;
        }

        if (Float.isNaN(value())) {
            return Float.NaN;
        }

        repr &= ~PERCENT_BIT;
        repr += BIAS;

        return Float.intBitsToFloat(repr);
    }

    public YGValue decode(YGValue __result) {
        int repr = repr();

        switch (repr) {
            case AUTO_BITS:
                return __result
                    .value(YGUndefined)
                    .unit(YGUnitAuto);
            case ZERO_BITS_POINT:
                return __result
                    .value(0.0f)
                    .unit(YGUnitPoint);
            case ZERO_BITS_PERCENT:
                return __result
                    .value(0.0f)
                    .unit(YGUnitPercent);
        }

        if (Float.isNaN(value())) {
            return __result
                .value(YGUndefined)
                .unit(YGUnitUndefined);
        }

        int data = repr;
        data &= ~PERCENT_BIT;
        data += BIAS;

        return __result
            .value(Float.intBitsToFloat(data))
            .unit((repr & PERCENT_BIT) != 0 ? YGUnitPercent : YGUnitPoint);
    }

    // -----------------------------------

    /** An array of {@link CompactValue} structs. */
    public static class Buffer extends StructBuffer<CompactValue, Buffer> {

        private static final CompactValue ELEMENT_FACTORY = CompactValue.create(-1L);

        /**
         * Creates a new {@code CompactValue.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CompactValue#SIZEOF}, and its mark will be undefined.
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
        protected CompactValue getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code value} field. */
        public float value() { return CompactValue.nvalue(address()); }
        /** @return the value of the {@code repr} field. */
        @NativeType("uint32_t")
        public int repr() { return CompactValue.nrepr(address()); }

    }

}