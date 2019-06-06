/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Allows the application to customize how the overlay appears in the compositor.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code size} &ndash; {@code sizeof(Compositor_OverlaySettings)}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct Compositor_OverlaySettings {
 *     uint32_t size;
 *     bool curved;
 *     bool antialias;
 *     float scale;
 *     float distance;
 *     float alpha;
 *     float uOffset;
 *     float vOffset;
 *     float uScale;
 *     float vScale;
 *     float gridDivs;
 *     float gridWidth;
 *     float gridScale;
 *     {@link HmdMatrix44 HmdMatrix44_t} transform;
 * }</code></pre>
 */
@NativeType("struct Compositor_OverlaySettings")
public class CompositorOverlaySettings extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SIZE,
        CURVED,
        ANTIALIAS,
        SCALE,
        DISTANCE,
        ALPHA,
        UOFFSET,
        VOFFSET,
        USCALE,
        VSCALE,
        GRIDDIVS,
        GRIDWIDTH,
        GRIDSCALE,
        TRANSFORM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(1),
            __member(1),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(HmdMatrix44.SIZEOF, HmdMatrix44.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SIZE = layout.offsetof(0);
        CURVED = layout.offsetof(1);
        ANTIALIAS = layout.offsetof(2);
        SCALE = layout.offsetof(3);
        DISTANCE = layout.offsetof(4);
        ALPHA = layout.offsetof(5);
        UOFFSET = layout.offsetof(6);
        VOFFSET = layout.offsetof(7);
        USCALE = layout.offsetof(8);
        VSCALE = layout.offsetof(9);
        GRIDDIVS = layout.offsetof(10);
        GRIDWIDTH = layout.offsetof(11);
        GRIDSCALE = layout.offsetof(12);
        TRANSFORM = layout.offsetof(13);
    }

    /**
     * Creates a {@code CompositorOverlaySettings} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CompositorOverlaySettings(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** Returns the value of the {@code curved} field. */
    @NativeType("bool")
    public boolean curved() { return ncurved(address()); }
    /** Returns the value of the {@code antialias} field. */
    @NativeType("bool")
    public boolean antialias() { return nantialias(address()); }
    /** Returns the value of the {@code scale} field. */
    public float scale() { return nscale(address()); }
    /** Returns the value of the {@code distance} field. */
    public float distance() { return ndistance(address()); }
    /** Returns the value of the {@code alpha} field. */
    public float alpha() { return nalpha(address()); }
    /** Returns the value of the {@code uOffset} field. */
    public float uOffset() { return nuOffset(address()); }
    /** Returns the value of the {@code vOffset} field. */
    public float vOffset() { return nvOffset(address()); }
    /** Returns the value of the {@code uScale} field. */
    public float uScale() { return nuScale(address()); }
    /** Returns the value of the {@code vScale} field. */
    public float vScale() { return nvScale(address()); }
    /** Returns the value of the {@code gridDivs} field. */
    public float gridDivs() { return ngridDivs(address()); }
    /** Returns the value of the {@code gridWidth} field. */
    public float gridWidth() { return ngridWidth(address()); }
    /** Returns the value of the {@code gridScale} field. */
    public float gridScale() { return ngridScale(address()); }
    /** Returns a {@link HmdMatrix44} view of the {@code transform} field. */
    @NativeType("HmdMatrix44_t")
    public HmdMatrix44 transform() { return ntransform(address()); }

    /** Sets the specified value to the {@code size} field. */
    public CompositorOverlaySettings size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code curved} field. */
    public CompositorOverlaySettings curved(@NativeType("bool") boolean value) { ncurved(address(), value); return this; }
    /** Sets the specified value to the {@code antialias} field. */
    public CompositorOverlaySettings antialias(@NativeType("bool") boolean value) { nantialias(address(), value); return this; }
    /** Sets the specified value to the {@code scale} field. */
    public CompositorOverlaySettings scale(float value) { nscale(address(), value); return this; }
    /** Sets the specified value to the {@code distance} field. */
    public CompositorOverlaySettings distance(float value) { ndistance(address(), value); return this; }
    /** Sets the specified value to the {@code alpha} field. */
    public CompositorOverlaySettings alpha(float value) { nalpha(address(), value); return this; }
    /** Sets the specified value to the {@code uOffset} field. */
    public CompositorOverlaySettings uOffset(float value) { nuOffset(address(), value); return this; }
    /** Sets the specified value to the {@code vOffset} field. */
    public CompositorOverlaySettings vOffset(float value) { nvOffset(address(), value); return this; }
    /** Sets the specified value to the {@code uScale} field. */
    public CompositorOverlaySettings uScale(float value) { nuScale(address(), value); return this; }
    /** Sets the specified value to the {@code vScale} field. */
    public CompositorOverlaySettings vScale(float value) { nvScale(address(), value); return this; }
    /** Sets the specified value to the {@code gridDivs} field. */
    public CompositorOverlaySettings gridDivs(float value) { ngridDivs(address(), value); return this; }
    /** Sets the specified value to the {@code gridWidth} field. */
    public CompositorOverlaySettings gridWidth(float value) { ngridWidth(address(), value); return this; }
    /** Sets the specified value to the {@code gridScale} field. */
    public CompositorOverlaySettings gridScale(float value) { ngridScale(address(), value); return this; }
    /** Copies the specified {@link HmdMatrix44} to the {@code transform} field. */
    public CompositorOverlaySettings transform(@NativeType("HmdMatrix44_t") HmdMatrix44 value) { ntransform(address(), value); return this; }
    /** Passes the {@code transform} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CompositorOverlaySettings transform(java.util.function.Consumer<HmdMatrix44> consumer) { consumer.accept(transform()); return this; }

    /** Initializes this struct with the specified values. */
    public CompositorOverlaySettings set(
        int size,
        boolean curved,
        boolean antialias,
        float scale,
        float distance,
        float alpha,
        float uOffset,
        float vOffset,
        float uScale,
        float vScale,
        float gridDivs,
        float gridWidth,
        float gridScale,
        HmdMatrix44 transform
    ) {
        size(size);
        curved(curved);
        antialias(antialias);
        scale(scale);
        distance(distance);
        alpha(alpha);
        uOffset(uOffset);
        vOffset(vOffset);
        uScale(uScale);
        vScale(vScale);
        gridDivs(gridDivs);
        gridWidth(gridWidth);
        gridScale(gridScale);
        transform(transform);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CompositorOverlaySettings set(CompositorOverlaySettings src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CompositorOverlaySettings} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CompositorOverlaySettings malloc() {
        return wrap(CompositorOverlaySettings.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CompositorOverlaySettings} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CompositorOverlaySettings calloc() {
        return wrap(CompositorOverlaySettings.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CompositorOverlaySettings} instance allocated with {@link BufferUtils}. */
    public static CompositorOverlaySettings create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CompositorOverlaySettings.class, memAddress(container), container);
    }

    /** Returns a new {@code CompositorOverlaySettings} instance for the specified memory address. */
    public static CompositorOverlaySettings create(long address) {
        return wrap(CompositorOverlaySettings.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorOverlaySettings createSafe(long address) {
        return address == NULL ? null : wrap(CompositorOverlaySettings.class, address);
    }

    /**
     * Returns a new {@link CompositorOverlaySettings.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CompositorOverlaySettings.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorOverlaySettings.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CompositorOverlaySettings.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CompositorOverlaySettings.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CompositorOverlaySettings} instance allocated on the thread-local {@link MemoryStack}. */
    public static CompositorOverlaySettings mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CompositorOverlaySettings} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CompositorOverlaySettings callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CompositorOverlaySettings} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorOverlaySettings mallocStack(MemoryStack stack) {
        return wrap(CompositorOverlaySettings.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CompositorOverlaySettings} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CompositorOverlaySettings callocStack(MemoryStack stack) {
        return wrap(CompositorOverlaySettings.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CompositorOverlaySettings.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorOverlaySettings.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CompositorOverlaySettings.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CompositorOverlaySettings.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CompositorOverlaySettings.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + CompositorOverlaySettings.SIZE); }
    /** Unsafe version of {@link #curved}. */
    public static boolean ncurved(long struct) { return UNSAFE.getByte(null, struct + CompositorOverlaySettings.CURVED) != 0; }
    /** Unsafe version of {@link #antialias}. */
    public static boolean nantialias(long struct) { return UNSAFE.getByte(null, struct + CompositorOverlaySettings.ANTIALIAS) != 0; }
    /** Unsafe version of {@link #scale}. */
    public static float nscale(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.SCALE); }
    /** Unsafe version of {@link #distance}. */
    public static float ndistance(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.DISTANCE); }
    /** Unsafe version of {@link #alpha}. */
    public static float nalpha(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.ALPHA); }
    /** Unsafe version of {@link #uOffset}. */
    public static float nuOffset(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.UOFFSET); }
    /** Unsafe version of {@link #vOffset}. */
    public static float nvOffset(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.VOFFSET); }
    /** Unsafe version of {@link #uScale}. */
    public static float nuScale(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.USCALE); }
    /** Unsafe version of {@link #vScale}. */
    public static float nvScale(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.VSCALE); }
    /** Unsafe version of {@link #gridDivs}. */
    public static float ngridDivs(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.GRIDDIVS); }
    /** Unsafe version of {@link #gridWidth}. */
    public static float ngridWidth(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.GRIDWIDTH); }
    /** Unsafe version of {@link #gridScale}. */
    public static float ngridScale(long struct) { return UNSAFE.getFloat(null, struct + CompositorOverlaySettings.GRIDSCALE); }
    /** Unsafe version of {@link #transform}. */
    public static HmdMatrix44 ntransform(long struct) { return HmdMatrix44.create(struct + CompositorOverlaySettings.TRANSFORM); }

    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + CompositorOverlaySettings.SIZE, value); }
    /** Unsafe version of {@link #curved(boolean) curved}. */
    public static void ncurved(long struct, boolean value) { UNSAFE.putByte(null, struct + CompositorOverlaySettings.CURVED, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #antialias(boolean) antialias}. */
    public static void nantialias(long struct, boolean value) { UNSAFE.putByte(null, struct + CompositorOverlaySettings.ANTIALIAS, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #scale(float) scale}. */
    public static void nscale(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.SCALE, value); }
    /** Unsafe version of {@link #distance(float) distance}. */
    public static void ndistance(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.DISTANCE, value); }
    /** Unsafe version of {@link #alpha(float) alpha}. */
    public static void nalpha(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.ALPHA, value); }
    /** Unsafe version of {@link #uOffset(float) uOffset}. */
    public static void nuOffset(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.UOFFSET, value); }
    /** Unsafe version of {@link #vOffset(float) vOffset}. */
    public static void nvOffset(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.VOFFSET, value); }
    /** Unsafe version of {@link #uScale(float) uScale}. */
    public static void nuScale(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.USCALE, value); }
    /** Unsafe version of {@link #vScale(float) vScale}. */
    public static void nvScale(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.VSCALE, value); }
    /** Unsafe version of {@link #gridDivs(float) gridDivs}. */
    public static void ngridDivs(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.GRIDDIVS, value); }
    /** Unsafe version of {@link #gridWidth(float) gridWidth}. */
    public static void ngridWidth(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.GRIDWIDTH, value); }
    /** Unsafe version of {@link #gridScale(float) gridScale}. */
    public static void ngridScale(long struct, float value) { UNSAFE.putFloat(null, struct + CompositorOverlaySettings.GRIDSCALE, value); }
    /** Unsafe version of {@link #transform(HmdMatrix44) transform}. */
    public static void ntransform(long struct, HmdMatrix44 value) { memCopy(value.address(), struct + CompositorOverlaySettings.TRANSFORM, HmdMatrix44.SIZEOF); }

    // -----------------------------------

    /** An array of {@link CompositorOverlaySettings} structs. */
    public static class Buffer extends StructBuffer<CompositorOverlaySettings, Buffer> implements NativeResource {

        private static final CompositorOverlaySettings ELEMENT_FACTORY = CompositorOverlaySettings.create(-1L);

        /**
         * Creates a new {@code CompositorOverlaySettings.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CompositorOverlaySettings#SIZEOF}, and its mark will be undefined.
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
        protected CompositorOverlaySettings getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return CompositorOverlaySettings.nsize(address()); }
        /** Returns the value of the {@code curved} field. */
        @NativeType("bool")
        public boolean curved() { return CompositorOverlaySettings.ncurved(address()); }
        /** Returns the value of the {@code antialias} field. */
        @NativeType("bool")
        public boolean antialias() { return CompositorOverlaySettings.nantialias(address()); }
        /** Returns the value of the {@code scale} field. */
        public float scale() { return CompositorOverlaySettings.nscale(address()); }
        /** Returns the value of the {@code distance} field. */
        public float distance() { return CompositorOverlaySettings.ndistance(address()); }
        /** Returns the value of the {@code alpha} field. */
        public float alpha() { return CompositorOverlaySettings.nalpha(address()); }
        /** Returns the value of the {@code uOffset} field. */
        public float uOffset() { return CompositorOverlaySettings.nuOffset(address()); }
        /** Returns the value of the {@code vOffset} field. */
        public float vOffset() { return CompositorOverlaySettings.nvOffset(address()); }
        /** Returns the value of the {@code uScale} field. */
        public float uScale() { return CompositorOverlaySettings.nuScale(address()); }
        /** Returns the value of the {@code vScale} field. */
        public float vScale() { return CompositorOverlaySettings.nvScale(address()); }
        /** Returns the value of the {@code gridDivs} field. */
        public float gridDivs() { return CompositorOverlaySettings.ngridDivs(address()); }
        /** Returns the value of the {@code gridWidth} field. */
        public float gridWidth() { return CompositorOverlaySettings.ngridWidth(address()); }
        /** Returns the value of the {@code gridScale} field. */
        public float gridScale() { return CompositorOverlaySettings.ngridScale(address()); }
        /** Returns a {@link HmdMatrix44} view of the {@code transform} field. */
        @NativeType("HmdMatrix44_t")
        public HmdMatrix44 transform() { return CompositorOverlaySettings.ntransform(address()); }

        /** Sets the specified value to the {@code size} field. */
        public CompositorOverlaySettings.Buffer size(@NativeType("uint32_t") int value) { CompositorOverlaySettings.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code curved} field. */
        public CompositorOverlaySettings.Buffer curved(@NativeType("bool") boolean value) { CompositorOverlaySettings.ncurved(address(), value); return this; }
        /** Sets the specified value to the {@code antialias} field. */
        public CompositorOverlaySettings.Buffer antialias(@NativeType("bool") boolean value) { CompositorOverlaySettings.nantialias(address(), value); return this; }
        /** Sets the specified value to the {@code scale} field. */
        public CompositorOverlaySettings.Buffer scale(float value) { CompositorOverlaySettings.nscale(address(), value); return this; }
        /** Sets the specified value to the {@code distance} field. */
        public CompositorOverlaySettings.Buffer distance(float value) { CompositorOverlaySettings.ndistance(address(), value); return this; }
        /** Sets the specified value to the {@code alpha} field. */
        public CompositorOverlaySettings.Buffer alpha(float value) { CompositorOverlaySettings.nalpha(address(), value); return this; }
        /** Sets the specified value to the {@code uOffset} field. */
        public CompositorOverlaySettings.Buffer uOffset(float value) { CompositorOverlaySettings.nuOffset(address(), value); return this; }
        /** Sets the specified value to the {@code vOffset} field. */
        public CompositorOverlaySettings.Buffer vOffset(float value) { CompositorOverlaySettings.nvOffset(address(), value); return this; }
        /** Sets the specified value to the {@code uScale} field. */
        public CompositorOverlaySettings.Buffer uScale(float value) { CompositorOverlaySettings.nuScale(address(), value); return this; }
        /** Sets the specified value to the {@code vScale} field. */
        public CompositorOverlaySettings.Buffer vScale(float value) { CompositorOverlaySettings.nvScale(address(), value); return this; }
        /** Sets the specified value to the {@code gridDivs} field. */
        public CompositorOverlaySettings.Buffer gridDivs(float value) { CompositorOverlaySettings.ngridDivs(address(), value); return this; }
        /** Sets the specified value to the {@code gridWidth} field. */
        public CompositorOverlaySettings.Buffer gridWidth(float value) { CompositorOverlaySettings.ngridWidth(address(), value); return this; }
        /** Sets the specified value to the {@code gridScale} field. */
        public CompositorOverlaySettings.Buffer gridScale(float value) { CompositorOverlaySettings.ngridScale(address(), value); return this; }
        /** Copies the specified {@link HmdMatrix44} to the {@code transform} field. */
        public CompositorOverlaySettings.Buffer transform(@NativeType("HmdMatrix44_t") HmdMatrix44 value) { CompositorOverlaySettings.ntransform(address(), value); return this; }
        /** Passes the {@code transform} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CompositorOverlaySettings.Buffer transform(java.util.function.Consumer<HmdMatrix44> consumer) { consumer.accept(transform()); return this; }

    }

}