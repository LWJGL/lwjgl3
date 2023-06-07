/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A union object representing format and details of a paint table of a {@code COLR} v1 font.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_COLR_Paint {
 *     FT_PaintFormat format;
 *     union {
 *         {@link FT_PaintColrLayers FT_PaintColrLayers} colr_layers;
 *         {@link FT_PaintGlyph FT_PaintGlyph} glyph;
 *         {@link FT_PaintSolid FT_PaintSolid} solid;
 *         {@link FT_PaintLinearGradient FT_PaintLinearGradient} linear_gradient;
 *         {@link FT_PaintRadialGradient FT_PaintRadialGradient} radial_gradient;
 *         {@link FT_PaintSweepGradient FT_PaintSweepGradient} sweep_gradient;
 *         {@link FT_PaintTransform FT_PaintTransform} transform;
 *         {@link FT_PaintTranslate FT_PaintTranslate} translate;
 *         {@link FT_PaintScale FT_PaintScale} scale;
 *         {@link FT_PaintRotate FT_PaintRotate} rotate;
 *         {@link FT_PaintSkew FT_PaintSkew} skew;
 *         {@link FT_PaintComposite FT_PaintComposite} composite;
 *         {@link FT_PaintColrGlyph FT_PaintColrGlyph} colr_glyph;
 *     } u;
 * }</code></pre>
 */
