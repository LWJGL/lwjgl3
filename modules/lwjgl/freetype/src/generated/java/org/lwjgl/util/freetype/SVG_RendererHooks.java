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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure that stores the four hooks needed to render OT-SVG glyphs properly.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct SVG_RendererHooks {
 *     {@link SVG_Lib_Init_FuncI SVG_Lib_Init_Func} init_svg;
 *     {@link SVG_Lib_Free_FuncI SVG_Lib_Free_Func} free_svg;
 *     {@link SVG_Lib_Render_FuncI SVG_Lib_Render_Func} render_svg;
 *     {@link SVG_Lib_Preset_Slot_FuncI SVG_Lib_Preset_Slot_Func} preset_slot;
 * }</code></pre>
 */
public class SVG_RendererHooks extends Struct<SVG_RendererHooks> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INIT_SVG,
        FREE_SVG,
        RENDER_SVG,
        PRESET_SLOT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INIT_SVG = layout.offsetof(0);
        FREE_SVG = layout.offsetof(1);
        RENDER_SVG = layout.offsetof(2);
        PRESET_SLOT = layout.offsetof(3);
    }

    protected SVG_RendererHooks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SVG_RendererHooks create(long address, @Nullable ByteBuffer container) {
        return new SVG_RendererHooks(address, container);
    }

    /**
     * Creates a {@code SVG_RendererHooks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SVG_RendererHooks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code init_svg} field. */
    public SVG_Lib_Init_Func init_svg() { return ninit_svg(address()); }
    /** @return the value of the {@code free_svg} field. */
    public SVG_Lib_Free_Func free_svg() { return nfree_svg(address()); }
    /** @return the value of the {@code render_svg} field. */
    public SVG_Lib_Render_Func render_svg() { return nrender_svg(address()); }
    /** @return the value of the {@code preset_slot} field. */
    public SVG_Lib_Preset_Slot_Func preset_slot() { return npreset_slot(address()); }

    /** Sets the specified value to the {@code init_svg} field. */
    public SVG_RendererHooks init_svg(@NativeType("SVG_Lib_Init_Func") SVG_Lib_Init_FuncI value) { ninit_svg(address(), value); return this; }
    /** Sets the specified value to the {@code free_svg} field. */
    public SVG_RendererHooks free_svg(@NativeType("SVG_Lib_Free_Func") SVG_Lib_Free_FuncI value) { nfree_svg(address(), value); return this; }
    /** Sets the specified value to the {@code render_svg} field. */
    public SVG_RendererHooks render_svg(@NativeType("SVG_Lib_Render_Func") SVG_Lib_Render_FuncI value) { nrender_svg(address(), value); return this; }
    /** Sets the specified value to the {@code preset_slot} field. */
    public SVG_RendererHooks preset_slot(@NativeType("SVG_Lib_Preset_Slot_Func") SVG_Lib_Preset_Slot_FuncI value) { npreset_slot(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SVG_RendererHooks set(
        SVG_Lib_Init_FuncI init_svg,
        SVG_Lib_Free_FuncI free_svg,
        SVG_Lib_Render_FuncI render_svg,
        SVG_Lib_Preset_Slot_FuncI preset_slot
    ) {
        init_svg(init_svg);
        free_svg(free_svg);
        render_svg(render_svg);
        preset_slot(preset_slot);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SVG_RendererHooks set(SVG_RendererHooks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SVG_RendererHooks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SVG_RendererHooks malloc() {
        return new SVG_RendererHooks(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SVG_RendererHooks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SVG_RendererHooks calloc() {
        return new SVG_RendererHooks(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SVG_RendererHooks} instance allocated with {@link BufferUtils}. */
    public static SVG_RendererHooks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SVG_RendererHooks(memAddress(container), container);
    }

    /** Returns a new {@code SVG_RendererHooks} instance for the specified memory address. */
    public static SVG_RendererHooks create(long address) {
        return new SVG_RendererHooks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SVG_RendererHooks createSafe(long address) {
        return address == NULL ? null : new SVG_RendererHooks(address, null);
    }

    /**
     * Returns a new {@link SVG_RendererHooks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SVG_RendererHooks.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SVG_RendererHooks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SVG_RendererHooks.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SVG_RendererHooks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SVG_RendererHooks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SVG_RendererHooks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SVG_RendererHooks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SVG_RendererHooks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SVG_RendererHooks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SVG_RendererHooks malloc(MemoryStack stack) {
        return new SVG_RendererHooks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SVG_RendererHooks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SVG_RendererHooks calloc(MemoryStack stack) {
        return new SVG_RendererHooks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SVG_RendererHooks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SVG_RendererHooks.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SVG_RendererHooks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SVG_RendererHooks.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #init_svg}. */
    public static SVG_Lib_Init_Func ninit_svg(long struct) { return SVG_Lib_Init_Func.create(memGetAddress(struct + SVG_RendererHooks.INIT_SVG)); }
    /** Unsafe version of {@link #free_svg}. */
    public static SVG_Lib_Free_Func nfree_svg(long struct) { return SVG_Lib_Free_Func.create(memGetAddress(struct + SVG_RendererHooks.FREE_SVG)); }
    /** Unsafe version of {@link #render_svg}. */
    public static SVG_Lib_Render_Func nrender_svg(long struct) { return SVG_Lib_Render_Func.create(memGetAddress(struct + SVG_RendererHooks.RENDER_SVG)); }
    /** Unsafe version of {@link #preset_slot}. */
    public static SVG_Lib_Preset_Slot_Func npreset_slot(long struct) { return SVG_Lib_Preset_Slot_Func.create(memGetAddress(struct + SVG_RendererHooks.PRESET_SLOT)); }

    /** Unsafe version of {@link #init_svg(SVG_Lib_Init_FuncI) init_svg}. */
    public static void ninit_svg(long struct, SVG_Lib_Init_FuncI value) { memPutAddress(struct + SVG_RendererHooks.INIT_SVG, value.address()); }
    /** Unsafe version of {@link #free_svg(SVG_Lib_Free_FuncI) free_svg}. */
    public static void nfree_svg(long struct, SVG_Lib_Free_FuncI value) { memPutAddress(struct + SVG_RendererHooks.FREE_SVG, value.address()); }
    /** Unsafe version of {@link #render_svg(SVG_Lib_Render_FuncI) render_svg}. */
    public static void nrender_svg(long struct, SVG_Lib_Render_FuncI value) { memPutAddress(struct + SVG_RendererHooks.RENDER_SVG, value.address()); }
    /** Unsafe version of {@link #preset_slot(SVG_Lib_Preset_Slot_FuncI) preset_slot}. */
    public static void npreset_slot(long struct, SVG_Lib_Preset_Slot_FuncI value) { memPutAddress(struct + SVG_RendererHooks.PRESET_SLOT, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SVG_RendererHooks.INIT_SVG));
        check(memGetAddress(struct + SVG_RendererHooks.FREE_SVG));
        check(memGetAddress(struct + SVG_RendererHooks.RENDER_SVG));
        check(memGetAddress(struct + SVG_RendererHooks.PRESET_SLOT));
    }

    // -----------------------------------

    /** An array of {@link SVG_RendererHooks} structs. */
    public static class Buffer extends StructBuffer<SVG_RendererHooks, Buffer> implements NativeResource {

        private static final SVG_RendererHooks ELEMENT_FACTORY = SVG_RendererHooks.create(-1L);

        /**
         * Creates a new {@code SVG_RendererHooks.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SVG_RendererHooks#SIZEOF}, and its mark will be undefined.</p>
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
        protected SVG_RendererHooks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code init_svg} field. */
        public SVG_Lib_Init_Func init_svg() { return SVG_RendererHooks.ninit_svg(address()); }
        /** @return the value of the {@code free_svg} field. */
        public SVG_Lib_Free_Func free_svg() { return SVG_RendererHooks.nfree_svg(address()); }
        /** @return the value of the {@code render_svg} field. */
        public SVG_Lib_Render_Func render_svg() { return SVG_RendererHooks.nrender_svg(address()); }
        /** @return the value of the {@code preset_slot} field. */
        public SVG_Lib_Preset_Slot_Func preset_slot() { return SVG_RendererHooks.npreset_slot(address()); }

        /** Sets the specified value to the {@code init_svg} field. */
        public SVG_RendererHooks.Buffer init_svg(@NativeType("SVG_Lib_Init_Func") SVG_Lib_Init_FuncI value) { SVG_RendererHooks.ninit_svg(address(), value); return this; }
        /** Sets the specified value to the {@code free_svg} field. */
        public SVG_RendererHooks.Buffer free_svg(@NativeType("SVG_Lib_Free_Func") SVG_Lib_Free_FuncI value) { SVG_RendererHooks.nfree_svg(address(), value); return this; }
        /** Sets the specified value to the {@code render_svg} field. */
        public SVG_RendererHooks.Buffer render_svg(@NativeType("SVG_Lib_Render_Func") SVG_Lib_Render_FuncI value) { SVG_RendererHooks.nrender_svg(address(), value); return this; }
        /** Sets the specified value to the {@code preset_slot} field. */
        public SVG_RendererHooks.Buffer preset_slot(@NativeType("SVG_Lib_Preset_Slot_Func") SVG_Lib_Preset_Slot_FuncI value) { SVG_RendererHooks.npreset_slot(address(), value); return this; }

    }

}