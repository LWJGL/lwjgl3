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
 * struct FMOD_STUDIO_ADVANCEDSETTINGS {
 *     int cbsize;
 *     unsigned int commandqueuesize;
 *     unsigned int handleinitialsize;
 *     int studioupdateperiod;
 *     int idlesampledatapoolsize;
 *     unsigned int streamingscheduledelay;
 *     char const * encryptionkey;
 * }</code></pre>
 */
public class FMOD_STUDIO_ADVANCEDSETTINGS extends Struct<FMOD_STUDIO_ADVANCEDSETTINGS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CBSIZE,
        COMMANDQUEUESIZE,
        HANDLEINITIALSIZE,
        STUDIOUPDATEPERIOD,
        IDLESAMPLEDATAPOOLSIZE,
        STREAMINGSCHEDULEDELAY,
        ENCRYPTIONKEY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CBSIZE = layout.offsetof(0);
        COMMANDQUEUESIZE = layout.offsetof(1);
        HANDLEINITIALSIZE = layout.offsetof(2);
        STUDIOUPDATEPERIOD = layout.offsetof(3);
        IDLESAMPLEDATAPOOLSIZE = layout.offsetof(4);
        STREAMINGSCHEDULEDELAY = layout.offsetof(5);
        ENCRYPTIONKEY = layout.offsetof(6);
    }

    protected FMOD_STUDIO_ADVANCEDSETTINGS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_STUDIO_ADVANCEDSETTINGS create(long address, @Nullable ByteBuffer container) {
        return new FMOD_STUDIO_ADVANCEDSETTINGS(address, container);
    }

    /**
     * Creates a {@code FMOD_STUDIO_ADVANCEDSETTINGS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_STUDIO_ADVANCEDSETTINGS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code cbsize} field. */
    public int cbsize() { return ncbsize(address()); }
    /** @return the value of the {@code commandqueuesize} field. */
    @NativeType("unsigned int")
    public int commandqueuesize() { return ncommandqueuesize(address()); }
    /** @return the value of the {@code handleinitialsize} field. */
    @NativeType("unsigned int")
    public int handleinitialsize() { return nhandleinitialsize(address()); }
    /** @return the value of the {@code studioupdateperiod} field. */
    public int studioupdateperiod() { return nstudioupdateperiod(address()); }
    /** @return the value of the {@code idlesampledatapoolsize} field. */
    public int idlesampledatapoolsize() { return nidlesampledatapoolsize(address()); }
    /** @return the value of the {@code streamingscheduledelay} field. */
    @NativeType("unsigned int")
    public int streamingscheduledelay() { return nstreamingscheduledelay(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code encryptionkey} field. */
    @NativeType("char const *")
    public ByteBuffer encryptionkey() { return nencryptionkey(address()); }
    /** @return the null-terminated string pointed to by the {@code encryptionkey} field. */
    @NativeType("char const *")
    public String encryptionkeyString() { return nencryptionkeyString(address()); }

    /** Sets the specified value to the {@code cbsize} field. */
    public FMOD_STUDIO_ADVANCEDSETTINGS cbsize(int value) { ncbsize(address(), value); return this; }
    /** Sets the specified value to the {@code commandqueuesize} field. */
    public FMOD_STUDIO_ADVANCEDSETTINGS commandqueuesize(@NativeType("unsigned int") int value) { ncommandqueuesize(address(), value); return this; }
    /** Sets the specified value to the {@code handleinitialsize} field. */
    public FMOD_STUDIO_ADVANCEDSETTINGS handleinitialsize(@NativeType("unsigned int") int value) { nhandleinitialsize(address(), value); return this; }
    /** Sets the specified value to the {@code studioupdateperiod} field. */
    public FMOD_STUDIO_ADVANCEDSETTINGS studioupdateperiod(int value) { nstudioupdateperiod(address(), value); return this; }
    /** Sets the specified value to the {@code idlesampledatapoolsize} field. */
    public FMOD_STUDIO_ADVANCEDSETTINGS idlesampledatapoolsize(int value) { nidlesampledatapoolsize(address(), value); return this; }
    /** Sets the specified value to the {@code streamingscheduledelay} field. */
    public FMOD_STUDIO_ADVANCEDSETTINGS streamingscheduledelay(@NativeType("unsigned int") int value) { nstreamingscheduledelay(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code encryptionkey} field. */
    public FMOD_STUDIO_ADVANCEDSETTINGS encryptionkey(@NativeType("char const *") ByteBuffer value) { nencryptionkey(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_STUDIO_ADVANCEDSETTINGS set(
        int cbsize,
        int commandqueuesize,
        int handleinitialsize,
        int studioupdateperiod,
        int idlesampledatapoolsize,
        int streamingscheduledelay,
        ByteBuffer encryptionkey
    ) {
        cbsize(cbsize);
        commandqueuesize(commandqueuesize);
        handleinitialsize(handleinitialsize);
        studioupdateperiod(studioupdateperiod);
        idlesampledatapoolsize(idlesampledatapoolsize);
        streamingscheduledelay(streamingscheduledelay);
        encryptionkey(encryptionkey);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_STUDIO_ADVANCEDSETTINGS set(FMOD_STUDIO_ADVANCEDSETTINGS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_STUDIO_ADVANCEDSETTINGS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_ADVANCEDSETTINGS malloc() {
        return new FMOD_STUDIO_ADVANCEDSETTINGS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_ADVANCEDSETTINGS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_STUDIO_ADVANCEDSETTINGS calloc() {
        return new FMOD_STUDIO_ADVANCEDSETTINGS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_STUDIO_ADVANCEDSETTINGS} instance allocated with {@link BufferUtils}. */
    public static FMOD_STUDIO_ADVANCEDSETTINGS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_STUDIO_ADVANCEDSETTINGS(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_STUDIO_ADVANCEDSETTINGS} instance for the specified memory address. */
    public static FMOD_STUDIO_ADVANCEDSETTINGS create(long address) {
        return new FMOD_STUDIO_ADVANCEDSETTINGS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_ADVANCEDSETTINGS createSafe(long address) {
        return address == NULL ? null : new FMOD_STUDIO_ADVANCEDSETTINGS(address, null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_ADVANCEDSETTINGS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_ADVANCEDSETTINGS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_ADVANCEDSETTINGS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_STUDIO_ADVANCEDSETTINGS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_STUDIO_ADVANCEDSETTINGS.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_ADVANCEDSETTINGS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS malloc(MemoryStack stack) {
        return new FMOD_STUDIO_ADVANCEDSETTINGS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_STUDIO_ADVANCEDSETTINGS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS calloc(MemoryStack stack) {
        return new FMOD_STUDIO_ADVANCEDSETTINGS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_ADVANCEDSETTINGS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_STUDIO_ADVANCEDSETTINGS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_STUDIO_ADVANCEDSETTINGS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cbsize}. */
    public static int ncbsize(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.CBSIZE); }
    /** Unsafe version of {@link #commandqueuesize}. */
    public static int ncommandqueuesize(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.COMMANDQUEUESIZE); }
    /** Unsafe version of {@link #handleinitialsize}. */
    public static int nhandleinitialsize(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.HANDLEINITIALSIZE); }
    /** Unsafe version of {@link #studioupdateperiod}. */
    public static int nstudioupdateperiod(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.STUDIOUPDATEPERIOD); }
    /** Unsafe version of {@link #idlesampledatapoolsize}. */
    public static int nidlesampledatapoolsize(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.IDLESAMPLEDATAPOOLSIZE); }
    /** Unsafe version of {@link #streamingscheduledelay}. */
    public static int nstreamingscheduledelay(long struct) { return UNSAFE.getInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.STREAMINGSCHEDULEDELAY); }
    /** Unsafe version of {@link #encryptionkey}. */
    public static ByteBuffer nencryptionkey(long struct) { return memByteBufferNT1(memGetAddress(struct + FMOD_STUDIO_ADVANCEDSETTINGS.ENCRYPTIONKEY)); }
    /** Unsafe version of {@link #encryptionkeyString}. */
    public static String nencryptionkeyString(long struct) { return memUTF8(memGetAddress(struct + FMOD_STUDIO_ADVANCEDSETTINGS.ENCRYPTIONKEY)); }

    /** Unsafe version of {@link #cbsize(int) cbsize}. */
    public static void ncbsize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.CBSIZE, value); }
    /** Unsafe version of {@link #commandqueuesize(int) commandqueuesize}. */
    public static void ncommandqueuesize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.COMMANDQUEUESIZE, value); }
    /** Unsafe version of {@link #handleinitialsize(int) handleinitialsize}. */
    public static void nhandleinitialsize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.HANDLEINITIALSIZE, value); }
    /** Unsafe version of {@link #studioupdateperiod(int) studioupdateperiod}. */
    public static void nstudioupdateperiod(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.STUDIOUPDATEPERIOD, value); }
    /** Unsafe version of {@link #idlesampledatapoolsize(int) idlesampledatapoolsize}. */
    public static void nidlesampledatapoolsize(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.IDLESAMPLEDATAPOOLSIZE, value); }
    /** Unsafe version of {@link #streamingscheduledelay(int) streamingscheduledelay}. */
    public static void nstreamingscheduledelay(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_STUDIO_ADVANCEDSETTINGS.STREAMINGSCHEDULEDELAY, value); }
    /** Unsafe version of {@link #encryptionkey(ByteBuffer) encryptionkey}. */
    public static void nencryptionkey(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + FMOD_STUDIO_ADVANCEDSETTINGS.ENCRYPTIONKEY, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_STUDIO_ADVANCEDSETTINGS.ENCRYPTIONKEY));
    }

    // -----------------------------------

    /** An array of {@link FMOD_STUDIO_ADVANCEDSETTINGS} structs. */
    public static class Buffer extends StructBuffer<FMOD_STUDIO_ADVANCEDSETTINGS, Buffer> implements NativeResource {

        private static final FMOD_STUDIO_ADVANCEDSETTINGS ELEMENT_FACTORY = FMOD_STUDIO_ADVANCEDSETTINGS.create(-1L);

        /**
         * Creates a new {@code FMOD_STUDIO_ADVANCEDSETTINGS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_STUDIO_ADVANCEDSETTINGS#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_STUDIO_ADVANCEDSETTINGS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code cbsize} field. */
        public int cbsize() { return FMOD_STUDIO_ADVANCEDSETTINGS.ncbsize(address()); }
        /** @return the value of the {@code commandqueuesize} field. */
        @NativeType("unsigned int")
        public int commandqueuesize() { return FMOD_STUDIO_ADVANCEDSETTINGS.ncommandqueuesize(address()); }
        /** @return the value of the {@code handleinitialsize} field. */
        @NativeType("unsigned int")
        public int handleinitialsize() { return FMOD_STUDIO_ADVANCEDSETTINGS.nhandleinitialsize(address()); }
        /** @return the value of the {@code studioupdateperiod} field. */
        public int studioupdateperiod() { return FMOD_STUDIO_ADVANCEDSETTINGS.nstudioupdateperiod(address()); }
        /** @return the value of the {@code idlesampledatapoolsize} field. */
        public int idlesampledatapoolsize() { return FMOD_STUDIO_ADVANCEDSETTINGS.nidlesampledatapoolsize(address()); }
        /** @return the value of the {@code streamingscheduledelay} field. */
        @NativeType("unsigned int")
        public int streamingscheduledelay() { return FMOD_STUDIO_ADVANCEDSETTINGS.nstreamingscheduledelay(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code encryptionkey} field. */
        @NativeType("char const *")
        public ByteBuffer encryptionkey() { return FMOD_STUDIO_ADVANCEDSETTINGS.nencryptionkey(address()); }
        /** @return the null-terminated string pointed to by the {@code encryptionkey} field. */
        @NativeType("char const *")
        public String encryptionkeyString() { return FMOD_STUDIO_ADVANCEDSETTINGS.nencryptionkeyString(address()); }

        /** Sets the specified value to the {@code cbsize} field. */
        public FMOD_STUDIO_ADVANCEDSETTINGS.Buffer cbsize(int value) { FMOD_STUDIO_ADVANCEDSETTINGS.ncbsize(address(), value); return this; }
        /** Sets the specified value to the {@code commandqueuesize} field. */
        public FMOD_STUDIO_ADVANCEDSETTINGS.Buffer commandqueuesize(@NativeType("unsigned int") int value) { FMOD_STUDIO_ADVANCEDSETTINGS.ncommandqueuesize(address(), value); return this; }
        /** Sets the specified value to the {@code handleinitialsize} field. */
        public FMOD_STUDIO_ADVANCEDSETTINGS.Buffer handleinitialsize(@NativeType("unsigned int") int value) { FMOD_STUDIO_ADVANCEDSETTINGS.nhandleinitialsize(address(), value); return this; }
        /** Sets the specified value to the {@code studioupdateperiod} field. */
        public FMOD_STUDIO_ADVANCEDSETTINGS.Buffer studioupdateperiod(int value) { FMOD_STUDIO_ADVANCEDSETTINGS.nstudioupdateperiod(address(), value); return this; }
        /** Sets the specified value to the {@code idlesampledatapoolsize} field. */
        public FMOD_STUDIO_ADVANCEDSETTINGS.Buffer idlesampledatapoolsize(int value) { FMOD_STUDIO_ADVANCEDSETTINGS.nidlesampledatapoolsize(address(), value); return this; }
        /** Sets the specified value to the {@code streamingscheduledelay} field. */
        public FMOD_STUDIO_ADVANCEDSETTINGS.Buffer streamingscheduledelay(@NativeType("unsigned int") int value) { FMOD_STUDIO_ADVANCEDSETTINGS.nstreamingscheduledelay(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code encryptionkey} field. */
        public FMOD_STUDIO_ADVANCEDSETTINGS.Buffer encryptionkey(@NativeType("char const *") ByteBuffer value) { FMOD_STUDIO_ADVANCEDSETTINGS.nencryptionkey(address(), value); return this; }

    }

}