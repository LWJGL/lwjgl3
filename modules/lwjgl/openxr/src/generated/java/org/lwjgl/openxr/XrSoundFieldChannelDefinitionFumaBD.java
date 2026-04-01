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
 * struct XrSoundFieldChannelDefinitionFumaBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSoundFieldChannelMaskFumaBD channelMask;
 * }}</pre>
 */
public class XrSoundFieldChannelDefinitionFumaBD extends Struct<XrSoundFieldChannelDefinitionFumaBD> implements NativeResource {

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

    protected XrSoundFieldChannelDefinitionFumaBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundFieldChannelDefinitionFumaBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundFieldChannelDefinitionFumaBD(address, container);
    }

    /**
     * Creates a {@code XrSoundFieldChannelDefinitionFumaBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundFieldChannelDefinitionFumaBD(ByteBuffer container) {
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
    @NativeType("XrSoundFieldChannelMaskFumaBD")
    public int channelMask() { return nchannelMask(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundFieldChannelDefinitionFumaBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD} value to the {@code type} field. */
    public XrSoundFieldChannelDefinitionFumaBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundFieldChannelDefinitionFumaBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code channelMask} field. */
    public XrSoundFieldChannelDefinitionFumaBD channelMask(@NativeType("XrSoundFieldChannelMaskFumaBD") int value) { nchannelMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundFieldChannelDefinitionFumaBD set(
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
    public XrSoundFieldChannelDefinitionFumaBD set(XrSoundFieldChannelDefinitionFumaBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundFieldChannelDefinitionFumaBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundFieldChannelDefinitionFumaBD malloc() {
        return new XrSoundFieldChannelDefinitionFumaBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundFieldChannelDefinitionFumaBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundFieldChannelDefinitionFumaBD calloc() {
        return new XrSoundFieldChannelDefinitionFumaBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundFieldChannelDefinitionFumaBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundFieldChannelDefinitionFumaBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundFieldChannelDefinitionFumaBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundFieldChannelDefinitionFumaBD} instance for the specified memory address. */
    public static XrSoundFieldChannelDefinitionFumaBD create(long address) {
        return new XrSoundFieldChannelDefinitionFumaBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundFieldChannelDefinitionFumaBD createSafe(long address) {
        return address == NULL ? null : new XrSoundFieldChannelDefinitionFumaBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionFumaBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionFumaBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionFumaBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionFumaBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionFumaBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionFumaBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundFieldChannelDefinitionFumaBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionFumaBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundFieldChannelDefinitionFumaBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundFieldChannelDefinitionFumaBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundFieldChannelDefinitionFumaBD malloc(MemoryStack stack) {
        return new XrSoundFieldChannelDefinitionFumaBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundFieldChannelDefinitionFumaBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundFieldChannelDefinitionFumaBD calloc(MemoryStack stack) {
        return new XrSoundFieldChannelDefinitionFumaBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionFumaBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionFumaBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundFieldChannelDefinitionFumaBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundFieldChannelDefinitionFumaBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundFieldChannelDefinitionFumaBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundFieldChannelDefinitionFumaBD.NEXT); }
    /** Unsafe version of {@link #channelMask}. */
    public static int nchannelMask(long struct) { return memGetInt(struct + XrSoundFieldChannelDefinitionFumaBD.CHANNELMASK); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundFieldChannelDefinitionFumaBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundFieldChannelDefinitionFumaBD.NEXT, value); }
    /** Unsafe version of {@link #channelMask(int) channelMask}. */
    public static void nchannelMask(long struct, int value) { memPutInt(struct + XrSoundFieldChannelDefinitionFumaBD.CHANNELMASK, value); }

    // -----------------------------------

    /** An array of {@link XrSoundFieldChannelDefinitionFumaBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundFieldChannelDefinitionFumaBD, Buffer> implements NativeResource {

        private static final XrSoundFieldChannelDefinitionFumaBD ELEMENT_FACTORY = XrSoundFieldChannelDefinitionFumaBD.create(-1L);

        /**
         * Creates a new {@code XrSoundFieldChannelDefinitionFumaBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundFieldChannelDefinitionFumaBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundFieldChannelDefinitionFumaBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundFieldChannelDefinitionFumaBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundFieldChannelDefinitionFumaBD.nnext(address()); }
        /** @return the value of the {@code channelMask} field. */
        @NativeType("XrSoundFieldChannelMaskFumaBD")
        public int channelMask() { return XrSoundFieldChannelDefinitionFumaBD.nchannelMask(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundFieldChannelDefinitionFumaBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundFieldChannelDefinitionFumaBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD} value to the {@code type} field. */
        public XrSoundFieldChannelDefinitionFumaBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_FIELD_CHANNEL_DEFINITION_FUMA_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundFieldChannelDefinitionFumaBD.Buffer next(@NativeType("void const *") long value) { XrSoundFieldChannelDefinitionFumaBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code channelMask} field. */
        public XrSoundFieldChannelDefinitionFumaBD.Buffer channelMask(@NativeType("XrSoundFieldChannelMaskFumaBD") int value) { XrSoundFieldChannelDefinitionFumaBD.nchannelMask(address(), value); return this; }

    }

}