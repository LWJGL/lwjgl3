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
 * struct FMOD_DSP_STATE {
 *     void * instance;
 *     void * plugindata;
 *     FMOD_CHANNELMASK channelmask;
 *     FMOD_SPEAKERMODE source_speakermode;
 *     float * sidechaindata;
 *     int sidechainchannels;
 *     {@link FMOD_DSP_STATE_FUNCTIONS FMOD_DSP_STATE_FUNCTIONS} * functions;
 *     int systemobject;
 * }</code></pre>
 */
@NativeType("struct FMOD_DSP_STATE")
public class FMOD_DSP_STATE extends Struct<FMOD_DSP_STATE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INSTANCE,
        PLUGINDATA,
        CHANNELMASK,
        SOURCE_SPEAKERMODE,
        SIDECHAINDATA,
        SIDECHAINCHANNELS,
        FUNCTIONS,
        SYSTEMOBJECT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INSTANCE = layout.offsetof(0);
        PLUGINDATA = layout.offsetof(1);
        CHANNELMASK = layout.offsetof(2);
        SOURCE_SPEAKERMODE = layout.offsetof(3);
        SIDECHAINDATA = layout.offsetof(4);
        SIDECHAINCHANNELS = layout.offsetof(5);
        FUNCTIONS = layout.offsetof(6);
        SYSTEMOBJECT = layout.offsetof(7);
    }

    protected FMOD_DSP_STATE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_STATE create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_STATE(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_STATE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_STATE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code instance} field. */
    @NativeType("void *")
    public long instance() { return ninstance(address()); }
    /** @return the value of the {@code plugindata} field. */
    @NativeType("void *")
    public long plugindata() { return nplugindata(address()); }
    /** @return the value of the {@code channelmask} field. */
    @NativeType("FMOD_CHANNELMASK")
    public int channelmask() { return nchannelmask(address()); }
    /** @return the value of the {@code source_speakermode} field. */
    @NativeType("FMOD_SPEAKERMODE")
    public int source_speakermode() { return nsource_speakermode(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code sidechaindata} field. */
    @NativeType("float *")
    public FloatBuffer sidechaindata() { return nsidechaindata(address()); }
    /** @return the value of the {@code sidechainchannels} field. */
    public int sidechainchannels() { return nsidechainchannels(address()); }
    /** @return a {@link FMOD_DSP_STATE_FUNCTIONS} view of the struct pointed to by the {@code functions} field. */
    @NativeType("FMOD_DSP_STATE_FUNCTIONS *")
    public FMOD_DSP_STATE_FUNCTIONS functions() { return nfunctions(address()); }
    /** @return the value of the {@code systemobject} field. */
    public int systemobject() { return nsystemobject(address()); }

    /** Sets the specified value to the {@code instance} field. */
    public FMOD_DSP_STATE instance(@NativeType("void *") long value) { ninstance(address(), value); return this; }
    /** Sets the specified value to the {@code plugindata} field. */
    public FMOD_DSP_STATE plugindata(@NativeType("void *") long value) { nplugindata(address(), value); return this; }
    /** Sets the specified value to the {@code channelmask} field. */
    public FMOD_DSP_STATE channelmask(@NativeType("FMOD_CHANNELMASK") int value) { nchannelmask(address(), value); return this; }
    /** Sets the specified value to the {@code source_speakermode} field. */
    public FMOD_DSP_STATE source_speakermode(@NativeType("FMOD_SPEAKERMODE") int value) { nsource_speakermode(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code sidechaindata} field. */
    public FMOD_DSP_STATE sidechaindata(@NativeType("float *") FloatBuffer value) { nsidechaindata(address(), value); return this; }
    /** Sets the address of the specified {@link FMOD_DSP_STATE_FUNCTIONS} to the {@code functions} field. */
    public FMOD_DSP_STATE functions(@NativeType("FMOD_DSP_STATE_FUNCTIONS *") FMOD_DSP_STATE_FUNCTIONS value) { nfunctions(address(), value); return this; }
    /** Sets the specified value to the {@code systemobject} field. */
    public FMOD_DSP_STATE systemobject(int value) { nsystemobject(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_STATE set(
        long instance,
        long plugindata,
        int channelmask,
        int source_speakermode,
        FloatBuffer sidechaindata,
        FMOD_DSP_STATE_FUNCTIONS functions,
        int systemobject
    ) {
        instance(instance);
        plugindata(plugindata);
        channelmask(channelmask);
        source_speakermode(source_speakermode);
        sidechaindata(sidechaindata);
        functions(functions);
        systemobject(systemobject);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_STATE set(FMOD_DSP_STATE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_STATE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE malloc() {
        return new FMOD_DSP_STATE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_STATE calloc() {
        return new FMOD_DSP_STATE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_STATE} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_STATE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_STATE(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_STATE} instance for the specified memory address. */
    public static FMOD_DSP_STATE create(long address) {
        return new FMOD_DSP_STATE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_STATE(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_STATE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_STATE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE malloc(MemoryStack stack) {
        return new FMOD_DSP_STATE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_STATE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_STATE calloc(MemoryStack stack) {
        return new FMOD_DSP_STATE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_STATE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_STATE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #instance}. */
    public static long ninstance(long struct) { return memGetAddress(struct + FMOD_DSP_STATE.INSTANCE); }
    /** Unsafe version of {@link #plugindata}. */
    public static long nplugindata(long struct) { return memGetAddress(struct + FMOD_DSP_STATE.PLUGINDATA); }
    /** Unsafe version of {@link #channelmask}. */
    public static int nchannelmask(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_STATE.CHANNELMASK); }
    /** Unsafe version of {@link #source_speakermode}. */
    public static int nsource_speakermode(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_STATE.SOURCE_SPEAKERMODE); }
    /** Unsafe version of {@link #sidechaindata() sidechaindata}. */
    public static FloatBuffer nsidechaindata(long struct) { return memFloatBuffer(memGetAddress(struct + FMOD_DSP_STATE.SIDECHAINDATA), nsidechainchannels(struct)); }
    /** Unsafe version of {@link #sidechainchannels}. */
    public static int nsidechainchannels(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_STATE.SIDECHAINCHANNELS); }
    /** Unsafe version of {@link #functions}. */
    public static FMOD_DSP_STATE_FUNCTIONS nfunctions(long struct) { return FMOD_DSP_STATE_FUNCTIONS.create(memGetAddress(struct + FMOD_DSP_STATE.FUNCTIONS)); }
    /** Unsafe version of {@link #systemobject}. */
    public static int nsystemobject(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_STATE.SYSTEMOBJECT); }

    /** Unsafe version of {@link #instance(long) instance}. */
    public static void ninstance(long struct, long value) { memPutAddress(struct + FMOD_DSP_STATE.INSTANCE, check(value)); }
    /** Unsafe version of {@link #plugindata(long) plugindata}. */
    public static void nplugindata(long struct, long value) { memPutAddress(struct + FMOD_DSP_STATE.PLUGINDATA, check(value)); }
    /** Unsafe version of {@link #channelmask(int) channelmask}. */
    public static void nchannelmask(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_STATE.CHANNELMASK, value); }
    /** Unsafe version of {@link #source_speakermode(int) source_speakermode}. */
    public static void nsource_speakermode(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_STATE.SOURCE_SPEAKERMODE, value); }
    /** Unsafe version of {@link #sidechaindata(FloatBuffer) sidechaindata}. */
    public static void nsidechaindata(long struct, FloatBuffer value) { memPutAddress(struct + FMOD_DSP_STATE.SIDECHAINDATA, memAddress(value)); nsidechainchannels(struct, value.remaining()); }
    /** Sets the specified value to the {@code sidechainchannels} field of the specified {@code struct}. */
    public static void nsidechainchannels(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_STATE.SIDECHAINCHANNELS, value); }
    /** Unsafe version of {@link #functions(FMOD_DSP_STATE_FUNCTIONS) functions}. */
    public static void nfunctions(long struct, FMOD_DSP_STATE_FUNCTIONS value) { memPutAddress(struct + FMOD_DSP_STATE.FUNCTIONS, value.address()); }
    /** Unsafe version of {@link #systemobject(int) systemobject}. */
    public static void nsystemobject(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_STATE.SYSTEMOBJECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_STATE.INSTANCE));
        check(memGetAddress(struct + FMOD_DSP_STATE.PLUGINDATA));
        check(memGetAddress(struct + FMOD_DSP_STATE.SIDECHAINDATA));
        long functions = memGetAddress(struct + FMOD_DSP_STATE.FUNCTIONS);
        check(functions);
        FMOD_DSP_STATE_FUNCTIONS.validate(functions);
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_STATE} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_STATE, Buffer> implements NativeResource {

        private static final FMOD_DSP_STATE ELEMENT_FACTORY = FMOD_DSP_STATE.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_STATE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_STATE#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_STATE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code instance} field. */
        @NativeType("void *")
        public long instance() { return FMOD_DSP_STATE.ninstance(address()); }
        /** @return the value of the {@code plugindata} field. */
        @NativeType("void *")
        public long plugindata() { return FMOD_DSP_STATE.nplugindata(address()); }
        /** @return the value of the {@code channelmask} field. */
        @NativeType("FMOD_CHANNELMASK")
        public int channelmask() { return FMOD_DSP_STATE.nchannelmask(address()); }
        /** @return the value of the {@code source_speakermode} field. */
        @NativeType("FMOD_SPEAKERMODE")
        public int source_speakermode() { return FMOD_DSP_STATE.nsource_speakermode(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code sidechaindata} field. */
        @NativeType("float *")
        public FloatBuffer sidechaindata() { return FMOD_DSP_STATE.nsidechaindata(address()); }
        /** @return the value of the {@code sidechainchannels} field. */
        public int sidechainchannels() { return FMOD_DSP_STATE.nsidechainchannels(address()); }
        /** @return a {@link FMOD_DSP_STATE_FUNCTIONS} view of the struct pointed to by the {@code functions} field. */
        @NativeType("FMOD_DSP_STATE_FUNCTIONS *")
        public FMOD_DSP_STATE_FUNCTIONS functions() { return FMOD_DSP_STATE.nfunctions(address()); }
        /** @return the value of the {@code systemobject} field. */
        public int systemobject() { return FMOD_DSP_STATE.nsystemobject(address()); }

        /** Sets the specified value to the {@code instance} field. */
        public FMOD_DSP_STATE.Buffer instance(@NativeType("void *") long value) { FMOD_DSP_STATE.ninstance(address(), value); return this; }
        /** Sets the specified value to the {@code plugindata} field. */
        public FMOD_DSP_STATE.Buffer plugindata(@NativeType("void *") long value) { FMOD_DSP_STATE.nplugindata(address(), value); return this; }
        /** Sets the specified value to the {@code channelmask} field. */
        public FMOD_DSP_STATE.Buffer channelmask(@NativeType("FMOD_CHANNELMASK") int value) { FMOD_DSP_STATE.nchannelmask(address(), value); return this; }
        /** Sets the specified value to the {@code source_speakermode} field. */
        public FMOD_DSP_STATE.Buffer source_speakermode(@NativeType("FMOD_SPEAKERMODE") int value) { FMOD_DSP_STATE.nsource_speakermode(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code sidechaindata} field. */
        public FMOD_DSP_STATE.Buffer sidechaindata(@NativeType("float *") FloatBuffer value) { FMOD_DSP_STATE.nsidechaindata(address(), value); return this; }
        /** Sets the address of the specified {@link FMOD_DSP_STATE_FUNCTIONS} to the {@code functions} field. */
        public FMOD_DSP_STATE.Buffer functions(@NativeType("FMOD_DSP_STATE_FUNCTIONS *") FMOD_DSP_STATE_FUNCTIONS value) { FMOD_DSP_STATE.nfunctions(address(), value); return this; }
        /** Sets the specified value to the {@code systemobject} field. */
        public FMOD_DSP_STATE.Buffer systemobject(int value) { FMOD_DSP_STATE.nsystemobject(address(), value); return this; }

    }

}