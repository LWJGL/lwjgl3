/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct nk_draw_command {
 *     unsigned int elem_count;
 *     {@link NkRect struct nk_rect} clip_rect;
 *     {@link NkHandle nk_handle} texture;
 *     {@link NkHandle nk_handle} userdata;
 * }</pre></code>
 */
@NativeType("struct nk_draw_command")
public class NkDrawCommand extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ELEM_COUNT,
        CLIP_RECT,
        TEXTURE,
        USERDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(NkRect.SIZEOF, NkRect.ALIGNOF),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ELEM_COUNT = layout.offsetof(0);
        CLIP_RECT = layout.offsetof(1);
        TEXTURE = layout.offsetof(2);
        USERDATA = layout.offsetof(3);
    }

    NkDrawCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NkDrawCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkDrawCommand(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code elem_count} field. */
    @NativeType("unsigned int")
    public int elem_count() { return nelem_count(address()); }
    /** Returns a {@link NkRect} view of the {@code clip_rect} field. */
    @NativeType("struct nk_rect")
    public NkRect clip_rect() { return nclip_rect(address()); }
    /** Passes the {@code clip_rect} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkDrawCommand clip_rect(java.util.function.Consumer<NkRect> consumer) { consumer.accept(clip_rect()); return this; }
    /** Returns a {@link NkHandle} view of the {@code texture} field. */
    @NativeType("nk_handle")
    public NkHandle texture() { return ntexture(address()); }
    /** Passes the {@code texture} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkDrawCommand texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }
    /** Returns a {@link NkHandle} view of the {@code userdata} field. */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }
    /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkDrawCommand userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }

    // -----------------------------------

    /** Returns a new {@link NkDrawCommand} instance for the specified memory address. */
    public static NkDrawCommand create(long address) {
        return new NkDrawCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkDrawCommand createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link NkDrawCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkDrawCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkDrawCommand.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #elem_count}. */
    public static int nelem_count(long struct) { return memGetInt(struct + NkDrawCommand.ELEM_COUNT); }
    /** Unsafe version of {@link #clip_rect}. */
    public static NkRect nclip_rect(long struct) { return NkRect.create(struct + NkDrawCommand.CLIP_RECT); }
    /** Unsafe version of {@link #texture}. */
    public static NkHandle ntexture(long struct) { return NkHandle.create(struct + NkDrawCommand.TEXTURE); }
    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkDrawCommand.USERDATA); }

    // -----------------------------------

    /** An array of {@link NkDrawCommand} structs. */
    public static class Buffer extends StructBuffer<NkDrawCommand, Buffer> {

        /**
         * Creates a new {@link NkDrawCommand.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkDrawCommand#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected NkDrawCommand newInstance(long address) {
            return new NkDrawCommand(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code elem_count} field. */
        @NativeType("unsigned int")
        public int elem_count() { return NkDrawCommand.nelem_count(address()); }
        /** Returns a {@link NkRect} view of the {@code clip_rect} field. */
        @NativeType("struct nk_rect")
        public NkRect clip_rect() { return NkDrawCommand.nclip_rect(address()); }
        /** Passes the {@code clip_rect} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkDrawCommand.Buffer clip_rect(java.util.function.Consumer<NkRect> consumer) { consumer.accept(clip_rect()); return this; }
        /** Returns a {@link NkHandle} view of the {@code texture} field. */
        @NativeType("nk_handle")
        public NkHandle texture() { return NkDrawCommand.ntexture(address()); }
        /** Passes the {@code texture} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkDrawCommand.Buffer texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }
        /** Returns a {@link NkHandle} view of the {@code userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkDrawCommand.nuserdata(address()); }
        /** Passes the {@code userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkDrawCommand.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }

    }

}