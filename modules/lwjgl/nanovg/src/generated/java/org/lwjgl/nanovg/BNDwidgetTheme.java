/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the theme used to draw a single widget or widget box; these values correspond to the same values that can be retrieved from the Theme panel
 * in the Blender preferences.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code outlineColor} &ndash; color of widget box outline</li>
 * <li>{@code itemColor} &ndash; color of widget item (meaning changes depending on class)</li>
 * <li>{@code innerColor} &ndash; fill color of widget box</li>
 * <li>{@code innerSelectedColor} &ndash; fill color of widget box when active</li>
 * <li>{@code textColor} &ndash; color of text label</li>
 * <li>{@code textSelectedColor} &ndash; color of text label when active</li>
 * <li>{@code shadeTop} &ndash; delta modifier for upper part of gradient (-100 to 100)</li>
 * <li>{@code shadeDown} &ndash; delta modifier for lower part of gradient (-100 to 100)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct BNDwidgetTheme {
 *     {@link NVGColor NVGcolor} outlineColor;
 *     {@link NVGColor NVGcolor} itemColor;
 *     {@link NVGColor NVGcolor} innerColor;
 *     {@link NVGColor NVGcolor} innerSelectedColor;
 *     {@link NVGColor NVGcolor} textColor;
 *     {@link NVGColor NVGcolor} textSelectedColor;
 *     int shadeTop;
 *     int shadeDown;
 * }</code></pre>
 */
public class BNDwidgetTheme extends Struct implements NativeResource {

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

    /** Returns a {@link NVGColor} view of the {@code outlineColor} field. */
    @NativeType("NVGcolor")
    public NVGColor outlineColor() { return noutlineColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code itemColor} field. */
    @NativeType("NVGcolor")
    public NVGColor itemColor() { return nitemColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code innerColor} field. */
    @NativeType("NVGcolor")
    public NVGColor innerColor() { return ninnerColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code innerSelectedColor} field. */
    @NativeType("NVGcolor")
    public NVGColor innerSelectedColor() { return ninnerSelectedColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code textColor} field. */
    @NativeType("NVGcolor")
    public NVGColor textColor() { return ntextColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code textSelectedColor} field. */
    @NativeType("NVGcolor")
    public NVGColor textSelectedColor() { return ntextSelectedColor(address()); }
    /** Returns the value of the {@code shadeTop} field. */
    public int shadeTop() { return nshadeTop(address()); }
    /** Returns the value of the {@code shadeDown} field. */
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
        return wrap(BNDwidgetTheme.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BNDwidgetTheme} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BNDwidgetTheme calloc() {
        return wrap(BNDwidgetTheme.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BNDwidgetTheme} instance allocated with {@link BufferUtils}. */
    public static BNDwidgetTheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BNDwidgetTheme.class, memAddress(container), container);
    }

    /** Returns a new {@code BNDwidgetTheme} instance for the specified memory address. */
    public static BNDwidgetTheme create(long address) {
        return wrap(BNDwidgetTheme.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BNDwidgetTheme createSafe(long address) {
        return address == NULL ? null : wrap(BNDwidgetTheme.class, address);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BNDwidgetTheme.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BNDwidgetTheme.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code BNDwidgetTheme} instance allocated on the thread-local {@link MemoryStack}. */
    public static BNDwidgetTheme mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BNDwidgetTheme} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BNDwidgetTheme callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BNDwidgetTheme} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDwidgetTheme mallocStack(MemoryStack stack) {
        return wrap(BNDwidgetTheme.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BNDwidgetTheme} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BNDwidgetTheme callocStack(MemoryStack stack) {
        return wrap(BNDwidgetTheme.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BNDwidgetTheme.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BNDwidgetTheme.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    public static int nshadeTop(long struct) { return UNSAFE.getInt(null, struct + BNDwidgetTheme.SHADETOP); }
    /** Unsafe version of {@link #shadeDown}. */
    public static int nshadeDown(long struct) { return UNSAFE.getInt(null, struct + BNDwidgetTheme.SHADEDOWN); }

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
    public static void nshadeTop(long struct, int value) { UNSAFE.putInt(null, struct + BNDwidgetTheme.SHADETOP, value); }
    /** Unsafe version of {@link #shadeDown(int) shadeDown}. */
    public static void nshadeDown(long struct, int value) { UNSAFE.putInt(null, struct + BNDwidgetTheme.SHADEDOWN, value); }

    // -----------------------------------

    /** An array of {@link BNDwidgetTheme} structs. */
    public static class Buffer extends StructBuffer<BNDwidgetTheme, Buffer> implements NativeResource {

        private static final BNDwidgetTheme ELEMENT_FACTORY = BNDwidgetTheme.create(-1L);

        /**
         * Creates a new {@code BNDwidgetTheme.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BNDwidgetTheme#SIZEOF}, and its mark will be undefined.
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
        protected BNDwidgetTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NVGColor} view of the {@code outlineColor} field. */
        @NativeType("NVGcolor")
        public NVGColor outlineColor() { return BNDwidgetTheme.noutlineColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code itemColor} field. */
        @NativeType("NVGcolor")
        public NVGColor itemColor() { return BNDwidgetTheme.nitemColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code innerColor} field. */
        @NativeType("NVGcolor")
        public NVGColor innerColor() { return BNDwidgetTheme.ninnerColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code innerSelectedColor} field. */
        @NativeType("NVGcolor")
        public NVGColor innerSelectedColor() { return BNDwidgetTheme.ninnerSelectedColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code textColor} field. */
        @NativeType("NVGcolor")
        public NVGColor textColor() { return BNDwidgetTheme.ntextColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code textSelectedColor} field. */
        @NativeType("NVGcolor")
        public NVGColor textSelectedColor() { return BNDwidgetTheme.ntextSelectedColor(address()); }
        /** Returns the value of the {@code shadeTop} field. */
        public int shadeTop() { return BNDwidgetTheme.nshadeTop(address()); }
        /** Returns the value of the {@code shadeDown} field. */
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