/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSoundFieldChannelDefinitionSurroundBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSoundFieldChannelMaskSurroundBD channelMask;
 * }}</pre>
 */
public class XrSoundFieldChannelDefinitionSurroundBD extends Struct<XrSoundFieldChannelDefinitionSurroundBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CHANNELMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CHANNELMASK = layout.offsetof(2);
    }

    protected XrSoundFieldChannelDefinitionSurroundBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundFieldChannelDefinitionSurroundBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundFieldChannelDefinitionSurroundBD(address, container);
    }

    /**
     * Creates a {@code XrSoundFieldChannelDefinitionSurroundBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundFieldChannelDefinitionSurroundBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code channelMask} field. */
    @NativeType("XrSoundFieldChannelMaskSurroundBD")
    public int channelMask() { return nchannelMask(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundFieldChannelDefinitionSurroundBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD} value to the {@code type} field. */
    public XrSoundFieldChannelDefinitionSurroundBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundFieldChannelDefinitionSurroundBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code channelMask} field. */
    public XrSoundFieldChannelDefinitionSurroundBD channelMask(@NativeType("XrSoundFieldChannelMaskSurroundBD") int value) { nchannelMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundFieldChannelDefinitionSurroundBD set(
        int type,
        long next,
        int channelMask
    ) {
        type(type);
        next(next);
        channelMask(channelMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundFieldChannelDefinitionSurroundBD set(XrSoundFieldChannelDefinitionSurroundBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundFieldChannelDefinitionSurroundBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundFieldChannelDefinitionSurroundBD malloc() {
        return new XrSoundFieldChannelDefinitionSurroundBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundFieldChannelDefinitionSurroundBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundFieldChannelDefinitionSurroundBD calloc() {
        return new XrSoundFieldChannelDefinitionSurroundBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundFieldChannelDefinitionSurroundBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundFieldChannelDefinitionSurroundBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundFieldChannelDefinitionSurroundBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundFieldChannelDefinitionSurroundBD} instance for the specified memory address. */
    public static XrSoundFieldChannelDefinitionSurroundBD create(long address) {
        return new XrSoundFieldChannelDefinitionSurroundBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundFieldChannelDefinitionSurroundBD createSafe(long address) {
        return address == NULL ? null : new XrSoundFieldChannelDefinitionSurroundBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionSurroundBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionSurroundBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionSurroundBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionSurroundBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionSurroundBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionSurroundBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundFieldChannelDefinitionSurroundBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionSurroundBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundFieldChannelDefinitionSurroundBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundFieldChannelDefinitionSurroundBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundFieldChannelDefinitionSurroundBD malloc(MemoryStack stack) {
        return new XrSoundFieldChannelDefinitionSurroundBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundFieldChannelDefinitionSurroundBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundFieldChannelDefinitionSurroundBD calloc(MemoryStack stack) {
        return new XrSoundFieldChannelDefinitionSurroundBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionSurroundBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionSurroundBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionSurroundBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionSurroundBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundFieldChannelDefinitionSurroundBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundFieldChannelDefinitionSurroundBD.NEXT); }
    /** Unsafe version of {@link #channelMask}. */
    public static int nchannelMask(long struct) { return memGetInt(struct + XrSoundFieldChannelDefinitionSurroundBD.CHANNELMASK); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundFieldChannelDefinitionSurroundBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundFieldChannelDefinitionSurroundBD.NEXT, value); }
    /** Unsafe version of {@link #channelMask(int) channelMask}. */
    public static void nchannelMask(long struct, int value) { memPutInt(struct + XrSoundFieldChannelDefinitionSurroundBD.CHANNELMASK, value); }

    // -----------------------------------

    /** An array of {@link XrSoundFieldChannelDefinitionSurroundBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundFieldChannelDefinitionSurroundBD, Buffer> implements NativeResource {

        private static final XrSoundFieldChannelDefinitionSurroundBD ELEMENT_FACTORY = XrSoundFieldChannelDefinitionSurroundBD.create(-1L);

        /**
         * Creates a new {@code XrSoundFieldChannelDefinitionSurroundBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundFieldChannelDefinitionSurroundBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundFieldChannelDefinitionSurroundBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundFieldChannelDefinitionSurroundBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundFieldChannelDefinitionSurroundBD.nnext(address()); }
        /** @return the value of the {@code channelMask} field. */
        @NativeType("XrSoundFieldChannelMaskSurroundBD")
        public int channelMask() { return XrSoundFieldChannelDefinitionSurroundBD.nchannelMask(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundFieldChannelDefinitionSurroundBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundFieldChannelDefinitionSurroundBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD} value to the {@code type} field. */
        public XrSoundFieldChannelDefinitionSurroundBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_SURROUND_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundFieldChannelDefinitionSurroundBD.Buffer next(@NativeType("void const *") long value) { XrSoundFieldChannelDefinitionSurroundBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code channelMask} field. */
        public XrSoundFieldChannelDefinitionSurroundBD.Buffer channelMask(@NativeType("XrSoundFieldChannelMaskSurroundBD") int value) { XrSoundFieldChannelDefinitionSurroundBD.nchannelMask(address(), value); return this; }

    }

}