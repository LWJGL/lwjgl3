/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_STUDIO_SOUND_INFO {
 *     char const * name_or_data;
 *     FMOD_MODE mode;
 *     {@link FMOD_CREATESOUNDEXINFO FMOD_CREATESOUNDEXINFO} exinfo;
 *     int subsoundindex;
 * }</code></pre>
 */
public class FMOD_STUDIO_SOUND_INFO extends Struct<FMOD_STUDIO_SOUND_INFO> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME_OR_DATA,
        MODE,
        EXINFO,
        SUBSOUNDINDEX;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(FMOD_CREATESOUNDEXINFO.SIZEOF, FMOD_CREATESOUNDEXINFO.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME_OR_DATA = layout.offsetof(0);
        MODE = layout.offsetof(1);
        EXINFO = layout.offsetof(2);
        SUBSOUNDINDEX = layout.offsetof(3);
    }

    protected FMOD_STUDIO_SOUND_INFO(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_SOUND_INFO create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_SOUND_INFO(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_SOUND_INFO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_SOUND_INFO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * @return a {@link ByteBuffer} view of the data pointed to by the {@code name_or_data} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("char const *")
    public ByteBuffer name_or_data(int capacity) { return nname_or_data(address(), capacity); }
    /** @return the value of the {@code mode} field. */
    @NativeType("FMOD_MODE")
    public int mode() { return nmode(address()); }
    /** @return a {@link FMOD_CREATESOUNDEXINFO} view of the {@code exinfo} field. */
    public FMOD_CREATESOUNDEXINFO exinfo() { return nexinfo(address()); }
    /** @return the value of the {@code subsoundindex} field. */
    public int subsoundindex() { return nsubsoundindex(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code name_or_data} field. */
    public FMOD_STUDIO_SOUND_INFO name_or_data(@NativeType("char const *") ByteBuffer value) { nname_or_data(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public FMOD_STUDIO_SOUND_INFO mode(@NativeType("FMOD_MODE") int value) { nmode(address(), value); return this; }
    /** Copies the specified {@link FMOD_CREATESOUNDEXINFO} to the {@code exinfo} field. */
    public FMOD_STUDIO_SOUND_INFO exinfo(FMOD_CREATESOUNDEXINFO value) { nexinfo(address(), value); return this; }
    /** Passes the {@code exinfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FMOD_STUDIO_SOUND_INFO exinfo(java.util.function.Consumer<FMOD_CREATESOUNDEXINFO> consumer) { consumer.accept(exinfo()); return this; }
    /** Sets the specified value to the {@code subsoundindex} field. */
    public FMOD_STUDIO_SOUND_INFO subsoundindex(int value) { nsubsoundindex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_SOUND_INFO set(
        ByteBuffer name_or_data,
        int mode,
        FMOD_CREATESOUNDEXINFO exinfo,
        int subsoundindex
    ) {
        name_or_data(name_or_data);
        mode(mode);
        exinfo(exinfo);
        subsoundindex(subsoundindex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_SOUND_INFO set(FMOD_STUDIO_SOUND_INFO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_SOUND_INFO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_SOUND_INFO malloc() {
        return new FMOD_STUDIO_SOUND_INFO(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_SOUND_INFO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_SOUND_INFO calloc() {
        return new FMOD_STUDIO_SOUND_INFO(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_SOUND_INFO} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_SOUND_INFO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_SOUND_INFO(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_SOUND_INFO} instance for the specified memory address. */
    public static FMOD_STUDIO_SOUND_INFO create(long address) {
        return new FMOD_STUDIO_SOUND_INFO(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_SOUND_INFO createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_SOUND_INFO(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_SOUND_INFO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_SOUND_INFO.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_SOUND_INFO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_SOUND_INFO.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_SOUND_INFO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_SOUND_INFO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_SOUND_INFO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_SOUND_INFO.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_SOUND_INFO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_SOUND_INFO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_SOUND_INFO malloc(MemoryStack stack) {
        return new FMOD_STUDIO_SOUND_INFO(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_SOUND_INFO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_SOUND_INFO calloc(MemoryStack stack) {
        return new FMOD_STUDIO_SOUND_INFO(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_SOUND_INFO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_SOUND_INFO.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_SOUND_INFO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_SOUND_INFO.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name_or_data(int) name_or_data}. */
    public static ByteBuffer nname_or_data(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + FMOD_STUDIO_SOUND_INFO.NAME_OR_DATA), capacity); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_SOUND_INFO.MODE); }
    /** Unsafe version of {@link #exinfo}. */
    public static FMOD_CREATESOUNDEXINFO nexinfo(long struct) { return FMOD_CREATESOUNDEXINFO.create(struct + FMOD_STUDIO_SOUND_INFO.EXINFO); }
    /** Unsafe version of {@link #subsoundindex}. */
    public static int nsubsoundindex(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_SOUND_INFO.SUBSOUNDINDEX); }

    /** Unsafe version of {@link #name_or_data(ByteBuffer) name_or_data}. */
    public static void nname_or_data(long struct, ByteBuffer value) { memPutAddress(struct + FMOD_STUDIO_SOUND_INFO.NAME_OR_DATA, memAddress(value)); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_SOUND_INFO.MODE, value); }
    /** Unsafe version of {@link #exinfo(FMOD_CREATESOUNDEXINFO) exinfo}. */
    public static void nexinfo(long struct, FMOD_CREATESOUNDEXINFO value) { memCopy(value.address(), struct + FMOD_STUDIO_SOUND_INFO.EXINFO, FMOD_CREATESOUNDEXINFO.SIZEOF); }
    /** Unsafe version of {@link #subsoundindex(int) subsoundindex}. */
    public static void nsubsoundindex(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_SOUND_INFO.SUBSOUNDINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_STUDIO_SOUND_INFO.NAME_OR_DATA));
        FMOD_CREATESOUNDEXINFO.validate(struct + FMOD_STUDIO_SOUND_INFO.EXINFO);
    }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_SOUND_INFO} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_SOUND_INFO, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_SOUND_INFO ELEMENT_FACTORY = FMOD_STUDIO_SOUND_INFO.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_SOUND_INFO.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_SOUND_INFO#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_SOUND_INFO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@code name_or_data} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("char const *")
        public ByteBuffer name_or_data(int capacity) { return FMOD_STUDIO_SOUND_INFO.nname_or_data(address(), capacity); }
        /** @return the value of the {@code mode} field. */
        @NativeType("FMOD_MODE")
        public int mode() { return FMOD_STUDIO_SOUND_INFO.nmode(address()); }
        /** @return a {@link FMOD_CREATESOUNDEXINFO} view of the {@code exinfo} field. */
        public FMOD_CREATESOUNDEXINFO exinfo() { return FMOD_STUDIO_SOUND_INFO.nexinfo(address()); }
        /** @return the value of the {@code subsoundindex} field. */
        public int subsoundindex() { return FMOD_STUDIO_SOUND_INFO.nsubsoundindex(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code name_or_data} field. */
        public FMOD_STUDIO_SOUND_INFO.Buffer name_or_data(@NativeType("char const *") ByteBuffer value) { FMOD_STUDIO_SOUND_INFO.nname_or_data(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public FMOD_STUDIO_SOUND_INFO.Buffer mode(@NativeType("FMOD_MODE") int value) { FMOD_STUDIO_SOUND_INFO.nmode(address(), value); return this; }
        /** Copies the specified {@link FMOD_CREATESOUNDEXINFO} to the {@code exinfo} field. */
        public FMOD_STUDIO_SOUND_INFO.Buffer exinfo(FMOD_CREATESOUNDEXINFO value) { FMOD_STUDIO_SOUND_INFO.nexinfo(address(), value); return this; }
        /** Passes the {@code exinfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FMOD_STUDIO_SOUND_INFO.Buffer exinfo(java.util.function.Consumer<FMOD_CREATESOUNDEXINFO> consumer) { consumer.accept(exinfo()); return this; }
        /** Sets the specified value to the {@code subsoundindex} field. */
        public FMOD_STUDIO_SOUND_INFO.Buffer subsoundindex(int value) { FMOD_STUDIO_SOUND_INFO.nsubsoundindex(address(), value); return this; }

    }

}