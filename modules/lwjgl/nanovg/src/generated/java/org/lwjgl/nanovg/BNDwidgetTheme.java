/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct BNDwidgetTheme {
 *     {@link NVGColor NVGcolor} outlineColor;
 *     {@link NVGColor NVGcolor} itemColor;
 *     {@link NVGColor NVGcolor} innerColor;
 *     {@link NVGColor NVGcolor} innerSelectedColor;
 *     {@link NVGColor NVGcolor} textColor;
 *     {@link NVGColor NVGcolor} textSelectedColor;
 *     int shadeTop;
 *     int shadeDown;
 * }}</pre>
 */
public class BNDwidgetTheme extends Struct<BNDwidgetTheme> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OUTLINECOLOR,
        ITEMCOLOR,
        INNERCOLOR,
        INNERSELECTEDCOLOR,
        TEXTCOLOR,
        TEXTSELECTEDCOLOR,
        SHADETOP,
        SHADEDOWN;

    static {
        Layout layout = __struct(
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OUTLINECOLOR = layout.offsetof(0);
        ITEMCOLOR = layout.offsetof(1);
        INNERCOLOR = layout.offsetof(2);
        INNERSELECTEDCOLOR = layout.offsetof(3);
        TEXTCOLOR = layout.offsetof(4);
        TEXTSELECTEDCOLOR = layout.offsetof(5);
        SHADETOP = layout.offsetof(6);
        SHADEDOWN = layout.offsetof(7);
    }

    protected BNDwidgetTheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BNDwidgetTheme create(long address, @Nullable ByteBuffer container) {
        return new BNDwidgetTheme(address, container);
    }

    /**
     * Creates a {@code BNDwidgetTheme} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BNDwidgetTheme(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NVGColor} view of the {@code outlineColor} field. */
    @NativeType("NVGcolor")
    public NVGColor outlineColor() { return noutlineColor(address()); }
    /** @return a {@link NVGColor} view of the {@code itemColor} field. */
    @NativeType("NVGcolor")
    public NVGColor itemColor() { return nitemColor(address()); }
    /** @return a {@link NVGColor} view of the {@code innerColor} field. */
    @NativeType("NVGcolor")
    public NVGColor innerColor() { return ninnerColor(address()); }
    /** @return a {@link NVGColor} view of the {@code innerSelectedColor} field. */
    @NativeType("NVGcolor")
    public NVGColor innerSelectedColor() { return ninnerSelectedColor(address()); }
    /** @return a {@link NVGColor} view of the {@code textColor} field. */
    @NativeType("NVGcolor")
    public NVGColor textColor() { return ntextColor(address()); }
    /** @return a {@link NVGColor} view of the {@code textSelectedColor} field. */
    @NativeType("NVGcolor")
    public NVGColor textSelectedColor() { return ntextSelectedColor(address()); }
    /** @return the value of the {@code shadeTop} field. */
    public int shadeTop() { return nshadeTop(address()); }
    /** @return the value of the {@code shadeDown} field. */
    public int shadeDown() { return nshadeDown(address()); }

    /** Copies the specified {@link NVGColor} to the {@code outlineColor} field. */
    public BNDwidgetTheme outlineColor(@NativeType("NVGcolor") NVGColor value) { noutlineColor(address(), value); return this; }
    /** Passes the {@code outlineColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDwidgetTheme outlineColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(outlineColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code itemColor} field. */
    public BNDwidgetTheme itemColor(@NativeType("NVGcolor") NVGColor value) { nitemColor(address(), value); return this; }
    /** Passes the {@code itemColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDwidgetTheme itemColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(itemColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code innerColor} field. */
    public BNDwidgetTheme innerColor(@NativeType("NVGcolor") NVGColor value) { ninnerColor(address(), value); return this; }
    /** Passes the {@code innerColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDwidgetTheme innerColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(innerColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code innerSelectedColor} field. */
    public BNDwidgetTheme innerSelectedColor(@NativeType("NVGcolor") NVGColor value) { ninnerSelectedColor(address(), value); return this; }
    /** Passes the {@code innerSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDwidgetTheme innerSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(innerSelectedColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code textColor} field. */
    public BNDwidgetTheme textColor(@NativeType("NVGcolor") NVGColor value) { ntextColor(address(), value); return this; }
    /** Passes the {@code textColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDwidgetTheme textColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(textColor()); return this; }
    /** Copies the specified {@link NVGColor} to the {@code textSelectedColor} field. */
    public BNDwidgetTheme textSelectedColor(@NativeType("NVGcolor") NVGColor value) { ntextSelectedColor(address(), value); return this; }
    /** Passes the {@code textSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public BNDwidgetTheme textSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(textSelectedColor()); return this; }
    /** Sets the specified value to the {@code shadeTop} field. */
    public BNDwidgetTheme shadeTop(int value) { nshadeTop(address(), value); return this; }
    /** Sets the specified value to the {@code shadeDown} field. */
    public BNDwidgetTheme shadeDown(int value) { nshadeDown(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BNDwidgetTheme set(
        NVGColor outlineColor,
        NVGColor itemColor,
        NVGColor innerColor,
        NVGColor innerSelectedColor,
        NVGColor textColor,
        NVGColor textSelectedColor,
        int shadeTop,
        int shadeDown
    ) {
        outlineColor(outlineColor);
        itemColor(itemColor);
        innerColor(innerColor);
        innerSelectedColor(innerSelectedColor);
        textColor(textColor);
        textSelectedColor(textSelectedColor);
        shadeTop(shadeTop);
        shadeDown(shadeDown);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BNDwidgetTheme set(BNDwidgetTheme src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BNDwidgetTheme} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BNDwidgetTheme malloc() {
        return new BNDwidgetTheme(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code BNDwidgetTheme} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BNDwidgetTheme calloc() {
        return new BNDwidgetTheme(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code BNDwidgetTheme} instance allocated with {@link BufferUtils}. */
    public static BNDwidgetTheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDwidgetTheme(memAddress(container), container);
    }

    /** Returns a new {@code BNDwidgetTheme} instance for the specified memory address. */
    public static BNDwidgetTheme create(long address) {
        return new BNDwidgetTheme(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable BNDwidgetTheme createSafe(long address) {
        return address == NULL ? null : new BNDwidgetTheme(address, null);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link BNDwidgetTheme.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static BNDwidgetTheme.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BNDwidgetTheme.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BNDwidgetTheme} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDwidgetTheme malloc(MemoryStack stack) {
        return new BNDwidgetTheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code BNDwidgetTheme} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDwidgetTheme calloc(MemoryStack stack) {
        return new BNDwidgetTheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #outlineColor}. */
    public static NVGColor noutlineColor(long struct) { return NVGColor.create(struct + BNDwidgetTheme.OUTLINECOLOR); }
    /** Unsafe version of {@link #itemColor}. */
    public static NVGColor nitemColor(long struct) { return NVGColor.create(struct + BNDwidgetTheme.ITEMCOLOR); }
    /** Unsafe version of {@link #innerColor}. */
    public static NVGColor ninnerColor(long struct) { return NVGColor.create(struct + BNDwidgetTheme.INNERCOLOR); }
    /** Unsafe version of {@link #innerSelectedColor}. */
    public static NVGColor ninnerSelectedColor(long struct) { return NVGColor.create(struct + BNDwidgetTheme.INNERSELECTEDCOLOR); }
    /** Unsafe version of {@link #textColor}. */
    public static NVGColor ntextColor(long struct) { return NVGColor.create(struct + BNDwidgetTheme.TEXTCOLOR); }
    /** Unsafe version of {@link #textSelectedColor}. */
    public static NVGColor ntextSelectedColor(long struct) { return NVGColor.create(struct + BNDwidgetTheme.TEXTSELECTEDCOLOR); }
    /** Unsafe version of {@link #shadeTop}. */
    public static int nshadeTop(long struct) { return memGetInt(struct + BNDwidgetTheme.SHADETOP); }
    /** Unsafe version of {@link #shadeDown}. */
    public static int nshadeDown(long struct) { return memGetInt(struct + BNDwidgetTheme.SHADEDOWN); }

    /** Unsafe version of {@link #outlineColor(NVGColor) outlineColor}. */
    public static void noutlineColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDwidgetTheme.OUTLINECOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #itemColor(NVGColor) itemColor}. */
    public static void nitemColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDwidgetTheme.ITEMCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #innerColor(NVGColor) innerColor}. */
    public static void ninnerColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDwidgetTheme.INNERCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #innerSelectedColor(NVGColor) innerSelectedColor}. */
    public static void ninnerSelectedColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDwidgetTheme.INNERSELECTEDCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #textColor(NVGColor) textColor}. */
    public static void ntextColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDwidgetTheme.TEXTCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #textSelectedColor(NVGColor) textSelectedColor}. */
    public static void ntextSelectedColor(long struct, NVGColor value) { memCopy(value.address(), struct + BNDwidgetTheme.TEXTSELECTEDCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #shadeTop(int) shadeTop}. */
    public static void nshadeTop(long struct, int value) { memPutInt(struct + BNDwidgetTheme.SHADETOP, value); }
    /** Unsafe version of {@link #shadeDown(int) shadeDown}. */
    public static void nshadeDown(long struct, int value) { memPutInt(struct + BNDwidgetTheme.SHADEDOWN, value); }

    // -----------------------------------

    /** An array of {@link BNDwidgetTheme} structs. */
    public static class Buffer extends StructBuffer<BNDwidgetTheme, Buffer> implements NativeResource {

        private static final BNDwidgetTheme ELEMENT_FACTORY = BNDwidgetTheme.create(-1L);

        /**
         * Creates a new {@code BNDwidgetTheme.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BNDwidgetTheme#SIZEOF}, and its mark will be undefined.</p>
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
        protected BNDwidgetTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NVGColor} view of the {@code outlineColor} field. */
        @NativeType("NVGcolor")
        public NVGColor outlineColor() { return BNDwidgetTheme.noutlineColor(address()); }
        /** @return a {@link NVGColor} view of the {@code itemColor} field. */
        @NativeType("NVGcolor")
        public NVGColor itemColor() { return BNDwidgetTheme.nitemColor(address()); }
        /** @return a {@link NVGColor} view of the {@code innerColor} field. */
        @NativeType("NVGcolor")
        public NVGColor innerColor() { return BNDwidgetTheme.ninnerColor(address()); }
        /** @return a {@link NVGColor} view of the {@code innerSelectedColor} field. */
        @NativeType("NVGcolor")
        public NVGColor innerSelectedColor() { return BNDwidgetTheme.ninnerSelectedColor(address()); }
        /** @return a {@link NVGColor} view of the {@code textColor} field. */
        @NativeType("NVGcolor")
        public NVGColor textColor() { return BNDwidgetTheme.ntextColor(address()); }
        /** @return a {@link NVGColor} view of the {@code textSelectedColor} field. */
        @NativeType("NVGcolor")
        public NVGColor textSelectedColor() { return BNDwidgetTheme.ntextSelectedColor(address()); }
        /** @return the value of the {@code shadeTop} field. */
        public int shadeTop() { return BNDwidgetTheme.nshadeTop(address()); }
        /** @return the value of the {@code shadeDown} field. */
        public int shadeDown() { return BNDwidgetTheme.nshadeDown(address()); }

        /** Copies the specified {@link NVGColor} to the {@code outlineColor} field. */
        public BNDwidgetTheme.Buffer outlineColor(@NativeType("NVGcolor") NVGColor value) { BNDwidgetTheme.noutlineColor(address(), value); return this; }
        /** Passes the {@code outlineColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDwidgetTheme.Buffer outlineColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(outlineColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code itemColor} field. */
        public BNDwidgetTheme.Buffer itemColor(@NativeType("NVGcolor") NVGColor value) { BNDwidgetTheme.nitemColor(address(), value); return this; }
        /** Passes the {@code itemColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDwidgetTheme.Buffer itemColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(itemColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code innerColor} field. */
        public BNDwidgetTheme.Buffer innerColor(@NativeType("NVGcolor") NVGColor value) { BNDwidgetTheme.ninnerColor(address(), value); return this; }
        /** Passes the {@code innerColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDwidgetTheme.Buffer innerColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(innerColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code innerSelectedColor} field. */
        public BNDwidgetTheme.Buffer innerSelectedColor(@NativeType("NVGcolor") NVGColor value) { BNDwidgetTheme.ninnerSelectedColor(address(), value); return this; }
        /** Passes the {@code innerSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDwidgetTheme.Buffer innerSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(innerSelectedColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code textColor} field. */
        public BNDwidgetTheme.Buffer textColor(@NativeType("NVGcolor") NVGColor value) { BNDwidgetTheme.ntextColor(address(), value); return this; }
        /** Passes the {@code textColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDwidgetTheme.Buffer textColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(textColor()); return this; }
        /** Copies the specified {@link NVGColor} to the {@code textSelectedColor} field. */
        public BNDwidgetTheme.Buffer textSelectedColor(@NativeType("NVGcolor") NVGColor value) { BNDwidgetTheme.ntextSelectedColor(address(), value); return this; }
        /** Passes the {@code textSelectedColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public BNDwidgetTheme.Buffer textSelectedColor(java.util.function.Consumer<NVGColor> consumer) { consumer.accept(textSelectedColor()); return this; }
        /** Sets the specified value to the {@code shadeTop} field. */
        public BNDwidgetTheme.Buffer shadeTop(int value) { BNDwidgetTheme.nshadeTop(address(), value); return this; }
        /** Sets the specified value to the {@code shadeDown} field. */
        public BNDwidgetTheme.Buffer shadeDown(int value) { BNDwidgetTheme.nshadeDown(address(), value); return this; }

    }

}