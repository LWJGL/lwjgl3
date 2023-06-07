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
 * DSP Structures
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FMOD_DSP_BUFFER_ARRAY {
 *     int numbuffers;
 *     int * buffernumchannels;
 *     FMOD_CHANNELMASK * bufferchannelmask;
 *     float ** buffers;
 *     FMOD_SPEAKERMODE speakermode;
 * }</code></pre>
 */
@NativeType("struct FMOD_DSP_BUFFER_ARRAY")
public class FMOD_DSP_BUFFER_ARRAY extends Struct<FMOD_DSP_BUFFER_ARRAY> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUMBUFFERS,
        BUFFERNUMCHANNELS,
        BUFFERCHANNELMASK,
        BUFFERS,
        SPEAKERMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUMBUFFERS = layout.offsetof(0);
        BUFFERNUMCHANNELS = layout.offsetof(1);
        BUFFERCHANNELMASK = layout.offsetof(2);
        BUFFERS = layout.offsetof(3);
        SPEAKERMODE = layout.offsetof(4);
    }

    protected FMOD_DSP_BUFFER_ARRAY(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_DSP_BUFFER_ARRAY create(long address, @Nullable ByteBuffer container) {
        return new FMOD_DSP_BUFFER_ARRAY(address, container);
    }

    /**
     * Creates a {@code FMOD_DSP_BUFFER_ARRAY} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_DSP_BUFFER_ARRAY(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code numbuffers} field. */
    public int numbuffers() { return nnumbuffers(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code buffernumchannels} field. */
    @NativeType("int *")
    public IntBuffer buffernumchannels() { return nbuffernumchannels(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code bufferchannelmask} field. */
    @NativeType("FMOD_CHANNELMASK *")
    public IntBuffer bufferchannelmask() { return nbufferchannelmask(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code buffers} field. */
    @NativeType("float **")
    public PointerBuffer buffers() { return nbuffers(address()); }
    /** @return the value of the {@code speakermode} field. */
    @NativeType("FMOD_SPEAKERMODE")
    public int speakermode() { return nspeakermode(address()); }

    /** Sets the specified value to the {@code numbuffers} field. */
    public FMOD_DSP_BUFFER_ARRAY numbuffers(int value) { nnumbuffers(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code buffernumchannels} field. */
    public FMOD_DSP_BUFFER_ARRAY buffernumchannels(@NativeType("int *") IntBuffer value) { nbuffernumchannels(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code bufferchannelmask} field. */
    public FMOD_DSP_BUFFER_ARRAY bufferchannelmask(@NativeType("FMOD_CHANNELMASK *") IntBuffer value) { nbufferchannelmask(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code buffers} field. */
    public FMOD_DSP_BUFFER_ARRAY buffers(@NativeType("float **") PointerBuffer value) { nbuffers(address(), value); return this; }
    /** Sets the specified value to the {@code speakermode} field. */
    public FMOD_DSP_BUFFER_ARRAY speakermode(@NativeType("FMOD_SPEAKERMODE") int value) { nspeakermode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_DSP_BUFFER_ARRAY set(
        int numbuffers,
        IntBuffer buffernumchannels,
        IntBuffer bufferchannelmask,
        PointerBuffer buffers,
        int speakermode
    ) {
        numbuffers(numbuffers);
        buffernumchannels(buffernumchannels);
        bufferchannelmask(bufferchannelmask);
        buffers(buffers);
        speakermode(speakermode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_DSP_BUFFER_ARRAY set(FMOD_DSP_BUFFER_ARRAY src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_DSP_BUFFER_ARRAY} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_BUFFER_ARRAY malloc() {
        return new FMOD_DSP_BUFFER_ARRAY(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_BUFFER_ARRAY} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_DSP_BUFFER_ARRAY calloc() {
        return new FMOD_DSP_BUFFER_ARRAY(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_DSP_BUFFER_ARRAY} instance allocated with {@link BufferUtils}. */
    public static FMOD_DSP_BUFFER_ARRAY create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_DSP_BUFFER_ARRAY(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_DSP_BUFFER_ARRAY} instance for the specified memory address. */
    public static FMOD_DSP_BUFFER_ARRAY create(long address) {
        return new FMOD_DSP_BUFFER_ARRAY(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_BUFFER_ARRAY createSafe(long address) {
        return address == NULL ? null : new FMOD_DSP_BUFFER_ARRAY(address, null);
    }

    /**
     * Returns a new {@link FMOD_DSP_BUFFER_ARRAY.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_BUFFER_ARRAY.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_BUFFER_ARRAY.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_BUFFER_ARRAY.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_BUFFER_ARRAY.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_BUFFER_ARRAY.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_DSP_BUFFER_ARRAY.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_BUFFER_ARRAY.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_DSP_BUFFER_ARRAY.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_DSP_BUFFER_ARRAY} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_BUFFER_ARRAY malloc(MemoryStack stack) {
        return new FMOD_DSP_BUFFER_ARRAY(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_DSP_BUFFER_ARRAY} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_DSP_BUFFER_ARRAY calloc(MemoryStack stack) {
        return new FMOD_DSP_BUFFER_ARRAY(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_DSP_BUFFER_ARRAY.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_BUFFER_ARRAY.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_DSP_BUFFER_ARRAY.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_DSP_BUFFER_ARRAY.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #numbuffers}. */
    public static int nnumbuffers(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_BUFFER_ARRAY.NUMBUFFERS); }
    /** Unsafe version of {@link #buffernumchannels() buffernumchannels}. */
    public static IntBuffer nbuffernumchannels(long struct) { return memIntBuffer(memGetAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERNUMCHANNELS), nnumbuffers(struct)); }
    /** Unsafe version of {@link #bufferchannelmask() bufferchannelmask}. */
    public static IntBuffer nbufferchannelmask(long struct) { return memIntBuffer(memGetAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERCHANNELMASK), nnumbuffers(struct)); }
    /** Unsafe version of {@link #buffers() buffers}. */
    public static PointerBuffer nbuffers(long struct) { return memPointerBuffer(memGetAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERS), nnumbuffers(struct)); }
    /** Unsafe version of {@link #speakermode}. */
    public static int nspeakermode(long struct) { return UNSAFE.getInt(null, struct + FMOD_DSP_BUFFER_ARRAY.SPEAKERMODE); }

    /** Sets the specified value to the {@code numbuffers} field of the specified {@code struct}. */
    public static void nnumbuffers(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_BUFFER_ARRAY.NUMBUFFERS, value); }
    /** Unsafe version of {@link #buffernumchannels(IntBuffer) buffernumchannels}. */
    public static void nbuffernumchannels(long struct, IntBuffer value) { memPutAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERNUMCHANNELS, memAddress(value)); }
    /** Unsafe version of {@link #bufferchannelmask(IntBuffer) bufferchannelmask}. */
    public static void nbufferchannelmask(long struct, IntBuffer value) { memPutAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERCHANNELMASK, memAddress(value)); }
    /** Unsafe version of {@link #buffers(PointerBuffer) buffers}. */
    public static void nbuffers(long struct, PointerBuffer value) { memPutAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERS, memAddress(value)); }
    /** Unsafe version of {@link #speakermode(int) speakermode}. */
    public static void nspeakermode(long struct, int value) { UNSAFE.putInt(null, struct + FMOD_DSP_BUFFER_ARRAY.SPEAKERMODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERNUMCHANNELS));
        check(memGetAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERCHANNELMASK));
        check(memGetAddress(struct + FMOD_DSP_BUFFER_ARRAY.BUFFERS));
    }

    // -----------------------------------

    /** An array of {@link FMOD_DSP_BUFFER_ARRAY} structs. */
    public static class Buffer extends StructBuffer<FMOD_DSP_BUFFER_ARRAY, Buffer> implements NativeResource {

        private static final FMOD_DSP_BUFFER_ARRAY ELEMENT_FACTORY = FMOD_DSP_BUFFER_ARRAY.create(-1L);

        /**
         * Creates a new {@code FMOD_DSP_BUFFER_ARRAY.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_DSP_BUFFER_ARRAY#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_DSP_BUFFER_ARRAY getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code numbuffers} field. */
        public int numbuffers() { return FMOD_DSP_BUFFER_ARRAY.nnumbuffers(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code buffernumchannels} field. */
        @NativeType("int *")
        public IntBuffer buffernumchannels() { return FMOD_DSP_BUFFER_ARRAY.nbuffernumchannels(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code bufferchannelmask} field. */
        @NativeType("FMOD_CHANNELMASK *")
        public IntBuffer bufferchannelmask() { return FMOD_DSP_BUFFER_ARRAY.nbufferchannelmask(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code buffers} field. */
        @NativeType("float **")
        public PointerBuffer buffers() { return FMOD_DSP_BUFFER_ARRAY.nbuffers(address()); }
        /** @return the value of the {@code speakermode} field. */
        @NativeType("FMOD_SPEAKERMODE")
        public int speakermode() { return FMOD_DSP_BUFFER_ARRAY.nspeakermode(address()); }

        /** Sets the specified value to the {@code numbuffers} field. */
        public FMOD_DSP_BUFFER_ARRAY.Buffer numbuffers(int value) { FMOD_DSP_BUFFER_ARRAY.nnumbuffers(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code buffernumchannels} field. */
        public FMOD_DSP_BUFFER_ARRAY.Buffer buffernumchannels(@NativeType("int *") IntBuffer value) { FMOD_DSP_BUFFER_ARRAY.nbuffernumchannels(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code bufferchannelmask} field. */
        public FMOD_DSP_BUFFER_ARRAY.Buffer bufferchannelmask(@NativeType("FMOD_CHANNELMASK *") IntBuffer value) { FMOD_DSP_BUFFER_ARRAY.nbufferchannelmask(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code buffers} field. */
        public FMOD_DSP_BUFFER_ARRAY.Buffer buffers(@NativeType("float **") PointerBuffer value) { FMOD_DSP_BUFFER_ARRAY.nbuffers(address(), value); return this; }
        /** Sets the specified value to the {@code speakermode} field. */
        public FMOD_DSP_BUFFER_ARRAY.Buffer speakermode(@NativeType("FMOD_SPEAKERMODE") int value) { FMOD_DSP_BUFFER_ARRAY.nspeakermode(address(), value); return this; }

    }

}