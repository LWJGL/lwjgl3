/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Information used by the visual utility routines to find desired visual type from the many visuals a display may support.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XVisualInfo {
 *     {@link Visual Visual} * visual;
 *     VisualID visualid;
 *     int screen;
 *     int depth;
 *     int class;
 *     unsigned long red_mask;
 *     unsigned long green_mask;
 *     unsigned long blue_mask;
 *     int colormap_size;
 *     int bits_per_rgb;
 * }</code></pre>
 */
public class XVisualInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VISUAL,
        VISUALID,
        SCREEN,
        DEPTH,
        CLASS,
        RED_MASK,
        GREEN_MASK,
        BLUE_MASK,
        COLORMAP_SIZE,
        BITS_PER_RGB;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VISUAL = layout.offsetof(0);
        VISUALID = layout.offsetof(1);
        SCREEN = layout.offsetof(2);
        DEPTH = layout.offsetof(3);
        CLASS = layout.offsetof(4);
        RED_MASK = layout.offsetof(5);
        GREEN_MASK = layout.offsetof(6);
        BLUE_MASK = layout.offsetof(7);
        COLORMAP_SIZE = layout.offsetof(8);
        BITS_PER_RGB = layout.offsetof(9);
    }

    /**
     * Creates a {@code XVisualInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XVisualInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link Visual} view of the struct pointed to by the {@code visual} field. */
    @NativeType("Visual *")
    public Visual visual() { return nvisual(address()); }
    /** Returns the value of the {@code visualid} field. */
    @NativeType("VisualID")
    public long visualid() { return nvisualid(address()); }
    /** Returns the value of the {@code screen} field. */
    public int screen() { return nscreen(address()); }
    /** Returns the value of the {@code depth} field. */
    public int depth() { return ndepth(address()); }
    /** Returns the value of the {@code class} field. */
    public int class$() { return nclass$(address()); }
    /** Returns the value of the {@code red_mask} field. */
    @NativeType("unsigned long")
    public long red_mask() { return nred_mask(address()); }
    /** Returns the value of the {@code green_mask} field. */
    @NativeType("unsigned long")
    public long green_mask() { return ngreen_mask(address()); }
    /** Returns the value of the {@code blue_mask} field. */
    @NativeType("unsigned long")
    public long blue_mask() { return nblue_mask(address()); }
    /** Returns the value of the {@code colormap_size} field. */
    public int colormap_size() { return ncolormap_size(address()); }
    /** Returns the value of the {@code bits_per_rgb} field. */
    public int bits_per_rgb() { return nbits_per_rgb(address()); }

    /** Sets the address of the specified {@link Visual} to the {@code visual} field. */
    public XVisualInfo visual(@NativeType("Visual *") Visual value) { nvisual(address(), value); return this; }
    /** Sets the specified value to the {@code visualid} field. */
    public XVisualInfo visualid(@NativeType("VisualID") long value) { nvisualid(address(), value); return this; }
    /** Sets the specified value to the {@code screen} field. */
    public XVisualInfo screen(int value) { nscreen(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    public XVisualInfo depth(int value) { ndepth(address(), value); return this; }
    /** Sets the specified value to the {@code class} field. */
    public XVisualInfo class$(int value) { nclass$(address(), value); return this; }
    /** Sets the specified value to the {@code red_mask} field. */
    public XVisualInfo red_mask(@NativeType("unsigned long") long value) { nred_mask(address(), value); return this; }
    /** Sets the specified value to the {@code green_mask} field. */
    public XVisualInfo green_mask(@NativeType("unsigned long") long value) { ngreen_mask(address(), value); return this; }
    /** Sets the specified value to the {@code blue_mask} field. */
    public XVisualInfo blue_mask(@NativeType("unsigned long") long value) { nblue_mask(address(), value); return this; }
    /** Sets the specified value to the {@code colormap_size} field. */
    public XVisualInfo colormap_size(int value) { ncolormap_size(address(), value); return this; }
    /** Sets the specified value to the {@code bits_per_rgb} field. */
    public XVisualInfo bits_per_rgb(int value) { nbits_per_rgb(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XVisualInfo set(
        Visual visual,
        long visualid,
        int screen,
        int depth,
        int class$,
        long red_mask,
        long green_mask,
        long blue_mask,
        int colormap_size,
        int bits_per_rgb
    ) {
        visual(visual);
        visualid(visualid);
        screen(screen);
        depth(depth);
        class$(class$);
        red_mask(red_mask);
        green_mask(green_mask);
        blue_mask(blue_mask);
        colormap_size(colormap_size);
        bits_per_rgb(bits_per_rgb);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XVisualInfo set(XVisualInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XVisualInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XVisualInfo malloc() {
        return wrap(XVisualInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XVisualInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XVisualInfo calloc() {
        return wrap(XVisualInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XVisualInfo} instance allocated with {@link BufferUtils}. */
    public static XVisualInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XVisualInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XVisualInfo} instance for the specified memory address. */
    public static XVisualInfo create(long address) {
        return wrap(XVisualInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XVisualInfo createSafe(long address) {
        return address == NULL ? null : wrap(XVisualInfo.class, address);
    }

    /**
     * Returns a new {@link XVisualInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XVisualInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XVisualInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XVisualInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XVisualInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XVisualInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static XVisualInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XVisualInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XVisualInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XVisualInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XVisualInfo mallocStack(MemoryStack stack) {
        return wrap(XVisualInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XVisualInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XVisualInfo callocStack(MemoryStack stack) {
        return wrap(XVisualInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XVisualInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XVisualInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XVisualInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XVisualInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XVisualInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #visual}. */
    public static Visual nvisual(long struct) { return Visual.create(memGetAddress(struct + XVisualInfo.VISUAL)); }
    /** Unsafe version of {@link #visualid}. */
    public static long nvisualid(long struct) { return memGetCLong(struct + XVisualInfo.VISUALID); }
    /** Unsafe version of {@link #screen}. */
    public static int nscreen(long struct) { return UNSAFE.getInt(null, struct + XVisualInfo.SCREEN); }
    /** Unsafe version of {@link #depth}. */
    public static int ndepth(long struct) { return UNSAFE.getInt(null, struct + XVisualInfo.DEPTH); }
    /** Unsafe version of {@link #class$}. */
    public static int nclass$(long struct) { return UNSAFE.getInt(null, struct + XVisualInfo.CLASS); }
    /** Unsafe version of {@link #red_mask}. */
    public static long nred_mask(long struct) { return memGetCLong(struct + XVisualInfo.RED_MASK); }
    /** Unsafe version of {@link #green_mask}. */
    public static long ngreen_mask(long struct) { return memGetCLong(struct + XVisualInfo.GREEN_MASK); }
    /** Unsafe version of {@link #blue_mask}. */
    public static long nblue_mask(long struct) { return memGetCLong(struct + XVisualInfo.BLUE_MASK); }
    /** Unsafe version of {@link #colormap_size}. */
    public static int ncolormap_size(long struct) { return UNSAFE.getInt(null, struct + XVisualInfo.COLORMAP_SIZE); }
    /** Unsafe version of {@link #bits_per_rgb}. */
    public static int nbits_per_rgb(long struct) { return UNSAFE.getInt(null, struct + XVisualInfo.BITS_PER_RGB); }

    /** Unsafe version of {@link #visual(Visual) visual}. */
    public static void nvisual(long struct, Visual value) { memPutAddress(struct + XVisualInfo.VISUAL, value.address()); }
    /** Unsafe version of {@link #visualid(long) visualid}. */
    public static void nvisualid(long struct, long value) { memPutCLong(struct + XVisualInfo.VISUALID, value); }
    /** Unsafe version of {@link #screen(int) screen}. */
    public static void nscreen(long struct, int value) { UNSAFE.putInt(null, struct + XVisualInfo.SCREEN, value); }
    /** Unsafe version of {@link #depth(int) depth}. */
    public static void ndepth(long struct, int value) { UNSAFE.putInt(null, struct + XVisualInfo.DEPTH, value); }
    /** Unsafe version of {@link #class$(int) class$}. */
    public static void nclass$(long struct, int value) { UNSAFE.putInt(null, struct + XVisualInfo.CLASS, value); }
    /** Unsafe version of {@link #red_mask(long) red_mask}. */
    public static void nred_mask(long struct, long value) { memPutCLong(struct + XVisualInfo.RED_MASK, value); }
    /** Unsafe version of {@link #green_mask(long) green_mask}. */
    public static void ngreen_mask(long struct, long value) { memPutCLong(struct + XVisualInfo.GREEN_MASK, value); }
    /** Unsafe version of {@link #blue_mask(long) blue_mask}. */
    public static void nblue_mask(long struct, long value) { memPutCLong(struct + XVisualInfo.BLUE_MASK, value); }
    /** Unsafe version of {@link #colormap_size(int) colormap_size}. */
    public static void ncolormap_size(long struct, int value) { UNSAFE.putInt(null, struct + XVisualInfo.COLORMAP_SIZE, value); }
    /** Unsafe version of {@link #bits_per_rgb(int) bits_per_rgb}. */
    public static void nbits_per_rgb(long struct, int value) { UNSAFE.putInt(null, struct + XVisualInfo.BITS_PER_RGB, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XVisualInfo.VISUAL));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XVisualInfo} structs. */
    public static class Buffer extends StructBuffer<XVisualInfo, Buffer> implements NativeResource {

        private static final XVisualInfo ELEMENT_FACTORY = XVisualInfo.create(-1L);

        /**
         * Creates a new {@code XVisualInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XVisualInfo#SIZEOF}, and its mark will be undefined.
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
        protected XVisualInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link Visual} view of the struct pointed to by the {@code visual} field. */
        @NativeType("Visual *")
        public Visual visual() { return XVisualInfo.nvisual(address()); }
        /** Returns the value of the {@code visualid} field. */
        @NativeType("VisualID")
        public long visualid() { return XVisualInfo.nvisualid(address()); }
        /** Returns the value of the {@code screen} field. */
        public int screen() { return XVisualInfo.nscreen(address()); }
        /** Returns the value of the {@code depth} field. */
        public int depth() { return XVisualInfo.ndepth(address()); }
        /** Returns the value of the {@code class} field. */
        public int class$() { return XVisualInfo.nclass$(address()); }
        /** Returns the value of the {@code red_mask} field. */
        @NativeType("unsigned long")
        public long red_mask() { return XVisualInfo.nred_mask(address()); }
        /** Returns the value of the {@code green_mask} field. */
        @NativeType("unsigned long")
        public long green_mask() { return XVisualInfo.ngreen_mask(address()); }
        /** Returns the value of the {@code blue_mask} field. */
        @NativeType("unsigned long")
        public long blue_mask() { return XVisualInfo.nblue_mask(address()); }
        /** Returns the value of the {@code colormap_size} field. */
        public int colormap_size() { return XVisualInfo.ncolormap_size(address()); }
        /** Returns the value of the {@code bits_per_rgb} field. */
        public int bits_per_rgb() { return XVisualInfo.nbits_per_rgb(address()); }

        /** Sets the address of the specified {@link Visual} to the {@code visual} field. */
        public XVisualInfo.Buffer visual(@NativeType("Visual *") Visual value) { XVisualInfo.nvisual(address(), value); return this; }
        /** Sets the specified value to the {@code visualid} field. */
        public XVisualInfo.Buffer visualid(@NativeType("VisualID") long value) { XVisualInfo.nvisualid(address(), value); return this; }
        /** Sets the specified value to the {@code screen} field. */
        public XVisualInfo.Buffer screen(int value) { XVisualInfo.nscreen(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        public XVisualInfo.Buffer depth(int value) { XVisualInfo.ndepth(address(), value); return this; }
        /** Sets the specified value to the {@code class} field. */
        public XVisualInfo.Buffer class$(int value) { XVisualInfo.nclass$(address(), value); return this; }
        /** Sets the specified value to the {@code red_mask} field. */
        public XVisualInfo.Buffer red_mask(@NativeType("unsigned long") long value) { XVisualInfo.nred_mask(address(), value); return this; }
        /** Sets the specified value to the {@code green_mask} field. */
        public XVisualInfo.Buffer green_mask(@NativeType("unsigned long") long value) { XVisualInfo.ngreen_mask(address(), value); return this; }
        /** Sets the specified value to the {@code blue_mask} field. */
        public XVisualInfo.Buffer blue_mask(@NativeType("unsigned long") long value) { XVisualInfo.nblue_mask(address(), value); return this; }
        /** Sets the specified value to the {@code colormap_size} field. */
        public XVisualInfo.Buffer colormap_size(int value) { XVisualInfo.ncolormap_size(address(), value); return this; }
        /** Sets the specified value to the {@code bits_per_rgb} field. */
        public XVisualInfo.Buffer bits_per_rgb(int value) { XVisualInfo.nbits_per_rgb(address(), value); return this; }

    }

}