public class FT_COLR_Paint extends Struct<FT_COLR_Paint> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FORMAT,
        U,
            U_COLR_LAYERS,
            U_GLYPH,
            U_SOLID,
            U_LINEAR_GRADIENT,
            U_RADIAL_GRADIENT,
            U_SWEEP_GRADIENT,
            U_TRANSFORM,
            U_TRANSLATE,
            U_SCALE,
            U_ROTATE,
            U_SKEW,
            U_COMPOSITE,
            U_COLR_GLYPH;

    static {
        Layout layout = __struct(
            __member(4),
            __union(
                __member(FT_PaintColrLayers.SIZEOF, FT_PaintColrLayers.ALIGNOF),
                __member(FT_PaintGlyph.SIZEOF, FT_PaintGlyph.ALIGNOF),
                __member(FT_PaintSolid.SIZEOF, FT_PaintSolid.ALIGNOF),
                __member(FT_PaintLinearGradient.SIZEOF, FT_PaintLinearGradient.ALIGNOF),
                __member(FT_PaintRadialGradient.SIZEOF, FT_PaintRadialGradient.ALIGNOF),
                __member(FT_PaintSweepGradient.SIZEOF, FT_PaintSweepGradient.ALIGNOF),
                __member(FT_PaintTransform.SIZEOF, FT_PaintTransform.ALIGNOF),
                __member(FT_PaintTranslate.SIZEOF, FT_PaintTranslate.ALIGNOF),
                __member(FT_PaintScale.SIZEOF, FT_PaintScale.ALIGNOF),
                __member(FT_PaintRotate.SIZEOF, FT_PaintRotate.ALIGNOF),
                __member(FT_PaintSkew.SIZEOF, FT_PaintSkew.ALIGNOF),
                __member(FT_PaintComposite.SIZEOF, FT_PaintComposite.ALIGNOF),
                __member(FT_PaintColrGlyph.SIZEOF, FT_PaintColrGlyph.ALIGNOF)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FORMAT = layout.offsetof(0);
        U = layout.offsetof(1);
            U_COLR_LAYERS = layout.offsetof(2);
            U_GLYPH = layout.offsetof(3);
            U_SOLID = layout.offsetof(4);
            U_LINEAR_GRADIENT = layout.offsetof(5);
            U_RADIAL_GRADIENT = layout.offsetof(6);
            U_SWEEP_GRADIENT = layout.offsetof(7);
            U_TRANSFORM = layout.offsetof(8);
            U_TRANSLATE = layout.offsetof(9);
            U_SCALE = layout.offsetof(10);
            U_ROTATE = layout.offsetof(11);
            U_SKEW = layout.offsetof(12);
            U_COMPOSITE = layout.offsetof(13);
            U_COLR_GLYPH = layout.offsetof(14);
    }

    protected FT_COLR_Paint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_COLR_Paint create(long address, @Nullable ByteBuffer container) {
        return new FT_COLR_Paint(address, container);
    }

    /**
     * Creates a {@code FT_COLR_Paint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_COLR_Paint(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code format} field. */
    @NativeType("FT_PaintFormat")
    public int format() { return nformat(address()); }
    /** @return a {@link FT_PaintColrLayers} view of the {@code u.colr_layers} field. */
    public FT_PaintColrLayers u_colr_layers() { return nu_colr_layers(address()); }
    /** @return a {@link FT_PaintGlyph} view of the {@code u.glyph} field. */
    public FT_PaintGlyph u_glyph() { return nu_glyph(address()); }
    /** @return a {@link FT_PaintSolid} view of the {@code u.solid} field. */
    public FT_PaintSolid u_solid() { return nu_solid(address()); }
    /** @return a {@link FT_PaintLinearGradient} view of the {@code u.linear_gradient} field. */
    public FT_PaintLinearGradient u_linear_gradient() { return nu_linear_gradient(address()); }
    /** @return a {@link FT_PaintRadialGradient} view of the {@code u.radial_gradient} field. */
    public FT_PaintRadialGradient u_radial_gradient() { return nu_radial_gradient(address()); }
    /** @return a {@link FT_PaintSweepGradient} view of the {@code u.sweep_gradient} field. */
    public FT_PaintSweepGradient u_sweep_gradient() { return nu_sweep_gradient(address()); }
    /** @return a {@link FT_PaintTransform} view of the {@code u.transform} field. */
    public FT_PaintTransform u_transform() { return nu_transform(address()); }
    /** @return a {@link FT_PaintTranslate} view of the {@code u.translate} field. */
    public FT_PaintTranslate u_translate() { return nu_translate(address()); }
    /** @return a {@link FT_PaintScale} view of the {@code u.scale} field. */
    public FT_PaintScale u_scale() { return nu_scale(address()); }
    /** @return a {@link FT_PaintRotate} view of the {@code u.rotate} field. */
    public FT_PaintRotate u_rotate() { return nu_rotate(address()); }
    /** @return a {@link FT_PaintSkew} view of the {@code u.skew} field. */
    public FT_PaintSkew u_skew() { return nu_skew(address()); }
    /** @return a {@link FT_PaintComposite} view of the {@code u.composite} field. */
    public FT_PaintComposite u_composite() { return nu_composite(address()); }
    /** @return a {@link FT_PaintColrGlyph} view of the {@code u.colr_glyph} field. */
    public FT_PaintColrGlyph u_colr_glyph() { return nu_colr_glyph(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_COLR_Paint} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_COLR_Paint malloc() {
        return new FT_COLR_Paint(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_COLR_Paint} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_COLR_Paint calloc() {
        return new FT_COLR_Paint(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_COLR_Paint} instance allocated with {@link BufferUtils}. */
    public static FT_COLR_Paint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_COLR_Paint(memAddress(container), container);
    }

    /** Returns a new {@code FT_COLR_Paint} instance for the specified memory address. */
    public static FT_COLR_Paint create(long address) {
        return new FT_COLR_Paint(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_COLR_Paint createSafe(long address) {
        return address == NULL ? null : new FT_COLR_Paint(address, null);
    }

    /**
     * Returns a new {@link FT_COLR_Paint.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_COLR_Paint.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_COLR_Paint.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_COLR_Paint.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_COLR_Paint.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_COLR_Paint.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_COLR_Paint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_COLR_Paint.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_COLR_Paint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_COLR_Paint} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_COLR_Paint malloc(MemoryStack stack) {
        return new FT_COLR_Paint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_COLR_Paint} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_COLR_Paint calloc(MemoryStack stack) {
        return new FT_COLR_Paint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_COLR_Paint.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_COLR_Paint.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_COLR_Paint.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_COLR_Paint.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + FT_COLR_Paint.FORMAT); }
    /** Unsafe version of {@link #u_colr_layers}. */
    public static FT_PaintColrLayers nu_colr_layers(long struct) { return FT_PaintColrLayers.create(struct + FT_COLR_Paint.U_COLR_LAYERS); }
    /** Unsafe version of {@link #u_glyph}. */
    public static FT_PaintGlyph nu_glyph(long struct) { return FT_PaintGlyph.create(struct + FT_COLR_Paint.U_GLYPH); }
    /** Unsafe version of {@link #u_solid}. */
    public static FT_PaintSolid nu_solid(long struct) { return FT_PaintSolid.create(struct + FT_COLR_Paint.U_SOLID); }
    /** Unsafe version of {@link #u_linear_gradient}. */
    public static FT_PaintLinearGradient nu_linear_gradient(long struct) { return FT_PaintLinearGradient.create(struct + FT_COLR_Paint.U_LINEAR_GRADIENT); }
    /** Unsafe version of {@link #u_radial_gradient}. */
    public static FT_PaintRadialGradient nu_radial_gradient(long struct) { return FT_PaintRadialGradient.create(struct + FT_COLR_Paint.U_RADIAL_GRADIENT); }
    /** Unsafe version of {@link #u_sweep_gradient}. */
    public static FT_PaintSweepGradient nu_sweep_gradient(long struct) { return FT_PaintSweepGradient.create(struct + FT_COLR_Paint.U_SWEEP_GRADIENT); }
    /** Unsafe version of {@link #u_transform}. */
    public static FT_PaintTransform nu_transform(long struct) { return FT_PaintTransform.create(struct + FT_COLR_Paint.U_TRANSFORM); }
    /** Unsafe version of {@link #u_translate}. */
    public static FT_PaintTranslate nu_translate(long struct) { return FT_PaintTranslate.create(struct + FT_COLR_Paint.U_TRANSLATE); }
    /** Unsafe version of {@link #u_scale}. */
    public static FT_PaintScale nu_scale(long struct) { return FT_PaintScale.create(struct + FT_COLR_Paint.U_SCALE); }
    /** Unsafe version of {@link #u_rotate}. */
    public static FT_PaintRotate nu_rotate(long struct) { return FT_PaintRotate.create(struct + FT_COLR_Paint.U_ROTATE); }
    /** Unsafe version of {@link #u_skew}. */
    public static FT_PaintSkew nu_skew(long struct) { return FT_PaintSkew.create(struct + FT_COLR_Paint.U_SKEW); }
    /** Unsafe version of {@link #u_composite}. */
    public static FT_PaintComposite nu_composite(long struct) { return FT_PaintComposite.create(struct + FT_COLR_Paint.U_COMPOSITE); }
    /** Unsafe version of {@link #u_colr_glyph}. */
    public static FT_PaintColrGlyph nu_colr_glyph(long struct) { return FT_PaintColrGlyph.create(struct + FT_COLR_Paint.U_COLR_GLYPH); }

    // -----------------------------------

    /** An array of {@link FT_COLR_Paint} structs. */
    public static class Buffer extends StructBuffer<FT_COLR_Paint, Buffer> implements NativeResource {

        private static final FT_COLR_Paint ELEMENT_FACTORY = FT_COLR_Paint.create(-1L);

        /**
         * Creates a new {@code FT_COLR_Paint.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_COLR_Paint#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_COLR_Paint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code format} field. */
        @NativeType("FT_PaintFormat")
        public int format() { return FT_COLR_Paint.nformat(address()); }
        /** @return a {@link FT_PaintColrLayers} view of the {@code u.colr_layers} field. */
        public FT_PaintColrLayers u_colr_layers() { return FT_COLR_Paint.nu_colr_layers(address()); }
        /** @return a {@link FT_PaintGlyph} view of the {@code u.glyph} field. */
        public FT_PaintGlyph u_glyph() { return FT_COLR_Paint.nu_glyph(address()); }
        /** @return a {@link FT_PaintSolid} view of the {@code u.solid} field. */
        public FT_PaintSolid u_solid() { return FT_COLR_Paint.nu_solid(address()); }
        /** @return a {@link FT_PaintLinearGradient} view of the {@code u.linear_gradient} field. */
        public FT_PaintLinearGradient u_linear_gradient() { return FT_COLR_Paint.nu_linear_gradient(address()); }
        /** @return a {@link FT_PaintRadialGradient} view of the {@code u.radial_gradient} field. */
        public FT_PaintRadialGradient u_radial_gradient() { return FT_COLR_Paint.nu_radial_gradient(address()); }
        /** @return a {@link FT_PaintSweepGradient} view of the {@code u.sweep_gradient} field. */
        public FT_PaintSweepGradient u_sweep_gradient() { return FT_COLR_Paint.nu_sweep_gradient(address()); }
        /** @return a {@link FT_PaintTransform} view of the {@code u.transform} field. */
        public FT_PaintTransform u_transform() { return FT_COLR_Paint.nu_transform(address()); }
        /** @return a {@link FT_PaintTranslate} view of the {@code u.translate} field. */
        public FT_PaintTranslate u_translate() { return FT_COLR_Paint.nu_translate(address()); }
        /** @return a {@link FT_PaintScale} view of the {@code u.scale} field. */
        public FT_PaintScale u_scale() { return FT_COLR_Paint.nu_scale(address()); }
        /** @return a {@link FT_PaintRotate} view of the {@code u.rotate} field. */
        public FT_PaintRotate u_rotate() { return FT_COLR_Paint.nu_rotate(address()); }
        /** @return a {@link FT_PaintSkew} view of the {@code u.skew} field. */
        public FT_PaintSkew u_skew() { return FT_COLR_Paint.nu_skew(address()); }
        /** @return a {@link FT_PaintComposite} view of the {@code u.composite} field. */
        public FT_PaintComposite u_composite() { return FT_COLR_Paint.nu_composite(address()); }
        /** @return a {@link FT_PaintColrGlyph} view of the {@code u.colr_glyph} field. */
        public FT_PaintColrGlyph u_colr_glyph() { return FT_COLR_Paint.nu_colr_glyph(address()); }

    }

}